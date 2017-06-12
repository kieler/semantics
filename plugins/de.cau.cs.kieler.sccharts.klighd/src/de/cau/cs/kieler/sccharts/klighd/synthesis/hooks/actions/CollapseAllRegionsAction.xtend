/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.klighd.synthesis.hooks.actions

import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.sccharts.Region

import static extension de.cau.cs.kieler.sccharts.klighd.synthesis.hooks.actions.MemorizingExpandCollapseAction.*
import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*

/**
 * Collapses all regions.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class CollapseAllRegionsAction implements IAction {
    
    public static val ID = "de.cau.cs.kieler.sccharts.klighd.synthesis.hooks.actions.CollapseAllRegionsAction"
    
    override execute(ActionContext context) {
        val vc = context.viewContext
        for (node : vc.viewModel.eAllContentsOfType(KNode).filter[vc.getSourceElement(it) instanceof Region].toIterable) {
            node.setExpansionState(vc.getSourceElement(node) as Region, vc.viewer, false)
        }
        return ActionResult.createResult(true);
    }
    
}