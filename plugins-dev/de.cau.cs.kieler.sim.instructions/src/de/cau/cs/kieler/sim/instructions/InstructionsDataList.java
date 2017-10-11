/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.instructions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Display;

/**
 * The InstructionDataList to be displayed in the Instructions View
 * 
 * @author cmot
 * @kieler.design proposed 2013-02-28
 * @kieler.rating proposed 2013-02-28 yellow
 */
public class InstructionsDataList {

    /** The list of SJInstructionsData entries. */
    private List<InstructionsData> instructionsDataList;

    /** The one and only static instance of this class. */
    private static InstructionsDataList instance;

    /** The parent viewer to trigger refreshes. */
    private TreeViewer viewer;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new TableDataList.
     * 
     * @param viewerParam
     *            the parent tree table viewer for refreshes
     */
    public InstructionsDataList(final TreeViewer viewerParam) {
        this.viewer = viewerParam;
        instructionsDataList = new ArrayList<InstructionsData>();
        instance = this;
    }

    // -------------------------------------------------------------------------

    /**
     * Retrieve the index of instructionsDataList for a instructionData object.
     *
     * @param instructionsData the instructions data
     * @return the int
     */
    public int indexOf(final InstructionsData instructionsData) {
        return instructionsDataList.indexOf(instructionsData);
    }

    // -------------------------------------------------------------------------

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

    // -------------------------------------------------------------------------

    /**
     * Adds a SJInstructionsData entry to the list.
     * 
     * @param sjInstructionsData
     *            the SJInstructionsData entry
     */
    public void add(final InstructionsData sjInstructionsData) {
        instructionsDataList.add(sjInstructionsData);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets a SJInstructionsData entry with a specific index as an identifier.
     * 
     * @param index
     *            the identifier index
     * 
     * @return the SJInstructionsData entry
     */
    public InstructionsData get(final int index) {
        return instructionsDataList.get(index);
    }

    // -------------------------------------------------------------------------

    /**
     * 
     */
    public void clear() {
        instructionsDataList.clear();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the single instance of this TableDataList class.
     * 
     * @return single instance of TableDataList
     */
    public static synchronized InstructionsDataList getInstance() {
        if (instance != null) {
            return instance;
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the size of this list.
     * 
     * @return the size
     */
    public int size() {
        return instructionsDataList.size();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the list of SJInstructionsData entries as an array of SJInstructionsData entries.
     * 
     * @return the SJInstructionsData[] array
     */
    public InstructionsData[] getArray() {
        InstructionsData[] array = new InstructionsData[this.size()];
        for (int c = 0; c < this.size(); c++) {
            array[c] = this.get(c);
        }
        return array;
    }

    // -------------------------------------------------------------------------
}
