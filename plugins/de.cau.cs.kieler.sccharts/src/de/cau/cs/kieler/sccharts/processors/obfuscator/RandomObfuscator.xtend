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
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Region
import java.util.List
import java.util.LinkedList

/**
 * @author stu114663
 *
 */
class RandomObfuscator extends Obfuscator {
    int name_length = 32
    
    public var List<String> usedStrings = new LinkedList<String>()
    
    new(int maxItems) {
        this.name_length = calcMinimumLengthOfCodePointString(maxItems)
    }
    
    new(int name_length, int maxItems) {
        this(maxItems)
        if (name_length >= this.name_length) {
            this.name_length = name_length
        }
    }
    
    override getValuedObjectName(ValuedObject valuedO) {
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
    
    def getText() {
        var nameText = getObfuscatedText(name_length)
        
        while (usedStrings.contains(nameText)) {
            nameText = getObfuscatedText(name_length)
        }
        
        usedStrings.add(nameText)
        
        return nameText
    }
}