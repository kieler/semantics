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
package de.cau.cs.kieler.kicool.deploy

import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import java.util.List
import java.util.Map
import de.cau.cs.kieler.kicool.environments.Environment

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class TemplateInjection {
    
    // Environment properties
    public static val IProperty<List<String>> INCLUDES = 
        new Property<List<String>>("de.cau.cs.kieler.kicool.deploy.template.injection.includes", null)
        
    public static val IProperty<Map<String, List<String>>> MACROS = 
        new Property<Map<String, List<String>>>("de.cau.cs.kieler.kicool.deploy.template.injection.macros", null)
        
    // Utility methods
    static def addIncludeInjection(Environment env, String includeFile) {
        val includes = env.getProperty(INCLUDES)?:newArrayList
        env.setProperty(INCLUDES, includes)
        includes += includeFile
    }
    
    static def addMacroInjection(Environment env, TemplatePosition position, String macroName) {
        addMacroInjection(env, position.position, macroName)
    }
    
    static def addMacroInjection(Environment env, String position, String macroName) {
        val macroMap = env.getProperty(MACROS)?:newHashMap
        env.setProperty(MACROS, macroMap)
        val macros = macroMap.get(position)?:newArrayList
        macroMap.put(position, macros)
        macros += macroName        
    }
    
    static def registerTemplateInjection(Map<String, Object> templateEnv, Environment env) {
        val includes = env.getProperty(INCLUDES)?:newArrayList
        includes.removeIf[nullOrEmpty]
        templateEnv.put(CommonTemplateVariables.INJECTION_INCLUDES, includes)
        
        val macroMap = env.getProperty(MACROS)?:newHashMap
        macroMap.entrySet.removeIf[key.nullOrEmpty || value === null || value.empty]
        templateEnv.put(CommonTemplateVariables.INJECTION_MACROS, macroMap)
    }
}
