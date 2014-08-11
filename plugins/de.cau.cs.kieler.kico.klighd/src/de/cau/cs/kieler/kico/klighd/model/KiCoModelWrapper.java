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
package de.cau.cs.kieler.kico.klighd.model;

/**
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 *
 */
public class KiCoModelWrapper {
    
    /** The model */
    private final Object model;
    /** label of parent node */
    private String label = null;
    /** labels of edge between parent nodes of models */
    private String edgeLabel = null;
    /** collapse state of parent node */
    private boolean collapsed = true;
    
    /**
     * @param model
     */
    public KiCoModelWrapper(Object model) {
        super();
        this.model = model;
    }
    
    /**
     * @param model
     * @param label
     * @param edgeLabel
     * @param collapsed
     */
    public KiCoModelWrapper(Object model, String label, String edgeLabel, boolean collapsed) {
        super();
        this.model = model;
        this.label = label;
        this.edgeLabel = edgeLabel;
        this.collapsed = collapsed;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return the edgeLabel
     */
    public String getEdgeLabel() {
        return edgeLabel;
    }

    /**
     * @param edgeLabel the edgeLabel to set
     */
    public void setEdgeLabel(String edgeLabel) {
        this.edgeLabel = edgeLabel;
    }

    /**
     * @return the collapsed
     */
    public boolean isCollapsed() {
        return collapsed;
    }

    /**
     * @param collapsed the collapsed to set
     */
    public void setCollapsed(boolean collapsed) {
        this.collapsed = collapsed;
    }

    /**
     * @return the model
     */
    public Object getModel() {
        return model;
    }   
    
}
