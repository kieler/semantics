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
package de.cau.cs.kieler.simulation.ide.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.ide.model.MessageModel
import de.cau.cs.kieler.klighd.ide.syntheses.MessageModelSynthesis
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.KImage
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.simulation.SimulationContext

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
    public static val String ID = "de.cau.cs.kieler.simulation.ide.synthesis.SimulationContext";
    public static val String ICON_PLUGIN_ID = "de.cau.cs.kieler.simulation.ide";
    public static val String StartSimulationAction_ID = "de.cau.cs.kieler.simulation.ui.synthesis.action.StartSimulationAction";
    public static val String AddCoSimulationAction_ID = "de.cau.cs.kieler.simulation.ui.synthesis.action.AddCoSimulationAction";

    // -------------------------------------------------------------------------
    // Synthesis
    override KNode transform(SimulationContext model) {
        // create basic representation with message model synthesis
        val message = "[Co-simulation]"
        val rootNode = (new MessageModel("Simulation", message, ICON_PLUGIN_ID, "icons/play-button.png", 150)).transform
        // Add action
        if (rootNode !== null && !rootNode.children.empty) {
            rootNode.eAllContents.filter(KNode).forEach[it.suppressSelectability]
            val icon = rootNode.eAllContents.filter(KImage).head
            if (icon !== null) {
                icon.addSingleClickAction(StartSimulationAction_ID)
                icon.addDoubleClickAction(StartSimulationAction_ID)
            }
            val button = rootNode.eAllContents.filter(KText).filter[message.equals(text)].head
            button.foreground = Colors.BLUE
            button.addSingleClickAction(AddCoSimulationAction_ID)
            button.addDoubleClickAction(AddCoSimulationAction_ID)
        }
        return rootNode;
    }
    
}
	