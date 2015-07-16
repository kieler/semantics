package de.cau.cs.kieler.scg.features

import de.cau.cs.kieler.kico.features.Feature

class SCPDGMinimizeDependencies extends Feature{
    
    override getId() {
        SCGFeatures::SCPDG_MD_ID
    }
    
    override getName(){
        SCGFeatures::SCPDG_MD_NAME
    }
    
}