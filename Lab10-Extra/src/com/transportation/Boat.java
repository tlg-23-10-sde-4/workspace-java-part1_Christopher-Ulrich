/*
 * Some header text
 */

package com.transportation;

class Boat extends Vehicle { // Private or Public or public/private (default)?

    public Boat(String vin) {
        super(vin);
    }

    @Override
    public void moveTo(String location) {
        System.out.println("Boat moving to " + location);
    }

}