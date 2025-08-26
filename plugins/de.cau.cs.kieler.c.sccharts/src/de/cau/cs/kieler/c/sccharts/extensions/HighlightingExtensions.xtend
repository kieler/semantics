/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.c.sccharts.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.Annotatable
import org.eclipse.cdt.core.dom.ast.IASTNode

/**
 * @author lewe
 *
 */
class HighlightingExtensions {
    
     @Inject extension AnnotationsExtensions
    
    // Attaches the location information of the given CDT node as annotations to the given annotatable
    def insertHighlightAnnotations(Annotatable annotatable, IASTNode node) {
        
        val nodeLocations = node.getNodeLocations
        
        // Do not override already existing annotations
        if (annotatable.getAnnotations("Offset").length == 0) {
        
            // Test if the location information exists
            if (nodeLocations.length > 0) {        
                val nodeOffset = node.getNodeLocations.get(0).getNodeOffset
                val nodeLength = node.getNodeLocations.get(0).getNodeLength
                
                // Attach annotations
                annotatable.annotations += createStringAnnotation("Offset", nodeOffset.toString)
                annotatable.annotations += createStringAnnotation("Length", nodeLength.toString)
            } else {
                println("HighlightingExtensions: Given node has no LocationInformation")
            }
        
        } else {
            println("HighlightingExtensions: Given annotatable has already location informations attached")
        }
    }
}