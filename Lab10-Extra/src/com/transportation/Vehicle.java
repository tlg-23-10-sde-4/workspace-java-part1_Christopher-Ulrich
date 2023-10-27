package com.transportation;

public abstract class Vehicle {
    // INSTANCE VARIABLES
    private String vin;

    // CONSTRUCTORS
    public Vehicle(String vin) {
        this.vin = vin;
    }

    // BUSINESS METHODS -- abstract gives subclasses the right - but not the obligation - to throw an exception
    // BUT if you use the superclass when some subclasses have the exception, you'll get the exception
    public abstract void moveTo(String location) throws DestinationUnreachableException;

    // ACCESSOR METHODS
    public String getVin() {
        return vin;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": vin=" + getVin();
    }
}