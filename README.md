# GitHub Actions Examples

This repository contains examples and reusable GitHub Actions for various project types.

## Available Actions

### Coverage Report for C# Projects

[![Coverage Report](https://github.com/akkki98/javaactions/actions/workflows/coverage.yml/badge.svg)](https://github.com/akkki98/javaactions/actions/workflows/coverage.yml)

A composite action for .NET/C# projects that:
- Runs tests with Coverlet coverage collection
- Generates HTML and Cobertura reports using ReportGenerator
- Uploads coverage artifacts
- Posts coverage summary on pull requests
- Optionally runs CodeQL security scanning

**Location**: `.github/actions/coverage-report/`

**Usage**: See [coverage action README](.github/actions/coverage-report/README.md)

**Example workflow**: [coverage.yml](.github/workflows/coverage.yml)

## Java Maven Project

This is simple java maven project for github actions
