package de.cau.cs.kieler.scg.opt.features

import de.cau.cs.kieler.kico.features.Feature
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.scg.SCGraph

class SimplifyBooleans extends Feature {
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return OptimizerFeatures::BL_ID
    }

    override getName() {
        return OptimizerFeatures::BL_NAME
    }

    //-------------------------------------------------------------------------
    @Inject
    extension AnnotationsExtensions

    // This method checks, if this feature is contained in a model
    def isContained(SCGraph scg) {
        return scg.hasAnnotation(OptimizerFeatures::BL_ID)
    }
}