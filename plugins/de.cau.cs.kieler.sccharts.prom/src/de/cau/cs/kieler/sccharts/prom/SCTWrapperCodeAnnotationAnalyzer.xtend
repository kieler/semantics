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
import de.cau.cs.kieler.core.kexpressions.VariableDeclaration

/**
 * An analyzer for wrapper code annotations in SCT files.
 * 
 * @author aas
 */
class SCTWrapperCodeAnnotationAnalyzer implements IWrapperCodeAnnotationAnalyzer{
    
    override getAnnotations(EObject model) {
        if (model instanceof State) {
            val annotationDatas = new ArrayList<WrapperCodeAnnotationData>()
            
            // Iterate over model to get all annotations
            for (decl : model.declarations.filter(VariableDeclaration)) {
                // Only consider annotations of inputs and outputs.
                if (decl.input || decl.output) {
                    for (annotation : decl.annotations){    
                        val data = new WrapperCodeAnnotationData()
                        initData(data, decl)
                        initData(data, annotation)
                        annotationDatas += data
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
    private def void initData(WrapperCodeAnnotationData data, VariableDeclaration decl){
        data.input = decl.input
        data.output = decl.output
        data.varType = decl.type.literal
        if (decl.valuedObjects != null && !decl.valuedObjects.isEmpty) {
            val obj = decl.valuedObjects.get(0)
            data.varName = obj.name
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
        
        if(data.name == "Wrapper" && !data.arguments.isEmpty){
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