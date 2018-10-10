/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.processors.statebased

import de.cau.cs.kieler.annotations.NamedObject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.Annotatable

/**
 * @author ssm
 * @kieler.design 2018-05-07 proposed 
 * @kieler.rating 2018-05-07 proposed yellow
 * 
 * Utility methods for the state-based pattern
 *
 */
class StatebasedUtil {
    
    private static val GENERATE_PREFIX = "__"
    
    static def void adaptName(NamedObject target, NamedObject from) {
        if (!target.name.nullOrEmpty
            && !from.name.nullOrEmpty
            && target.name.startsWith(GENERATE_PREFIX) 
            && !from.name.startsWith(GENERATE_PREFIX)
        ) {
            target.name = from.name  
        }
    } 
    
    static extension AnnotationsExtensions aExt = new AnnotationsExtensions 
    
    static private val nodePriorityAnnotation = "nodePrios"
    
    static public def saveNodePriority(Annotatable a1, Annotatable a2) {
        if (!a1.hasAnnotation(nodePriorityAnnotation) || ! a2.hasAnnotation(nodePriorityAnnotation)) return;
        val n1 = a1.getAnnotation(nodePriorityAnnotation).asIntAnnotation.value
        val n2 = a2.getAnnotation(nodePriorityAnnotation).asIntAnnotation.value
        if (n1 > n2) {
            a2.getAnnotation(nodePriorityAnnotation).asIntAnnotation.value = n1
        } else if (n2 > n1) {
            a1.getAnnotation(nodePriorityAnnotation).asIntAnnotation.value = n2
        }
    }    
}