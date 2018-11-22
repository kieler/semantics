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

import de.cau.cs.kieler.sccharts.SCCharts

/**
 * @author stu114663
 *
 */
class ModelItemCounter extends ItemCounter {
    SCCharts model
    
    new(SCCharts model) {
        this.model = model
    }
    
    /**
     * Counts up the ItemCount.
     * Recursively counts subitems:
     *      -rootstates
     */
    override count() {
        if (counted) {
            reset
            counted = false
        }
        
        this.model.rootStates.forEach[rs |
            countStateItems(rs)
        ]
        
        counted = true
    }
}