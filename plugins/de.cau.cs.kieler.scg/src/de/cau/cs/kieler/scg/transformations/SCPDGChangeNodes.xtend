package de.cau.cs.kieler.scg.transformations

import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.ControlDependency
import de.cau.cs.kieler.scg.Dependency
import de.cau.cs.kieler.scg.ElseDependency
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.ThenDependency
import de.cau.cs.kieler.scg.features.SCGFeatures
import java.util.Set

class SCPDGChangeNodes extends AbstractProductionTransformation implements Traceable{
    private Entry programmEntry;
    
    override getId() {
        return SCGTransformations::SCPDG_CN_ID
    }

    override getName() {
        return SCGTransformations::SCPDG_CN_NAME
    }    
        
    override getProducedFeatureId() {
        return SCGFeatures::SCPDG_CN_ID
    }
    
    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::SCPDG_RN_ID)
    }
    
    def SCGraph transform(SCGraph scg, KielerCompilerContext context) {
        programmEntry = (scg.nodes.head as Entry)
        scg.changeNodes
        scg
    }
    
    private def SCGraph changeNodes(SCGraph scg){
        val allNodes = newHashSet()
        allNodes.addAll(scg.nodes)
        val removedNodes = newHashSet()
        
        while (!allNodes.empty) {
            val node = allNodes.head
            allNodes.remove(node)
            if (node instanceof Exit && node != programmEntry.exit) {
                val or = ScgFactory::eINSTANCE.createOr => [
                ]
                scg.nodes.add(or)
                removedNodes.add(node)
                node.incoming.forEach [ link |
                    if (link instanceof Dependency){
                        if(link.eContainer instanceof Node){
                            link.newTargets((link.eContainer as Node), newHashSet(or))
                            }
                    }
                        
                ]
                node.dependencies.forEach[ link |
                    if(link instanceof Dependency){
                        link.newTargets(or, newHashSet(link.target))
                    }
                ]

            }
             if (node instanceof Join) {
                val and = ScgFactory::eINSTANCE.createAnd => [
                ]
                scg.nodes.add(and)
                removedNodes.add(node)
                node.incoming.forEach [ link |
                    if (link instanceof Dependency){
                        if(link.eContainer instanceof Node){
                            link.newTargets((link.eContainer as Node), newHashSet(and))
                            }
                    }
                        
                ]
                node.dependencies.forEach[ link |
                    if(link instanceof Dependency){
                        link.newTargets(and, newHashSet(link.target))
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
    
}