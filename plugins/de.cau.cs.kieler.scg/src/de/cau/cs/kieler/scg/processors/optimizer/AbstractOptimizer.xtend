/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.processors.optimizer

import de.cau.cs.kieler.scg.SCGraph

/** 
 * This class is part of the SCG transformation chain. In particular a optimizer is called by the scheduler
 * after it has created the schedule or subsequent transformations to apply optimizations. 
 * This abstract class defines the generic interface of an optimizer 
 * since the scheduler may choose different optimizers for different tasks.<br>
 * The chain is used to gather important information 
 * about the schedulability of a given SCG. This is done in several key steps. Between two steps the results 
 * are cached in specifically designed metamodels for further processing. At the end of the transformation
 * chain a newly generated (and sequentialized) SCG is returned. <br>
 * You can either call the transformations manually or use the SCG transformation extensions to enrich the
 * SCGs with the desired information.<br>
 * <pre>
 * SCG 
 *   |-- Dependency Analysis 	 					
 *   |-- Basic Block Analysis
 *   |-- Scheduler
 *   |    |-- Graph analyses
 *   |    |-- Scheduling
 *   |    |   |-- Synchonize threads			
 *   |    |-- Optimization					<== YOU ARE HERE
 *   |-- Sequentialization (new SCG)
 *       |-- Optimization					<== OR HERE
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2013-12-02 proposed 
 * @kieler.rating 2013-12-02 proposed yellow
 * @abstract
 */
abstract class AbstractOptimizer {
  
    /**
     * This function is the entry point for the scheduler or subsequent transformations. 
     * The scheduler calls {@code optimize} after it has created its schedule.
     * Subsequent transformation may call this function at any point.<br>
     * Override this method to implement your actual optimization.
     * 
     * @param scg
     * 			the scg in question
     * @return Returns the optimized SCG. 
     */
    abstract def SCGraph optimize(SCGraph scg) 
    
}