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
package de.cau.cs.kieler.scg.processors.codegen.java

import com.google.inject.Singleton
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.PrintCall
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeSerializeHRExtensions
import de.cau.cs.kieler.kexpressions.RandomCall
import de.cau.cs.kieler.kexpressions.RandomizeCall
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import com.google.inject.Inject

/**
 * @author ssm
 * @kieler.design 2017-10-04 proposed 
 * @kieler.rating 2017-10-04 proposed yellow 
 *
 */
@Singleton
class JavaCodeSerializeHRExtensions extends CCodeSerializeHRExtensions {
    
    public static val GLOBAL_OBJECTS = "globalObjects"
    
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsValuedObjectExtensions    

    new() {
        CODE_ANNOTATION = "Java"
    }
    
    override dispatch CharSequence serialize(ValueType valueType) {
        if (valueType == ValueType.BOOL) {
            return "boolean"
        } else if (valueType == ValueType.FLOAT) {
            return "double"
        } else if (valueType == ValueType.STRING) {
            return "String"            
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
        if (printCall.parameters.size == 1) {
            return "System.out.println(" + paramStr.substring(1, paramStr.length - 1) + ")" 
        } 
        
        return "System.out.format(" + paramStr.substring(1, paramStr.length - 1) + ")"
    }
    
    override dispatch CharSequence serialize(RandomCall randomCall) {
        if (!modifications.containsEntry(GLOBAL_OBJECTS, "Random random = new Random();"))
            modifications.put(GLOBAL_OBJECTS, "Random random = new Random(0);")
        if (!modifications.containsEntry(INCLUDES, "java.util.Random;"))
            modifications.put(INCLUDES, "java.util.Random;")
            
        return "random.nextDouble()"
    }
    
    override dispatch CharSequence serialize(RandomizeCall randomizeCall) {
        if (!modifications.containsEntry(GLOBAL_OBJECTS, "Random random = new Random();"))
            modifications.put(GLOBAL_OBJECTS, "Random random = new Random(0);")
        if (!modifications.containsEntry(INCLUDES, "java.util.Random;"))
            modifications.put(INCLUDES, "java.util.Random;")
            
        return "random.setSeed(System.currentTimeMillis())"
    }

    override dispatch CharSequence serialize(ReferenceCall referenceCall) {
        val declaration = referenceCall.valuedObject.referenceDeclaration
        if (declaration.extern.nullOrEmpty) { 
            return referenceCall.valuedObject.serialize.toString + referenceCall.parameters.serializeParameters
        } else {
            val contextCall = if (declaration.annotations.exists['Context'.equalsIgnoreCase(name)]) {
                'context.'
            } else {
                ''
            }
            var code = declaration.extern.head.code
            if (declaration.extern.exists[ hasAnnotation(codeAnnotation) ]) {
                code = declaration.extern.filter[ hasAnnotation(codeAnnotation) ].head.code
            }
            return contextCall + code + referenceCall.parameters.serializeParameters
        }
    }

    override dispatch CharSequence serializeHR(ReferenceCall referenceCall) {
        val declaration = referenceCall.valuedObject.referenceDeclaration
        if (declaration.extern.nullOrEmpty) { 
            return referenceCall.valuedObject.serializeHR.toString + referenceCall.parameters.serializeHRParameters
        } else {
            val contextCall = if (declaration.annotations.exists['Context'.equalsIgnoreCase(name)]) {
                'context.'
            } else {
                ''
            }
            var code = declaration.extern.head.code
            if (declaration.extern.exists[ hasAnnotation(codeAnnotation) ]) {
                code = declaration.extern.filter[ hasAnnotation(codeAnnotation) ].head.code
            }
            return contextCall + code + referenceCall.parameters.serializeHRParameters
        }
    }
}