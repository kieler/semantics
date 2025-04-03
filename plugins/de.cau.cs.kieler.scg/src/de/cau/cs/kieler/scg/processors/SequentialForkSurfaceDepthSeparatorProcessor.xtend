/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2022 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions
import de.cau.cs.kieler.scg.extensions.SCGSequentialForkExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import java.util.Set

/**
 * @author als
 *
 */
class SequentialForkSurfaceDepthSeparatorProcessor extends InplaceProcessor<SCGraphs> {
    
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGThreadExtensions    
    @Inject extension SCGDependencyExtensions
    @Inject extension SCGSequentialForkExtensions
    @Inject extension SCGMethodExtensions
    @Inject extension AnnotationsExtensions
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.sequentialForkSurfaceDepthSeparator"
    }
    
    override getName() {
        "Surface/Depth Separator for Sequential Forks"
    }
    
    override process() {       
        for (scg : getModel.scgs.ignoreMethods) {
            scg.cureForks 
        }
    }
    
    def boolean cureForks(SCGraph scg) {
        val seqForks = scg.nodes.filter(Fork).filter[it.isNonParallel].toList
        
        // Mark SCG for subsequent processors
        if (!seqForks.empty && !scg.hasAnnotation(SCGAnnotations.ANNOTATION_HAS_SEQUENTIAL_FORK)) {
            scg.addTagAnnotation(SCGAnnotations.ANNOTATION_HAS_SEQUENTIAL_FORK)
        }
        
        // Try cure forks
        for (fork : seqForks) {
            if (fork.join.nodeExistsPath(fork, false)) { // immediate feedback
                val entries = fork.allNextNodes.filter(Entry).toList
                for (entry : entries) {
                    val sdInfo = entry.calculateSurfaceDepth
                    
                    if (sdInfo.surface.filter[it.isDutyNode].exists[sdInfo.depth.contains(it)]) {
                        // Cure is only necessary if an assignment or conditional is in both surface and depth, other do not matter
                        val Set<Node> visited = newHashSet(entry)
                        val depthCopyToSurfaceMap = newHashMap()
                        val checkCF = newLinkedList()
                        checkCF += entry.next
                        
                        while (!checkCF.empty) {
                            val cf = checkCF.pop
                            val node = cf.targetNode
                            visited += node
                            
                            if (node.isDutyNode && sdInfo.depth.contains(node)) {
                                val incoming = node.allPrevious.toList
                                if (incoming.size > 1) {
                                    val depthCF = incoming.filter[sdInfo.depth.contains(it.sourceNode)].toList
                                    
                                    // Create depth copy
                                    val copier = node.copyEObjectAndReturnCopier
                                    val copy = copier.key
                                    scg.nodes += copy
                                    
                                    // Copy destinations
                                    node.allNext.forEach[(copier.value.get(it) as ControlFlow).target = it.target]
                                    
                                    // Redirect depth
                                    depthCF.forEach[it.target = copy]
                                    
                                    if (environment.inDeveloperMode) {
                                        environment.infos.add("Depth copy", copy, true)
                                    }
                                    
                                    // Add to depth
                                    sdInfo.depth -= node
                                    sdInfo.depth += copy
                                    
                                    depthCopyToSurfaceMap.put(copy, node)
                                    
                                    // If any next node was already cured, do not enter depth via surface
                                    val nextCFs = node.allNext // surface only cf
                                    for (nextCF : nextCFs) {
                                        if (depthCopyToSurfaceMap.containsKey(nextCF.targetNode)) {
                                            // Redirect to surface twin
                                            nextCF.target = depthCopyToSurfaceMap.get(nextCF.targetNode)
                                        }
                                    }
                                }
                            }
                            
                            if (node !== entry.exit) {
                                val nextCF = node.allNext
                                for (next : nextCF) {
                                    val nextNode = next.targetNode
                                    if (!visited.contains(nextNode) && sdInfo.surface.contains(nextNode)) {
                                        checkCF += next
                                    }
                                }
                            }
                        }
                    }                    
                }
            }
        }
    }
}