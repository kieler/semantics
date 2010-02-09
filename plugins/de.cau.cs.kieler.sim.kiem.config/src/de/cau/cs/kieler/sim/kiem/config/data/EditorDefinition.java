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
package de.cau.cs.kieler.sim.kiem.config.data;

import java.io.Serializable;

import de.cau.cs.kieler.sim.kiem.config.managers.Tools;

/**
 * Definition class for the editor. Contains the name of the editor and an
 * editor id.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public class EditorDefinition implements Comparable<EditorDefinition>,
        Serializable {

    /** Id for serialization. */
    private static final long serialVersionUID = -6893097591962955803L;

    /** The name of the editor. */
    private String name;

    /** editor id belonging to this editor. */
    private EditorIdWrapper editorId;

    /** true if the editor should not be removed. */
    private boolean isLocked = false;

    // --------------------------------------------------------------------------

    /**
     * Create a new definition.
     * 
     * @param newName
     *            the name of the new definition.
     * @param newEditorId
     *            the id of the editor.
     */
    public EditorDefinition(final String newName,
            final EditorIdWrapper newEditorId) {
        this.name = newName;
        this.editorId = newEditorId;
    }

    // --------------------------------------------------------------------------

    /**
     * Returns the editor id belonging to this editor.
     * 
     * @return the editor id
     */
    public EditorIdWrapper getEditorId() {
        return editorId;
    }

    /**
     * Getter for the editor name.
     * 
     * @return the name of the editor
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for the isLocked.
     * 
     * @return the isLocked
     */
    public boolean isLocked() {
        return this.isLocked;
    }

    /**
     * Setter for the isLocked.
     * 
     * @param isLockedParam
     *            the isLocked to set
     */
    public void setLocked(final boolean isLockedParam) {
        this.isLocked = isLockedParam;
    }

    // --------------------------------------------------------------------------

    /**
     * Determines if the given editor id is supported by this definition.
     * 
     * @param anotherId
     *            the id to look for.
     * @return true if the editor is supported, false if not.
     */
    public boolean supports(final EditorIdWrapper anotherId) {
        if (anotherId != null) {
            return supports(anotherId.toString());
        }
        return false;
    }

    /**
     * Determines if the given editor id is supported by this definition.
     * 
     * @param anotherEditorId
     *            the id to look for.
     * @return true if the editor is supported, false if not.
     */
    public boolean supports(final String anotherEditorId) {
        return editorId.equals(new EditorIdWrapper(anotherEditorId));
    }

    // --------------------------------------------------------------------------

    /**
     * Parse a new definition from an input string created by a toSerialString()
     * call.
     * 
     * @param input
     *            the input string
     * @return the parsed object
     */
    public static EditorDefinition fromString(final String input) {
        EditorDefinition result = null;
        if (input != null) {
            String nameString = Tools.getValue(Tools.EDITOR_NAME_NAME, input);
            String idString = Tools.getValue(Tools.EDITOR_ID_NAME, input);

            if (nameString != null && idString != null) {
                EditorIdWrapper wrapper = new EditorIdWrapper(idString);

                result = new EditorDefinition(nameString, wrapper);
            }
        }
        return result;
    }

    /**
     * Construct a String for Serialization.
     * 
     * @return the string
     */
    public String toSerialString() {
        String nameString = Tools.putValue(Tools.EDITOR_NAME_NAME, name);
        String id = Tools.putValue(Tools.EDITOR_ID_NAME, editorId.toString());
        return nameString + id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return name + " (" + editorId + ")";
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public int compareTo(final EditorDefinition o) {
        int result = Integer.MIN_VALUE;
        if (o != null) {
            result = this.editorId.compareTo(o.editorId);
            if (result == 0) {
                result = this.name.compareTo(o.name);
            }
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(final Object o) {
        if (o != null && o instanceof EditorDefinition) {
            return compareTo((EditorDefinition) o) == 0;
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return editorId.hashCode();
    }
}
