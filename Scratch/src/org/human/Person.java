package org.human;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 * An immutable class. More accurately, a class definition written in such a way that instances of it, once crates,
 * cannot have their properties changed.
 * There are simply no public methods to do so.
 */

class Person {
    private final String name;
    private final LocalDate birthDate;

    // Direct Field assingnment via constructor // Immutable because there are no constructors to change it
    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    /*
     * Returns the person's age in whole years.
     * ageGetter()
     * wholeYears()
     * ageYears()
     * ageQuery()
     *
     */

    /*
     * Returns the person's age in whole years.
     * This is a "derived property", ie.e., it is calculated and returned, not stored in a field
     * HINT: you want to find the period of time in whole years between two dates:
     * the birth date and today's date
     */
    public int getAge() {
        return Period.between(getBirthDate(), LocalDate.now()).getYears();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String toString() {
        return String.format("Person: name=%s, birthDate=%s", getName(), getBirthDate());
    }
}