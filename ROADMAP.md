# Project Roadmap

This document outlines the planned direction of the project, focusing on build quality, security, developer experience, and release reliability.

---

## Guiding Principles

* **Quality first**: consistent static analysis and testing across all modules
* **Automation by default**: minimize manual steps in CI/CD and local workflows
* **Security-aware**: keep dependencies and tooling up to date
* **Clarity**: predictable structure and documented processes

---

## Near Term (0–1 month)

### Build & Quality

* Consolidate static analysis under a single `quality` entry point (Checkstyle, PMD)
* Stabilize Ant ↔ Maven dependency handling (classpath consistency, reproducible builds)
* Fix remaining CI warnings and flaky checks

### Developer Experience

* Document local setup requirements (Java, Node.js, npm)
* Enable and document Git hooks (commitlint, formatting, pre-push checks)
* Improve README with clear contribution and workflow sections

### CI / Automation

* Ensure CI parity with local `quality` checks
* Enforce conventional commits in CI
* Validate artifacts produced by the build (reports, jars, logs)

---

## Mid Term (1–3 months)

### Dependency & Security

* Introduce scheduled dependency updates (Dependabot)
* Integrate SAST (CodeQL) and dependency scanning
* Align tool versions across Ant, Maven, and Node tooling

### Testing & Reporting

* Improve test coverage visibility
* Standardize report output locations (Checkstyle, PMD, tests)
* Optionally publish reports as CI artifacts

### Project Structure

* Revisit module boundaries and naming
* Remove unused or legacy build targets
* Reduce duplication between build tools where possible

---

## Long Term (3+ months)

### Release & Versioning

* Define and document a release process
* Introduce semantic versioning and changelog automation
* Automate tagging and release notes generation

### Modernization

* Evaluate migration paths away from legacy build steps
* Assess feasibility of simplifying to fewer build systems
* Explore faster CI execution and caching strategies

### Governance

* Define contribution guidelines and code ownership
* Add architectural decision records (ADRs)
* Establish long-term maintenance and support expectations

---

## Community

- First external contributions accepted 🎉
- Improved contributor onboarding
- Established ADR documentation

---

## Out of Scope (for now)

* Major feature development unrelated to build/quality
* Breaking changes without a defined migration path

---

This roadmap is a living document and should be updated as priorities evolve.
