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

import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author ssm
 * @kieler.design 2018-05-17 proposed
 * @kieler.rating 2018-05-17 proposed yellow  
 */
class VolatileBoolean implements IKiCoolCloneable {
    
    @Accessors var boolean value = false
    
    new() {
    }
    
    new(boolean b) {
        value = b
    }
    
    override isMutable() {
        false
    }
    
    override cloneObject() {
        new VolatileBoolean => [ value = this.value ]
    }
    
    override isVolatile() {
        true
    }
    
}