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

import de.cau.cs.kieler.test.common.repository.TestModelData
import org.bson.Document

/**
 * Abstract super class for benchmark databases.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
abstract class AbstractBenchmarkDatabase {
    
    /**
     * Stores the results of the given benchmark and the given model.
     * <p>
     * Persisting of the results may only happen when save is invoked.
     */
    abstract def void storeResult(IBenchmark benchmark, TestModelData data, Document result)
    
    /**
     * Saves all results and related data.
     * <p>
     * Should only invoked once after all benchmarks finished.
     */
    def void save()
    
}