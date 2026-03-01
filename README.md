# e-Gov Desktop Application
<!-- ALL-CONTRIBUTORS-BADGE:START - Do not remove or modify this section -->
[![All Contributors](https://img.shields.io/badge/all_contributors-1-orange.svg?style=flat-square)](#contributors-)
<!-- ALL-CONTRIBUTORS-BADGE:END -->

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

## Contributors

See [CONTRIBUTORS.md](CONTRIBUTORS.md)

![Contributors](https://img.shields.io/github/contributors/panagiotisbellias/e-gov)

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

## Contributors ✨

Thanks goes to these wonderful people ([emoji key](https://allcontributors.org/docs/en/emoji-key)):

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tbody>
    <tr>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/panagiotisbellias"><img src="https://avatars.githubusercontent.com/u/68272816?v=4?s=100" width="100px;" alt="Panagiotis Bellias"/><br /><sub><b>Panagiotis Bellias</b></sub></a><br /><a href="https://github.com/panagiotisbellias/e-gov/commits?author=panagiotisbellias" title="Code">💻</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/features/security"><img src="https://avatars.githubusercontent.com/u/27347476?v=4?s=100" width="100px;" alt="Dependabot"/><br /><sub><b>Dependabot</b></sub></a><br /><a href="#maintenance-dependabot" title="Maintenance">🚧</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/mjroshanackthar"><img src="https://avatars.githubusercontent.com/u/223994218?v=4?s=100" width="100px;" alt="mjroshanackthar"/><br /><sub><b>mjroshanackthar</b></sub></a><br /><a href="https://github.com/panagiotisbellias/e-gov/commits?author=mjroshanackthar" title="Code">💻</a></td>
    </tr>
  </tbody>
</table>

<!-- markdownlint-restore -->
<!-- prettier-ignore-end -->

<!-- ALL-CONTRIBUTORS-LIST:END -->

This project follows the [all-contributors](https://github.com/all-contributors/all-contributors) specification. Contributions of any kind welcome!