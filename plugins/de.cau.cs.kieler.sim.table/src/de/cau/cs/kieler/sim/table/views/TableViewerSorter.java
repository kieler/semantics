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

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

/**
 * The Class TableViewerSorter is responsible to sort the data table.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class TableViewerSorter extends ViewerSorter {
    
    private int column;
    private boolean reversed;
    
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
    
    /**
     * Gets the column.
     * 
     * @return the column
     */
    public int getColumn() {
        return column;
    }
    
    /**
     * Gets the reversed.
     * 
     * @return the reversed
     */
    public boolean getReversed() {
        return reversed;
    }
    
    /**
     * Sets the reversed.
     * 
     * @param reversedParam
     *            the new reversed
     */
    public void setReversed(boolean reversedParam) {
        this.reversed = reversedParam;
    }
    
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
    
    /**
     * Compare.
     * 
     * @param viewer
     *            the viewer
     * @param t1
     *            the t1
     * @param t2
     *            the t2
     * 
     * @return the int
     */
    @Override
    public int compare(final Viewer viewer, final Object o1, final Object o2) {
        TableData t1 = ((TableData)o1);
        TableData t2 = ((TableData)o2);
        System.out.println(">>> SORTTABLE <<<");
        String name1 = removeStar(t1.getKey());
        String name2 = removeStar(t2.getKey());
        if (column == 3) {
            //values
            name1 = t1.getValue();
            name2 = t2.getValue();
        }
        else if (column == 1) {
            //signals vs non-signals
            name1 = "" + (!t1.isSignal()); 
            name2 = "" + (!t2.isSignal());
        }
        if (reversed) {
            return getComparator().compare(name2, name1);
        }
        return getComparator().compare(name1, name2);
     }

    
//    public boolean isSorterProperty(Object element, String property) {
//        return true;
//    }    

}
