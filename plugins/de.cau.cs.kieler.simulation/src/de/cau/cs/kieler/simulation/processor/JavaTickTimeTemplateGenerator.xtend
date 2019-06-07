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
package de.cau.cs.kieler.simulation.processor

import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.deploy.processor.AbstractTemplateGeneratorProcessor

import static de.cau.cs.kieler.kicool.deploy.TemplatePosition.*

import static extension de.cau.cs.kieler.kicool.deploy.TemplateInjection.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class JavaTickTimeTemplateGenerator extends AbstractTemplateGeneratorProcessor<Object> {
    
    public static val FILE_NAME = "java-ticktime.ftl" 
    
    override getId() {
        "de.cau.cs.kieler.simulation.java.ticktime"
    }
    
    override getName() {
        "Generate Java Tick Time Template"
    }
    
    override generateTemplate() {
        // Generate template
        logger.println("Generating tick time measuring code")
        
        // Register tick time variable for simulation communication
        val store = VariableStore.getVariableStore(environment)
        store.add("#ticktime", "ticktime") => [
            externalName = "_ticktime"
            type = ValueType.INT
        ]
        
        val cc = new CodeContainer
        val code = 
            '''
            <#macro ticktime_decl position>
            private static long _tickstart;
            private static long _ticktime;
            </#macro>
            
            <#macro ticktime_reset position>
            _tickstart = System.nanoTime();
            </#macro>
            
            <#macro ticktime_store position>
            _ticktime = System.nanoTime() - _tickstart;
            </#macro>
            
            <#macro ticktime_print position>
            println("Tick: %d ns", _ticktime);
            </#macro>
            '''
        
        cc.add(FILE_NAME, code)
        
        environment.addIncludeInjection(FILE_NAME.relativeTemplatePath)
        environment.addMacroInjection(GLOBAL_DECLARATION, "ticktime_decl")
        environment.addMacroInjection(PRE_TICK, "ticktime_reset")
        environment.addMacroInjection(POST_TICK, "ticktime_store")
        if (environment.getProperty(CTickTimeTemplateGenerator.PRINT_TIME)) {
            environment.addMacroInjection(OUTPUT, "ticktime_print")
        }
        
        return cc
    }
    
}