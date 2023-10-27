package com.hr.client;

import com.hr.Employee;
import com.transportation.DestinationUnreachableException;

public class EmployeeClient {

    public static void main(String[] args) throws DestinationUnreachableException {
        // create an instance of Employee
        Employee emp = new Employee("John");

        // call goToWork() on the Employee object
        emp.goToWork();
    }
}