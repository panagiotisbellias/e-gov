# Contributing Guidelines

Thank you for your interest in contributing! 🎉  
This project welcomes improvements, bug fixes, documentation updates, and new features.

---

## 🪄 Getting Started

1. Fork the repository
2. Clone your fork:
   ```bash
   git clone https://github.com/<your-username>/e-gov.git
   ```
3. Create a branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```

---

## 🧱 Development Setup

Ensure you have:
- JDK 17+
- Apache Ant

```bash
java -version
ant -version
```

Build locally:
```bash
ant clean
ant jar
```

Run tests:
```bash
ant test
```

---

## 🧭 Code Style & Standards

Please:
- Follow the existing project structure
- Keep methods focused and readable
- Avoid unnecessary dependencies
- Ensure no new static analysis warnings
- Write meaningful test coverage for new features

---

## 🧩 Commit Guidelines

This project follows the Conventional Commits specification.

### Format

```
<type>(<scope>): <description>
```

### Examples

```
feat(core): add authentication module
fix(build): resolve Ant classpath issue
docs(readme): improve setup instructions
ci(workflow): update GitHub Actions version
```

---

### 🧩 Common Types

| Type     | Purpose              |
| -------- | -------------------- |
| feat     | New feature          |
| fix      | Bug fix              |
| docs     | Documentation        |
| refactor | Code restructuring   |
| test     | Add or update tests  |
| build    | Build system changes |
| ci       | CI configuration     |
| chore    | Maintenance tasks    |

---

### 🔒 Security & Secret Protection

This repository uses Gitleaks for secret scanning.

- Never commit credentials
- Use GitHub Secrets
- Pull Requests will fail if secrets are detected

---

## 🔁 Pull Request Process

Before submitting:
- Tests pass locally
- CI passes
- No secrets introduced
- Code follows Conventional Commits
- Documentation updated (if needed)
- Static analysis clean

Keep PRs:
- Small
- Focused
- Clearly described

Reference related issues:
```
Fixes #123
```

---

## 🐛 Reporting Issues

Before opening a new issue:
1. Search existing issues
2. Use the issue template
3. Provide clear reproduction steps

---

## 🌱 Good First Issues

Issues labeled `good first issue` are beginner-friendly and include:
- Clear instructions
- Defined scope
- Expected outcome

---

## 💬 Questions?

Open an issue or discussion if you need clarification.

---

Thank you for helping improve e-Gov! 💚
