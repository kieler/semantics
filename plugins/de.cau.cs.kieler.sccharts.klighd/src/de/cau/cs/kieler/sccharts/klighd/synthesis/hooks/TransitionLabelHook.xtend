/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.klighd.synthesis.hooks

import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KLabel
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.IAction.ActionResult
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.sccharts.Transition

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*
import de.cau.cs.kieler.sccharts.klighd.hooks.SynthesisActionHook

/**
 * Shows or hides transition labels.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class TransitionLabelHook extends SynthesisActionHook {

    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.klighd.synthesis.hooks.TransitionLabelHook";
    /** The related synthesis option */
    public static final SynthesisOption SHOW_LABELS = SynthesisOption.createCheckOption("Transition labels", true).
        setUpdateAction(TransitionLabelHook.ID); // Register this action as updater

    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_LABELS);
    }

    override postTransition(Transition transition, KEdge edge) {
        if (!SHOW_LABELS.booleanValue) {
            edge.eContents.filter(KLabel).forEach[initiallyHide]
        }
    }

    override executeAction(KNode rootNode) {
        val viewer = usedContext.viewer
        
        if (SHOW_LABELS.booleanValue) {
            rootNode.eAllContentsOfType(KNode, KEdge, KLabel).filter(KLabel).forEach[viewer.show(it)]
        } else {
            rootNode.eAllContentsOfType(KNode, KEdge, KLabel).filter(KLabel).forEach[viewer.hide(it)]
        }
        
        return ActionResult.createResult(true);
    }
}