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
package de.cau.cs.kieler.kicool.ui.view.registry

import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.IAction.ActionContext
import de.cau.cs.kieler.klighd.kgraph.KNode
import java.util.Set

/**
 * @author ssm
 * @kieler.design 2018-06-04 proposed 
 * @kieler.rating 2018-06-04 proposed yellow
 *
 */
class FocusNodeAction implements IAction {
    
    override execute(ActionContext context) {
        val node = context.KNode;
        
        val nodesToShow = context.viewContext.getViewModel.children.head.eAllContents.filter(KNode).toList
        for (n : nodesToShow) {
            try {
                context.viewContext.viewer.show(n)
            } catch (Exception e) { }
        }
        
        
        val connected = node.getCC
        
        val root = context.viewContext.getViewModel.children.head
        
        root.eAllContents.filter(KNode).filter[ !connected.contains(it) ].forEach[
            context.viewContext.viewer.hide(it)
        ]
        
        ActionResult.createResult(true) //.dontAnimateLayout()
    }
    
    private def Set<KNode> getCC(KNode node) {
        val visited = <KNode> newHashSet

        val nextNodes = <KNode> newLinkedList => [ it.push(node) ]
        while (!nextNodes.empty) {
            val head = nextNodes.pop
            if (!visited.contains(head)) {
                visited += head
                val next = head.outgoingEdges.filter[ !visited.contains(target) ].map[ target ].toSet  
                next.forEach[ nextNodes.push(it) ]
            }
        }
        
        visited.remove(node)
        nextNodes.push(node) 
        while (!nextNodes.empty) {
            val head = nextNodes.pop
            if (!visited.contains(head)) {
                visited += head
                val prev = head.incomingEdges.filter[ !visited.contains(eContainer) ].map[ eContainer ].filter(KNode).toSet
                prev.forEach[ nextNodes.push(it) ]
            }
        }
        
        
        return visited
    }
}