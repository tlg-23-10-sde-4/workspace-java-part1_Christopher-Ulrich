package edu.math;

import static edu.math.Calculator.*; //this imports the Calculator class, removing the need to type Calculator.(method) later


class CalculatorClient {

    public static void main(String[] args) {
        // Calculator calc = new Calculator();      This isn't needed because the instances are the same, effectively

        double sum = Calculator.add(3.1, 5.1);    // doubles are passed where doubles are expected
        System.out.println("The sum is " + sum);

        // below it's okay to pass ints where doubles are expected in the subtract() method
        // at runtime, an implicit upcast is done
        System.out.println("The difference is " +  Calculator.subtract(10, 8));

        System.out.println("10 is even? " + Calculator.isEven(10));

        System.out.println("The average is: " + Calculator.average(3, 4, 5, 9, 15));

        int min = 5;
        int max = 20;
        int result = 0;
        boolean itWorks = true;
        for(int i = 0; i <= 1_000_000; i++) {
            result = Calculator.randomInt();

            if (min < result || result > max) {
                itWorks = false;
                // System.out.println("You have a bug");    redundant with the addition of the itWorks variable
                // System.out.println("The value returned is: " + result);
                break;
            }
        }

        if (itWorks) {
            System.out.println("CONGRATULATIONS");
        }
        else {
            System.out.println("You have a bug");
            System.out.println("The value returned is: " + result);
        }

    }
}