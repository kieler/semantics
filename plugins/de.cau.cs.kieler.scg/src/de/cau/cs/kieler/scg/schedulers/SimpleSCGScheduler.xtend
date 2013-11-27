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
import com.google.common.collect.ImmutableList

/** 
 * SimpleSCGScheduler
 * 
 * @author ssm
 * @kieler.design 2013-11-27 proposed 
 * @kieler.rating 2013-11-27 proposed yellow
 */
class SimpleSCGScheduler extends AbstractSCGScheduler {
    
    override protected execute() {
        val schedule = ScgschedFactory::eINSTANCE.createSchedule
        val schedulingBlocks = <SchedulingBlock> newLinkedList
        SCG.basicBlocks.forEach[schedulingBlocks.addAll(it.schedulingBlocks)]
        //var schedulingBlocks = SCG.eAllContents.filter(typeof(SchedulingBlock))
        
        var fixpoint  = false
        
        while (schedulingBlocks.size > 0 && !fixpoint) {
            fixpoint = true
            var schedulingBlocksCopy = ImmutableList::copyOf(schedulingBlocks)
            
            for(block : schedulingBlocksCopy) {
                var placeable = true
                val parentBB = block.eContainer as BasicBlock
                for(ae:parentBB.activationExpressions){
                    if (ae.basicBlocks.size > 0) for(bb:ae.basicBlocks) 
                    for(sb:bb.schedulingBlocks){
                        if (!schedule.schedulingBlocks.contains(sb)) { placeable = false }
                    }
                }
                if (placeable) {
                    schedule.schedulingBlocks.add(block)
//                    schedulingBlocks.filter[it == block].remove
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
    }
    
}