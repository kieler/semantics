package de.cau.cs.kieler.scg.opt.features

import de.cau.cs.kieler.kico.features.FeatureGroup

class OptimizerGroup extends FeatureGroup {
    
    override getId() {
        return OptimizerGroupFeatures::GROUP_ID
    }
    
    override getName() {
        return OptimizerGroupFeatures::GROUP_NAME
    }
    
    override getFeatureIds() {
        newHashSet(OptimizerFeatures::CP_ID, OptimizerFeatures::RV_ID, OptimizerFeatures::BL_ID)
    }
    
}