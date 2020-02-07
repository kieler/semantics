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
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.StateStyles
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KRectangle

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
    static val checkBreakpointColor = factory.createKColor.setColor(Colors.YELLOW)
    
    val activeStateHighlightings = <DebugHighlighting> newLinkedList
    val executingStateHighlightings = <DebugHighlighting> newLinkedList
//    val breakpointHighlights = <Highlighting> newLinkedList
    val activeEdgeHighlights = <DebugHighlighting> newLinkedList
    
    val transitionToDecorator = <Transition, KEllipse> newHashMap
    val transitionToCheckDecorator = <Transition, KEllipse> newHashMap
    val stateToEllipse = <State, KEllipse> newHashMap
    
    static val takenEllipseID = "Taken Ellipse"
    static val checkEllipseID = "Check Ellipse"
    static val stateEllipseID = "State Ellipse"
    
    @Inject extension KContainerRenderingExtensions
    @Inject extension KRenderingExtensions
    
    new() {
        Guice.createInjector.injectMembers(this)
    }
    
    def void clearAllHighlights() {
        for (hl : #[activeStateHighlightings, executingStateHighlightings, activeEdgeHighlights].flatten) {
            hl.remove
        }
        activeStateHighlightings.clear
        executingStateHighlightings.clear
        activeEdgeHighlights.clear
    }
    
    def void reapplyAllHighlights() {
        for (hl : #[activeStateHighlightings, executingStateHighlightings, activeEdgeHighlights].flatten) {
            hl.reapply
        }
    }
    
    def void toggleBreakpointBackground(State state) {
        if (stateToEllipse.containsKey(state)) {
            println("Removing state decorator")
            state.removeBreakpointDecorator
        } else {
            println("Adding state decorator")
            state.addBreakpointDecorator
        }
    }
    
    def void toggleBreakpointDecorator(Transition transition) {
        if (transitionToDecorator.containsKey(transition)) {
            println("Removing breakpoint decorator")
            transition.removeBreakpointDecorator
        } else {
            println("adding breakpoint decorator")
            transition.addBreakpointDecorator
        }
    }
    
    def void toggleWatchBreakpointDecorator(Transition transition) {
        if (transitionToCheckDecorator.containsKey(transition)) {
            transition.removeCheckBreakpointDecorator
        } else {
            transition.addCheckBreakpointDecorator
        }
    }
    
    def void highlightActiveState(State state) {
        val kNode = DebugDiagramView.getInstance?.getKNode(state)
        if (kNode === null) {
            //TODO debug print
            println("Null KNode for state " + state.name + ", nothing to highlight!")
            return
        }
        val highlighting = new DebugHighlighting(kNode, activeStateForeground, state)
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
        val highlighting = new DebugHighlighting(kNode, executingStateBackground, state)
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
        ellipse.id = takenEllipseID
        ellipse.setDecoratorPlacementData(8,8,-8,0.5f,false)
        ellipse.setLineWidth(1)
        ellipse.setBackground(breakpointStateColor)
        transitionToDecorator.put(transition, ellipse)
    }
    
    def void removeBreakpointDecorator(Transition transition) {
        val ellipse = transitionToDecorator.get(transition)
        if (ellipse === null) {
            // TODO debug print
            print("Null map entry for transition " + transition + ", can't remove ellipse!")
            return
        }
        val kEdge = DebugDiagramView.instance?.getKEdge(transition)
        kEdge.KContainerRendering.children.remove(ellipse)
        transitionToDecorator.remove(transition)
    }
    
    def void addCheckBreakpointDecorator(Transition transition) {
        val kEdge = DebugDiagramView.instance?.getKEdge(transition)
        if (kEdge === null) {
            // TODO debug print
            println("Null KEdge for transition" + transition + ", nothing to highlight!")
            return
        }
        val ellipse = kEdge.KContainerRendering.addEllipse 
        ellipse.id = checkEllipseID
        ellipse.setDecoratorPlacementData(8,8,0,0.5f,false)
//        ellipse.setGridPlacementData(8,8)
        ellipse.setLineWidth(1)
        ellipse.setBackground(checkBreakpointColor)
        transitionToCheckDecorator.put(transition, ellipse)
    }
    
    def void removeCheckBreakpointDecorator(Transition transition) {
        val ellipse = transitionToCheckDecorator.get(transition)
        if (ellipse === null) {
            // TODO debug print
            print("Null map entry for transition " + transition + ", can't remove ellipse!")
            return
        }
        val kEdge = DebugDiagramView.instance?.getKEdge(transition)
        kEdge.KContainerRendering.children.remove(ellipse)
        transitionToCheckDecorator.remove(transition)
    }
    
    def void addBreakpointDecorator(State state) {
        val kNode = DebugDiagramView.instance?.getKNode(state)
        if (kNode === null) {
            println("Null KNode for State " + state + ", nothing to highlight!")
            return
        }
        val contentContainer = kNode.getContentContainer
        // TODO breaks for simple states
        val rectangle = (contentContainer.children.head as KRectangle) as KRectangle
        
        val ellipse = factory.createKEllipse
        
        
        ellipse.id = stateEllipseID
        ellipse.setLineWidth(1)
        ellipse.setBackground(breakpointStateBackground)
        rectangle.addChild(ellipse)
        ellipse.setPointPlacementData(LEFT, 10, 0, TOP, 10, 0, H_CENTRAL, V_CENTRAL, 0, 0, 8, 8)
        
        stateToEllipse.put(state, ellipse)
    }
    
    def void removeBreakpointDecorator(State state) {
        val ellipse = stateToEllipse.get(state)
        if (ellipse === null) {
            println("Null map entry for state " + state + ", can't remove ellipse!")
            return
        }
        
        ellipse.parent.children.remove(ellipse)
        stateToEllipse.remove(state)
    }
    
    /**
     * Returns the content container of a state figure.
     */
    def getContentContainer(KNode node) {
        var KContainerRendering figure = node.getKContainerRendering;
        while (figure !== null) {
            if (figure.getProperty(StateStyles.IS_CONTENT_CONTAINER)) {
                return figure;
            } else {
                figure = figure.children.findFirst[it instanceof KContainerRendering] as KContainerRendering;
            }
        }
        return null
    }
}