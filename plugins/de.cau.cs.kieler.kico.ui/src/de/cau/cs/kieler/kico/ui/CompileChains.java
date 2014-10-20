/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.ui;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is a representation of multiple compile chains and filled by plugins using the kico.ui
 * extension point.
 * 
 * @author cmot
 * 
 */
public class CompileChains {

    /** The editor id. */
    private String editorID = "";

    /** The compile chain items. */
    private List<CompileChain> items = new ArrayList<CompileChain>();

    // -------------------------------------------------------------------------

    public CompileChains(String editorID) {
        this.editorID = editorID;
    }

    // -------------------------------------------------------------------------

    /**
     * Insert a new compile chain item in ascent order of its priority.
     * 
     * @param item
     *            the item
     */
    public void insertItem(CompileChain item) {
        int index = 0;
        for (CompileChain otherItem : items) {
            if (otherItem.priority < item.priority) {
                index++;
            }
        }
        items.add(index, item);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the editor id.
     * 
     * @return the editor id
     */
    public String getEditorID() {
        return editorID;
    }

    /**
     * Gets the maximum number of compile chain items.
     * 
     * @return the count
     */
    public int getCount() {
        return items.size();
    }

    /**
     * Gets the compile chain items sorted by priority.
     * 
     * @return the items
     */
    public List<CompileChain> getItems() {
        return items;
    }

    /**
     * Gets all labels as String list sorted by priority.
     * 
     * @return the labels
     */
    public List<String> getLabels() {
        List<String> returnList = new ArrayList<String>();
        for (CompileChain item : items) {
            returnList.add(item.label);
        }
        return returnList;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * This class represents a single compile chain.
     * 
     * @author cmot
     * 
     */
    public static class CompileChain {
        /** The label for the compile chain. */
        public String label = "";

        /** The priority. */
        public int priority = 0;

        /** The visible transformations. */
        public List<String> transformations = new ArrayList<String>();

        public void setPriority(String priority) {
            try {
                this.priority = Integer.parseInt(priority);
            } catch (Exception e) {
                // hide
            }
        }
    }

}
