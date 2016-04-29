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
public class StandardMeasuringParameters implements IMeasuringParameters {
    
    private int comparisonAmount;
    
    /**
     * 
     */
    public StandardMeasuringParameters(int amount) {
        this.comparisonAmount = amount;
    }
    
    /**
     * 
     */
    public StandardMeasuringParameters() {
        this(1);
    }

    /**
     * @return the comparisonAmount
     */
    public int getComparisonAmount() {
        return comparisonAmount;
    }

    /**
     * @param comparisonAmount the comparisonAmount to set
     */
    public void setComparisonAmount(int comparisonAmount) {
        this.comparisonAmount = comparisonAmount;
    }

    /**
     * 
     * @return
     */
    public static String getID() {
        return "Standard";
    }
}
