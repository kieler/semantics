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
 package de.cau.cs.kieler.scg.klighd.analyzer

import com.google.inject.Guice
import de.cau.cs.kieler.scg.klighd.SCGraphDiagramSynthesis

/**
 * The AnalyzerVisualization class provides an interface for the visualization of a particular analyzer.
 * Add an analyzer visualization class for your analyzer in the de.cau.cs.kieler.scg.klighd.analyzer package 
 * if you want to visualize some or all of your analyzer results.
 * Add the enum of your analysis to this analyses visualization class. 
 * The SCG KlighD synthesis will call the visualize method for each analysis. 
 * 
 * @author ssm
 * @kieler.design 2014-01-07 proposed 
 * @kieler.rating 2014-01-07 proposed yellow
 */

class AnalysesVisualization {

	private static val ANALYZERVISUALIZATIONPACKAGE = "de.cau.cs.kieler.scg.klighd.analyzer"
	
	private static val VISUALIZATIONCLASSSUFFIX = "Visualization"

	/**
	 * This method is called by the SCG klighd synthesis for each analysis stored in the graph. 
	 * If a visualization for a given analysis exists, an instance is created and executed.
	 * 
	 * @param analysis
	 * 			the given analysis
	 * @param synthesis
	 * 			the instance of the SCG klighd synthesis
	 * @return Returns the analysis.
	 */	

//	def Analysis visualize(Analysis analysis, SCGraphDiagramSynthesis synthesis) {
//		
//		var String className = analysis.getId + VISUALIZATIONCLASSSUFFIX
//		
//		try {
//			val clazz = Class::forName(ANALYZERVISUALIZATIONPACKAGE + "." + className)
//			val IAnalysisVisualization analysisVis = Guice.createInjector().getInstance(clazz) as IAnalysisVisualization
//			analysisVis.visualize(analysis, synthesis)
//		} catch (ClassNotFoundException exception) {
//		}
//
//		analysis		 
//	}
}