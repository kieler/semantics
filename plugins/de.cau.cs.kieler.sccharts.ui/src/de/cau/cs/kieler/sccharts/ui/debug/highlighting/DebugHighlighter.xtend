/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.debug.highlighting

import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.simulation.ui.visualization.Highlighting
import de.cau.cs.kieler.sccharts.ui.debug.view.DebugDiagramView
import de.cau.cs.kieler.klighd.krendering.Colors
import com.google.inject.Inject
import de.cau.cs.kieler.klighd.krendering.KEllipse
import com.google.inject.Guice
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * @author stu121235
 *
 */
class DebugHighlighter {
    
    
    static val factory = KRenderingFactory.eINSTANCE
    
    static val activeStateColor = factory.createKColor.setColor(Colors.RED)
    static val activeStateForeground = factory.createKForeground.setColor2(activeStateColor)
    
    // Debugger line highlight green
    static val executingStateColor = factory.createKColor.setColor(198, 219, 174)
    static val executingStateBackground = factory.createKBackground.setColor2(executingStateColor)
    static val executingTransitionForeground = factory.createKForeground.setColor2(EcoreUtil.copy(executingStateColor))
    
    static val breakpointStateColor = factory.createKColor.setColor(Colors.BLUE)
    static val breakpointStateBackground = factory.createKBackground.setColor2(breakpointStateColor)
    
    val activeStateHighlightings = <Highlighting> newLinkedList
    val executingStateHighlightings = <Highlighting> newLinkedList
    val breakpointHighlights = <Highlighting> newLinkedList
    val activeEdgeHighlights = <Highlighting> newLinkedList
    
    val transitionToDecorator = <Transition, KEllipse> newHashMap
    
    static var DebugHighlighter instance 
    
    static val ellipseID = "Debug Ellipse"
    
    @Inject extension KContainerRenderingExtensions
    @Inject extension KRenderingExtensions
    
    private new() {
        super()
        Guice.createInjector.injectMembers(this)
    }
    
    static def DebugHighlighter getInstance() {
        if (instance === null) {
            instance = new DebugHighlighter
        }
        return instance
    }
    
    def void highlightActiveState(State state) {
        val kNode = DebugDiagramView.getInstance?.getKNode(state)
        if (kNode === null) {
            //TODO debug print
            println("Null KNode for state " + state.name + ", nothing to highlight!")
            return
        }
        val highlighting = new Highlighting(kNode, activeStateForeground, state)
        activeStateHighlightings.add(highlighting)
        highlighting.apply
    }
    
    def void highlightExecutingState(State state) {
        val kNode = DebugDiagramView.getInstance?.getKNode(state)
        if (kNode === null) {
            //TODO debug print
            println("Null KNode for state " + state.name + ", nothing to highlight!")
            return
        }
        val highlighting = new DebugHighlighting(kNode, executingStateBackground, state, DebugHighlighting.EXECUTING_STATE_TYPE)
        executingStateHighlightings.add(highlighting)
        highlighting.apply
    }
    
    def void unHighlightActiveState(State state) {
        val highlightings = activeStateHighlightings.filter[eObject.equals(state)]
        for (hl : highlightings) {
            hl.remove
        }
        activeStateHighlightings.removeAll(highlightings)
    }
    
    def void unHighlightExecutingState(State state) {
        val highlightings = executingStateHighlightings.filter[eObject.equals(state)]
        for (hl : highlightings) {
            hl.remove
        }
        executingStateHighlightings.removeAll(highlightings)
    }
 
    def void addBreakpointHighlight(State state) {
        val kNode = DebugDiagramView.getInstance?.getKNode(state)
        if (kNode === null) {
            //TODO debug print
            println("Null KNode for state " + state.name + ", nothing to highlight!")
            return
        }
        val highlighting = new DebugHighlighting(kNode, breakpointStateBackground, state, DebugHighlighting.BREAKPOINT_STATE_TYPE)
        breakpointHighlights.add(highlighting)
        highlighting.apply
    }
    
    def void removeBreakpointHighlight(State state) {
        val highlightings = breakpointHighlights.filter[eObject.equals(state)]
        for (hl : highlightings) {
            hl.remove
        }
        breakpointHighlights.removeAll(highlightings)
    }
    
    def void highlightExecutingTransition(Transition transition) {
        val kEdge = DebugDiagramView.getInstance?.getKEdge(transition)
        if (kEdge === null) {
            // TODO debug print
            println("Null KEdge for transition" + transition.toString + ", nothing to highlight!")
            return
        }
        val highlighting = new DebugHighlighting(kEdge, executingTransitionForeground, transition)
        activeEdgeHighlights.add(highlighting)
        highlighting.apply
    }
    
    def void unHighlightExecutingTransition(Transition transition) {
        val highlightings = activeEdgeHighlights.filter[eObject.equals(transition)]
        for (hl : highlightings) {
            hl.remove
        }
        activeEdgeHighlights.removeAll(highlightings)
    }
    
    def void addBreakpointDecorator(Transition transition) {
        val kEdge = DebugDiagramView.getInstance?.getKEdge(transition)
        if (kEdge === null) {
            // TODO debug print
            println("Null KEdge for transition" + transition.toString + ", nothing to highlight!")
            return
        }
        
        val ellipse = kEdge.KContainerRendering.addEllipse 
        ellipse.id = ellipseID
        ellipse.setDecoratorPlacementData(8,8,-4,0.5f,false)
        ellipse.setLineWidth(1)
        ellipse.setBackground(breakpointStateColor)
        transitionToDecorator.put(transition, ellipse)
    }
    
    def void removeBreakpointDecorator(Transition transition) {
        val ellipse = transitionToDecorator.get(transition)
        if (ellipse === null) {
            // TODO debug print
            print("Null map entry for transition " + transition + ", can't remove ellipse!")
        }
        val kEdge = DebugDiagramView.getInstance?.getKEdge(transition)
        kEdge.KContainerRendering.children.remove(ellipse)
        transitionToDecorator.remove(transition)
    }
}