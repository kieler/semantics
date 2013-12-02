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

import de.cau.cs.kieler.scgsched.SCGraphSched

/** 
 * AbstractSCGAnalyser
 * 
 * @author ssm
 * @kieler.design 2013-12-02 proposed 
 * @kieler.rating 2013-12-02 proposed yellow
 */
abstract class AbstractSCGAnalyser {
  
    abstract def SCGraphSched analyse(SCGraphSched scg)
    
}