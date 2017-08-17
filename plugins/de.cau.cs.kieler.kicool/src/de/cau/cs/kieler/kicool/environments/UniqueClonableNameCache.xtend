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
package de.cau.cs.kieler.kicool.environments

import de.cau.cs.kieler.annotations.extensions.UniqueNameCache
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable

/**
 * @author ssm
 * @kieler.design 2017-08-16 proposed
 * @kieler.rating 2017-08-16 proposed yellow  
 */
class UniqueClonableNameCache extends UniqueNameCache implements IKiCoolCloneable {
    
    override isMutable() {
        false
    }
    
    override cloneObject() {
        this
    }
    
}