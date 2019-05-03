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
package de.cau.cs.kieler.scg.processors

import com.google.inject.Inject
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.Surface
import java.util.Deque
import java.util.Set
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.kexpressions.keffects.dependencies.ValuedObjectAccessors
import de.cau.cs.kieler.kexpressions.keffects.dependencies.ForkStack

import static de.cau.cs.kieler.scg.extensions.SCGThreadExtensions.*
import de.cau.cs.kieler.kicool.processors.dependencies.AbstractDependencyAnalysis

/** 
 * This class is part of the SCG transformation chain. The chain is used to gather information 
 * about the schedulability of a given SCG. This is done in several key steps. Contrary to the first 
 * version of SCGs, there is only one SCG meta-model. In each step the gathered data will be added to 
 * the model. 
 * You can either call the transformation manually or use KiCo to perform a series of transformations.
 * <pre>
 * SCG 
 *   |-- Dependency Analysis 	 					<== YOU ARE HERE
 *   |-- Basic Block Analysis
 *   |-- Scheduler
 *   |-- Sequentialization (new SCG)
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2017-08-18 proposed 
 * @kieler.rating 2017-08-18 proposed yellow
 */

class DependencyTransformationV2 extends AbstractDependencyAnalysis<SCGraphs, SCGraph> {
    
    @Inject extension SCGControlFlowExtensions
    @Inject extension AnnotationsExtensions
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.dependency"
    }
    
    override getName() {
        "Dependency V2"
    }
    
    override getSubModels(SCGraphs rootModel) {
        return rootModel.scgs
    }
    
    
    /** 
     * searchDependencies traverses the SCG (dfs). It visits all reachable nodes once and stores all accesses to 
     * valued objects. While doing so, a fork stack keeps track of the threads for the concurrency test.
     * To avoid recursive calls, the search is done iteratively with a node stack. New nodes are pushed onto the stack
     * and are resolved first.
     */
    protected override searchDependencies(SCGraph scg, ValuedObjectAccessors valuedObjectAccessors) {
        
        if (!(scg.nodes.head instanceof Entry)) 
            throw new UnsupportedOperationException("The first node of an SCG should be an entry node.")
        
        val entry = scg.nodes.head as Entry
        val forkStack = new ForkStack
        val nodes = <Node> newLinkedList()
        val visited = <Node> newHashSet
        entry.next.targetNode.addAndMark(nodes, visited)
        
        while(!nodes.empty && nodes.peek !== null) {
            val node = nodes.pop
            switch(node) {
                Assignment: {
                    node.processAssignment(forkStack, valuedObjectAccessors)
                    if (node.next !== null) {
                        if (!node.next.hasAnnotation(IGNORE_INTER_THREAD_CF_ANNOTATION)) node.next?.targetNode.addAndMark(nodes, visited)
                    }
                }
                Conditional: {
                    node.processConditional(forkStack, valuedObjectAccessors)
                    if (!node.^else.hasAnnotation(IGNORE_INTER_THREAD_CF_ANNOTATION)) node.^else.targetNode.addAndMark(nodes, visited)
                    if (!node.then.hasAnnotation(IGNORE_INTER_THREAD_CF_ANNOTATION)) node.then.targetNode.addAndMark(nodes, visited)
                }
                Fork: {
                    forkStack.push(node)
                    
                    node.join.addAndMark(nodes, visited)
                    for (next : node.next) {
                        next.targetNode.addAndMark(nodes, visited)
                    }                    
                }
                Join: {
                    var fork = forkStack.pop
                    // Cleanup entry nodes.
                    while (fork instanceof Entry) {
                        fork = forkStack.pop
                    }
                    
                    if (fork != node.fork) {
                        environment.errors.add("The join node joins a wrong fork on the stack. This should not happen.",
                            node, true)
                        throw new UnsupportedOperationException("The join node joins a wrong fork on the stack. This should not happen.")
                    }
                    
                    node.next.targetNode.addAndMark(nodes, visited)
                }
                Entry: {
                    forkStack.push(node)
                    
                    node.next.targetNode.addAndMark(nodes, visited)
                }
                Exit: {
                    // Don't do anything. 
                    // This is necessary, because there may be different paths to the exit node.
                    // Let the fork clean up the stack.
                }
                Surface: {
                    node.depth.addAndMark(nodes, visited)
                }
                Depth: {
                    node.next.targetNode.addAndMark(nodes, visited)    
                }
            }
        }        
    }
    
    protected def void processConditional(Conditional conditional, ForkStack forkStack, ValuedObjectAccessors valuedObjectAccessors) {
        conditional.processExpressionReader(conditional.condition, forkStack, valuedObjectAccessors)        
    }
    
    override protected getConcurrentForkFilter() {
        return [ Fork.isInstance(it) ]
    }
    
    override protected getThreadEntryClass() {
        return typeof(Entry)
    }
    
    private def addAndMark(Node node, Deque<Node> nodes, Set<Node> visited) {
        if (visited.contains(node)) return;
        visited += node
        nodes.push(node)
    }
        
    
}
