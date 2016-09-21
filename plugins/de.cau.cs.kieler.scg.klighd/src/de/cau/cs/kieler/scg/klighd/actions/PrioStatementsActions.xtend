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
package de.cau.cs.kieler.scg.klighd.actions

import com.google.inject.Guice
import com.google.inject.Inject
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.IAction.ActionContext
import de.cau.cs.kieler.klighd.IAction.ActionResult
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.ViewContext

import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*
import de.cau.cs.kieler.scg.klighd.SCGraphDiagramSynthesis

/**
 * Action class to display the prio statements in the SCG.
 * @author lpe
 *
 */
class PrioStatementsActions implements IAction {
        
    private static final String PRIO_STATEMENTS_ID    = "de.cau.cs.kieler.scg.klighd.actions.priorityStatements"
    
    @Inject
    extension KRenderingExtensions
    
    public static final SynthesisOption SHOW_PRIO_STATEMENTS = SynthesisOption::createCheckOption("Priority Statements", 
        true).setUpdateAction(PRIO_STATEMENTS_ID);
    
    
        
    override execute(ActionContext context) {
        val viewContext = context.contextViewer.viewContext
        val rootNode = context.KNode
        for(edge : rootNode.eAllContentsOfType(KEdge).toIterable) {
            if(!edge.labels.empty && 
                    edge.labels.head.KRendering.getProperty(SCGraphDiagramSynthesis.PRIO_STATEMENTS_PROPERTY)) {
                if(SHOW_PRIO_STATEMENTS.booleanValue(viewContext)) {
                    edge.labels.head.KRendering.invisible = false
                    
                } else {
                    edge.labels.head.KRendering.invisible = true
                }                
            }
        }
        
        ActionResult.createResult(true)
        
    }
    
    def booleanValue(SynthesisOption option, ViewContext viewContext) {
        val value = viewContext.getOptionValue(option)
        
        if(value == null) {
            return false
        } else if (value instanceof Boolean) {
            return value as Boolean;

        } else {
            throw new IllegalArgumentException("KLighD transformation option handling: "
                    + "The transformation " + this
                    + " attempted to evaluate the non-Boolean valued transformation option "
                    + option.getName() + " expecting a Boolean value.");
        }
    }
    
    new(){
        Guice.createInjector.injectMembers(this)
    }
    
    
}