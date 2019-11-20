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

/**
 * @author stu121235
 *
 */
class DebugHighlighter {
    
    
    static val factory = KRenderingFactory.eINSTANCE
    
    static val activeStateColor = factory.createKColor.setColor(0,0,255)
    static val activeStateForeground = factory.createKForeground.setColor2(activeStateColor)
    
    static val executingStateColor = factory.createKColor.setColor(0,255,0)
    static val executingStateForeground = factory.createKForeground.setColor2(executingStateColor)
    
    val activeStateHighlightings = <Highlighting> newLinkedList
    val executingStateHighlightings = <Highlighting> newLinkedList
    
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
        
    }
    
    def void unHighlightActiveState(State state) {
        val highlightings = activeStateHighlightings.filter[eObject.equals(state)]
        for (hl : highlightings) {
            hl.remove
        }
        activeStateHighlightings.removeAll(highlightings)
    }
    
    def void unHighlightExecutingState(State state) {
        
    }
 
    def void addBreakpointHighlight(State state) {
        
    }
    
    def void removeBreakpointHighlight(State state) {
        
    }
    
    def void addBreakpointDecorator(Transition transition) {
        
    }
    
    def void removeBreakpointDecorator(Transition transition) {
        
    }
}