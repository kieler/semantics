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
package de.cau.cs.kieler.kico.klighd;

import java.util.LinkedList;
import java.util.List;

/**
 * Chain of arbitrary models.
 * 
 * @author als
 * 
 */
public class KiCoModelChain {

    /** List of models in chain */
    private final List<Object> models;
    /** List of labels of parent nodes of models */
    private final List<String> labels;
    /** List of labels of edges between parent nodes of models */
    private final List<String> edgeLabels;

    /**
     * Create a chain of models with optional parent nodes with labels and optional edges with
     * labels.
     * <p>
     * All parameters can be null to indicate their absence and thus exclusion in resulting
     * diagrams.
     * 
     * @param edgeLabels
     *            List of labels of edges between parent nodes of models
     * @param labels
     *            List of labels of parent nodes of models
     * @param models
     *            List of models in chain
     * 
     */
    public KiCoModelChain(final List<Object> models, final List<String> labels,
            final List<String> edgeLabels) {
        if (models == null) {
            this.models = new LinkedList<Object>();
        } else {
            this.models = new LinkedList<Object>(models);
        }

        // fix labels
        if (labels == null) {
            this.labels = new LinkedList<String>();
            // fill with nulls to hide resulting diagram parts
            for (int i = 0; i < models.size(); i++) {
                this.labels.add(null);
            }
        } else {
            // copy to prevent side effects on call by reference parameter
            this.labels = new LinkedList<String>(labels);
            // fill up with empty strings
            for (int i = labels.size(); i < models.size(); i++) {
                this.labels.add("");
            }
        }

        // fix edgeLabels
        if (edgeLabels == null || labels == null) {
            this.edgeLabels = new LinkedList<String>();
            // fill with nulls to hide resulting diagram parts
            for (int i = 0; i < models.size(); i++) {
                this.edgeLabels.add(null);
            }
        } else {
            // copy to prevent side effects on call by reference parameter
            this.edgeLabels = new LinkedList<String>(edgeLabels);
            // fill up with empty strings
            for (int i = edgeLabels.size(); i < models.size(); i++) {
                this.edgeLabels.add("");
            }
        }
    }

    /**
     * @return the models
     */
    public List<Object> getModels() {
        return models;
    }

    /**
     * @return the labels
     */
    public List<String> getLabels() {
        return labels;
    }

    /**
     * @return the edgeLabels
     */
    public List<String> getEdgeLabels() {
        return edgeLabels;
    }

}
