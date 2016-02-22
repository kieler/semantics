/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.processors.optimizations

import de.cau.cs.kieler.kico.transformation.Processor
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.processors.SCGProcessors
import org.eclipse.emf.ecore.EObject

/**
 * Removes unreachable nodes
 * Resulting SCG may contain new unreachable node, should be executed until no changes happen
 * 
 * @author krat ssm 
 * @kieler.design 2015-05-25 proposed 
 * @kieler.rating 2015-05-25 proposed yellow
 *
 */
class UnreachableNodes extends Processor implements Traceable {
    
     override getId() {
        return SCGProcessors::UNREACHABLENODES_ID
    }
    
    override process(EObject eObject) {
        val scg = eObject as SCGraph
        val deleteNodes = <Node> newLinkedList
        val removeControlFlows = <ControlFlow> newLinkedList
        
        // Collect unreachable nodes
        deleteNodes += scg.nodes.filter[ 
            (it.incoming.empty && !(it instanceof Depth) && !(it instanceof Entry) && !(it instanceof Exit))
        ]
        
        // Collect cross references
        for (node : deleteNodes) {
            if (node instanceof Assignment) {
                val assign = node as Assignment
                removeControlFlows.add(assign.next) 
            }
            if (node instanceof Conditional) {
                val cond = node as Conditional
                removeControlFlows.add(cond.then); removeControlFlows.add(cond.^else) 
            }
            if (node instanceof Surface) {
                val sur = node as Surface
                val dep = sur.depth
                scg.nodes.remove(sur.depth)
                removeControlFlows.add(dep.next)
            }
            if (node instanceof Depth) {
                val dep = node as Depth
                removeControlFlows.add(dep.next) 
            }
            if (node instanceof Fork) {
                //TODO remove all threads and exit nodes
                val fork = node as Fork
                fork.next.forEach[ scg.nodes.remove(target); removeControlFlows.add(it) ]
                removeControlFlows.addAll(fork.next) 
            }
            if (node instanceof Join) {
                val join = node as Join
                removeControlFlows.add(join.next) 
            }
        }

        // Remove nodes
        scg.nodes.removeAll(deleteNodes)
        
        // Remove control flow
        for (node : scg.nodes) {
            removeControlFlows.forEach[ node.incoming.remove(it) ]
        }
        
        scg as EObject
    }
        
}