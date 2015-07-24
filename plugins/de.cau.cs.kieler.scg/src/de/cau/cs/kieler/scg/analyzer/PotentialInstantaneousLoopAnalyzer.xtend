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

import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Entry
import java.util.Set
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.Dependency
import de.cau.cs.kieler.scg.DataDependency

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
class PotentialInstantaneousLoopAnalyzer extends AbstractAnalyzer {
	
	@Inject
	extension SCGControlFlowExtensions
	
	private static val ANALYZERID = "de.cau.cs.kieler.scg.analyzer.PotentialInstantaneousLoop"
	
    // -------------------------------------------------------------------------
    // -- Analyzer 
    // -------------------------------------------------------------------------
    
	/**
	 * Returns the identifier string of this analysis.
	 * 
	 * @returns Returns the identifier string of this analysis.
	 */
	override getAnalysisId() {
		return ANALYZERID
	}
	
	private def boolean checkInstantaneousLoop(Node node, Set<Node> uncriticalPath, Set<Node> uncertainPath) {
	    val previousNodes = node.allPrevious.map[ eContainer ].toList
        val nextNodes = node.allNext.map[ target ].toList
        
        previousNodes += node.incoming.filter(typeof(DataDependency)).filter[concurrent == true && confluent == false].map[ target ].toList
        nextNodes += node.eContents.filter(typeof(DataDependency)).filter[concurrent == true && confluent == false].map[ target ].toList
	    
	    var uncritical = true
	    for(pn : nextNodes) {
	        if (!uncriticalPath.contains(pn)) uncritical = false
	    }
	    if (node instanceof Surface) { uncritical = true }
	    if (!uncritical) {
            uncritical = true
            for(pn : previousNodes) {
                if (!uncriticalPath.contains(pn)) uncritical = false
            }
	    }
	    
	    if (uncritical) {
            uncriticalPath += node
	    } else {
            uncertainPath += node
	    }
	    
	    for(nn : nextNodes) {
	        if (!uncriticalPath.contains(nn) && !uncertainPath.contains(nn)) {
  	            nn.checkInstantaneousLoop(uncriticalPath, uncertainPath)
            }
	    }
	    if (!uncritical) {
	        uncritical = true
	        for(pn : nextNodes) {
                if (!uncriticalPath.contains(pn)) uncritical = false
            }
            if (!uncritical) {
                uncritical = true
                for(pn : previousNodes) {
                    if (!uncriticalPath.contains(pn)) uncritical = false
                }
            }                         
            if (uncritical) {
                uncertainPath.remove(node)
                uncriticalPath += node               
            }
	    }
	    
	    if (node instanceof Surface) {
	        val surface = (node as Surface)
	        if (surface.depth != null && surface.depth.next != null &&
	            surface.depth.next.target != null) {
    	        uncriticalPath += (node as Surface).depth;
    	        if (surface.depth.next.target != surface) {
    	           (node as Surface).depth.next.target.checkInstantaneousLoop(uncriticalPath, uncertainPath)
	           }
	        }
	    }
	    
	    uncritical
	}
    
    override analyze(SCGraph scg) {
        val result = new PotentialInstantaneousLoopResult()
        
        val uncriticalPath = <Node> newHashSet
        result.criticalNodes = <Node> newHashSet
        
        uncriticalPath += scg.nodes.head;
        
        (scg.nodes.head as Entry).next.target.checkInstantaneousLoop(uncriticalPath, result.criticalNodes)
        
        result
    }
	
}

/**
 * This class extends the generic analyzer result to implement a potential instantaneous loop result.<br>
 * In fact, the class is simply overridden and used to identify this kind of problems. No new 
 * methods are added.
 *  
 * @author ssm
 * @kieler.design 2013-12-02 proposed 
 * @kieler.rating 2013-12-02 proposed yellow
 */
class PotentialInstantaneousLoopResult extends AbstractAnalyzerResult {
    public var Set<Node> criticalNodes = null
}