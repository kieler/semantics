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
import de.cau.cs.kieler.klighd.kgraph.KLabeledGraphElement
import de.cau.cs.kieler.klighd.krendering.KForeground
import de.cau.cs.kieler.simulation.DataPool
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.events.SimulationListener
import java.util.List
import java.util.WeakHashMap
import org.eclipse.emf.ecore.EObject

import static de.cau.cs.kieler.simulation.ide.SimulationIDE.*

/**
 * @author sdo
 *
 */
abstract class IdeDiagramHighlighter implements SimulationListener {
    
    /**
     * The elements that have been highlighted since the last call of unhighlightDiagram.
     */
    protected var List<Highlighting> lastHighlighting = newArrayList
    
    protected var highlightingHistory = new WeakHashMap<DataPool, List<Highlighting>>()
    
    /**
     * The diagram view context
     */
    protected var ViewContext diagramViewContext
    
    /**
     * The model in the diagram
     */
    protected var Object diagramModel

    /**
     * Constructor
     * 
     * Registers the simulation listener for this instance.
     */
    new() {
        registerObserver(this)
    }

    /**
     * Prepares for diagram highlighting.
     * The pool is the initial pool before the first tick.
     * Typically this should not be highlighted because variables may not have been initialized yet.
     */
    protected def void initialize(SimulationContext ctx) {
        highlightingHistory.clear
    }
    
    /**
     * Update the highlighting.
     * 
     * @param pool The pool from the simulation
     */
    protected def void update(SimulationContext ctx) {
        updateHistory
    }
    
    /**
     * Stop and remove all highlighting.
     */
    protected def void stop(SimulationContext ctx) {
        unhighlightDiagram
    }
    
    override abstract update(SimulationContext ctx, SimulationEvent e)
    
    /**
     * Returns the current model in the diagram.
     * 
     * @param the current model in the diagram
     */
    protected def Object getDiagramModel() {
        diagramViewContext = getDiagramViewContext
        if(diagramViewContext === null) {
            return null
        }
        return diagramViewContext.inputModel
    }
    
    /**
     * Returns the diagram view context.
     * 
     * @return the diagram view context
     */
    protected abstract def ViewContext getDiagramViewContext()
    
    /**
     * Removes all highlights.
     */
    protected def void unhighlightDiagram() {
        if(!lastHighlighting.isNullOrEmpty) {
            for (highlight : lastHighlighting) {
                highlight.remove
            }
            lastHighlighting.clear
        }
    }
    
    /**
     * Highlights the diagram.
     */
    protected def highlightDiagram(Iterable<Highlighting> highlighting) {
        for(highlight : highlighting) {
            highlight.apply
            // Remember that this element has been highlighted
            lastHighlighting.add(highlight)
        }
    }
    
    /**
     * Records all following changes to the diagram to apply them all at once using applyDiagramBatchUpdate.
     */
    protected abstract def void startDiagramBatchUpdate()
    
    /**
     * Applies all changes to the diagram that have been recorded since the last call of startDiagramBatchUpdate.
     */
    protected abstract def void applyDiagramBatchUpdate()
    
    /**
     * Returns the highlighting of the given EObjects with the given style.
     * 
     * @param eObjects The objects
     * @return the graph elements that represent the given objects.
     */
    protected def List<Highlighting> getHighlighting(Iterable<EObject> eObjects, KForeground style) {
        val highlighting = <Highlighting> newArrayList
        for (eObject : eObjects) {
            val element = diagramViewContext.getTargetElement(eObject, typeof(KLabeledGraphElement));
            if (element != null) {
                highlighting.add(new Highlighting(element, style, eObject))
            }
        }
        return highlighting
    }
    
    private def void updateHistory() {
//        val simMan = SimulationManager.instance
//        val maxHistoryLength = SimulationManager.maxHistoryLength
//        if(maxHistoryLength != 0) {
//            val lastState = simMan.history.last
//            if(lastState != null) {
//                val actionIndex = lastState.actionIndex
//                highlightingHistory.put(actionIndex, lastHighlighting.clone)
//                // Remove oldest highlighting if above simulation history upper bound + 1.
//                // The +1 is because there can be one entry for the current highlighting as well.
//                if(maxHistoryLength > 0 && highlightingHistory.size > maxHistoryLength + 1) {
//                    var Integer oldest = null
//                    for(key : highlightingHistory.keySet) {
//                        if(oldest == null || oldest > key) {
//                            oldest = key
//                        }
//                    }
//                    highlightingHistory.remove(oldest)
//                }
//            }
//        }
    }
}
                