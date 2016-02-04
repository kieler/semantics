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

import de.cau.cs.kieler.core.annotations.Annotation
import de.cau.cs.kieler.core.annotations.BooleanAnnotation
import de.cau.cs.kieler.core.annotations.FloatAnnotation
import de.cau.cs.kieler.core.annotations.IntAnnotation
import de.cau.cs.kieler.core.annotations.StringAnnotation
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.prom.launchconfig.IWrapperCodeAnnotationAnalyzer
import de.cau.cs.kieler.prom.launchconfig.WrapperCodeAnnotationData
import de.cau.cs.kieler.sccharts.State
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.prom.launchconfig.LaunchConfiguration

/**
 * An analyzer for wrapper code annotations in SCT files.
 * 
 * @author aas
 */
class SCTWrapperCodeAnnotationAnalyzer implements IWrapperCodeAnnotationAnalyzer{
    
    private static val EXPLICIT_WRAPPER_CODE_ANNOTATION_NAME = "Wrapper"
    
    override getAnnotations(EObject model) {
        if (model instanceof State) {
            val annotationDatas = new ArrayList<WrapperCodeAnnotationData>()
            
            // Iterate over model to get all annotations
            for (decl : model.declarations) {
                // Only consider annotations of inputs and outputs.
                if (decl.input || decl.output) {
                    for (annotation : decl.annotations) {
                        val data = new WrapperCodeAnnotationData()
                        initData(data, decl)
                        initData(data, annotation)
                        annotationDatas += data
                    }
                } else {
                    // Print warning if explicit wrapper code annotation on variable
                    // that is neither input nor output
                    for (annotation : decl.annotations) {
                         if(annotation.name == EXPLICIT_WRAPPER_CODE_ANNOTATION_NAME) {
                             LaunchConfiguration.writeToConsole('''Warning: Variable '«getVariableName(decl)»' is neither input nor output but has an explicit wrapper code annotation.''');
                         }
                    }
                }
            }
            
            return annotationDatas
        } else {
            return null
        }
    }
    
    override getModelName(EObject model) {
        if(model instanceof State)
            return model.id
        else
            return null
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