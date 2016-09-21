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
import de.cau.cs.kieler.core.krendering.KRoundedBendsPolyline
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.scg.klighd.SCGraphDiagramSynthesis
import de.cau.cs.kieler.klighd.ViewContext

import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Action class to display Strongly Connected Components in the SCG.
 * @author lpe
 *
 */
class SCCActions implements IAction {
    
    private final static String SCC_ID = "de.cau.cs.kieler.scg.klighd.actions.sccActions"
    
    public static final SynthesisOption SHOW_SCC = SynthesisOption::createCheckOption("Strongly Connected Components", 
        true).setUpdateAction(SCC_ID);
        
    @Inject
    extension KRenderingExtensions
            
    override execute(ActionContext context) {
        val viewContext = context.viewContext
        val rootNode = context.KNode
        
        for(node : rootNode.eAllContentsOfType(KNode).toIterable) {
            for(edge : node.outgoingEdges) {
                val container = edge.getData(typeof(KRoundedBendsPolyline))
                if(container.getProperty(SCGraphDiagramSynthesis.SCC_PROPERTY)) {
                    if(getBooleanValue(SHOW_SCC, viewContext)) {
                        container.lineWidth.lineWidth = getIntValue(SCGraphDiagramSynthesis.CONTROLFLOW_THICKNESS, viewContext) * 2
                        container.foreground = SCGraphDiagramSynthesis.STRONGLY_CONNECTED_COMPONENT_COLOR.copy                       
                    } else {
                        container.lineWidth.lineWidth = getIntValue(SCGraphDiagramSynthesis.CONTROLFLOW_THICKNESS, viewContext)
                        container.foreground = SCGraphDiagramSynthesis.STANDARD_CONTROLFLOWEDGE.copy
                    }
                }
            }
        }
        
        return ActionResult.createResult(true)
    }
    
    
    new(){
        Guice.createInjector.injectMembers(this)
    }
    
    /**
     * Convenience getter.
     *
     * @param option the option to evaluate the configuration state / the configured value.
     * @return the configured value of {@link SynthesisOption} option.
     */
    def getIntValue(SynthesisOption option, ViewContext viewContext) {
        val value = viewContext.getOptionValue(option);
        if (value == null) {
            return 0;

        } else if (value instanceof Float) {
            return (value as Float).intValue();

        } else  if (value instanceof Integer) {
            return value as Integer;

        } else {
            throw new IllegalArgumentException("KLighD transformation option handling: "
                    + "The transformation " + this
                    + " attempted to evaluate the non-Integer valued transformation option "
                    + option.getName() + " expecting a int value.");
        }
    }
    
    
    def getBooleanValue(SynthesisOption option, ViewContext viewContext) {
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