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
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Map
import de.cau.cs.kieler.kicool.compilation.CodeContainer

import static de.cau.cs.kieler.kicool.compilation.codegen.AbstractCodeGenerator.*
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.annotations.Nameable
import de.cau.cs.kieler.annotations.Pragmatable
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions

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
    
    @Inject extension PragmaExtensions
    
    @Accessors var T rootObject
    @Accessors var E moduleObject
    @Accessors var AbstractCodeGenerator<T, E> processorInstance            // Also the instance of the code generator
    @Accessors var Map<E, CodeGeneratorModule<T, E>> codeGeneratorModuleMap
    @Accessors var String codeFilename
    @Accessors var CodeGeneratorModule<T, E> parent
    
    @Accessors var String name
    @Accessors(PROTECTED_GETTER) var hasCustomNaming = false
    @Accessors Map<CodeGeneratorNames, String> naming = <CodeGeneratorNames, String> newHashMap
    
    def CodeGeneratorModule<T, E> configure(String baseName, T rootObject, E moduleObject, AbstractCodeGenerator<T, E> processorInstance, 
        Map<E, CodeGeneratorModule<T, E>> codeGeneratorModuleMap, String codeFilename, CodeGeneratorModule<T, E> parent,
        IProperty<String> namingProperty
    ) {
        this.baseName = baseName
        this.rootObject = rootObject
        this.moduleObject = moduleObject
        this.processorInstance = processorInstance
        this.codeGeneratorModuleMap = codeGeneratorModuleMap
        this.codeFilename = codeFilename 
        this.parent = parent
        if (parent !== null) {
            this.commentsEnabled = parent.commentsEnabled
        }
        
        this.name = prefix + baseName + suffix
        if (namingProperty !== null) {
            customNaming(namingProperty)
        }
        
        configure
        
        return this
    }
    
    def void configure() {
        // override for convenient user defined configurations.
    }
    
    override getName() {
        return this.name
    }
    
    protected def getModuleName() {
        if (moduleObject instanceof Nameable) {
            return moduleObject.name
        } else if (moduleObject !== null) {
            return moduleObject.class.name
        } else {
            return ""
        }
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
    
    protected def hostcodeSafeName(String string) {
        if (string === null) return ""
        string.replaceAll("[\\s-]","_")
    }    
    
    protected def customNaming(IProperty<String> namingProperty) {
        var naming = processorInstance.environment.getProperty(namingProperty)
        val namingMagic = processorInstance.environment.getProperty(CODE_NAMING_MAGIC)
        
        if (namingMagic == PRAGMA_CODE_NAMING_MAGIC_PREFIX) {
            naming = moduleName + naming
            hasCustomNaming = true
        } else if (namingMagic == PRAGMA_CODE_NAMING_MAGIC_SUFFIX) {
            naming = naming + moduleName
            hasCustomNaming = true
        }
        
        this.name = naming 
        
        if (rootObject instanceof Pragmatable) {
            if (rootObject.hasPragma(AbstractCodeGenerator.PRAGMA_CODE_NAMING)) {
                hasCustomNaming = true               
            }
        }        
    }    
    
}