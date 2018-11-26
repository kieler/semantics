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
package de.cau.cs.kieler.kicool.deploy.processor

import com.google.common.collect.HashMultimap
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kicool.compilation.VariableStore

import static de.cau.cs.kieler.kicool.deploy.TemplatePosition.*
import static extension de.cau.cs.kieler.kicool.deploy.TemplateInjection.*

/**
 * @author ssm
 * @kieler.design 2018-11-19 proposed
 * @kieler.rating 2018-11-19 proposed yellow
 */
class MacroAnnotations extends AbstractDeploymentProcessor<Object> {

    public static val FILE_NAME = "arduino-deployment.ftl"
     
    public static val ANNOTATION_MACRO_NAME = "macro"
    
    public static val PARAMETER_VAR_NAME = "varName"
    public static val PARAMETER_VO_NAME = "voName"
    public static val PARAMETER_PARAMETER_NAME = "parameter"

    public static val IProperty<String> STRUCT_ACCESS = 
        new Property<String>("de.cau.cs.kieler.c.struct.access", ".")

    override getId() {
        "de.cau.cs.kieler.kicool.deploy.macroAnnotations"
    }
    
    override getName() {
        "Macro Annotations"
    }
    
    override process() {
        
        val store = VariableStore.getVariableStore(environment)
        val macros = HashMultimap.create        
        
        for (v : store.variables.entries) {
            for( anno : v.value.annotations.filter[ name == ANNOTATION_MACRO_NAME ].filter(StringAnnotation)) {
                val macroName = anno.values.head
                val parameter = <String, Object> newHashMap 
                parameter.put(PARAMETER_VAR_NAME, access + v.key)
                parameter.put(PARAMETER_VO_NAME, v.key)
                // TODO: add other macro parameter to hash map.
                for (par : anno.values.indexed) {
                    parameter.put(PARAMETER_PARAMETER_NAME + par.key, par.value)
                }
                                
                macros.put(macroName, parameter)                 
            }
        }
        
        for (macro : macros.keySet) {
            environment.addMacroInjection(HEADER, macro)
            environment.addMacroInjection(BODY, macro)
            environment.addMacroInjection(GLOBAL_DECLARATION, macro)
            environment.addMacroInjection(INIT, macro)
            environment.addMacroInjection(START_LOOP, macro)
            environment.addMacroInjection(PRE_TICK, macro)
            environment.addMacroInjection(INPUT, macro)
            environment.addMacroInjection(POST_TICK, macro)
            environment.addMacroInjection(OUTPUT, macro)
            environment.addMacroInjection(END_LOOP, macro)
        }
        
        val genEnv = environment.getProperty(TemplateEngine.GENRAL_ENVIRONMENT)?:newHashMap
        genEnv.put("parameters", macros)
        environment.setProperty(TemplateEngine.GENRAL_ENVIRONMENT, genEnv)
    }
    
    private def access() {
        return environment.getProperty(STRUCT_ACCESS)?:STRUCT_ACCESS.^default
    }
    
   
}