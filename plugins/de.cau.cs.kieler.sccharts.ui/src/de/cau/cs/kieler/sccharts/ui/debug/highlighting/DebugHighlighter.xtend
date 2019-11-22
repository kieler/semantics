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
    
    static val breakpointStateColor = factory.createKColor.setColor(Colors.BLUE)
    static val breakpointStateBackground = factory.createKBackground.setColor2(breakpointStateColor)
    
    val activeStateHighlightings = <Highlighting> newLinkedList
    val executingStateHighlightings = <Highlighting> newLinkedList
    val breakpointHighlights = <Highlighting> newLinkedList
    
    static var DebugHighlighter instance 
    
    private new() {
        
    }
    
    static def DebugHighlighter getInstance() {
        if (instance === null) {
            instance = new DebugHighlighter
        }
        return instance
    }
    
    def void highlightActiveState(State state) {
        val kNode = DebugDiagramView.getInstance.getKNode(state)
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
        val kNode = DebugDiagramView.getInstance.getKNode(state)
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
        val kNode = DebugDiagramView.getInstance.getKNode(state)
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
    
    def void addBreakpointDecorator(Transition transition) {
        
    }
    
    def void removeBreakpointDecorator(Transition transition) {
        
    }
}