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

import java.util.LinkedList;
import java.util.List;

/**
 * This is a Wrapper for a list of KiCoModelWrapper because KLighD does not support diagram
 * synthesis on Lists properly.
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
public class KiCoModelChain {

    private final List<KiCoModelWrapper> models = new LinkedList<KiCoModelWrapper>();    

    /**
     * Standard Constructor
     */
    public KiCoModelChain() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    /**
     * @return list of models in chain
     */
    public List<KiCoModelWrapper> getModels() {
        return models;
    }

    /**
     * @return selected model
     */
    public Object getSelectedModel() {
        //TODO implement selection detection
        return models.get(models.size() - 1).getModel();
    }

}
