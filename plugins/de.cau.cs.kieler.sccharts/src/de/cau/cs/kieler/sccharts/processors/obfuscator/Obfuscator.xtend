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
import java.util.Random

/**
 * @author stu114663
 *
 */
abstract class Obfuscator {

    static final String NAME_CHARACTERS = "abcdefghijklmnopqrstuvwxyz"
    static final int NAME_CHARACTERS_LENGTH = NAME_CHARACTERS.codePointCount(0, NAME_CHARACTERS.length)
    
    /**
     * Get a given length of random text
     */
    protected def getObfuscatedText(int name_length) {
        val rnd = new Random()
        var o_name = new StringBuilder
        for (var i = 0; i < name_length; i++) {
            val r = rnd.nextInt(NAME_CHARACTERS_LENGTH)
            val n = NAME_CHARACTERS.codePointAt(r)
            o_name.appendCodePoint(n)
        }
        return o_name.toString
    }
    
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
     * Calculate the minimum length of a number string for it to contain at least maxNum possible different numbers
     */
    def int calcMinimumLengthOfNum(int maxNum) {
        return Math.ceil(Math.log(maxNum)/Math.log(10)).intValue
    }
    
    /**
     * Get the minimum length of the String to have at least maxNum possible different Strings
     */
    def int calcMinimumLengthOfCodePointString(int maxNum) {
        return Math.ceil(Math.log(maxNum)/Math.log(NAME_CHARACTERS_LENGTH)).intValue
    }
    
    /**
     * Check if a list of strings already contains a given string
     */
    def boolean containsString(List<String> strs, String str) {
        for (ostr : strs) {
            if(ostr.equals(str) == 0) {
                return true
            }
        }
        return false
    }
    
    abstract def String getValuedObjectName(ValuedObject valuedO)
    abstract def String getStateName(State state)
    abstract def String getCommentText()
    abstract def String getRegionName(Region region)
}