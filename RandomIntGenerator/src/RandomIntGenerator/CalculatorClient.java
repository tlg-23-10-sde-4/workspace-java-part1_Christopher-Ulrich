package RandomIntGenerator;/*
 * Some header text
 */

class CalculatorClient {
    public static void main(String[] args) {


        // CLASS (static or public) variables - these are shared among all instances
        int[] results = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int lowerBound = 1;
        int upperBound = 20;

        Calculator c1 = new Calculator();

        for (int i = 0; i < 100_0; i++) {
            int result = c1.RandomResult();
            if (lowerBound > result || result > upperBound) {
                System.out.println(result + " is out of bounds; rework your equation");
        } else {
            int resultMinusOne = (result - 1);
            results[resultMinusOne]++;
            }
        }

        System.out.println("The results are: \n");
        for (int i = 0; i < results.length; i++) {
            int iPlus = (i + 1);
            System.out.printf("%s was returned %s times \n", iPlus, results[i]);
        }

        int maxValue = results[0];
        int minValue = results[0];
        int maxInt = 0;
        int minInt = 0;
        for (int i = 0; i < results.length; i++) {
            if (results[i] < minValue) {
                minValue = results[i];
                minInt = i + 1;
            }
            if (results[i] > maxValue) {
                maxValue = results[i];
                maxInt = i + 1;
            }
        }
        int minValue2 = 100 * minValue;
        int percentValue = Math.floorDiv(minValue2, maxValue);

        System.out.printf("The smallest array (%s) of %s is %s percent the size of the largest array (%s) of %s", minInt, minValue, percentValue, maxInt ,maxValue);
    }
}