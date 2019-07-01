/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.view.registry

import de.cau.cs.kieler.kicool.System
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import de.cau.cs.kieler.kicool.ProcessorReference
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.ProcessorAlternativeGroup

import static extension de.cau.cs.kieler.kicool.registration.KiCoolRegistration.*
import java.util.Map
import java.util.Set
import de.cau.cs.kieler.kicool.ProcessorSystem

/**
 * @author ssm
 *
 */
class PGraph {
    
    public var Set<PNode> pNodes = <PNode> newLinkedHashSet
    @Accessors var Map<String, PNode> metaNodes = <String, PNode> newHashMap
    @Accessors var Map<PNode, ProcessorReference> nodeReferenceMap = <PNode, ProcessorReference> newHashMap
    @Accessors var Map<ProcessorReference, PNode> referenceNodeMap = <ProcessorReference, PNode> newHashMap
    
    def addSystem(System system) {
        val lastProcessorReference = system.processors.addProcessor(null)
        if (lastProcessorReference !== null) {
            val type = lastProcessorReference.getTargetType
            var metaNode = metaNodes.get(type)
            if (metaNode === null) {
                metaNode = new PNode(type) => [ type = 1 ]
                metaNodes.put(type, metaNode)
            } 
            referenceNodeMap.get(lastProcessorReference).successors += metaNode
        }
    }
    
    private dispatch def ProcessorReference addProcessor(ProcessorReference processorReference, PNode predecessor) {
        val p = pNodes.findFirst[ id == processorReference.id ]
        val pNode = if (p === null) new PNode(processorReference.id) else p
        
        if (predecessor === null) {
            val type = processorReference.getSourceType
            var metaNode = metaNodes.get(type)
            if (metaNode === null) {
                metaNode = new PNode(type) => [ type = 1 ]
                metaNodes.put(type, metaNode)
            } 
            metaNode.successors += pNode
        } else {
            predecessor.successors += pNode
        }
        
        pNodes += pNode
        nodeReferenceMap.put(pNode, processorReference)
        referenceNodeMap.put(processorReference, pNode)
        return processorReference
    } 

    private dispatch def ProcessorReference addProcessor(ProcessorGroup processorGroup, PNode predecessor) {
        var ProcessorReference processorReference = null
        var lastPNode = predecessor
        for ( p : processorGroup.processors ) {
            processorReference = p.addProcessor(lastPNode)
            lastPNode = referenceNodeMap.get(processorReference)
        } 
        return processorReference
    } 

    private dispatch def ProcessorReference addProcessor(ProcessorAlternativeGroup processoralternativeGroup, PNode predecessor) {
        var ProcessorReference processorReference = null
        var lastPNode = predecessor
        for ( p : processoralternativeGroup.processors ) {
            processorReference = p.addProcessor(lastPNode)
            lastPNode = referenceNodeMap.get(processorReference)
        } 
        return processorReference
    } 

    private def dispatch ProcessorReference addProcessor(ProcessorSystem processorSystem, PNode predecessor) {
        val system = processorSystem.id.getSystemById
        return system.addProcessor(predecessor)
    } 
    
    private def dispatch ProcessorReference addProcessor(System system, PNode predecessor) {
        return system.processors.addProcessor(predecessor)
    }
    
    private def getSourceType(ProcessorReference processorReference) {
        val pfTypes = processorReference.id.getModelTypes
        if (pfTypes === null) return "";
        val pfName = (pfTypes.source as Class<?>).name
        return pfName
    }

    private def getTargetType(ProcessorReference processorReference) {
        val plTypes = processorReference.id.getModelTypes
        val plName = (plTypes.target as Class<?>).name    
        return plName
    }
    
    
}

class PNode {
    @Accessors String id
    @Accessors int type = 0
    @Accessors List<PNode> successors = <PNode> newLinkedList
    
    new (String id) {
        this.id = id
    }         
}
