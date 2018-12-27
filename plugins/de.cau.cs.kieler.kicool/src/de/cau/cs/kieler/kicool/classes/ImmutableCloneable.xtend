/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.classes

import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable

/**
 * @author ssm
 * @kieler.design 2018-05-28 proposed
 * @kieler.rating 2018-05-28 proposed yellow  
 *
 */
class ImmutableCloneable<T> implements IKiCoolCloneable {
    
    private T object
    
    new(T object) {
        this.object = object
    }
    
    override isMutable() {
        false
    }
    
    override cloneObject() {
        this
    }
    
    def T getObject() {
        object
    }
    
}