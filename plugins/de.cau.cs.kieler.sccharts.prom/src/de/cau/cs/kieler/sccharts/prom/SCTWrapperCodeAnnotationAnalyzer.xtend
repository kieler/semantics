/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
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
import de.cau.cs.kieler.prom.console.PromConsole
import de.cau.cs.kieler.prom.data.WrapperCodeAnnotationData
import de.cau.cs.kieler.prom.launch.IWrapperCodeAnnotationAnalyzer
import de.cau.cs.kieler.sccharts.State
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject

/**
 * An analyzer for wrapper code annotations in SCT files.
 * 
 * @author aas
 */
class SCTWrapperCodeAnnotationAnalyzer implements IWrapperCodeAnnotationAnalyzer{
    
    private static val EXPLICIT_WRAPPER_CODE_ANNOTATION_NAME = "Wrapper"
    
    /**
     * {@inheritDoc}
     */
    override getAnnotations(EObject model) {
        if (model instanceof State) {
            val annotationDatas = new ArrayList<WrapperCodeAnnotationData>()
            
            // Iterate over model to get all annotations
            for (decl : model.declarations) {
                // Only consider annotations of inputs and outputs.
                if (decl.input || decl.output) {
                    for (annotation : decl.annotations) {
                        val data = new WrapperCodeAnnotationData()
                        data.modelName = model.id
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
        } else {
            return null
        }
    }
    
    /**
     * {@inheritDoc}
     */
    override getSimulationInterface(EObject model) {
        if (model instanceof State) {
            val annotationDatas = new ArrayList<WrapperCodeAnnotationData>()
            
            if (model instanceof State) {
                for(decl : model.declarations) {
                    for(valuedObject : decl.valuedObjects) {
                        // At the moment, send only inputs and outputs
                        if(decl.input || decl.output) {
                            val data = new WrapperCodeAnnotationData();
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
                            
                            data.modelName = model.id
                            data.input = true
                            data.output = true
                            data.name = "Simulate"
                            data.varType = decl.type.literal
                            data.varName = valuedObject.name
                            
                            annotationDatas.add(data)
                        }
                    }
                }
            }
            
            return annotationDatas
        } else {
            return null
        }
    }
    
    /**
     * Fetches the data for wrapper code generation from a variable declaration of an SCT file.
     */
    private def void initData(WrapperCodeAnnotationData data, Declaration decl){
        data.input = decl.input
        data.output = decl.output
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
    private def void initData(WrapperCodeAnnotationData data, Annotation annotation){
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