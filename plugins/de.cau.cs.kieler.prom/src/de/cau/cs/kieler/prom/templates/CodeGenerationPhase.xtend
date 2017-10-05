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

import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Class to define the phases for which wrapper code is used and thus to define which macro calls
 * need to be injected in the template.
 */
class CodeGenerationPhase {
    
    public static val DECLARATION_PHASE = new CodeGenerationPhase("declaration", true, "decl")
    public static val INITIALIZATION_PHASE = new CodeGenerationPhase("initialization", true, "init")
    public static val INPUT_PHASE = new CodeGenerationPhase("input", false)
    public static val OUTPUT_PHASE = new CodeGenerationPhase("output", false)
    public static val RELEASE_PHASE = new CodeGenerationPhase("release", true, "free")
    
    public static val PHASES = newHashSet(DECLARATION_PHASE, INITIALIZATION_PHASE, INPUT_PHASE, OUTPUT_PHASE, RELEASE_PHASE)
    
    /**
     * The unique name of this phase.
     * Used to identify which phase is currently active in the template.
     */
    @Accessors(PUBLIC_GETTER)
    private var String name
    
    /**
     * Defines if the same annotation may be used multiple times in this phase.
     * (e.g. the same annotation should be initialized only once
     * but may be used multiple times: as input and output) 
     */
    @Accessors(PUBLIC_GETTER)
    private boolean singleton
    
    /**
     * The list of macros that will insert its content as part of this phase.
     * (e.g. <@init> as well as <@initialization> will insert its content as part of the initialization phase)
     */
    @Accessors(PUBLIC_GETTER)
    private val List<InjectionMacro> injectionMacros = newArrayList;
    
    /**
     * The replacement code for every injection macro.
     */
    @Accessors
    private var String codeToInject
    
    /**
     * Constructor.
     * 
     * @param name The unique name of the phase.
     * @param isUsesAnnotationsOnce Defines whether the same annotation may be used multiple times in this phase
     * @param alternativeMacroNames A list of macro names that should be equiivalent to the macro with the same name as this phase. 
     */
    private new(String name, boolean singleton, String... alternativeMacroNames) {
        this.name = name
        this.singleton = singleton
        
        // Create macros
        this.injectionMacros += new InjectionMacro(name, this)
        for(alternativeMacroName : alternativeMacroNames) {
            this.injectionMacros += new InjectionMacro(alternativeMacroName, this)
        }
    }
    
    /**
     * The FreeMarker assignment statement which will set this phase as active.
     */
    public def getFreeMarkerAssignment() '''
        <#assign phase='«name»' />
    '''
    
    public def Map<String, String> getInjectionMacroMappings() {
        val map = <String, String> newHashMap
        for(macro : injectionMacros) {
            // Calling the phase in the template is possible by
            // using the name of the assignment macro with an 's' added
            // (e.g. ${declarations} for <@declaration>)
            map.put(macro.name+"s", codeToInject)
        }
        return map
    }
    
    /**
     * Checks if the snippet definition for the annotation should be inserted as part of this phase.
     * 
     * @return true if the snippet definition for the annotation should be inserted as part of this phase.
     */
    public def boolean isApplicable(MacroCallData data){
        return data.phases.contains(this)
    }
}