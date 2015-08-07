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
import org.eclipse.emf.common.util.BasicEList
import de.cau.cs.kieler.scg.DataDependency

class SCPDGMinimizeDependenciesTransformation extends AbstractProductionTransformation implements Traceable {
    
    override getId() {
        return SCGTransformations::SCPDG_MD_ID
    }

    override getName() {
        return SCGTransformations::SCPDG_MD_NAME
    }    
        
    override getProducedFeatureId() {
        return SCGFeatures::SCPDG_MD_ID
    }
    
    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::SCPDG_CD_ID)
    }
    
   def SCGraph transform(SCGraph scg, KielerCompilerContext context) {
       scg.minimizeControlDependencies
       scg
   }
   
    def private SCGraph minimizeControlDependencies(SCGraph scg){
        val conds = newHashSet()
        scg.nodes.forEach[node|
            if(node instanceof Conditional)
                conds.add(node)
        ]
        
        conds.forEach[cond|
            deleteUselessConditionalDependencies(cond)
        ]
        scg.removeUnnecessaryControlDependencies
        scg.removeUselessConditionalDependencies
        
        return scg
    }
    
    def private deleteUselessConditionalDependencies(Conditional cond){
        val thenTargets = newHashSet()
        val elseTargets = newHashSet()
        val doubleTargets = newHashSet()
        val allTargets = newHashSet()
        val uselessCondDependencies = newHashSet()
        cond.dependencies.forEach[dependency|
            if(dependency instanceof ElseDependency){
                elseTargets.add(dependency.target)
            } else if(dependency instanceof ThenDependency){
                thenTargets.add(dependency.target)
            }
        ]
        
        allTargets.addAll(thenTargets)
        allTargets.addAll(elseTargets)
        cond.dependencies.forEach[dependency|
            if(elseTargets.contains(dependency.target) && thenTargets.contains(dependency.target)){
                uselessCondDependencies.add(dependency)
                doubleTargets.add(dependency.target)
            }
        ]
        
        cond.dependencies.removeAll(uselessCondDependencies)
        
//        doubleTargets.forEach[target|
//            target.incoming.forEach[dependency|
//                if(dependency instanceof ConditionalDependency || dependency instanceof ControlDependency){
//                    val node = ((dependency as Dependency).eContainer) as Node
//                    if(!thenTargets.contains(node) && !elseTargets.contains(node))
//                        doubleTargetsIncoming.add(node)
//                }
//            ]
//        
//        ]
//        
        thenTargets.forEach[target|
            val uselessDependencies = newHashSet()
            target.dependencies.forEach[dependency|
                if(dependency instanceof ConditionalDependency || dependency instanceof ControlDependency){
                    if(doubleTargets.contains(dependency.target)){
                        uselessDependencies.add(dependency)
                    }
                }
            ]
            target.dependencies.removeAll(uselessDependencies)
        ]
        
        elseTargets.forEach[target|
            val uselessDependencies = newHashSet()
            target.dependencies.forEach[dependency|
                if(dependency instanceof ConditionalDependency || dependency instanceof ControlDependency){
                    if(doubleTargets.contains(dependency.target)){
                        uselessDependencies.add(dependency)
                    }
                }
            ]
             target.dependencies.removeAll(uselessDependencies)
        ]
        
        thenTargets.forEach[target|
            val uselessDependencies = newHashSet()
            target.dependencies.forEach[dependency|
                if(dependency instanceof ControlDependency && !dependency.target.isControlNode){
                    if(thenTargets.contains(dependency.target)){
                        uselessDependencies.add(dependency)
                    }
                }
            ]
            target.dependencies.removeAll(uselessDependencies)
        ]
        
        elseTargets.forEach[target|
            val uselessDependencies = newHashSet()
            target.dependencies.forEach[dependency|
                if(dependency instanceof ControlDependency && !dependency.target.isControlNode){
                    if(elseTargets.contains(dependency.target)){
                        uselessDependencies.add(dependency)
                    }
                }
            ]
            target.dependencies.removeAll(uselessDependencies)
        ]
        
        cond.incoming.forEach[dependency|
             if(dependency instanceof ConditionalDependency || dependency instanceof ControlDependency){
                 (dependency as Dependency).newTargets((dependency.eContainer) as Node, doubleTargets)
             }
        ]
        
        
    }
    
    def private removeUnnecessaryControlDependencies(SCGraph scg){
        
        scg.nodes.forEach[node|
            if(node.isControlNode){
                val Nodes = node.allUntilNextControlNode
                Nodes.add(node)
                Nodes.forEach[innerNode|
                    val toRemove = newHashSet()
                    innerNode.dependencies.forEach[dependency|
                        if(dependency instanceof ControlDependency){
                            if(Nodes.contains(dependency.target)){
                                if(existsNonTrivialDependency(innerNode, dependency.target, Nodes)){
                                    toRemove.add(dependency)
                                }
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
    
}