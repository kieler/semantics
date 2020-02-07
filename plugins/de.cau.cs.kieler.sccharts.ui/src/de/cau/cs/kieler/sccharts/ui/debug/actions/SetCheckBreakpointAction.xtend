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
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.ui.debug.breakpoints.JavaBreakpointListener

/**
 * @author stu121235
 *
 */
class SetCheckBreakpointAction implements IAction {
    
    public static val ID = "de.cau.cs.kieler.sccharts.ui.debug.actions.setCheckBreakpointAction"
    
    override execute(ActionContext context) {
        println("setting check breakpoint.")
        val selection = context.activeViewer.selection
        val viewContext = context.activeViewer.viewContext
        
        // use getSourceElement() to retrieve selected states and transitions from selected view elements
        val selectedTransitions = selection.diagramElementsIterator.filter[it instanceof KEdge].map[viewContext.getSourceElement(it) as Transition].toIterable
        
        for (transition : selectedTransitions) {
            JavaBreakpointListener.instance.toggleCheckBreakpoint(transition)
        }
        
        ActionResult.createResult(false)
    }
    
    
    
}