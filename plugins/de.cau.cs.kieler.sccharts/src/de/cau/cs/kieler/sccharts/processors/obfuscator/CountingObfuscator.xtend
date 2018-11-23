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

import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State

/**
 * @author stu114663
 *
 */
class CountingObfuscator extends Obfuscator {
    
    static final String DEFAULT_PREFIX = "ITEM"
    static final boolean DEFAULT_LEADING_ZEROES = false
    
    String prefix
    boolean leadingZeroes
    int count = 0
    int minStringLength
    
    new(ItemCounter ic) {
        this(ic, DEFAULT_PREFIX, DEFAULT_LEADING_ZEROES)
    }
    
    new(ItemCounter ic, String prefix) {
        this(ic, prefix, DEFAULT_LEADING_ZEROES)
    }
    
    new(ItemCounter ic, boolean leadingZeroes) {
        this(ic, DEFAULT_PREFIX, leadingZeroes)
    }
    
    new(ItemCounter ic, String prefix, boolean leadingZeroes) {
        // comments are not counted but deleted
        this(ic.itemCount - ic.commentCount, prefix, leadingZeroes)
    }
    
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
    
    /**
     * Calculate the minimum length of a number string for it to contain at least maxNum possible different numbers
     */
    def int calcMinimumLengthOfNum(int maxNum) {
        return Math.ceil(Math.log(maxNum)/Math.log(10)).intValue
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