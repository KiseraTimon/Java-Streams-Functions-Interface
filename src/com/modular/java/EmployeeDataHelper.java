package com.modular.java;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeDataHelper {

    // Function to concatenate name and department
    public static final Function<Employee, String> NAME_DEPT_FUNCTION =
            e -> e.getName() + " - " + e.getDepartment();

    // Predicate for age filter
    public static Predicate<Employee> createAgeFilter(int ageThreshold) {
        return e -> e.getAge() > ageThreshold;
    }

    // Generating name-department list
    public static List<String> getNameDepartmentList(List<Employee> employees) {
        return employees.stream()
                .map(NAME_DEPT_FUNCTION)
                .collect(Collectors.toList());
    }

    // Calculating Average Salary
    public static double calculateAverageSalary(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
    }

    // Employees Age Filter
    public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> filter) {
        return employees.stream()
                .filter(filter)
                .collect(Collectors.toList());
    }
}