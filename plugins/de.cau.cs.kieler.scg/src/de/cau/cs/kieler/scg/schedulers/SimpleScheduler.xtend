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
 */package de.cau.cs.kieler.scg.schedulers

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
    
	override protected analyse(SCGraphSched scg) {
		val PotentialInstantaneousLoopAnalyser loopAnalyser = Guice.createInjector().getInstance(typeof(PotentialInstantaneousLoopAnalyser))
		loopAnalyser.analyse(scg).copyAllProblems(scg).SCG as SCGraphSched
    }    
    
	override protected optimize(SCGraphSched scg) {
		scg
	}
	
    override protected SCGraphSched build(SCGraphSched SCG) {
        val schedule = ScgschedFactory::eINSTANCE.createSchedule
        val schedulingBlocks = <SchedulingBlock> newLinkedList
        SCG.basicBlocks.forEach[schedulingBlocks.addAll(it.schedulingBlocks)]
        
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
                    schedulingBlocks.remove(block)
                    fixpoint = false
                }
            }
        }
        if (fixpoint) {
            System::out.println("The SCG is NOT ASC-schedulable!")
            SCG.setUnschedulable(true)            
            SCG.schedules.add(schedule)
        } else {
            System::out.println("The SCG is ASC-schedulable.")
            SCG.setUnschedulable(false)
            SCG.schedules.add(schedule)
        }
        SCG
    }

}