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
package de.cau.cs.kieler.kicool.ui.view.registry

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

/**
 * Generic synthesis for strings.
 * I use this for displaying messages in the model view.
 * 
 * @author ssm
 * @kieler.design 2016-10-20 proposed 
 * @kieler.rating 2016-10-20 proposed yellow
 */
@ViewSynthesisShared
class KiCoolRegistrySynthesis extends AbstractDiagramSynthesis<KiCoolRegistrySummary> {

    @Inject extension KNodeExtensionsReplacement
    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KColorExtensions
    
    public static val KIELER_QUALIFIED_NAME_PREFIX = "de.cau.cs.kieler."
    
    public static val SynthesisOption FULLY_QUALIFIED_KIELER_PREFIX = SynthesisOption::createCheckOption("Show KIELER Qualified Name Prefix", false)
    public static val SynthesisOption FULLY_QUALIFIED_PROCESSOR_NAMES = SynthesisOption::createCheckOption("Show Long Processor Names", false)
    
    override getDisplayedSynthesisOptions() {
        <SynthesisOption> newLinkedList => [
            add(FULLY_QUALIFIED_KIELER_PREFIX)
            add(FULLY_QUALIFIED_PROCESSOR_NAMES)
        ]
    }    
    
    val idNodeMap = <String, KNode> newHashMap
    
    override transform(KiCoolRegistrySummary model) {
        val rootNode = model.createNode
        
        rootNode.addLayoutParam(CoreOptions::ALGORITHM, LayeredOptions.ALGORITHM_ID)
        rootNode.setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
        rootNode.setLayoutOption(CoreOptions::DIRECTION, Direction.DOWN)
        
        
        rootNode.children += model.createSystemNodes
        rootNode.children += model.createProcessorNodes
        rootNode.children += model.connectSystemsWithProcessors
        rootNode.children += model.connectReferencedSystems
        
        rootNode
    }
    
    def protected Collection<KNode> createSystemNodes(KiCoolRegistrySummary model) {
        val result = <KNode> newLinkedList
        
        for (s : model.systemList) {
            val node = s.createNode.toIdNodeMap(s.id) 
            node.createPort("in") => [ node.ports += it ]
            node.createPort("out") => [ node.ports += it ]
            
            node.setMinimalNodeSize(34, 34); // 2 x corner radius
            val content = node.addRoundedRectangle(4, 4, 1) => [
                // Mark this figure as container for further content
                setBackgroundGradient("#fdd".color, "#f88".color, 90);
                foreground = "#000".color;
            ]
            
            content.addText(s.id.kielerPrefix) => [
                fontSize = 24;
                // Add surrounding space
                setGridPlacementData().from(LEFT, 32, 0, TOP, 28, 0).to(RIGHT, 32, 0, BOTTOM, 28, 0);
            ]            
            
            result += node
        }
        
        return result
    }
    
    def protected Collection<KNode> createProcessorNodes(KiCoolRegistrySummary model) {
        val result = <KNode> newLinkedList
        
        for (p : model.getProcessorIds) {
            val node = p.createNode.toIdNodeMap(p) 
            node.createPort("in") => [ node.ports += it ]
            node.createPort("out") => [ node.ports += it ]
            
            node.setMinimalNodeSize(34, 34); // 2 x corner radius
            val content = node.addRoundedRectangle(4, 4, 1) => [
                // Mark this figure as container for further content
                setBackgroundGradient("#fff".color, "#aaf".color, 90);
                foreground = "#000".color;
            ]
            
            var text = p.kielerPrefix
            if (!FULLY_QUALIFIED_PROCESSOR_NAMES.booleanValue) {
               val lastDot = p.lastIndexOf(".")
               if (lastDot > -1) {
                   text = p.substring(lastDot + 1)
               } 
            }
            
            content.addText(text) => [
                fontSize = 14;
                // Add surrounding space
                setGridPlacementData().from(LEFT, 14, 0, TOP, 14, 0).to(RIGHT, 14, 0, BOTTOM, 14, 0);
            ]            
            
            result += node
        }
        
        return result
    }
    
    def protected Collection<KNode> connectSystemsWithProcessors(KiCoolRegistrySummary model) {
        val result = <KNode> newLinkedList
        
        for (s : model.systemList) {
            val rList = s.eAllContents.filter(ProcessorReference).toList
            for (p : rList) {
                s.createEdge(p) => [
                    source = p.id.getNodeById
                    target = s.id.getNodeById
                    sourcePort = source.getPort("out")
//                    targetPort = target.getPort("in")
                    addPolyline => [
                        addHeadArrowDecorator
                        addJunctionPointDecorator
                    ]
                ]
            }
        }
        
        return result
    }
    
    def protected Collection<KNode> connectReferencedSystems(KiCoolRegistrySummary model) {
        val result = <KNode> newLinkedList
        
        for (s : model.systemList) {
            val rList = s.eAllContents.filter(ProcessorSystem).toList
            for (p : rList) {
                s.createEdge(p) => [
                    source = p.id.getNodeById
                    target = s.id.getNodeById
                    sourcePort = source.getPort("out")
//                    targetPort = target.getPort("in")
                    addPolyline => [
                        addHeadArrowDecorator
                        addJunctionPointDecorator
                    ]
                ]
            }
        }
        
        return result
    }    
        


    
    def private kielerPrefix(String s) {
        if (!FULLY_QUALIFIED_KIELER_PREFIX.booleanValue) {
            if (s.startsWith(KIELER_QUALIFIED_NAME_PREFIX)) {
                return s.substring(KIELER_QUALIFIED_NAME_PREFIX.length)
            }            
        }
        return s
    }
    
    def private toIdNodeMap(KNode node, String id) {
        idNodeMap.put(id, node)
        return node
    }
    
    def private getNodeById(String id) {
        return idNodeMap.get(id)
    }
    
}