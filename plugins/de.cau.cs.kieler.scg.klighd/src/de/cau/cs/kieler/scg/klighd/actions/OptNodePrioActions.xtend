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
package de.cau.cs.kieler.scg.klighd.actions

import com.google.inject.Guice
import com.google.inject.Inject
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.scg.klighd.SCGraphSynthesisHelper

import static de.cau.cs.kieler.scg.klighd.SCGraphSynthesisOptions.*
import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*
import de.cau.cs.kieler.klighd.actions.SynthesizingAction

/**
 * Action class to display the optimized node priorities in the scg.
 * @author lpe
 * 
 */
class OptNodePrioActions extends SynthesizingAction {

    @Inject
    extension KRenderingExtensions
    
    
    private static final String OPT_ID = "de.cau.cs.kieler.scg.klighd.actions.optPrioActions"

    public static final SynthesisOption SHOW_OPT_PRIO_ID = (SynthesisOption::createCheckOption(OptNodePrioActions, "Optimized Priority IDs",
        true).setUpdateAction(OPT_ID).setCategory(PRIO));

    override execute(ActionContext context) {
        val viewContext = context.contextViewer.viewContext
        val rootNode = context.KNode
        for (node : rootNode.eAllContentsOfType(KNode).toIterable) {
            if (viewContext.getSourceElement(node) !== null) {
                val container = node.KContainerRendering
                for (text : container.children) {
                    if (text.getProperty(SCGraphSynthesisHelper.OPT_PRIO_PROPERTY)) {
                        if (SHOW_OPT_PRIO_ID.booleanValue(viewContext)) {
                            text.invisible = false
                        } else {
                            text.invisible = true
                        }
                    }
                }    
            }
        }

        ActionResult.createResult(true)
    }
    
    
    def booleanValue(SynthesisOption option, ViewContext viewContext) {
        val value = viewContext.getOptionValue(option)
        
        if(value === null) {
            return false
        } else if (value instanceof Boolean) {
            return value as Boolean;

        } else {
            throw new IllegalArgumentException("KLighD transformation option handling: "
                    + "The transformation " + this
                    + " attempted to evaluate the non-Boolean valued transformation option "
                    + option.getName() + " expecting a Boolean value.");
        }
    }

}
