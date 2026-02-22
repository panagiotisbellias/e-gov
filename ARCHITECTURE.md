# e-Gov Desktop Application — Architecture

## 1. Overview

The e-Gov Desktop Application is a **Java desktop application** built using **Apache Ant**.  
It aims to provide secure and extendable government-related functionality.

**Key architectural goals:**

- Modularity for easy extension
- Separation of concerns (business logic, persistence)
- Secure handling of sensitive data
- Easy maintainability

---

## 2. High-Level Architecture

```text
+---------------------+
|  Application Logic  |
+----------+----------+
```

**Layers explained:**

1. **Application Logic**
    - Core business logic, validation

---

## 3. Module Structure

```
/src
 ├─ authorized/     → Models
 └─ e.gov/          → Business logic
```

---

## 4. Build & Deployment

- **Build Tool:** Apache Ant
- **Target Artifact:** JAR file in `dist/`
- **Build Commands:**
  ```bash
  ant clean
  ant jar
  ```
- **Run:**
  ```bash
  java -jar ./dist/e-gov_V2.2.1.jar
  ```

---

## 5. Security Considerations

- Secrets and credentials are **never committed**

---

## 6. Extensibility

- New modules can be added under `/src/e.gov`
- Use Ant targets to include new build steps if needed
- Follow existing naming and layering conventions
