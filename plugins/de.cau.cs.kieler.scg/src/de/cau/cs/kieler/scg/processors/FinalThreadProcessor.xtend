/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.scg.processors

import com.google.inject.Inject
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.processors.analyzer.ThreadAnalyzer
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions
import java.util.List
import de.cau.cs.kieler.kexpressions.keffects.Dependency
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.processors.analyzer.ThreadData
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment

/** 
 * @author ssm
 * @kieler.design 2020-01-07 proposed 
 * @kieler.rating 2020-01-07 proposed yellow
 */
class FinalThreadProcessor extends InplaceProcessor<SCGraphs> {
	
	@Inject extension SCGControlFlowExtensions
	@Inject extension SCGMethodExtensions
	@Inject extension SCGDependencyExtensions
	
    public static val IProperty<Boolean> FINAL_THREADS_ENABLED = 
       new Property<Boolean>("de.cau.cs.kieler.scg.processors.finalRegions.enabled", true)
	
    override getId() {
        "de.cau.cs.kieler.scg.processors.finalThreads"
    }
    
    override getName() {
        "Final Threads"
    }
    
    override process() {
        if (!getProperty(FINAL_THREADS_ENABLED)) return;
        
        val model = getModel
        val threadData = environment.getProperty(ThreadAnalyzer.THREAD_DATA)
        if (threadData === null) {
            environment.warnings.add("This processor requires thread information, but no thread data was found.")
            return;
        }

        for (scg : model.scgs.ignoreMethods) {
            processFinalRegions(scg, threadData)
        }
    }
	
    private def List<Dependency> processFinalRegions(SCGraph scg, ThreadData threadData) {
        val frDependencies = <Dependency> newLinkedList
        
        val frEntries = threadData.data.keySet.filter[ exit.final ].toList
        
        for (entry : frEntries) {
//            val surfaceNodes = entry.getShallowSurfaceThreadNodes
//            val surfacePredecessors = surfaceNodes.filter(Surface).map[ allPrevious ].flatten.map[ eContainer ].filter(Node).
//                filter[ surfaceNodes.contains(it) ].filter[ !(it instanceof Entry) ].filter[ !schizophrenic ].toList
            val predecessors = threadData.threadMapping.get(entry).filter(Assignment).toList
            
            // Connect thread predecessor with the join node.
            for (sp : predecessors) {
                frDependencies += sp.createControlDependency(entry.exit.allNext.head.target)
            }
        }
        
        return frDependencies
    }	
}

