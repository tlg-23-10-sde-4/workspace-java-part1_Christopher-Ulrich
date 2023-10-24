package com.dive.client;

import com.dive.Dive;

class DiveClient {

    public static void main(String[] args) {

        Dive dive1 = new Dive(12000, 10000, 48, 2.2);
        System.out.println(dive1);
        dive1.decompress(dive1.getHeightOrDepth(), dive1.getDiveTimer());

        Dive dive2 = new Dive(-40, 17, 660, 1.66);
        System.out.println(dive2);
        dive2.decompress(dive2.getHeightOrDepth(), dive2.getDiveTimer());

        Dive dive3 =  new Dive();
        dive3.setHeightOrDepth(-50);
        dive3.setNumPrevious(4);
        dive3.setDiveTimer(1080);
        dive3.setWindOrCurrentSpeed(0.3);
        System.out.println(dive3);
        dive3.decompress(dive3.getHeightOrDepth(), dive3.getDiveTimer());


    }
}