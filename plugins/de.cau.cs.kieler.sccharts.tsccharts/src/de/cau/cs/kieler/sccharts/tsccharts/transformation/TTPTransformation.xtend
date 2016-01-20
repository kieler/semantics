/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.tsccharts.transformation

import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.features.SCGFeatures

/**
 * Transform a sequentialized SCG to a sequentialized SCG with timing program points.
 * 
 * @author als
 * @kieler.design 2016-01-20 proposed 
 * @kieler.rating 2016-01-20 proposed yellow
 *
 */
class TTPTransformation extends AbstractProductionTransformation {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return TimingAnalysisTransformations::TTP_ID
    }

    override getName() {
        return TimingAnalysisTransformations::TTP_ID
    }

    override getProducedFeatureId() {
        return TimingAnalysisTransformations::TTP_FEATURE_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::SEQUENTIALIZE_ID)
    }

    // -------------------------------------------------------------------------   
    
    @Inject
    extension AnnotationsExtensions
    
    /**
     * Transform add TTPs to the sequentialized SCG.
     *
     * @param scg the SCG
     * @return the SCG with TTP
     */
    def public Object transform(SCGraph scg, KielerCompilerContext context) {

        // -- YOUR STUFF HERE --

        // Mark scg with feature
        scg.addAnnotation(TimingAnalysisTransformations::TTP_FEATURE_ID, "")
        
        return scg
    }

}
