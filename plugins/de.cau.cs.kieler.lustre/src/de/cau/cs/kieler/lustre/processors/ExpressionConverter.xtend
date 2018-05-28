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
package de.cau.cs.kieler.lustre.processors

import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.lustre.lustre.Variable_Declaration
import de.cau.cs.kieler.lustre.lustre.And
import de.cau.cs.kieler.lustre.lustre.VariableReference
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.lustre.lustre.LustreFactory
import de.cau.cs.kieler.lustre.lustre.impl.LustreFactoryImpl
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.lustre.lustre.IfThenElse
import de.cau.cs.kieler.kexpressions.BoolValue

/**
 * @author ssm
 * @kieler.design 2018-05-28 proposed
 * @kieler.rating 2018-05-28 proposed yellow  
 *
 */
class ExpressionConverter {
    
    static extension LustreFactory lustre = new LustreFactoryImpl
    
    @Accessors val variableMapping = <ValuedObject, Variable_Declaration> newHashMap
    
    def getVar(ValuedObject vo) {
        variableMapping.get(vo)
    }
    
    def IfThenElse createConditional(de.cau.cs.kieler.kexpressions.Expression condition, 
        de.cau.cs.kieler.kexpressions.Expression thenExpr, 
        de.cau.cs.kieler.kexpressions.Expression elseExpr
    ) {
        val ite = createIfThenElse => [
            ifexpr = condition.convertExpression
            thenexpr = thenExpr.convertExpression
            elseexpr = elseExpr.convertExpression
        ]
        
        ite
    }
    
    def de.cau.cs.kieler.lustre.lustre.Expression convertExpression(de.cau.cs.kieler.kexpressions.Expression kexp) {
        
        if (kexp instanceof ValuedObjectReference) {
            return createVariableReference => [
                value = kexp.valuedObject.getVar
            ]
        } else if (kexp instanceof Value) {
            if (kexp instanceof BoolValue) {
                return createBoolConstant => [
                    value = kexp.value                    
                ]
            }
        } else if (kexp instanceof OperatorExpression) {
            switch(kexp.operator) {
                case LOGICAL_AND: return createAnd => [
                    for (se : kexp.subExpressions) {
                        subExpressions += se.convertExpression
                    }
                ] 
            }
        }
    }
   
}