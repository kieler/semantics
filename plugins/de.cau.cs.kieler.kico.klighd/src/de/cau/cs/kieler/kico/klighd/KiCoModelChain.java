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
 * @author als
 * 
 */
public class KiCoModelChain {

    private final List<Object> models;
    private final List<String> labels;
    private final List<String> edgeLabels;

    /**
     * @param edgeLabels
     * @param labels
     * @param models
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
            // fill with nulls
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
            // fill with nulls
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
