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
package de.cau.cs.kieler.scg.transformations

import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.features.SCGFeatures
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.processors.analyzer.PotentiallyInstantaneousLoopAnalyzer
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.SCGAnnotations
import de.cau.cs.kieler.scg.extensions.ThreadPathType
import java.util.Set
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Entry
import java.util.List
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scg.processors.analyzer.PotentialInstantaneousLoopResult
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.ControlFlow

/**
 * @author ssm
 *
 */
class StructuralDepthJoinTransformation extends AbstractProductionTransformation implements Traceable {
    
    
    override getId() {
        SCGTransformations.STRUCTURALDEPTHJOIN_ID
    }

    override getName() {
        SCGTransformations::STRUCTURALDEPTHJOIN_NAME
    }    
    
    override getProducedFeatureId() {
        SCGFeatures.STRUCTURALDEPTHJOIN_ID
    }
    
    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::DEPENDENCY_ID)
    }   
    
    @Inject extension AnnotationsExtensions     
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGThreadExtensions    
    
    public def SCGraph transform(SCGraph scg, KielerCompilerContext context) {
        
        val threadMapping = <Entry, Set<Node>> newHashMap
        val nodeMapping = <Node, List<Entry>> newHashMap
        val modifiedEntries = <Entry> newHashSet;        
        scg.nodes.head.asEntry.getAllThreadNodesAndThreads(threadMapping, nodeMapping)
        context.compilationResult.removeAllAuxiliaryData(PotentialInstantaneousLoopResult)
        val pilData = PotentiallyInstantaneousLoopAnalyzer.createPotentiallyInstantaneousLoopData(scg, context)
        
        var pilJoinNodes = pilData.filter(Join).toList
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
                        entry.transformSDJ(scg, threadMapping.get(entry), pilData)
                        modifiedEntries += entry
                    }
                }
                
            }                      
        }

        context.compilationResult.removeAllAuxiliaryData(PotentialInstantaneousLoopResult)
//        PotentiallyInstantaneousLoopAnalyzer.createPotentiallyInstantaneousLoopData(scg, context)
        
        // SCG thread path types
//        val threadPathTypes = (scg.nodes.head as Entry).getThreadControlFlowTypes
        for (entry : modifiedEntries) {
            if (entry.hasAnnotation(SCGAnnotations.ANNOTATION_CONTROLFLOWTHREADPATHTYPE)) 
                entry.removeAnnotations(SCGAnnotations.ANNOTATION_CONTROLFLOWTHREADPATHTYPE)
//            entry.createStringAnnotation(SCGAnnotations.ANNOTATION_CONTROLFLOWTHREADPATHTYPE, threadPathTypes.get(entry).toString2)
            entry.createStringAnnotation(SCGAnnotations.ANNOTATION_CONTROLFLOWTHREADPATHTYPE, ThreadPathType.DELAYED.toString2)
        }        
        
        scg
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