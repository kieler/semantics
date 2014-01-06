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
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGTransformationExtensions
import de.cau.cs.kieler.scgsched.SCGraphSched
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scg.analyzer.AnalyzerData
import de.cau.cs.kieler.scg.analyzer.GenericAnalyzerResult

/** 
 * This class is part of the SCG transformation chain. In particular a scheduler performs additional 
 * (for the particular scheduler) important analyses, creates one or more schedules for the SCG which 
 * may include the execution of synchronizers and runs conclusive optimizations on the graph if available. 
 * This abstract class defines the generic interface of a scheduler 
 * since they may be several schedulers for different tasks/graphs.<br>
 * The transformation chain is used to gather important information 
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
 *   |    |-- Scheduling					<== YOU ARE HERE
 *   |    |   |-- Synchonize threads		
 *   |    |-- Optimization
 *   |-- Sequentialization (new SCG)
 *       |-- Optimization					
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2013-11-27 proposed 
 * @kieler.rating 2013-11-27 proposed yellow
 */
abstract class AbstractSCGScheduler {

	/** Inject the SCG transformation extensions. */
    @Inject
    extension SCGTransformationExtensions
    
    /** 
     * Override this method to add you analyzes.
     * 
     * @param scg
     * 			the SCG in question
     * @return Returns an updated SCGSched model.
     * @abstract
     */
    protected abstract def SCGraphSched analyse(SCGraphSched scg);
    
    /** 
     * Override this method to add your optimizations.
     * 
     * @param scg
     * 			the SCG in question.
     * @return Returns an updated SCGSched model.
     * @abstract 
     */
    protected abstract def SCGraphSched optimize(SCGraphSched scg);
    
    /** 
     * Override this method to build your schedule.
     * 
     * @param scg
     * 			the SCG in question
     * @return Returns an updated SCGSched model.
     * @abstract
     */
    protected abstract def SCGraphSched build(SCGraphSched scg);
    
    /**
     * Entry point for the caller. Invoke {@code schedule} to create the schedules for the given SCG.
     * All mandatory information will be gathered automatically if necessary and may be completed by
     * scheduler-defined analyses. Subsequent to the building of the schedules, scheduler-defined 
     * optimizations may run.
     * 
     * @param scg
     * 			the SCG (of arbitrary SCG class type)
     * @return Returns a fully (in sense of the transformation chain) updated SCG.
     */
    public def SCGraph schedule(SCGraph scg) {
    	// Use the transformation extensions to enrich the SCG with all information.
    	// Afterwards, invoke the analyses and build the schedule.
    	// Eventually, return the SCG with performed optimizations.
        build(((scg.upgradeAll(true) as SCGraphSched) as SCGraphSched).analyse).optimize
    }    
    
    /**
     * Extended schedulers may use this method to copy all detected problems and add them to the model.
     * 
     * @param analyzerData
     * 			the analyzerData containing the problems.
     * @param scg
     * 			the SCG model
     * @return Returns the analyzer data structure.
     */
    protected def AnalyzerData copyAllAnalyses(AnalyzerData analyzerData, SCGraphSched scg) {
    	analyzerData.getResults(GenericAnalyzerResult).forEach[
    		it.analyses.forEach[scg.analyses.add(it.copy)]
    	]
    	analyzerData
    }
}