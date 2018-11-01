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

/**
 * @author stu114663
 *
 */
class UniformFixedRandomObfuscator extends Obfuscator {
    private int name_length = 64
    
    new(int name_length) {
        if (name_length >= 0) {
            this.name_length = name_length
        }
    }
    
    override getValuedObjectName() {
        return getText
    }
    
    override getStateName() {
        return getText
    }
    
    override getCommentText() {
        return getText
    }
    
    override getRegionName() {
        return getText
    }
    
    def getText() {
        return getObfuscatedText(name_length)
    }
}