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

import java.util.Random

/**
 * @author stu114663
 *
 */
abstract class Obfuscator {

    static final String NAME_CHARACTERS = "abcdefghijklmnopqrstuvwxyz"
    static final int NAME_CHARACTERS_LENGTH = NAME_CHARACTERS.codePointCount(0, NAME_CHARACTERS.length)
    
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
    
    abstract def String getValuedObjectName()
    abstract def String getStateName()
    abstract def String getCommentText()
    abstract def String getRegionName()
}