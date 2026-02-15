# Third-Party Licenses

This project depends on the following third-party libraries.  
All dependencies are managed via Maven for use within the Ant-based build system.

---

## 1. JUnit Platform Console Standalone

**Group:** org.junit.platform  
**Artifact:** junit-platform-console-standalone  
**Version:** 6.0.2  
**Scope:** Test

**License:** Eclipse Public License 2.0 (EPL-2.0)  
https://www.eclipse.org/legal/epl-2.0/

Used for executing unit tests.

---

## 2. Checkstyle

**Group:** com.puppycrawl.tools  
**Artifact:** checkstyle  
**Version:** 13.2.0

**License:** GNU Lesser General Public License v2.1 (LGPL-2.1)  
https://www.gnu.org/licenses/old-licenses/lgpl-2.1.en.html

Used for static code style analysis.

---

## 3. PMD Core

**Group:** net.sourceforge.pmd  
**Artifact:** pmd-core  
**Version:** 7.21.0

**License:** BSD 3-Clause License  
https://opensource.org/licenses/BSD-3-Clause

Used for static code analysis.

---

## 4. PMD Java

**Group:** net.sourceforge.pmd  
**Artifact:** pmd-java  
**Version:** 7.21.0

**License:** BSD 3-Clause License  
https://opensource.org/licenses/BSD-3-Clause

Provides Java language rules for PMD.

---

## 5. SLF4J API (Optional)

**Group:** org.slf4j  
**Artifact:** slf4j-api  
**Version:** 2.0.17

**License:** MIT License  
https://opensource.org/licenses/MIT

Logging abstraction library.

---

# License Compatibility

The project is licensed under **Apache License 2.0**.

All included third-party licenses are compatible with Apache 2.0 for use in this project.

---

# Notes

- Dependencies are not committed to the repository.
- They are resolved during build time via Maven.
- No GPL (strong copyleft) dependencies are included.

# ⚠ Important Note:

Checkstyle uses **LGPL 2.1**, which is fine for usage as a tool dependency, but do NOT embed it in distributed
binaries without understanding LGPL obligations. Since it's a build/static analysis tool, you're safe.
