package edu.math;/*
 * This is an 'all-static' class with only one-off functions
 * there is no significant difference between one instance of the function and another
 */


class Calculator {

    // prevent instatiation from outside, this is an "all static" class
    private Calculator() {
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /**
     * Returns a random integer between 1 and 19 (inclusive).
     *
     * Hint: see a class called Math (package java.lang), look for a helpful hint there.
     * NOTE: the methods in the Math class are all "static", which means you call them as:
     *      Math.methodName()
     */
    public static int randomInt(){
        double rand = Math.random();                // local variable 0.00000 to 0.99999
        //double scaled = rand * 100;               // 0.0000 to 99.9999
        double scaled = (rand * 18) + 1;            // 1.00000 to 18.99999
        // double rounded = Math.round(scaled);     // One method that might work
        // result = rounded;                        // failed

        return (int) scaled;                     // could also use floor and ceiling, but you'll still have to get rid of the decimal

    }
    /**
     * Returns a random integer between 'min' and 'max (inclusive), e.g., 5 to 20.
     * OVERLOADING because it uses the same name as another method
     *
     * optional CHALLENGE: implement this.
     */
    public static int randomInt(int min, int max) {               //Overloading because same name as method above; differentiated by arguments
        double rand = Math.random();
        double scaled = rand * (max - min + 1);
        double raised = scaled + min;
        return (int) raised;
    }

    /*
     * Returns the average (arithmetic mean) of the supplied integers.
     * getAverage()
     * getArithmeticMean()
     * getMean()
     *
     */

    public static double average(int first, int... rest) {     // first: 3, rest: [4, 5, 9, 15] //inside here it is actually an array
        double result = 0.0;

        double sum = first;
        for (int value : rest) {
            sum = sum + value;
        }

        result = sum / (rest.length + 1);
        return result;
    }


}