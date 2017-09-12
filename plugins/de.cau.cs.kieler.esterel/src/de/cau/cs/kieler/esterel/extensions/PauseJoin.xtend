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
package de.cau.cs.kieler.esterel.extensions

import de.cau.cs.kieler.scl.Conditional
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author mrb
 *
 */
class PauseJoin {
    
    @Accessors var Conditional pause
    @Accessors var Conditional join
    
    new(Conditional pause, Conditional join) {
        this.pause = pause
        this.join = join
    }
    
    new() {
        
    }
    
}