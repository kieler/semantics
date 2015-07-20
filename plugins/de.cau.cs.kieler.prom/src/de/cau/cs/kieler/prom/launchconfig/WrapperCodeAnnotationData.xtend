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
package de.cau.cs.kieler.prom.launchconfig

import de.cau.cs.kieler.core.annotations.Annotation
import de.cau.cs.kieler.core.annotations.BooleanAnnotation
import de.cau.cs.kieler.core.annotations.FloatAnnotation
import de.cau.cs.kieler.core.annotations.IntAnnotation
import de.cau.cs.kieler.core.annotations.StringAnnotation
import de.cau.cs.kieler.core.kexpressions.Declaration
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Data container for wrapper code annotations in an SCT file.
 * 
 * @author aas
 *
 */
class WrapperCodeAnnotationData {
    
    /**
     * True if the variable of this annotation is an input variable.
     */
    @Accessors
    private boolean input
    
    /**
     * True if the variable of this annotation is an output variable.
     */
    @Accessors
    private boolean output
    
    /**
     * The name of the annotation.
     * e.g. 'Clock' for an annotation '@Clock 500'.
     */
    @Accessors
    private String name
    
    /**
     * A list with the arguments for this annotation.
     * e.g. #['500'] for an annotation '@Clock 500'.
     */
    @Accessors
    private List<String> arguments = newArrayList()
    
    /**
     * Variable's name of this annotation.
     * e.g. 'clock' for an 'input int clock'.
     */
    @Accessors
    private String varName
    
    /**
     * Variable's type of this annotation.
     * e.g. 'int' for an 'input int clock'.
     */
    @Accessors
    private String varType
    
    /**
     * Specifies if the template engine should throw an error or ignore it
     * if a wrapper code snippet for this annotation does not exist.
     */
    @Accessors
    private boolean ignoreNonExistingSnippet
    
    
    
    new(){
    }    
    
    new(Declaration decl, Annotation annotation){
        getData(decl)
        getData(annotation)
    }
    
    
    /**
     * Fetches the data for wrapper code generation from a variable declaration of an SCT file.
     */
    def getData(Declaration decl){
        input = decl.input
        output = decl.output
        varType = decl.type.literal
        if (decl.valuedObjects != null && !decl.valuedObjects.isEmpty) {
            val obj = decl.valuedObjects.get(0)
            varName = obj.name
        }
    }
    
    /**
     * Fetches the data for wrapper code generation from a variable's annotation of an SCT file.
     */
    def getData(Annotation annotation){
        name = annotation.name
        switch (annotation) {
            BooleanAnnotation: arguments.add(String.valueOf(annotation.value))
            FloatAnnotation: arguments.add(String.valueOf(annotation.value))
            IntAnnotation: arguments.add(String.valueOf(annotation.value))
            StringAnnotation: arguments.add(String.valueOf(annotation.value))
        }
        
        if(name == "Wrapper" && !arguments.isEmpty){
            // Explicit wrapper annotation
            // -> actual snippet name is the first argument.
            name = arguments.remove(0)
        }else{
            // Not an explicit wrapper code annotation
            // -> ignore if non existing.
            ignoreNonExistingSnippet = true
        }
    }
    
    /**
     * Two WrapperCodeAnnotationData are equal if the name is equal
     * and their argument lists are equal.
     */
    override boolean equals(Object obj){
        if(obj instanceof WrapperCodeAnnotationData){
            val o = obj as WrapperCodeAnnotationData
            return o.name == name && o.arguments.equals(arguments)
        }
        return false
    }
}