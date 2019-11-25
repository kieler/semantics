/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
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
    
    def insertHighlightAnnotations(Annotatable annotatable, IASTNode node) {
        
        val nodeLocations = node.getNodeLocations
        
//        val annotations = annotatable.annotations
        
        if (annotatable.getAnnotations("Offset").length == 0) {
        
            if (nodeLocations.length > 0) {        
                val nodeOffset = node.getNodeLocations.get(0).getNodeOffset
                val nodeLength = node.getNodeLocations.get(0).getNodeLength
                
                annotatable.annotations += createStringAnnotation("Offset", nodeOffset.toString)
                annotatable.annotations += createStringAnnotation("Length", nodeLength.toString)
            } else {
                //println("insertHighlightAnnotations aufgerufen - node hat aber keine NodeLocations")
            }
        
        } else {
            //println("insertHighlightAnnotations aufgerufen object hat aber bereits offset annotation")
        }
    }
}