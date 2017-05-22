/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.benchmark.common

import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.IModelsRepositoryTest
import de.cau.cs.kieler.test.common.repository.TestModelData
import org.bson.Document
import org.eclipse.emf.ecore.EObject

/**
 * An abstract {@link IModelsRepositoryTest} which automatically parses XText models.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
abstract class AbstractXTextModelBenchmark<T extends EObject> implements IBenchmark {
    
    /** Reusage of model parsing */
    extension AbstractXTextModelRepositoryTest<T> = new AbstractXTextModelRepositoryTest<T>() {
        
        override filter(TestModelData modelData) {
            throw new UnsupportedOperationException("Delegate Instance")
        }
        
    }
    
    /** The loaded Model */
    protected var T model;
    
    // -----------------------------------------------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    override prepare(TestModelData data) {
        // Load benchmark model
        model = loadModel(data)
    }
    
    /**
     * {@inheritDoc}
     */
    override Document perform(TestModelData data) {
        return perform(model, data)
    }    
    
    /**
     * Perform the benchmark on the model.
     */
    abstract def Document perform(T model, TestModelData data)
}
	