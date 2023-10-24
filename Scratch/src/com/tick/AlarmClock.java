package com.tick;

/*
 * Class definition to model the workings of an alarm clock.
 * This is called a "business class" or "system class", as it contains
 * business things such as attributes and methods.
 * This class definition does NOT have a main() method - most don't.
 */
class AlarmClock {
    // shared (static) variables - only one copy of these; they live in the class-wide common area
    // final means 'fixed' - there is no changing it
    // these are 'advertised constraints' - public can get to  them but cannot change them
    public static final int MIN_INTERVAL = 1;        // these are 'magic' or universal variables - they will not have get or set methods
    public static final int MAX_INTERVAL = 20;       // naming convention of allcaps = public static final

    // static means it is shared; final means it may not be changed//properties or attributes - in Java, we call these "instance variables" or "fields" - usually go at the top
    // business constraint: must be vetween 1 and 20 (inclusive)
    private int snoozeInterval = 5; // default value for snooze if the client doesn't specify (normally 0) private means hidden to anything outside the braces




    // Constructors go here - special methods used to instantiate objects when the client says 'new'
    // If no constructor is written, the compiler will automatically add one e.g. public AlarmClock() {}
    public AlarmClock() {

    }
    public AlarmClock(int snoozeInterval) {     // when calling this method, the caller must pass a value for snoozeInterval
        setSnoozeInterval(snoozeInterval);      // this is a problem if the client has AlarmClock clock1 = new AlarmClock();
    }

    // functions or operations - in Java we call these "methods"
    public void snooze() {
        System.out.println("Snoozing " + getSnoozeInterval() + " minutes"); // generally better to use 'get' rather than touch your own private field; no need for this. because parameter & field aren't the same
    }

    // accessor methods - provide "controlled" acces to the objects' fields
    // this allows us to do things like data validation, ie.e., enforcing constraints
    public int getSnoozeInterval() {            // public means just about anything can access it
        return snoozeInterval;
    }
    // TODO: enforce the data constraint (if-else) -> must be between 1 and 20 (inclusive)
    public void setSnoozeInterval(int snoozeInterval) {         // snoozeInterval is the parameter/field
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval;               // then this instance of snoozeInterval is set to the client's snoozeInterval input
        }
        else {
            System.out.println("Invalid snooze interval: " + snoozeInterval + "." +
                    "Must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL + ".");
        }
    }

    public String toString() {                      //must be written thusly; overrides (different from overloading) an above object
        return "AlarmClock: snoozeInterval=" + getSnoozeInterval();
    }
}