/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
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
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.ecore.EObject

/** 
 * 
 * @author ssm
 * @kieler.design 2015-05-03 proposed 
 * @kieler.rating 2015-05-03 proposed yellow
 */


class SCPDGTransformation extends AbstractProductionTransformation implements Traceable {
    

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
//    @Inject
//    extension SCGControlFlowExtensions

    //    @Inject
    //    extension SCGThreadExtensions
    //
    //    @Inject
    //    extension KExpressionsExtension
    @Inject
    extension AnnotationsExtensions

    // -------------------------------------------------------------------------
    // -- Globals 
    // -------------------------------------------------------------------------

    public static val ANNOTATION_SCPDG_CD_TRANSFORMATION = "scpdgcd"
    public static val ANNOTATION_SCPDG_RN_TRANSFORMATION = "scpdgrn"
    public static val ANNOTATION_SCPDG_MD_TRANSFORMATION = "scpdgmd"
    
    public static val ANNOTATION_SCPDGTRANSFORMATION = "scpdg"
    
    var Entry programEntry;
    
    override getId() {
        return SCGTransformations::SCPDG_ID
    }

    override getName() {
        return SCGTransformations::SCPDG_NAME
    }    
        
    override getProducedFeatureId() {
        return SCGFeatures::SCPDG_ID
    }
    
    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::DEPENDENCY_ID)
    }

    

    // -------------------------------------------------------------------------
    // -- Transformation method
    // -------------------------------------------------------------------------
    /** 
     * Generic model transformation interface.
     * 
     * @param eObject
     *          the root element of the input model
     * @return Returns the root element of the transformed model.
     */
  
//    def SCGraph transformCD(EObject eObject, KielerCompilerContext context) {
    def SCGraph transform(SCGraph scg, KielerCompilerContext context) {

        if 
//        (scg.hasAnnotation(AbstractSequentializer::ANNOTATION_SEQUENTIALIZED) ||
            (scg.hasAnnotation(ANNOTATION_SCPDG_CD_TRANSFORMATION)) {
            return scg
        }
        programEntry = (scg.nodes.head as Entry)
        scg.nodes.forEach [ node |
            node.createDependencies(scg, context)
        ]
        scg => [
            annotations += createStringAnnotation(ANNOTATION_SCPDG_CD_TRANSFORMATION, "")
        ]
        scg
    }

    def SCGraph transformRN(EObject eObject, KielerCompilerContext context) {
        val SCGraph scg = (eObject as SCGraph)
        if 
//            scg.hasAnnotation(AbstractSequentializer::ANNOTATION_SEQUENTIALIZED) ||
            ((scg.hasAnnotation(ANNOTATION_SCPDG_RN_TRANSFORMATION)) ||
            (!scg.hasAnnotation(ANNOTATION_SCPDG_CD_TRANSFORMATION))) {
            return scg
        }
        programEntry = (scg.nodes.head as Entry)
        scg.removeUselessNodes

        scg.nodes.forEach [ node |
            node.removeNext
        ]
        scg => [
            annotations += createStringAnnotation(ANNOTATION_SCPDG_RN_TRANSFORMATION, "")
        ]
        scg
    }
//=======
////        if (scg.hasAnnotation(AbstractSequentializer::ANNOTATION_SEQUENTIALIZED)
////            || scg.hasAnnotation(ANNOTATION_SCPDGTRANSFORMATION)
////        ) {
////            return scg
////        }
//
//    	val cfs = <ControlFlow> newHashSet;
//    	programEntry = (scg.nodes.head as Entry)
//        programEntry.transformSCPDG(cfs, scg, context)
//        
//        scg.addAnnotation(SCGFeatures.SCPDG_ID, SCGFeatures.SCPDG_NAME)   
//>>>>>>> master

    def SCGraph transformMD(EObject eObject, KielerCompilerContext context) {
        val SCGraph scg = (eObject as SCGraph)
        if 
//        (scg.hasAnnotation(AbstractSequentializer::ANNOTATION_SEQUENTIALIZED) ||
            ((scg.hasAnnotation(ANNOTATION_SCPDG_MD_TRANSFORMATION)) ||
            (!scg.hasAnnotation(ANNOTATION_SCPDG_CD_TRANSFORMATION))) {
            return scg
        }
        programEntry = (scg.nodes.head as Entry)
        scg.minimizeControlDependencies
        scg => [
            annotations += createStringAnnotation(ANNOTATION_SCPDG_MD_TRANSFORMATION, "")
        ]
        
        scg
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
                            } else {
                               System.out.println("nooo") 
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
    
    private def Set<Node> allUntilNextBreak(Node node){
        val ret = newHashSet()
        
        return ret
    }

    private def boolean isControlNode(Node node) {
        return ((node instanceof Conditional) || (node instanceof Depth) || (node instanceof Surface) ||
            (node instanceof Fork) || (node instanceof Join) || (node instanceof Entry) || (node instanceof Exit))
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
    
    private def Set<Node> nextNodeControlDependencies(Node node){
        val ret = newHashSet()
        node.dependencies.forEach[dependency|
            if(dependency instanceof ControlDependency || dependency instanceof ConditionalDependency)
                ret += dependency.target
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

    

    def private SCGraph minimizeControlDependencies(SCGraph scg){
        scg.removeUnnecessaryControlDependencies
        scg.removeUselessConditionalDependencies
        
        return scg
    }
    
    def private removeUnnecessaryControlDependencies(SCGraph scg){
        
        scg.nodes.forEach[node|
            if(node.isControlNode){
                val Nodes = node.allUntilNextControlNode
                Nodes.add(node)
                Nodes.forEach[innerNode|
                    val toRemove = newHashSet()
                    innerNode.dependencies.forEach[dependency|
                        if(Nodes.contains(dependency.target)){
                            if(existsNonTrivialDependency(innerNode, dependency.target, Nodes)){
                                toRemove.add(dependency)
                            }
                        }
                    ]
                    toRemove.forEach[dependency|
                        node.dependencies.remove(dependency)
                        (dependency as Dependency).target.incoming.remove(dependency)
                    ]
                ]
            }
        ]
    }
    
    def private boolean existsNonTrivialDependency(Node root, Node target, Set<Node> NodeSet) {
        val dependend = new BasicEList
        root.dependencies.forEach [ depend |
            if (target != depend.target && NodeSet.contains(depend.target) && !depend.target.isControlNode)
                dependend.add(depend.target)
        ]

        while (!dependend.empty) {
            val node = dependend.head
            if (!node.dependencies.forall [ dependency |
                if(NodeSet.contains(dependency.target) && !dependency.target.isControlNode)
                    dependend.add(dependency.target)
                dependency.target != target
            ]) {
                return true
            }
            dependend.remove(node)
        }
        false
    }
    
    def private removeUselessConditionalDependencies(SCGraph scg) {
        scg.nodes.forEach [ node |
            if (node instanceof Conditional) {
                val Set<ConditionalDependency> uselessDependencies = newHashSet()
                val Set<Node> independendNodes = newHashSet()
                node.dependencies.forEach [ thenDependency |
                    if (thenDependency instanceof ThenDependency) {
                        node.dependencies.forEach [ elseDependency |
                            if (elseDependency instanceof ElseDependency) {
                                if (elseDependency.target == thenDependency.target) {
                                    uselessDependencies += thenDependency
                                    uselessDependencies += elseDependency
                                    independendNodes += elseDependency.target
                                    independendNodes.addAll(elseDependency.target?.allUntilNextControlNode)
                                }
                            }
                        ]
                    }
                ]
                
                node.newDependencies(independendNodes)
                node.dependencies.removeAll(uselessDependencies)    
            }
        ]
    }
    
    def private newDependencies(Node node, Set<Node> targetNodes){
        
        node.incoming.forEach[dependency|
            if(dependency instanceof ControlDependency || dependency instanceof ConditionalDependency){
                (dependency as Dependency).newTargets((dependency.eContainer as Node), targetNodes)
                }
        ]
        
    }
    
}

