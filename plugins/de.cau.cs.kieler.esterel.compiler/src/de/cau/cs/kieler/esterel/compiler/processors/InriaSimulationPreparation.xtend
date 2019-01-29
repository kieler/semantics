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
package de.cau.cs.kieler.esterel.compiler.processors

import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.compilation.VariableStore
import com.google.inject.Inject
import de.cau.cs.kieler.esterel.extensions.EsterelExtensions
import static de.cau.cs.kieler.kicool.compilation.VariableStore.*
import de.cau.cs.kieler.kicool.deploy.processor.TemplateEngine
import de.cau.cs.kieler.kicool.deploy.CommonTemplateVariables

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class InriaSimulationPreparation extends InplaceProcessor<EsterelProgram> {
    
    @Inject
    extension EsterelExtensions

    override getId() {
        "de.cau.cs.kieler.esterel.compiler.inria.simulation.preparation"
    }

    override getName() {
        "Generate Inria Simulation Preparation"
    }

    override process() {
        
        // Model name
        var templateEnv = environment.getProperty(TemplateEngine.GENRAL_ENVIRONMENT)?:newHashMap
        templateEnv.put(CommonTemplateVariables.MODEL_DATA_NAME, model.modules.head.name)
        environment.setProperty(TemplateEngine.GENRAL_ENVIRONMENT, templateEnv)

        // Init store
        val store = VariableStore.getVariableStore(environment)
        model.modules.head.signalDeclarations.forEach [
            val props = newArrayList(SIGNAL)
            if(isInput) props += INPUT
            if(isOutput) props += OUTPUT
            signals.forEach[store.update(it, props).type = it.type]
        ]

    }
}
