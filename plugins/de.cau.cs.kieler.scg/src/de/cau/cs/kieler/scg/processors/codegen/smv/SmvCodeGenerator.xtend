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
package de.cau.cs.kieler.scg.processors.codegen.smv

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.codegen.AbstractCodeGenerator
import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorModule
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import java.util.Map

/**
 * SMV Code Processor
 * 
 * @author aas
 * 
 */
class SmvCodeGenerator extends AbstractCodeGenerator<SCGraphs, SCGraph> {
    
    @Inject extension PragmaExtensions
    @Inject Injector injector
    
    public static val IProperty<Boolean> DEBUG_COMMENTS = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.codegen", false)
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.codegen.smv"
    }
    
    override getName() {
        "SMV Code"
    }
    
    override createModuleMap(SCGraphs rootModel, Map<SCGraph, CodeGeneratorModule<SCGraphs, SCGraph>> moduleMap) {
        for (scg : rootModel.scgs) {
            val namingProperty = null
            val parent = null
            val generatorModule = createCodeGeneratorModule.configure("", rootModel, scg, this, moduleMap, scg.name, parent, namingProperty)
            moduleMap.put(scg, generatorModule)
            generatorModule.suffix = hostcodeSafeName(scg.name)
        }
    }
    
    override preProcess(SCGraphs rootModel) {
        if (rootModel.hasPragma("debug")) {
            environment.setProperty(DEBUG_COMMENTS, true)
        }
    }
    
    override createCodeGeneratorModule() {
        val module = injector.getInstance(SmvCodeGeneratorModule)
        return module
    }
    
}

