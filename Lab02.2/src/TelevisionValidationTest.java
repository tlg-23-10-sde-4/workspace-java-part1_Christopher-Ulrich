

public class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv1 = new Television();

        tv1.setVolume(-1);
        tv1.setBrand("Toshiba");
        System.out.println(tv1.toString());

        tv1.setVolume(0);
        tv1.setBrand("LG");
        System.out.println(tv1.toString());

        tv1.setVolume(1);
        tv1.setBrand("Sony");
        System.out.println(tv1.toString());

        tv1.setVolume(42);
        tv1.setBrand("Toshiba");
        System.out.println(tv1.toString());

        tv1.setVolume(101);
        tv1.setBrand("LG");
        System.out.println(tv1.toString());
    }
}