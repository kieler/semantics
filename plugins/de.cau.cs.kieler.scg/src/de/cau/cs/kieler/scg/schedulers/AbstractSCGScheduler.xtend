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
package de.cau.cs.kieler.scg.schedulers

import com.google.inject.Inject
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGTransformationExtensions
import de.cau.cs.kieler.scgsched.SCGraphSched
import de.cau.cs.kieler.scgbb.SCGraphBB

/** 
 * AbstractSCGScheduler
 * 
 * @author ssm
 * @kieler.design 2013-11-27 proposed 
 * @kieler.rating 2013-11-27 proposed yellow
 */
abstract class AbstractSCGScheduler {

    @Inject
    extension SCGTransformationExtensions
    
    protected abstract def SCGraphSched execute(SCGraphSched SCG);
    
    public def SCGraph schedule(SCGraph scg) {
        execute((scg.upgradeAll as SCGraphSched) as SCGraphSched)
    }    
}