package com.dive.test;

import com.dive.Dive;

public class DiveValidationTest {
    public static void main(String[] args) {
        Dive dive1 = new Dive(-40, 66, 500, 0.01);
        Dive dive2 = new Dive(12500, 66, 60, 12.01);


        System.out.println(dive1);
        System.out.println(dive2);

        dive1.decompress(-40, 600);

    }

}