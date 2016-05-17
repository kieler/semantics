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
 * This class is used for measuring with the K-Best Scheme. A KBestMeasuringParameteres object
 * contains all three parameters required.
 * 
 * @author nfl
 */
public class KBestMeasuringParameteres implements IMeasuringParameters {

    /**
     * The amount of best measurings required to be in close range.
     */
    private int k;

    /**
     * The allowed close range the best K measurings have to be in.
     */
    private double epsilon;

    /**
     * The amount of measurings taken at most.
     */
    private int m;

    /**
     * The constructor for a K-Best Scheme based measurement.
     * 
     * @param k
     *            the amount of best measuring required to be in close range
     * @param epsilon
     *            the allowed close range
     * @param m
     *            the termination criterion
     */
    public KBestMeasuringParameteres(final int k, final double epsilon, final int m) {
        this.k = k;
        this.epsilon = epsilon;
        this.m = m;
    }

    /**
     * A constructor for a single measuring.
     */
    public KBestMeasuringParameteres() {
        this(1, 0, 1);
    }

    /**
     * Getter for the amount of best measurings required to be in close range (K).
     * 
     * @return the K
     */
    public int getK() {
        return k;
    }

    /**
     * Setter for the amount of best measurings required to be in close range (K).
     * 
     * @param k
     *            the K to set
     */
    public void setK(final int k) {
        this.k = k;
    }

    /**
     * Getter for the allowed close range the best K measurings have to be in (epsilon).
     * 
     * @return the epsilon
     */
    public double getEpsilon() {
        return epsilon;
    }

    /**
     * Setter for the allowed close range the best K measurings have to be in (epsilon).
     * 
     * @param epsilon
     *            the epsilon to set
     */
    public void setEpsilon(final double epsilon) {
        this.epsilon = epsilon;
    }

    /**
     * Getter for the amount of measurings taken at most (M).
     * 
     * @return the M
     */
    public int getM() {
        return m;
    }

    /**
     * Setter for the amount of measurings taken at most (M).
     * 
     * @param m
     *            the M to set
     */
    public void setM(final int m) {
        this.m = m;
    }

    /**
     * Static method to identify this measuring method.
     * 
     * @return identification String
     */
    public static String getID() {
        return "K-Best Schema";
    }
}
