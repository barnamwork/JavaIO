# Java IO Project

A Java project demonstrating File IO operations and Employee Payroll Service using Git Flow workflow.

---

## Branching Strategy

| Branch      | Purpose |
|-------------|----------|
| main        | Stable, production-ready code only |
| develop     | Latest integrated code |
| feature/uc* | Individual use case implementation branches |

---

## Use Cases

| UC | Title |
|----|--------|
| UC1 | Employee Payroll Console Service |
| UC2 | File Operations JUnit Tests |
| UC3 | Java File Watch Service |
| UC4 | Employee Payroll File Storage |
| UC5 | Print Payrolls & Count Entries |
| UC6 | Read Payroll File for Analysis |

---

## Project Structure

```
src/
├── main/java/com/bridgelabz/
│   ├── EmployeePayrollData.java
│   ├── EmployeePayrollService.java
│   ├── FileOperationsDemo.java
│   └── WatchServiceDemo.java
└── test/java/com/bridgelabz/
    ├── FileOperationsTest.java
    └── EmployeePayrollServiceTest.java
```

---

## Technologies Used

- Java 8+
- Java NIO (Files, Paths, WatchService)
- JUnit 5
- Git Flow

---

## Author

Barnam Das 