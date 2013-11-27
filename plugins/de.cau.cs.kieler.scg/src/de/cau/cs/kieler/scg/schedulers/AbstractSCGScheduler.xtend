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

/**
 * @author ssm
 * 
 */
abstract class AbstractSCGScheduler {

    @Inject
    extension SCGTransformationExtensions
    
    private var SCGraphSched SCG;  
    
    protected abstract def void execute();
    
    public def SCGraph schedule(SCGraph scg) {
        SCG = (scg.upgradeAll as SCGraphSched)
        execute()
        SCG
    }    
}