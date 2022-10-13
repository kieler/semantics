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
package de.cau.cs.kieler.simulation.ide.visualization

import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.ISimulationListener
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationEvent

/**
 * Abstract handler for AbstractDiagramHighlighter classes.
 * 
 * @author als
 *
 */
abstract class AbstractDiagramHighlightingHandler implements ISimulationListener {
    
    protected val AbstractDiagramHighlighter highlighter

    new(AbstractDiagramHighlighter highlighter) {
        this.highlighter = highlighter
    }
    
    override getName() {
        return highlighter.getName()
    }
    
    override update(SimulationContext ctx, SimulationEvent e) {
        if (e instanceof SimulationControlEvent) {
            val vc = getDiagramViewContext()
            // If there is no model in the diagram, then there is nothing to highlight
            if (vc === null || vc.inputModel === null) {
                return
            }
            
            highlighter.diagramViewContext = vc
            handleUpdate(ctx, e, vc)
        }
    }

    /**
     * Handle the simulation event by delegating to the highlighter and applying its effects.
     */
    abstract def void handleUpdate(SimulationContext ctx, SimulationControlEvent e, ViewContext vc);
    
    /**
     * Returns the diagram view context.
     * 
     * @return the diagram view context
     */
    protected abstract def ViewContext getDiagramViewContext()

}
                