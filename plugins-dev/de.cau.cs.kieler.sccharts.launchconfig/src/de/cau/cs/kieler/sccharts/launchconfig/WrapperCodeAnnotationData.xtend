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
package de.cau.cs.kieler.sccharts.launchconfig

import de.cau.cs.kieler.core.annotations.Annotation
import de.cau.cs.kieler.core.annotations.BooleanAnnotation
import de.cau.cs.kieler.core.annotations.FloatAnnotation
import de.cau.cs.kieler.core.annotations.IntAnnotation
import de.cau.cs.kieler.core.annotations.StringAnnotation
import de.cau.cs.kieler.core.kexpressions.Declaration
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 *
 */
class WrapperCodeAnnotationData {
    
    @Accessors
    private boolean input
    
    @Accessors
    private boolean output
    
    @Accessors
    private String name
    
    @Accessors
    private List<String> arguments = newArrayList()
    
    @Accessors
    private String varName
    
    @Accessors
    private String varType
    
    @Accessors
    private boolean ignoreNonExistingSnippet
    
    new(){
    }    
    
    new(Declaration decl, Annotation annotation){
        getData(decl)
        getData(annotation)
    }
    
    def getData(Declaration decl){
        input = decl.input
        output = decl.output
        varType = decl.type.literal
        if (decl.valuedObjects != null && !decl.valuedObjects.isEmpty) {
            val obj = decl.valuedObjects.get(0)
            varName = obj.name
        }
    }
    
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