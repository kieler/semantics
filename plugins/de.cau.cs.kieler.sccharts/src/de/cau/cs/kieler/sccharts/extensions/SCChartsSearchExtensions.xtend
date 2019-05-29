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
package de.cau.cs.kieler.sccharts.extensions

import de.cau.cs.kieler.sccharts.State
import com.google.inject.Inject

/**
 * @author ssm
 * @kieler.design 2019-03-18 proposed 
 * @kieler.rating 2019-03-18 proposed yellow 
 *
 */
class SCChartsSearchExtensions {
    
    @Inject extension SCChartsActionExtensions
    
    def boolean immediatePathBFS(State source, State target) {
        val visited = <State> newHashSet => [ add(source) ]
        val queue = <State> newLinkedList => [ push(source) ]
        while(!queue.empty) {
            val node = queue.pop
            if (node == target) 
                return true
            for(tS : node.outgoingTransitions.filter[ immediate ].map[ targetState ]) {
                if (!visited.contains(tS)) {
                    queue.push(tS)
                    visited.add(tS)
                }
            }  
        }
        return false
    } 
    
}