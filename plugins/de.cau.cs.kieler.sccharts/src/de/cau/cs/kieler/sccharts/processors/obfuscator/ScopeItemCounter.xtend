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
package de.cau.cs.kieler.sccharts.processors.obfuscator

import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State

/**
 * @author stu114663
 *
 */
class ScopeItemCounter extends ItemCounter {
    Scope scp
    
    new(Scope model) {
        this.scp = model
    }
    
    /**
     * Counts up the ItemCount.
     * Recursively counts subitems:
     *      -rootstates
     */
    override void count() {
        if (counted) {
            reset
            counted = false
        }
        
        if (scp instanceof Region) {
            countRegionItems(scp)
        } else if (scp instanceof State) {
            countStateItems(scp)
        }
        
        counted = true
    }
}