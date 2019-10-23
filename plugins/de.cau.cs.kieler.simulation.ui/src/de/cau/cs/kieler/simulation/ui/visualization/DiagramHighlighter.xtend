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
package de.cau.cs.kieler.simulation.ui.visualization

import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.ZoomStyle
import de.cau.cs.kieler.klighd.piccolo.viewer.PiccoloViewer
import de.cau.cs.kieler.klighd.ui.view.DiagramView
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.ide.visualization.IdeDiagramHighlighter

import static de.cau.cs.kieler.simulation.ui.SimulationUI.*

/**
 * Base class to highlight a model in the diagram view with a running simulation.
 * 
 * @author aas, sdo
 *
 */
abstract class DiagramHighlighter extends IdeDiagramHighlighter {
    
    override update(SimulationContext ctx, SimulationEvent e) {
        if (e instanceof SimulationControlEvent) {
            diagramModel = getDiagramModel
            // If there is no model in the diagram, then there is nothing to highlight
            if(diagramModel === null) {
                return;
            }
            updateUI[
                try {
                    startDiagramBatchUpdate
                    switch(e.operation) {
                        case START : initialize(ctx)
                        case STOP : stop(ctx)
                        case STEP: update(ctx)
                    }
                } catch(Exception ex) {
                    ex.printStackTrace
                } finally {
                    applyDiagramBatchUpdate
                }
            ]
        }
    }
    
    /**
     * Returns the diagram view context.
     * 
     * @return the diagram view context
     */
    protected override ViewContext getDiagramViewContext() {
        val diagramViews = DiagramView.getAllDiagramViews
        if (!diagramViews.isNullOrEmpty) {
            val DiagramView viewPart = diagramViews.last
            val viewer = viewPart.getViewer()
            return viewer.getViewContext();
        }
    }
    
    /**
     * Records all following changes to the diagram to apply them all at once using applyDiagramBatchUpdate.
     */
    protected override void startDiagramBatchUpdate() {
        val viewer = diagramViewContext.viewer
        if(viewer instanceof PiccoloViewer) {
            viewer.startRecording
        }
    }
    
    /**
     * Applies all changes to the diagram that have been recorded since the last call of startDiagramBatchUpdate.
     */
    protected override void applyDiagramBatchUpdate() {
        val viewer = diagramViewContext.viewer
        if(viewer instanceof PiccoloViewer) {
            viewer.stopRecording(ZoomStyle.NONE, null, 0)
        }
    }
}
					