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
    String prefix = "ITEM"
    int count = 1
    int minStringLength
    
    boolean leadingZeroes = true
    
    new(int maxItems) {
        this.minStringLength = calcMinimumLengthOfNum(maxItems)
    }
    
    new(int maxItems, String prefix) {
        this(maxItems)
        this.prefix = prefix
    }
    
    new(int maxItems, boolean leadingZeroes) {
        this(maxItems)
        this.leadingZeroes = leadingZeroes
    }
    
    new(int maxItems, String prefix, boolean leadingZeroes) {
        this(maxItems, prefix)
        this.leadingZeroes = leadingZeroes
    }
    
    override getValuedObjectName(ValuedObject valO) {
        return getText()
    }
    
    override getStateName(State state) {
        return getText()
    }
    
    override getCommentText(String comment) {
        return ""
    }
    
    override getRegionName(Region region) {
        return getText()
    }
    
    def String getText() {
        var str = prefix
        if (leadingZeroes) {
            str += numberToFixedLengthString(count, minStringLength)
        } else {
            str += count.toString
        }
        count++
        return str
    }
}