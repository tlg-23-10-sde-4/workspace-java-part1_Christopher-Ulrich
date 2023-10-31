package edu.geometry;/*
 * Some header text
 */

public class Shape implements ShapeInterface { // Private or Public or public/private (default)?

    // CLASS (static or public) variables - these are shared among all instances
    private double measurement1;    // radius, length, or one S of SAS or SSS
    private double measurement2;    // width or the other of SAS or SSS
    private double measurement3;    // If triangle passes SSS instead of SAS
    private int degrees;            // If triangle passes SAS
    private ShapeEnum shapeType;
    public double area;


    // PROPERTIES or ATTRIBUTES, generally called "fields" or "instance variables"
    // these live *inside each instance* and are generally private

    // CONSTRUCTORS - special methods that get called when the client says "new"
    public Shape() {
    }

    public Shape(double measurement1) {
        getMeasurement1();
    }

    public Shape(double measurement1, double measurement2) {
        this(measurement1);
        getMeasurement2();
    }
     public Shape(double measurement1, double measurement2, int degrees) {
        this(measurement1, measurement2);
        getDegrees();
     }

     public Shape(double measurement1, double measurement2, double measurement3) {
        this(measurement1, measurement2);
        getMeasurement3()
     }

    // BUSINESS METHODS (functions) - what operations can com.entertainment.Television objects do?

    @Override
    public void calculateArea() {
    }

    @Override
    public void sumOfAreas() {
    }


    // ACCESSOR METHODS - these provide "controlled access" to the variables/properties/attributes

    public double getMeasurement1() {
        return measurement1;
    }

    public void setMeasurement1(double measurement1) {
        this.measurement1 = measurement1;
    }

    public double getMeasurement2() {
        return measurement2;
    }

    public void setMeasurement2(double measurement2) {
        this.measurement2 = measurement2;
    }

    public int getDegrees() {
        return degrees;
    }

    public void setDegrees(int degrees) {
        this.degrees = degrees;
    }

    public double getMeasurement3() {
        return measurement3;
    }

    public void setMeasurement3(double measurement3) {
        this.measurement3 = measurement3;
    }

    // public String toString() {}  // For output

    public String toString() {
        return String.format("Let's put something here");
    }

}