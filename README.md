# 🏢 Employee Data Processor with Java Streams

[![Java Version](https://img.shields.io/badge/Java-17%2B-blue.svg)](https://openjdk.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

A modern Java application demonstrating efficient data processing using Java Streams and the Function interface to analyze employee datasets.

## 🌟 Features

- **Stream-based data processing** for efficient operations
- **Function interface implementation** for data transformation
- **Dynamic filtering** with age thresholds
- **Salary analytics** with average calculations
- **Modular architecture** with separation of concerns
- **Reusable components** for common operations

## 📦 Prerequisites

- Java JDK 17+
- Maven (optional)
- Basic understanding of Java Streams

## 🚀 Quick Start

1. Clone the repository:
```bash
git clone https://github.com/KiseraTimon/Java-Streams-Functions-Interface.git
```

2. Compile & Run
```bash
javac *.java
```
```bash
java EmployeeDataProcessor
```

## 🧠 Core Concepts

1. 🔄 Function Interface Implementation
```java
// Transforms Employee Objects To Name-Department Strings
public static final Function<Employee, String> NAME_DEPT_FUNCTION = 
    e -> e.getName() + " - " + e.getDepartment();
```

2. ⚡ Stream Operations
```java
// Example: Average Salary Calculation
double avgSalary = employees.stream()
    .mapToDouble(Employee::getSalary)
    .average()
    .orElse(0.0);
```

3. 🔍 Age Filtering
```java
// Creating Dynamic Age Filter
public static Predicate<Employee> createAgeFilter(int ageThreshold) {
    return e -> e.getAge() > ageThreshold;
}
```

4. 📊 Sample Output
```powershell
Name-Department List: [John Doe - Engineering, Jane Smith - Marketing, Alice Johnson - Sales, Bob Brown - HR]
Average Salary: $68750.00
Filtered Name-Department (Age > 30): [Jane Smith - Marketing, Alice Johnson - Sales]
Filtered Average Salary: $72500.00
```

5. 🏗️ Project Structure
```t
├── Employee.java             # Entity class
├── EmployeeDataHelper.java   # Core processing logic
├── EmployeeDataProcessor.java# Main application
└── README.md                 # Documentation
```

## 🎯 Key Advantages

- Efficient memory usage through stream pipelining
- Lazy evaluation for optimal performance
- Clean separation of data, logic, and presentation
- Easy extensibility for new features
- Type-safe operations with Java generics

## 🛠️ Additional Features

- Dynamic predicate generation for filters
- Configurable age thresholds
- Error handling for empty results
- Formatted financial output
- Reusable utility methods

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

This README features:
- Clean visual hierarchy with emoji markers
- Code syntax highlighting
- Badges for quick info scanning
- Clear section separation
- Mobile-friendly formatting
- Comprehensive feature listing
- Easy-to-follow setup instructions
- Visual project structure breakdown

You can enhance it further by:
1. Adding screenshots in an `/images` folder
2. Including CI/CD pipeline badges
3. Adding a code coverage report
4. Incorporating UML diagrams
5. Adding a changelog section