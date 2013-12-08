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

import com.google.inject.Guice
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGCopyExtensions
import de.cau.cs.kieler.scg.extensions.SCGExtensions

/** 
 * ExitSCGSynchronizer
 * 
 * @author ssm
 * @kieler.design 2013-11-28 proposed 
 * @kieler.rating 2013-11-28 proposed yellow
 */
 // The Exit Synchronizer builds the synchronizer in relation to the exit nodes in the different threads.
class ExitSurfaceSynchronizer extends AbstractSCGSynchronizer {
 
     @Inject
    extension SCGExtensions

     @Inject
    extension SCGCopyExtensions
  
    override protected SynchronizerData build(Fork fork) {
        var data = new SynchronizerData()

		val JoinFeedbackAnalyser feedbackAnalyser = Guice.createInjector().getInstance(typeof(JoinFeedbackAnalyser))
		
        val scg = fork.graph
//		val feedbackResult = feedbackAnalyser.analyse(scg, fork)
		
        val exitNodes = <Exit> newLinkedList
        fork.getAllNext.forEach[exitNodes.add((it.target as Entry).exit)]
        
        val guardExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression
        guardExpression.setOperator(OperatorType::AND)
//        data.activationGuards.add(fork.join.schedulingBlock.guard)
        data.guardExpression = (guardExpression)
        
        var exitNodeCount = 0
        for(exit:exitNodes){
        	exitNodeCount = exitNodeCount + 1
            val exitBB = exit.basicBlock
            data.predecessors.add(exitBB)
            
            val threadSurfaces = exit.entry.getThreadNodes.filter(typeof(Surface)).toList
            
			val empty = KExpressionsFactory::eINSTANCE.createValuedObject
        	empty.name = exitBB.guard.name + 'empty' + exitNodeCount
      		empty.type = ValueType::BOOL    
      		data.emptyGuards.add(empty)        

            val emptyExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression
            emptyExpression.setOperator(OperatorType::NOT)
            val emptySubExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression
            emptySubExpression.setOperator(OperatorType::OR)
            threadSurfaces.forEach[emptySubExpression.subExpressions.add(it.schedulingBlock.guard.reference)]
            emptyExpression.subExpressions.add(emptySubExpression)
            data.emptyExpressions.add(emptyExpression)
            
            val threadExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression
            threadExpression.setOperator(OperatorType::OR)
            threadExpression.subExpressions.add(exit.schedulingBlock.guard.reference)
            threadExpression.subExpressions.add(empty.reference)
            
            guardExpression.subExpressions.add(threadExpression)
        }
        data 
    }
    
}