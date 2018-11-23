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
import java.util.List

/**
 * @author stu114663
 *
 */
abstract class Obfuscator {
    
    /**
     * Create a String of a number with the length at least len. Therefore add leading zeroes as needed
     */
    protected def String numberToFixedLengthString(int num, int len) {
        var str = new String()
        val nstr = num.toString()
        
        for (var int i = 0; i < (len - nstr.length); i++) {
            str += "0"
        }
        
        return str + nstr
    }
    
    /**
     * Check if a list of strings already contains a given string
     */
    def boolean containsString(List<String> strs, String str) {
        for (ostr : strs) {
            if(ostr.equals(str)) {
                return true
            }
        }
        return false
    }
    
    abstract def String getValuedObjectName(ValuedObject valO)
    abstract def String getStateName(State state)
    abstract def String getCommentText(String comment)
    abstract def String getRegionName(Region region)
}