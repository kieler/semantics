/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.ssc.ssa.processors

import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.AbsoluteWrite_RelativeWrite
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.ssc.ssa.SSAHelperExtensions
import javax.inject.Inject

/**
 * The SSA transformation for SCGs
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class VariablePreserverExtensions {
    
    // -------------------------------------------------------------------------
    
    @Inject
    extension SCGCoreExtensions

    @Inject
    extension AnnotationsExtensions

    @Inject
    extension SSAHelperExtensions

    // -------------------------------------------------------------------------
    
    def SCGraph process(SCGraph scg, KielerCompilerContext context) {
        
        // To preserve output variables
        

        val sharedVariableStartFork = node.ancestorForks.findFirst[sharedVariableStart.get(vo).contains(it)]
        val sharedDefs = newArrayList(sharedVariableStartFork.allSharedVariableAssignments(vo).filter [
            !it.hasAnnotation(SSA)
        ]).sortBy[scg.nodes.indexOf(it)].toList
        // Seq filter seq following
        // TODO consider loops
        sharedDefs.removeIf [ rem |
            val nodeBB = node.basicBlock
            val remBB = rem.basicBlock
            if (nodeBB == remBB) {
                var next = node
                while (next.allNext.size == 1) {
                    next = next.allNext.map[target].head
                    if (next == remBB) {
                        return true
                    }
                    if (next.basicBlock != nodeBB) {
                        return false
                    }
                }
                return false
            } else {
                return dt.isDom(nodeBB, remBB)
            }
        ]
        // IUR filter update before initialize
        if (node instanceof Assignment) {
            // TODO consider loops
            sharedDefs.remove(node)
            sharedDefs.removeIf [ rem |
                node.dependencies.exists[target == rem && it instanceof AbsoluteWrite_RelativeWrite]
            ]
        }
    }
    
    def isRenamingProtected(Assignment asm) {
        return asm.hasAnnotation(PROTECTED)
    }
}
