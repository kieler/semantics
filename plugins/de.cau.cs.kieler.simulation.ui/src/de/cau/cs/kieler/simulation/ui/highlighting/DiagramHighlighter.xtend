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
package de.cau.cs.kieler.simulation.ui.highlighting

import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.kgraph.KLabeledGraphElement
import de.cau.cs.kieler.klighd.krendering.KForeground
import de.cau.cs.kieler.klighd.ui.view.DiagramView
import de.cau.cs.kieler.prom.ui.PromUIPlugin
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.StepState
import de.cau.cs.kieler.simulation.core.events.SimulationAdapter
import de.cau.cs.kieler.simulation.core.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.core.events.SimulationEvent
import de.cau.cs.kieler.simulation.core.events.SimulationListener
import de.cau.cs.kieler.simulation.core.events.SimulationOperation
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Base class to highlight a model in the diagram view with a running simulation.
 * 
 * @author aas
 *
 */
abstract class DiagramHighlighter {
    
    @Accessors(PUBLIC_GETTER)
    private static val Set<DiagramHighlighter> diagramHighlighters = newHashSet
    
    /**
     * The elements that have been highlighted scince the last call of unhighlightDiagram.
     */
    protected var List<Highlight> lastHighlighting = newArrayList
    
    protected var Map<Integer, List<Highlight>> highlightingHistory = newHashMap
    
    protected var int lastPositionInHistory
    
    /**
     * The diagram view context
     */
    protected var ViewContext diagramViewContext
    
    /**
     * The model in the diagram
     */
    protected var Object diagramModel
    
    /**
     * The simulation listener
     */
    protected var SimulationListener simulationListener = createSimulationListener

    /**
     * Determines whether this highlighter is enabled or not.
     */
    @Accessors
    private var boolean enabled = true
    
    /**
     * Constructor
     * 
     * Registers the simulation listener for this instance.
     */
    new() {
        register
    }
    
    /**
     * Returns the user readable name for this highlighter
     */
    public def String getName() {
        return splitCamelCase(class.simpleName)
    }
    
    /**
     * Enables or disables this highlighter.
     * 
     * @param value The new enabled state
     */
    public def void setEnabled(boolean value) {
        enabled = value
        if(!enabled) {
            unhighlightDiagram
        }
    }
    
    /**
     * Registers the simulation listener for this instance
     * and stores this diagram highlighter in the corresponding static list of all highlighters.
     */
    protected def void register() {
        SimulationManager.addListener(simulationListener)
        diagramHighlighters.add(this)
    }
    
    /**
     * Removes the simulation listener for this instance
     * and this instance from the corresponding static list of all highlighters.
     */
    protected def void unregister() {
        SimulationManager.removeListener(simulationListener)
        diagramHighlighters.remove(this)
    }

    /**
     * Prepares for diagram highlighting.
     * The pool is the initial pool before the first tick.
     * Typically this should not be highlighted because variables may not have been initialized yet.
     */    
    protected def void initialize(DataPool pool) {
        lastPositionInHistory = 0
        highlightingHistory.clear
    }
    
    /**
     * Update the highlighting.
     * 
     * @param pool The pool from the simulation
     */
    protected def void update(DataPool pool) {
        updateHistory
    }
    
    /**
     * Stop and remove all highlighting.
     */
    protected def void stop() {
        unhighlightDiagram
    }
    
    /**
     * Determines if the model can be highlighted by this instance.
     * 
     * @param model The model
     * @return true if the model can be highlighted, false otherwise.
     */
    abstract protected def boolean isSupported(Object model)
    
    /**
     * Creates a simulation listener to update this instance with the simulation.
     */
    protected def SimulationListener createSimulationListener() {
        val listener = new SimulationAdapter() {
            
            override update(SimulationEvent e) {
                // Do nothing if not enabled
                if(!enabled) {
                    return
                }
                // Update the diagram if needed
                if(e instanceof SimulationControlEvent) { 
                    diagramModel = getDiagramModel
                    // If there is no model in the diagram, then there is nothing to highlight
                    if(diagramModel == null) {
                        return;
                    }
                    // If the type of the model is not supported, then there is nothing to do
                    if(!isSupported(diagramModel)) {
                        return
                    }
                    
                    super.update(e)
                }
            }
            
            override onSimulationControlEvent(SimulationControlEvent e) {
                switch(e.operation) {
                    case SimulationOperation.INITIALIZED : {
                        PromUIPlugin.asyncExecInUI [
                            initialize(e.pool)
                        ]
                    }
                    case SimulationOperation.STOP : {
                        PromUIPlugin.asyncExecInUI [
                            stop
                        ]
                    }
                    case SimulationOperation.STEP_HISTORY_BACK,
                    case SimulationOperation.STEP_HISTORY_FORWARD : {
                        val simMan = SimulationManager.instance
                        val historyPos = simMan.positionInHistory
                        // Save current state to come back to this if not currently viewing some former highlighting already
                        if(lastPositionInHistory == 0) {
                            highlightingHistory.put(SimulationManager.instance.currentState.actionIndex, lastHighlighting.clone)    
                        }
                        lastPositionInHistory = historyPos
                        // Load old state
                        if(historyPos > 0) {
                            loadFormerState(simMan.historyState)
                        } else {
                            loadFormerState(simMan.currentState)
                        }
                    }
                    default : {
                        update(e.pool)
                    }
                }
            }
        }
        return listener
    }
    
    /**
     * Re-applies the highlighting of the given former state.
     */
    protected def void loadFormerState(StepState state) {
        val oldHighlighting = highlightingHistory.get(state.actionIndex)
        if(oldHighlighting != null) {
            unhighlightDiagram
            highlightDiagram(oldHighlighting)
        } else {
            throw new Exception("Cannot revert highlighting to former state. No highlighting was found for the action index "+state.actionIndex)
        }
    }
    
    /**
     * Returns the current model in the diagram.
     * 
     * @param the current model in the diagram
     */
    protected def Object getDiagramModel() {
        diagramViewContext = getDiagramViewContext
        if(diagramViewContext == null) {
            return null
        }
        return diagramViewContext.inputModel
    }
    
    /**
     * Returns the diagram view context.
     * 
     * @return the diagram view context
     */
    protected def ViewContext getDiagramViewContext() {
        val diagramViews = DiagramView.getAllDiagramViews
        if (!diagramViews.isNullOrEmpty) {
            val DiagramView viewPart = diagramViews.last
            val viewer = viewPart.getViewer()
            return viewer.getViewContext();
        }
    }
    
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
    protected def highlightDiagram(Iterable<Highlight> highlighting) {
        for(highlight : highlighting) {
            highlight.apply
            // Remember that this element has been highlighted
            lastHighlighting.add(highlight)
        }
    }
    
    /**
     * Returns the highlighting of the given EObjects with the given style.
     * 
     * @param eObjects The objects
     * @return the graph elements that represent the given objects.
     */
    protected def List<Highlight> getHighlighting(Iterable<EObject> eObjects, KForeground style) {
        val highlighting = <Highlight> newArrayList
        for (eObject : eObjects) {
            val element = diagramViewContext.getTargetElement(eObject, typeof(KLabeledGraphElement));
            if (element != null) {
                highlighting.add(new Highlight(element, style, eObject))
            }
        }
        return highlighting
    }
    
    private def void updateHistory() {
        val simMan = SimulationManager.instance
        val maxHistoryLength = simMan.maxHistoryLength.intValue
        if(maxHistoryLength != 0) {
            val lastState = simMan.history.last
            if(lastState != null) {
                val actionIndex = lastState.actionIndex
                highlightingHistory.put(actionIndex, lastHighlighting.clone)
                // Remove oldest highlighting if above simulation history upper bound + 1.
                // The +1 is because there can be one entry for the current highlighting as well.
                if(maxHistoryLength > 0 && highlightingHistory.size > maxHistoryLength + 1) {
                    var Integer oldest = null
                    for(key : highlightingHistory.keySet) {
                        if(oldest == null || oldest > key) {
                            oldest = key
                        }
                    }
                    highlightingHistory.remove(oldest)
                }
            }
        }
    }
    
    /**
     * Converts a text in camelCase to a more human readable form.
     * Examples:
     * "lowercase"        -> "lowercase"
     * "Class"            -> "Class"
     * "MyClass"          -> "My Class"
     * "HTML"             -> "HTML"
     * "PDFLoader"        -> "PDF Loader"
     * "AString"          -> "A String"
     * "SimpleXMLParser"  -> "Simple XML Parser"
     * "GL11Version"      -> "GL 11 Version"
     * "99Bottles"        -> "99 Bottles"
     * "May5"             -> "May 5"
     * "BFG9000"          -> "BFG 9000"
     * 
     * @param s The text in camelCase
     */
    static private def String splitCamelCase(String s) {
       return s.replaceAll(
           String.format("%s|%s|%s",
               "(?<=[A-Z])(?=[A-Z][a-z])",
               "(?<=[^A-Z])(?=[A-Z])",
               "(?<=[A-Za-z])(?=[^A-Za-z])"),
           " ")
    }
}