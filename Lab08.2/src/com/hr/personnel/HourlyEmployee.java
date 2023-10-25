package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    // fields or properties
    private double rate;
    private double hours;

    // constructors
    public HourlyEmployee() {   // There is a call to super() in here whether you type it in or not
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        setRate(rate);
        setHours(hours);

    }

    // business methods
    @Override
    public void pay() {
        double payment = getRate() * getHours();    // could have just inlined this in sout and removed the local variable
        System.out.println(getName() + " is paid hourly " + payment);
    }

/*    @Override
    public void pay() {
        System.out.println(getName() + "is paid salary" + (rate * hours));
    }*/

    // accessor methods

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override   // Overrides the method in class Employee
    public String toString() {  // This overrides the inherited toString() method from Employee
        return super.toString() + ", rate-" + getRate() + ", hours =" + getHours();
        //return String.format("Employee: name=%s, hire date %s, hourly rate=%s, hours=%s",
        //        getName(), getHireDate(), getRate(), getHours());
    }
}