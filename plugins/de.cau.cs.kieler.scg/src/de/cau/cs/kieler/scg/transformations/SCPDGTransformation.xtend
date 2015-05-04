/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.sequentializer.AbstractSequentializer
import org.eclipse.emf.ecore.EObject

/** 
 * 
 * @author ssm
 * @kieler.design 2015-05-03 proposed 
 * @kieler.rating 2015-05-03 proposed yellow
 */

class SCPDGTransformation extends Transformation {
    
    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
       
    @Inject
    extension SCGControlFlowExtensions
    
    @Inject
    extension SCGThreadExtensions
    
    @Inject
    extension KExpressionsExtension
    
    @Inject
    extension AnnotationsExtensions    


    // -------------------------------------------------------------------------
    // -- Globals 
    // -------------------------------------------------------------------------
    
    public static val ANNOTATION_SCPDGTRANSFORMATION = "scpdg"
        
    
    // -------------------------------------------------------------------------
    // -- Transformation method
    // -------------------------------------------------------------------------

    /** 
     * Generic model transformation interface.
     * 
     * @param eObject
     *          the root element of the input model
     * @return Returns the root element of the transformed model.
     */    
    override transform(EObject eObject, KielerCompilerContext context) {
        return transformSCGToSCPDG(eObject as SCGraph)
    }
    
    def SCGraph transformSCGToSCPDG(SCGraph scg) {

        if (scg.hasAnnotation(AbstractSequentializer::ANNOTATION_SEQUENTIALIZED)
            || scg.hasAnnotation(ANNOTATION_SCPDGTRANSFORMATION)
        ) {
            return scg
        }
        
        scg => [
            annotations += createStringAnnotation(ANNOTATION_SCPDGTRANSFORMATION, "")
        ]     

        scg
    }
    
}