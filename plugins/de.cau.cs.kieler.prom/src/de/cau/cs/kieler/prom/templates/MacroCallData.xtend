/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.prom.templates

import java.util.HashSet
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Data container to create macro calls in templates.
 * They are created by analyzing variables and annotations in models.
 * 
 * @author aas
 */
class MacroCallData implements Cloneable {
    /**
     * The name of the macro call.
     * e.g. 'Clock' for an annotation '@Clock 500'.
     */
    @Accessors
    private String name = ""
    
    /**
     * A list with the arguments for this macro call.
     * e.g. #['500'] for an annotation '@Clock 500'.
     */
    @Accessors
    private List<String> arguments = newArrayList()
    
    /**
     * Variable's name of this annotation.
     * e.g. 'clock' for an 'input int clock'.
     */
    @Accessors
    private String varName = ""
    
    /**
     * Variable type of this annotation.
     * e.g. 'int' for an 'input int clock'.
     */
    @Accessors
    private String varType = ""

    /**
     * The name of the model.
     * e.g. 'MyModel' for an scchart 'scchart MyModel {initial state init;}'
     * If the model name is not specified in the language, the file name without extension should be used.
     */
    @Accessors
    private String modelName = ""
    
    /**
     * The phases in which the macro call should be injected.
     * The default is to use the macro call data for all phases.
     */
    @Accessors
    private HashSet<CodeGenerationPhase> phases = CodeGenerationPhase.phases
    
    /**
     * Set of variable interface types that is used to categorize for which variable this macro call is used.
     * This is useful in simulation generation if a subset of all variables
     * (e.g. the external interface / inputs and outputs) should be communicated.
     */
    @Accessors
    private HashSet<VariableInterfaceType> interfaceTypes = newHashSet
    
    /**
     * Specifies if the template engine should throw an error or ignore it
     * if a wrapper code snippet for this annotation does not exist.
     */
    @Accessors
    private boolean ignoreNonExistingSnippet

    /**
     * Constructor
     */    
    public new() {
    }
    
    /**
     * Configure this instance for use in code generation.
     * 
     * @param varName The name of the variable (e.g. 'myVar'
     * @param varType The type of the variable (e.g. 'int')
     * @param isInput Defines whether the variable is used as input
     * @param isOuput Defines whether the variable is used as output
     */
    public def void initializeForCodeGeneration(String varName, String varType, boolean isInput, boolean isOutput) {
        this.varName = varName
        this.varType = varType
        this.interfaceTypes = VariableInterfaceType.getInterfaceTypes(isInput, isOutput, true)
        if(!isInput) {
            this.phases.remove(CodeGenerationPhase.INPUT_PHASE)    
        }
        if(!isOutput) {
            this.phases.remove(CodeGenerationPhase.OUTPUT_PHASE)    
        }
    }
    
    /**
     * Configure this instance for use in simulation code generation.
     * 
     * @param varName The name of the variable (e.g. 'myVar'
     * @param varType The type of the variable (e.g. 'int')
     * @param isInput Defines whether the variable is used as input
     * @param isOuput Defines whether the variable is used as output
     * @param isInternal Defines whether the variable is an internal variable of the model
     */
    public def void initializeForSimulationGeneration(String varName, String varType, boolean isInput, boolean isOutput, boolean isInternal) {
        this.varName = varName
        this.varType = varType
        this.name = "Simulate"
        this.interfaceTypes = VariableInterfaceType.getInterfaceTypes(isInput, isOutput, isInternal)
        // Add the arguments for the macro call
        this.arguments.add(String.valueOf(VariableInterfaceType.getBitmask(interfaceTypes)))
    }
    
    /**
     * Clones the object.
     * @return the cloned object
     */
    public override clone() {
        val copy = new MacroCallData
        copy.name = name
        copy.arguments = arguments.clone
        copy.varName = varName
        copy.varType = varType
        copy.modelName = modelName
        copy.phases = phases.clone as HashSet
        copy.interfaceTypes = interfaceTypes.clone as HashSet
        copy.ignoreNonExistingSnippet = ignoreNonExistingSnippet
        return copy
    }
    
    /**
     * Two objects are equal if the name is equal
     * and their argument lists are equal.
     * 
     * @param obj The other object
     * @return true if they are equal, false otherwise.
     */
    override boolean equals(Object obj){
        if(obj == null)
            return false;
            
        if(obj instanceof MacroCallData){
            val o = obj as MacroCallData
            return o.name.equals(name) && o.arguments.equals(arguments)
        }
        return false
    }
}
