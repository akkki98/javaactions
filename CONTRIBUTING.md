# Contributing to JavaActions

Thank you for your interest in contributing to JavaActions! We welcome contributions from the community and are pleased to have you here.

## 📋 Table of Contents

- [Code of Conduct](#code-of-conduct)
- [Getting Started](#getting-started)
- [How to Contribute](#how-to-contribute)
- [Reporting Issues](#reporting-issues)
- [Submitting Pull Requests](#submitting-pull-requests)
- [Coding Standards](#coding-standards)
- [Commit Message Guidelines](#commit-message-guidelines)
- [Testing Guidelines](#testing-guidelines)
- [Documentation Guidelines](#documentation-guidelines)

## 📜 Code of Conduct

By participating in this project, you agree to maintain a respectful and inclusive environment. Please:

- Be respectful and considerate of others
- Welcome newcomers and help them get started
- Accept constructive criticism gracefully
- Focus on what's best for the community
- Show empathy towards other community members

## 🚀 Getting Started

1. **Fork the repository** to your GitHub account
2. **Clone your fork** locally:
   ```bash
   git clone https://github.com/YOUR_USERNAME/javaactions.git
   cd javaactions
   ```
3. **Add the upstream repository**:
   ```bash
   git remote add upstream https://github.com/akkki98/javaactions.git
   ```
4. **Create a new branch** for your feature or fix:
   ```bash
   git checkout -b feature/your-feature-name
   ```

## 🤝 How to Contribute

There are many ways to contribute to this project:

### Types of Contributions

- **Bug Reports**: Found a bug? Let us know!
- **Feature Requests**: Have an idea? Share it with us!
- **Code Contributions**: Want to fix a bug or add a feature? Submit a PR!
- **Documentation**: Improve our docs, fix typos, add examples
- **Testing**: Add or improve test coverage
- **Code Review**: Review pull requests and provide feedback

### First Time Contributors

If you're new to open source, look for issues labeled:
- `good first issue` - Perfect for newcomers
- `help wanted` - We need assistance with these
- `documentation` - Great for getting started

## 🐛 Reporting Issues

Before creating a new issue, please:

1. **Search existing issues** to avoid duplicates
2. **Use the issue template** if one is provided
3. **Provide detailed information**:
   - Clear and descriptive title
   - Steps to reproduce the issue
   - Expected behavior
   - Actual behavior
   - Environment details (OS, Java version, Maven version)
   - Screenshots if applicable

### Example Issue Report

```markdown
**Title**: Greeter.sayHello() returns incorrect message

**Description**:
The sayHello() method returns an empty string instead of "Hello world!"

**Steps to Reproduce**:
1. Create a new Greeter instance
2. Call sayHello() method
3. Observe the returned value

**Expected Behavior**:
Should return "Hello world!"

**Actual Behavior**:
Returns ""

**Environment**:
- OS: Ubuntu 20.04
- Java: 1.8.0_292
- Maven: 3.6.3
```

## 🔀 Submitting Pull Requests

### Before Submitting

1. **Update your local repository**:
   ```bash
   git checkout main
   git pull upstream main
   ```

2. **Rebase your branch** if needed:
   ```bash
   git checkout feature/your-feature-name
   git rebase main
   ```

3. **Run tests** to ensure everything passes:
   ```bash
   mvn clean test
   ```

4. **Update documentation** if you've made changes to APIs or functionality

### Pull Request Process

1. **Create a descriptive title** that summarizes your changes
2. **Provide detailed description**:
   - What changes did you make?
   - Why did you make these changes?
   - Any breaking changes?
   - Related issues (use "Fixes #123" or "Closes #123")

3. **Ensure your PR**:
   - Follows our coding standards
   - Includes tests for new functionality
   - Updates documentation as needed
   - Has no merge conflicts
   - Passes all CI checks

4. **Request review** from maintainers

5. **Address feedback** promptly and professionally

### Pull Request Template

```markdown
## Description
Brief description of changes

## Type of Change
- [ ] Bug fix
- [ ] New feature
- [ ] Breaking change
- [ ] Documentation update

## Changes Made
- List your changes here
- Be specific and clear

## Testing
Describe the tests you've added or run

## Checklist
- [ ] My code follows the project's style guidelines
- [ ] I have performed a self-review of my code
- [ ] I have commented my code where necessary
- [ ] I have updated the documentation
- [ ] My changes generate no new warnings
- [ ] I have added tests that prove my fix/feature works
- [ ] New and existing unit tests pass locally
```

## 💻 Coding Standards

### Java Style Guide

We follow standard Java coding conventions:

#### Naming Conventions
- **Classes**: PascalCase (e.g., `HelloWorld`, `Greeter`)
- **Methods**: camelCase (e.g., `sayHello()`, `getCurrentTime()`)
- **Variables**: camelCase (e.g., `greeter`, `currentTime`)
- **Constants**: UPPER_SNAKE_CASE (e.g., `MAX_SIZE`, `DEFAULT_MESSAGE`)
- **Packages**: lowercase (e.g., `hello`, `util`)

#### Code Formatting
- **Indentation**: 2 spaces (no tabs)
- **Line Length**: Maximum 100 characters
- **Braces**: Opening brace on same line, closing brace on new line
  ```java
  public void method() {
    // code here
  }
  ```

#### Best Practices
- Keep methods short and focused (single responsibility)
- Prefer composition over inheritance
- Use meaningful variable and method names
- Avoid magic numbers; use named constants
- Handle exceptions appropriately
- Close resources properly (use try-with-resources when possible)

### JavaDoc Requirements

**All public classes, methods, and fields must have JavaDoc comments:**

```java
/**
 * Brief description of the class.
 * <p>
 * Detailed description if needed, explaining the purpose
 * and usage of the class.
 * </p>
 * 
 * @author Your Name
 * @version 1.0
 * @since 0.1.0
 */
public class ExampleClass {
  
  /**
   * Brief description of the method.
   * <p>
   * Detailed description of what the method does,
   * including any important behavior or constraints.
   * </p>
   * 
   * @param paramName description of the parameter
   * @return description of the return value
   * @throws ExceptionType when this exception is thrown
   */
  public String exampleMethod(String paramName) {
    // implementation
  }
}
```

## 📝 Commit Message Guidelines

We follow the [Conventional Commits](https://www.conventionalcommits.org/) specification:

### Format
```
<type>(<scope>): <subject>

<body>

<footer>
```

### Types
- `feat`: New feature
- `fix`: Bug fix
- `docs`: Documentation changes
- `style`: Code style changes (formatting, missing semicolons, etc.)
- `refactor`: Code refactoring
- `test`: Adding or updating tests
- `chore`: Maintenance tasks, dependency updates

### Examples

**Simple commit:**
```
feat: add greeting customization to Greeter class
```

**Commit with scope:**
```
fix(greeter): correct null pointer exception in sayHello()
```

**Commit with body:**
```
feat: add multilingual support

- Added language parameter to Greeter constructor
- Implemented greeting messages for English, Spanish, and French
- Updated tests to cover new functionality

Closes #42
```

**Breaking change:**
```
feat!: change return type of sayHello() to Greeting object

BREAKING CHANGE: sayHello() now returns a Greeting object
instead of a String. Update all callers accordingly.
```

## 🧪 Testing Guidelines

### Writing Tests

1. **Test Coverage**: Aim for at least 80% code coverage
2. **Test Naming**: Use descriptive names that explain what is being tested
   ```java
   @Test
   public void greeterSaysHello_whenCalled_returnsCorrectMessage() {
     // test implementation
   }
   ```

3. **Test Structure**: Follow the Arrange-Act-Assert (AAA) pattern
   ```java
   @Test
   public void testExample() {
     // Arrange
     Greeter greeter = new Greeter();
     
     // Act
     String result = greeter.sayHello();
     
     // Assert
     assertEquals("Hello world!", result);
   }
   ```

### Running Tests

```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=GreeterTest

# Run tests with coverage
mvn clean test jacoco:report
```

### Test Requirements

- All new features must include unit tests
- Bug fixes should include regression tests
- Tests should be independent and repeatable
- Mock external dependencies
- Test both success and failure scenarios

## 📚 Documentation Guidelines

### When to Update Documentation

Update documentation when you:
- Add new features or APIs
- Change existing functionality
- Fix bugs that affect usage
- Add new dependencies
- Change build or deployment processes

### Documentation Types

1. **README.md**: Project overview, setup, and usage
2. **JavaDoc**: API documentation in code
3. **CONTRIBUTING.md**: This file (contribution guidelines)
4. **Code Comments**: Explain complex logic or non-obvious decisions

### Documentation Standards

- Use clear, concise language
- Include code examples where helpful
- Keep documentation up-to-date with code changes
- Proofread for spelling and grammar
- Use proper Markdown formatting

## 🔍 Code Review Process

### For Contributors

- Be open to feedback and willing to make changes
- Respond to review comments in a timely manner
- Ask questions if you don't understand feedback
- Thank reviewers for their time and input

### For Reviewers

- Be respectful and constructive
- Focus on the code, not the person
- Explain why changes are needed
- Suggest alternatives when possible
- Approve when ready, request changes when needed

## ❓ Questions?

If you have questions about contributing:

1. Check existing documentation and issues
2. Ask in issue comments or pull request discussions
3. Contact the maintainers directly

## 🙏 Thank You!

Your contributions make this project better. We appreciate your time and effort!

---

**Happy Contributing! 🎉**
