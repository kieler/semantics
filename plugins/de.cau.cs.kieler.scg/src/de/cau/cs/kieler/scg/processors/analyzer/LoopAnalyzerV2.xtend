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
 package de.cau.cs.kieler.scg.processors.analyzer

import com.google.inject.Inject
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.scg.DataDependency
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import java.util.Deque
import de.cau.cs.kieler.scg.Assignment

/** 
 * @author ssm
 * @kieler.design 2017-11-01 proposed 
 * @kieler.rating 2017-11-01 proposed yellow
 */
class LoopAnalyzerV2 extends InplaceProcessor<SCGraphs> {
	
	@Inject extension SCGControlFlowExtensions
	
    public static val IProperty<LoopData> LOOP_DATA = 
        new Property<LoopData>("de.cau.cs.kieler.scg.processors.loopAnalyzer.data", null)	
	
    override getId() {
        "de.cau.cs.kieler.scg.processors.loopAnalyzerV2"
    }
    
    override getName() {
        "Loop Analyzer V2"
    }
    
    override process() {
        val model = getModel
        val loopData = new LoopData
        val threadData = environment.getProperty(ThreadAnalyzer.THREAD_DATA)
        if (threadData === null) {
            environment.warnings.add("This processor requires thread information, but no thread data was found.")
            return;
        }
        environment.setProperty(LOOP_DATA, loopData)

        val nodesToCheck = <Node> newLinkedList
        val checkedNodes = <Node> newHashSet
        for (scg : model.scgs) {
            nodesToCheck += scg.nodes.head as Entry
        }
        
        while (nodesToCheck.peek !== null) {
            val nextNode = nodesToCheck.pop
            if (!checkedNodes.contains(nextNode)) {
                nextNode.checkInstantaneousLoop(loopData, nodesToCheck)
                checkedNodes += nextNode
            }
        }
        
        if (!loopData.criticalNodes.empty) {
            environment.warnings.add("Instananeous loop detected!")
        }
    }	
	
	private def void checkInstantaneousLoop(Node node, LoopData loopData, Deque<Node> nodesToCheck) {
	    val visited = <Node> newHashSet
	    val path = <Node> newLinkedList => [ add(node) ]
	    
	    do {
	        val actualNode = path.peek
	        visited += actualNode
	        
            val nextNodes =
                (actualNode.allNext.map[ target ] + 
                if (actualNode instanceof Assignment) 
                    actualNode.dependencies.filter(DataDependency).filter[ concurrent && !confluent ].map[ target ]
                else #[]).toList
                
               
            var Node nextNode = null
            
            for (nn : nextNodes) {
                if (path.contains(nn)) {
                    // loop
                    val iter = path.iterator
                    var Node pn = null
                    while ((pn = iter.next) !== nn) {
                        loopData.criticalNodes.add(pn)
                    } 
                    loopData.criticalNodes.add(pn)
                }    
                if (!visited.contains(nn)) {
                    if (nn instanceof Surface) {
                        nodesToCheck += nn.depth                        
                    } else {
                        nextNode = nn
                    }
                }
            }
             
            if (nextNode === null) {
                path.pop
            } else {
                path.push(nextNode)
            }
	    } while(!path.empty)
	}
    
}

