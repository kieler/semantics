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

import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
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

/**
 * @author ssm
 *
 */
class StructuralDepthJoinProcessor extends InplaceProcessor<SCGraphs> {
    
    @Inject extension AnnotationsExtensions     
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGThreadExtensions    
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.structuralDepthJoin"
    }
    
    override getName() {
        "Structural Depth Join V2"
    }
    
    override process() {
        for (scg : getModel.scgs) {
            scg.processModel
        }
    }    
    
    public def void processModel(SCGraph scg) {
        
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
        
        val threadMapping = <Entry, Set<Node>> newHashMap
        val nodeMapping = <Node, List<Entry>> newHashMap
        val modifiedEntries = <Entry> newHashSet;        
        scg.nodes.head.asEntry.getAllThreadNodesAndThreads(threadMapping, nodeMapping)
        
        var pilJoinNodes = <Join>emptyList//pilData.filter(Join).toList
        for(join : pilJoinNodes) {
            val threadPathTypes = join.getEntryNodes.filter[!hasAnnotation(SCGAnnotations.ANNOTATION_IGNORETHREAD)].map [
                getStringAnnotationValue(SCGAnnotations.ANNOTATION_CONTROLFLOWTHREADPATHTYPE)
            ].map[fromString2].toList
            val noInstantaneousFeedback = getInstantaneousControlFlows(join, join.fork).isEmpty
              
            if ((!threadPathTypes.filter[it == ThreadPathType::DELAYED].empty) && (!noInstantaneousFeedback)) {
                
                for(entry : join.allPrevious.map[eContainer].filter(Exit).map[entry]) {
                    if (entry != scg.nodes.head && 
                        entry.getStringAnnotationValue(SCGAnnotations.ANNOTATION_CONTROLFLOWTHREADPATHTYPE).fromString2 ==
                        ThreadPathType.POTENTIALLY_INSTANTANEOUS
                    ) {
//                        entry.transformSDJ(scg, threadMapping.get(entry), pilData)
                        modifiedEntries += entry
                    }
                }
                
            }                      
        }

        for (entry : modifiedEntries) {
            if (entry.hasAnnotation(SCGAnnotations.ANNOTATION_CONTROLFLOWTHREADPATHTYPE)) {
                entry.removeAnnotations(SCGAnnotations.ANNOTATION_CONTROLFLOWTHREADPATHTYPE)
            }
            entry.createStringAnnotation(SCGAnnotations.ANNOTATION_CONTROLFLOWTHREADPATHTYPE, ThreadPathType.DELAYED.toString2)
        }        
        
    }  

    public def void transformSDJ(Entry entry, SCGraph scg, Set<Node> threadNodes, Set<Node> pilData) {
        val pilNodes = threadNodes.filter[ pilData.contains(it) ].filter[ !(it instanceof Exit) ]
        val schizoMapping = <Node, Node> newHashMap
        
        for(pNode : pilNodes) {
            val sNode = pNode.copyNode(true)
            sNode.schizophrenic = true
            schizoMapping.put(pNode, sNode)
            
            scg.nodes += sNode
            
            // add incoming dependencies
        }
        
        for(pNode : pilNodes) {
            val sNode = schizoMapping.get(pNode)
            val cfs = sNode.eAllContents.filter(ControlFlow).toList
            
            for(cf : cfs) {
                val corrSchizo = schizoMapping.get(cf.target)
                if (corrSchizo != null) {
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