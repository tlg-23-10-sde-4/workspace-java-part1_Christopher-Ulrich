/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import com.hr.personnel.Executive;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason",      LocalDate.of(1990, 8, 24), 1175.0));
        dept.addEmployee(new SalariedEmployee("Julie",      LocalDate.of(2000, 2, 2), 1275.0));
        dept.addEmployee(new HourlyEmployee("Olivia",    LocalDate.of(2014, 10, 27), 9.00, 56));
        dept.addEmployee(new HourlyEmployee("Cole",           LocalDate.of(2017, 5, 5), 6.50, 36));
        dept.addEmployee(new Executive("Jay", LocalDate.of(1986, 12, 5), 100_000.00));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // Pay the Employees
        System.out.println("\nPay the Employees");
        dept.payEmployees();

        // forced holiday break
        System.out.println("\nForced holiday break");
        dept.holidayBreak();
    }
}