/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.ForkType
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Predecessor
import java.util.Set

/**
 * Support for sequential preemtive fork.
 * 
 * @author als
 */
class SCGSequentialForkExtensions { 
    
    @Inject extension AnnotationsExtensions
    @Inject extension SCGCoreExtensions
    @Inject extension SCGControlFlowExtensions

    def isNonParalellFork(Predecessor pred) {
        return pred?.basicBlock?.isNonParalellFork
    }
    def isNonParalellFork(BasicBlock bb) {
        return bb?.fork?.isNonParallel
    }
    
    def isNonParallel(Fork f) {
        return f !== null && f.type !== ForkType.PARALLEL
    }
    
    def getFork(BasicBlock bb) {
        val fork = bb?.schedulingBlocks?.last?.nodes?.last
        if (fork instanceof Fork) {
            return fork
        }
        return null
    }
    
    def Set<Node> preceedingDutyNodes(Node start, Node limit) {
        return findDutyNodes(start, limit, true)
    }
    def Set<Node> succeedingDutyNodes(Node start, Node limit) {
        return findDutyNodes(start, limit, false)
    }
    
    private def Set<Node> findDutyNodes(Node start, Node limit, boolean reverse) {
        val dutyNodes = newHashSet
        
        if (start.isDutyNode) {
            dutyNodes += start
        } else {
            val visited = <Node>newHashSet
            val nextNodes = <Node>newLinkedHashSet
            
            visited += start
            if (reverse) {
                nextNodes += start.allPreviousNodes
            } else {
                nextNodes += start.allNextNodes
            }
            nextNodes.removeIf[it === limit]
            
            while (!nextNodes.empty) {
                var node = nextNodes.head
                nextNodes -= node
                visited += node
                
                if (node.isDutyNode) {
                    dutyNodes += node
                } else {
                    val cfs = if (reverse) {
                        node.allPrevious
                    } else {
                        node.allNext
                    }
                    // visit successors
                    for (cf : cfs) {
                        if (!cf.hasAnnotation(SCGThreadExtensions.IGNORE_INTER_THREAD_CF_ANNOTATION)) {
                            val nextNode = if (reverse) {
                                cf.sourceNode
                            } else {
                                cf.targetNode
                            }
                            if (!visited.contains(nextNode)) {
                                nextNodes += nextNode
                            }
                        }
                    }
                }
            }
        }
        
        return dutyNodes
    }
    
    def boolean isDutyNode(Node node) {
        return node instanceof Conditional || node instanceof Assignment
    }
}