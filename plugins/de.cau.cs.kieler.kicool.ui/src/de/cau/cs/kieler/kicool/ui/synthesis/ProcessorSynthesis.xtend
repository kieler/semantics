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
import de.cau.cs.kieler.kicool.Processor
import de.cau.cs.kieler.kicool.ProcessorAlternativeGroup
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.ProcessorSystem
import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import java.net.URL
import java.util.List
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.Platform
import org.eclipse.elk.alg.layered.p4nodes.NodePlacementStrategy
import org.eclipse.elk.alg.layered.properties.LayeredOptions
import org.eclipse.elk.core.klayoutdata.KIdentifier
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.elk.graph.KNode
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.osgi.framework.Bundle
import static extension de.cau.cs.kieler.kicool.ui.synthesis.ProcessorDataManager.*

/**
 * Main diagram synthesis for SCCharts.
 * 
 * @author ssm
 * @kieler.design 2016-10-20 proposed 
 * @kieler.rating 2016-10-20 proposed yellow
 */
@ViewSynthesisShared
class ProcessorSynthesis {
    
    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions 
    @Inject extension KPolylineExtensions      
    @Inject extension ProcessorStyles 
    @Inject extension KiCoolSynthesis
    @Inject IResourceServiceProvider.Registry regXtext;      
    
    private def setID(KNode node, String id) {
        node.getData(KIdentifier).id = id
        node
    }
    
    protected def getProcessorKGT() {
        val Bundle bundle = Platform.getBundle("de.cau.cs.kieler.kicool.ui");
        val URL fileURL = bundle.getEntry("resources/processor.kgt");
        val absFile = FileLocator.resolve(fileURL)
        val newURI = URI.createFileURI(absFile.getFile)
        val provider = regXtext.getResourceServiceProvider(newURI)
        val newResourceSet = provider.get(XtextResourceSet)
        newResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.FALSE)
        val res = newResourceSet.createResource(newURI)
        try {
            res.load(newResourceSet.loadOptions)
            val node = (res.getContents().get(0) as KNode).children.head
//            val node = res.getContents().get(0) as KNode
            return node
        } catch (Exception e) {
            // 
        }         
        return createNode
    }
    
    dispatch def List<KNode> transform(Processor processor) {
        val processorNode = getProcessorKGT
        processorNode.setID(processor.id)
        processor.populateProcessorData(processorNode)
        
        newArrayList(processorNode)
    }
    
    dispatch def List<KNode> transform(ProcessorGroup processorGroup) {
        val groupNode = processorGroup.createNode.addProcessorGroupFigure
        
        groupNode.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.layered");
        groupNode.addLayoutParam(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL);
        groupNode.addLayoutParam(CoreOptions::DIRECTION, Direction::RIGHT);
        groupNode.addLayoutParam(LayeredOptions::NODE_PLACEMENT_STRATEGY, NodePlacementStrategy::BRANDES_KOEPF);
        groupNode.addLayoutParam(CoreOptions::SPACING_NODE, 20f);
        groupNode.addLayoutParam(CoreOptions::SPACING_BORDER, 8f);        
        
        var List<KNode> lastNodes = newArrayList()
        for(it : processorGroup.processors) {
            val processorNodes = it.transform
            groupNode.children += processorNodes
            for(node : processorNodes) {
                for(lastNode : lastNodes) {
                    val edge = createEdge 
                    edge.source = lastNode
                    edge.target = node
                    edge.addPolyline(1).addHeadArrowDecorator
                }
            }
            lastNodes.clear
            lastNodes += processorNodes
        }
        
        newArrayList(groupNode)
    }

    dispatch def List<KNode> transform(ProcessorAlternativeGroup processorAlternativeGroup) {
        val alternativeGroupNodes = <KNode> newArrayList()
     
        processorAlternativeGroup.processors.forEach[
            alternativeGroupNodes += it.transform
        ]
     
        alternativeGroupNodes   
    }
    
    
    protected def System getProcessorSystem(ProcessorSystem processorSystem) {
        val sl = processorSystem.eResource.URI.segmentsList
        val nsl = sl.take(sl.length - 1).drop(1)
        val newURI = URI.createPlatformResourceURI(nsl.join("/") + "/" + processorSystem.id + '.kico', false)   
        val provider = regXtext.getResourceServiceProvider(newURI)
        val newResourceSet = provider.get(XtextResourceSet)
        newResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.FALSE)
        val res = newResourceSet.createResource(newURI)
        try {
            res.load(newResourceSet.loadOptions)
            val node = (res.getContents().get(0) as System)
            return node
        } catch (Exception e) {
            // 
        }         
        return null
    }
    

    dispatch def List<KNode> transform(ProcessorSystem processorSystem) {
        val system = processorSystem.getProcessorSystem
        if (system != null) {
            val systemModel = system.transform
            return newArrayList(systemModel) 
        }
        return newArrayList(createNode)
    }
    
    
}