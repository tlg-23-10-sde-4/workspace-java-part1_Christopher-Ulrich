package com.tick;
/*
 * This client is for testing
 */

public class AlarmClockValidationTest {

    public static void main(String[] args) {

        AlarmClock clock1 = new AlarmClock();
        //AlarmClock clock2 = new AlarmClock(1);
        //AlarmClock clock3 = new AlarmClock(20);
        //AlarmClock clock4 = new AlarmClock(21);

        clock1.setSnoozeInterval(1);
        System.out.println(clock1.getSnoozeInterval());
        System.out.println(clock1.toString());

        clock1.setSnoozeInterval(20);
        System.out.println(clock1.toString());

        clock1.setSnoozeInterval(0);
        System.out.println(clock1.toString());

        clock1.setSnoozeInterval(21);
        System.out.println(clock1.toString());
    }
}