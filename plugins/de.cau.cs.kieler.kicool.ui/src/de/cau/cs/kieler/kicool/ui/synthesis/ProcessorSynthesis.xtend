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
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.osgi.framework.Bundle
import static extension de.cau.cs.kieler.kicool.ui.synthesis.ProcessorDataManager.*
import de.cau.cs.kieler.kicool.ProcessorEntry
import org.eclipse.elk.core.util.ElkUtil
import de.cau.cs.kieler.kicool.ui.KiCoolUiModule
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KIdentifier
import org.eclipse.elk.core.math.ElkPadding
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration

/**
 * Main diagram synthesis for processors in KiCool.
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
    
    static private val PROCESSOR_KGT = "resources/processor.kgt"
    static private val PROCESSOR_GROUP_KGT = "resources/processor_group.kgt"
    static private val COLLAPSED_ID = "collapsed"
    static private val EXPANDED_ID = "expanded" 
    
    private def setId(KNode node, String id) {
        node.getData(KIdentifier).id = id
        node
    }
    
    static def uniqueProcessorId(ProcessorEntry processor) {
        processor.id + "#" + processor.hashCode
    }
    

    dispatch def List<KNode> transform(Processor processor) {
        val processorNode = KiCoolSynthesis.getKGTFromBundle(KiCoolUiModule.BUNDLE_ID, PROCESSOR_KGT)
        val nodeId = processor.uniqueProcessorId
        processorNode.setId(nodeId)
        processor.populateProcessorData(processorNode)
        
        newArrayList(processorNode)
    }
    
    dispatch def List<KNode> transform(ProcessorGroup processorGroup) {
        val groupNode = KiCoolSynthesis.getKGTFromBundle(KiCoolUiModule.BUNDLE_ID, PROCESSOR_GROUP_KGT)
        
        val collapsedRendering = groupNode.eContents.filter(KRoundedRectangle).filter[ COLLAPSED_ID.equals(id) ].head
        val expandedRendering = groupNode.eContents.filter(KRoundedRectangle).filter[ EXPANDED_ID.equals(id) ].head
        
        var label = processorGroup.label
        if (processorGroup.eContainer instanceof System) label = (processorGroup.eContainer as System).label
        collapsedRendering.eContents.filter(KText).head.text = label
        expandedRendering.eContents.filter(KText).head.text = label        
        
        groupNode.addLayoutParam(KlighdProperties::EXPAND, false);
        
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
    
    dispatch def List<KNode> transform(ProcessorSystem processorSystem) {
        val system = processorSystem.getProcessorSystem
        if (system != null) {
//            val systemModel = system.transform
            val systemModel = system.processors.transform
            return newArrayList(systemModel) 
        }
        return newArrayList(createNode)
    }
    

    protected def System getProcessorSystem(ProcessorSystem processorSystem) {
        return KiCoolRegistration.getSystemById(processorSystem.id)
    }

    protected def System getProcessorSystemFromModelFile(ProcessorSystem processorSystem) {
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
            val rSystem = KiCoolRegistration.getSystemById(processorSystem.id)
            return rSystem
        }         
    }

    
}
