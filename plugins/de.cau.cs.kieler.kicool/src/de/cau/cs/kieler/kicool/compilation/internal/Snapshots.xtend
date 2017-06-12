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
package de.cau.cs.kieler.kicool.compilation.internal

import de.cau.cs.kieler.kicool.compilation.IKiCoolCloneable
import java.util.LinkedList

/**
 * @author ssm
 * @kieler.design 2017-06-12 proposed
 * @kieler.rating 2017-06-12 proposed yellow  
 */
class Snapshots extends LinkedList<Object> implements IKiCoolCloneable {
    
    override isMutable() { false }
    override cloneObject() { null }
    override isVolatile() { true }
    
}