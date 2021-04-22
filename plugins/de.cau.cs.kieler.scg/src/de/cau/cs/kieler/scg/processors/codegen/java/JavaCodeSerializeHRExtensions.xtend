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
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.PrintCall
import de.cau.cs.kieler.kexpressions.RandomCall
import de.cau.cs.kieler.kexpressions.RandomizeCall
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeSerializeHRExtensions
import java.util.ArrayList
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.ParameterAccessType
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsTypeExtensions

/**
 * @author ssm
 * @kieler.design 2017-10-04 proposed 
 * @kieler.rating 2017-10-04 proposed yellow 
 *
 */
@Singleton
class JavaCodeSerializeHRExtensions extends CCodeSerializeHRExtensions {
    
    @Inject extension SCGMethodExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsTypeExtensions
    
    public static val GLOBAL_OBJECTS = "globalObjects"
    
    new() {
        CODE_ANNOTATION = "Java"
        assumeOnlyGlobalFunctions = false // Java has proper OO
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
    
    override addPlatformDependentParamsToMethodCall(ArrayList<Parameter> params, MethodDeclaration declaration, ReferenceCall referenceCall) {
        // No special parameters neccessary
    }
    
    override def CharSequence serializeHROperatorExpressionEQ(OperatorExpression expression) {
        if (expression.subExpressions.forall[hasString]) {
            return "(" + combineOperatorsHR(expression.subExpressions.iterator, ").equals( ") + " )"
        }
        combineOperatorsHR(expression.subExpressions.iterator, " == ")
    }
}