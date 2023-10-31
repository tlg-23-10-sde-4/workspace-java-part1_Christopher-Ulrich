/*
 * Some header text
 */

package edu.geometry;

class Rectangle extends Shape { // Private or Public or public/private (default)?

    // CLASS (static or public) variables - these are shared among all instances

    // PROPERTIES or ATTRIBUTES, generally called "fields" or "instance variables"
    // these live *inside each instance* and are generally private

    // CONSTRUCTORS - special methods that get called when the client says "new"

    // BUSINESS METHODS (functions) - what operations can com.entertainment.Television objects do?

    @Override
    public void calculateArea() {
        super.calculateArea();

    }


    // ACCESSOR METHODS - these provide "controlled access" to the variables/properties/attributes

    // public String toString() {}  // For output

    /**
     * For the CLIENT Side
     * ENTRY-POINT or starting point for a standalone Java application
     *      public static void main(String[] args) {}
     *
     * Create an instance and set its properties 
     *     NameOfClass nameOfObject1 = new NameOfClass();
     *
     * Call methods
     *     nameOfObject1.doSomething();
     *
     * show their toString() methods in action
     *      sout(nameOfObject1.toString());
     */

}