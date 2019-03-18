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
package de.cau.cs.kieler.scg.processors.transformators.codegen.promela

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
 * Promela Code Processor
 * 
 * @author aas
 * 
 */
class PromelaCodeGenerator extends AbstractCodeGenerator<SCGraphs, SCGraph> {
    
    @Inject extension PragmaExtensions
    @Inject Injector injector
    
    public static val IProperty<Boolean> DEBUG_COMMENTS = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.codegen", false)
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.codegen.promela"
    }
    
    override getName() {
        "Promela Code"
    }
    
    override createModuleMap(SCGraphs rootModel, Map<SCGraph, CodeGeneratorModule<SCGraphs, SCGraph>> moduleMap) {
        for (scg : rootModel.scgs) {
            val parent = null
            val namingProperty = null
            val generatorModule = createCodeGenetatorModule.configure("", rootModel, scg, this, moduleMap, scg.name, parent, namingProperty)
            moduleMap.put(scg, generatorModule)
            generatorModule.suffix = hostcodeSafeName(scg.name)
        }
    }
    
    override preProcess(SCGraphs rootModel) {
        if (rootModel.hasPragma("debug")) {
            environment.setProperty(DEBUG_COMMENTS, true)
        }
    }
    
    override createCodeGenetatorModule() {
        return injector.getInstance(PromelaCodeGeneratorModule)
    }

}

