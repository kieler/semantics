/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.transformators

import com.google.inject.Inject
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.common.SCGAnnotations
import de.cau.cs.kieler.scg.extensions.ThreadPathType
import java.util.Set
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Entry
import java.util.List
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.processors.analyzer.ThreadAnalyzer
import de.cau.cs.kieler.scg.processors.analyzer.LoopAnalyzerV2
import de.cau.cs.kieler.scg.processors.analyzer.ThreadData
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.processors.analyzer.LoopData

/**
 * @author ssm
 * @kieler.design 2017-11-13 proposed 
 * @kieler.rating 2017-11-13 proposed yellow
 *
 */
class StructuralDepthJoinProcessor extends InplaceProcessor<SCGraphs> {
    
    @Inject extension AnnotationsExtensions     
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGThreadExtensions    
    
    val curedForks = <Fork> newHashSet
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.structuralDepthJoin"
    }
    
    override getName() {
        "Structural Depth Join V2"
    }
    
    override process() {
        val loopAnalyzer = createCoProcessor("de.cau.cs.kieler.scg.processors.loopAnalyzerV2") as LoopAnalyzerV2
        
        val threadData = environment.getProperty(ThreadAnalyzer.THREAD_DATA)
        if (threadData === null) {
            environment.warnings.add("This processor requires thread information, but no thread data was found.")
            return;
        }        
        val loopData = environment.getProperty(LoopAnalyzerV2.LOOP_DATA)
        if (loopData === null) {
            environment.warnings.add("This processor requires loop information, but no loop data was found.")
            return;
        }
                
        for (scg : getModel.scgs) {
            while (scg.processModel(threadData, loopData)) {
                executeCoProcessor(loopAnalyzer, false)
                snapshot
            }
        }
    }    
    
    public def boolean processModel(SCGraph scg, ThreadData threadData, LoopData loopData) {
        val cureableForks = <Fork> newLinkedList                
        for (fork : threadData.forkMap.keySet) {
            val entries = threadData.forkMap.get(fork)
            if (entries.exists[ threadData.data.get(it) === ThreadPathType.POTENTIALLY_INSTANTANEOUS ]
                && entries.exists[ threadData.data.get(it) === ThreadPathType.DELAYED ]) {
                cureableForks += fork
            }
        }
        
        for (fork : cureableForks.immutableCopy) {
            var containsOther = false
            for (entry : threadData.forkMap.get(fork)) {
                if (!containsOther) {
                    val threadMapping = <Entry, Set<Node>> newHashMap
                    val nodeMapping = <Node, List<Entry>> newHashMap
                    entry.getAllThreadNodesAndThreads(threadMapping, nodeMapping)            
                    
                    if (nodeMapping.keySet.exists[ cureableForks.contains(it) ]) {
                        containsOther = true
                    }        
                }
            }
            
            if (!containsOther) {
                // cure this instance
                
                if (curedForks.contains(fork)) {
                    throw new IllegalStateException("Structural Depth Join: A cured fork seems to be still shizophrenic. " +
                        "This should not happen. Aborting compilation.")
                }
                
                for (entry : threadData.forkMap.get(fork).toList) {
                    if (threadData.data.get(entry) === ThreadPathType.POTENTIALLY_INSTANTANEOUS) {
                        val threadMapping = <Entry, Set<Node>> newHashMap
                        val nodeMapping = <Node, List<Entry>> newHashMap
                        entry.getAllThreadNodesAndThreads(threadMapping, nodeMapping)                          
                        entry.transformSDJ(scg, threadMapping.get(entry), loopData.criticalNodes)
                        
                        threadData.data.put(entry, ThreadPathType.DELAYED)
                        if (entry.hasAnnotation(SCGAnnotations.ANNOTATION_CONTROLFLOWTHREADPATHTYPE)) {
                            entry.removeAnnotations(SCGAnnotations.ANNOTATION_CONTROLFLOWTHREADPATHTYPE)
                        }
                        entry.createStringAnnotation(SCGAnnotations.ANNOTATION_CONTROLFLOWTHREADPATHTYPE, ThreadPathType.DELAYED.toString2)                        
                    }
                }
                
                curedForks += fork
                return true
            }
        }
        
        return false
    }  

    public def void transformSDJ(Entry entry, SCGraph scg, Set<Node> threadNodes, Set<Node> pilData) {
        val pilNodes = threadNodes.filter[ pilData.contains(it) ].filter[ !(it instanceof Exit) ]
        val schizoMapping = <Node, Node> newHashMap
        
        for(pNode : pilNodes) {
            val sNode = pNode.copyNode(true)
            sNode.schizophrenic = true
            schizoMapping.put(pNode, sNode)
            
            scg.nodes += sNode
        }
        
        for(pNode : pilNodes) {
            val sNode = schizoMapping.get(pNode)
            val cfs = sNode.eAllContents.filter(ControlFlow).toList
            
            for(cf : cfs) {
                val corrSchizo = schizoMapping.get(cf.target)
                if (corrSchizo !== null) {
                    cf.target = corrSchizo
                }
                
                if (cf.target instanceof Exit) {
                    cf.remove
                }
            } 
        }
        
        var entrySchizo = schizoMapping.get(entry.next.target)
        entry.next.target = entrySchizo
    }    
    
    protected def getEntryNodes(Join join) {
        join.allPrevious.map[eContainer].filter(Exit).map[entry]
    }
    
}