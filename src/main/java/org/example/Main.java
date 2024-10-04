package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        // Healthplan
        Healthplan healthplan = new Healthplan(1, "Basic Health Insurance", Plan.BASIC);
        System.out.println(healthplan);

        // Employee
        String[] healthPlans = new String[2];
        healthPlans[0] = healthplan.getName();
        Employee employee = new Employee(1, "John Doe", "john.doe@example.com", "secure123", healthPlans);
        employee.addHealthPlan(1, "Premium Health Insurance");
        System.out.println(employee);

        // Company
        String[] developers = new String[2];
        developers[0] = employee.getFullName();
        Company company = new Company(1, "Workintech", 5000, developers);
        company.addEmployee(1, "Jane Doe");
        System.out.println(company);
    }
}