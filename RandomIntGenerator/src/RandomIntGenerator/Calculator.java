package RandomIntGenerator;/*
 * Some header text
 */


class Calculator { // Private or Public or public/private (default)?

    int minValue;
    int maxValue;
    // ACCESSOR METHODS - these provide "controlled access" to the variables/properties/attributes
    public int RandomResult() {
        double rand0 = Math.random();
        double rand1 = (rand0 * 20) + 1;
        // int rounded = (int)Math.round(rand1);  // Had to DuckDuckGo to find the (int) to modify Math.round()
        //return rounded;
        return (int) rand1;
    }

    // public String toString() {}  // For output

}