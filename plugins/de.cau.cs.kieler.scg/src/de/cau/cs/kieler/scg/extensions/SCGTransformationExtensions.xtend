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
package de.cau.cs.kieler.scg.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scgdep.ScgdepFactory
import de.cau.cs.kieler.scgdep.SCGraphDep
import de.cau.cs.kieler.scgbb.ScgbbFactory
import de.cau.cs.kieler.scgbb.SCGraphBB
import de.cau.cs.kieler.scgsched.ScgschedFactory
import de.cau.cs.kieler.scgsched.SCGraphSched

/** 
 * SCGTransformationExtensions
 * 
 * @author ssm
 * @kieler.design 2013-11-27 proposed 
 * @kieler.rating 2013-11-27 proposed yellow
 */
class SCGTransformationExtensions {

    @Inject
    extension SCGCopyExtensions
    
    def SCGraph enrichAll(SCGraph scg) {
        var SCGraph newSCG = scg;
        while (!(newSCG instanceof SCGraphSched)) newSCG = newSCG.enrich
        newSCG
    }
    
    def dispatch SCGraph enrich(SCGraphBB scg) {
        val scgsched = ScgschedFactory::eINSTANCE.createSCGraphSched
        scg.copySCG(scgsched)
        scgsched
    }
    
    def dispatch SCGraph enrich(SCGraphDep scg) {
        val scgbb = ScgbbFactory::eINSTANCE.createSCGraphBB
        scg.copySCG(scgbb)
        scgbb
    }
    
    def dispatch SCGraph enrich(SCGraph scg) {
        val scgdep = ScgdepFactory::eINSTANCE.createSCGraphDep
        scg.copySCG(scgdep)
        scgdep
    }
}