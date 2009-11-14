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
package de.cau.cs.kieler.krep.compiler.helper;

/**
 * @author ctr print Debug informations with different verbose levels
 */
public class Debug {

    /**
     * Do not print any debug info
     */
    public final static int SILENT = 10;

    /**
     * Print only relevant info
     */
    public final static int NORMAL = 5;
    /**
     * verbose mode
     */
    public final static int ALL = 0;

    /**
     * current level of information
     */
    private static int level = ALL;

    public static void setLevel(int l) {
        level = l;
    }

    /**
     * print with low priority (only in verbose mode)
     * 
     * @param s
     *            debug information
     */
    public static void low(String s) {
        Debug.print(1, s);
    }

    /**
     * print with high priority (in any case)
     * 
     * @param s
     *            debug information
     */
    public static void high(String s) {
        Debug.print(9, s);
    }

    /**
     * print with medium priority
     * 
     * @param s
     *            debug information
     */
    public static void medium(String s) {
        Debug.print(5, s);
    }

    public static boolean isHigh() {
        return level >= ALL;
    }

    private static void print(int l, String s) {
        if (l >= level) {
            System.out.println(s);

        }
    }
}
