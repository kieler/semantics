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
package de.cau.cs.kieler.circuit.klighd.synthesis.hooks

import com.google.inject.Inject
import de.cau.cs.kieler.circuit.klighd.CircuitDiagramSynthesis
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KLabel
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.SynthesisOption

/**
 * This class hides collapses and expands the guard regions
 * @author fry
 * 
 */
@ViewSynthesisShared
class CollapseGuardRegionsHook extends SynthesisActionHook implements IAction {
    @Inject extension KRenderingExtensions

    public static final String ID = "de.cau.cs.kieler.circuit.klighd.synthesis.hooks.CollapseGuardRegionsHook"
    public static final SynthesisOption COLLAPSE_GUARD_REGIONS = SynthesisOption.createCheckOption(
        "Collapse/Expand guard regions.", false).setCategory(CircuitDiagramSynthesis::VISIBILITY).setUpdateAction(
        CollapseGuardRegionsHook.ID);

    override executeAction(ActionContext context) {
        val KNode rootNode = context.KNode
        val KNode logicRegion = rootNode.children.head.children.filter[labels.head.text == "Program Logic"].head
        val regions = logicRegion.children.filter[!children.empty]

        if (COLLAPSE_GUARD_REGIONS.booleanValue) {
            collapseExpand(context, regions, true)

        } else {
            collapseExpand(context, regions, false)
        }

        return IAction.ActionResult.createResult(true);
    }

    def collapseExpand(ActionContext context, Iterable<KNode> regions, boolean collapse) {
        for (region : regions) {
            if (collapse) {
                context.getActiveViewer().collapse(region)

            }
            if (!collapse) {

                context.getActiveViewer().expand(region)
            }

        }
    }

    def getBooleanValue(SynthesisOption option) {
        return parent.getBooleanValue(option);
    }

    def static getDisplayedSynthesisOptions() {
        return newLinkedList(COLLAPSE_GUARD_REGIONS)
    }

}
