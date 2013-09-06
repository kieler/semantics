/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.sccharts.extensions

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import java.util.List
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * SCCharts Extensions.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class Extension { 

   // -------------------------------------------------------------------------
   
    //-------------------------------------------------------------------------
    //--             H O T F I X   F O R   S C C H A R T S                   --
    //-------------------------------------------------------------------------
    // Because the SCCharts KExpressions Parser has a problem with
    // AND / OR lists of more than two elements the following fixes
    // an OperatorExpression of such kind.
    // Test 141
    def OperatorExpression fixForOperatorExpressionLists(OperatorExpression operatorExpression) {
        if (operatorExpression.subExpressions.size <= 2) {
            // In this case we do not need the fix
            return operatorExpression;
        }
        // Here we apply the fix recursively
        val operatorExpressionCopy = operatorExpression.copy;
        val newOperatorExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression();
        newOperatorExpression.setOperator(operatorExpression.operator);
        newOperatorExpression.subExpressions.add(operatorExpression.subExpressions.head);
        // Call recursively without the first element
        operatorExpressionCopy.subExpressions.remove(0);
        newOperatorExpression.subExpressions.add(operatorExpressionCopy.fixForOperatorExpressionLists);
        return newOperatorExpression;
    }
   
   // -------------------------------------------------------------------------   
      
}
