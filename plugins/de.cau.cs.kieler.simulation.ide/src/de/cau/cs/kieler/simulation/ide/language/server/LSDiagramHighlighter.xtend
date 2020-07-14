/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.ide.language.server

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.ZoomStyle
import de.cau.cs.kieler.klighd.lsp.KGraphDiagramState
import de.cau.cs.kieler.klighd.lsp.KGraphLanguageServerExtension
import de.cau.cs.kieler.klighd.lsp.SprottyViewer
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationControlEvent.SimulationOperation
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.ide.visualization.IdeDiagramHighlighter
import java.net.URLDecoder
import static de.cau.cs.kieler.simulation.ide.language.server.SimulationLanguageServerExtension.*

/**
 * Works similar to the DiagramHighlighter. After each stop, start, or step action the diagram layout is updated.
 * This includes the styles, therefore the taken transitions are marked.
 * 
 * @author sdo
 * @see de.cau.cs.kieler.simulation.ui.visualization.DiagramHighlighter
 */
abstract class LSDiagramHighlighter extends IdeDiagramHighlighter {

    @Inject SimulationLanguageServerExtension simulationExt

    @Inject KGraphLanguageServerExtension kgraphExt

    @Inject KGraphDiagramState diagramState

    override update(SimulationContext ctx, SimulationEvent e) {
        if (e instanceof SimulationControlEvent) {
            if (e.operation != SimulationOperation.START && e.operation != SimulationOperation.STOP &&
                e.operation != SimulationOperation.STEP) {
                return
            }
            diagramModel = getDiagramModel
            // If there is no model in the diagram, then there is nothing to highlight
            if (diagramModel === null) {
                return;
            }

            try {
                switch (e.operation) {
                    case START: initialize(ctx)
                    case STOP: stop(ctx)
                    case STEP: update(ctx)
                }
            } catch (Exception ex) {
                ex.printStackTrace
            } finally {
                if (e.operation == SimulationOperation.START || e.operation == SimulationOperation.STOP ||
                    e.operation == SimulationOperation.STEP) {
                    kgraphExt.updateLayout(simulationExt.currentlySimulatedModel)
                }
            }
        }
    }

    override protected ViewContext getDiagramViewContext() {
        synchronized (diagramState) {
            if (diagramState === null || simulationExt.currentlySimulatedModel === null) {
                return null
            }
            // TODO Get model of snapshots model (currently saved in different fields
            return diagramState.getKGraphContext(URLDecoder.decode(simulationExt.currentlySimulatedModel, "UTF-8"))
        }
    }

    override protected startDiagramBatchUpdate() {
        val viewer = diagramViewContext.viewer
        if (viewer instanceof SprottyViewer) {
            viewer.startRecording
        }
    }

    override protected applyDiagramBatchUpdate() {
        val viewer = diagramViewContext.viewer
        if (viewer instanceof SprottyViewer) {
            // viewer.stopRecording(ZoomStyle.NONE, null, 0) this does nothing
            viewer.viewContext
        }
    }

}
