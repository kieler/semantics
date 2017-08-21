/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.transformators.dependencies

import java.util.LinkedList
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Node

/**
 * @author ssm
 *
 */
class ForkStack extends LinkedList<Node> {
    
    new() {
        super()
    }
    
    new(ForkStack forkStack) {
        super(forkStack)
    }
    
}