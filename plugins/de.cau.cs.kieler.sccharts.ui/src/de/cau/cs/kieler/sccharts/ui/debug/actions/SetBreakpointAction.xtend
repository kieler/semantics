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
package de.cau.cs.kieler.sccharts.ui.debug.actions

import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.IAction.ActionContext
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.ui.debug.breakpoints.DebugBreakpointManager

/**
 * Double-Click action to allow setting breakpoints via the debug diagram view.
 * 
 * Note that this action only sets state and regular transition breakpoints;
 * For setting @code{TransitionCheckBreakpoints}, see {@link SetCheckBreakpointAction}.
 * 
 * @author peu
 *
 */
class SetBreakpointAction implements IAction {
    
    public static val ID = "de.cau.cs.kieler.sccharts.ui.debug.actions.setBreakpointAction"
    
    override execute(ActionContext context) {
        val selection = context.activeViewer.selection
        val viewContext = context.activeViewer.viewContext
        
        // use getSourceElement() to retrieve selected states and transitions from selected view elements
        val selectedStates = selection.diagramElementsIterator.filter[it instanceof KNode].map[viewContext.getSourceElement(it) as State].toIterable
        val selectedTransitions = selection.diagramElementsIterator.filter[it instanceof KEdge].map[viewContext.getSourceElement(it) as Transition].toIterable
        
        for (state : selectedStates) {
            DebugBreakpointManager.instance.toggleBreakpoint(state)
        }
        
        for (transition : selectedTransitions) {
            DebugBreakpointManager.instance.toggleBreakpoint(transition)
        }
        
        ActionResult.createResult(false)
    }
    
}