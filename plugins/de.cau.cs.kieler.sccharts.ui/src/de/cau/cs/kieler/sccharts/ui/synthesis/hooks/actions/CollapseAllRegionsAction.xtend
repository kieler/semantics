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
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks.actions

import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.sccharts.Region

import static extension de.cau.cs.kieler.sccharts.ui.synthesis.hooks.actions.MemorizingExpandCollapseAction.*
import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import org.eclipse.emf.ecore.EObject

/**
 * Collapses all regions.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class CollapseAllRegionsAction implements IAction {
    
    public static val ID = "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.actions.CollapseAllRegionsAction"
    
    extension KExpressionsValuedObjectExtensions KExpVOE = new KExpressionsValuedObjectExtensions
    
    override execute(ActionContext context) {
        val vc = context.viewContext
        for (node : vc.viewModel.eAllContentsOfType(KNode).filter[
            val sourceElement = vc.getSourceElement(it)
            
            return (
                sourceElement instanceof Region ||
                (sourceElement instanceof Scope && (sourceElement as Scope).reference !== null) ||
                (sourceElement instanceof ValuedObjectReference && (sourceElement as ValuedObjectReference).isModelReference)
            )
        ].toIterable) {
            node.setExpansionState(vc.getSourceElement(node) as EObject, vc.viewer, false)
        }
        return ActionResult.createResult(true);
    }
    
}