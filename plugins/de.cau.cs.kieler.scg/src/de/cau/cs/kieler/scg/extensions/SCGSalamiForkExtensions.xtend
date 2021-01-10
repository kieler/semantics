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
package de.cau.cs.kieler.scg.extensions

import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Predecessor
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.ForkType

/**
 * Support for sequential preemtive fork.
 * 
 * @author als
 */
class SCGSalamiForkExtensions { 

    def isNonParalellFork(Predecessor pred) {
        return pred?.basicBlock?.isNonParalellFork
    }
    def isNonParalellFork(BasicBlock bb) {
        return bb?.fork.isNonParallel
    }
    
    def isNonParallel(Fork f) {
        return f !== null && f.type !== ForkType.PARALLEL
    }
    
    def getFork(BasicBlock bb) {
        val fork = bb?.schedulingBlocks?.last?.nodes?.last
        if (fork instanceof Fork) {
            return fork
        }
        return null
    }
}