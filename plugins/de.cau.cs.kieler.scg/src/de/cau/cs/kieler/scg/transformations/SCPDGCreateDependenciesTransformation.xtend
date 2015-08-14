package de.cau.cs.kieler.scg.transformations

import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.features.SCGFeatures
import java.util.Set
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import com.google.inject.Inject

/** 
 * This class is part of the SPDG Transformation Chain. The chain is used to
 * parallize the SCG as much as possible.
 * 
 * <pre>
 * SCG
 *  |   Create Dependencies     <== You are here
 *  |   Minimize Dependencies
 *  |   Remove Nodes
 * SCPDG
 * </pre>
 * 
 * @author twe
 * @kieler.design 
 * @kieler.rating 
 */

class SCPDGCreateDependenciesTransformation extends AbstractProductionTransformation implements Traceable {
    
    @Inject
    extension AnnotationsExtensions
    
    private static val String ANNOTATION_SCPDGTRANSFORMATION = "scpdg" 
    
    override getId() {
        return SCGTransformations::SCPDG_CD_ID
    }

    override getName() {
        return SCGTransformations::SCPDG_CD_NAME
    }    
        
    override getProducedFeatureId() {
        return SCGFeatures::SCPDG_CD_ID
    }
    
    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::DEPENDENCY_ID)
    }
    
    def SCGraph transform(SCGraph scg, KielerCompilerContext context) {

//        if 
//        (scg.hasAnnotation(AbstractSequentializer::ANNOTATION_SEQUENTIALIZED) ||
//            (scg.hasAnnotation(ANNOTATION_SCPDG_CD_TRANSFORMATION)) {
//            return scg
//        }
//        programEntry = (scg.nodes.head as Entry)
        scg.nodes.forEach [ node |
            node.createDependencies(scg, context)
        ]
        scg => [
            annotations += createStringAnnotation(ANNOTATION_SCPDGTRANSFORMATION, "")
        ]
        scg
    }
    
     private def dispatch createDependencies(Entry entry, SCGraph scg, KielerCompilerContext context) {
        entry.allUntilNextControlNode.forEach[next|
            ScgFactory::eINSTANCE.createControlDependency => [
                target = next
                next.incoming += it
                entry.dependencies += it
            ]
        ]
    }

    private def dispatch createDependencies(Assignment assignment, SCGraph scg, KielerCompilerContext context) {
        assignment.allUntilNextControlNode.forEach [ next |
            if (next.isControlNode) {
                ScgFactory::eINSTANCE.createControlDependency => [
                    target = next
                    next.incoming += it
                    assignment.dependencies += it
                ]
            }
        ]
    }

    private def dispatch createDependencies(Conditional cond, SCGraph scg, KielerCompilerContext context) {
        val thenNodes = newHashSet()
        val elseNodes = newHashSet()
        val thenNode = cond.then.target
        val elseNode = cond.^else.target
        thenNodes += thenNode
        elseNodes += elseNode
        if(!thenNode.isControlNode){
            thenNodes.addAll(thenNode.allUntilNextControlNode)
        }
        if(!elseNode.isControlNode){
            elseNodes.addAll(elseNode.allUntilNextControlNode)
        }
        
        thenNodes.forEach[node|
            ScgFactory::eINSTANCE.createThenDependency => [
                target = node
                node.incoming += it
                cond.dependencies += it
            ]
        ]
        
        elseNodes.forEach[node|
            ScgFactory::eINSTANCE.createElseDependency => [
                target = node
                node.incoming += it
                cond.dependencies += it
            ]
        ]
    }

    private def dispatch createDependencies(Fork fork, SCGraph scg, KielerCompilerContext context) {
        fork.allUntilNextControlNode.forEach[next|
            ScgFactory::eINSTANCE.createControlDependency => [
                target = next
                next.incoming += it
                fork.dependencies += it
            ]
        ]
    }

    private def dispatch createDependencies(Join join, SCGraph scg, KielerCompilerContext context) {
        join.allUntilNextControlNode.forEach[next|
            ScgFactory::eINSTANCE.createControlDependency => [
                target = next
                next.incoming += it
                join.dependencies += it
            ]
        ]
    }

    private def dispatch createDependencies(Exit exit, SCGraph scg, KielerCompilerContext context) {
        exit.allUntilNextControlNode.forEach[next|
            ScgFactory::eINSTANCE.createControlDependency => [
                target = next
                next.incoming += it
                exit.dependencies += it
            ]
        ]
    }

    private def dispatch createDependencies(Surface surface, SCGraph scg, KielerCompilerContext context) {
        surface.allUntilNextControlNode.forEach[next|
            ScgFactory::eINSTANCE.createControlDependency => [
                target = next
                next.incoming += it
                surface.dependencies += it
            ]
        ]
    }

    private def dispatch createDependencies(Depth depth, SCGraph scg, KielerCompilerContext context) {
        depth.allUntilNextControlNode.forEach[next|
            ScgFactory::eINSTANCE.createControlDependency => [
                target = next
                next.incoming += it
                depth.dependencies += it
            ]
        ]
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
    
     private def boolean isControlNode(Node node) {
        return ((node instanceof Conditional) || (node instanceof Depth) || (node instanceof Surface) ||
            (node instanceof Fork) || (node instanceof Join) || (node instanceof Entry) || (node instanceof Exit))
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
    
    
}