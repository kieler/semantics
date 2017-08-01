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
package de.cau.cs.kieler.sccharts.prom

import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.annotations.BooleanAnnotation
import de.cau.cs.kieler.annotations.FloatAnnotation
import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.prom.console.PromConsole
import de.cau.cs.kieler.prom.data.MacroCallData
import de.cau.cs.kieler.prom.templates.ModelAnalyzer
import de.cau.cs.kieler.sccharts.State
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.sccharts.SCCharts

/**
 * @author aas
 *
 */
class SCChartsAnalyzer implements ModelAnalyzer{
    
    private static val EXPLICIT_WRAPPER_CODE_ANNOTATION_NAME = "Wrapper"
    
    /**
     * {@inheritDoc}
     */
    override getModelName(EObject model) {
        if (model instanceof SCCharts) {
            if(!model.rootStates.isNullOrEmpty) {
                return model.rootStates.get(0).name
            }
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getAnnotationInterface(EObject model) {
        var State state
        if (model instanceof SCCharts) {
            if(!model.rootStates.isNullOrEmpty) {
                state = model.rootStates.get(0)
            }
        }
        if (state == null) {
            return null
        }
        val annotationDatas = new ArrayList<MacroCallData>()
        
        // Iterate over model to get all annotations
        for (decl : state.declarations.filter(VariableDeclaration)) {
            // Only consider annotations of inputs and outputs.
            if (!decl.const && (decl.input || decl.output)) {
                for (annotation : decl.annotations) {
                    val data = new MacroCallData()
                    data.modelName = state.name
                    initData(data, decl)
                    initData(data, annotation)
                    annotationDatas += data
                }
            } else {
                // Print warning if explicit wrapper code annotation on variable
                // that is neither input nor output
                for (annotation : decl.annotations) {
                     if(annotation.name == EXPLICIT_WRAPPER_CODE_ANNOTATION_NAME) {
                         PromConsole.print('''Warning: Variable '«getVariableName(decl)»' is neither input nor output but has an explicit wrapper code annotation.''');
                     }
                }
            }
        }
        
        return annotationDatas
    }
    
    /**
     * {@inheritDoc}
     */
    override getSimulationInterface(EObject model) {
        var State state
        if (model instanceof SCCharts) {
            if(!model.rootStates.isNullOrEmpty) {
                state = model.rootStates.get(0)
            }
        }
        if (state == null) {
            return null
        }
        val annotationDatas = new ArrayList<MacroCallData>()
        
        for(decl : state.declarations.filter(VariableDeclaration)) {
            for(valuedObject : decl.valuedObjects) {
                if(!decl.const) {
                    val data = new MacroCallData();
                    data.arguments.add(String.valueOf(decl.input))
                    data.arguments.add(String.valueOf(decl.output))
                    // add array sizes if any
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
                            if(intValue != null) {
                                data.arguments.add(intValue.value.toString)
                            }
                        }
                    }
                    
                    data.modelName = state.name
                    data.name = "Simulate"
                    data.varType = decl.type.literal
                    data.varName = valuedObject.name
                    
                    // Set interface type
                    if(decl.input) {
                        data.interfaceTypes.add("input")
                    }
                    if(decl.output) {
                        data.interfaceTypes.add("output")
                    }
                    if(!decl.input && !decl.output) {
                        data.interfaceTypes.add("internal")
                    }
                    
                    annotationDatas.add(data)
                }
            }
        }
        
        return annotationDatas
    }
    
    /**
     * Fetches the data for wrapper code generation from a variable declaration of an SCT file.
     */
    private def void initData(MacroCallData data, VariableDeclaration decl){
        data.setPhases(decl.isInput, decl.isOutput)
        data.varType = decl.type.literal
        data.varName = getVariableName(decl)
    }
    
    /**
     * Fetches the name of the first valued object in a declaration.
     * @param decl The declaration
     */
    private def String getVariableName(Declaration decl) {
        if (decl.valuedObjects != null && !decl.valuedObjects.isEmpty) {
            val obj = decl.valuedObjects.get(0)
            return obj.name
        } else {
            return "";
        }
    }
    
    /**
     * Fetches the data for wrapper code generation from a variable's annotation of an SCT file.
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
        
        if(data.name == EXPLICIT_WRAPPER_CODE_ANNOTATION_NAME && !data.arguments.isEmpty){
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