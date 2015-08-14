package de.cau.cs.kieler.scg.transformations

import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Dependency

class SCPDGSchedulingBlocks extends AbstractProductionTransformation implements Traceable {

    val entryNodes = newHashSet()
    val exitNodes = newHashSet()
    
    override getProducedFeatureId() {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    override getId() {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    def SCGraph transform(SCGraph scg, KielerCompilerContext context){
        val regions = newHashSet()
        val nodesWithRegions = newHashSet()
        val nodesWithoutRegions = newHashSet()
        val programEntry = scg.nodes.head
        
        nodesWithoutRegions.addAll(scg.nodes.filter[toDistribute(it)])
        
        var flag = true
        while(!nodesWithoutRegions.empty && flag){
            flag = false
            val size = nodesWithoutRegions.size
            entryNodes.addAll(nodesWithoutRegions.filter[isRegionEntryNode])
            exitNodes.addAll(nodesWithoutRegions.filter[isRegionExitNode])
            nodesWithoutRegions.removeAll(entryNodes)
            nodesWithoutRegions.removeAll(exitNodes)
            if(size != nodesWithoutRegions.size)
                flag = true
        }
        
        
        
        scg
    }
    
    def boolean isRegionEntryNode(Node node){
        if(node.incoming.forall[dependency|
            !((dependency as Dependency).eContainer as Node).toDistribute
                || entryNodes.contains(((dependency as Dependency).eContainer as Node))
        ])
            return true
        false
    }
    
    def boolean isRegionExitNode(Node node){
        if(node.dependencies.forall[dependency|
            !((dependency as Dependency).eContainer as Node).toDistribute
                || exitNodes.contains(((dependency as Dependency).eContainer as Node))
        ])
            return true
        false
    }
    
    def boolean toDistribute(Node node){
        if(node instanceof Depth || node instanceof Surface || node instanceof Entry)
            return false
        true
    }
    
    
    
}