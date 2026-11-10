/*  * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.ui.synthesis

import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.NamedObject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsAccessVisibilityExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kicool.ide.klighd.KiCoDiagramViewProperties
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KPolyline
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.LineCap
import de.cau.cs.kieler.klighd.krendering.LineJoin
import de.cau.cs.kieler.klighd.krendering.LineStyle
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.PositionReferenceX
import de.cau.cs.kieler.klighd.krendering.extensions.PositionReferenceY
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsInheritanceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsReferenceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.text.validation.OOClassAnnotations
import de.cau.cs.kieler.sccharts.text.validation.OOClassAnnotations.ClassType
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.StateStyles
import java.util.List
import java.util.Map
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction

import static extension de.cau.cs.kieler.annotations.ide.klighd.CommonSynthesisUtil.*
import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.setLayoutOption

/**
 * SCCharts Synthesis as flat class diagrams.
 * 
 * @author als
 */
@ViewSynthesisShared
class ClassDiagramEdgeSynthesis {

    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KLabelExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension SCChartsInheritanceExtensions
    @Inject extension SCChartsReferenceExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsAccessVisibilityExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension PragmaExtensions
    @Inject extension StateStyles
    @Inject extension KPolylineExtensions
    @Inject extension CommentSynthesis
    @Inject extension OOClassAnnotations
    
    
    def void addInheritanceEdges(KNode rootNode, Map<State, KNode> stateNodeMap) {
        rootNode.setLayoutOption(CoreOptions::DIRECTION, Direction.UP)
        rootNode.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 20.0)
        rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_NODE_BETWEEN_LAYERS, 28.0)
        rootNode.setLayoutOption(LayeredOptions::SPACING_NODE_NODE_BETWEEN_LAYERS, 28.0)
        for(state : stateNodeMap.keySet) {
            for (base : state.baseStates) {
                val edge = createEdge
                edge.source = stateNodeMap.get(state)
                edge.target = stateNodeMap.get(base)
                edge.addPolyline => [
                    lineWidth = 1
                    addInheritanceTriangleArrowDecorator
                    if (base.classType === ClassType.INTERFACE && state.classType !== ClassType.INTERFACE) {
                        lineStyle = LineStyle.DASH
                    }
                ]
            }
        }
    }
    
    def void addAssociationEdges(KNode rootNode, Map<State, KNode> stateNodeMap, boolean reverse, boolean multiplicities, boolean reference) {
        rootNode.setLayoutOption(CoreOptions::DIRECTION, Direction.UP)
        rootNode.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 20.0)
        rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_NODE_BETWEEN_LAYERS, 28.0)
        rootNode.setLayoutOption(LayeredOptions::SPACING_NODE_NODE_BETWEEN_LAYERS, 28.0)
        rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_LABEL, 5.0)
        
        for(state : stateNodeMap.keySet) {
            val aggregation = HashMultimap.create
            
            for (ref : state.declarations.filter(ReferenceDeclaration)) {
                if (ref.reference instanceof State) {
                    aggregation.put(ref.reference as State, ref)
                }
            }
            for (inner : state.allScopes.toIterable) {
                if (inner !== state) {
                    if (inner instanceof State) {
                        if (!inner.baseStateReferences.nullOrEmpty) {
                            for (base : inner.baseStates) {
                                aggregation.put(base, inner)
                            }
                        }
                        if (inner.isReferencing && inner.reference.target instanceof State) {
                            aggregation.put(inner.reference.target as State, inner.reference)
                        }
                    }
                    for (ref : state.declarations.filter(ReferenceDeclaration)) {
                        if (ref.reference instanceof State) {
                            aggregation.put(ref.reference as State, ref)
                        }
                    }
                }
            }
            
            for (target : aggregation.keySet) {
                val sources = aggregation.get(target)
                val decls = sources.filter(ReferenceDeclaration).filter[!it.input].toList
                val inputDecls = sources.filter(ReferenceDeclaration).filter[it.input].toList
                val otherCount = sources.size - (decls.size + inputDecls.size)
                
                if (!inputDecls.empty) {
                    val multipLabel = inputDecls.multiplicitiesLabel(0)
                    val refLabel = inputDecls.map[valuedObjects].flatten.map[it.name].join("\n")
                     
                    val edge = createEdge
                    edge.addPolyline => [
                        lineWidth = 1
                        addAssociationArrowDecorator(reverse)
                    ]
                    
                    if (reverse) {
                        edge.source = stateNodeMap.get(target)
                        edge.target = stateNodeMap.get(state)
                        if (reference) {
                            edge.addAssociationLabel(refLabel, true)
                        }
                        if (multiplicities) {
                            edge.addAssociationLabel(multipLabel, false)
                        }
                    } else {
                        edge.source = stateNodeMap.get(state)
                        edge.target = stateNodeMap.get(target)
                        if (reference) {
                            edge.addAssociationLabel(refLabel, false)
                        }
                        if (multiplicities) {
                            edge.addAssociationLabel(multipLabel, true)
                        }
                    }
                }
                if (!decls.empty || otherCount > 0) {
                    val multipLabel = decls.multiplicitiesLabel(otherCount)
                    val refLabel = decls.map[valuedObjects].flatten.map[it.name].join("\n")
                     
                    val edge = createEdge
                    edge.addPolyline => [
                        lineWidth = 1
                        addAggregationArrowDecorator(reverse, false)
                    ]
                    
                    if (reverse) {
                        edge.source = stateNodeMap.get(target)
                        edge.target = stateNodeMap.get(state)
                        if (reference) {
                            edge.addAssociationLabel(refLabel, true)
                        }
                        if (multiplicities) {
                            edge.addAssociationLabel(multipLabel, false)
                        }
                    } else {
                        edge.source = stateNodeMap.get(state)
                        edge.target = stateNodeMap.get(target)
                        if (reference) {
                            edge.addAssociationLabel(refLabel, false)
                        }
                        if (multiplicities) {
                            edge.addAssociationLabel(multipLabel, true)
                        }
                    }
                }
            }
        }
    }
    
    protected def addAssociationLabel(KEdge edge, String text, boolean head) {
        val label = edge.createLabel()
        if (head) {
            label.configureHeadEdgeLabel(text)
        } else {
            label.configureTailEdgeLabel(text)
        }
        return label
    }
    
    
    protected def String multiplicitiesLabel(List<ReferenceDeclaration> declarations, int start) {
        var count = start
        val arrays = newArrayList
        for (d : declarations) {
            for (vo : d.valuedObjects) {
                if (vo.cardinalities.empty) {
                    count++
                } else {
                    arrays += vo.cardinalities.map[it.serializeHR.toString].join(" * ")
                }
            }
        }
        val sb = new StringBuilder
        if (count > 1) {
            sb.append(count)
        }
        if (!arrays.empty) {
            if (count > 1) {
                sb.append(" + ")
            }
            sb.append(arrays.map[it].join(" + "))
        }
        return sb.toString
    }
    
    protected def addAggregationArrowDecorator(KPolyline line, boolean reverse, boolean composite) {
        line.lineCap = LineCap::CAP_FLAT
        KRenderingFactory.eINSTANCE.createKPolygon => [
            line.addChild(it).withCopyOf(line.lineWidth).withCopyOf(line.foreground).setBackground(line.foreground).setLineJoin(LineJoin::JOIN_ROUND)
            points += createKPosition(PositionReferenceX::LEFT, 0, 0, PositionReferenceY::TOP, 0, 0.5f)
            points += createKPosition(PositionReferenceX::LEFT, 0, 0.5f, PositionReferenceY::TOP, 0, 0)
            points += createKPosition(PositionReferenceX::RIGHT, 0, 0, PositionReferenceY::BOTTOM, 0, 0.5f)
            points += createKPosition(PositionReferenceX::RIGHT, 0, 0.5f, PositionReferenceY::BOTTOM, 0, 0)
            
            placementData = KRenderingFactory.eINSTANCE.createKDecoratorPlacementData => [
                it.rotateWithLine = true;
                it.relative = reverse ? 1f : 0f
                it.absolute = 0f
                it.width = 16
                it.height = 10
                it.setXOffset(reverse ? -16f : 0f)
                it.setYOffset(-5f)
            ]
            
            if (!composite) {
                background = Colors.WHITE
            }
        ]
    }
    
    protected def addAssociationArrowDecorator(KPolyline line, boolean reverse) {
        line.lineCap = LineCap::CAP_FLAT
        KRenderingFactory.eINSTANCE.createKPolygon => [
            line.addChild(it).withCopyOf(line.lineWidth).withCopyOf(line.foreground).setBackground(Colors.WHITE).setLineJoin(LineJoin::JOIN_ROUND)
            if (reverse) {
                points += createKPosition(PositionReferenceX::RIGHT, 0, 0, PositionReferenceY::TOP, 0, 0)
                points += createKPosition(PositionReferenceX::LEFT, 0, 0, PositionReferenceY::TOP, 0, 0.5f)
                points += createKPosition(PositionReferenceX::RIGHT, 0, 0, PositionReferenceY::BOTTOM, 0, 0)
                points += createKPosition(PositionReferenceX::LEFT, 0, 0, PositionReferenceY::TOP, 0, 0.5f)
                points += createKPosition(PositionReferenceX::RIGHT, 0, 0, PositionReferenceY::TOP, 0, 0)
            } else {
                points += createKPosition(PositionReferenceX::LEFT, 0, 0, PositionReferenceY::TOP, 0, 0)
                points += createKPosition(PositionReferenceX::RIGHT, 0, 0, PositionReferenceY::TOP, 0, 0.5f)
                points += createKPosition(PositionReferenceX::LEFT, 0, 0, PositionReferenceY::BOTTOM, 0, 0)
                points += createKPosition(PositionReferenceX::RIGHT, 0, 0, PositionReferenceY::TOP, 0, 0.5f)
                points += createKPosition(PositionReferenceX::LEFT, 0, 0, PositionReferenceY::TOP, 0, 0)
            }
            
            placementData = KRenderingFactory.eINSTANCE.createKDecoratorPlacementData => [
                it.rotateWithLine = true;
                it.relative = reverse ? 0f : 1f
                it.absolute = 0f
                it.width = 8
                it.height = 10
                it.setXOffset(reverse ? 0f : -8f)
                it.setYOffset(-5f)
            ]
        ]
    }
}
