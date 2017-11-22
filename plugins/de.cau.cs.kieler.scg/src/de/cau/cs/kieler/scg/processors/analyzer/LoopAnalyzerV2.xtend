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
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

/** 
 * @author ssm
 * @kieler.design 2017-11-01 proposed 
 * @kieler.rating 2017-11-01 proposed yellow
 */
class LoopAnalyzerV2 extends InplaceProcessor<SCGraphs> {
	
	@Inject extension SCGControlFlowExtensions
	
	public static val IProperty<Boolean> LOOP_ANALYZER_ENABLED = 
	   new Property<Boolean>("de.cau.cs.kieler.scg.processors.loopAnalyzer.enabled", true)
    public static val IProperty<LoopData> LOOP_DATA = 
        new Property<LoopData>("de.cau.cs.kieler.scg.processors.loopAnalyzer.data", null)	
    public static val IProperty<Boolean> ERROR_ON_INSTANTANEOUS_LOOP = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.loopAnalyzer.errorOnInstantaneousLoop", false)
    public static val IProperty<Boolean> WARNING_ON_INSTANTANEOUS_LOOP = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.loopAnalyzer.warningOnInstantaneousLoop", false)
    public static val IProperty<Boolean> INFO_ON_INSTANTANEOUS_LOOP = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.loopAnalyzer.infoOnInstantaneousLoop", false)
    public static val IProperty<Integer> LOOP_ANALYZER_MAX_STRIPPED_NODES = 
        new Property<Integer>("de.cau.cs.kieler.scg.processors.loopAnalyzer.maxStrippedNodes", 100)
    public static val IProperty<Boolean> LOOP_ANALYZER_STOP_AFTER_FIRST_LOOP = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.loopAnalyzer.stopAfterFirstLoop", false)
	
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

        if (!environment.getProperty(LOOP_ANALYZER_ENABLED)) return;

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
            if (environment.getProperty(ERROR_ON_INSTANTANEOUS_LOOP)) {
                environment.errors.add("Instantaneous loop detected!")
                val strippedModel = extractLoopModel(loopData)
                environment.errors.add(strippedModel.first, 
                   "Instantaneous loop detected!", null)
            }
            if (environment.getProperty(WARNING_ON_INSTANTANEOUS_LOOP)) {
                environment.warnings.add("Instantaneous loop detected!")
                val strippedModel = extractLoopModel(loopData)
                environment.warnings.add(strippedModel.first, 
                   "Instantaneous loop detected!", null)
            }
            if (environment.getProperty(INFO_ON_INSTANTANEOUS_LOOP)) {
                environment.infos.add("Instantaneous loop detected!")
                val strippedModel = extractLoopModel(loopData)
                environment.infos.add(strippedModel.first, 
                   "Instantaneous loop detected!", null)
            }
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
                    
                    if (environment.getProperty(LOOP_ANALYZER_STOP_AFTER_FIRST_LOOP)) {
                        return
                    }
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
	
	
    protected def extractLoopModel(LoopData loopData) {
        val modelCopy = getModel.copyEObjectAndReturnCopier
        val copier = modelCopy.second
        val maxStrippedNodes = environment.getProperty(LOOP_ANALYZER_MAX_STRIPPED_NODES)
        
        val reverseMap = <Node, Node> newLinkedHashMap
        for (sourceNode : copier.keySet.filter(Node)) {
            reverseMap.put(copier.get(sourceNode) as Node, sourceNode)
        }
        
        var i = 0
        for (scg : modelCopy.first.scgs) {
            for (node : scg.nodes.immutableCopy) {
                
                if (i > maxStrippedNodes) {
                    node.remove
                } else {
                
                    val sourceNode = reverseMap.get(node)
                    if (!loopData.criticalNodes.contains(sourceNode)) {
                        val adjacentNodes = (sourceNode.incoming.map[ eContainer ].filter(Node) +
                             sourceNode.allNext.map[ target ] + 
                             sourceNode.dependencies.map[ target ]).toSet
                        if (!adjacentNodes.exists[ loopData.criticalNodes.contains(it) ]) {
                            node.remove   
                        }
                    } else {
                        loopData.criticalNodes += node
                        i++                    
                    }
                
                }
            }
        }
        modelCopy
    }	
    
}

