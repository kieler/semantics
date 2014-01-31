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
import de.cau.cs.kieler.ktm.transformationtree.impl.ModelWrapperImpl;

/**
 * A fake ModelWrapper which is a ModelWrapperImpl but only delegates to a real ModelWrapper.
 * 
 * Its propose is to reuse synthesis of ModelWrapper to trigger a different systhsis type based on a
 * instanceof test.
 * 
 * @author als
 * 
 */
public class EObjectSynthesisModelWrapperWrapper extends ModelWrapperImpl {
    final ModelWrapper modelWrapper;

    /**
     * @param modelWrapper
     */
    public EObjectSynthesisModelWrapperWrapper(ModelWrapper modelWrapper) {
        super();
        this.modelWrapper = modelWrapper;
    }

    /**
     * @return the modelWrapper
     */
    public ModelWrapper getModelWrapper() {
        return modelWrapper;
    }

}
