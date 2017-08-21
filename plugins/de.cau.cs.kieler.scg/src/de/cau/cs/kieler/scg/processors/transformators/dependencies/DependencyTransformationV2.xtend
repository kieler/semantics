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
package de.cau.cs.kieler.scg.processors.transformators.dependencies

import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.scg.SCGraphs
import com.google.inject.Inject
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.Expression
import java.util.Set
import com.google.common.collect.HashMultimap
import de.cau.cs.kieler.core.model.Pair

import static extension de.cau.cs.kieler.scg.processors.transformators.dependencies.ValuedObjectAccess.*
import static extension de.cau.cs.kieler.scg.DataDependencyType.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValueExtensions
import java.util.Deque

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

class DependencyTransformationV2 extends Processor<SCGraphs, SCGraphs> {
    
    
    @Inject extension SCGCoreExtensions
    @Inject extension SCGDependencyExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsValueExtensions
    
    public static val IProperty<Boolean> ONLY_CONFLICTING_DEPENDENCIES = 
        new Property<Boolean>("de.cau.cs.kieler.scg.processors.transformators.dependency.onlyConflictingDependencies", false)
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.transformators.dependency"
    }
    
    override getName() {
        "Dependency V2"
    }
    
    override getType() {
        ProcessorType.TRANSFORMATOR
    }
    
    override process() {
        for (scg : getModel.scgs) {
            val valuedObjectAccessors = new ValuedObjectAccessors
            scg.searchDependencies(valuedObjectAccessors)          
            scg.addDependencies(valuedObjectAccessors)                     
        }        
    }
       

    protected def searchDependencies(SCGraph scg, ValuedObjectAccessors valuedObjectAccessors) {
        
        if (!(scg.nodes.head instanceof Entry)) 
            throw new UnsupportedOperationException("The first node of an SCG should be an entry node.")
        
        val entry = scg.nodes.head as Entry
        val forkStack = new ForkStack
        
        val nodes = <Node> newLinkedList(entry.next.target)
        val visited = <Node> newHashSet
        while(!nodes.empty && nodes.peek != null) {
            val node = nodes.pop
            visited += node
            switch(node) {
                Assignment: {
                    node.processAssignment(forkStack, valuedObjectAccessors)
                    node.next.target.addAndMark(nodes, visited)
                }
                Conditional: {
                    node.processConditional(forkStack, valuedObjectAccessors)
                    node.^else.target.addAndMark(nodes, visited)
                    node.then.target.addAndMark(nodes, visited)
                }
                Fork: {
                    forkStack.push(node)
                    
                    node.join.addAndMark(nodes, visited)
                    for (next : node.next) {
                        next.target.addAndMark(nodes, visited)
                    }                    
                }
                Join: {
                    var fork = forkStack.pop
                    while (fork instanceof Entry) {
                        fork = forkStack.pop
                    }
                    
                    if (fork != node.fork) {
                        environment.errors.add("The join node joins a wrong fork on the stack. This should not happen.",
                            node, true)
                        throw new UnsupportedOperationException("The join node joins a wrong fork on the stack. This should not happen.")
                    }
                    
                    node.next.target.addAndMark(nodes, visited)
                }
                Entry: {
                    forkStack.push(node)
                    
                    node.next.target.addAndMark(nodes, visited)
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
                    node.next.target.addAndMark(nodes, visited)    
                }
            }
        }        
    }
    
    protected def void processAssignment(Assignment assignment, ForkStack forkStack, ValuedObjectAccessors valuedObjectAccessors) {
        val readVOIs = assignment.processExpressionReader(assignment.expression, forkStack, valuedObjectAccessors)

        if (assignment.valuedObject == null) return;
        
        val writeVOI = new ValuedObjectIdentifier(assignment)
        
        for(index : assignment.indices) {
            val indexReaderVOIs = assignment.processExpressionReader(index, forkStack, valuedObjectAccessors)
            if (indexReaderVOIs.contains(writeVOI)) {
                environment.warnings.add("The index variable is written by the same assignment. However, the new assignment will only have effect afterwards.",
                    assignment, true)
            }
        }
        
        var priority = GLOBAL_WRITE
        if (readVOIs.contains(writeVOI)) priority = GLOBAL_RELATIVE_WRITE
        if (assignment.operator != AssignOperator.ASSIGN) priority = GLOBAL_RELATIVE_WRITE
        val writeAccess = new ValuedObjectAccess(assignment, GLOBAL_SCHEDULE, priority, forkStack)
        valuedObjectAccessors.addAccess(writeVOI, writeAccess)
    }
    
    protected def void processConditional(Conditional conditional, ForkStack forkStack, ValuedObjectAccessors valuedObjectAccessors) {
        conditional.processExpressionReader(conditional.condition, forkStack, valuedObjectAccessors)        
    }
    
    protected def processExpressionReader(Node node, Expression expression, ForkStack forkStack, ValuedObjectAccessors valuedObjectAccessors) {
        val readVOIs = <ValuedObjectIdentifier> newArrayList => [ readVOIs | 
            expression.allReferences.forEach [ readVOIs += new ValuedObjectIdentifier(it) ]
        ]
        for(readVOI : readVOIs) {
            val readAccess = new ValuedObjectAccess(node, GLOBAL_SCHEDULE, GLOBAL_READ, forkStack) 
            valuedObjectAccessors.addAccess(readVOI, readAccess)
        }
        
        return readVOIs
    }
    
    protected def void addDependencies(SCGraph scg, ValuedObjectAccessors valuedObjectAccessors) {
        val valuedObjects = valuedObjectAccessors.map.keySet

        val HashMultimap<ValuedObjectIdentifier, ValuedObjectAccess> additionalAccesses = HashMultimap.create
        
        for (valuedObjectIdentifier : valuedObjects.filter[ isSpecificIdentifier ]) {
            val accesses = valuedObjectAccessors.map.get(valuedObjectIdentifier)
            valuedObjectIdentifier.processDependencies(accesses)
             
            if (valuedObjectIdentifier.isSpecificIdentifier) {
                additionalAccesses.putAll(valuedObjectIdentifier.genericIdentifier, accesses);
            }
        }      
        
        for (valuedObjectIdentifier : valuedObjects.filter[ !isSpecificIdentifier ]) {
            val accesses = valuedObjectAccessors.map.get(valuedObjectIdentifier)
            val specificAccesses = additionalAccesses.get(valuedObjectIdentifier)
            specificAccesses.addAll(accesses)
            valuedObjectIdentifier.processDependencies(specificAccesses)
        }   
    }
    
    protected def void processDependencies(ValuedObjectIdentifier valuedObjectIdentifier, Set<ValuedObjectAccess> accesses) {
        val accessPair = accesses.sortAccessesAccordingToPriority
        for (priority : 0..accessPair.first) {
            val prioAccesses = accessPair.second.get(priority) 
            for (access : prioAccesses) {
                for (compPriority : priority..accessPair.first) {
                    val compAccesses = accessPair.second.get(compPriority) {
                        for (compAccess : compAccesses) {
                            valuedObjectIdentifier.processDependency(access, compAccess)
                        }
                    }
                }
            }
        }
    }
    
    protected def void processDependency(ValuedObjectIdentifier valuedObjectIdentifier, ValuedObjectAccess source, ValuedObjectAccess target) {
        if (source.node == target.node) return;
        val type = source.accessType(target)
        if (type == IGNORE) return        
        val concurrent = source.isConcurrentTo(target)
        val confluent = (type == WRITE_WRITE && source.isConfluentTo(target))

        val dependency = source.node.createDataDependency(target.node, type) => [
            it.concurrent = concurrent
            it.confluent = confluent
        ]
        
        dependency.trace(source.node)               
    }
    
    protected def accessType(ValuedObjectAccess source, ValuedObjectAccess target) {
        if (source.schedule == GLOBAL_SCHEDULE && target.schedule == GLOBAL_SCHEDULE) {
            if (source.priority == GLOBAL_WRITE) {
                if (target.priority == GLOBAL_WRITE) return WRITE_WRITE
                if (target.priority == GLOBAL_RELATIVE_WRITE) return WRITE_RELATIVEWRITE
                if (target.priority == GLOBAL_READ) return WRITE_READ
            } else if (source.priority == GLOBAL_RELATIVE_WRITE) {
                if (target.priority == GLOBAL_RELATIVE_WRITE) return IGNORE
                if (target.priority == GLOBAL_READ) return WRITE_READ
            }  else if (source.priority == GLOBAL_READ) {
                if (target.priority == GLOBAL_READ) return IGNORE
            } 
        } else {
            if (source.priority == target.priority) return WRITE_WRITE
            return WRITE_READ 
        }
        return UNKNOWN
    }
    
    protected def boolean isConcurrentTo(ValuedObjectAccess source, ValuedObjectAccess target) {
        for (sourceFork : source.forkStack.filter(Fork)) {
            for (targetFork : target.forkStack.filter(Fork)) {
                if (sourceFork == targetFork) {
                     val sourceEntry = source.forkStack.getOwnThreadEntry(sourceFork)
                     val targetEntry = target.forkStack.getOwnThreadEntry(targetFork)
                     if (sourceEntry != targetEntry) return true else return false
                }
            }
        }
        return false
    }
    
    private def getOwnThreadEntry(ForkStack forkStack, Fork fork) {
        val forkIndex = forkStack.indexOf(fork)
        if (forkIndex == 0) {
            println("");
        }
        var Entry entry = null
        // It is possible that a fork-thread has more than one entry node on the stack
        // because the exit node was not reached. This is not a problem, because the 
        // join will clean the stack. However, you have to use the entry that was pushed
        // last on the stack in relation to the fork.
        for (i : 1..forkIndex) {
            val node = forkStack.get(forkIndex - i)
            if (node instanceof Entry) {
                entry = node
            } else {
                return entry
            }
        } 
        
        entry
    }
    
    protected def boolean isConfluentTo(ValuedObjectAccess source, ValuedObjectAccess target) {
        if (source.node instanceof Assignment) {
            if (target.node instanceof Assignment) {
                if (source.node.asAssignment.operator == AssignOperator.ASSIGN && target.node.asAssignment.operator == AssignOperator.ASSIGN) {
                    if (source.node.asAssignment.expression.isSameValue(target.node.asAssignment.expression)) {
                        return true
                    } else {
                        // To be downward-compatible, check for operator expression with same value.
                        if (areOldConfluentSetter(source.node as Assignment, target.node as Assignment)) {
                            return true
                        }
                    }
                } 
            }
        }
        return false
    }
    
    protected def sortAccessesAccordingToPriority(Set<ValuedObjectAccess> accesses) {
        val sortedAccesses = HashMultimap.create
        var maxPriority = 0;
        for (access : accesses) {
            sortedAccesses.put(access.priority, access)
            if (access.priority > maxPriority) maxPriority = access.priority
        }
        new Pair<Integer, HashMultimap<Integer, ValuedObjectAccess>>(maxPriority, sortedAccesses)                
    }
    
    private def addAndMark(Node node, Deque<Node> nodes, Set<Node> visited) {
        if (visited.contains(node)) return;
        visited += node
        nodes.push(node)
    }
    
}