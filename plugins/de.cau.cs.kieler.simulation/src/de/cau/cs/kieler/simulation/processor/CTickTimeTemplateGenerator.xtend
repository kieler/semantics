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

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.CCodeFile
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.deploy.CommonTemplateVariables
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.deploy.processor.AbstractTemplateGeneratorProcessor
import de.cau.cs.kieler.kicool.deploy.processor.TemplateEngine

import static extension de.cau.cs.kieler.kicool.deploy.TemplateInjection.*
import static extension de.cau.cs.kieler.kicool.deploy.TemplatePosition.*
import de.cau.cs.kieler.kexpressions.ValueType

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class CTickTimeTemplateGenerator extends AbstractTemplateGeneratorProcessor<Object> {
    
    public static val IProperty<Boolean> PRINT_TIME = 
        new Property<Boolean>("de.cau.cs.kieler.simulation.ticktime.print", false)  

    public static val FILE_NAME = "c-ticktime.ftl" 

    override getId() {
        "de.cau.cs.kieler.simulation.c.ticktime"
    }
    
    override getName() {
        "Generate C Tick Time Template"
    }
    
    override generateTemplate() {
        // Generate template
        logger.println("Generating tick time measuring code")
        
        // Register tick time variable for simulation communication
        val store = VariableStore.getVariableStore(environment)
        store.add("#ticktime", "ticktime") => [
            externalName = "_ticktime"
            type = ValueType.FLOAT
        ]
        
        val cc = new CodeContainer
        val code = 
            '''
            <#macro ticktime_imports position>            
            #include "lib/ticktime.h"
            </#macro>

            <#macro ticktime_decl position>
            double _ticktime;
            </#macro>
            
            <#macro ticktime_reset position>
            resetticktime();
            </#macro>
            
            <#macro ticktime_store position>
            _ticktime = getticktime();
            </#macro>
            
            <#macro ticktime_print position>
            printf("Tick: %d ns\n", _ticktime);
            </#macro>
            '''
        
        cc.add(FILE_NAME, code)
        
        environment.addIncludeInjection(FILE_NAME.relativeTemplatePath)
        environment.addMacroInjection(HEADER, "ticktime_imports")
        environment.addMacroInjection(GLOBAL_DECLARATION, "ticktime_decl")
        environment.addMacroInjection(PRE_TICK, "ticktime_reset")
        environment.addMacroInjection(POST_TICK, "ticktime_store")
        if (environment.getProperty(PRINT_TIME)) {
            environment.addMacroInjection(OUTPUT, "ticktime_print")
        }
        
        return cc
    }
}