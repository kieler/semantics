package de.cau.cs.kieler.scg.opt.reusevars

import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.opt.features.OptimizerFeatures
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.features.SCGFeatureGroups

class ReuseVariables extends AbstractProductionTransformation {
    
    override getProducedFeatureId() {
        return OptimizerFeatures::RV_ID
    }
    
    override getRequiredFeatureIds() {
        return newHashSet(/*SCGFeatures::SEQUENTIALIZE_ID, SCGFeatureGroups::SCG_ID, */OptimizerFeatures::CP_ID)
    }
    
    override getId() {
        return OptimizerFeatures::RV_ID
    }
    
    override getName() {
        return OptimizerFeatures::RV_NAME
    }
    
}