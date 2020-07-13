/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.klighd.actions

import com.google.inject.Guice
import com.google.inject.Inject
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.KRoundedBendsPolyline
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.scg.klighd.ColorStore
import de.cau.cs.kieler.scg.klighd.SCGraphDiagramSynthesis
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property

import static de.cau.cs.kieler.scg.klighd.SCGraphSynthesisOptions.*

import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*

/**
 * Action class to display Strongly Connected Components in the SCG.
 * @author lpe
 *
 */
class SCCActions implements IAction {
    
    private final static String SCC_ID = "de.cau.cs.kieler.scg.klighd.actions.sccActions"
    
    public static final SynthesisOption SHOW_SCC = SynthesisOption::createCheckOption(SCCActions, "Strongly Connected Components", 
        true).setUpdateAction(SCC_ID).setCategory(PRIO);
        
    public static val IProperty<Boolean> P = new Property("id")
        
    @Inject extension KRenderingExtensions
    @Inject extension ColorStore
    /** Bound rendering extensions */
    extension KRenderingFactory = KRenderingFactory.eINSTANCE
            
    override execute(ActionContext context) {
        val viewContext = context.viewContext
        val rootNode = context.KNode
        
        for(node : rootNode.eAllContentsOfType(KNode).toIterable) {
            for(edge : node.outgoingEdges) {
                val container = edge.getData(typeof(KRoundedBendsPolyline))
                if(container.getProperty(SCGraphDiagramSynthesis.SCC_PROPERTY)) {
                    if(getBooleanValue(SHOW_SCC, viewContext)) {
                        container.lineWidth.lineWidth = getFloatValue(CONTROLFLOW_THICKNESS, viewContext) * 2
                        //container.foreground = STRONGLY_CONNECTED_COMPONENT_COLOR.copy   
                        val style = createKForeground().setColor2(ColorStore.Color.STRONGLY_CONNECTED_COMPONENT_COLOR.color)
                        style.properties.put(P, true)
                        style.propagateToChildren = true
                        container.styles += style                    
                    } else {
                        container.lineWidth.lineWidth = getFloatValue(CONTROLFLOW_THICKNESS, viewContext)
                        //container.foreground = STANDARD_CONTROLFLOWEDGE.copy
                        container.styles.removeIf[(properties.get(P)?:false) as Boolean]
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
    def getFloatValue(SynthesisOption option, ViewContext viewContext) {
        val value = viewContext.getOptionValue(option);
        if (value === null) {
            return 0f;
        } else if (value instanceof Float) {
            return value as Float;
        } else if (value instanceof Integer) {
            return (value as Integer).floatValue();
        } else {
            throw new IllegalArgumentException("KLighD transformation option handling: "
                    + "The transformation " + this
                    + " attempted to evaluate the non-Float valued transformation option "
                    + option.getName() + " expecting a float value.");
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