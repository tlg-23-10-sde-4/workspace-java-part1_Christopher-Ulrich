package gov.test;

import java.util.Arrays;

/**
 * Arrays are an all static helper class
 * Nothing but useful static methods; much like the math class
 * No class definition for Array
 */

class ArraysTest {
    public static void main(String[] args) {
        int[] ages = new int[4];    // could initialize all in one line with: int[] ages = { 2, 39, 49, 3 }; as seen in temps below
        ages[0] = 56;
        ages[1] = 50;
        ages[2] = 9;
        ages[3] = 9;

        for (int age : ages) {  // for loop will spin 4 times; 0 - 3
            System.out.printf("The age is %s\n", age);
        }
        System.out.printf("This array has %s values\n", ages.length);

        //System.out.println(ages);   // toString() automatically called; this is the only automatic method called by Array
        System.out.println(Arrays.toString(ages)); // this is the IntelliJ auto correct
        System.out.println();

        double[] temps = { 63.3, 88.0, 73, 66.2, 70.0 };    // The 73 is automatically upcast to double

        for (double temp : temps) {
            System.out.printf("The current temperature is: %s\n", temp);
        }
        System.out.println(Arrays.toString(temps)); //if selected 'sout' then it will print awkwardly; intelliJ will recommend changing to 'souf'
        System.out.println();

        String[] names = { "jay", "martina", "amilia", "logan" };
        System.out.println(Arrays.toString(names));
    }
}
