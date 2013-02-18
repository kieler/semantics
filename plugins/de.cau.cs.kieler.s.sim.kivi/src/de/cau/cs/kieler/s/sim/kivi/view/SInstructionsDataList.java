/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.s.sim.kivi.view;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.widgets.Display;


/**
 * @author cmot
 *
 */
public class SInstructionsDataList {

    /** The list of SJInstructionsData entries. */
    private List<SInstructionsData> sInstructionsDataList;

    /** The one and only static instance of this class. */
    private static SInstructionsDataList instance;

    /** The parent viewer to trigger refreshes. */
    private SInstructionsViewer viewer;



    /**
     * Instantiates a new TableDataList.
     * 
     * @param viewerParam
     *            the parent tree table viewer for refreshes
     */
    public SInstructionsDataList(final SInstructionsViewer viewerParam) {
        this.viewer = viewerParam;
        sInstructionsDataList = new ArrayList<SInstructionsData>();
        instance = this;
    }



    /**
     * Returns the index of an SJInstructionsData entry.
     * 
     * @param sjInstructionsData
     *            the SJInstructionsData entry
     * 
     * @return the index
     */
    public int indexOf(final SInstructionsData sInstructionsData) {
        return sInstructionsDataList.indexOf(sInstructionsData);
    }



    /**
     * Updates the view of the parent tree table viewer asynchronously.
     */
    public void updateViewAsync() {
        // asynchronously update the table
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                viewer.refresh();
                // select the last microstep in the SJ instructions view
                int i = viewer.getTree().getItemCount();
                // on STARTUP and END there are no microsteps
                if (i > 0) {
                    viewer.getTree().setSelection(viewer.getTree().getItem(i - 1));
                }
            }
        });
    }



    /**
     * Adds a SJInstructionsData entry to the list.
     * 
     * @param sjInstructionsData
     *            the SJInstructionsData entry
     */
    public void add(final SInstructionsData sjInstructionsData) {
        sInstructionsDataList.add(sjInstructionsData);
    }


    
    /**
     * Gets a SJInstructionsData entry with a specific index as an identifier.
     * 
     * @param index
     *            the identifier index
     * 
     * @return the SJInstructionsData entry
     */
    public SInstructionsData get(final int index) {
        return sInstructionsDataList.get(index);
    }


    
    /**
     * 
     */
    public void clear() {
        sInstructionsDataList.clear();
    }



    /**
     * Gets the single instance of this TableDataList class.
     * 
     * @return single instance of TableDataList
     */
    public static synchronized SInstructionsDataList getInstance() {
        if (instance != null) {
            return instance;
        }
        return null;
    }



    /**
     * Gets the size of this list.
     * 
     * @return the size
     */
    public int size() {
        return sInstructionsDataList.size();
    }



    /**
     * Gets the list of SJInstructionsData entries as an array of SJInstructionsData entries.
     * 
     * @return the SJInstructionsData[] array
     */
    public SInstructionsData[] getArray() {
        SInstructionsData[] array = new SInstructionsData[this.size()];
        for (int c = 0; c < this.size(); c++) {
            array[c] = this.get(c);
        }
        return array;
    }

}