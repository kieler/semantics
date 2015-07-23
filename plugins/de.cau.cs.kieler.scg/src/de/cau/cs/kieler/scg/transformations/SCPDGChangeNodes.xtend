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
    
    def SCGraph transdorm(SCGraph scg, KielerCompilerContext context) {
        val toRemove = newHashSet();
        scg.nodes.forEach [ node |
            if (node instanceof Exit) {
                val or = ScgFactory::eINSTANCE.createOr => [
                    it.dependencies = node.dependencies
                ]
                node.incoming.forEach [ dependency |
                    dependency.target = or
                ]
                toRemove.add(node)
            }
        ]
        scg
    }
    
    def setDependencies(Node node, EList<Dependency> dependencies){
        node.dependencies.clear
        dependencies.forEach[dependency|
            node.dependencies.add(dependency)
        ]
    }
    
}