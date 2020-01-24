/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.lustre.processors

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.State

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kexpressions.Expression
import org.eclipse.emf.common.util.EList

/**
 * SCCharts AtMostOne Transformation.
 * 
 * @author lgr
 */
class AtMostOne extends de.cau.cs.kieler.sccharts.processors.SCChartsProcessor implements Traceable {
    
    @Inject extension KExpressionsCreateExtensions
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.atMostOne"
    }
    
    override getName() {
        "At Most One Operator"
    }
    
    override process() {
        for (rootState : getModel.rootStates) {
            rootState.transformAtMostOneOperator
        }
    }
    
    def transformAtMostOneOperator(State rootState) {
        val allAtMostOne = rootState.eAllContents.filter(OperatorExpression).filter[ operator == OperatorType.ATMOSTONEOF ].toList
        
        /* #(A, B, C)  <=>  !OR (A, B, C) 
         *                  || A && ! OR(B,C) 
         *                  || B && ! OR(A,C) 
         *                  || C && ! OR(A,B)  */
        for (atMostOne : allAtMostOne) {
            var none = createNotExpression(createLogicalOrExpression => [
                subExpressions += atMostOne.subExpressions.map[copy] ])
            
            var transformedOpExpr = createLogicalOrExpression
            transformedOpExpr.subExpressions += none
            
            for (subExp : atMostOne.subExpressions) {
                var andExpr = createLogicalAndExpression 
                andExpr.subExpressions += subExp.copy
                
                var orExpr = createLogicalOrExpression
                orExpr.subExpressions += atMostOne.subExpressions.without(subExp).map[copy]
                
                andExpr.subExpressions += createNotExpression(orExpr)
                
                transformedOpExpr.subExpressions += andExpr
            }
            
            atMostOne.replace(transformedOpExpr)
        }
    }
    
    def without(EList<Expression> list, Expression elem) {
        var newList = newArrayList
        
        for (listElem : list) {
            if (listElem !== elem) {
                newList.add(listElem)
            }
        }
        
        newList
    }

}
