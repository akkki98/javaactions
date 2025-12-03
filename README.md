# JavaActions - A Simple Maven Project for GitHub Actions

[![Build Status](https://github.com/akkki98/javaactions/workflows/Java%20CI%20with%20Maven/badge.svg)](https://github.com/akkki98/javaactions/actions)
[![Java Version](https://img.shields.io/badge/Java-1.8-blue.svg)](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
[![Maven](https://img.shields.io/badge/Maven-3.6+-brightgreen.svg)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

A simple Java Maven project demonstrating GitHub Actions integration, continuous integration workflows, and Java best practices. This project serves as a template for building Java applications with automated testing and deployment.

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Building the Project](#building-the-project)
- [Running Tests](#running-tests)
- [Project Structure](#project-structure)
- [API Documentation](#api-documentation)
- [Contributing](#contributing)
- [License](#license)

## 🎯 Overview

JavaActions is a demonstration project that showcases:
- **Maven Build System**: Proper Maven project configuration with dependency management
- **GitHub Actions Integration**: Automated CI/CD workflows for building and testing
- **JUnit Testing**: Unit tests with JUnit 4 and Hamcrest matchers
- **External Dependencies**: Integration with Joda-Time library for date/time handling
- **JavaDoc Documentation**: Comprehensive API documentation for all public classes

This project is ideal for developers learning GitHub Actions, Maven, or looking for a simple Java project template.

## ✨ Features

- ✅ Simple "Hello World" application with time display
- ✅ Modular design with separate Greeter class
- ✅ Comprehensive unit tests
- ✅ Maven Shade plugin for creating executable JAR
- ✅ JavaDoc comments for all public APIs
- ✅ GitHub Actions workflow for continuous integration
- ✅ Clean project structure following Maven conventions

## 📦 Prerequisites

Before you begin, ensure you have the following installed:

- **Java Development Kit (JDK)**: Version 1.8 or higher
  ```bash
  java -version
  ```

- **Apache Maven**: Version 3.6 or higher
  ```bash
  mvn -version
  ```

- **Git**: For cloning the repository
  ```bash
  git --version
  ```

## 🚀 Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/akkki98/javaactions.git
   cd javaactions
   ```

2. **Install dependencies**
   Maven will automatically download dependencies when you build the project:
   ```bash
   mvn clean install
   ```

## 💻 Usage

### Running the Application

There are several ways to run the application:

**Method 1: Using Maven**
```bash
mvn clean package
java -jar target/gs-maven-0.1.0.jar
```

**Method 2: Using Maven exec plugin**
```bash
mvn clean compile exec:java -Dexec.mainClass="hello.HelloWorld"
```

**Expected Output:**
```
The current local time is: 14:32:45.123
Hello world!
```

### Using the Greeter Class

Here's a simple example of how to use the `Greeter` class in your own code:

```java
import hello.Greeter;

public class Example {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        String message = greeter.sayHello();
        System.out.println(message);  // Outputs: Hello world!
    }
}
```

### Working with Time

The project uses Joda-Time library for time handling:

```java
import org.joda.time.LocalTime;

public class TimeExample {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("Current time: " + currentTime);
    }
}
```

## 🔨 Building the Project

### Clean Build
```bash
mvn clean compile
```

### Create Executable JAR
```bash
mvn clean package
```

This creates an executable JAR file in the `target/` directory with all dependencies included (using Maven Shade plugin).

### Skip Tests During Build
```bash
mvn clean package -DskipTests
```

## 🧪 Running Tests

### Run All Tests
```bash
mvn test
```

### Run Specific Test Class
```bash
mvn test -Dtest=GreeterTest
```

### Run Tests with Coverage
```bash
mvn clean test
```

### Test Reports

After running tests, you can find the test reports in:
- **Surefire Reports**: `target/surefire-reports/`

## 📁 Project Structure

```
javaactions/
├── .github/
│   └── workflows/
│       └── maven.yml          # GitHub Actions workflow configuration
├── src/
│   ├── main/
│   │   └── java/
│   │       └── hello/
│   │           ├── HelloWorld.java   # Main application entry point
│   │           └── Greeter.java      # Greeting service class
│   └── test/
│       └── java/
│           └── hello/
│               └── GreeterTest.java  # Unit tests for Greeter
├── .gitignore                 # Git ignore rules
├── CONTRIBUTING.md            # Contribution guidelines
├── pom.xml                    # Maven project configuration
└── README.md                  # Project documentation (this file)
```

### Key Components

- **`HelloWorld.java`**: Main entry point that demonstrates using Joda-Time and Greeter class
- **`Greeter.java`**: Simple service class that provides greeting functionality
- **`GreeterTest.java`**: JUnit test class with unit tests for Greeter
- **`pom.xml`**: Maven configuration with dependencies and build settings

## 📚 API Documentation

### Generating JavaDoc

To generate HTML documentation from JavaDoc comments:

```bash
mvn javadoc:javadoc
```

The generated documentation will be available in `target/reports/apidocs/index.html`

### Opening JavaDoc in Browser

**On Linux/macOS:**
```bash
open target/reports/apidocs/index.html
```

**On Windows:**
```bash
start target/reports/apidocs/index.html
```

### Key Classes

#### `hello.Greeter`
A simple greeter class that provides greeting functionality.

**Methods:**
- `String sayHello()` - Returns a friendly greeting message "Hello world!"

#### `hello.HelloWorld`
Main entry point for the application that demonstrates time display and greeting.

**Methods:**
- `void main(String[] args)` - Application entry point

## 🤝 Contributing

We welcome contributions! Please see our [Contributing Guidelines](CONTRIBUTING.md) for details on:
- How to report issues
- How to submit pull requests
- Coding standards and conventions
- Commit message guidelines

### Quick Start for Contributors

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Make your changes and add tests
4. Commit your changes (`git commit -m 'Add amazing feature'`)
5. Push to the branch (`git push origin feature/amazing-feature`)
6. Open a Pull Request

## 📄 License

This project is licensed under the Apache License 2.0 - see the LICENSE file for details.

## 🔗 Links

- [GitHub Repository](https://github.com/akkki98/javaactions)
- [Issue Tracker](https://github.com/akkki98/javaactions/issues)
- [GitHub Actions Documentation](https://docs.github.com/en/actions)
- [Maven Documentation](https://maven.apache.org/guides/)
- [JUnit 4 Documentation](https://junit.org/junit4/)

## 🙏 Acknowledgments

- Built with [Maven](https://maven.apache.org/)
- Time handling with [Joda-Time](https://www.joda.org/joda-time/)
- Testing with [JUnit 4](https://junit.org/junit4/)
- CI/CD with [GitHub Actions](https://github.com/features/actions)

---

**Made with ❤️ by the JavaActions Project**
