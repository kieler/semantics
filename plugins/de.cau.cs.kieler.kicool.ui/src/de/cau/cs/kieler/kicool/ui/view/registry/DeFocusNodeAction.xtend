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

/**
 * @author ssm
 * @kieler.design 2018-06-04 proposed 
 * @kieler.rating 2018-06-04 proposed yellow
 *
 */
class DeFocusNodeAction implements IAction {
    
    override execute(ActionContext context) {
        val root = context.viewContext.getViewModel.children.head
        
        root.eAllContents.filter(KNode).forEach[
            context.viewContext.viewer.show(it)
        ]
        
        ActionResult.createResult(true)//.dontAnimateLayout()
    }
}