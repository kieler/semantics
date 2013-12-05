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
import de.cau.cs.kieler.scg.extensions.SCGExtensions
import de.cau.cs.kieler.scg.extensions.SCGCopyExtensions
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scgsched.SCGraphSched
import de.cau.cs.kieler.scg.ScgFactory
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/** 
 * SCGSched to Seq SCG Transformation 
 * 
 * @author ssm
 * @kieler.design 2013-12-05 proposed 
 * @kieler.rating 2013-12-05 proposed yellow
 */

// This class contains all mandatory methods to create a new sequentialized SCG.
class SCGSchedToSeqSCGTransformation {

    // Inject SCG Extensions.    
    @Inject
    extension SCGExtensions
    
    @Inject 
    extension SCGCopyExtensions	
    
    def SCGraph transformSCGSchedToSeqSCG(SCGraphSched scgSched) {
        // Create new SCG...
        val scg = ScgFactory::eINSTANCE.createSCGraph()
        
        scgSched.copyDeclarations(scg)
        scgSched.basicBlocks.forEach[
        	val newGuard = guard.copy
        	it.guard.addToValuedObjectMapping(newGuard)
        	scg.valuedObjects.add(newGuard)
        ]
        
        scg       	
    }
}