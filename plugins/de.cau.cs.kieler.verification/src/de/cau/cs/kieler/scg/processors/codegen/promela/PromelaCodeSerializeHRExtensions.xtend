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
package de.cau.cs.kieler.scg.processors.codegen.promela

import com.google.inject.Inject
import com.google.inject.Singleton
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.PrintCall
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.TextExpression
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeSerializeHRExtensions

/**
 * @author aas
 *
 */
@Singleton
class PromelaCodeSerializeHRExtensions extends CCodeSerializeHRExtensions {
    
    @Inject extension AnnotationsExtensions
    @Inject extension KEffectsExtensions    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExtDeclarationExtensions
    
    override dispatch CharSequence serializeHR(Assignment assignment) {
        // TODO: only handling of some operators is different from base class. Is it possible to override smarter?
        if (assignment.valuedObject !== null) {
            var CharSequence assignmentText = ""
            if (assignment.expression !== null && !assignment.operator.isPostfixOperator) {
                assignmentText = serializeHR(assignment.expression)
            }
            var valuedObjectName = valuedObjectPrefix + assignment.valuedObject.name
            if (!assignment.indices.nullOrEmpty) {
                valuedObjectName = valuedObjectName + serializeHRIndices(assignment.indices)
            }
            if (assignment.expression instanceof TextExpression) {
                assignmentText = (assignment.expression as TextExpression).serializeHR
            }
            var String assignmentStr
            val isComplex = assignment.expression instanceof OperatorExpression
            if (assignment.operator == AssignOperator::ASSIGNMIN) {
                if (isComplex) assignmentText = "(" + assignmentText + ")"
                assignmentStr = valuedObjectName + " = (" + valuedObjectName + " < " + assignmentText + ") ? " + valuedObjectName + " : " + assignmentText
            } else if (assignment.operator == AssignOperator::ASSIGNMAX) {
                if (isComplex) assignmentText = "(" + assignmentText + ")"
                assignmentStr = valuedObjectName + " = (" + valuedObjectName + " > " + assignmentText + ") ? " + valuedObjectName + " : " + assignmentText
            } else if (assignment.operator == AssignOperator::ASSIGNOR){
                if (isComplex) assignmentText = "(" + assignmentText + ")"
                assignmentStr = '''«valuedObjectName» = «valuedObjectName» || «assignmentText»''' 
            } else if (assignment.operator == AssignOperator::ASSIGNAND){
                if (isComplex) assignmentText = "(" + assignmentText + ")"
                assignmentStr = '''«valuedObjectName» = «valuedObjectName» && «assignmentText»''' 
            } else if (assignment.operator == AssignOperator::ASSIGNADD){
                if (isComplex) assignmentText = "(" + assignmentText + ")"
                assignmentStr = '''«valuedObjectName» = «valuedObjectName» + «assignmentText»''' 
            } else if (assignment.operator == AssignOperator::ASSIGNSUB){
                if (isComplex) assignmentText = "(" + assignmentText + ")"
                assignmentStr = '''«valuedObjectName» = «valuedObjectName» - «assignmentText»''' 
            } else if (assignment.operator == AssignOperator::ASSIGNMUL){
                if (isComplex) assignmentText = "(" + assignmentText + ")"
                assignmentStr = '''«valuedObjectName» = «valuedObjectName» * «assignmentText»''' 
            } else if (assignment.operator == AssignOperator::ASSIGNDIV){
                if (isComplex) assignmentText = "(" + assignmentText + ")"
                assignmentStr = '''«valuedObjectName» = «valuedObjectName» / «assignmentText»''' 
            } else {
                assignmentStr = valuedObjectName + assignment.operator.serializeAssignOperator + assignmentText
            }
            return assignmentStr
        } else if (assignment.expression instanceof TextExpression) {
            return (assignment.expression as TextExpression).text
        } else if (assignment.expression instanceof FunctionCall) {
            return serialize(assignment.expression) 
        }
        else if (assignment.expression instanceof ReferenceCall) {
            return (assignment.expression as ReferenceCall).serializeHR
        } else if (assignment.expression instanceof PrintCall) {
            return (assignment.expression as PrintCall).serializeHR
        }
    }
    
    override dispatch CharSequence serialize(ValueType valueType) {
        return valueType.literal
    }
    
    override serializeHROperatorExpressionConditional(OperatorExpression expression) {
        // In PROMELA the ternary operator is written as "(p -> q : r)" instead "p ? q : r"
        // The round braces are important (see cond_expr manual of PROMELA).
        if (expression.subExpressions.size == 3) {
            return "(" + expression.subExpressions.head.serializeHR + " -> " +
                expression.subExpressions.get(1).serializeHR + " : " + 
                expression.subExpressions.get(2).serializeHR + ")" 
        } else {
            throw new IllegalArgumentException("An OperatorExpression with a ternary conditional has " + 
                expression.subExpressions.size + " arguments.")
        }
    }
}