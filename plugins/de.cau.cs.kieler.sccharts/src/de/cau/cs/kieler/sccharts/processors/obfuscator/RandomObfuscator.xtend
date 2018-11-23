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
class RandomObfuscator extends Obfuscator {
    
    RandomTextGenerator rtg = new RandomTextGenerator
    int nameLength
    
    new(ItemCounter ic) {
        this(ic.itemCount)
    }
    
    new(int maxItems) {
        this(RandomTextGenerator.calcMinimumLengthOfCodePointString(maxItems), maxItems)
    }
    
    new(int name_length, int maxItems) {
        if (name_length >= this.nameLength) {
            this.nameLength = name_length
        }
    }
    
    override getValuedObjectName(ValuedObject valO) {
        return getText(this.nameLength)
    }
    
    override getStateName(State state) {
        return getText(this.nameLength)
    }
    
    override getCommentText(String comment) {
        return ""
    }
    
    override getRegionName(Region region) {
        return getText(this.nameLength)
    }
    
    /** Get a String of random text that has not been used yet */
    def String getText(int nameLength) {
        return rtg.getText(nameLength)
    }
}