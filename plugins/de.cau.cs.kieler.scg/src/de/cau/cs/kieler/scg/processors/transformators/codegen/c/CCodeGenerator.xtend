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

import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions

/**
 * C Code Processor
 * 
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
class CCodeGenerator extends Processor<SCGraphs, CodeContainer> {
    
    @Inject extension AnnotationsExtensions
    @Inject Injector injector
    
    public static val IProperty<Boolean> DEBUG_COMMENTS = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.transformators.codegen", false)
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.codegen.c"
    }
    
    override getName() {
        "C Code"
    }
    
    override getType() {
        ProcessorType.TRANSFORMATOR
    }
    
    override process() {
        val graphs = getModel
        val result = new CodeContainer
        
        if (graphs.hasPragma("debug")) {
            environment.setProperty(DEBUG_COMMENTS, true)
        }
        
        // Create a c code generator module for each SCG.
        val scgModuleMap = <SCGraph, SCGCodeGeneratorModule> newHashMap
        for (scg : graphs.scgs) {
            val generatorModule = injector.getInstance(CCodeGeneratorModule).configure("", graphs, scg, this, scgModuleMap, null)
            scgModuleMap.put(scg, generatorModule)
            generatorModule.suffix = hostcodeSafeName(scg.name)
        }
        
        for (scg : graphs.scgs) {
            scgModuleMap.get(scg) => [
                generateInit
            ]
        }
        for (scg : graphs.scgs) {
            scgModuleMap.get(scg) => [
                generate
            ]
        }
        for (scg : graphs.scgs) {
            scgModuleMap.get(scg) => [
                generateDone
                result.add(code.toString)
            ]
        }
        
        setModel(result)
    }
    
    protected def hostcodeSafeName(String string) {
        if (string == null) return ""
        string.replaceAll("[\\s-]","_")
    }

}

