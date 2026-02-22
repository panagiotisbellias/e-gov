# e-Gov Desktop Application

[![Build Status](https://img.shields.io/github/actions/workflow/status/panagiotisbellias/e-gov/build.yml?label=CI)]()
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)]()
[![Java](https://img.shields.io/badge/Java-17+-orange.svg)]()
[![Ant](https://img.shields.io/badge/Build-Ant-green.svg)]()

The **e-Gov Desktop Application** is a Java/Ant-based desktop system
designed to deliver secure and modular government-related services.\
This project aims to provide a stable, extensible foundation for
e-Government workflows.

------------------------------------------------------------------------

## 🚀 Overview

-   Java-based desktop application
-   Built with Apache Ant
-   Modular and extendable architecture
-   Strong security practices (secret scanning, protected branches)

------------------------------------------------------------------------

## 📦 Installation & Setup

### 1. Prerequisites

#### Java Development Kit (JDK) 11+

``` bash
java -version
```

#### Apache Ant

``` bash
ant -version
```

#### Node.js & npm (Optional for Git hooks & versioning)

Some development tasks (commit hooks, release versioning) require Node.js and npm.
```bash
node -v
npm -v
```

- Node.js ≥ 18
- npm (comes bundled with Node.js)

#### Install Node dependencies
```bash
npm install
```

### Environment Variables

Variable      Description
  ------------- ---------------------------------
`JAVA_HOME`   Points to your JDK installation
`PATH`        Includes `java` and `ant`

------------------------------------------------------------------------

## 📁 Project Structure

    /github     → CI/CD workflows, issue templates, security
    /src        → Application source code
    /build      → Build output (temporary)
    /dist       → Packaged JARs and distribution files

------------------------------------------------------------------------

## 🔨 Build & Run

### Build the application

``` bash
ant clean
ant jar
```

### Run

``` bash
java -jar ./dist/e-gov_V2.2.1.jar
```

### Node/npm related tasks (Optional)

- Git hooks are managed via Husky
- Release versioning & changelog via standard-version

```bash
npm run release
```

------------------------------------------------------------------------

## 🧑‍💻 Development Workflow

### Useful Ant commands

``` bash
ant clean
ant compile
ant jar
```

### Adding dependencies

Place `.jar` files into `/lib`.

------------------------------------------------------------------------

## 🤝 Contributing

1.  Fork the repo
2.  Clone locally
3.  Create a feature branch
4.  Make changes
5.  Open a PR

------------------------------------------------------------------------

## 🔒 Security

### Branch Protection

-   No direct pushes to `master`/`development`
-   PR + review required
-   CI must pass

------------------------------------------------------------------------

## 📄 License

Apache License 2.0 --- see **LICENSE**.

------------------------------------------------------------------------

## 💬 Support

Open an issue or discussion for help.
