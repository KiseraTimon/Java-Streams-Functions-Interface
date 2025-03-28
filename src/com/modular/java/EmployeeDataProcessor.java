package com.modular.java;

import java.util.Arrays;
import java.util.List;

public class EmployeeDataProcessor {
    public static void main(String[] args) {

        // Initializing Sample Data (Objects of Employee Constructor)
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", 28, "Engineering", 75000),
                new Employee("Jane Smith", 35, "Marketing", 65000),
                new Employee("Alice Johnson", 42, "Sales", 80000),
                new Employee("Bob Brown", 30, "HR", 55000)
        );

        // Generating Concatenated Strings Collection
        List<String> nameDeptList = EmployeeDataHelper.getNameDepartmentList(employees);
        System.out.println("\n***************\nName-Department List: \n" + nameDeptList);

        // Calculating Average Salary
        double avgSalary = EmployeeDataHelper.calculateAverageSalary(employees);
        System.out.printf("\n***************\nAverage Salary: $%.2f%n", avgSalary);

        //Employees Age Filter
        int ageThreshold = 30;
        List<Employee> filteredEmployees = EmployeeDataHelper.filterEmployees(
                employees,
                EmployeeDataHelper.createAgeFilter(ageThreshold)
        );

        // Processing Filtered Employees
        List<String> filteredNameDept = EmployeeDataHelper.getNameDepartmentList(filteredEmployees);
        System.out.println("\n***************\nFiltered Name-Department (Age > 30): \n" + filteredNameDept);

        double filteredAvgSalary = EmployeeDataHelper.calculateAverageSalary(filteredEmployees);
        System.out.printf("\n***************\nFiltered Average Salary: $%.2f%n", filteredAvgSalary);
    }
}