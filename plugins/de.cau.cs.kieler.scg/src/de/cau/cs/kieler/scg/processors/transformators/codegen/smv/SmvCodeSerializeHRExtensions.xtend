/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.transformators.codegen.smv

import com.google.inject.Singleton
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.scg.processors.transformators.codegen.c.CCodeSerializeHRExtensions

/**
 * @author aas
 *
 */
@Singleton
class SmvCodeSerializeHRExtensions extends CCodeSerializeHRExtensions {
    
    override dispatch CharSequence serialize(ValueType valueType) {
        switch(valueType) {
            case BOOL : return "boolean"
            case INT : return "integer"
            default : return valueType.literal
        }
    }
}