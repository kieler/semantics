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
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.scg.klighd.SCGraphDiagramSynthesis

import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*

/**
 * @author lpe
 *
 */
class NodePriorityActions implements IAction {
    
    private static final String NODE_ID    = "de.cau.cs.kieler.scg.klighd.actions.priorityActions"
    private static final String OPT_ID     = "de.cau.cs.kieler.scg.klighd.actions.priorityActions"
    private static final String THREAD_ID  = "de.cau.cs.kieler.scg.klighd.actions.priorityActions"
    
    @Inject
    extension KRenderingExtensions
    
    public static final SynthesisOption SHOW_NODE_PRIORITY = SynthesisOption::createCheckOption("Node Priorities", 
        true).setUpdateAction(NODE_ID);

    public static final SynthesisOption SHOW_OPT_PRIO_ID = SynthesisOption::createCheckOption("Optimized Priority IDs", 
        true).setUpdateAction(OPT_ID);
    
    
    public static final SynthesisOption SHOW_THREAD_PRIO = SynthesisOption::createCheckOption("Thread Priority IDs", 
        true).setUpdateAction(THREAD_ID);
    
    
    new(){
        Guice.createInjector.injectMembers(this)
    }
        
    override execute(ActionContext context) {
        val viewContext = context.contextViewer.viewContext
        val rootNode = context.KNode
        for (node : rootNode.eAllContentsOfType(KNode).toIterable) {
            if (viewContext.getSourceElement(node) != null) {
                val container = node.KContainerRendering
                for (text : container.children) {
                    if (text.getProperty(SCGraphDiagramSynthesis.NODE_PRIO_PROPERTY)) {
                        if (SHOW_NODE_PRIORITY.booleanValue(viewContext)) {
                            text.invisible = false
                        } else {
                            text.invisible = true
                        }
                    }
                    
                    if(text.getProperty(SCGraphDiagramSynthesis.OPT_PRIO_PROPERTY)) {
                        if(SHOW_OPT_PRIO_ID.booleanValue(viewContext)) {
                            text.invisible = false
                        } else {
                            text.invisible = true
                        }
                    }
                }
            } else {
                for(label : node.labels) {
                    if(label.KRendering.getProperty(SCGraphDiagramSynthesis.THREAD_PRIO_PROPERTY)) {
                        if(SHOW_THREAD_PRIO.booleanValue(viewContext)) {
                            label.KRendering.invisible = false
                        } else {
                            label.KRendering.invisible = true
                        }
                    }
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
    
    
    
}