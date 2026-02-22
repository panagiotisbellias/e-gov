# Contributing Guidelines

Thank you for your interest in contributing to this project! 🎉  
We welcome all kinds of contributions — from bug reports and documentation updates to new features and code improvements.

---

## 🪄 Getting Started

1. **Fork** the repository.
2. **Clone** your fork locally:
   ```bash
   git clone https://github.com/<your-username>/<repo-name>.git
   ```
3. **Create a branch** for your changes:
   ```bash
   git checkout -b feature/your-feature-name
   ```

---

## 🧱 Development Setup

Make sure you have all necessary dependencies installed.  
```bash
java -version
ant -version
```

```bash
ant jar
java -jar .\dist\e-gov_V2.2.1.jar
```

Run tests before submitting:
```bash
ant test
```

---

## 🧩 Commit Guidelines

### 🧱 Conventional Commits Guide

This project follows the [Conventional Commits](https://www.conventionalcommits.org/) specification to ensure consistent, meaningful commit messages and automated changelog generation.

---

#### 💬 Commit Message Format

Each commit message should follow this format:

```
<type>(<scope>): <description>
```

**Examples:**

```
feat(ui): add dark mode toggle
fix(api): handle missing tokens
chore(ci): update GitHub Actions versions
```

---

### 🧩 Common Types

| Type         | Description                                                   |
|--------------|---------------------------------------------------------------|
| **feat**     | A new feature                                                 |
| **fix**      | A bug fix                                                     |
| **docs**     | Documentation-only changes                                    |
| **style**    | Code formatting, missing semicolons, etc.                     |
| **refactor** | Code change that neither fixes a bug nor adds a feature       |
| **perf**     | Code change that improves performance                         |
| **test**     | Adding or correcting tests                                    |
| **build**    | Changes that affect the build system or external dependencies |
| **ci**       | Changes to CI/CD configuration files or scripts               |
| **chore**    | Maintenance tasks, dependency updates, etc.                   |

---

### 🧠 Enforcing Conventional Commits

### Local Enforcement

Install Husky and Commitlint to check commit messages locally before pushing.

```bash
npm install --save-dev @commitlint/{config-conventional,cli} husky
npx husky init
echo 'npx --no -- commitlint --edit "$1"' > .husky/commit-msg
chmod +x .husky/commit-msg
```

> 🆕 **Note:** Conventional Commits are enforced only for new commits after v1.0.0.  
> Older commits may not follow the format.

---

### 🔒 Automatic Secret Detection


This repository uses [Gitleaks](https://github.com/zricethezav/gitleaks) to automatically scan commits and pull requests for sensitive secrets (API keys, tokens, passwords, etc.).


- **Pull requests** will be blocked if secrets are detected.
- Always store credentials in **GitHub secrets** and never commit them directly.
- Review the `gitleaks-report.json` artifact if the workflow fails.

---

### Branch Protection Rules

- All work must go through Pull Requests.
- Direct pushes to `master` and `development` are not allowed.
- The CI pipeline (`CI - Ant Build & Checks`) must pass before merging.
- At least one approving review is required.

---

## 🧪 Pull Requests

- Ensure all tests pass.
- Update relevant documentation.
- Keep pull requests small and focused.
- Reference any related issues (e.g. `Fixes #123`).

---

## 🐛 Reporting Issues

If you find a bug or have a feature request:
1. Search existing issues first to avoid duplicates.
2. Use the provided issue template (if available).
3. Be clear and provide as much context as possible.

---

## 🌱 Good First Issues

Issues labeled `good first issue` are beginner-friendly tasks designed for new contributors.

They typically involve:
- Documentation improvements
- Adding or improving tests
- Fixing lint or static analysis warnings
- Small refactors with clear scope

Each good first issue includes:
- Clear steps to follow
- Expected outcome
- Pointers to relevant files or documentation

If you’re new to the project, start there!

---

## 💬 Questions or Help

If you have questions, feel free to:
- Open a discussion (if enabled)
- Reach out via the issue tracker

---

Thank you for contributing! 💚
