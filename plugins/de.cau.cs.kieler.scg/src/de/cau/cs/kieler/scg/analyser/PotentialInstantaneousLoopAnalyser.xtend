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

import com.google.inject.Inject
import de.cau.cs.kieler.scg.analyser.AbstractSCGAnalyser
import de.cau.cs.kieler.scg.analyser.GenericAnalyserResult
import de.cau.cs.kieler.scg.analyser.SCGAnalyserResult
import de.cau.cs.kieler.scg.extensions.SCGExtensions

/** 
 * PotentialLoopAnalyser
 * 
 * @author ssm
 * @kieler.design 2013-12-02 proposed 
 * @kieler.rating 2013-12-02 proposed yellow
 */
class PotentialInstantaneousLoopAnalyser extends AbstractSCGAnalyser {
	
	@Inject
	extension SCGExtensions
	
	override analyse(SCGAnalyserResult analyserChain) {
		val potentialInstantaneousLoopResult = new PotentialInstantaneousLoopResult
		analyserChain.SCG.nodes.forEach[
			it.instantaneousControlFlows.forEach[
				val problem = it.createPotentialInstantaneousLoopProblem
				potentialInstantaneousLoopResult.addProblem(problem)
			]
		]
		analyserChain.addResult(potentialInstantaneousLoopResult)
		analyserChain
	}
	
}

class PotentialInstantaneousLoopResult extends GenericAnalyserResult {

}