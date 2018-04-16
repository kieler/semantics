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
package de.cau.cs.kieler.scg.processors.transformators.codegen.c

import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.SCGraph
import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorModule
import de.cau.cs.kieler.kicool.compilation.codegen.AbstractCodeGenerator
import java.util.Map

/**
 * C Code Processor
 * 
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
class CCodeGenerator extends AbstractCodeGenerator<SCGraphs, SCGraph> {
    
    @Inject extension AnnotationsExtensions
    @Inject Injector injector
    
    public static val IProperty<Boolean> DEBUG_COMMENTS = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.codegen", false)
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.codegen.c"
    }
    
    override getName() {
        "C Code"
    }
    
    override createModuleMap(SCGraphs rootModel, Map<SCGraph, CodeGeneratorModule<SCGraphs, SCGraph>> moduleMap) {
        for (scg : rootModel.scgs) {
            val generatorModule = createCodeGenetatorModule.configure("", rootModel, scg, this, moduleMap, scg.name, null)
            moduleMap.put(scg, generatorModule)
            generatorModule.suffix = hostcodeSafeName(scg.name)
        }
    }
    
    override preProcess(SCGraphs rootModel) {
        if (rootModel.hasPragma("debug")) {
            environment.setProperty(DEBUG_COMMENTS, true)
        }
    }
    
    override def createCodeGenetatorModule() {
        return injector.getInstance(CCodeGeneratorModule)
    }

}

