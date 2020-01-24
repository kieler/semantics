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
package de.cau.cs.kieler.lustre.scade.extensions

import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.lustre.lustre.LustreValuedObject
import de.cau.cs.kieler.lustre.lustre.LustreVariableDeclaration
import java.util.HashSet
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsTypeExtensions
import com.google.inject.Inject

/**
 * @author lgr
 */
class ScadeTransformationExtensions {
    
    @Inject extension KExpressionsTypeExtensions
    
    /**
     * Determine the ValueType for an expression.
     */
    def ValueType determineType(Expression expression, HashSet<ValueType> superTypes) {
        var type = ValueType.UNKNOWN
        
        switch (expression) {
            Value: {
                type = expression.valueType
            }
            ValuedObjectReference: {
                var valObj = expression.valuedObject 
                if (valObj !== null) {
                    superTypes.remove(ValueType.UNKNOWN)
                    if (superTypes.size == 1) {
                        if (valObj instanceof LustreValuedObject) {
                            valObj.type = superTypes.head
                        } else {
                            (valObj.eContainer as LustreVariableDeclaration).type = superTypes.head
                        }
                    }
                }
            }
            OperatorExpression: {
                var subExpressionsTypes = newHashSet
                var skip = expression.operator == OperatorType.CONDITIONAL
                for (subExpr : expression.subExpressions) {
                    if (skip) {
                        skip = false
                    } else {
                        subExpressionsTypes.add(determineType(subExpr, subExpressionsTypes))
                    }
                }
                subExpressionsTypes.remove(ValueType.UNKNOWN)
                if (subExpressionsTypes.size == 1) {
                    return subExpressionsTypes.head
                } else {
                    
                }
                return ValueType.INT
            }
        }
        
        return type
    }
}