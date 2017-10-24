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
package de.cau.cs.kieler.scg.processors.transformators.codegen.java

import com.google.inject.Singleton
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.PrintCall
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.scg.processors.transformators.codegen.c.CCodeSerializeHRExtensions

/**
 * @author ssm
 * @kieler.design 2017-10-04 proposed 
 * @kieler.rating 2017-10-04 proposed yellow 
 *
 */
@Singleton
class JavaCodeSerializeHRExtensions extends CCodeSerializeHRExtensions {
    
    override dispatch CharSequence serialize(ValueType valueType) {
        if (valueType == ValueType.BOOL) {
            return "boolean"
        } else {
            return valueType.literal
        }
    }
    
    override dispatch CharSequence serialize(BoolValue expression) {
        if (expression.value) return "true"
        return "false"
    }
    
    override dispatch CharSequence serialize(PrintCall printCall) {
        var paramStr = printCall.parameters.serializeParameters.toString
        
        return "System.out.format(" + paramStr.substring(1, paramStr.length - 1) + ")"
    }
    
}