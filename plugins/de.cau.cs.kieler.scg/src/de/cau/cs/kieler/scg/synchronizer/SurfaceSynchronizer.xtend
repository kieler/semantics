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
 package de.cau.cs.kieler.scg.synchronizer

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGCopyExtensions
import de.cau.cs.kieler.scg.extensions.SCGExtensions
import de.cau.cs.kieler.scgsched.ScgschedFactory

/** 
 * ExitSCGSynchronizer
 * 
 * @author ssm
 * @kieler.design 2013-11-28 proposed 
 * @kieler.rating 2013-11-28 proposed yellow
 */
 // The Exit Synchronizer builds the synchronizer in relation to the exit nodes in the different threads.
class SurfaceSynchronizer extends AbstractSCGSynchronizer {
 
     @Inject
    extension SCGExtensions

     @Inject
    extension SCGCopyExtensions
  
    override protected SynchronizerData build(Join join) {
        var data = new SynchronizerData()

		val joinSB = join.schedulingBlock
		
        val exitNodes = <Exit> newLinkedList
        join.getAllPrevious.forEach[exitNodes.add(it.eContainer as Exit)]
        
        data.guardExpression.valuedObject = joinSB.guard
                
        var exitNodeCount = 0
        for(exit:exitNodes){
        	exitNodeCount = exitNodeCount + 1
            val exitSB = exit.schedulingBlock
            data.predecessors.add(exitSB)
            
            val threadSurfaces = exit.entry.getThreadNodes.filter(typeof(Surface)).toList
            
      		val emptyExp = ScgschedFactory::eINSTANCE.createEmptyExpressions    
      		emptyExp.valuedObject = KExpressionsFactory::eINSTANCE.createValuedObject
      		emptyExp.valuedObject.name = exitSB.guard.name + '_e' + exitNodeCount
      		emptyExp.valuedObject.type = ValueType::BOOL

            val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression
            expression.setOperator(OperatorType::NOT)
            val subExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression
            subExpression.setOperator(OperatorType::OR)
            threadSurfaces.forEach[subExpression.subExpressions.add(it.schedulingBlock.guard.reference)]
            expression.subExpressions.add(subExpression)
            emptyExp.expression = expression
            
            data.guardExpression.emptyExpressions.add(emptyExp)           
        }

        val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression
        expression.setOperator(OperatorType::AND)
        val terminationExpr = KExpressionsFactory::eINSTANCE.createOperatorExpression
        terminationExpr.setOperator(OperatorType::OR)
        
        data.guardExpression.emptyExpressions.forEach[
        	val threadExpr = KExpressionsFactory::eINSTANCE.createOperatorExpression
        	threadExpr.setOperator(OperatorType::OR)
        	threadExpr.subExpressions.add(it.valuedObject.reference)
        	threadExpr.subExpressions.add(it.expression)
        	expression.subExpressions.add(threadExpr)
        	terminationExpr.subExpressions.add(it.valuedObject.reference)
        ]
        
        expression.subExpressions.add(terminationExpr)
        data.guardExpression.expression = expression
        
        data 
    }
    
}