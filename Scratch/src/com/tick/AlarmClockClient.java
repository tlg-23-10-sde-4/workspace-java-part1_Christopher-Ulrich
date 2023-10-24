package com.tick;

/*
 * Application main-class, i.e., the class definition with the main() method.
 * Its purpose is to create a few instances of AlarmClock and give them a basic test drive.
 *
 * This is NOT the tester; that is a different client.
 */
class AlarmClockClient {
    // application "entry point" or starting point - the app starts from here
    public static void main(String[] args) {
        // create an instance of AlarmClock and set its properties
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);

        // create a 2nd instance of AlarmClock and set its properties
        AlarmClock clock2 = new AlarmClock(AlarmClock.MAX_INTERVAL); // makes it go as long as it can
        // clock2.setSnoozeInterval(10);        This can be omitted because of the 2nd ctor type in the business side

        // create 3rd instance of AlarmClock and set its properties
        AlarmClock clock3 = new AlarmClock();


        // call methods on them
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();

        System.out.println();

        // show their toString() methods in action
        System.out.println(clock1.toString());
        System.out.println(clock2);                 // will run the same as the toString()
        System.out.println(clock3);                 // toString() automatically called again
    }
}