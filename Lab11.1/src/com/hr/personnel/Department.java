/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The Department class manages employees.
 *
 * Properties:
 *   String name
 *   String location
 *   Employee[] employees  the Employees in this department.
 *   int currentIndex      internal counter for number of employees in the department.
 *
 * Methods (excluding get/set methods):
 *   void listEmployees()  print info on all employees in the department.
 *   void workEmployees()  make all employees in the department work.
 *   String toString()     self-explanatory.
 */
public class Department {
    // fields
    private String name;
    private String location;
    private final Collection<Employee> employees = new ArrayList<>();

    // constructors
    public Department() {   // There is a call to super() in here whether you type it in or not
    }

    public Department(String name, String location) {
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees() {
        // Note: we don't use for-each here because we only want to access the array where employees were added.
        // Question: what is in the array for indices where no Employee was added?  null!
        for (Employee emp : employees) {
            System.out.println(emp);  // toString() automatically called
        }
    }

    public void workEmployees() {
        for (Employee emp : employees) {
            emp.work();
        }
    }

    public void payEmployees() {
        for (Employee emp : employees) {
            emp.pay(); // Will not compute until there is a pay() method in Employees
        }
    }

    /*
     * "Forced" vacation: all employees with vacation MUST use it
     */
    public void holidayBreak () {
        for (Employee emp : employees) {
            // if employees[i] is really pointing to a SalariedEmployee object
            // downcast the reference to a more specific type SalariedEmployee
            // this allows me to call SalariedEmployee-specific methods like takeVacation()
            // This is called a downcast when you go down the hierarchy of classes and subclasses



            if (emp instanceof SalariedEmployee) {

            //    ((SalariedEmployee) employees[i]).takeVacation();   // Downcast & method call in one

                SalariedEmployee semp = (SalariedEmployee) emp;  // explicit downcast to new var 'semp'
                semp.takeVacation();    // Call to take vacation
            }
        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override // Overrides the method in the class Object
    public String toString() {
        return getClass().getSimpleName();
        // return "Department: name=" + getName() + ", location=" + getLocation();
    }
}