/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.comparison.exchange;

/**
 * This class is used for measuring with the standard measuring approach. A
 * standard measuring is done by taking a specific amount of measurings.
 * 
 * @author nfl
 */
public class StandardMeasuringParameters implements IMeasuringParameters {

    /**
     * The amount of measurings being taken.
     */
    private int comparisonAmount;

    /**
     * The constructor to create a {@link StandardMeasuringParameters} object.
     * 
     * @param amount the amount of measurings that should be taken
     */
    public StandardMeasuringParameters(final int amount) {
        this.comparisonAmount = amount;
    }

    /**
     * A constructor to create a {@link StandardMeasuringParameters} object with a single measuring.
     */
    public StandardMeasuringParameters() {
        this(1);
    }

    /**
     * Getter for the amount of measurings being taken.
     * 
     * @return the amount
     */
    public int getComparisonAmount() {
        return comparisonAmount;
    }

    /**
     * Setter for the amount of measurings being taken.
     * 
     * @param comparisonAmount
     *            the amount to set
     */
    public void setComparisonAmount(final int comparisonAmount) {
        this.comparisonAmount = comparisonAmount;
    }

    /**
     * Static method to identify this measuring method.
     * 
     * @return identification String
     */
    public static String getID() {
        return "Standard";
    }
}
