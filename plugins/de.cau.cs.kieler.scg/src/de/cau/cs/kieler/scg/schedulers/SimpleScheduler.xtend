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
 package de.cau.cs.kieler.scg.schedulers

import de.cau.cs.kieler.scg.schedulers.AbstractSCGScheduler
import de.cau.cs.kieler.scgbb.SchedulingBlock
import de.cau.cs.kieler.scgsched.ScgschedFactory
import de.cau.cs.kieler.scgbb.BasicBlock

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import com.google.common.collect.ImmutableListimport com.google.inject.Inject
import de.cau.cs.kieler.scg.extensions.SCGExtensions
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scgsched.SCGraphSched
import com.google.inject.Guice
import de.cau.cs.kieler.scg.analyser.PotentialInstantaneousLoopAnalyser
import de.cau.cs.kieler.scgsched.GuardExpression
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.scg.extensions.SCGCopyExtensions
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.scg.SCGraph

/** 
 * SimpleScheduler
 * 
 * @author ssm
 * @kieler.design 2013-11-27 proposed 
 * @kieler.rating 2013-11-27 proposed yellow
 */
class SimpleScheduler extends AbstractSCGScheduler {
    
    @Inject
    extension SCGExtensions    

    @Inject
    extension SCGCopyExtensions    
    
    private static val String GOGUARDNAME = "_GO"
    
	override protected analyse(SCGraphSched scg) {
		val PotentialInstantaneousLoopAnalyser loopAnalyser = Guice.createInjector().getInstance(typeof(PotentialInstantaneousLoopAnalyser))
		loopAnalyser.analyse(scg).copyAllProblems(scg).SCG as SCGraphSched
    }    
    
	override protected optimize(SCGraphSched scg) {
		scg
	}
	
    override protected SCGraphSched build(SCGraphSched scg) {
        val schedule = ScgschedFactory::eINSTANCE.createSchedule
        val schedulingBlocks = <SchedulingBlock> newLinkedList
        scg.basicBlocks.forEach[schedulingBlocks.addAll(it.schedulingBlocks)]
        
        KExpressionsFactory::eINSTANCE.createValuedObject => [
        	name = GOGUARDNAME
        	type = ValueType::BOOL
        	scg.valuedObjects.add(it)
        ]
        
        var fixpoint  = false
        
        while (schedulingBlocks.size > 0 && !fixpoint) {
            fixpoint = true
            var schedulingBlocksCopy = ImmutableList::copyOf(schedulingBlocks)
            
            for(block : schedulingBlocksCopy) {
                var placeable = true
                val parentBB = block.eContainer as BasicBlock
                for(pred:parentBB.predecessors){
                    for(sb:pred.schedulingBlocks){
                        if (!schedule.schedulingBlocks.contains(sb)) { placeable = false }
                    }
                }
                for(dep:block.dependencies) {
                    if (dep.concurrent && !dep.confluent)
                      if (!schedule.schedulingBlocks.contains((dep.eContainer as Node).schedulingBlock)) { placeable = false }
                }
                if (placeable) {
                    schedule.schedulingBlocks.add(block)
                    scg.guards.add(block.createGuardExpression(scg))
                    schedulingBlocks.remove(block)
                    fixpoint = false
                }
            }
        }
        if (fixpoint) {
            System::out.println("The SCG is NOT ASC-schedulable!")
            scg.setUnschedulable(true)            
            scg.schedules.add(schedule)
        } else {
            System::out.println("The SCG is ASC-schedulable.")
            scg.setUnschedulable(false)
            scg.schedules.add(schedule)
        }
        scg
    }
    
    protected def GuardExpression createGuardExpression(SchedulingBlock schedulingBlock, SCGraph scg) {
    	val gExpr = ScgschedFactory::eINSTANCE.createGuardExpression
    	gExpr.valuedObject = schedulingBlock.guard
    	
    	if (schedulingBlock.goBlock) {
    		gExpr.expression = scg.findValuedObjectByName(GOGUARDNAME).reference
    	} 
    	else if (schedulingBlock.depthBlock) {
    		
    	}
    	else if (schedulingBlock.synchronizerBlock) {

		} 
		else {
			val bb = schedulingBlock.basicBlock
			if (bb.predecessors.size>1) {
				val expr = KExpressionsFactory::eINSTANCE.createOperatorExpression
				expr.setOperator(OperatorType::OR)
				bb.predecessors.forEach[ expr.subExpressions.add(it.guards.head.reference) ]
				gExpr.expression = expr
			} 
			else if (bb.predecessors.size == 1) {
				gExpr.expression = bb.predecessors.head.guards.head.reference
			} 
			else 
			{
				throw new UnsupportedOperationException("Cannot handle standard guard without predecessor information!")
			}
		}
		    	
    	gExpr
    }

}