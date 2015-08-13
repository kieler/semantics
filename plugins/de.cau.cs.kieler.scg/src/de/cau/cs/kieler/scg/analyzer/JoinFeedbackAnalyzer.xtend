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
package de.cau.cs.kieler.scg.analyzer

import com.google.inject.Inject
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import java.util.List
import de.cau.cs.kieler.scg.SCGraph

/** 
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
 * @kieler.design 2013-12-07 proposed 
 * @kieler.rating 2013-12-07 proposed yellow
 */
 
class JoinFeedbackAnalyzer extends AbstractAnalyzer {

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
	
    @Inject
    extension SCGControlFlowExtensions

    // -------------------------------------------------------------------------
    // -- Analyzer 
    // -------------------------------------------------------------------------
    
    /**
     * The JoinFeedbackAnalyzer checks whether or not a given join has an instant feedback to its corresponding 
     * fork node. If such a feedback is detected, the threads of this fork-join combination are examined to determine
     * if at least one tick is consumed before they are joined again.<br>
     * This test is particularly helpful for the synchronizer because even if the potential instantaneous loop analyzer 
     * detects a <em>potentially</em> instantaneous loop, this test can assure the synchronizer that time will be consumed.
     * 
	 * @param analyzerData
	 * 			the input data for this analysis
	 * @return Returns the updated analyzer data structure.
	 * @override
	 */

//	override analyze(AnalyzerData analyzerData) {
//		// If no node or not a join is selected, return the result and exit.
//		if (analyzerData.node == null || !(analyzerData.node instanceof Join)) return analyzerData
//		
//		// Create new result of this analyzer.
//		val result = new JoinFeedbackResult()
//		
//		// Cast our join node and test for instantaneous feedback.
//		val join = analyzerData.node as Join
//		if (join.getIndirectControlFlows(join.fork).instantaneous) {
//			// If an instantaneous feedback was found, set the positive flag and check each thread.
//			result.positive = true
//			val threadEntries = join.fork.getAllNext
//			for(entry : threadEntries) {
//				if ((entry as Entry).getIndirectControlFlows((entry as Entry).exit).instantaneous) {
//					// If a potentially instantaneous control flow between the entry and the exit node of this
//					// thread exists, add the thread to the list of instantaneous threads.
//					result.addInstantaneousThread(entry as Entry)
//				} else {
//					// If no potentially instantaneous control flow between the entry and the exit node of this
//					// thread exists, add the thread to the list of time consuming threads.
//					result.addTimeConsumingThread(entry as Entry)
//				}
//			}
//		} else {
//			// If no instantaneous feedback was found, reset the positive flag.
//			result.positive = false
//		}
//		
//		// Add the result and return.
//		analyzerData.addResult(result)
//		analyzerData  
//	}
	
	/**
	 * Returns the identifier string of this analysis.
	 * 
	 * @returns Returns the identifier string of this analysis.
	 */
	override getAnalysisId() {
		return "JoinFeedback"
	}
    
    override analyze(SCGraph scg) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
	
}

/**
 * This class extends the generic analyzer result to implement a join feedback result.<br>
 * It is extended by two lists. The first one contains all time consuming threads whereas 
 * the second holds all threads that are instantaneous.
 * 
 * @author ssm
 * @kieler.design 2013-12-07 proposed 
 * @kieler.rating 2013-12-07 proposed yellow
 */
class JoinFeedbackResult extends AbstractAnalyzerResult {
	
	/** Storage list for time consuming threads. As usual an entry object identifies the thread. */
	private var timeConsumingThreads = <Entry> newArrayList
	
	/** Storage list for instantaneous threads. As usual an entry object identifies the thread. */
	private var instantaneousThreads = <Entry> newArrayList
	
	/**
	 * Adds a time consuming thread.
	 * 
	 * @param entry
	 * 			the entry node of the thread
	 * @return Returns the entry node.
	 */
	def Entry addTimeConsumingThread(Entry entry) {
		entry => [ timeConsumingThreads.add(it) ]
	}
	
	/**
	 * Retrieves the list of time consuming threads. As usual an entry object identifies the thread.
	 * 
	 * @return Returns the list of time consuming threads.
	 */
	def List<Entry> getTimeConsumingThreads() {
		timeConsumingThreads
	}

	/**
	 * Adds an instantaneous thread.
	 * 
	 * @param entry
	 * 			the entry node of the thread
	 * @return Returns the entry node.
	 */	
	def Entry addInstantaneousThread(Entry entry) {
		entry => [ instantaneousThreads.add(it) ]
	}
	
	/**
	 * Retrieves the list of instantaneous threads. As usual an entry object identifies the thread.
	 * 
	 * @return Returns the list of time consuming threads.
	 */
	def getInstantaneousThreads() {
		instantaneousThreads
	}
}