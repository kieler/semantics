/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.ui.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.ui.KiCoolUiModule
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KImage
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.ui.view.model.MessageModel
import de.cau.cs.kieler.klighd.ui.view.syntheses.MessageModelSynthesis
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.ui.synthesis.action.StartSimulationAction

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Generic synthesis for ExecutableContainer with strart button.
 * 
 * @author als
 * @kieler.design 2016-10-20 proposed 
 * @kieler.rating 2016-10-20 proposed yellow
 */
@ViewSynthesisShared
class SimulationContextSynthesis extends AbstractDiagramSynthesis<SimulationContext> {

    @Inject
    extension KRenderingExtensions

    @Inject
    extension MessageModelSynthesis

    // -------------------------------------------------------------------------
    // Constants
    public static val String ID = "de.cau.cs.kieler.simulation.ui.synthesis.SimulationContext";

    // -------------------------------------------------------------------------
    // Synthesis
    override KNode transform(SimulationContext model) {
        // create basic representation with message model synthesis
        val rootNode = (new MessageModel("Simulation", null, KiCoolUiModule.PLUGIN_ID, "icons/play-button.png", 150)).transform
        // Add action
        if (rootNode !== null && !rootNode.children.empty) {
            rootNode.eAllContents.filter(KNode).forEach[it.suppressSelectability]
            val icon = rootNode.eAllContents.filter(KImage).head
            if (icon !== null) {
                icon.addSingleClickAction(StartSimulationAction.ID);
                icon.addDoubleClickAction(StartSimulationAction.ID);
            }
        }
        return rootNode;
    }
    
}
	