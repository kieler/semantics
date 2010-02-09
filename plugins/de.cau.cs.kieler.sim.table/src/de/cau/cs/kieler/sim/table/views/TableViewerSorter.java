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

package de.cau.cs.kieler.sim.table.views;

import java.util.Comparator;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

/**
 * The Class TableViewerSorter is responsible to sort the data table.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class TableViewerSorter extends ViewerSorter {

    /** The column index. */
    private int column;

    /** The reversed flag. */
    private boolean reversed;

    /** The Constant COLUMN_1. */
    private static final int COLUMN_1 = 1;

    /** The Constant COLUMN_3. */
    private static final int COLUMN_3 = 3;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new table viewer sorter.
     * 
     * @param columnParam
     *            the column param
     */
    public TableViewerSorter(final int columnParam) {
        this.column = columnParam;
        reversed = false;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the column index.
     * 
     * @return the column
     */
    public int getColumn() {
        return column;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the reversed flag.
     * 
     * @return the reversed
     */
    public boolean getReversed() {
        return reversed;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the reversed flag.
     * 
     * @param reversedParam
     *            the new reversed
     */
    public void setReversed(final boolean reversedParam) {
        this.reversed = reversedParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Removes the star.
     * 
     * @param inString
     *            the in string
     * 
     * @return the string
     */
    private String removeStar(final String inString) {
        if (inString == null) {
            return null;
        }
        if (inString.charAt(0) == '*') {
            return inString.substring(1);
        }
        return inString;
    }

    // -------------------------------------------------------------------------

    /**
     * Compare two TableData values.
     * 
     * @param viewer
     *            the viewer
     * @param o1
     *            the o1
     * @param o2
     *            the o2
     * 
     * @return the int
     */
    @Override
    public int compare(final Viewer viewer, final Object o1, final Object o2) {
        TableData t1 = ((TableData) o1);
        TableData t2 = ((TableData) o2);
        String name1 = removeStar(t1.getKey());
        String name2 = removeStar(t2.getKey());
        if (column == COLUMN_3) {
            // values
            name1 = t1.getValue();
            name2 = t2.getValue();
        } else if (column == COLUMN_1) {
            // signals vs non-signals
            name1 = "" + (!t1.isSignal());
            name2 = "" + (!t2.isSignal());
        }
        if (reversed) {
            return compareStrings(name1, name2);
        }
        return compareStrings(name2, name1);
    }

    // -------------------------------------------------------------------------

    /**
     * Compare two Strings.
     * 
     * @param name1
     *            the name1
     * @param name2
     *            the name2
     * 
     * @return the int
     */
    private int compareStrings(final String name1, final String name2) {
        @SuppressWarnings("unchecked")
        Comparator<String> comp = getComparator();
        return comp.compare(name2, name1);
    }

}
