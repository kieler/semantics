/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Node

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Predecessor
import de.cau.cs.kieler.scg.ScgFactory

/**
 * The SCG Extensions are a collection of common methods for SCG manipulation.
 * 
 * @author als
 * @kieler.design 2013-08-20 proposed 
 * @kieler.rating 2013-08-20 proposed yellow
 */
class SCGManipulationExtensions { 
    
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    extension ScgFactory = ScgFactory::eINSTANCE
    
    def void removeNode(Node node, boolean rerouteCF) {
        val prev = newArrayList
        if (rerouteCF) {
            if (node instanceof Conditional) {
                throw new IllegalArgumentException("Cannot reroute controlflow of a conditional")
            } else {
                node.allPrevious.toList.forEach[
                    prev += it.eContainer as Node
                    target = node.allNext.head?.target
                ]
            }
        } else {
            node.allPrevious.toList.forEach[target = null; remove]
        }
        
        node.allNext.forEach[target = null]
        node.dependencies.forEach[target = null]
        node.eContents.immutableCopy.forEach[remove]
        node.incoming.immutableCopy.forEach[target = null; remove]
        
        val sb = node.schedulingBlock
        if (sb !== null) {
            sb.nodes.remove(node)
            if (sb.nodes.empty) {
                val bb = sb.basicBlock
                sb.remove
                sb.guards?.forEach[remove]
                if (bb.schedulingBlocks.empty) {
                    val scg = bb.eContainer as SCGraph
                    for ( sbb : scg.basicBlocks.filter[predecessors.exists[basicBlock == bb]]) {
                        if (rerouteCF) {
                            if (node instanceof Conditional) {
                                throw new IllegalArgumentException("Cannot reroute controlflow of a conditional")
                            } else {
                                sbb.predecessors.removeIf[basicBlock == bb]
                                for (p : prev) {
                                    val pbb = p.basicBlock
                                    if (!sbb.predecessors.exists[basicBlock == pbb]) {
                                        sbb.predecessors.add(createPredecessor => [ basicBlock = pbb ])
                                    }
                                }
                            }
                        } else {
                            sbb.predecessors.removeIf[basicBlock == bb]
                        }
                    }
                    bb.remove
                }
            }
        }
        node.remove
    }
    
}
