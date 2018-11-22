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
class RandomKeepLengthObfuscator extends Obfuscator {
    List<String> usedStrings = new LinkedList<String>()

    override getValuedObjectName(ValuedObject valuedO) {
        getText(valuedO.name.length)
    }
    
    override getStateName(State state) {
        if(state.name === null) {
            return ""
        } else {
            return getText(state.name.length)
        }
        
    }
    
    override getCommentText(String comment) {
        getText(comment.length)
    }
    
    override getRegionName(Region region) {
        if(region.name === null) {
            return ""
        } else {
            return getText(region.name.length)
        }
    }
    
    def getText(int name_length) {
        var nameText = getObfuscatedText(name_length)
        
        while (containsString(usedStrings, nameText)) {
            nameText = getObfuscatedText(name_length)
        }
        usedStrings.add(nameText)
        
        return nameText
    }
}