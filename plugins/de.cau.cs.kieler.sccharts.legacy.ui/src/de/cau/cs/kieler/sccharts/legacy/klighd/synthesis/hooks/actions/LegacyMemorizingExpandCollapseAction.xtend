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
package de.cau.cs.kieler.sccharts.legacy.klighd.synthesis.hooks.actions

import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.IViewer
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.sccharts.legacy.sccharts.Region
import de.cau.cs.kieler.sccharts.legacy.klighd.synthesis.GeneralSynthesisOptions
import java.util.WeakHashMap

import static extension com.google.common.base.Preconditions.*

/**
 * Remembers the expansion state of regions when collapsed or expanded.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class LegacyMemorizingExpandCollapseAction implements IAction {
    
    /** The ID */
    public static val ID = "de.cau.cs.kieler.sccharts.legacy.klighd.synthesis.hooks.actions.LegacyMemorizingExpandCollapseAction"
    
    /** The related synthesis option */
    public static val SynthesisOption MEMORIZE_EXPANSION_STATES = SynthesisOption.createCheckOption("Remember collapse/expand state of regions", true)
    .setCategory(GeneralSynthesisOptions::APPEARANCE);      
    
    /** Memory-leak-free cache of region expansion states */
    public static final WeakHashMap<Region, Boolean> REGION_STATES = new WeakHashMap
    
    /**
     * Sets the expansion state of the region node and save it for future synthesis.
     */
    static def setExpansionState(KNode node, Region region, IViewer viewer, boolean expand) {
        node.checkNotNull
        region.checkNotNull
        
        // Store new state if activated
        if (viewer.viewContext.getOptionValue(MEMORIZE_EXPANSION_STATES) as Boolean) {
            REGION_STATES.put(region, expand)
        }
        
        // Apply state
        if (expand) {
            viewer.expand(node)
        } else {
            viewer.collapse(node)
        }
    }
    
    /**
     * @return the memorized expansion state of the given region or null if not memorized
     */
    static def getExpansionState(Region region) {
        return REGION_STATES.get(region)
    }    
    
    //-----------------------------------------------------------------------------------------------------------------
    
    override execute(ActionContext context) {
        val vc = context.viewContext
        val v = vc.viewer 
        val node = context.KNode
        val region = vc.getSourceElement(node)
        
        if (region instanceof Region) {
            if (v.isExpanded(node)) {
                node.setExpansionState(region, v, false)
            } else {
                node.setExpansionState(region, v, true)
            }
        }
        
        return ActionResult.createResult(true);
    }
    
}