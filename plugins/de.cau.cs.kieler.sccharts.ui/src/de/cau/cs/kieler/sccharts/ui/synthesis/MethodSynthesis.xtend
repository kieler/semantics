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
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kicool.ui.kitt.tracing.TracingVisualizationProperties
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.actions.CollapseExpandAction
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.ControlflowRegionStyles
import de.cau.cs.kieler.scl.MethodImplementationDeclaration
import de.cau.cs.kieler.scl.Return
import de.cau.cs.kieler.scl.SCLFactory
import de.cau.cs.kieler.scl.Scope
import java.lang.reflect.Method
import java.util.List
import org.eclipse.elk.core.math.ElkPadding
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.graph.properties.MapPropertyHolder
import org.eclipse.emf.ecore.util.EcoreUtil.Copier

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension de.cau.cs.kieler.klighd.util.ModelingUtil.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scl.processors.transformators.SCLToSCGTransformation

/**
 * Transforms {@link Method} into {@link KNode} diagram elements.
 * 
 * @author als
 * 
 */
@ViewSynthesisShared
class MethodSynthesis extends SubSynthesis<MethodImplementationDeclaration, KNode> {

    @Inject extension KNodeExtensionsReplacement
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
            node.data += KGraphFactory::eINSTANCE.createKIdentifier => [it.id = method.valuedObjects.head.name]
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
                    addDeclarationLabel(declaration.serializeHighlighted(true)) => [
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
            addCollapseButton(label).addDoubleClickAction(CollapseExpandAction.ID)
//            if (!label.nullOrEmpty) children.filter(KText).forEach[configureTextLOD(region)]
        ]

        // Collapsed
        node.addMethodFigure => [
            setAsCollapsedView
            associateWith(method)
            if (method.schedule.size > 0) it.setUserScheduleStyle
            addDoubleClickAction(CollapseExpandAction.ID)
            addExpandButton(label).addDoubleClickAction(CollapseExpandAction.ID)
//            if (!label.nullOrEmpty) children.filter(KText).forEach[configureTextLOD(region)]
        ]
        
        node.setSelectionStyle

//         Add inner scg
//        val module = createModule
//        module.name = method.valuedObjects.head.name
//        val copier = new Copier()
//        val copy = copier.copy(method) as Scope
//        copier.copyReferences()
//        module.statements.addAll(copy.statements)
//        module.statements.removeIf[it instanceof Return]
//        val vos = newHashMap
//        for (entry : copier.entrySet) {
//            if (entry.key instanceof ValuedObjectReference) {
//                val vor = entry.key as ValuedObjectReference
//                val vorCopy = entry.value as ValuedObjectReference
//                if (!vos.containsKey(vor.valuedObject)) {
//                    val declCopy = vor.valuedObject.eContainer.copy as Declaration
//                    declCopy.valuedObjects.removeIf[!it.name.equals(vor.valuedObject.name)]
//                    module.declarations += declCopy
//                    vos.put(vor.valuedObject, declCopy.valuedObjects.head)
//                }
//                vorCopy.valuedObject = vos.get(vor.valuedObject)
//            }
//        }
//        val program = createSCLProgram
//        program.modules += module

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
            
        
        return newArrayList(node)
    }
   
}