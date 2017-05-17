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

import com.google.common.collect.HashMultimap
import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.IModelsRepositoryTest
import de.cau.cs.kieler.test.common.repository.TestModelData
import java.util.List
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
    
    /** Global resource set relations */
    static val modelSets = HashMultimap.<String, TestModelData>create
    /** The loaded Model */
    protected var T model;
    
    // -----------------------------------------------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    override filter(List<TestModelData> data) {
        // Statically save resource sets
        if (modelSets.empty) {
            data.filter[!resourceSetID.nullOrEmpty].forEach[modelSets.put(resourceSetID, it)]
        }
        // Perform filter
        return data.filter[filter(it)].toList
    }
    
    /**
     * Filter for selecting the models to perform benchmarks with.
     */
    abstract def boolean filter(TestModelData data)
    
    /**
     * {@inheritDoc}
     */
    override prepare(TestModelData data) {
        // Load referenced models
        if (!data.resourceSetID.nullOrEmpty) {
            for (relatedData : modelSets.get(data.resourceSetID).filter[it != data]) {
                loadModel(relatedData)
            }
        }
        // Load benchmark model
        model = loadModel(data)
    }
    
}
	