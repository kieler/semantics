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
 * ResolveModelWrapper contains two ModelWrappers to resolve.
 * 
 * Its propose is to trigger a systhsis of a resolvage of contained ModelWrappers.
 * 
 * @author als
 * 
 */
public class ResolveModelWrapper {
    private final ModelWrapper sourceModel;
    private final ModelWrapper targetModel;

    /**
     * Contruscts a ResolveWrapper for given source and target.
     * 
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
