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
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
abstract class AbstractSingleRunBenchmark implements IBenchmark {
    
    /**
     * {@inheritDoc}
     */
    override iterations() {
        return 1
    }
    
    /**
     * {@inheritDoc}
     */
    override Document calculateResult(Document[] results, TestModelData data) {
        return results.head
    }
    
}