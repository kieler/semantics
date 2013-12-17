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
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.analyser.AbstractSCGAnalyser
import de.cau.cs.kieler.scg.analyser.GenericAnalyserResult
import de.cau.cs.kieler.scg.analyser.SCGAnalyserResult
import de.cau.cs.kieler.scg.extensions.SCGExtensions

/** 
 * JoinFeedbackAnalyser
 * 
 * @author ssm
 * @kieler.design 2013-12-07 proposed 
 * @kieler.rating 2013-12-07 proposed yellow
 */
class JoinFeedbackAnalyser extends AbstractSCGAnalyser {

	@Inject
	extension SCGExtensions
	
	override analyse(SCGAnalyserResult analyserChain) {
		if (analyserChain.NODE == null) return analyserChain
		val result = new JoinFeedbackResult()
		
		val join = analyserChain.NODE as Join
		if (join.getIndirectControlFlows(join.fork).instantaneous) {
			result.positive = true
			val threadEntries = join.fork.getAllNext
			for(entry : threadEntries) {
				if ((entry as Entry).getIndirectControlFlows((entry as Entry).exit).instantaneous) {
					result.addInstantaneousThread(entry as Entry)
				} else {
					result.addTimeConsumingThread(entry as Entry)
				}
			}
		} else {
			result.positive = false
		}
		
		analyserChain.addResult(result)
		analyserChain  
	}
	
}

class JoinFeedbackResult extends GenericAnalyserResult {
	var timeConsumingThreads = <Entry> newArrayList
	var instantaneousThreads = <Entry> newArrayList
	
	def addTimeConsumingThread(Entry entry) {
		timeConsumingThreads.add(entry)
	}
	
	def getTimeConsumingThreads() {
		timeConsumingThreads
	}
	
	def addInstantaneousThread(Entry entry) {
		instantaneousThreads.add(entry)
	}
	
	def getInstantaneousThreads() {
		instantaneousThreads
	}
}