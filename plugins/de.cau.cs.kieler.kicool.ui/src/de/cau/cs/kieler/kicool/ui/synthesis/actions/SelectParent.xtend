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

import de.cau.cs.kieler.kicool.ide.synthesis.actions.AbstractSelectParent
import de.cau.cs.kieler.kicool.ui.synthesis.updates.ProcessorDataManager
import de.cau.cs.kieler.klighd.IAction.ActionResult
import de.cau.cs.kieler.klighd.kgraph.KIdentifier
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
class SelectParent extends AbstractSelectParent {
    
    override execute(ActionContext context) {
        var EObject node = context.KNode
        while (node !== null) {
            node = node.eContainer            
            
            if (node instanceof KNode) {
                 val id = node.getData(KIdentifier)
                 if (id !== null && id.id == ProcessorDataManager.NODE_PROCESSOR_BODY) {
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
        }
                
        ActionResult.createResult(false).dontAnimateLayout()
    }
    
}