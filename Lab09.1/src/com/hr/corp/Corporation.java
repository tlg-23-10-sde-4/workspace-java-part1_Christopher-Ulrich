/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.corp;

import gov.irs.TaxPayer;

/**
 * Corporate entity - also pays taxes.
 */
public class Corporation implements TaxPayer {  // Corporation IS-A TaxPayer
    private String name;

    public Corporation(String name) {
        setName(name);
    }

    @Override  // From interface TaxPayer
    public void payTaxes() {
        System.out.println(getName() + " paid no taxes - we lobbied hard and it worked");
    }

    @Override   // From interface Taxpayer
    public void fileReturn() {
        System.out.println(getName() + "'s return not filed - lawyers sent instead");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}