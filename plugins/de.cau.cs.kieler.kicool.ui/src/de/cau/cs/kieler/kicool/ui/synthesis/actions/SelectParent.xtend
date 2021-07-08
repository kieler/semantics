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
package de.cau.cs.kieler.kicool.ui.synthesis.actions

import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import org.eclipse.emf.ecore.EObject

/**
 * Class that redirects select actions to the processor body node.
 * 
 * @author ssm
 * @kieler.design 2018-04-12 proposed 
 * @kieler.rating 2018-04-12 proposed yellow
 *
 */
class SelectParent implements IAction {
    
    public static val ID = "de.cau.cs.kieler.kicool.ui.synthesis.actions.selectParent"
    
    override execute(ActionContext context) {
        var EObject node = context.KGraphElement
        while (node !== null) {
            node = node.eContainer            
            
            if (node instanceof KNode) {
                context.getActiveViewer.resetSelectionTo(node)
                
                val delegateContext = new ActionContext(
                    context.activeViewer,
                    context.trigger,
                    node, 
                    node.data.filter(KContainerRendering).head    
                )
                (new SelectIntermediateAction).execute(delegateContext)
                
                return ActionResult.createResult(false).dontAnimateLayout()
            }
        }
                
        ActionResult.createResult(false).dontAnimateLayout()
    }
    
}