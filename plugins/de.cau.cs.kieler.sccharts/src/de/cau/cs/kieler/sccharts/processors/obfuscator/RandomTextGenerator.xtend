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

import java.util.LinkedList
import java.util.List
import java.util.Random

/**
 * @author stu114663
 *
 */
class RandomTextGenerator {

    static final String NAME_CHARACTERS = "abcdefghijklmnopqrstuvwxyz"
    static final int NAME_CHARACTERS_LENGTH = NAME_CHARACTERS.codePointCount(0, NAME_CHARACTERS.length)
    
    List<String> usedStrings = new LinkedList<String>()
    
    /**
     * Get the minimum length of the String to have at least maxNum possible different Strings
     */
    def static int calcMinimumLengthOfCodePointString(int maxNum) {
        return Math.ceil(Math.log(maxNum)/Math.log(NAME_CHARACTERS_LENGTH)).intValue
    }
    
    /** Get a String of random text that has not been used yet */
    def String getText(int nameLength) {
        var nameText = getObfuscatedText(nameLength)
        
        while (usedStrings.contains(nameText)) {
            nameText = getObfuscatedText(nameLength)
        }
        
        usedStrings.add(nameText)
        
        return nameText
    }
    
    /**
     * Get a given length of random text
     */
    def protected static String getObfuscatedText(int name_length) {
        val rnd = new Random()
        var o_name = new StringBuilder
        for (var i = 0; i < name_length; i++) {
            val r = rnd.nextInt(NAME_CHARACTERS_LENGTH)
            val n = NAME_CHARACTERS.codePointAt(r)
            o_name.appendCodePoint(n)
        }
        return o_name.toString
    }
}