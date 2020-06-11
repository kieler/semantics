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
package de.cau.cs.kieler.simulation.processor

import de.cau.cs.kieler.kicool.compilation.ExecutableContainer
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.deploy.Logger
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.SimulationModelWrapper

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SimulationContextBuilder extends Processor<ExecutableContainer, SimulationContext> {

    override getId() {
        "de.cau.cs.kieler.simulation.context.build"
    }
    
    override getName() {
        "Simulation Builder"
    }
    
    override getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    protected val logger = new Logger
    
    override process() {
        // new context
        val simCtx = new SimulationContext(compilationContext, environment)
        val simModel = new SimulationModelWrapper(sourceModel, environment)
        simCtx.addModel(simModel)
        
        model = simCtx
    }
    
}