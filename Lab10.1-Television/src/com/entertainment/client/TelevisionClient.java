package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.InvalidBrandException;
import com.entertainment.Television;

/*
 *
 */
class TelevisionClient {
    public static void main(String[] args) throws InvalidBrandException {
        System.out.println(Television.getInstanceCount() + " instances");
        System.out.println();

        // create an instance of Television and set its properties
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(32);
        tv1.setDisplay(DisplayType.PLASMA);


        // create second instance of Television and set properties
        Television tv2 = new Television();
        tv2.setBrand("Toshiba");
        tv2.setVolume(10);

        // create a third instance of Television ...
        Television tv3 = new Television("LG", Television.MIN_VOLUME);

        // and a fourth using the three argument brand constructor
        Television tv4 = new Television("Toshiba", 34, DisplayType.CRT);


        // call methods

        tv1.turnOn();
        tv2.turnOn();
        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOn();
        tv3.turnOff();

        tv3.setDisplay(DisplayType.OLED);



        // show their toString() methods in action
        System.out.println(tv1.toString());
        System.out.println(tv2);                   // same as explicityly calling the tvl2.toString()
        System.out.println(tv3);
        System.out.println(tv4);

        //television1.printBrand();
        //television1.printVolume();

        //television2.printBrand();
        //television2.printVolume();
        System.out.println(Television.getInstanceCount() + " instances have been created");
    }
}