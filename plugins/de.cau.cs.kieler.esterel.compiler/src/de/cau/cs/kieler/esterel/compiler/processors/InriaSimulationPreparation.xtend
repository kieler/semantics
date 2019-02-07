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
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kicool.compilation.VariableInformation

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class InriaSimulationPreparation extends InplaceProcessor<EsterelProgram> {
    
    public static val ESTEREL_ORIG = "esterel-orig"
    public static val ESTEREL_VIRTUAL = "esterel-virtual"
    
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
        model.modules.head.signalDeclarations.forEach [ decl |
            decl.signals.forEach[
                var props = newArrayList(SIGNAL, ESTEREL_ORIG)
                if(decl.isInput) props += INPUT
                if(decl.isOutput) props += OUTPUT
                store.update(it, props).type = type
                if (type != ValueType.PURE) {
                    val virtual = new VariableInformation
                    virtual.valuedObject = null
                    virtual.type = type
                    virtual.properties += ESTEREL_VIRTUAL
                    if(decl.isInput) virtual.properties += INPUT
                    if(decl.isOutput) virtual.properties += OUTPUT
                    store.variables.put(it.name + "_val", virtual)
                }
            ]
        ]

    }
}
