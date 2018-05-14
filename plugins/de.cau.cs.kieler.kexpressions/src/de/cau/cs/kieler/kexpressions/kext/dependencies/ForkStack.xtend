/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kexpressions.kext.dependencies

import java.util.LinkedList
import de.cau.cs.kieler.annotations.NamedObject

/**
 * The ForkStack keeps track of the fork and corresponding entry nodes. 
 * It is a simple LinkedList and exposes the standard and the copy constructor.
 * 
 * @author ssm
 * @kieler.design 2017-08-21 proposed 
 * @kieler.rating 2017-08-21 proposed yellow
 */
class ForkStack<T extends NamedObject> extends LinkedList<T> {
    
    new() {
        super()
    }
    
    new(ForkStack<T> forkStack) {
        super(forkStack)
    }
    
}