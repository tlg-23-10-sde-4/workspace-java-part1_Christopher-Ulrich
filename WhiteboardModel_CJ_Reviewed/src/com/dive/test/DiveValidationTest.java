package com.dive.test;

import com.dive.Dive;

/**
 * JR: not really doing validation testing here, i.e., verifying that a Dive
 * object's 'heightOrDepth' property is correctly constrained to your boundary values.
 *
 * For proper BVT (Boundary Value Testing), you'd need to check these values:
 *  -91,-90    and  0,1          for a Dive object that you deem to be a water dive
 *  4999,5000  and  24000,24001  for a Dive object that you deem to be a sky dive
 *
 *     public final static int MIN_SCUBA_DEPTH = 0;
 *     public final static int MAX_SCUBA_DEPTH = -90;
 *     public final static int MIN_SKY_HEIGHT = 5000;
 *     public final static int MAX_SKY_HEIGHT = 24000;
 */
public class DiveValidationTest {
    public static void main(String[] args) {
        Dive dive1 = new Dive(-91, 66, 500, 0.01);
        Dive dive2 = new Dive(12500, 66, 60, 12.01);


        System.out.println(dive1);
        System.out.println(dive2);

        dive1.decompress(-40, 600);

    }

}