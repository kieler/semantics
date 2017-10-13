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
package de.cau.cs.kieler.esterel.benchmark

import de.cau.cs.kieler.benchmark.common.AbstractXTextModelBenchmark
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.test.common.repository.TestModelData

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class EsterelV5Benchmark extends AbstractXTextModelBenchmark<EsterelProgram> {
    
    override getID() {
        return "esterel-v5"
    }
    
    override filter(TestModelData modelData) {
        return modelData.modelProperties.contains("esterel")
    }
    
    override perform(EsterelProgram model, TestModelData data) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
}