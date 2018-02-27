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

import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.annotations.BooleanAnnotation
import de.cau.cs.kieler.annotations.CommentAnnotation
import de.cau.cs.kieler.annotations.FloatAnnotation
import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.prom.console.ConsoleStyle
import de.cau.cs.kieler.prom.console.PromConsole
import java.util.List
import org.eclipse.emf.ecore.EObject

/**
 * Model analyzer for KExpression declarations.
 * 
 * @author aas
 *
 */
abstract class DeclarationAnalyzer extends ModelAnalyzer {
    
    private static val EXPLICIT_WRAPPER_CODE_ANNOTATION_NAME = "Wrapper"
    private static val SIMULATION_WRAPPER_CODE_ANNOTATION_NAME = "SimWrapper"
    private static val EXCLUDE_SIMULATION_ANNOTATION_NAME = "ExcludeInSimulation"
    
    /**
     * {@inheritDoc}
     */
    override getAnnotationInterface(EObject model) {
        val declarations = getDeclarations(model)
        if(!declarations.isNullOrEmpty) {
            return getAnnotationInterface(declarations)
        } else {
            return null    
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getSimulationInterface(EObject model) {
        val declarations = getDeclarations(model)
        if(!declarations.isNullOrEmpty) {
            return getSimulationInterface(declarations)
        } else {
            return null    
        }
    }
    
    /**
     * Returns the top level declarations that are relevant for the interface
     */
    protected def Iterable<Declaration> getDeclarations(EObject model) {
        return model.eAllContents.filter(Declaration).toIterable
    }
    
    /**
     * Returns the annotation interface of the declarations.
     * 
     * @param declarations The declarations
     * @return the macro call datas to inject into a template
     */
    protected def List<MacroCallData> getAnnotationInterface(Iterable<Declaration> declarations) {
        val allDatas = <MacroCallData> newArrayList
        for (decl : declarations.filter(VariableDeclaration)) {
            val isInput = decl.input
            val isOutput = decl.output
            // Only consider annotations of inputs and outputs.
            if (isInput || isOutput) {
                val varType = decl.type.literal
                // Add macro calls for all declared variables
                for(valuedObject : decl.valuedObjects) {
                    val varName = valuedObject.name
                    // Each annotation gets its own macro call
                    for (annotation : decl.annotations) {
                        if(!(annotation instanceof CommentAnnotation)) {
                            val data = new MacroCallData 
                            data.initializeForCodeGeneration(varName, varType, isInput, isOutput)
                            initData(data, annotation)
                            allDatas.add(data)    
                        }
                    }
                }
            } else {
                // Print warning if explicit wrapper code annotation on variable
                // that is neither input nor output
                val valuedObject = decl.valuedObjects.get(0)
                if(valuedObject !== null) {
                    for (annotation : decl.annotations) {
                         if(annotation.name == EXPLICIT_WRAPPER_CODE_ANNOTATION_NAME) {
                             PromConsole.buildConsole.warn('''Variable '«valuedObject.name»' is neither input nor output but has an explicit wrapper code annotation.''')
                         }
                    }
                }
            }
        }
        return allDatas
    }
    
    /**
     * Returns the simulation interface of the declarations.
     * 
     * @param declarations The declarations
     * @return the macro call datas to inject into a template
     */
    protected def List<MacroCallData> getSimulationInterface(Iterable<Declaration> declarations) {
        val allDatas = <MacroCallData> newArrayList
        for(decl : declarations.filter(VariableDeclaration)) {
            var skip = decl.annotations.exists[it.name == EXCLUDE_SIMULATION_ANNOTATION_NAME]
            val varType = decl.type.literal
            val isInput = decl.isInput
            val isOutput = decl.isOutput
            val isConst = decl.const
            if(!skip && !isConst) {
                for(valuedObject : decl.valuedObjects) {
                    val varName = valuedObject.name
                    val data = new MacroCallData 
                    data.initializeForSimulationGeneration(varName, varType, isInput, isOutput, true)
                    allDatas.add(data)
                    
                    // Add array sizes if any
                    if(!valuedObject.cardinalities.nullOrEmpty) {
                        for(card : valuedObject.cardinalities) {
                            var IntValue intValue = null;
                            if(card instanceof IntValue) {
                                intValue = card as IntValue
                            } else if(card instanceof ValuedObjectReference) {
                                if(card.valuedObject.initialValue instanceof IntValue) {
                                    intValue = card.valuedObject.initialValue as IntValue
                                } else {
                                    throw new Exception("Array sizes must have an integer or integer constant as initial value")
                                }
                            }
                            if(intValue !== null) {
                                data.arguments.add(intValue.value.toString)
                            }
                        }
                    }
                    
                    // Each annotation gets its own macro call
                    for (annotation : decl.annotations) {
                        if(!(annotation instanceof CommentAnnotation) && annotation.name == SIMULATION_WRAPPER_CODE_ANNOTATION_NAME) {
                            val wrapperData = new MacroCallData 
                            wrapperData.initializeForCodeGeneration(varName, varType, isInput, isOutput)
                            initData(wrapperData, annotation)
                            allDatas.add(wrapperData)    
                        }
                    }
                    
                    // In case of valued signals: Add another macro call for the separate value holding variable
                    val isValuedSignal = decl.signal && (decl.type !== ValueType.PURE)
                    if (isValuedSignal) {
                        val valData = data.clone as MacroCallData
                        valData.varName = data.varName + "_val"
                        
                        // Set type of data to be a pure signal, 
                        // the other variable is for the value and has the value type
                        data.varType = ValueType.PURE.literal
                        
                        allDatas.add(valData)
                    }
                }
            }
        }
        return allDatas
    }
    
    /**
     * Fetches the data for wrapper code generation from a variable's annotation.
     * 
     * @param data The macro call data to initialize
     * @param annotation The annotation
     */
    private def void initData(MacroCallData data, Annotation annotation){
        data.name = annotation.name
        
        // Xtend autocast switch expression
        // (the data object is always casted to different
        // classes such that arguments always calls a different getter)
        switch (annotation) {
            BooleanAnnotation: data.arguments.add(String.valueOf(annotation.value))
            FloatAnnotation: data.arguments.add(String.valueOf(annotation.value))
            IntAnnotation: data.arguments.add(String.valueOf(annotation.value))
            StringAnnotation: data.arguments.addAll(annotation.values)
        }
        
        if(!data.arguments.isEmpty && (data.name == EXPLICIT_WRAPPER_CODE_ANNOTATION_NAME || data.name == SIMULATION_WRAPPER_CODE_ANNOTATION_NAME) ){
            // Explicit wrapper annotation
            // -> actual snippet name is the first argument.
            data.name = data.arguments.remove(0)
        }else{
            // Not an explicit wrapper code annotation
            // -> ignore if non existing.
            data.ignoreNonExistingSnippet = true
        }
    }
}