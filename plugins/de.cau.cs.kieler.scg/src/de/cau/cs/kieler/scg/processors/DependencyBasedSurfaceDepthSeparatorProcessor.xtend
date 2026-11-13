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
package de.cau.cs.kieler.scg.processors

import com.google.inject.Inject
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.extensions.ThreadPathType
import java.util.Set
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Entry
import java.util.List
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.processors.analyzer.ThreadAnalyzer
import de.cau.cs.kieler.scg.processors.analyzer.ThreadData
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Surface
import java.util.Collection
import de.cau.cs.kieler.scg.processors.analyzer.LoopAnalyzerV2
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions

/**
 * @author ssm
 * @kieler.design 2017-11-13 proposed 
 * @kieler.rating 2017-11-13 proposed yellow
 *
 */
class DependencyBasedSurfaceDepthSeparatorProcessor extends InplaceProcessor<SCGraphs> {
    
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGThreadExtensions    
    @Inject extension SCGDependencyExtensions
    @Inject extension SCGMethodExtensions
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.DependencyBasedSurfaceDepthSeparatorProcessor"
    }
    
    override getName() {
        "Surface/Depth Separator"
    }
    
    override process() {
        val loopAnalyzer = createCoProcessor("de.cau.cs.kieler.scg.processors.loopAnalyzerV2") as LoopAnalyzerV2
        
        val threadData = environment.getProperty(ThreadAnalyzer.THREAD_DATA)
        if (threadData === null) {
            environment.warnings.add("This processor requires thread information, but no thread data was found.")
            return;
        }        
                
        for (scg : getModel.scgs.ignoreMethods) {
            scg.processModel(threadData) 
            snapshot
        }
        
        executeCoProcessor(loopAnalyzer, false)
    }    
    
    public def boolean processModel(SCGraph scg, ThreadData threadData) {
        val cureableForks = <Fork> newLinkedList                
        for (fork : threadData.forkMap.keySet) {
            val entries = threadData.forkMap.get(fork)
            if (entries.filter[ threadData.data.get(it) === ThreadPathType.DELAYED ].size == entries.size) {
                cureableForks += fork
            }
        }
        
        for (fork : cureableForks.immutableCopy) {
            for (entry : threadData.forkMap.get(fork)) {
                val threadMapping = <Entry, Set<Node>> newHashMap
                val nodeMapping = <Node, List<Entry>> newHashMap                
                entry.getAllThreadNodesAndThreads(threadMapping, nodeMapping)
                for (node : nodeMapping.keySet.filter[ it !== null]) {
                    val isInSurface = node.isInSurface(threadData.forkMap.get(fork))
                    for (dependency : node.dependencies.filter(DataDependency).filter[ concurrent ].toList) {
                        if (dependency.targetNode.isInSurface(threadData.forkMap.get(fork)) != isInSurface) {
                            dependency.remove
                        }
                    }
                    for (dependency : node.incomingLinks.filter(DataDependency).filter[ concurrent ].toList) {
                        if (dependency.eContainer.asNode.isInSurface(threadData.forkMap.get(fork)) != isInSurface) {
                            dependency.remove
                        }
                    }
                }  
            }
        }              
        
        return true
    }  

    
    protected def getEntryNodes(Join join) {
        join.allPrevious.map[eContainer].filter(Exit).map[entry]
    }
    
    protected def isInSurface(Node node, Collection<Entry> entries) {
        for (entry : entries) {
            if (node.isInSurface(entry)) return true
        }
        return false
    }
    
    protected def isInSurface(Node node, Entry entry) {
        val visited = <Node> newHashSet
        val searchStack = <Node> newLinkedList => [ add(entry) ]
        
        while (!searchStack.empty) {
            val head = searchStack.pop
            
            if (head == node) {
                return true
            }
            
            visited += head
            val nextNodes = head.allNext.map[ targetNode ].
                filter[ !(it instanceof Join) && !(it instanceof Surface) && !(it instanceof Exit) ].
                filter[ !visited.contains(it) ]
            if (!nextNodes.empty) {
                nextNodes.forEach[ searchStack.push(it) ]
            } 
        }
        
        return false
    }
}