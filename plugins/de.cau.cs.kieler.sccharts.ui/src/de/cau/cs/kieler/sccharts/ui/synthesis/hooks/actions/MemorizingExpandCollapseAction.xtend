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
import de.cau.cs.kieler.klighd.IViewer
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import java.util.WeakHashMap
import org.eclipse.emf.ecore.EObject

import static extension com.google.common.base.Preconditions.*
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.sccharts.ui.synthesis.actions.ReferenceExpandAction
import de.cau.cs.kieler.klighd.krendering.KRendering

/**
 * Remembers the expansion state of regions when collapsed or expanded.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class MemorizingExpandCollapseAction implements IAction {
    
    /** The ID */
    public static val ID = "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.actions.MemorizingExpandCollapseAction"
    
    /** The related synthesis option */
    public static val SynthesisOption MEMORIZE_EXPANSION_STATES = SynthesisOption.createCheckOption(
        "sccharts.memorizingExpandCollapse.memorizeExpansionStates", "Remember Collapsed/Expanded Regions", true)
    .setCategory(GeneralSynthesisOptions::NAVIGATION);
    
    /** Memory-leak-free cache of region expansion states */
    public static final WeakHashMap<EObject, Boolean> SCOPE_STATES = new WeakHashMap
    
    /**
     * Sets the expansion state of the region node and save it for future synthesis.
     */
    static def setExpansionState(KNode node, EObject eObject, IViewer viewer, boolean expand) {
        node.checkNotNull
        eObject.checkNotNull
        
        // Store new state if activated
        if (viewer.viewContext.getOptionValue(MEMORIZE_EXPANSION_STATES) as Boolean) {
            SCOPE_STATES.put(eObject, expand)
        }
        
        // Apply state
        if (expand) {
            if (eObject instanceof ValuedObjectReference) {
                if (node.eContents.filter(KRendering).exists[ getActions.exists[ getActionId == ReferenceExpandAction.ID] ]) {
                    val rea = new ReferenceExpandAction
                    val ac = new ActionContext(viewer, null, node, null)
                    rea.execute(ac)
                }
            }
            
            viewer.expand(node)
        } else {
            viewer.collapse(node)
        }
    }
    
    /**
     * @return the memorized expansion state of the given region or null if not memorized
     */
    static def getExpansionState(EObject eObject) {
        return SCOPE_STATES.get(eObject)
    }    
    
    //-----------------------------------------------------------------------------------------------------------------
    
    override execute(ActionContext context) {
        val vc = context.viewContext
        val v = vc.viewer 
        val node = context.KNode
        val eObject = vc.getSourceElement(node)
        
        if (eObject instanceof EObject) {
            if (v.isExpanded(node)) {
                node.setExpansionState(eObject, v, false)
            } else {
                node.setExpansionState(eObject, v, true)
            }                      
        }
        
        return ActionResult.createResult(true);
    }
    
}