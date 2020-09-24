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

import com.google.inject.Guice
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.ZoomStyle
import de.cau.cs.kieler.klighd.piccolo.viewer.PiccoloViewer
import de.cau.cs.kieler.klighd.ui.view.DiagramView
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.ide.CentralSimulation
import de.cau.cs.kieler.simulation.ide.visualization.AbstractDiagramHighlighter
import de.cau.cs.kieler.simulation.ide.visualization.AbstractDiagramHighlightingHandler

import static de.cau.cs.kieler.simulation.ui.SimulationUI.*

/**
 * Klighd Piccolo specific handler for diagram highlighting.
 * 
 * @author sdo, als
 *
 */
class KlighdPiccoloDiagramHighlightingHandler extends AbstractDiagramHighlightingHandler {
    
    static def createAndStartHighlighter(Class<? extends AbstractDiagramHighlighter> highlighter) {
        val handler = new KlighdPiccoloDiagramHighlightingHandler(Guice.createInjector().getInstance(highlighter))
        CentralSimulation.addListener(handler)
        return handler
    }
    
    new(AbstractDiagramHighlighter highlighter) {
        super(highlighter)
    }
    
    override handleUpdate(SimulationContext ctx, SimulationControlEvent e, ViewContext vc) {
        updateUI[
            try {
                vc.startDiagramBatchUpdate
                switch(e.operation) {
                    case START : highlighter.initialize(ctx)
                    case STOP : highlighter.stop(ctx)
                    case STEP: highlighter.update(ctx)
                }
            } catch(Exception ex) {
                ex.printStackTrace
            } finally {
                vc.applyDiagramBatchUpdate
            }
        ]
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
    protected def void startDiagramBatchUpdate(ViewContext vc) {
        val viewer = vc.viewer
        if(viewer instanceof PiccoloViewer) {
            viewer.startRecording
        }
    }
    
    /**
     * Applies all changes to the diagram that have been recorded since the last call of startDiagramBatchUpdate.
     */
    protected def void applyDiagramBatchUpdate(ViewContext vc) {
        val viewer = vc.viewer
        if(viewer instanceof PiccoloViewer) {
            viewer.stopRecording(ZoomStyle.NONE, null, 0)
        }
    }
}
					