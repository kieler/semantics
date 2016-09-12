/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.ui.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.krendering.SimpleUpdateStrategy
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.scl.transformations.SCLToSCGTransformation

class SCLSynthesis extends AbstractDiagramSynthesis<SCLProgram> {

    @Inject
    extension SCLToSCGTransformation
    
    override transform(SCLProgram scl) {
        val scg = scl.transformSCLToSCG
        // Synthesize SCG
        val properties = new KlighdSynthesisProperties()
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_UPDATE_STRATEGY, SimpleUpdateStrategy.ID)
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS,
            "de.cau.cs.kieler.scg.klighd.diagramSynthesis")
        val subDiagramViewContext = LightDiagramServices::translateModel2(scg, usedContext, properties)
        usedContext.addChildViewContext(subDiagramViewContext)

        return subDiagramViewContext.viewModel
    }



}
