package gov.test;

class WrappersTest {

    public static void main(String[] args) {
        String ageInput = "41";
        int age = Integer.parseInt(ageInput);   // Only works with numbers, does not convert, only returns.
        Integer ageInteger = Integer.valueOf(ageInput);

        String brainCellsInput = "86000000000";
        long brainCells = Long.parseLong(brainCellsInput);
        Long brainCellsLong = Long.valueOf(brainCellsInput);

        String shoeSizeInput = "10.5";
        double shoeSize = Double.parseDouble(shoeSizeInput);
        Double shoeSizeDouble = Double.valueOf(shoeSizeInput);

        String sunnyInput = "true";
        boolean sunny = Boolean.parseBoolean(sunnyInput);
        Boolean sunnyBoolean = Boolean.valueOf(sunnyInput);

        Integer size = 9;   // Primitive Int
        Integer size2 = Integer.valueOf(9);  // returns a string; this has been rendered obsolete because of autoboxing



    }
}