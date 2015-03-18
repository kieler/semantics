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
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * Represents a selection in KiCoSelectionView with its context.
 * 
 * @author als
 * 
 */
public class KiCoSelection {

    public static final KiCoSelection EMPTY_SELECTION = new KiCoSelection(0, null, null, false);

    /** Hash value of related editor */
    private final int editorID;
    /** List of selected transformations. */
    private final List<String> selection;
    /** Indicates if compiler should run in advanced mode */
    private final boolean advanced;
    /** Identifier to compare this selection */
    private final int id;

    /**
     * Creates a Selection with additional context information.
     * 
     * @param editorID
     *            Hash value of related editor
     * @param selection
     *            List of selected transformations
     * @param advancedMode
     *            Indicates if compiler should run in advanced mode
     */
    public KiCoSelection(int editorID, KiCoSelectionDiagramModel selectionModel,
            List<String> implicitSelection, boolean advanced) {
        this.editorID = editorID;
        List<String> selection = new ArrayList<String>();
        if (selectionModel != null) {
            String[] selectionRaw =
                    selectionModel.getContext().getSelection().toString().split(",");
            for (String selectionRawItem : selectionRaw) {
                selection.add(selectionRawItem);
            }
        }
        this.selection = new LinkedList<String>(selection);
        this.advanced = advanced;
        // calculate ID
        if (this.selection.isEmpty()) {
            this.id = 0;
        } else {
            int calculatedID = advanced ? 1 : 0;
            for (String string : this.selection) {
                if (string != null) {
                    calculatedID += string.hashCode();
                }
            }
            if (implicitSelection != null && !implicitSelection.isEmpty()) {
                for (String string : implicitSelection) {
                    if (string != null) {
                        calculatedID += string.hashCode();
                    }
                }
            }
            this.id = calculatedID;
        }

    }

    /**
     * Hash value of related editor
     * 
     * @return the editorID
     */
    public int getEditorID() {
        return editorID;
    }

    /**
     * List of selected transformations.
     * 
     * @return the selection
     */
    public List<String> getSelection() {
        return Collections.unmodifiableList(selection);
    }

    /**
     * List of selected transformations as string.
     * 
     * @return the selection
     */
    public String getSelectionString() {
        if (selection.isEmpty()) {
            return "";
        } else {
            StringBuilder builder = new StringBuilder();
            for (String str : selection) {
                builder.append(str);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
            return builder.toString();
        }
    }

    /**
     * Indicates if compiler should run in advanced mode
     * 
     * @return the advanced mode
     */
    public boolean isAdvanced() {
        return advanced;
    }

    /**
     * @return if nothing is selected
     */
    public boolean isEmpty() {
        return selection.isEmpty();
    }

    /**
     * Identifier to compare this selection
     * 
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        KiCoSelection other = (KiCoSelection) obj;
        if (id != other.id)
            return false;
        return true;
    }

}
