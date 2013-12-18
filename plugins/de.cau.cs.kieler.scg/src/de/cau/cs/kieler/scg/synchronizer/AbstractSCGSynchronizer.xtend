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
package de.cau.cs.kieler.scg.synchronizer

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.extensions.SCGExtensions
import de.cau.cs.kieler.scgbb.BasicBlock
import java.util.ArrayList
import java.util.List
import de.cau.cs.kieler.core.util.Pair

/** 
 * AbstractSCGSynchronizer
 * 
 * @author ssm
 * @kieler.design 2013-11-28 proposed 
 * @kieler.rating 2013-11-28 proposed yellow
 */
abstract class AbstractSCGSynchronizer {

    @Inject
    extension SCGExtensions
    
    protected abstract def SynchronizerData build(Fork fork);
    
    public def SynchronizerData synchronize(Fork fork) {
        build(fork)
    }    
}