package com.dataprocessor.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Processing New Employees
class Employee {

    // Employee Attributes
    private String name;
    private int age;
    private String department;
    private double salary;

    // Constructor Blueprint To Add New Employees
    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

public class EmployeeDataProcessor {
    public static void main(String[] args) {

        // Initializing Sample Data (Objects of Employee Constructor)
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", 28, "Engineering", 75000),
                new Employee("Jane Smith", 35, "Marketing", 65000),
                new Employee("Alice Johnson", 42, "Sales", 80000),
                new Employee("Bob Brown", 30, "HR", 55000)
        );

        // Concatenating Name & Department
        Function<Employee, String> nameDeptFunction = e ->
                e.getName() + " - " + e.getDepartment();

        // Generating Concatenated Strings Collection
        List<String> nameDeptList = employees.stream()
                .map(nameDeptFunction)
                .collect(Collectors.toList());
        System.out.println("\n***************\nName-Department List:\n " + nameDeptList);

        // Calculating Average Salary
        double avgSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
        System.out.printf("\n***************\nAverage Salary: $%.2f%n", avgSalary);

        // Employees Age Filter
        int ageThreshold = 30;
        Predicate<Employee> ageFilter = e -> e.getAge() > ageThreshold;

        // Processing Filtered Employees
        List<String> filteredNameDept = employees.stream()
                .filter(ageFilter)
                .map(nameDeptFunction)
                .collect(Collectors.toList());
        System.out.println("\n***************\nFiltered Name-Department (Age > 30):\n " + filteredNameDept);

        double filteredAvgSalary = employees.stream()
                .filter(ageFilter)
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
        System.out.printf("\n***************\nFiltered Average Salary: $%.2f%n", filteredAvgSalary);
    }
}