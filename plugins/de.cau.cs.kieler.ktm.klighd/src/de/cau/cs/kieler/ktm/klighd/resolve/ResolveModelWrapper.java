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
package de.cau.cs.kieler.ktm.klighd.resolve;

import de.cau.cs.kieler.ktm.transformationtree.ModelWrapper;

/**
 * @author als
 * 
 */
public class ResolveModelWrapper {
    private final ModelWrapper sourceModel;
    private final ModelWrapper targetModel;

    /**
     * @param sourceModel
     * @param targetModel
     */
    public ResolveModelWrapper(final ModelWrapper sourceModel, final ModelWrapper targetModel) {
        super();
        this.sourceModel = sourceModel;
        this.targetModel = targetModel;
    }

    /**
     * @return the sourceModel
     */
    public ModelWrapper getSourceModel() {
        return sourceModel;
    }

    /**
     * @return the targetModel
     */
    public ModelWrapper getTargetModel() {
        return targetModel;
    }

}
