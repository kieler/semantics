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
package de.cau.cs.kieler.scg.processors.optimizer

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.transformations.basicblocks.BasicBlockTransformation

/**
 * Cleanup ValuedObjects
 * ---------------------
 * 
 * @author ssm
 * @kieler.design 2018-01-12 proposed 
 * @kieler.rating 2018-01-12 proposed yellow
 *
 */
class CleanupValuedObjects extends InplaceProcessor<SCGraphs> {
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension SCGControlFlowExtensions
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.cleanupValuedObjects"
    }
    
    override getName() {
        "Cleanup Valued Objects"
    }
    
    override process() {
        val model = getModel
        
        for (scg : model.scgs) {
            scg.performCleanupValuedObjects
        }
    }
    
    def performCleanupValuedObjects(SCGraph scg) {
        val nextNodes = <Node> newLinkedList(scg.nodes.head)
        val usedValuedObjects = <ValuedObject> newHashSet 
        
        while (!nextNodes.empty) {
            val node = nextNodes.pop
            
            if (node instanceof Assignment) {
                usedValuedObjects += node.reference.valuedObject
                for (ref : node.expression.allReferences) {
                    usedValuedObjects += ref.valuedObject
                } 
            } else if (node instanceof Conditional) {
                for (ref : node.condition.allReferences) {
                    usedValuedObjects += ref.valuedObject
                } 
            }
            
            if (node instanceof Conditional) {
                nextNodes.add(node.^else.targetNode)
            } else {
                val newNodes = node.allNext.map[ targetNode ].filter[ it !== null ].toList
                if (!newNodes.empty && newNodes.head !== nextNodes.peek) {
                    nextNodes.addAll(newNodes)
                } 
            }
        }
        
        for (vo : scg.valuedObjects.filter[ name.startsWith(BasicBlockTransformation.GUARDPREFIX) ].toList.immutableCopy) {
            if (!usedValuedObjects.contains(vo)) {
                vo.removeFromContainmentAndCleanup
            }
        }
    }
    
}