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
import de.cau.cs.kieler.scg.Surface
import java.util.Collection
import de.cau.cs.kieler.kexpressions.kext.DataDependency

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
        } else {
            if (environment.getProperty(LoopAnalyzerV2.LOOP_ANALYZER_STOP_AFTER_FIRST_LOOP)) {
                environment.warnings.add("The loop analyzer is configured to stop after the first loop. Hence, " + 
                    "the schizophrenia curing might be incomplete!")
            }
        }
                
        val warningProperty = environment.getProperty(LoopAnalyzerV2.WARNING_ON_INSTANTANEOUS_LOOP)
        environment.setProperty(LoopAnalyzerV2.WARNING_ON_INSTANTANEOUS_LOOP, false)
        for (scg : getModel.scgs) {
            while (scg.processModel(threadData, loopData)) {
                executeCoProcessor(loopAnalyzer, false)
                snapshot
            }
        }
        environment.setProperty(LoopAnalyzerV2.WARNING_ON_INSTANTANEOUS_LOOP, warningProperty)
        executeCoProcessor(loopAnalyzer, false)
    }    
    
    public def boolean processModel(SCGraph scg, ThreadData threadData, LoopData loopData) {
        val cureableForks = <Fork> newLinkedList                
        for (fork : threadData.forkMap.keySet) {
            if (loopData.criticalNodes.contains(fork) && loopData.criticalNodes.contains(fork.join)) {
                val entries = threadData.forkMap.get(fork)
                if (entries.exists[ threadData.data.get(it) === ThreadPathType.POTENTIALLY_INSTANTANEOUS ]
                    && fork.hasConcurrentDelay(threadData, <Node> newHashSet)) {
                    cureableForks += fork
                }
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
                
                val schizoNodes = <Node> newLinkedList
                for (entry : threadData.forkMap.get(fork).toList) {
                    if (threadData.data.get(entry) === ThreadPathType.POTENTIALLY_INSTANTANEOUS) {
                        val threadMapping = <Entry, Set<Node>> newHashMap
                        val nodeMapping = <Node, List<Entry>> newHashMap
                        entry.getAllThreadNodesAndThreads(threadMapping, nodeMapping)                          
                        schizoNodes += entry.transformSDJ(scg, threadMapping.get(entry), loopData.criticalNodes, threadData.forkMap.get(fork))
                        
                        threadData.data.put(entry, ThreadPathType.DELAYED)
                        if (entry.hasAnnotation(SCGAnnotations.ANNOTATION_CONTROLFLOWTHREADPATHTYPE)) {
                            entry.removeAnnotations(SCGAnnotations.ANNOTATION_CONTROLFLOWTHREADPATHTYPE)
                        }
                        entry.createStringAnnotation(SCGAnnotations.ANNOTATION_CONTROLFLOWTHREADPATHTYPE, ThreadPathType.DELAYED.toString2)                        
                    }
                }
                fork.propagateDelay(threadData)
                
                for (sNode : schizoNodes) {
                    // IMPORTANT!
                    // If there is an dependency that is pointing to a node inside a depth of the loop, 
                    // remove it.
                    for (dependency : sNode.dependencies.filter(DataDependency).filter[ concurrent ].toList) {
                        if (!dependency.targetNode.isInSurface(threadData.forkMap.get(fork))) {
                            dependency.remove
                            dependency.target = null
                        }
                    }
                    // Also, if the schizo node is the target of a dependency from the depth.
                    for (dependency : sNode.incomingLinks.filter(DataDependency).filter[ concurrent ].toList) {
                        if (!dependency.eContainer.asNode.isInSurface(threadData.forkMap.get(fork))) {
                            dependency.remove
                            dependency.target = null
                        }
                    }
                }   
                
                for (sNode : schizoNodes) {
                    // If the node is not reachable by the control flow, clean up all traces of it.
                    if (sNode.incomingLinks.filter(ControlFlow).empty) {
                        sNode.dependencies.immutableCopy.forEach[ it.target = null it.remove ]
                        sNode.eContents.filter(ControlFlow).toList.forEach[ it.target = null it.remove]
                        sNode.remove
                    }
                }             
                
                curedForks += fork
                return true
            }
        }
        
        return false
    }  

    public def List<Node> transformSDJ(Entry entry, SCGraph scg, Set<Node> threadNodes, Set<Node> pilData, Collection<Entry> threadEntries) {
        val pilNodes = threadNodes.filter[ pilData.contains(it) ].filter[ !(it instanceof Exit) && !(it instanceof Entry) ]
        val schizoMapping = <Node, Node> newLinkedHashMap
        val resultNodes = <Node> newLinkedList
        
        for(pNode : pilNodes) {
            val sNode = pNode.copyNode(true)
            sNode.schizophrenic = true
            schizoMapping.put(pNode, sNode)
                        
            scg.nodes += sNode
            resultNodes += sNode
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
        if (entrySchizo === null) {
            // The next node must not necessarily be a schizo node. It can also e the surface node of a pause.
            if (!(entry.next.target instanceof Surface)) {
//                throw new IllegalStateException("We found a successor of a schizophrenic entry node that should not be present. " + entry.next.target.toString)
            }
        } else {
            entry.next.target = entrySchizo
        }
        resultNodes
    }    
    
    protected def getEntryNodes(Join join) {
        join.allPrevious.map[eContainer].filter(Exit).map[entry]
    }
    
    protected def boolean hasConcurrentDelay(Node node, ThreadData threadData, Set<Node> visited) {
        if (node instanceof Fork) {
            val entries = threadData.forkMap.get(node)
            if (entries.exists[ threadData.data.get(it) === ThreadPathType.DELAYED ]) return true            
        }
        
        visited.add(node)
        val searchStack = <Node> newLinkedList => [ addAll(node.allPrevious.map[ eContainer ].filter(Node).filter[ !visited.contains(it) ]) ]
        while (!searchStack.empty) {
            val head = searchStack.pop
            visited.add(head)
            
            if (head instanceof Fork) {
                return head.hasConcurrentDelay(threadData, visited)
            }
            
            val nextNodes = head.allPrevious.map[ eContainer ].filter(Node).filter[ !visited.contains(it) ]
            if (nextNodes !== null) {
                nextNodes.forEach[ searchStack.push(it) ]
            }
        }
        
        return false
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
            val nextNodes = head.allNext?.map[ targetNode ].
                filter[ !(it instanceof Join) && !(it instanceof Surface) && !(it instanceof Exit) ].
                filter[ !visited.contains(it) ].toList
            if (nextNodes !== null && nextNodes.contains(null)) {
                throw new IllegalStateException("The successor node list in the surface check has a null entry. This should not happen!")
            }
            if (!nextNodes.empty) {
                nextNodes.forEach[ if (it !== null) searchStack.push(it) ]
            } 
        }
        
        return false
    }
    
    protected def void propagateDelay(Node node, ThreadData threadData) {
        val visited = <Node> newHashSet
        val searchStack = <Node> newLinkedList => [ add(node) ]
        
        while (!searchStack.empty) {
            val head = searchStack.pop
            
            if (head instanceof Entry) {
                threadData.data.put(head, ThreadPathType.DELAYED)
                if (head.hasAnnotation(SCGAnnotations.ANNOTATION_CONTROLFLOWTHREADPATHTYPE)) {
                    head.removeAnnotations(SCGAnnotations.ANNOTATION_CONTROLFLOWTHREADPATHTYPE)
                }
                head.createStringAnnotation(SCGAnnotations.ANNOTATION_CONTROLFLOWTHREADPATHTYPE, ThreadPathType.DELAYED.toString2)
                val fork = head.allPrevious.map[ eContainer ].filter(Fork).head
                if (fork !== null) {
                    fork.propagateDelay(threadData)
                }
                return                        
            }
            
            visited += head
            val nextNodes = <Node> newLinkedList
            if (head instanceof Join) {
                // Threads that a nested further down the road must be skipped.
                nextNodes += head.fork    
            } else {
                nextNodes += head.allPrevious.map[ eContainer ].
                    filter(Node).
                    filter[ !visited.contains(it) ]
            }
            if (!nextNodes.empty) {
                nextNodes.forEach[ searchStack.push(it) ]
            }
        }        
    }
}