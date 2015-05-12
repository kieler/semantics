package de.cau.cs.kieler.scg.transformations

import de.cau.cs.kieler.kico.Transformation
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.SCGraph

class PSCGTransformation extends Transformation {
    
    override transform(EObject eObject, KielerCompilerContext context) {
        return transformSCPDGtoPSCG(eObject as SCGraph, context)
    }
    
    def SCGraph transformSCPDGtoPSCG(SCGraph scg, KielerCompilerContext context) {
        
    }
    
}