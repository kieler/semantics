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
package de.cau.cs.kieler.scg.processors.codegen.python

import com.google.inject.Inject
import com.google.inject.Singleton
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.NullValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.PrintCall
import de.cau.cs.kieler.kexpressions.RandomCall
import de.cau.cs.kieler.kexpressions.RandomizeCall
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsTypeExtensions
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeSerializeHRExtensions
import java.util.ArrayList

/**
 * @author als
 *
 */
@Singleton
class PythonCodeSerializeHRExtensions extends CCodeSerializeHRExtensions {
    
    @Inject extension SCGMethodExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsTypeExtensions
    
    public static val GLOBAL_OBJECTS = "globalObjects"
    
    new() {
        CODE_ANNOTATION = "PYTHON"
        globalEnumNamespace = false // Python has proper enums
        assumeOnlyGlobalFunctions = false // Python has proper OO
        complyWithGCCWall = false // Python does not use GCC
    }
    
    override dispatch CharSequence serialize(ValueType valueType) {
        if (valueType == ValueType.BOOL) {
            return "bool"
        } else if (valueType == ValueType.FLOAT) {
            return "float"
        } else if (valueType == ValueType.STRING) {
            return "str"            
        } else {
            return valueType.literal
        }
    }
    
    override dispatch CharSequence serialize(BoolValue expression) {
        if (expression.value) return "True"
        return "False"
    }
    
    override dispatch CharSequence serialize(PrintCall printCall) {
        var paramStr = printCall.parameters.serializeParameters.toString
        return "print(" + paramStr.substring(1, paramStr.length - 1) + ")"
    }
    
    override dispatch CharSequence serialize(RandomCall randomCall) {
        if (!modifications.containsEntry(INCLUDES, "random"))
            modifications.put(INCLUDES, "random")
            
        return "random.random()"
    }
    
    override dispatch CharSequence serialize(RandomizeCall randomizeCall) {
        if (!modifications.containsEntry(INCLUDES, "random"))
            modifications.put(INCLUDES, "random")
            
        return "random.seed()"
    }
    
    override addPlatformDependentParamsToMethodCall(ArrayList<Parameter> params, MethodDeclaration declaration, ReferenceCall referenceCall) {
        // No special parameters neccessary
    }
    
    override dispatch CharSequence serialize(NullValue expression) {
        "None"
    } 
    
    override CharSequence serializeHROperatorExpressionNot(OperatorExpression expression) {
        "not " + expression.subExpressions.head.serializeHR
    }
    
    override CharSequence serializeHROperatorExpressionLogicalAnd(OperatorExpression expression) {
        combineOperatorsHR(expression.subExpressions.iterator, " and ")
    }
    
    override CharSequence serializeHROperatorExpressionLogicalOr(OperatorExpression expression) {
        combineOperatorsHR(expression.subExpressions.iterator, " or ")
    }
    
    override CharSequence serializeHROperatorExpressionConditional(OperatorExpression expression) {
        if (expression.subExpressions.size == 2 || expression.subExpressions.size == 3 ) {
            return expression.subExpressions.get(1).serializeHR + " if "
                + expression.subExpressions.head.serializeHR
                + if (expression.subExpressions.size == 3) "else" + expression.subExpressions.get(2).serializeHR else ""
        } else {
            throw new IllegalArgumentException("An OperatorExpression with a ternary conditional has " + 
                expression.subExpressions.size + " arguments.")
        }
    } 
}