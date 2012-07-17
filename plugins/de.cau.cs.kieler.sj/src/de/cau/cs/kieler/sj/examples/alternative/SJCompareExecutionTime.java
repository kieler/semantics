/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sj.examples.alternative;

/**
 * The Class SJCompareExecutionTime.
 * 
 * @author cmot
 */
public final class SJCompareExecutionTime {

    /** The Constant STEP. */
    static final int STEP = 1000;

    /** The Constant START. */
    static final int START = 0;

    /** The Constant STOP. */
    static final int STOP = 100000;

    /** The Constant BESTK. */
    static final int BESTK = 3;
    
    /**
     * Utility class should not be instantiated.
     */
    private SJCompareExecutionTime() {
    }
    
    /**
     * Measure simple pco.
     * 
     * @param n
     *            the n
     * @return the long
     */
    public static long measureSimplePCO(final int n) {
        long minValue = Long.MIN_VALUE;
        for (int k = 0; k < BESTK; k++) {
            long start = System.currentTimeMillis();
            de.cau.cs.kieler.sj.examples.SimplePCO.main(n);
            long end = System.currentTimeMillis();

            minValue = Math.max(minValue, (end - start));
        }
        return minValue;
    }

    /**
     * Measure simple pco alternative.
     * 
     * @param n
     *            the n
     * @return the long
     */
    public static long measureSimplePCOAlternative(final int n) {
        long minValue = Long.MIN_VALUE;
        for (int k = 0; k < BESTK; k++) {
            long start = System.currentTimeMillis();
            de.cau.cs.kieler.sj.examples.alternative.SimplePCO.main(n);
            long end = System.currentTimeMillis();

            minValue = Math.max(minValue, (end - start));
        }
        return minValue;
    }

    /**
     * The main method.
     * 
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {

        int s = START;
        while (s < STOP) {
            long a = measureSimplePCO(s);
            long b = measureSimplePCOAlternative(s);
            s += STEP;
            System.out.println(s + "; " + a + ";" + b);
        }

    }

}
