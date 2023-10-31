/*
 * Some header text
 */

package edu.geometry;

class Circle extends Shape { // Private or Public or public/private (default)?

    // CLASS (static or public) variables - these are shared among all instances

    // PROPERTIES or ATTRIBUTES, generally called "fields" or "instance variables"
    // these live *inside each instance* and are generally private

    // CONSTRUCTORS - special methods that get called when the client says "new"

    // BUSINESS METHODS (functions) - what operations can com.entertainment.Television objects do?

    @Override
    public void calculateArea() {
        super.calculateArea();
        double m1 = getMeasurement1();
        area = m1 * Circle_PI;
    }


    // ACCESSOR METHODS - these provide "controlled access" to the variables/properties/attributes

    // public String toString() {}  // For output

}