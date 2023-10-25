package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    // fields or properties
    double salary;

    // constructors
    public SalariedEmployee() { //    // There is a call to super() in here whether you type it in or not
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

    @Override
        public void pay() {
            double payment = getSalary();
            System.out.println(getName() + " is paid salary " + payment);   // could have inlined this as seen below
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation");
    }

/*    @Override
    public void pay() {
        System.out.println(getName() + "is paid salary" + salary);
    }*/

    // accessor methods

    double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

    @Override   // Overrides the method in class Employee
    public String toString() {
        return super.toString() + ", salary=" + getSalary();
    }

}
