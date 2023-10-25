/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.time.LocalDate;

/**
 * The Employee class is fairly simple, serving as a superclass to illustrate inheritance.
 *
 * Properties:
 *   String name
 *   LocalDate hireDate
 *
 * Methods (excluding get/set methods):
 *   void work()        simulates work by printing a message to show it was called.
 *   String toString()  self-explanatory.
 */
public abstract class Employee {    // Abstract class isn't complete; can't directly instantiate it
    // fields; properties
    private String name;
    private LocalDate hireDate;

    // constructors
    public Employee() {   // There is a call to super() in here whether you type it in or not
    }

    public Employee(String name, LocalDate hireDate) {
        setName(name);
        setHireDate(hireDate);
    }

    // business methods
    public void work() {
        System.out.println(getName() + " working hard since " + getHireDate());
    }

    /*
     * Declare that all employees get paid; but don't implement it here
     * Implement it in the subclasses instead
     */
    public abstract void pay(); // Makes this an abstract class, must edit the class type up top; forces subclasses to have this method

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override   // Overrides the method in the class Object
    public String toString() {
        return "Employee: name=" + getName() + ", hireDate=" + getHireDate();
    }
}