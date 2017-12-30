/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.transformators.priority

import de.cau.cs.kieler.scg.transformations.c.SCG2CSerializeHRExtensions
import de.cau.cs.kieler.kexpressions.BoolValue

/**
 * @author ssm
 *
 */
class SCG2JavaSerializeHRExtensions extends SCG2CSerializeHRExtensions {
    
    override dispatch CharSequence serialize(BoolValue expression) {
        if(expression.value == true) return "true"
        return "false"
    }
    
}