/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.klighd.analyzer

import de.cau.cs.kieler.scg.klighd.SCGraphDiagramSynthesis

/**
 * The IAnalyzerVisualization interface provides an interface for the visualization of a particular analyzer.
 * Add an analyzer visualization class for your analyzer in the de.cau.cs.kieler.scg.klighd.analyzer package 
 * if you want to visualize some or all of your analyzer results.
 * Add the enum of your analysis to this analyses visualization class. 
 * The SCG KlighD synthesis will call the visualize method for each analysis that fits. 
 * 
 * @author ssm
 * @kieler.design 2014-01-07 proposed 
 * @kieler.rating 2014-01-07 proposed yellow
 */

interface IAnalysisVisualization {
//	def Analysis visualize(Analysis anaysis, SCGraphDiagramSynthesis synthesis)
}