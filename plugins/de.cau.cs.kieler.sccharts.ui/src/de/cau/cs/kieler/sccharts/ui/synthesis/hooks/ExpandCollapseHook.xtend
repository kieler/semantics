/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks

import de.cau.cs.kieler.klighd.DisplayedActionData
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.SynthesisHook
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.actions.CollapseAllRegionsAction
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.actions.ExpandAllRegionsAction

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension de.cau.cs.kieler.sccharts.ui.synthesis.hooks.actions.MemorizingExpandCollapseAction.*

/**
 * Applies the correct initial expansion state to regions.
 * 
 * @author als
 * @kieler.design 2015-11-4 proposed
 * @kieler.rating 2015-11-4 proposed yellow
 * 
 */
@ViewSynthesisShared
class ExpandCollapseHook extends SynthesisHook {

    /** The related synthesis option */
    public static val SynthesisOption INITIALLY_COLLAPSE_ALL = SynthesisOption.createCheckOption("Initially collapse all regions", false)
    .setCategory(GeneralSynthesisOptions::APPEARANCE);
      
    // ----------------------------------------------------------------------------------------------------------------

    override getDisplayedActions() {
        return newLinkedList(
            DisplayedActionData.create(ExpandAllRegionsAction.ID, "Expand All Regions"),
            DisplayedActionData.create(CollapseAllRegionsAction.ID, "Collapse All Regions")
        )
    }

    override getDisplayedSynthesisOptions() {
        return newLinkedList(INITIALLY_COLLAPSE_ALL, MEMORIZE_EXPANSION_STATES)
    }

    override processRegion(Region region, KNode node) {
        if (INITIALLY_COLLAPSE_ALL.booleanValue) {
            node.initiallyCollapse
        } else if (MEMORIZE_EXPANSION_STATES.booleanValue) {
            if (region.expansionState?: true) {
                node.initiallyExpand
            } else {
                node.initiallyCollapse
            }
        } else {
            node.initiallyExpand
        }
    }
}