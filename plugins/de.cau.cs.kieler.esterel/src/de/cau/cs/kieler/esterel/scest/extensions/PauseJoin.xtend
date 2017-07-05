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
package de.cau.cs.kieler.esterel.scest.extensions

import de.cau.cs.kieler.scl.scl.Conditional

/**
 * @author mrb
 *
 */
class PauseJoin {
    
    var Conditional pause
    var Conditional join
    
    new(Conditional pause, Conditional join) {
        this.pause = pause
        this.join = join
    }
    
    new() {
        
    }
    
    def getPause() {
        this.pause
    }
    
    def getJoin() {
        this.join
    }
    
    def setPause(Conditional pause) {
        this.pause = pause
    }
    
    def setJoin(Conditional join) {
        this.join = join
    }


}