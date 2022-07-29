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
package de.cau.cs.kieler.simulation.ls

import com.google.inject.Binder
import com.google.inject.Inject
import com.google.inject.Injector
import com.google.inject.Module
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.lsp.KGraphDiagramState
import de.cau.cs.kieler.klighd.lsp.KGraphLanguageServerExtension
import de.cau.cs.kieler.language.server.ILSDiagramHighlighter
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationControlEvent.SimulationOperation
import de.cau.cs.kieler.simulation.ide.CentralSimulation
import de.cau.cs.kieler.simulation.ide.visualization.AbstractDiagramHighlighter
import de.cau.cs.kieler.simulation.ide.visualization.AbstractDiagramHighlightingHandler

/**
 * Works similar to the KlighdPiccoloDiagramHighlightingHandler. After each stop, start, or step action the diagram layout is updated.
 * This includes the styles, therefore the taken transitions are marked.
 * 
 * @author sdo
 * @see de.cau.cs.kieler.simulation.ui.visualization.KlighdPiccoloDiagramHighlightingHandler
 */
class LSDiagramHighlightingHandler extends AbstractDiagramHighlightingHandler implements ILSDiagramHighlighter {

    @Inject SimulationLanguageServerExtension simulationExt

    @Inject KGraphLanguageServerExtension kgraphExt

    @Inject KGraphDiagramState diagramState
    
    static def create(Injector parentInjector, Class<? extends AbstractDiagramHighlighter> highlighter) {
        val injector = parentInjector.createChildInjector(new Module() {
            override configure(Binder binder) {
                binder.bind(AbstractDiagramHighlighter).to(highlighter)
            }
        })
        return injector.getInstance(LSDiagramHighlightingHandler)
    }
    
    @Inject
    new(AbstractDiagramHighlighter highlighter) {
        super(highlighter)
    }

    override handleUpdate(SimulationContext ctx, SimulationControlEvent e, ViewContext vc) {
        if (e.operation != SimulationOperation.START && e.operation != SimulationOperation.STOP &&
            e.operation != SimulationOperation.STEP) {
            return
        }

        try {
            switch (e.operation) {
                case START : highlighter.initialize(ctx)
                case STOP : highlighter.stop(ctx)
                case STEP: highlighter.update(ctx)
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

    override protected ViewContext getDiagramViewContext() {
        synchronized (diagramState) {
            if (diagramState === null || simulationExt.currentlySimulatedModel === null) {
                return null
            }
            // TODO Get model of snapshots model (currently saved in different fields
            return diagramState.getKGraphContext(simulationExt.currentlySimulatedModel)
        }
    }
    
    
    override registerObserver() {
        CentralSimulation.addListener(this)
    }
    
    override unregisterObserver() {
        CentralSimulation.removeListener(this)
    }

}
