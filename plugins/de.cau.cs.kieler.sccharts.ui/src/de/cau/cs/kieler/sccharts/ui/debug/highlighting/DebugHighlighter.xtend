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
import de.cau.cs.kieler.klighd.krendering.KForeground
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.ui.debug.breakpoints.ModelBreakpointManager

/**
 * This class is responsible for processing the highlightings for a set model.
 * It remembers all highlightings it applies along with the associated model elements.
 * This way, it is possible to add / remove / reapply highlightings based on the model elements.
 * 
 * @author peu
 *
 */
class DebugHighlighter {
    
    static val factory = KRenderingFactory.eINSTANCE
    
    /* COLORS ****************************************************************************************/
    static val activeStateColor = factory.createKColor.setColor(Colors.RED)
    static val activeStateForeground = factory.createKForeground.setColor2(activeStateColor)
    
    static val executingStateColor1 = factory.createKColor.setColor(215, 238, 188)
    static val executingStateColor2 = factory.createKColor.setColor(180, 200, 158)
    static val executingStateBackground = factory.createKBackground.setColors(executingStateColor1, executingStateColor2, 90)
    static val executingTransitionForeground = factory.createKForeground.setColor2(EcoreUtil.copy(executingStateColor2)).setPropagateToChildren
    
    static val breakpointStateColor = factory.createKColor.setColor(Colors.BLUE)
    static val breakpointStateBackground = factory.createKBackground.setColor2(breakpointStateColor)
    static val checkBreakpointColor = factory.createKColor.setColor(Colors.YELLOW)
    
    /* BOOKKEEPING ***********************************************************************************/
    val activeStateHighlightings = <DebugHighlighting> newLinkedList
    val executingStateHighlightings = <DebugHighlighting> newLinkedList
    val activeEdgeHighlights = <DebugHighlighting> newLinkedList
    
    val transitionToDecorator = <Transition, KEllipse> newHashMap
    val transitionToCheckDecorator = <Transition, KEllipse> newHashMap
    val stateToEllipse = <State, KEllipse> newHashMap
    
    static val takenEllipseID = "Taken Ellipse"
    static val checkEllipseID = "Check Ellipse"
    static val stateEllipseID = "State Ellipse"
    
    /* INJECTIONS ************************************************************************************/
    @Inject extension KContainerRenderingExtensions
    @Inject extension KRenderingExtensions

    /* CONSTRUCTOR ***********************************************************************************/    
    new() {
        Guice.createInjector.injectMembers(this)
    }
    
    /*************************************************************************************************
     * G L O B A L   O P E R A T I O N S *************************************************************
     *************************************************************************************************/
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
    
    def void reloadModel(SCCharts model, ModelBreakpointManager manager) {
        // Breakpoints are handled by ModelBreakpointManager.reloadModel() already
        
        // Active States
        for (hl : #[activeStateHighlightings, executingStateHighlightings].flatten) {
            hl.eObject = manager.getMatchingState(model, hl.eObject as State)
        }
        for (hl : activeEdgeHighlights) {
            hl.eObject = manager.getMatchingTransition(model, hl.eObject as Transition)
        }
        reapplyAllHighlights
    }
    
    /*************************************************************************************************
     * S T A T E   O P E R A T I O N S ***************************************************************
     *************************************************************************************************/
    
    /* ACTIVE STATES *********************************************************************************/
    def void highlightActiveState(State state) {
        // Caution: kNode may be null if there is no debug diagram view.
        // Reapply will handle this as soon as one is opened.
        val kNode = DebugDiagramView.getInstance?.getKNode(state)
        val highlighting = new DebugHighlighting(kNode, activeStateForeground, state)
        activeStateHighlightings.add(highlighting)
        highlighting.apply
    }
    
    def void unHighlightActiveState(State state) {
        val highlightings = activeStateHighlightings.filter[eObject.equals(state)]
        for (hl : highlightings) {
            hl.remove
        }
        activeStateHighlightings.removeAll(highlightings)
    }
    
    /* EXECUTING STATES ******************************************************************************/
    def void highlightExecutingState(State state) {
        // Caution: kNode may be null if there is no debug diagram view.
        // Reapply will handle this as soon as one is opened.
        val kNode = DebugDiagramView.getInstance?.getKNode(state)
        val highlighting = new DebugHighlighting(kNode, executingStateBackground, state)
        executingStateHighlightings.add(highlighting)
        highlighting.apply
    }
        
    def void unHighlightExecutingState(State state) {
        val highlightings = executingStateHighlightings.filter[eObject.equals(state)]
        for (hl : highlightings) {
            hl.remove
        }
        executingStateHighlightings.removeAll(highlightings)
    }
    
    /* BREAKPOINTS ***********************************************************************************/
    def void addBreakpointDecorator(State state) {
        val kNode = DebugDiagramView.instance?.getKNode(state)
        if (kNode === null) {
            println("Null KNode for State " + state + ", nothing to highlight!")
            return
        }
        val contentContainer = kNode.getContentContainer
        val firstChild = contentContainer.children.head
        var KContainerRendering ellipseTarget
        if (firstChild instanceof KRectangle) {
            ellipseTarget = firstChild
        } else {
            ellipseTarget = contentContainer
        }
        
        val ellipse = factory.createKEllipse
        ellipse.id = stateEllipseID
        ellipse.setLineWidth(1)
        ellipse.setBackground(breakpointStateBackground)
        ellipseTarget.addChild(ellipse)
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
    
    /*************************************************************************************************
     * T R A N S I T I O N   O P E R A T I O N S *****************************************************
     *************************************************************************************************/
    
    /* EXECUTING TRANSITIONS *************************************************************************/
    def void highlightExecutingTransition(Transition transition) {
        // Caution: kEdge may be null if there is no debug diagram view.
        // Reapply will handle this as soon as one is opened.
        val kEdge = DebugDiagramView.getInstance?.getKEdge(transition)
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
    
    /* CHECK BREAKPOINTS *****************************************************************************/
    def void toggleCheckBreakpointDecorator(Transition transition) {
        if (transitionToCheckDecorator.containsKey(transition)) {
            transition.removeCheckBreakpointDecorator
        } else {
            transition.addCheckBreakpointDecorator
        }
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
    
    /* TAKEN BREAKPOINTS *****************************************************************************/
    def void toggleBreakpointDecorator(Transition transition) {
        if (transitionToDecorator.containsKey(transition)) {
            println("Removing breakpoint decorator")
            transition.removeBreakpointDecorator
        } else {
            println("adding breakpoint decorator")
            transition.addBreakpointDecorator
        }
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
    
    /*************************************************************************************************
     * H E L P E R   M E T H O D S *******************************************************************
     *************************************************************************************************/
    
    /**
     * Returns the content container of a state figure.
     */
    private def getContentContainer(KNode node) {
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
    
    private static def setPropagateToChildren(KForeground foreground) {
        foreground.propagateToChildren = true
        foreground
    }
}