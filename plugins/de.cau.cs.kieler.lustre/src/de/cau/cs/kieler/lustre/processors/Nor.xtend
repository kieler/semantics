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

/**
 * SCCharts Nor Transformation.
 * 
 * @author lgr
 */
class Nor extends de.cau.cs.kieler.sccharts.processors.SCChartsProcessor implements Traceable {
    
    @Inject extension KExpressionsCreateExtensions
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.nor"
    }
    
    override getName() {
        "Nor Operator"
    }
    
    override process() {
        for (rootState : getModel.rootStates) {
            rootState.transformNorOperator
        }
    }
    
    def transformNorOperator(State rootState) {
        val allNor = rootState.eAllContents.filter(OperatorExpression).filter[ operator == OperatorType.NOR ].toList
        
        for (nor : allNor) {
            var transformedOpExpr = createNotExpression(createLogicalOrExpression => [
                subExpressions += nor.subExpressions])
            
            nor.replace(transformedOpExpr)
        }
    }

}
