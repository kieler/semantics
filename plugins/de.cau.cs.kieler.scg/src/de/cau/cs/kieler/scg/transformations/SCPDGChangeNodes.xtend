package de.cau.cs.kieler.scg.transformations

import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Dependency
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.features.SCGFeatures
import java.util.Set
import org.eclipse.emf.common.util.EList
import java.util.HashMap
import de.cau.cs.kieler.scg.Entry

class SCPDGChangeNodes extends AbstractProductionTransformation implements Traceable{
    
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
        val programEntry = (scg.nodes.head as Entry)
        val exits = newHashSet()
        scg.nodes.forEach[node|
            if(node instanceof Exit && node != programEntry.exit)
                exits.add(node)
        ]
        exits.forEach[exit|
            val or = ScgFactory::eINSTANCE.createOr
            or.dependencies = exit.dependencies
            exit.incoming.forEach[dependency|
                dependency.target = or
            ]
        ]
        scg.nodes.removeAll(exits)
//        val nodeIterator = scg.nodes.iterator
//        while (nodeIterator.hasNext) {
//            val node = nodeIterator.next
//            if (node instanceof Exit) {
//                val or = ScgFactory::eINSTANCE.createOr
//                val iterator = node.incoming.iterator
//                while (iterator.hasNext) {
//                    val dependency = iterator.next
//                    dependency.target = or
//                }
//                toAdd.add(or)
//                toRemove.add(node)
//            }
//        }
//
//        toRemove.forEach [ node |
//            scg.nodes.remove(node)
//        ]
//        toAdd.forEach [ node |
//            scg.nodes.add(node)
//        ]
        scg
    }
    
    def setDependencies(Node node, EList<Dependency> dependencies){
        node.dependencies.clear
        val iterator = dependencies.iterator
        while(iterator.hasNext){
            val dependency = iterator.next
            node.dependencies.add(dependency)
        }
    }
    
}