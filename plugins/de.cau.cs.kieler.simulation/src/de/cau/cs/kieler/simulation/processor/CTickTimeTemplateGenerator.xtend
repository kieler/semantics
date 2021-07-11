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
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.VariableInformation
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.deploy.processor.AbstractTemplateGeneratorProcessor

import static de.cau.cs.kieler.kicool.deploy.TemplatePosition.*

import static extension de.cau.cs.kieler.kicool.deploy.TemplateInjection.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class CTickTimeTemplateGenerator extends AbstractTemplateGeneratorProcessor<Object> {
    
    public static val IProperty<Boolean> PRINT_TIME = 
        new Property<Boolean>("de.cau.cs.kieler.simulation.ticktime.print", false)      
    public static val IProperty<Boolean> BARRIER = 
        new Property<Boolean>("de.cau.cs.kieler.simulation.ticktime.barrier", false)    
    public static val IProperty<Boolean> WARM_UP = // Only works with standard tick interfaces
        new Property<Boolean>("de.cau.cs.kieler.simulation.ticktime.warmup", false)

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
            codeAssociation += VariableInformation.WILDCARD_CODE_ASSOCITAION
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
            «IF BARRIER.property»
                __asm__ __volatile__("" ::: "memory"); // Compiler barrier
                __sync_synchronize(); // HW barrier
            «ENDIF»
            resetticktime();
            «IF BARRIER.property»
                __sync_synchronize();
                __asm__ __volatile__("" ::: "memory");
            «ENDIF»
            </#macro>
            
            <#macro ticktime_store position>
            «IF BARRIER.property»
                __asm__ __volatile__("" ::: "memory"); // Compiler barrier
                __sync_synchronize(); // HW barrier
            «ENDIF»
            _ticktime = getticktime();
            «IF BARRIER.property»
                __sync_synchronize();
                __asm__ __volatile__("" ::: "memory");
            «ENDIF»
            </#macro>
            
            «IF PRINT_TIME.property»
                <#macro ticktime_print position>
                printf("Tick: %d ns\n", _ticktime);
                </#macro>
            «ENDIF»
            
            «IF WARM_UP.property»
                <#macro ticktime_warmup position>
                // Warm up
                ${tick_name}(&${tickdata_name});
                ${reset_name}(&${tickdata_name});
                </#macro>
            «ENDIF»
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
        if (environment.getProperty(WARM_UP)) {
            environment.addMacroInjection(INIT, "ticktime_warmup")
        }
        
        return cc
    }
}