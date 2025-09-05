/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.actions

import com.google.inject.Guice
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.actions.CollapseExpandAction
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.ui.synthesis.SCChartsSynthesis
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.TopdownLayoutHook
import java.util.EnumSet
import org.eclipse.elk.core.options.ContentAlignment
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.elk.core.options.TopdownNodeTypes
import org.eclipse.elk.graph.properties.MapPropertyHolder

/**
 * This Action provides the normal collapse expand behavior for a reference {@link State} and
 * synthesizes the referenced diagram on the first expansion of the node.
 * 
 * @author ssm als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
class ReferenceExpandAction extends CollapseExpandAction {

    @Inject extension SCChartsScopeExtensions
    
    /** The action id */
    public static val String ID = "de.cau.cs.kieler.sccharts.ui.synthesis.actions.ReferenceExpandAction"
    
    new() {
        Guice.createInjector().injectMembers(this)
    }

    override execute(ActionContext context) {
        if (context.KNode.children.empty) {
            val modelElement = context.getDomainElement(context.KNode);
            if (modelElement instanceof State) {
                val state = modelElement as State;
                if (state.isReferencingScope) {
                    val diagram = LightDiagramServices.translateModel(
                        state.reference.scope,
                        context.viewContext,
                        new MapPropertyHolder => [ 
                            setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS, "de.cau.cs.kieler.sccharts.ui.synthesis.ScopeSynthesis") 
                        ]
                    );
                    context.getKNode.children += diagram.children;
                }
            } else if (modelElement instanceof Region) {
                if (modelElement.isReferencingScope) {
                    val diagram = LightDiagramServices.translateModel(
                        modelElement.reference.scope.eContainer,
                        context.viewContext,
                        new MapPropertyHolder => [ 
                            setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS, "de.cau.cs.kieler.sccharts.ui.synthesis.ScopeSynthesis") 
                        ]
                    );
                    val node = diagram.children.head.children.findFirst[it.getProperty(KlighdInternalProperties.MODEL_ELEMEMT) == modelElement.reference.scope];
                    context.getKNode.children += node.children
                    context.getKNode.data += node.data
                }
            } else if (modelElement instanceof ValuedObjectReference) {
                val propagatedSkinPath = context.KNode.getProperty(SCChartsSynthesis.SKINPATH)
                
                val declaration = modelElement.valuedObject.eContainer
                if (declaration instanceof ReferenceDeclaration) {
                    val diagram = LightDiagramServices.translateModel(
                        declaration.reference,
                        context.viewContext, 
                        new MapPropertyHolder => [ 
                            setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS, "de.cau.cs.kieler.sccharts.ui.synthesis.ScopeSynthesis")
                            setProperty(SCChartsSynthesis.SKINPATH, propagatedSkinPath) 
                        ]                        
                    )
                    var extractedDataflow = diagram.children.head.children
                    if (extractedDataflow.empty) {
                        context.getKNode.children += diagram.children.head
                    } else {
                        context.getKNode.children += extractedDataflow
                        // Hack to configure top-down layout on this reference declaration, just like it is configured for all regions/states in the TopdownLayoutHook.
                        context.getKNode.setProperty(CoreOptions::TOPDOWN_LAYOUT, (context.viewContext.getOptionValue(TopdownLayoutHook.USE_TOPDOWN_LAYOUT) as Boolean).booleanValue)
                        if ((context.viewContext.getOptionValue(TopdownLayoutHook.USE_TOPDOWN_LAYOUT) as Boolean).booleanValue) {
                            context.getKNode.setProperty(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.noneOf(SizeConstraint))
                            context.getKNode.setProperty(CoreOptions::NODE_SIZE_FIXED_GRAPH_SIZE, true)
                            context.getKNode.setProperty(CoreOptions::TOPDOWN_NODE_TYPE, TopdownNodeTypes.HIERARCHICAL_NODE)
                            context.getKNode.setProperty(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_WIDTH, (context.viewContext.getOptionValue(TopdownLayoutHook.TOPDOWN_HIERARCHICAL_NODE_WIDTH) as Float).floatValue as double)
                            context.getKNode.setProperty(CoreOptions::TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO, (context.viewContext.getOptionValue(TopdownLayoutHook.TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO) as Float).floatValue as double)
                            context.getKNode.setProperty(CoreOptions::CONTENT_ALIGNMENT, EnumSet.of(ContentAlignment.V_CENTER, ContentAlignment.H_CENTER))
                            
                            if ((context.viewContext.getOptionValue(TopdownLayoutHook.SCALE_CAP) as Boolean).booleanValue) {
                                context.getKNode.setProperty(CoreOptions::TOPDOWN_SCALE_CAP, 1.0)
                            } else {
                                context.getKNode.setProperty(CoreOptions::TOPDOWN_SCALE_CAP, Double.MAX_VALUE)
                            }
                        }
                    }
                } 
            }
        }
        super.execute(context)
    }
}