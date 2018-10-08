/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.internal.processor

import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.simulation.DataPool
import de.cau.cs.kieler.simulation.SimulationContext

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
abstract class SimulationProcessor extends InplaceProcessor<DataPool> {
    
    public def getSimulationContext() {
        compilationContext as SimulationContext
    }
    
    public def getDataPool() {
        targetModel
    }
}