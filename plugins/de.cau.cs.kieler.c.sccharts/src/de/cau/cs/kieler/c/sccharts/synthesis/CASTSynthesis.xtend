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
package de.cau.cs.kieler.c.sccharts.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.ui.klighd.models.CodePlaceHolder
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.kicool.ui.klighd.syntheses.CodePlaceHolderSynthesis
import de.cau.cs.kieler.klighd.kgraph.KNode
import java.util.Collection
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.options.EdgeRouting
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.kicool.ProcessorReference
import de.cau.cs.kieler.kicool.ProcessorSystem
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import org.eclipse.elk.core.options.Direction
import de.cau.cs.kieler.klighd.krendering.Trigger

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import org.eclipse.elk.alg.layered.options.LayerConstraint
import de.cau.cs.kieler.kicool.ui.view.registry.KNodeExtensionsReplacement
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit
import org.eclipse.cdt.core.dom.ast.IASTNode
import java.util.List
import org.eclipse.cdt.internal.core.dom.parser.c.CASTProblem
import java.util.regex.Pattern

/**
 * @author ssm
 * @kieler.design 2018-06-01 proposed
 * @kieler.rating 2018-06-01 proposed yellow 
 */
@ViewSynthesisShared
class CASTSynthesis extends AbstractDiagramSynthesis<IASTTranslationUnit> {


    @Inject extension KNodeExtensionsReplacement
    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KColorExtensions
    
    public static val SynthesisOption SHOW_FULLY_QUALIFIED_NAMES = SynthesisOption::createCheckOption("Show Fully Qualified Names", false)
    public static val SynthesisOption SHOW_HUMAN_READABLE_NAMES = SynthesisOption::createCheckOption("Show Human Readable Names", true)
    
    val processorConnections = <String, Integer> newHashMap
    
    override getDisplayedSynthesisOptions() {
        <SynthesisOption> newLinkedList => [
            add(SHOW_FULLY_QUALIFIED_NAMES)
            add(SHOW_HUMAN_READABLE_NAMES)
        ]
    }    
    
    
    override transform(IASTTranslationUnit model) {
        val rootRootNode = model.createNode(0)
        val rootNode = model.createNode(1)
        processorConnections.clear
        
        rootRootNode.addLayoutParam(CoreOptions::ALGORITHM, LayeredOptions.ALGORITHM_ID)
        rootRootNode.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
        rootRootNode.setLayoutOption(CoreOptions::DIRECTION, Direction.DOWN)
        rootNode.addLayoutParam(CoreOptions::ALGORITHM, LayeredOptions.ALGORITHM_ID)
        rootNode.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
        rootNode.setLayoutOption(CoreOptions::DIRECTION, Direction.DOWN)
        rootNode.setLayoutOption(LayeredOptions::SPACING_NODE_NODE, 80d)
        rootNode.setLayoutOption(LayeredOptions::SPACING_NODE_NODE_BETWEEN_LAYERS, 80d)
        rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_NODE, 80d)
        rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_EDGE, 10d)
        rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_EDGE_BETWEEN_LAYERS, 40d)
        rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_NODE_BETWEEN_LAYERS, 40d)
        
        
        rootNode.children += model.children.createASTNodes(null)
        
        rootNode.addRoundedRectangle(0, 0, 1) => [
            foreground = "fff".color
//            it.addAction(Trigger.DOUBLECLICK, KLIGHD_ACTION_DEFOCUS_NODE)
        ]
        
        rootRootNode.children += rootNode
        rootRootNode
    }
    
    def List<KNode> createASTNodes(Iterable<IASTNode> nodes, KNode parentKNode) {
        val kNodes = <KNode> newLinkedList
        if(nodes === null) return kNodes
        
        for (node : nodes) {
            
            val kNode = node.createNode 
//            node.createPort("in") => [ node.ports += it ]
//            node.createPort("out") => [ node.ports += it ]
            
            kNode.setMinimalNodeSize(64, 64); // 2 x corner radius
            val content = kNode.addRoundedRectangle(4, 4, 1) => [
                // Mark this figure as container for further content
                setBackgroundGradient("#fff".color, "#ddd".color, 90);
                foreground = "#000".color;
//                it.addAction(Trigger.SINGLECLICK, KLIGHD_ACTION_FOCUS_NODE)
            ]
            
            content.addText(naming(node.toString)) => [
                fontSize = 32;
                // Add surrounding space
                setGridPlacementData().from(LEFT, 32, 0, TOP, 28, 0).to(RIGHT, 32, 0, BOTTOM, 28, 0);
                suppressSelectability
            ]                        
            
            if (node instanceof CASTProblem) {
                val prob = node as CASTProblem
                for (arg : prob.arguments) {
//                    System.out.println(indent + "     " + prob.message + " ");
                }
            }

            kNodes += kNode

            if (parentKNode !== null) {            
                kNode.createEdge(parentKNode) => [
                    source = parentKNode
                    target = kNode
//                    sourcePort = source.getPort("out")
//                    targetPort = target.getPort("in")
                    addPolyline => [
                        addHeadArrowDecorator
                        addJunctionPointDecorator
                        selectionLineWidth = 6f
                        selectionForeground = "#99f".color
                    ]
                ]
            }
            
            kNodes += node.children.createASTNodes(kNode)
        }
        
        return kNodes
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
    
}
