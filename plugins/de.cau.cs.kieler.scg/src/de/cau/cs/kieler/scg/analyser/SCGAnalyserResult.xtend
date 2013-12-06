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
package de.cau.cs.kieler.scg.analyser

import de.cau.cs.kieler.scg.SCGraph
import java.util.List
import de.cau.cs.kieler.scgsched.Problem
import de.cau.cs.kieler.scg.Node

class GenericAnalyserResult {
	val problems = <Problem> newArrayList
	var positive = false;
	
	public def setPositive(boolean pos) {
		positive = pos
	} 
	
	public def getPositive() { 
		return positive 
	}
	
	
	public def addProblem(Problem problem) {
		positive = true
		problems.add(problem)
	}
	
	public def getProblems() {
		problems
	}	
}

class SCGAnalyserResult {
	
	public var SCGraph SCG  = null
	public var Node    NODE = null

	private val analyserResults = <GenericAnalyserResult> newArrayList
	
	def addResult(GenericAnalyserResult result) {
		analyserResults.add(result)
	}
	
	def boolean hasResult(Class<GenericAnalyserResult> resultClass) {
		analyserResults.filter(resultClass).size>0
	}
	
	def List<GenericAnalyserResult> getResults(Class<GenericAnalyserResult> resultClass) {
		return analyserResults.filter(resultClass).toList
	}
}
