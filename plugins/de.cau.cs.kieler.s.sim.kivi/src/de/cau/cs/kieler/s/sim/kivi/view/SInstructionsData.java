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

import org.eclipse.emf.ecore.EObject;

/**
 * The class TableData implements a single data entry that represents a variable or signal within
 * the data table. If it is a signal, then it can be present or absent. An entry always contains of
 * a key and a value String expression.
 * 
 * @author cmot
 */
public class SInstructionsData {

    /** The parent TableDataList the entry contains to. */
    private SInstructionsDataList sInstructionsDataList;

    private String name = "";
    private String label = "";
    private String prio = "";
    private EObject eObject = null;

    
    /**
     * Instantiates a new SJInstructionsData entry.
     * 
     * @param parentSJInstructionsDataList
     *            the parent SJInstructionsDataList
     */
    public SInstructionsData(final SInstructionsDataList parentSInstructionsDataList) {
        this.sInstructionsDataList = parentSInstructionsDataList;
    }


    
    /**
     * @param parentSJInstructionsDataList 
     * @param instructionsName 
     * @param label 
     * @param prio 
     * @param param 
     * @param retval 
     * @param initialExecution 
     */
    public SInstructionsData(final SInstructionsDataList parentSInstructionsDataList,
            final String name, final String label, final String prio,
            final EObject eObject) {
        this.sInstructionsDataList = parentSInstructionsDataList;
        this.name = name;
        this.label = label;
        this.prio = prio;
        this.eObject = eObject;
    }


    


    
    /**
     * @param parentSJInstructionsDataList 
     * @param instructionsName 
     * @param label 
     * @param prio 
     */
    public SInstructionsData(final SInstructionsDataList parentSInstructionsDataList,
            final String name, final String label, final String prio) {
        this.sInstructionsDataList = parentSInstructionsDataList;
        this.name = name;
        this.label = label;
        this.prio = prio;
    }



    /**
     * Gets the parent SJInstructionsDataList.
     * 
     * @return the parent SJInstructionsDataList
     */
    public SInstructionsDataList getParentSInstructionsDataList() {
        return sInstructionsDataList;
    }



    /**
     * @return String 
     */
    public String getName() {
        return name;
    }


    
    /**
     * @param instructionsName 
     */
    public void setInstructionsName(final String name) {
        this.name = name;
    }


    
    /**
     * @return String 
     */
    public String getLabel() {
        return label;
    }


    
    /**
     * @param label 
     */
    public void setLabel(final String label) {
        this.label = label;
    }


    
    /**
     * @return prio 
     */
    public String getPrio() {
        return prio;
    }


    
    /**
     * @param prio 
     */
    public void setPrio(final String prio) {
        this.prio = prio;
    }




    /**
     * @return EObject 
     */
    public EObject getEObject() {
        return eObject;
    }


    
    /**
     * @param param 
     */
    public void setEObject(final EObject eObject) {
        this.eObject = eObject;
    }






    /**
     * {@inheritDoc}
     */
    public String toString() {
        String ret = "instruction name: " + this.name + ", label: " + this.label
        + ", prio: " + this.prio;
        return ret;
    }

}