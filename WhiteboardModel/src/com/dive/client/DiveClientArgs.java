package com.dive.client;

import com.dive.Dive;

class DiveClientArgs {

    public static void main(String[] args) {
        if (args.length < 4) {
            String usage = "This program requires the following inputs:\n 1: height or depth of your dive (use negative numbers for SCUBA dives)\n" +
                    " 2: number of previous dives\n 3: estimated time of the dive, and\n" +
                    " 4: the wind or current speed";
            String example = "Example: 12,500,  86,  61,  4.9";
            String note = "Note: this program will automatically decide the type of the dive";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
        } else {
            System.out.println("Thank you for providing " + args.length + " inputs");
            Dive newDive = new Dive();
            System.out.println("Your " + newDive.diveType + " dive will be at " + newDive.getHeightOrDepth() + " feet " +
                    "for " + newDive.getDiveTimer() + " seconds with a wind or current speed of " +
                    newDive.getWindOrCurrentSpeed() + " knots");
        }

    }
}