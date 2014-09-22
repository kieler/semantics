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
import de.cau.cs.kieler.scg.Node

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
abstract class AbstractAnalyzer {
  
  	/**
  	 * Performs an analysis on the provided SCG.
  	 * 
  	 * @param scg
  	 * 			the SCG in question
  	 * @return Returns an SCGAnalyserResult structure for further processing.
  	 */
    abstract def AbstractAnalyzerResult analyze(SCGraph scg)
    
    /**
     * Override this method to add an unique ID string to your analysis.
     * Usually, the name of the analysis class is taken.
     * 
     * @return Returns the identifier string of the analysis
     */
    abstract def String getAnalysisId()
    
}