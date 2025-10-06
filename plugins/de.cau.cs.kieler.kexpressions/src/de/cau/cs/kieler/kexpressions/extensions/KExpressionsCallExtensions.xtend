/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kexpressions.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ParameterAccessType
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import java.util.List

/**
 * @author ssm
 * @kieler.design 2020-01-02 proposed 
 * @kieler.rating 2020-01-02 proposed yellow
 *
 */
class KExpressionsCallExtensions {
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsDeclarationExtensions
    
    def hasReferenceCall(Assignment assignment) {
        assignment.expression instanceof ReferenceCall    
    }
    
    def getReferenceCall(Assignment assignment) {
        return if (assignment.hasReferenceCall) assignment.expression as ReferenceCall else null
    }   
    
    def List<ReferenceCall> getAllReferenceCalls(Expression expression) {
        switch(expression) {
            ReferenceCall: return <ReferenceCall> newLinkedList => [ it += expression ]
            OperatorExpression: {
                return <ReferenceCall> newLinkedList => [
                    for (e : expression.subExpressions) {
                        it += e.allReferenceCalls
                    }
                ]
            }
            default: return #[]
        }
    }
    def isPureOutput(Parameter parameter) {
        parameter.accessType == ParameterAccessType.PURE_OUTPUT 
    }
    
    def isReferenceOutput(Parameter parameter) {
        parameter.accessType == ParameterAccessType.CALL_BY_REFERENCE
    }

    def isOutput(Parameter parameter) {
        parameter.isPureOutput || parameter.isReferenceOutput
    }
    
    def setParameterOutputToReference(Parameter parameter) {
        parameter.accessType = ParameterAccessType.CALL_BY_REFERENCE
    }

    def setParameterOutputToPureOutput(Parameter parameter) {
        parameter.accessType = ParameterAccessType.PURE_OUTPUT
    }
    
    def isMethodCall(ReferenceCall call) {
        return call.lowermostReference?.valuedObject?.declaration?.isMethod
    }

}