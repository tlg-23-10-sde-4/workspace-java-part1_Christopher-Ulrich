package com.dive;

public class Dive {

    public final static int MIN_SCUBA_DEPTH = 0;
    public final static int MAX_SCUBA_DEPTH = -90;
    public final static int MIN_SKY_HEIGHT = 5000;
    public final static int MAX_SKY_HEIGHT = 24000;

    public DiveType diveType = DiveType.invalid;
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

    public void decompress(int heightOrDepth, double diveTimer) {
        double timeOfDive = (2*diveTimer/3);
        double decompressTime = (diveTimer-timeOfDive)/60;
        double decompressDepth = (heightOrDepth/2);
        if (diveType.equals(DiveType.SCUBA) && heightOrDepth < 40 && diveTimer > 540) {
            for (int i = 0; i <= timeOfDive; i++) {
                // System.out.println("Time before decompression stop: " + (timeOfDive - i));
            }
            System.out.println("You have " + timeOfDive/60 + " minutes until you must ascend to " +
                    decompressDepth + " feet for " + decompressTime + " minutes");
        }
    }

    public DiveType getDiveType() {
        return diveType;
    }

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
            return windOrCurrentSpeed;

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