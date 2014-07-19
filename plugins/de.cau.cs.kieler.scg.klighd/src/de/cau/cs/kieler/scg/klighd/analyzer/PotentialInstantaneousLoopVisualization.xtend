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
package de.cau.cs.kieler.scg.klighd.analyzer

import de.cau.cs.kieler.core.krendering.KColor
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.klighd.SCGraphDiagramSynthesis

/**
 * This class implements the specific visualization modification for potential instantaneous loop problems.
 * Each control flow in the instantaneous loop is linked in the object references. The class uses this references to
 * colorize and thicken the problematic flows.
 *  
 * @author ssm
 * @kieler.design 2014-01-07 proposed 
 * @kieler.rating 2014-01-07 proposed yellow
 */

class PotentialInstantaneousLoopVisualization implements IAnalysisVisualization {

	/** Colorize for problematic flows. */
    private static val KColor PROBLEM_POTENTIALLOOP_COLOR = KRenderingFactory::eINSTANCE.createKColor()=>[it.red = 255; it.green = 0; it.blue = 0;]
    
    /** Thickness of problematic flows. */
    private static val int PROBLEM_POTENTIALLOOP_WIDTH = 4
    	
    /**
     * This method is called by the AnalysesVisualization class automatically. You do not need to call it manually.
     * It colorizes and thickens problematic control flows.
     * 
     * @param analysis
     * 			a particular potential instantaneous loop problem (in this case)
     * @param synthesis
     * 			the SCG klighd synthesis
     * @return Returns the analysis.
     * @override  
     */
//	override Analysis visualize(Analysis analysis, SCGraphDiagramSynthesis synthesis) {
//    	analysis => [
//    		objectReferences.forEach [
//   				synthesis.colorControlFlow(it as ControlFlow, PROBLEM_POTENTIALLOOP_COLOR)
//   				synthesis.thickenControlFlow(it as ControlFlow, PROBLEM_POTENTIALLOOP_WIDTH)
//   			]
//   		]
//	}
	
}