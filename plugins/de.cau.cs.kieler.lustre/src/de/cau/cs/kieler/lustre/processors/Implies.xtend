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
 * SCCharts Implies Transformation.
 * 
 * @author lgr
 */
class Implies extends SCChartsProcessor implements Traceable {
    
    @Inject extension KExpressionsCreateExtensions
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.implies"
    }
    
    override getName() {
        "Implies Operator"
    }
    
    override process() {
        for (rootState : getModel.rootStates) {
            rootState.transformImpliesOperator
        }
    }
    
    /**
     * Transforms implies in a right associative manner (just like in Lustre).
     */
    def transformImpliesOperator(State rootState) {
        val allImplies = rootState.eAllContents.filter(OperatorExpression).filter[ operator == OperatorType.IMPLIES ].toList
        
        for (imply : allImplies) {
            var transformedOpExpr = createLogicalOrExpression
            var lastExpr = imply.subExpressions.last
            lastExpr.remove
            
            for (subExpr : imply.subExpressions.immutableCopy) {
                transformedOpExpr.subExpressions += createNotExpression(subExpr)
            }
            transformedOpExpr.subExpressions += lastExpr
            
            imply.replace(transformedOpExpr)
        }
    }

}
