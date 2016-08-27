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
package de.cau.cs.kieler.scg.processors.optimizer

import de.cau.cs.kieler.scg.processors.optimizer.AbstractOptimizer
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.Expression
import java.util.HashMap
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scg.Conditional

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions

/**
 * @author ssm
 *
 */
class NotGuardMinimizer extends AbstractOptimizer {
    
    @Inject
    extension KExpressionsCreateExtensions
    
    private val notGuardMapping = new HashMap<ValuedObject, Expression>
    
    override optimize(SCGraph scg) {
        scg.nodes.filter(typeof(Assignment)).forEach[
            if ((it.expression instanceof OperatorExpression) &&
                ((it.expression as OperatorExpression).operator == OperatorType::NOT) &&
                ((it.expression as OperatorExpression).subExpressions.head instanceof ValuedObject)
            ) {
                val replacementExpression = createNotExpression
                replacementExpression.subExpressions.add((it as OperatorExpression).subExpressions.head)
                notGuardMapping.put(it.valuedObject, replacementExpression)
                scg.nodes.remove(it)
            }
        ]    
        
        notGuardMapping.keySet.forEach[key|
//            scg.eAllContents.filter(typeof(ValuedObject)).filter[ it == key].forEach[
//                
//            ]
            scg.eAllContents.filter(typeof(ValuedObjectReference)).filter[ it.valuedObject == key ].forEach[
                if (it.eContainer instanceof Assignment) {
                    (it.eContainer as Assignment).expression = notGuardMapping.get(key).copy
                } else if (it.eContainer instanceof Conditional) {
                    (it.eContainer as Conditional).condition = notGuardMapping.get(key).copy
                } else if (it.eContainer instanceof OperatorExpression) {
                    val oe = it.eContainer as OperatorExpression   
                    val index = oe.subExpressions.indexOf(it)
                    oe.subExpressions.set(index, notGuardMapping.get(key).copy)
                }
            ]
        ]
        
        scg
    }
    
}