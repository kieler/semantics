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

import com.google.common.collect.Iterables
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.kgraph.KLabeledGraphElement
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KForeground
import de.cau.cs.kieler.klighd.krendering.KStyle
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.ui.view.DiagramView
import de.cau.cs.kieler.prom.ui.PromUIPlugin
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.events.SimulationAdapter
import de.cau.cs.kieler.simulation.core.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.core.events.SimulationEvent
import de.cau.cs.kieler.simulation.core.events.SimulationListener
import java.util.List
import org.eclipse.elk.graph.properties.Property
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * Base class to highlight a model in the diagram view with a running simulation.
 * 
 * @author aas
 *
 */
abstract class DiagramHighlighter {
    
    /**
     * A property to mark that a style is used for highlighting.
     */
    protected val HIGHLIGHTING_MARKER = new Property<Object>("highlighting");
    
    /**
     * The elements that have been highlighted scince the last call of unhighlightDiagram.
     */
    protected var List<KLabeledGraphElement> lastHighlighting = newArrayList
    
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
     * Constructor
     * 
     * Registers the simulation listener for this instance.
     */
    new() {
        SimulationManager.addListener(simulationListener)
    }

    /**
     * Prepares for diagram highlighting.
     * The pool is the initial pool before the first tick.
     * Typically this should not be highlighted because variables may not have been initialized yet.
     */    
    abstract protected def void initialize(DataPool pool)
    
    /**
     * Update the highlighting with.
     * 
     * @param pool The pool from the simulation
     */
    abstract protected def void update(DataPool pool)
    
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
            
            override onSimulationStopped(SimulationControlEvent e) {
                PromUIPlugin.asyncExecInUI [
                    stop
                ]
            }
            
            override onSimulationStepped(SimulationControlEvent e) {
                PromUIPlugin.asyncExecInUI [
                    update(e.pool)
                ]
            }
            
            override onSimulationInitialized(SimulationControlEvent e) {
                PromUIPlugin.asyncExecInUI [
                    initialize(e.pool)
                ]
            }
        }
        return listener
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
     * Removes the highlighting from the highlighted elements.
     */
    protected def void unhighlightDiagram() {
        if(!lastHighlighting.isNullOrEmpty) {
            for (graphElement : lastHighlighting) {
                unhighlightElement(graphElement)
            }
            lastHighlighting.clear
        }
    }
    
    /**
     * Highlights the element with the given style.
     * 
     * @param elem The element
     * @param style The style
     */
    protected def void highlightElement(KLabeledGraphElement elem, KForeground style) {
        // Remember that this style is to highlight the diagram.
        // This is used to filter for highlighting styles when they should be removed.
        style.setProperty(HIGHLIGHTING_MARKER, this)
        // Highlight container of this element
        val ren = elem.getData(typeof(KContainerRendering))
        ren.styles.add(EcoreUtil.copy(style))
        // Highlight label of this element
        if (!elem.labels.isNullOrEmpty) {
            val label = elem.labels.get(0)
            val ren2 = label.getData(typeof(KText))
            ren2.styles.add(EcoreUtil.copy(style))
        }
        // Remember that this element has been highlighted
        lastHighlighting.add(elem)
    }
    
    /**
     * Removes highlighting from the given element.
     * 
     * @param elem The element
     */
    protected def void unhighlightElement(KLabeledGraphElement elem) {
        // Remove highlighting from container of this element
        val ren = elem.getData(typeof(KContainerRendering));
        Iterables.removeIf(ren.styles, [it.isHighlighting]);
        // Remove highlighting from label of this element
        if (!elem.labels.isNullOrEmpty) {
            val label = elem.labels.get(0)
            val ren2 = label.getData(typeof(KText));
            Iterables.removeIf(ren2.styles, [it.isHighlighting]);
        }
    }
    
    /**
     * Checks if the given style has been used to highlight the diagram. 
     */
    protected def boolean isHighlighting(KStyle style) {
        return style.getProperty(HIGHLIGHTING_MARKER) == this
    }
    
    /**
     * Returns the graph elements that represent the given objects.
     * 
     * @param eObjects The objects
     * @return the graph elements that represent the given objects.
     */
    protected def List<KLabeledGraphElement> getGraphElements(Iterable<EObject> eObjects) {
        val elements = <KLabeledGraphElement> newArrayList
        for (eObject : eObjects) {
            val element = diagramViewContext.getTargetElement(eObject, typeof(KLabeledGraphElement));
            if (element != null) {
                elements.add(element);
            }
        }
        return elements
    }
}