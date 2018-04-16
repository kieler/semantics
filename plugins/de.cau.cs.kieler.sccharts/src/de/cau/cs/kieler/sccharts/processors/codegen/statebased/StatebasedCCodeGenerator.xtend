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
package de.cau.cs.kieler.sccharts.processors.codegen.statebased

import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorModule
import de.cau.cs.kieler.kicool.compilation.codegen.AbstractCodeGenerator
import java.util.Map
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State

/**
 * C Code Generator  Processor for the State-based pattern
 * 
 * @author ssm
 * @kieler.design 2018-04-16 proposed 
 * @kieler.rating 2018-04-16 proposed yellow 
 * 
 */
class StatebasedCCodeGenerator extends AbstractCodeGenerator<SCCharts, State> {
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.codegen.statebased"
    }
    
    override getName() {
        "State-based C Code"
    }
    
    override createModuleMap(SCCharts rootModel, Map<State, CodeGeneratorModule<SCCharts, State>> moduleMap) {
        for (rootState : rootModel.rootStates) {
            val generatorModule = createCodeGenetatorModule.configure("", rootModel, rootState, this, moduleMap, rootState.name, null)
            moduleMap.put(rootState, generatorModule)
            generatorModule.suffix = hostcodeSafeName(rootState.name)
        }
    }
    
    override def createCodeGenetatorModule() {
        return injector.getInstance(StatebasedCCodeGeneratorModule)
    }
    
    
}
