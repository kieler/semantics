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

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Data container for wrapper code annotations in Model file.
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