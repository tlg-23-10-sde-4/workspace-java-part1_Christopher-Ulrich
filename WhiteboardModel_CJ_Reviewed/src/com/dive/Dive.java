package com.dive;

/**
 * JR: Marginally passable.  Demonstrates basic understanding of program concepts,
 * but is flawed in several areas, and more attention to detail is needed.
 * ValidationTest is incorrect, and ClientArgs is severely flawed.
 *
 * See comments below and in the other classes, especially the DiveType enum.
 *
 * Code is clean, readable, well-formatted.
 *
 * Class participation has been good, but could still be improved.
 *
 * Class names, package names, and overall structure are correct.
 */
public class Dive {

    public final static int MIN_SCUBA_DEPTH = 0;
    public final static int MAX_SCUBA_DEPTH = -90;
    public final static int MIN_SKY_HEIGHT = 5000;
    public final static int MAX_SKY_HEIGHT = 24000;

    public DiveType diveType = DiveType.invalid;  // JR: field should be private
    private int heightOrDepth = 0;
    private int numPrevious = 0;
    private double diveTimer = 0;
    private double windOrCurrentSpeed = 0;


    public Dive() {
        setDiveType(diveType);
    }

    public Dive(int heightOrDepth) {
        this();
        setDiveType(diveType);
        setHeightOrDepth(heightOrDepth);
    }

    public Dive(int heightOrDepth, int numPrevious) {
        this(heightOrDepth);
        setDiveType(diveType);
        setNumPrevious(numPrevious);
    }

    public Dive(int heightOrDepth, int numPrevious, double diveTimer) {
        this(heightOrDepth, numPrevious);
        setDiveType(diveType);
        setDiveTimer(diveTimer);
    }

    public Dive(int heightOrDepth, int numPrevious, double diveTimer, double windOrCurrentSpeed) {
        this(heightOrDepth, numPrevious, diveTimer);
        setDiveType(diveType);
        setWindOrCurrentSpeed(windOrCurrentSpeed);
    }

    /*
     * JR: these two incoming parameter values are not necessary, since a Dive
     * object already has those values (as field properties).
     */
    public void decompress(int heightOrDepth, double diveTimer) {
        double timeOfDive = (2*diveTimer/3);
        double decompressTime = (diveTimer-timeOfDive)/60;
        double decompressDepth = (heightOrDepth/2);
        if (diveType.equals(DiveType.SCUBA) && heightOrDepth < 40 && diveTimer > 540) {
            for (int i = 0; i <= timeOfDive; i++) {
                // JR: why commented out?  Not working as you wanted it to, perhaps?
                // System.out.println("Time before decompression stop: " + (timeOfDive - i));
            }
            System.out.println("You have " + timeOfDive/60 + " minutes until you must ascend to " +
                    decompressDepth + " feet for " + decompressTime + " minutes");
        }
    }

    public DiveType getDiveType() {
        return diveType;
    }

    /*
     * JR: I see your thinking here, but still feel that mixing both sky and water
     * info into a single Dive class definition doesn't make sense.
     */
    public void setDiveType(DiveType diveType) {
        if (MIN_SCUBA_DEPTH >= heightOrDepth && heightOrDepth >= MAX_SCUBA_DEPTH) {
            this.diveType = DiveType.SCUBA;
        } else if (MIN_SKY_HEIGHT <= heightOrDepth && heightOrDepth <= MAX_SKY_HEIGHT) {
            this.diveType = DiveType.sky;
        }
        else this.diveType = DiveType.invalid;
    }

    public int getHeightOrDepth() {
        return heightOrDepth;
    }

    public void setHeightOrDepth(int heightOrDepth) {
        this.heightOrDepth = heightOrDepth;
    }

    public int getNumPrevious() {
        return numPrevious;
    }

    public void setNumPrevious(int numPrevious) {
        this.numPrevious = numPrevious;
    }

    public double getDiveTimer() {
        return diveTimer;
    }

    public void setDiveTimer(double diveTimer) {
        this.diveTimer = diveTimer;
    }

    public double getWindOrCurrentSpeed() {
        if (((diveType.equals(DiveType.SCUBA) && windOrCurrentSpeed > 3)) || diveType.equals(DiveType.sky) && windOrCurrentSpeed > 12) {
            System.out.printf("%s diving is exceedingly dangerous under these conditions; please use extreme caution! \n", getDiveType());
        }
            return windOrCurrentSpeed;  // JR: align tabbing with the if block

    }

    public void setWindOrCurrentSpeed(double windOrCurrentSpeed) {
        this.windOrCurrentSpeed = windOrCurrentSpeed;

    }

    public String toString() {
        return "Dive: Type = " + getDiveType() +
                " dive; Height/Depth = " + getHeightOrDepth() +
                "; Number of previous dives = " + getNumPrevious() +
                "; Dive Timer =  " + getDiveTimer() +
                "; Wind or Current Speed = " + getWindOrCurrentSpeed() + "\n";
    }

}