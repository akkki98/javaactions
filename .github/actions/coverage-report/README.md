# Coverage Report Composite Action

This composite action runs .NET tests with coverage collection using Coverlet, generates HTML and Cobertura reports using ReportGenerator, uploads coverage artifacts, and posts a summary comment on pull requests. It also supports optional CodeQL scanning for C# projects.

## Features

- ✅ Runs `dotnet test` with Coverlet coverage collection (OpenCover format)
- ✅ Generates HTML and Cobertura coverage reports using ReportGenerator
- ✅ Uploads coverage artifacts for download
- ✅ Posts coverage summary as a PR comment
- ✅ Supports coverage threshold with build failure
- ✅ Optional CodeQL security scanning for C#

## Usage

### Basic Usage

```yaml
name: Coverage Report

on:
  pull_request:
    branches: [ main ]

jobs:
  coverage:
    runs-on: ubuntu-latest
    permissions:
      contents: read
      pull-requests: write
    
    steps:
      - uses: actions/checkout@v4
      
      - name: Run coverage report
        uses: ./.github/actions/coverage-report
        with:
          github-token: ${{ secrets.GITHUB_TOKEN }}
```

### Advanced Usage with Custom Settings

```yaml
- name: Run coverage report with threshold
  uses: ./.github/actions/coverage-report
  with:
    working-directory: './src'
    test-projects: '**/*.Tests.csproj'
    fail-under: '80'
    github-token: ${{ secrets.GITHUB_TOKEN }}
```

### With CodeQL Scanning

```yaml
- name: Run coverage report with CodeQL
  uses: ./.github/actions/coverage-report
  with:
    working-directory: '.'
    test-projects: '**/*Tests.csproj'
    fail-under: '75'
    codeql-enabled: 'true'
    github-token: ${{ secrets.GITHUB_TOKEN }}
```

## Inputs

| Input | Description | Required | Default |
|-------|-------------|----------|---------|
| `working-directory` | Working directory containing the solution/projects | No | `.` |
| `test-projects` | Glob pattern for test projects | No | `**/*Tests.csproj` |
| `fail-under` | Minimum coverage threshold (0-100). Build fails if coverage is below this value | No | - |
| `codeql-enabled` | Enable CodeQL scanning for C# | No | `false` |
| `github-token` | GitHub token for posting PR comments | Yes | - |

## Outputs

This action produces the following:

1. **Coverage Artifacts**: HTML and Cobertura reports uploaded as `coverage-report` artifact
2. **PR Comment**: A summary table showing line and branch coverage percentages
3. **CodeQL Results**: Security scanning results (when enabled) visible in the Security tab

## Example PR Comment

```markdown
## 📊 Coverage Report

| Metric | Coverage |
|--------|----------|
| Line Coverage | 85.50% |
| Branch Coverage | 78.25% |
| Threshold | 80% |

✅ Coverage check passed!

[View detailed coverage report in artifacts](https://github.com/owner/repo/actions/runs/123456)
```

## Requirements

- .NET SDK (automatically set up by the action)
- Test projects using xUnit, NUnit, or MSTest
- Coverlet collector package in test projects

### Adding Coverlet to Your Test Projects

Add the Coverlet collector package to your test projects:

```bash
dotnet add package coverlet.collector
```

Or add it to your `.csproj` file:

```xml
<ItemGroup>
  <PackageReference Include="coverlet.collector" Version="6.0.0">
    <IncludeAssets>runtime; build; native; contentfiles; analyzers; buildtransitive</IncludeAssets>
    <PrivateAssets>all</PrivateAssets>
  </PackageReference>
</ItemGroup>
```

## Permissions

The workflow using this action needs the following permissions:

```yaml
permissions:
  contents: read          # Required for checkout
  pull-requests: write    # Required for PR comments
  security-events: write  # Required for CodeQL (if enabled)
```

## Coverage Threshold

When `fail-under` is specified, the build will fail if line coverage is below the threshold:

- ✅ Coverage meets or exceeds threshold: Build passes
- ❌ Coverage below threshold: Build fails with error message

## CodeQL Integration

When `codeql-enabled` is set to `true`, the action will:

1. Initialize CodeQL for C# before running tests
2. Analyze the codebase after tests complete
3. Upload results to GitHub Security tab

This provides security vulnerability scanning alongside code coverage.

## Status Badges

Add coverage and workflow status badges to your README:

### Workflow Status Badge

```markdown
[![Coverage Report](https://github.com/YOUR_USERNAME/YOUR_REPO/actions/workflows/coverage.yml/badge.svg)](https://github.com/YOUR_USERNAME/YOUR_REPO/actions/workflows/coverage.yml)
```

### Custom Coverage Badge

You can create a custom coverage badge using [shields.io](https://shields.io/) or similar services by parsing the Cobertura report in a separate step.

## Troubleshooting

### No coverage data collected

Ensure your test projects have the `coverlet.collector` package installed:

```bash
dotnet add package coverlet.collector
```

### Coverage report not generated

Check that:
1. Test projects match the `test-projects` glob pattern
2. Tests are actually running (check test output)
3. The `working-directory` is correct

### PR comment not posted

Verify that:
1. `github-token` is provided with `pull-requests: write` permission
2. The workflow is triggered by a pull request event
3. The token has access to the repository

## Examples

See the [example workflow](.github/workflows/coverage.yml) for a complete working example.

## License

This action is provided as-is for use in GitHub Actions workflows.
