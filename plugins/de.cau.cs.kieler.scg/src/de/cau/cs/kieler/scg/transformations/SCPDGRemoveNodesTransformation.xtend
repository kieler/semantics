package de.cau.cs.kieler.scg.transformations

import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ConditionalDependency
import de.cau.cs.kieler.scg.ControlDependency
import de.cau.cs.kieler.scg.Dependency
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.ElseDependency
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.ThenDependency
import de.cau.cs.kieler.scg.features.SCGFeatures
import java.util.Set

/** 
 * This class is part of the SPDG Transformation Chain. The chain is used to
 * parallize the SCG as much as possible.
 * 
 * <pre>
 * SCG
 *  |   Create Dependencies
 *  |   Minimize Dependencies
 *  |   Remove Nodes            <== You are here
 * SCPDG
 * </pre>
 * 
 * @author twe
 * @kieler.design 
 * @kieler.rating 
 */

class SCPDGRemoveNodesTransformation extends AbstractProductionTransformation implements Traceable {
    var Entry programEntry;
    
   override getId() {
        return SCGTransformations::SCPDG_RN_ID
    }

    override getName() {
        return SCGTransformations::SCPDG_RN_NAME
    }    
        
    override getProducedFeatureId() {
        return SCGFeatures::SCPDG_RN_ID
    }
    
    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::SCPDG_MD_ID)
    }
    
    def SCGraph transform(SCGraph scg, KielerCompilerContext context) {
        programEntry = (scg.nodes.head as Entry)

        scg.removeUselessNodes

        scg.nodes.forEach [ node |
            node.removeNext
        ]
        scg
    }
    
     private def removeNext(Node node) {

        if (node instanceof Entry) {
            (node as Entry).next = null
        }
        if (node instanceof Depth) {
            (node as Depth).next = null
        }
        if (node instanceof Exit) {
            (node as Exit).next = null
        }
        if (node instanceof Assignment) {
            (node as Assignment).next = null
        }
        if (node instanceof Join) {
            (node as Join).next = null
        }
        if(node instanceof Fork){
            (node as Fork).next.clear
        }
        if (node instanceof Conditional) {
            (node as Conditional).then = null
            (node as Conditional).^else = null
        }
    }
    
     private def SCGraph removeUselessNodes(SCGraph scg){
        val allNodes = newHashSet()
        allNodes.addAll(scg.nodes)
        val removedNodes = newHashSet()
        
        while (!allNodes.empty) {
            val node = allNodes.head
            allNodes.remove(node)
            if (node.isUseless) {
                removedNodes.add(node)
                node.incoming.forEach [ link |
                    if (link instanceof Dependency){
                        if(link.eContainer instanceof Node){
                            link.newTargets((link.eContainer as Node), node.allUntilNextControlNodeUsingControlDependencies)
                            }
                    }
                        
                ]

            }
        }
        removedNodes.forEach[node|
            
            scg.nodes.remove(node)
        ]
        
        scg
    }
    
     private def Set<Node> allUntilNextControlNodeUsingControlDependencies(Node node){
        val ret = newHashSet()
        val nextNodes = node.nextNodeControlDependencies
        
        nextNodes.forEach[nextNode|
            ret += nextNode
            if(!nextNode.isControlNode){
               ret.addAll(nextNode.allUntilNextControlNode)
            }
        ]
        ret
    }
    
     private def Set<Node> nextNodeControlDependencies(Node node){
        val ret = newHashSet()
        node.dependencies.forEach[dependency|
            if(dependency instanceof ControlDependency || dependency instanceof ConditionalDependency)
                ret += dependency.target
        ]
        ret
    }
    
     private def boolean isControlNode(Node node) {
        return ((node instanceof Conditional) || (node instanceof Depth) || (node instanceof Surface) ||
            (node instanceof Fork) || (node instanceof Join) || (node instanceof Entry) || (node instanceof Exit))
    }
    
     private def Set<Node> allUntilNextControlNode(Node node){
        val ret = newHashSet()
        val nextNodes = node.nextNode
        
        nextNodes.forEach[nextNode|
            ret += nextNode
            if(!nextNode.isControlNode){
               ret.addAll(nextNode.allUntilNextControlNode)
            }
        ]
        ret
    }
     private def Set<Node> nextNode(Node node) {
        if (node == null)
            return newHashSet()
        if (node instanceof Entry) {
            if(node.next != null)
                return newHashSet(node.next.target)
        }
        if (node instanceof Depth) {
            if(node.next != null)
                return newHashSet(node.next.target)
        }
        if (node instanceof Exit) {
            if(node.next != null)
                return newHashSet(node.next.target)
        }
        if (node instanceof Assignment) {
            if(node.next != null)
                return newHashSet(node.next.target)
        }
        if (node instanceof Fork) {
            val Set<Node> ret = newHashSet()
            (node as Fork).next.forEach [ cf |
                ret += cf.target
            ]
            return ret
        }
        if (node instanceof Join) {
            if(node.next != null)
                return newHashSet(node.next.target)
        }
        if (node instanceof Conditional) {
            val ret = newHashSet;
            if (node.^else != null)
                ret += node.^else.target
            if (node.then != null)
                ret += node.then.target
            return ret
        }
        return newHashSet()
    }
    
     private def dispatch newTargets(ThenDependency dependency, Node rootNode, Set<Node> targets){
        targets.forEach[targetNode|
            ScgFactory::eINSTANCE.createThenDependency => [
                target = targetNode
                targetNode.incoming += it
                rootNode.dependencies += it
            ]
        ]
    }
    private def dispatch newTargets(ElseDependency dependency, Node rootNode, Set<Node> targets){
        targets.forEach[targetNode|
            ScgFactory::eINSTANCE.createElseDependency => [
                target = targetNode
                targetNode.incoming += it
                rootNode.dependencies += it
            ]
        ]
    }
    private def dispatch newTargets(ControlDependency dependency, Node rootNode, Set<Node> targets){
        targets.forEach[targetNode|
            ScgFactory::eINSTANCE.createControlDependency => [
                target = targetNode
                targetNode.incoming += it
                rootNode.dependencies += it
            ]
        ]
    }
     
     private def boolean isUseless(Node node){
        if(node instanceof Fork)
            return true
        if (node instanceof Entry)
            return (node != programEntry)
        return false
    }
    
    
}