/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.klighd

import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.scl.scl.Program
import com.google.inject.Inject
import de.cau.cs.kieler.scl.transformations.SCLToSCGTransformation
import de.cau.cs.kieler.scg.klighd.SCGraphDiagramSynthesis
import de.cau.cs.kieler.kiml.util.KimlUtil

/**
 * @author ssm
 *
 */
class SCLDiagramSynthesis extends AbstractDiagramSynthesis<Program> {
    
    @Inject
    extension SCGraphDiagramSynthesis SCGTransform
    
    @Inject
    extension SCLToSCGTransformation
    
    override getDisplayedSynthesisOptions() {
        SCGTransform.displayedSynthesisOptions;
    }
    
    override transform(Program model) {
        try {
            val scg = model.transformSCLToSCG
        
            return SCGTransform.transform(scg, usedContext)
        }
        catch (Exception e) {
            return KimlUtil.createInitializedNode
        }
    }
    
}