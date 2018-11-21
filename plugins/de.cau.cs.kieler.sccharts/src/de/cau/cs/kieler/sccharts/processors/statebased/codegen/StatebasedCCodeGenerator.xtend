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
package de.cau.cs.kieler.sccharts.processors.statebased.codegen

import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorModule
import de.cau.cs.kieler.kicool.compilation.codegen.AbstractCodeGenerator
import java.util.Map
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.kicool.environments.AnnotationModel
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property

/**
 * C Code Generator  Processor for the State-based pattern
 * 
 * @author ssm
 * @kieler.design 2018-04-16 proposed 
 * @kieler.rating 2018-04-16 proposed yellow 
 * 
 */
class StatebasedCCodeGenerator extends AbstractCodeGenerator<SCCharts, State> {
    
    public static val IProperty<Boolean> PRINT_DEBUG_ENABLED = 
       new Property<Boolean>("de.cau.cs.kieler.kicool.codegen.statebased.printDebug", false)    
    
    public static val IProperty<Boolean> LEAN_MODE = 
       new Property<Boolean>("de.cau.cs.kieler.kicool.codegen.statebased.leanMode", false)    
    
    @Accessors(PUBLIC_GETTER) var AnnotationModel<SCCharts> annotationModel
    @Accessors(PUBLIC_GETTER) var AnnotationModel<SCCharts> annotationModelStates 
    @Accessors(PUBLIC_GETTER) var AnnotationModel<SCCharts> annotationModelStatesAndRegions  
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.codegen.statebased"
    }
    
    override getName() {
        "State-based C Code"
    }
    
    override preProcess(SCCharts rootModel) {
        annotationModel = rootModel.createAnnotationModel
        annotationModelStates = rootModel.createAnnotationModel
        annotationModelStatesAndRegions = rootModel.createAnnotationModel
    }
    
    override createModuleMap(SCCharts rootModel, Map<State, CodeGeneratorModule<SCCharts, State>> moduleMap) {
        for (rootState : rootModel.rootStates) {
            val generatorModule = createCodeGenetatorModule.configure("", rootModel, rootState, this, moduleMap, rootState.name, null)
            moduleMap.put(rootState, generatorModule)
            generatorModule.suffix = hostcodeSafeName(rootState.name)
            (generatorModule as StatebasedCCodeGeneratorModule).printDebug = environment.getProperty(PRINT_DEBUG_ENABLED)
            (generatorModule as StatebasedCCodeGeneratorModule).leanMode = environment.getProperty(LEAN_MODE)
        }
    }
    
    override def createCodeGenetatorModule() {
        return injector.getInstance(StatebasedCCodeGeneratorModule)
    }
    
    
}
