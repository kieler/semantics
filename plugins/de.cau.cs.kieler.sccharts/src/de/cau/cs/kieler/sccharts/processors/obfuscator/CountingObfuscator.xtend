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

import de.cau.cs.kieler.sccharts.processors.obfuscator.Obfuscator
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Region

/**
 * @author stu114663
 *
 */
class CountingObfuscator extends Obfuscator {
    String prefix = "I"
    int count = 1
    int maxItems = 0
    
    new(int maxItems) {
        this.maxItems = maxItems
    }
    
    new(int maxItems, String prefix) {
        this(maxItems)
        this.prefix = prefix
    }
    
    override getValuedObjectName(ValuedObject valuedO) {
        return getText()
    }
    
    override getStateName(State state) {
        return getText()
    }
    
    override getCommentText() {
        return ""
    }
    
    override getRegionName(Region region) {
        return getText()
    }
    
    def String getText() {
        val str = prefix + numberToFixedLengthString(count, maxItems)
        count++
        return str
    }
}