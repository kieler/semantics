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

import de.cau.cs.kieler.scg.SCGraph
import java.util.List
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scgsched.Analysis

/**
 * The {@code AnalyzerData} class comprises members and methods for the data mandatory to 
 * create analyses and analyses results.<br>
 * It is filled by an analyzer and can be passed to another analyzer to perform further analyses.<br>
 * 
 * @author ssm
 * @kieler.design 2013-12-02 proposed 
 * @kieler.rating 2013-12-02 proposed yellow
 */
 class AnalyzerData {
	
	/** The SCG which is (should be) analyzed */
	private var SCGraph scg  = null
	
	/** Member for a particular node which is (should be) analyzed */
	private var Node node = null

	/** List to store the results of the analyses. */
	private val analyserResults = <GenericAnalyzerResult> newArrayList
	
	/** 
	 * Setter for the SCG. 
	 * 
	 * @param scg
	 * 			the SCG in question
	 * @return Returns the SCG.
	 */
	def SCGraph setSCG(SCGraph scg) {
		scg => [ this.scg = it]
	}
	
	/**
	 * Getter for the SCG
	 * 
	 * @return Returns the SCG stored in the class.
	 */
	def SCGraph getSCG() {
		scg
	}
	
	/**
	 * Setter for the node.
	 * 
	 * @param node
	 * 			the node in question
	 * @return Returns the node.
	 */
	def Node setNode(Node node) {
		node => [this.node = node]
	}
	
	/**
	 * Getter for the node
	 * 
	 * @return Returns the node stored in the class.
	 */
	 def Node getNode() {
	 	node
	 }
	
	/**
	 * Adds an analyzer result to the list of results.
	 * 
	 * @param result
	 * 			the analyzer result to be added.
	 * @return Returns the result.
	 */
	def GenericAnalyzerResult addResult(GenericAnalyzerResult result) {
		result => [ this.analyserResults.add(it) ]
	}
	
	/** 
	 * Returns true if a particular result is present in the analyzer result list.
	 * 
	 * @param resultClass
	 * 			the class of the queried result
	 * @return Returns true if the queried result is present.
	 */
	def boolean hasResult(Class<GenericAnalyzerResult> resultClass) {
		analyserResults.filter(resultClass).size>0
	}
	
	/**
	 * Returns a class filtered list of analyzer results.
	 * 
	 * @param resultClass
	 * 			the query class
	 * @return Returns a list of class filtered analyzer results.
	 */
	def List<GenericAnalyzerResult> getResults(Class<GenericAnalyzerResult> resultClass) {
		return analyserResults.filter(resultClass).toList
	}
}


/**
 * The {@code GenericAnalyzerResult} class holds members and methods for a single analyzer result.
 * It it used in lists by {@code AnalyzerData} to accumulate the results of the analyzers.
 *   
 * @author ssm
 * @kieler.design 2013-12-02 proposed 
 * @kieler.rating 2013-12-02 proposed yellow
 */
class GenericAnalyzerResult {
	
	/** A list that is able to hold any analysis. */
	private val analyses = <Analysis> newArrayList
	
	/** 
	 * The positive flag indicates whether or not a specific analysis detected a particular problem. 
	 * E.g., the PotentialInstantaneousLoopAnalyzer sets positive to true if it detects a 
	 * potential instantaneous loop. 
	 */
	private var positive = false;
	
	/**
	 * Setter for the positive flag
	 * 
	 * @param positive
	 * 			Status of the flag
	 * @return Returns the flag.
	 */
	public def boolean setPositive(boolean positive) {
		positive => [ this.positive = positive ]
	} 
	
	/**
	 * Getter for the positive flag
	 * 
	 * @return Returns the positive flag.
	 */
	public def boolean getPositive() { 
		return positive 
	}
	
	/**
	 * Adds an analysis to the list of analyses and sets the positive flag to true.
	 * 
	 * @param analysis
	 * 			the analysis to be added
	 * @return Returns the analysis.
	 */
	public def Analysis addAnalysis(Analysis analysis) {
		positive = true
		analysis => [ analyses.add(it) ]
	}
	
	/**
	 * Returns the list of analyses.
	 * 
	 * @return Returns a list of analyses.
	 */
	public def List<Analysis> getAnalyses() {
		analyses
	}	
}


