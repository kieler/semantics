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

import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorModule
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Map
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.annotations.registry.PragmaRegistry
import de.cau.cs.kieler.annotations.StringPragma
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.annotations.Pragmatable
import de.cau.cs.kieler.kicool.compilation.VariableStore

/**
 * Abstract Code Generation Processor
 * 
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
abstract class AbstractCodeGenerator<T, E> extends Processor<T, CodeContainer> {
    
    @Inject extension PragmaExtensions
    
    @Inject protected Injector injector
    
    public static val IProperty<Boolean> COMMENTS_ENABLED = 
       new Property<Boolean>("de.cau.cs.kieler.kicool.code.comments.enabled", true)
       
    public static val IProperty<String> CODE_NAMING_MAGIC = 
       new Property<String>("de.cau.cs.kieler.kicool.code.naming.magic", "")
    public static val IProperty<String> TICK_FUNCTION_NAME = 
       new Property<String>("de.cau.cs.kieler.kicool.code.functions.tick", "tick")
    public static val IProperty<String> RESET_FUNCTION_NAME = 
       new Property<String>("de.cau.cs.kieler.kicool.code.functions.reset", "reset")
    public static val IProperty<String> LOGIC_FUNCTION_NAME = 
       new Property<String>("de.cau.cs.kieler.kicool.code.functions.logic", "logic")
    public static val IProperty<String> TICKDATA_STRUCT_NAME = 
       new Property<String>("de.cau.cs.kieler.kicool.code.structs.tickdata", "TickData")
       
    public static val PRAGMA_CODE_NAMING = PragmaRegistry.register("code.naming", StringPragma, 
        "Pragma that specifies the way the code generation creates the main functions and structures.")
        
    public static val PRAGMA_CODE_NAMING_MAGIC_PREFIX = "prefix"
    public static val PRAGMA_CODE_NAMING_MAGIC_SUFFIX = "suffix"
    
    @Accessors(PUBLIC_GETTER) val moduleMap = <E, CodeGeneratorModule<T, E>> newHashMap
    
    override getType() {
        ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    abstract def void createModuleMap(T rootModel, Map<E, CodeGeneratorModule<T, E>> moduleMap)
    
    def void preProcess(T rootModel) {
        // Override for convenient additions...
    }
        
    override process() {
        val rootModel = getModel
        val result = new CodeContainer
        
        preProcess(rootModel);
        
        if (rootModel instanceof Pragmatable) {
            rootModel.processCustomNaming
        }
        
        createModuleMap(rootModel, moduleMap)
        val commentsEnabled = environment.getProperty(COMMENTS_ENABLED)
        
        for (moduleObject : moduleMap.keySet) {
            moduleMap.get(moduleObject) => [
                generateInit
            ]
        }
        for (moduleObject : moduleMap.keySet) {
            moduleMap.get(moduleObject) => [
                generate
            ]
        }
        for (moduleObject : moduleMap.keySet) {
            moduleMap.get(moduleObject) => [
                generateDone
            ]
        }
        for (moduleObject : moduleMap.keySet) {
            moduleMap.get(moduleObject) => [
                generateWrite(result)
            ]
        }
        
        setModel(result)
    }
    
    /**
     * Creates a generator module via the injector. 
     * Override this if you need to create specialized generator modules of a certain type.
     */
    protected def CodeGeneratorModule<T, E> createCodeGeneratorModule() {
        return injector.getInstance(CodeGeneratorModule) as CodeGeneratorModule<T, E>
    }
    
    protected def processCustomNaming(Pragmatable pragmatable) {
        if (!pragmatable.hasPragma(PRAGMA_CODE_NAMING)) return;
        
        val naming = pragmatable.getPragma(PRAGMA_CODE_NAMING) as StringPragma

        if (naming.values.size == 4) {
            environment.setProperty(TICK_FUNCTION_NAME, naming.values.head)
            environment.setProperty(RESET_FUNCTION_NAME, naming.values.get(1))
            environment.setProperty(LOGIC_FUNCTION_NAME, naming.values.get(2))
            environment.setProperty(TICKDATA_STRUCT_NAME, naming.values.get(3))    
        } else if (naming.values.size == 1) {
            if (naming.values.head == PRAGMA_CODE_NAMING_MAGIC_PREFIX) {
                environment.setProperty(CODE_NAMING_MAGIC, PRAGMA_CODE_NAMING_MAGIC_PREFIX)    
            } else if (naming.values.head == PRAGMA_CODE_NAMING_MAGIC_SUFFIX) {
                environment.setProperty(CODE_NAMING_MAGIC, PRAGMA_CODE_NAMING_MAGIC_SUFFIX)
            }
        }      
    }
    
    protected def hostcodeSafeName(String string) {
        if (string === null) return ""
        string.replaceAll("[\\s-]","_")
    }

}


