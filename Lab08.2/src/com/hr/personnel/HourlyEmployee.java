package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    // fields or properties
    private double rate;
    private double hours;

    // constructors
    public HourlyEmployee() {
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

    public String toString() {  // This overrides the inherited toString() method from Employee
        return String.format("Employee: name=%s, hire date %s, hourly rate=%s, hours=%s",
                getName(), getHireDate(), getRate(), getHours());
    }
}