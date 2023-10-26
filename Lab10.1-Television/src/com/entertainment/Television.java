package com.entertainment;

import java.util.Arrays;

/*
 *
 */
public class Television {
    // These are the Class constants - they cannot be changed and are available to all

    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;
    public static final String[] VALID_BRANDS = { "Samsung", "Sony", "LG", "Toshiba" };

    public static int getInstanceCount() {
        return instanceCount;
    }

    // define the brand and volume level - "fields" or "instance variables" in Java
    private String brand;
    private int volume;
    // public int volume1 = getVolume();
    private boolean muted = false;
    private int oldVolume = getVolume();
    private boolean isMuted = false;
    private DisplayType display = DisplayType.LED;

    //private boolean verifyInternetConnection;

    // Constructors go here

    public Television() {
        instanceCount++;         // increments instanceCount by 1
    }

    public Television(String brand)
    throws InvalidBrandException {
        this();
        setBrand(brand);

    }

    public Television(String brand, int volume)
    throws IllegalArgumentException, InvalidBrandException {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display)
    throws IllegalArgumentException, InvalidBrandException {
        this(brand, volume);
        setDisplay(display);
    }

    // functions or operations - aka "methods" in Java - what do Television objects DO?
    public void turnOn() {
        boolean Connected = verifyInternetConnection();
        System.out.println("Your " + getBrand() + " TV is currently set to volume " + getVolume() + ".");
    }

    public void turnOff() {
        System.out.println(getBrand() + " will be here at volume " + getVolume() + " the next time you need us :)");
    }
    /* my method
    public void mute() {
        if (isMuted() == false) {
            this.muted = true;
            volume1 = getVolume();
            this.volume = 0;
        } else {
            this.muted = false;
            this.volume = volume1;
        }
    }*/

    public void mute() {
        if (!isMuted()) {
            oldVolume = getVolume();
            setVolume(0); // could also use MIN_VOLUME
            isMuted = true;
        } else {
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    // accessor methods - provide "controlled access" to the object's fields
    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public String getBrand() {
        return brand;
    }

    // This works, but I want to try using a switch statement
    //public void setBrand(String brand) {
    //    if (brand == "Samsung" || brand == "LG" || brand == "Sony" || brand == "Toshiba") {
    //        this.brand = brand;
    //    } else {
    //        System.out.println("Your brand is invalid.");     This should actually be this.brand = "Invalid";
    //    }
    //}
    // TODO: Lab 6.1 p.81 (optional)
    // Use VALID_BRANDS here instead of the hardcoded magic strings "Samsung", "Sony"...
    // VALID_BRANDS looks like this ["Samsung", "Sony", "LG", "Toshiba"]

    public void setBrand(String brand) throws InvalidBrandException {  // Doing 2 jobs: validating and assigning ONLY IF VALID
        boolean valid = false;
        if (isValidBrand(brand)) {
            this.brand = brand;
        } else {
            throw new InvalidBrandException(String.format("Invalid brand: %s. Must be one of %s. \n",
                    brand, Arrays.toString(VALID_BRANDS)));
        }
    }

        //boolean valid = false;
        //for (String currentBrand : VALID_BRANDS) {
        //    if (brand.equals(currentBrand)) {
        //        this.brand = brand;
        //        valid = true;
        //        break;
        //    }
        //}
        //if (!valid) {
        //    System.out.printf("Invalid brand : %s. Must be one of %s.\n",
        //            brand, Arrays.toString(VALID_BRANDS));
        //}

    // Valid_BRANDS ["Samsung", "Sony", "LG", "Toshiba"]
    // Lab p.81 (very bottom of notes): why does it make sense for this method to be static?
        // if it wasn't static, you'd have to have a television object to call it; this way you can find out if it's valid without an object
        // don't have to go to each tv to find out if it's valid; can just go to the front desk and ask if a type is valid
    private static boolean isValidBrand(String brand) {
        boolean valid = false;
        for (String currentBrand : VALID_BRANDS) {
            if (brand.equals(currentBrand)) {
                valid = true;
                break;
            }
        }
        return valid;
    }

    // Switch statement
    //public void setBrand(String brand) {
    //     switch (brand) {
    //        case "Samsung":
    //            this.brand = brand;
    //            break;
    //        case "LG":
    //            this.brand = brand;
    //            break;
    //        case "Sony":
    //            this.brand = brand;
    //            break;
    //        case "Toshiba":
    //            this.brand = brand;
    //            break;
    //        default:
    //            this.brand = "Invalid";
    //    }
    //}

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) throws IllegalArgumentException {
        if (MIN_VOLUME <= volume && volume <= MAX_VOLUME) {
            this.volume = volume;
            isMuted = false;
        } else {
            throw new IllegalArgumentException(
                    String.format("Volume is outside of range %s - %s. \n",
                    MIN_VOLUME, MAX_VOLUME));
        }
    }

    public boolean isMuted() {
        return muted;
    }

        private boolean verifyInternetConnection () {
            return true;                                // fake implementation
        }

        // toString
        public String toString () {
            String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
            return "Television: brand = " + getBrand() + ", volume = " + getVolume() +
                    " Display Type: = " + String.valueOf(getDisplay()) + " Muted?: = " + isMuted();

        }
}