# e-Gov Desktop Application

[![CI](https://img.shields.io/github/actions/workflow/status/panagiotisbellias/e-gov/build.yml?label=CI)]()
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)]()
[![Java](https://img.shields.io/badge/Java-17+-orange.svg)]()
[![Build](https://img.shields.io/badge/Build-Ant-green.svg)]()

The **e-Gov Desktop Application** is a Java-based desktop system built with Apache Ant, designed to provide secure, modular, and extensible government-related services.

This project aims to establish a stable, production-ready foundation for e-Government workflows while following modern open-source and secure development practices.

---

## 🚀 Overview

- Java 17+ desktop application
- Built with Apache Ant
- Modular and extensible architecture
- CI-powered development lifecycle
- Static analysis integration (Checkstyle / PMD-ready)
- Secure SDLC (branch protection, secret scanning, dependency monitoring)

---

## ✨ Features

- Clean modular architecture
- Reproducible Ant-based builds
- Automated CI via GitHub Actions
- Unit testing support
- Conventional Commit workflow
- Secure contribution model
- Open-source ready governance structure

---

## 📦 Installation & Setup

### 🔧 Prerequisites

#### JDK 17+

```bash
java -version
```

#### Apache Ant

``` bash
ant -version
```

#### 🧩 Optional (Development Tooling)

Node.js and npm are required only for:
- Commit hooks (Husky)
- Automated versioning (standard-version)
- Commit message linting

```bash
node -v
npm -v
```

- Node.js ≥ 18

#### Install dev dependencies
```bash
npm install
```

### Environment Variables

| Variable  | Description                   |
| --------- | ----------------------------- |
| JAVA_HOME | Path to JDK 17+               |
| PATH      | Must include `java` and `ant` |

------------------------------------------------------------------------

## 📁 Project Structure

- `.github/` → CI workflows and security policies
- `src/` → Application source code
- `lib/` → External dependencies
- `build/` → Temporary build output (generated)
- `dist/` → Packaged JAR distributions (generated)

> build/ and dist/ are generated at build time and are not committed to the repository.

------------------------------------------------------------------------

## 🔨 Build & Run

### Build

``` bash
ant clean
ant jar
```

### Run

``` bash
java -jar ./dist/e-gov_<version>.jar
```
(Version corresponds to the current release.)

------------------------------------------------------------------------

## 🧪 Testing

Run all unit tests:
```bash
ant test
```
CI automatically executes tests on every push and pull request.

------------------------------------------------------------------------

## 🧑‍💻 Development Workflow

### Common Ant Commands

``` bash
ant clean
ant compile
ant jar
ant test
```

### Adding dependencies

Place external .jar files inside:
```bash
/lib
```

------------------------------------------------------------------------

## 📦 Releases

Stable versions are published via GitHub Releases.

Each release includes:
- Version tag (Semantic Versioning)
- Build artifacts (JAR)
- Release notes
- Updated changelog

------------------------------------------------------------------------

## 🤝 Contributing

We welcome contributions from the community.

Basic workflow:

1.  Fork the repository
2.  Create a feature branch
3.  Implement changes
4.  Ensure tests pass
5.  Open a Pull Request

See `CONTRIBUTING.md` for full guidelines.

------------------------------------------------------------------------

## 🔒 Security

This project follows secure development practices including:
- Protected branches
- Mandatory pull requests
- CI verification before merge
- Secret scanning (Gitleaks)
- Dependency monitoring
- Static analysis enforcement

See `SECURITY.md` for vulnerability reporting.

------------------------------------------------------------------------

## 📄 License

Licensed under the Apache License 2.0.
See the `LICENSE` file for details.

------------------------------------------------------------------------

## 💬 Support

For help, questions, or feature requests:
- Open an Issue
- Start a Discussion (if enabled)

------------------------------------------------------------------------

## 🚀 Current Status

Public Open-Source Ready (v3.0.0+)
