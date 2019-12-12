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
 * @author stu121235
 *
 */
class SetBreakpointAction implements IAction {
    
    public static val ID = "de.cau.cs.kieler.sccharts.ui.debug.actions.setBreakpointAction"
    
    override execute(ActionContext context) {
        val selection = context.activeViewer.selection
        val viewContext = context.activeViewer.viewContext
        
        val selectedStates = selection.diagramElementsIterator.filter[it instanceof KNode].map[viewContext.getSourceElement(it) as State].toIterable
        val selectedTransitions = selection.diagramElementsIterator.filter[it instanceof KEdge].map[viewContext.getSourceElement(it) as Transition].toIterable
        
        for (state : selectedStates) {
            println("Selected state " + state.name)
            DebugBreakpointManager.instance.toggleBreakpoint(state)
        }
        
        for (transition : selectedTransitions) {
            println("Selected transition " + transition)
            DebugBreakpointManager.instance.toggleBreakpoint(transition)
        }
        
        ActionResult.createResult(false)
    }
    
}