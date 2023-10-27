package com.transportation;

class BoatClient {
    public static void main(String[] args) {
        Vehicle boat = new Boat("ABCDE90"); // If using superclass type (Vehicle) then it will throw exceptions; if use subclass it won't
        boat.moveTo("West Seattle");
    }
}