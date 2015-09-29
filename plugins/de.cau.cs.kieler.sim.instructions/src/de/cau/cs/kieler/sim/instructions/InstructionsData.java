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

import org.eclipse.emf.ecore.EObject;

/**
 * The class TableData implements a single data entry that represents a variable or signal within
 * the data table. If it is a signal, then it can be present or absent. An entry always contains of
 * a key and a value String expression.
 * 
 * @author cmot
 * @kieler.design proposed 2013-02-28
 * @kieler.rating proposed 2013-02-28 yellow
 */
public class InstructionsData {

    /** The name. */
    private String name = "";

    /** The label. */
    private String label = "";

    /** The prio. */
    private String prio = "";

    /** The e object. */
    private EObject eObject = null;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new instructions data.
     * 
     * @param name
     *            the name
     * @param label
     *            the label
     * @param prio
     *            the prio
     * @param eObject
     *            the e object
     */
    public InstructionsData(final String name, final String label, final String prio,
            final EObject eObject) {
        this.name = name;
        this.label = label;
        this.prio = prio;
        this.eObject = eObject;
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new instructions data.
     * 
     * @param name
     *            the name
     * @param label
     *            the label
     * @param prio
     *            the prio
     */
    public InstructionsData(final String name, final String label, final String prio) {
        this.name = name;
        this.label = label;
        this.prio = prio;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the instructions name.
     * 
     * @param name
     *            the new instructions name
     */
    public void setInstructionsName(final String name) {
        this.name = name;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the label.
     * 
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the label.
     * 
     * @param label
     *            the new label
     */
    public void setLabel(final String label) {
        this.label = label;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the prio.
     * 
     * @return the prio
     */
    public String getPrio() {
        return prio;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the prio.
     * 
     * @param prio
     *            the new prio
     */
    public void setPrio(final String prio) {
        this.prio = prio;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the e object.
     * 
     * @return the e object
     */
    public EObject getEObject() {
        return eObject;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the e object.
     * 
     * @param eObjectParam
     *            the new e object
     */
    public void setEObject(final EObject eObjectParam) {
        this.eObject = eObjectParam;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public String toString() {
        String ret = "instruction name: " + this.name + ", label: " + this.label + ", prio: "
                + this.prio;
        return ret;
    }

    // -------------------------------------------------------------------------
}
