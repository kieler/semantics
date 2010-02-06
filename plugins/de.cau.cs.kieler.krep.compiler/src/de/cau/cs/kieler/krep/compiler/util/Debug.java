/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.krep.compiler.util;

/**
 * Print debug informations with different levels of detail.
 * 
 * @kieler.rating 2010-02-05 yellow 
 *   review by cmot, msp, tam
 * 
 * @author ctr 
 */
public final class Debug {

    private Debug() {
    }

    /**
     * Do not print any debug info.
     */
    public static final int SILENT = 10;

    /**
     * Print only relevant info.
     */
    public static final int NORMAL = 5;
    /**
     * verbose mode.
     */
    public static final int ALL = 0;

    /**
     * current level of information.
     */
    private static int level = ALL;

    /**
     * 
     * @param l debug level
     */
    public static void setLevel(final int l) {
        level = l;
    }

    /**
     * print with low priority (only in verbose mode).
     * 
     * @param s
     *            debug information
     */
    public static void low(final String s) {
        Debug.print(1, s);
    }

    /**
     * print with high priority (in any case).
     * 
     * @param s
     *            debug information
     */
    public static void high(final String s) {
        Debug.print(Debug.SILENT - 1, s);
    }

    /**
     * print with medium priority.
     * 
     * @param s
     *            debug information
     */
    public static void medium(final String s) {
        Debug.print(Debug.NORMAL, s);
    }

    /**
     * @return true, if debug level is high.
     */
    public static boolean isHigh() {
        return level >= ALL;
    }

    private static void print(final int l, final String s) {
        if (l >= level) {
            System.out.println(s);

        }
    }
}
