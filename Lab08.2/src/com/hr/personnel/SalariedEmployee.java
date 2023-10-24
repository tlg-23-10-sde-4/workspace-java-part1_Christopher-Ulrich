package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    // fields or properties
    double salary;

    // constructors
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate,double salary) {
        this(name, hireDate);   // Could also be super(name, hireDate); here, but that limits the options if something in the 2 arg constructor is changed.
        // Better to call a neighboring constructor rather than super().
        setSalary(salary);
    }

    // business methods

    // accessor methods

    double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee: name=" +
                getName() +
                ", hireDate=" +
                getHireDate() +
                ", salary=" +
                getSalary();
    }

}
