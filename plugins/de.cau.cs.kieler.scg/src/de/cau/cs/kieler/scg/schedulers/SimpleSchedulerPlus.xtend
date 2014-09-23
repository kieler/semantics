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

import com.google.inject.Inject
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.KielerCompilerException
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.extensions.SCGCacheExtensions

/** 
 * This class is part of the SCG transformation chain. 
 * The transformation chain is used to gather important information 
 * about the schedulability of a given SCG. This is done in several key steps. 
 * You can either call the transformation manually or use KiCo to perform a series of transformations.
 * <pre>
 * SCG 
 *   |-- Dependency Analysis                        
 *   |-- Basic Block Analysis
 *   |-- Scheduler                          <== YOU ARE HERE
 *   |-- Sequentialization (new SCG)                
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2013-11-27 proposed 
 * @kieler.rating 2013-11-27 proposed yellow
 */
class SimpleSchedulerPlus extends SimpleScheduler {
    
    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
     

    @Inject
    extension SCGCacheExtensions    
    
    
    // -------------------------------------------------------------------------
    // -- Globals 
    // -------------------------------------------------------------------------
   
    // -------------------------------------------------------------------------
    // -- Scheduler 
    // -------------------------------------------------------------------------
    
	/**
	 * The build method builds the schedules for the given SCG. It uses the information from the dependency and
	 * basic block analyses to build the guard expressions of the blocks. A schedule itself is an ordered list
	 * of scheduling blocks. The next transformation step can use this information to create a new SCG containing
	 * the guard expressions in the correct order.<br>
     * <pre>
     * Scheduler: Analyses --> Build schedule --> Optimization
     * </pre>
	 * This method is called by the interface. There is no need to call it directly.
	 * 
	 * @param scg
	 * 			the source SCG
	 * @return Returns the enriched SCG model.
	 */
    override public SCGraph schedule(SCGraph scg, KielerCompilerContext context) {

    	// Create a new schedule using the scgsched factory.
        val schedule = ScgFactory::eINSTANCE.createSchedule

        // Create and fill a list for all scheduling blocks.
        val schedulingConstraints = scg.orderSchedulingBlocks
        
        schedulingBlockCount = scg.createSchedulingBlockCache(schedulingBlockCache)
        
        val sBlockList = <SchedulingBlock> newLinkedList
        var schedulable = scg.createSchedule(sBlockList, schedulingConstraints)
        schedule.schedulingBlocks += sBlockList
        
        // Print out results on the console
        // and add the scheduling information to the graph.
        if (!schedulable) {
            if (context != null) {
                context.getCompilationResult().addPostponedWarning(new KielerCompilerException(getId(), "The SCG is NOT ASC-schedulable!"));
            }
            System::out.println("The SCG is NOT ASC-schedulable!")
            scg.schedules.add(schedule)
        } else {
            System::out.println("The SCG is ASC-schedulable.")
            scg.schedules.add(schedule)
        }
        
        scg
    }
    

}