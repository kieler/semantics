package de.cau.cs.kieler.scg.transformations

import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.features.SCGFeatures

class PSCGTransformation extends AbstractProductionTransformation {
    
    override transform(EObject eObject, KielerCompilerContext context) {
        return transformSCPDGtoPSCG(eObject as SCGraph, context)
    }
    
    def SCGraph transformSCPDGtoPSCG(SCGraph scg, KielerCompilerContext context) {
        
    }
    
    override getId() {
        return ""
    }

    override getName() {
        return ""
    }
    
    override getProducedFeatureId() {
        return ""
    }
    
    override getRequiredFeatureIds() {
        return <String>newHashSet
    }
        
}