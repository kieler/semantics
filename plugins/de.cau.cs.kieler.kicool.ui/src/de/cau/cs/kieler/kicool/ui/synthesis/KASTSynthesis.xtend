/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.processors.ast.KAST
import de.cau.cs.kieler.kicool.processors.ast.KAST.KASTNode
import de.cau.cs.kieler.kicool.ui.view.registry.KNodeExtensionsReplacement
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import java.util.List
import java.util.regex.Pattern
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.EdgeRouting

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import de.cau.cs.kieler.kicool.processors.ast.KAST.KASTFieldReference
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.klighd.krendering.Colors
import org.eclipse.elk.core.options.SizeConstraint
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.kicool.processors.ast.KAST.KASTFieldValue

/**
 * @author ssm
 * @kieler.design 2018-06-01 proposed
 * @kieler.rating 2018-06-01 proposed yellow 
 */
@ViewSynthesisShared
class KASTSynthesis extends AbstractDiagramSynthesis<KAST> {


    @Inject extension KNodeExtensionsReplacement
    @Inject extension KEdgeExtensions
    @Inject extension KLabelExtensions
    @Inject extension KPortExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KColorExtensions
    
    public static val SynthesisOption EXPAND_DETAILS = SynthesisOption::createCheckOption(
            KASTSynthesis,"Expand all Details",
        false).setUpdateAction("de.cau.cs.kieler.klighd.ui.view.syntheses.action.EcoreModelExpandDetailsAction")
    public static val SynthesisOption SHOW_FULLY_QUALIFIED_NAMES = SynthesisOption::createCheckOption(
            KASTSynthesis, "Show Fully Qualified Names", false)
    public static val SynthesisOption SHOW_HUMAN_READABLE_NAMES = SynthesisOption::createCheckOption(
            KASTSynthesis, "Show Human Readable Names", true)
    
    val processorConnections = <String, Integer> newHashMap
    
    override getDisplayedSynthesisOptions() {
        <SynthesisOption> newLinkedList => [
            add(EXPAND_DETAILS)
            add(SHOW_FULLY_QUALIFIED_NAMES)
            add(SHOW_HUMAN_READABLE_NAMES)
        ]
    }    
    
    
    override transform(KAST model) {
        val rootRootNode = model.createNode(0)
        val rootNode = model.createNode(1)
        processorConnections.clear
        
        rootRootNode.addLayoutParam(CoreOptions::ALGORITHM, LayeredOptions.ALGORITHM_ID)
        rootRootNode.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
        rootRootNode.setLayoutOption(CoreOptions::DIRECTION, Direction.DOWN)
        rootNode.addLayoutParam(CoreOptions::ALGORITHM, LayeredOptions.ALGORITHM_ID)
        rootNode.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
        rootNode.setLayoutOption(CoreOptions::DIRECTION, Direction.DOWN)
//        rootNode.setLayoutOption(LayeredOptions::SPACING_NODE_NODE, 20d)
//        rootNode.setLayoutOption(LayeredOptions::SPACING_NODE_NODE_BETWEEN_LAYERS, 10d)
//        rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_NODE, 10d)
//        rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_EDGE, 10d)
//        rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_EDGE_BETWEEN_LAYERS, 40d)
//        rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_NODE_BETWEEN_LAYERS, 40d)
        
        
        rootNode.children += model.subKASTs.filter[ name == "main" ].head.createKAST(null)
        
        rootNode.addRoundedRectangle(0, 0, 1) => [
            foreground = "fff".color
//            it.addAction(Trigger.DOUBLECLICK, KLIGHD_ACTION_DEFOCUS_NODE)
        ]
        
        rootRootNode.children += rootNode
        rootRootNode
    }
    
    def List<KNode> createKAST(KAST kAST, KNode parentKNode) {
        val nodes = kAST.createKASTNodes(parentKNode)
        kAST.createKASTEdges(parentKNode)
        nodes
    }
    
    def List<KNode> createKASTNodes(KAST kAST, KNode parentKNode) {
        val kNodes = <KNode> newLinkedList
        if(kAST.nodes === null) return kNodes
        
        
        for (n : kAST.nodes) {
            val hasAttributes = !n.fields.filter(KASTFieldValue).empty
            
            val node = n.createNode
            node.associateWith(n)
        
            node.setLayoutOption(KlighdProperties::EXPAND, EXPAND_DETAILS.booleanValue);
            node.setLayoutOption(CoreOptions.NODE_SIZE_CONSTRAINTS, SizeConstraint.free);

            node.createFigure() => [
                it.setProperty(KlighdProperties::EXPANDED_RENDERING, true);
                it.setGridPlacement(1);

                // add name of object as text
                it.addText(n.name).associateWith(n) => [
                    it.fontSize = 11;
                    it.setFontBold(true);
                    it.setGridPlacementData().from(LEFT, 9, 0, TOP, 8f, 0).to(RIGHT, 8, 0, BOTTOM, 4, 0);
                    it.suppressSelectability;
                ];
    
                if (hasAttributes) {
                // collapse button
                it.addText("[Hide]") => [
                    it.foreground = "blue".color
                    it.fontSize = 9
                    it.addSingleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                    it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                    it.setGridPlacementData().from(LEFT, 8, 0, TOP, 0, 0).to(RIGHT, 8, 0, BOTTOM, 0, 0);
                ];
    
                    // Add Details
                    it.addRectangle => [
                        it.setGridPlacementData.from(LEFT, 8, 0, TOP, 0, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
                        it.setBackground = "white".color;
                        it.foreground = "gray".color
                        it.lineWidth = 1;
                        it.setGridPlacement(1);
    
                        // Content
                        val container = it;
                        // add all attributes as string representation
                        if (hasAttributes) {
//                            if (hasSuperTypes) {
//                                it.addHorizontalSeperatorLine(1, 1).foreground = "gray".color;
//                            }
                            it.addText("Attributes") => [
                                it.foreground = "gray".color;
                                it.fontSize = 8;
                                it.setGridPlacementData().from(LEFT, 5, 0, TOP, 2, 0).to(RIGHT, 5, 0, BOTTOM, 2, 0);
                                it.suppressSelectability;
                            ];
                            n.fields.filter(KASTFieldValue).forEach [
                                // add a text with name and value of the attribute
                                container.addText(it.name + ": " + it.value) => [
                                    it.fontSize = 9;
                                    it.setGridPlacementData().from(LEFT, 5, 0, TOP, 2, 0).to(RIGHT, 5, 0, BOTTOM, 2, 0);
                                    it.suppressSelectability;
                                ];
                            ]
                        }
                    ];
                }
            ];
    
            // Collapse Rectangle
            node.createFigure() =>
                [
                    it.setProperty(KlighdProperties::COLLAPSED_RENDERING, true);
                    it.setGridPlacement(1);
                    // add name of object as text
                    it.addText(n.name).associateWith(n) =>
                        [
                            it.fontSize = 11;
                            it.setFontBold(true);
                            it.setGridPlacementData().from(LEFT, 8, 0, TOP, 8, 0).to(RIGHT, 8, 0, BOTTOM,
                                if(hasAttributes) 4 else 8, 0);
                            it.suppressSelectability;
                        ];
                    if (hasAttributes) {
                        // Add details button
                        it.addText("[Details]") => [
                            it.foreground = "blue".color
                            it.fontSize = 9
                            it.addSingleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                            it.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                            it.setGridPlacementData().from(LEFT, 8, 0, TOP, 0, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0);
                        ];
                    }
                ];                   
            
            kNodes += node
        }
        
        return kNodes
    }
    
    def void createKASTEdges(KAST kAST, KNode parentKNode) {
        for (node : kAST.nodes) {
            for (field : node.fields.filter(KASTFieldReference)) {
                val edge = field.createEdge() => [
                    source = node.getNode
                    target = field.reference.getNode
//                    sourcePort = source.getPort("out")
//                    targetPort = target.getPort("in")
                    addPolyline => [
                        addHeadArrowDecorator
                        addJunctionPointDecorator
                        selectionLineWidth = 6f
                        selectionForeground = "#99f".color
                    ]
                ]
                edge.addTailEdgeLabel(field.name)
            }
        }      
    }
    
    protected def naming(String s) {
        if (!SHOW_FULLY_QUALIFIED_NAMES.booleanValue || SHOW_HUMAN_READABLE_NAMES.booleanValue) {
            val pattern = Pattern.compile("^.*\\.(.*)@.*");
            val matcher = pattern.matcher(s)
            if (matcher.find) {
                if (SHOW_HUMAN_READABLE_NAMES.booleanValue) {
                    var s2 = matcher.group(1).substring(4)
                    val p2 = Pattern.compile("[A-Z][a-z]*")    
                    val m2 = p2.matcher(s2)
                    var s3 = ""
                    while(m2.find) {
                        s3 = s3 + m2.group + " "                        
                    }
                    return s3.trim
                } else {
                    return matcher.group(1)
                }
            }
            return s          
        }
        return s
    }
    
    private def createFigure(KNode node) {
        val figure = node.addRoundedRectangle(8, 8, 1);
        figure.lineWidth = 1;
        figure.foreground = Colors.GRAY;
        figure.background = Colors.GRAY_95;

        // minimal node size is necessary if no text will be added
        node.setMinimalNodeSize(2 * figure.cornerWidth, 2 * figure.cornerHeight);
        
        return figure;
    }
    
}
