/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.ui.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kicool.ui.kitt.tracing.TracingVisualizationProperties
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.actions.CollapseExpandAction
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.ControlflowRegionStyles
import de.cau.cs.kieler.scl.MethodImplementationDeclaration
import de.cau.cs.kieler.scl.SCLFactory
import de.cau.cs.kieler.scl.processors.transformators.SCLToSCGTransformation
import java.lang.reflect.Method
import java.util.EnumSet
import java.util.List
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.options.ContentAlignment
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.elk.graph.properties.MapPropertyHolder

import static extension de.cau.cs.kieler.annotations.ide.klighd.CommonSynthesisUtil.*
import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Transforms {@link Method} into {@link KNode} diagram elements.
 * 
 * @author als
 * 
 */
@ViewSynthesisShared
class MethodSynthesis extends SubSynthesis<MethodImplementationDeclaration, KNode> {

    @Inject extension KNodeExtensions
    @Inject extension KRenderingExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension ControlflowRegionStyles
    @Inject extension AdaptiveZoom
    extension SCLFactory = SCLFactory.eINSTANCE
    @Inject extension SCLToSCGTransformation

    override List<KNode> performTranformation(MethodImplementationDeclaration method) {
        val node = method.createNode().associateWith(method);
        
        //node.configureNodeLOD(method)

        // Set KIdentifier for use with incremental update
        if (!method.valuedObjects.head.name.nullOrEmpty) {
            node.KID = method.valuedObjects.head.name
        }
        
        node.initiallyCollapse

        val label = method.serializeHighlighted(true)

        // Expanded
        node.addMethodFigure => [
            setAsExpandedView
            associateWith(method)
            addDoubleClickAction(CollapseExpandAction.ID)
            if (method.declarations.empty) {
                addStatesArea(!label.nullOrEmpty);
            } else {
                addStatesAndDeclarationsAndActionsArea(!label.nullOrEmpty, method.declarations.size > 3);
                // Add declarations
                for (declaration : method.declarations) {
                    val declCopy = declaration.copy
                    declCopy.valuedObjects.forEach[initialValue = null] // Prevent dublicate initialization
                    addDeclarationLabel(declCopy.serializeHighlighted(true)) => [
                        setProperty(TracingVisualizationProperties.TRACING_NODE, true);
                        associateWith(declaration)
                        eAllContentsOfType2(KRendering).forEach[
                            associateWith(declaration)
                            if (it instanceof KText) configureTextLOD(declaration)
                        ]
                    ]
                }
            }
            if (method.schedule.size > 0) it.setUserScheduleStyle
            // Add Button after area to assure correct overlapping
            addCollapseButton(label) => [
                addSingleClickAction(CollapseExpandAction.ID)
                addDoubleClickAction(CollapseExpandAction.ID)
            ] 
//            if (!label.nullOrEmpty) children.filter(KText).forEach[configureTextLOD(region)]
        ]

        // Collapsed
        node.addMethodFigure => [
            setAsCollapsedView
            associateWith(method)
            if (method.schedule.size > 0) it.setUserScheduleStyle
            addDoubleClickAction(CollapseExpandAction.ID)
            addExpandButton(label) => [
                addSingleClickAction(CollapseExpandAction.ID)
                addDoubleClickAction(CollapseExpandAction.ID)
            ]
//            if (!label.nullOrEmpty) children.filter(KText).forEach[configureTextLOD(region)]
        ]
        node.setSelectionStyle

        val methodCopy = method.copy // To prevent mutation of model in editor
        val vos = newHashMap
        for (vo : methodCopy.eAllContents.filter(ValuedObjectReference).map[valuedObject].toSet) {
            vos.put(vo,vo)
        }
        
        val diagram = LightDiagramServices.translateModel(
            methodCopy.transformMethod(null, vos),
            usedContext,
            new MapPropertyHolder => [ 
                setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS, "de.cau.cs.kieler.scg.klighd.diagramSynthesis.scg") 
            ]
        )
        node.children += diagram.children
        node.properties.addAll(diagram.properties)
//        node.addLayoutParam(CoreOptions.PADDING, new ElkPadding(10, -10, 0, -10))

        node.setLayoutOption(CoreOptions::CONTENT_ALIGNMENT, ContentAlignment.topCenter())
        node.setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
        node.setLayoutOption(LayeredOptions.SPACING_NODE_NODE, 15.0)
        node.setLayoutOption(LayeredOptions.SPACING_NODE_NODE_BETWEEN_LAYERS, 15.0)
        node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE, 15.0)
        
        return newArrayList(node)
    }
   
}