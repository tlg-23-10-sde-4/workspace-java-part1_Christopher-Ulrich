/*
 * Some header text
 */

package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class Executive extends SalariedEmployee { // Private or Public or public/private (default)?

    // CLASS (static or public) variables - these are shared among all instances

    // PROPERTIES or ATTRIBUTES, generally called "fields" or "instance variables"
    // these live *inside each instance* and are generally private

    // CONSTRUCTORS - special methods that get called when the client says "new"
    public Executive() {
        super();    // don't have to put this in there as it will automatically call super()
    }

    public Executive(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    // BUSINESS METHODS (functions) - what operations can com.entertainment.Television objects do?


    @Override   // From interface TaxPayer
    public void fileReturn() {
        System.out.println("Return filed electronically");
    }

    @Override
    public void work() {
        System.out.println(getName() + " enjoying a nice round of golf");
    }

    // ACCESSOR METHODS - these provide "controlled access" to the variables/properties/attributes

    // public String toString() {}  // For output

}