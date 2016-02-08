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
 * @author nfl
 *
 */
public class KBestMeasuringParameteres implements IMeasuringParameters {
    
    int K;
    double epsilon;
    int M;

    public KBestMeasuringParameteres(int K, double epsilon, int M) {
        this.K = K;
        this.epsilon = epsilon;
        this.M = M;        
    }

    public KBestMeasuringParameteres() {
        this(1, 0, 1);
    }

    /**
     * @return the k
     */
    public int getK() {
        return K;
    }

    /**
     * @param k
     *            the k to set
     */
    public void setK(int k) {
        K = k;
    }

    /**
     * @return the epsilon
     */
    public double getEpsilon() {
        return epsilon;
    }

    /**
     * @param epsilon
     *            the epsilon to set
     */
    public void setEpsilon(double epsilon) {
        this.epsilon = epsilon;
    }

    /**
     * @return the m
     */
    public int getM() {
        return M;
    }

    /**
     * @param m
     *            the m to set
     */
    public void setM(int m) {
        M = m;
    }

    /**
     * 
     * @return
     */
    public static String getID() {
        return "K-Best Schema";
    }
}
