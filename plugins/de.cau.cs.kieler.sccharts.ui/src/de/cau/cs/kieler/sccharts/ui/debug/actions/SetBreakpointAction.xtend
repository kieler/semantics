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
import de.cau.cs.kieler.sccharts.ui.debug.highlighting.DebugHighlighter

/**
 * @author stu121235
 *
 */
class SetBreakpointAction implements IAction {
    
    public static val ID = "de.cau.cs.kieler.sccharts.ui.debug.actions.setBreakpointAction"
    
    override execute(ActionContext context) {
        val selection = context.activeViewer.selection
        val viewContext = context.activeViewer.viewContext
        val elems = selection.diagramElementsIterator
        
        for (elem : elems.toIterable) {
            println("Elem " + elem)
        }
        val selectedStates = selection.diagramElementsIterator.filter[it instanceof KNode].map[viewContext.getSourceElement(it) as State].toList
        val selectedTransitions = selection.diagramElementsIterator.filter[it instanceof KEdge].map[viewContext.getSourceElement(it) as Transition].toList
        
        for (state : selectedStates) {
            println("Selected state " + state.name)
            DebugHighlighter.instance.toggleBreakpointBackground(state)
        }
        
        for (transition : selectedTransitions) {
            println("Selected transition " + transition)
            DebugHighlighter.instance.toggleBreakpointDecorator(transition)
        }
        
        ActionResult.createResult(false)
    }
    
}