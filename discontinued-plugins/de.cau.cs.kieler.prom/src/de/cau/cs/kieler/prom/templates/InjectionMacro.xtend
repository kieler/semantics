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
package de.cau.cs.kieler.prom.templates

import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Class to define macros that will insert their content as part of a given phase. 
 */
class InjectionMacro {
    /**
     * The name for the macro
     */
    @Accessors(PUBLIC_GETTER)
    private var String name
    
    /**
     * The phase in which the content of this macro should be used
     */
    private var CodeGenerationPhase phase
    
    /**
     * Constructor.
     * 
     * @param name The name
     * @param phase The phase
     */
    new(String name, CodeGenerationPhase phase) {
        this.name = name
        this.phase = phase
    }
    
    /**
     * The definition of this assignment macro for the FreeMarker template engine.
     * 
     * @return the FreeMarker definition of this assignment macro
     */
    def getFreeMarkerDefinition() '''
        <#macro «name»>
            <#if phase=='«phase.name»'>
                <#nested />
            </#if>
        </#macro>
    '''
}