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

import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.actions.CollapseExpandAction
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import org.eclipse.elk.graph.properties.MapPropertyHolder
import de.cau.cs.kieler.sccharts.ui.synthesis.EquationSynthesis
import de.cau.cs.kieler.sccharts.ui.synthesis.SCChartsSynthesis

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

    /** The action id */
    public static val String ID = "de.cau.cs.kieler.sccharts.ui.synthesis.actions.ReferenceExpandAction"

    override execute(ActionContext context) {
        if (context.KNode.children.empty) {
            val modelElement = context.getDomainElement(context.KNode);
            if (modelElement instanceof State) {
                val state = modelElement as State;
                if (state.reference !== null) {
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
                if (modelElement.reference !== null) {
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
                    }
                } 
            }
        }
        super.execute(context)
    }
}