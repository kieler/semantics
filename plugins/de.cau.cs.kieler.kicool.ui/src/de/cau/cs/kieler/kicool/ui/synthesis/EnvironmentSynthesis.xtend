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
package de.cau.cs.kieler.kicool.ui.synthesis

import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.model.properties.IProperty
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.alg.layered.options.FixedAlignment
import org.eclipse.elk.alg.layered.p4nodes.bk.EdgeStraighteningStrategy 
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.elk.alg.layered.options.WrappingStrategy
import org.eclipse.elk.core.math.KVector
import de.cau.cs.kieler.kicool.environments.EnvironmentPair
import java.util.List
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.klighd.krendering.SimpleUpdateStrategy
import de.cau.cs.kieler.klighd.LightDiagramServices
import org.eclipse.elk.core.options.Alignment
import org.eclipse.elk.core.options.PortSide
import de.cau.cs.kieler.klighd.SynthesisOption

/**
 * @author ssm
 * @kieler.design 2017-11-06 proposed 
 * @kieler.rating 2017-11-06 proposed yellow
 */
@ViewSynthesisShared
class EnvironmentSynthesis extends AbstractDiagramSynthesis<EnvironmentPair> {
    
    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensions  
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KColorExtensions    
    
    static val VALUE_STRING_MAX_LENGTH = 64
    
    // Options
    public static val SynthesisOption SHORTEN_VALUES = SynthesisOption::createCheckOption("Shorten Values", true)
        
    // Sidebar
    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHORTEN_VALUES);
    }

    override transform(EnvironmentPair model) {
        val rootNode = model.createNode
        
        rootNode.addLayoutParam(CoreOptions::ALGORITHM, LayeredOptions.ALGORITHM_ID)
        rootNode.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
        rootNode.setLayoutOption(LayeredOptions::NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED)
        rootNode.setLayoutOption(LayeredOptions::NODE_PLACEMENT_BK_EDGE_STRAIGHTENING, EdgeStraighteningStrategy.IMPROVE_STRAIGHTNESS)
        rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_NODE, LayeredOptions.SPACING_NODE_NODE.^default * 1.1f)
        rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_NODE_BETWEEN_LAYERS, LayeredOptions.SPACING_NODE_NODE.^default * 1.1f)     
//        rootNode.setLayoutOption(LayeredOptions::LAYERING_STRATEGY, LayeringStrategy::LONGEST_PATH)
        rootNode.setLayoutOption(LayeredOptions::WRAPPING_STRATEGY, WrappingStrategy.SINGLE_EDGE)
//        rootNode.setLayoutOption(LayeredOptions::MERGE_EDGES, true)
        rootNode.setLayoutOption(LayeredOptions::CROSSING_MINIMIZATION_SEMI_INTERACTIVE, true)
           
        
        val environmentNode = createNode
        val environmentFigure = environmentNode.createFigure(HighlightType.NO)
        val environmentPort = environmentNode.createPort => [ environmentNode.ports += it ]
        val environmentText = environmentFigure.addText("Environment").associateWith(model)
        environmentText.fontSize = 14
        environmentText.fontBold = true
        environmentText.setGridPlacementData().from(LEFT, 12, 0, TOP, 4, 0).to(RIGHT, 12, 0, BOTTOM, 4, 0)
        environmentPort.setLayoutOption(CoreOptions::PORT_SIDE, PortSide::EAST)
        rootNode.children += environmentNode
        
        for (property : model.target.allProperties.keySet.indexed) {
            
            val highlight = if (!model.source.allProperties.keySet.contains(property.value)) HighlightType.NEW
                else if (model.source.getProperty(property.value) == model.target.getProperty(property.value)) HighlightType.NO
                else HighlightType.CHANGE
            
            val propertyNode = property.value.addProperty(model.target, highlight)
            propertyNode.setProperty(LayeredOptions.POSITION, new KVector(0.0d, property.key * 100))
            propertyNode.setLayoutOption(LayeredOptions.ALIGNMENT, Alignment.LEFT)
            rootNode.children += propertyNode
            
            propertyNode.createEdge => [
                source = environmentNode
                target = propertyNode
                sourcePort = environmentPort
                addPolyline => [
                    addHeadArrowDecorator
                    addJunctionPointDecorator
                ]
            ]
            
            if (model.target.getProperty(property.value) instanceof List<?>) {
                
                val propertyPort = propertyNode.createPort => [ propertyNode.ports += it ]
                propertyPort.setLayoutOption(CoreOptions::PORT_SIDE, PortSide::EAST)
                
                for (listItem : (model.target.getProperty(property.value) as List<?>).indexed) {
                    val propertySubNode = listItem.value.addNewNode(property.value.id.toString + " " + listItem.key, 
                        listItem.value.toString, HighlightType.NO, listItem.value)
                    propertySubNode.setProperty(LayeredOptions.POSITION, new KVector(0.0d, listItem.key * 100))
                    rootNode.children += propertySubNode
                    
                    propertySubNode.createEdge => [
                        source = propertyNode
                        sourcePort = propertyPort
                        target = propertySubNode
                        addPolyline => [
                            addHeadArrowDecorator
                            addJunctionPointDecorator
                        ]
                    ]
                }
            }
            
        }
        
        rootNode
    }
    
    private def KNode addProperty(IProperty<?> property, Environment environment, HighlightType highlight) {
        property.addNewNode(property.id.toString, environment.getProperty(property).toString, highlight, environment.getProperty(property))
    }
    
    private def KNode addNewNode(Object object, String keyString, String valueString, HighlightType highlight, Object expandObject) {
        val node = object.createNode
        val figure = node.createFigure(highlight)
        
        val keyText = figure.addText(keyString).associateWith(object) 
        keyText.fontSize = 11
        keyText.fontBold = true
        keyText.setGridPlacementData().from(LEFT, 8, 0, TOP, 0, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0)
        
        val valueStringShortended = if (valueString.length > VALUE_STRING_MAX_LENGTH && SHORTEN_VALUES.booleanValue) 
            valueString.substring(0, VALUE_STRING_MAX_LENGTH - 3) + "..." 
            else valueString                
        val valueText = figure.addText(valueStringShortended)
        valueText.foreground = "blue".color
        valueText.fontSize = 9
        valueText.setGridPlacementData().from(LEFT, 8, 0, TOP, 20, 0).to(RIGHT, 8, 0, BOTTOM, 2, 0)
        
        // Actually, this should be an interface that indicates that there exists a synthesis for this.
        if (expandObject instanceof EObject || expandObject instanceof EnvironmentPair || expandObject instanceof CodeContainer) {
            node.addLayoutParam(KlighdProperties::EXPAND, false)
            figure.properties.put(KlighdProperties::COLLAPSED_RENDERING, true)
            figure.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND)
            figure.lineWidth = 3            
            
            val expandFigure = node.createFigure(highlight)
            expandFigure.properties.put(KlighdProperties::EXPANDED_RENDERING, true)
            expandFigure.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND) 
            
            val properties = new KlighdSynthesisProperties
            properties.setProperty(KlighdSynthesisProperties.REQUESTED_UPDATE_STRATEGY, SimpleUpdateStrategy.ID)
            val subDiagramViewContext = LightDiagramServices::translateModel2(expandObject, usedContext, properties)
            usedContext.addChildViewContext(subDiagramViewContext)
            val subDiagramNode = subDiagramViewContext.viewModel
             
            node.children.add(subDiagramNode)            
        }
        
        node
    }    
    
    private def createFigure(KNode node, HighlightType highlight) {
        val figure = node.addRoundedRectangle(8, 8, 1)
        figure.lineWidth = 1
        figure.foreground = if (highlight == HighlightType.NO) Colors.MEDIUM_SPRING_GREEN
            else Colors.RED
        figure.background = if (highlight == HighlightType.CHANGE) Colors.MISTY_ROSE_1
            else Colors.MINT_CREAM
        
        // minimal node size is necessary if no text will be added
        node.setMinimalNodeSize(2 * figure.cornerWidth, 2 * figure.cornerHeight)
        
        return figure
    }    
    
    
}

enum HighlightType {
    NO, NEW, CHANGE        
}