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
package de.cau.cs.kieler.sccharts.processors

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.State

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * SCCharts Followed By Transformation.
 * 
 * @author lgr
 */
class FollowedBy extends SCChartsProcessor implements Traceable {
    
    @Inject extension KExpressionsCreateExtensions
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.followedBy"
    }
    
    override getName() {
        "Followed By Operator"
    }
    
    override process() {
        for (rootState : getModel.rootStates) {
            rootState.transformFbyOperator
        }
    }
    
    def transformFbyOperator(State rootState) {
        val allFby = rootState.eAllContents.filter(OperatorExpression).filter[ operator == OperatorType.FBY ].toList
        
        for (fby : allFby) {
            var transformedOpExpr = createOperatorExpression(OperatorType.INIT)
            transformedOpExpr.subExpressions += fby.subExpressions.head
            
            var numOfPres = 1
            for (subs : fby.subExpressions.immutableCopy) {
                var expr = subs
                for (var i = 0; i < numOfPres; i++) {
                    expr = createPreExpression(expr)
                }
                numOfPres++
                transformedOpExpr.subExpressions += expr
            }
            
            fby.replace(transformedOpExpr)
        }
    }

}
