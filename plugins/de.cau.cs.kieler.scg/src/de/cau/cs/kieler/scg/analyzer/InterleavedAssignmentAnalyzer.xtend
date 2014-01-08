/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.analyzer

import de.cau.cs.kieler.scg.analyzer.AbstractSCGAnalyzer
import de.cau.cs.kieler.scgdep.Write_Write
import de.cau.cs.kieler.scg.Node
import com.google.inject.Inject
import de.cau.cs.kieler.scg.extensions.SCGExtensions
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scgsched.ScgschedFactory
import de.cau.cs.kieler.scg.Surface

/**
 * @author ssm
 * @kieler.design 2014-01-08 proposed 
 * @kieler.rating 2014-01-08 proposed yellow
 */
class InterleavedAssignmentAnalyzer extends AbstractSCGAnalyzer {
    
    @Inject
    extension SCGExtensions
    
    override analyze(AnalyzerData analyzerData) {
        val result = new InterleavedAssignmentResult
        
        analyzerData.SCG.eAllContents.filter(typeof(Write_Write)).forEach[ dependency |
            val assignment1 = dependency.eContainer as Node
            val assignment2 = dependency.target as Node
            val ancestorFork = assignment1.ancestorFork
            var assignment1Tick = 0
            var assignment2Tick = 0
            var isSimpleFlow = true
            
            if (ancestorFork == assignment2.ancestorFork) {
                for (entry: ancestorFork.allNext.map[target]) {
                    var flows = entry.getIndirectControlFlowsBeyondTickBoundaries((entry as Entry).exit)
                    if (flows.size != 1) {
                        isSimpleFlow = false
                    } else {
                        var depthCounter = 0
                        for (node : flows.head.map[target]) {
                            if (node instanceof Surface) { depthCounter = depthCounter + 1 }
                            if (node == assignment1) { assignment1Tick = depthCounter }
                            if (node == assignment2) { assignment2Tick = depthCounter }
                        }
                    }
                }
                
                if (isSimpleFlow && assignment1Tick != assignment2Tick) {
                    val analysis = ScgschedFactory::eINSTANCE.createAnalysis => [
                        id = getAnalysisId
                        objectReferences += dependency                        
                    ]
                    result.addAnalysis(analysis)
                }
            }
        ]
        
        analyzerData => [ addResult(result) ]
    }
    
	/**
	 * Returns the identifier string of this analysis.
	 * 
	 * @returns Returns the identifier string of this analysis.
	 */
	override getAnalysisId() {
		return "InterleavedAssignment"
	}
    
    
}

/**
 * This class extends the generic analyzer result to implement an interleaved assignment result.<br>
 * In fact, the class is simply overridden and used to identify this kind of problems. No new 
 * methods are added.
 *  
 * @author ssm
 * @kieler.design 2014-01-08 proposed 
 * @kieler.rating 2014-01-08 proposed yellow
 */
class InterleavedAssignmentResult extends GenericAnalyzerResult {

}