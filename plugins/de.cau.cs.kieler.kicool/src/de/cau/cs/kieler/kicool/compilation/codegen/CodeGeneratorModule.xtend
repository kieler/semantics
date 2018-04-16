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
package de.cau.cs.kieler.kicool.compilation.codegen

import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorModule
import de.cau.cs.kieler.kicool.compilation.Processor
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Map
import de.cau.cs.kieler.kicool.compilation.CodeContainer

/**
 * CodeGeneratorModule allows specific configuration for SCG code generators.
 * T is the root object (e.g. SCGraphs).
 * E is the sub element important for the specific code generator module (e.g. SCGraph).
 * 
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
abstract class CodeGeneratorModule<T, E> extends AbstractCodeGeneratorModule {
    
    @Accessors var T rootObject
    @Accessors var E moduleObject
    @Accessors var Processor<T, CodeContainer> processorInstance
    @Accessors var Map<E, CodeGeneratorModule<T, E>> codeGeneratorModuleMap
    @Accessors var String codeFilename
    @Accessors var CodeGeneratorModule<T, E> parent
    
    def CodeGeneratorModule<T, E> configure(String baseName, T rootObject, E moduleObject, Processor<T, CodeContainer> processorInstance, 
        Map<E, CodeGeneratorModule<T, E>> codeGeneratorModuleMap, String codeFilename, CodeGeneratorModule<T, E> parent
    ) {
        this.baseName = baseName
        this.rootObject = rootObject
        this.moduleObject = moduleObject
        this.processorInstance = processorInstance
        this.codeGeneratorModuleMap = codeGeneratorModuleMap
        this.codeFilename = codeFilename 
        this.parent = parent
        
        configure
        
        return this
    }
    
    def void configure() {
        // override for convenient user defined configurations.
    }
    
    /**
     * This method is invoked when the code generation is invoked.
     * All init methods of all generator modules are invoked before the mail generate methods are called.
     */
    abstract def void generateInit()
    
    /**
     * The main generate method. Its purpose depends on the job of the generator module. 
     */
    abstract def void generate()
    
    /** The done methods are called after all generator modules finish there main generator module. */
    abstract def void generateDone()
    
    
    def void generateWrite(CodeContainer codeContainer) {
        codeContainer.add(codeFilename, code.toString)
    }
    
}