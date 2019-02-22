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
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import java.util.Set
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions

/** 
 * @author ssm
 * @kieler.design 2017-11-01 proposed 
 * @kieler.rating 2017-11-01 proposed yellow
 */
class LoopAnalyzerV2 extends InplaceProcessor<SCGraphs> {
	
	@Inject extension SCGControlFlowExtensions
	@Inject extension SCGDependencyExtensions
	@Inject extension TarjanSCC
	
	public static val IProperty<Boolean> LOOP_ANALYZER_ENABLED = 
	   new Property<Boolean>("de.cau.cs.kieler.scg.processors.loopAnalyzer.enabled", true)
    public static val IProperty<Boolean> LOOP_ANALYZER_CONSIDER_ALL_DEPENDENCIES = 
       new Property<Boolean>("de.cau.cs.kieler.scg.processors.loopAnalyzer.considerAllDependencies", false)
    public static val IProperty<LoopData> LOOP_DATA = 
        new Property<LoopData>("de.cau.cs.kieler.scg.processors.loopAnalyzer.data", null)	
    public static val IProperty<Boolean> LOOP_DATA_PERSISTENT = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.loopAnalyzer.data.persistent", false)   
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
    public static val IProperty<Integer> LOOP_ANALYZER_ADJACENT_DEPTH =
        new Property<Integer>("de.cau.cs.kieler.scg.processors.loopAnalyzer.adjacentDepth", 1)
	
    override getId() {
        "de.cau.cs.kieler.scg.processors.loopAnalyzerV2"
    }
    
    override getName() {
        "Loop Analyzer V2"
    }
    
    override process() {
        val model = getModel
        val loopData = new LoopData(environment.getProperty(LOOP_DATA_PERSISTENT))
        val threadData = environment.getProperty(ThreadAnalyzer.THREAD_DATA)
        if (threadData === null) {
            environment.warnings.add("This processor requires thread information, but no thread data was found.")
            return;
        }
        environment.setProperty(LOOP_DATA, loopData)

        if (!environment.getProperty(LOOP_ANALYZER_ENABLED)) return;

        for (scg : model.scgs) {
            scg.findSCCs(loopData, environment.getProperty(LOOP_ANALYZER_CONSIDER_ALL_DEPENDENCIES))
        }
       
        if (!loopData.criticalNodes.empty) {
            if (environment.getProperty(ERROR_ON_INSTANTANEOUS_LOOP)) {
                environment.errors.add("Instantaneous loop detected!")
                val strippedModel = extractLoopModel(loopData)
                environment.errors.add(strippedModel.key, 
                   "Instantaneous loop detected!", null)
            }
            if (environment.getProperty(WARNING_ON_INSTANTANEOUS_LOOP)) {
                environment.warnings.add("Instantaneous loop detected!")
                val strippedModel = extractLoopModel(loopData)
                environment.warnings.add(strippedModel.key, 
                   "Instantaneous loop detected!", null)
            }
            if (environment.getProperty(INFO_ON_INSTANTANEOUS_LOOP)) {
                environment.infos.add("Instantaneous loop detected!")
                val strippedModel = extractLoopModel(loopData)
                environment.infos.add(strippedModel.key, 
                   "Instantaneous loop detected!", null)
            }
        }
    }	
	
    protected def extractLoopModel(LoopData loopData) {
        val modelCopy = getModel.copyEObjectAndReturnCopier
        val copier = modelCopy.value
        val maxStrippedNodes = environment.getProperty(LOOP_ANALYZER_MAX_STRIPPED_NODES)
        
        val reverseMap = <Node, Node> newLinkedHashMap
        for (sourceNode : copier.keySet.filter(Node)) {
            reverseMap.put(copier.get(sourceNode) as Node, sourceNode)
        }
        
        val adjacentDepth = environment.getProperty(LOOP_ANALYZER_ADJACENT_DEPTH)
        var i = 0
        for (scg : modelCopy.key.scgs) {
            for (node : scg.nodes.immutableCopy) {
                
                if (i > maxStrippedNodes) {
                    node.remove
                } else {
                
                    val sourceNode = reverseMap.get(node)
                    if (!loopData.criticalNodes.contains(sourceNode)) {
                        val adjacentNodes = sourceNode.getAdjacentNodes(<Node> newHashSet, adjacentDepth)
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
    
    private def Set<Node> getAdjacentNodes(Node sourceNode, Set<Node> nodes, int depth) {
        var localDepth = depth
        var Iterable<Node> iter
        if (depth < 1) {
            switch(sourceNode) {
                Entry,
                Depth:  {
                            iter = sourceNode.allNext.map[ targetNode ];
                            localDepth = 1
                        }
                Exit,
                Surface:{ 
                            iter = sourceNode.incomingLinks.map[ eContainer ].filter(Node)
                            localDepth = 1
                        } 
            }       
        } else {
            iter = sourceNode.incomingLinks.map[ eContainer ].filter(Node) +
                   sourceNode.allNext.map[ targetNode ] + 
                   sourceNode.dependencies.map[ targetNode ]
        }
        if (localDepth > 1) {
            val nList = <Node> newLinkedList            
            for (n : iter) {
                if (nodes.add(n)) {
                    nList += n
                }
            }
            val newDepth = localDepth - 1
            nList.forEach[ getAdjacentNodes(nodes, newDepth) ]
        } else {
            nodes.addAll(iter)
        } 
        nodes
    }
    
}

