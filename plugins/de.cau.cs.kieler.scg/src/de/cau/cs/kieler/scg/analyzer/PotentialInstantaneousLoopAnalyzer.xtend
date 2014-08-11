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
 package de.cau.cs.kieler.scg.analyzer

import com.google.inject.Inject
import de.cau.cs.kieler.scg.extensions.SCGExtensions

/** 
 * This class is part of the SCG transformation chain. In particular analyzers are called by the scheduler
 * before it is creating the schedule for an SCG. Alternatively, an analyzer may be called manually during 
 * any phase of the transformation process.
 * This abstract class defines the generic interface of an analyzer 
 * since the scheduler may choose different analyzers for different tasks.<br>
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
 *   |    |-- Graph analyses				<== YOU ARE HERE
 *   |    |-- Scheduling
 *   |    |   |-- Synchonize threads			
 *   |    |-- Optimization					
 *   |-- Sequentialization (new SCG)
 *       |-- Optimization					
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2013-12-02 proposed 
 * @kieler.rating 2013-12-02 proposed yellow
 */
class PotentialInstantaneousLoopAnalyzer extends AbstractAnalyzer {
	
    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    
    /** Inject SCG extensions. */
    @Inject
	extension SCGExtensions
	
    // -------------------------------------------------------------------------
    // -- Analyzer 
    // -------------------------------------------------------------------------
    
    /**
	 * This analyzer checks each node of an SCG for potentially instantaneous loops.
	 * Therefore, it iterates through the nodes and performs a instantaneous check on 
	 * the control flow. If the node is able to reach itself without consuming time, 
	 * a potentially instantaneous loop has been found and is added to the list of problems.
	 * 
	 * @param analyzerData
	 * 			the input data for this analysis
	 * @return Returns the updated analyzer data structure.
	 * @override
	 */
	override analyze(AnalyzerData analyzerData) {
		// Create a new result for this analyzer.
		val potentialInstantaneousLoopResult = new PotentialInstantaneousLoopResult
		
		// To test for instantaneous loops the analyzer uses the SCG extensions to 
		// find potentially instantaneous control flow loops from each node to itself.
		// For each loop found a new instantaneous loop problem is created.
		analyzerData.SCG.nodes.forEach[
//			it.instantaneousControlFlows.forEach[ flows |
//				val analysis = ScgschedFactory::eINSTANCE.createAnalysis => [
//    				id = getAnalysisId
//    				objectReferences += flows
//    			]
//				potentialInstantaneousLoopResult.addAnalysis(analysis)
//			]
		]
		
		// Add the result to the analyzer data and return.
		analyzerData.addResult(potentialInstantaneousLoopResult)
		analyzerData
	}
	
	/**
	 * Returns the identifier string of this analysis.
	 * 
	 * @returns Returns the identifier string of this analysis.
	 */
	override getAnalysisId() {
		return "PotentialInstantaneousLoop"
	}
	
}

/**
 * This class extends the generic analyzer result to implement a potential instantaneous loop result.<br>
 * In fact, the class is simply overridden and used to identify this kind of problems. No new 
 * methods are added.
 *  
 * @author ssm
 * @kieler.design 2013-12-02 proposed 
 * @kieler.rating 2013-12-02 proposed yellow
 */
class PotentialInstantaneousLoopResult extends GenericAnalyzerResult {

}