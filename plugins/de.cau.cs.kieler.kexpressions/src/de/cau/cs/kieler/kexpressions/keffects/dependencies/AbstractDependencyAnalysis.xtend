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
package de.cau.cs.kieler.kexpressions.keffects.dependencies

import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import de.cau.cs.kieler.core.model.Pair
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValueExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import java.util.Set
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference
import de.cau.cs.kieler.kexpressions.ScheduleDeclaration
import de.cau.cs.kieler.kexpressions.PriorityProtocol
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCompareExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kexpressions.keffects.dependencies.ValuedObjectAccessors
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Linkable
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsDependencyExtensions
import org.eclipse.xtext.xbase.lib.Functions.Function1
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable

import static de.cau.cs.kieler.kexpressions.keffects.dependencies.ValuedObjectAccess.*
import static de.cau.cs.kieler.kexpressions.keffects.DataDependencyType.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import java.util.List

/** 
 * @author ssm
 * @kieler.design 2017-08-18 proposed 
 * @kieler.rating 2017-08-18 proposed yellow
 * 
 * Generics are
 *   P root model type (e.g. SCGraphs)
 *   S sub model type (e.g. SCGraph)
 */

abstract class AbstractDependencyAnalysis<P extends EObject, S extends EObject> 
    extends InplaceProcessor<P> implements Traceable {
    
    public static val IProperty<Boolean> SAVE_ONLY_CONFLICTING_DEPENDENCIES = 
        new Property<Boolean>("de.cau.cs.kieler.kexpressions.keffects.dependencies.saveOnlyConflicting", false)
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsValueExtensions
    @Inject extension KExpressionsCompareExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KEffectsDependencyExtensions
    
    /** You should use {@link processSubModel} to perform a dependency analysis on a sub model instance. */
    override process() {
        for (subModul : getModel.getSubModels) {
            subModul.processSubModel
        }
    } 
    
    abstract def List<S> getSubModels(P rootModel) 
    
    /** Perform a dependency analysis on a concrete sub model instance. */
    def processSubModel(S subModel) {
        val valuedObjectAccessors = new ValuedObjectAccessors
        subModel.searchDependencies(valuedObjectAccessors)          
        subModel.addDependencies(valuedObjectAccessors)                     
    }

    /** 
     * searchDependencies traverses the SCG (dfs). It visits all reachable nodes once and stores all accesses to 
     * valued objects. While doing so, a fork stack keeps track of the threads for the concurrency test.
     * To avoid recursive calls, the search is done iteratively with a node stack. New nodes are pushed onto the stack
     * and are resolved first.
     */
    abstract protected def void searchDependencies(S subModel, ValuedObjectAccessors valuedObjectAccessors) 
    
    /** Protected prototype method for keffects assignments. */
    protected def void processAssignment(Assignment assignment, ForkStack forkStack, ValuedObjectAccessors valuedObjectAccessors) {
        val readVOIs = assignment.processExpressionReader(assignment.expression, forkStack, valuedObjectAccessors)

        if (assignment.valuedObject === null) return;
        
        val writeVOI = new ValuedObjectIdentifier(assignment)
        
        for(index : assignment.indices) {
            val indexReaderVOIs = assignment.processExpressionReader(index, forkStack, valuedObjectAccessors)
            if (indexReaderVOIs.contains(writeVOI)) {
                environment.warnings.add("The index variable is written by the same assignment. However, the new assignment will only have effect afterwards.",
                    assignment, true)
            }
        }

        for(sched : newLinkedList(GLOBAL_SCHEDULE) + assignment.schedule) {
            var schedule = GLOBAL_SCHEDULE
            var ValuedObject scheduleObject = null       
            var priority = GLOBAL_WRITE
            
            if (readVOIs.contains(writeVOI)) priority = GLOBAL_RELATIVE_WRITE
            if (assignment.operator != AssignOperator.ASSIGN) priority = GLOBAL_RELATIVE_WRITE
            
            if (sched instanceof ScheduleObjectReference) {
                schedule = sched.valuedObject.declaration as ScheduleDeclaration
                scheduleObject = sched.valuedObject 
                priority = sched.priority    
            }
            
            val writeAccess = new ValuedObjectAccess(assignment, schedule, scheduleObject, priority, forkStack, writeVOI.isSpecificIdentifier)
            valuedObjectAccessors.addAccess(writeVOI, writeAccess)
        }
    }
    
    /** Finds all readers inside an expression of and stores them together with their associated node. */
    protected def processExpressionReader(Linkable node, Expression expression, ForkStack forkStack, ValuedObjectAccessors valuedObjectAccessors) {
        val readVOIs = <ValuedObjectIdentifier> newArrayList => [ readVOIs | 
            expression.allReferences.forEach [ readVOIs += new ValuedObjectIdentifier(it) ]
        ]
        for(readVOI : readVOIs) {
            for(sched : newLinkedList(GLOBAL_SCHEDULE) + expression.schedule) {
                var schedule = GLOBAL_SCHEDULE
                var ValuedObject scheduleObject = null            
                var priority = GLOBAL_READ
                
                if (sched instanceof ScheduleObjectReference) {
                    schedule = sched.valuedObject.declaration as ScheduleDeclaration
                    scheduleObject = sched.valuedObject
                    priority = sched.priority    
                }
                
                val readAccess = new ValuedObjectAccess(node, schedule, scheduleObject, priority, forkStack, readVOI.isSpecificIdentifier)
                valuedObjectAccessors.addAccess(readVOI, readAccess)
            } 
        }
        
        return readVOIs
    }
    
    protected def void addDependencies(S subModel, ValuedObjectAccessors valuedObjectAccessors) {
        val valuedObjects = valuedObjectAccessors.map.keySet
        val HashMultimap<ValuedObjectIdentifier, ValuedObjectAccess> additionalAccesses = HashMultimap.create

        // First, process the specific accesses, because they must also be checked against the generic accesses of 
        // the same valued object. The ValuedObjectIdentifier can retrieve the corresponding generic identifier.        
        for (valuedObjectIdentifier : valuedObjects.filter[ isSpecificIdentifier ]) {
            val accesses = valuedObjectAccessors.map.get(valuedObjectIdentifier)
            valuedObjectIdentifier.processDependencies(accesses, true)
             
            additionalAccesses.putAll(valuedObjectIdentifier.genericIdentifier, accesses);
        }    
        
        for (valuedObjectIdentifier : valuedObjects.filter[ !isSpecificIdentifier ]) {
            val accesses = valuedObjectAccessors.map.get(valuedObjectIdentifier)
            val specificAccesses = additionalAccesses.get(valuedObjectIdentifier)
            specificAccesses.addAll(accesses)
            valuedObjectIdentifier.processDependencies(specificAccesses, false)
        }   
    }
    
    protected def void processDependencies(ValuedObjectIdentifier valuedObjectIdentifier, Set<ValuedObjectAccess> accesses, boolean isSpecific) {
        val processed = <Pair<ValuedObjectAccess, ValuedObjectAccess>> newHashSet
        val schedules = accesses.map[ schedule ].filter[ it !== null ].filter(ScheduleDeclaration).toSet
        for (schedule : schedules) {
            for (vo : schedule.valuedObjects) {
                val scheduledAccesses = accesses.filter[ it.schedule == schedule && it.scheduleObject == vo ].toSet
                processed += valuedObjectIdentifier.processDependencySet(scheduledAccesses, null, isSpecific)
            }
        }
        valuedObjectIdentifier.processDependencySet(accesses.filter[ schedule === null ].toSet, processed, isSpecific)
    }
    
    protected def Set<Pair<ValuedObjectAccess, ValuedObjectAccess>> processDependencySet(ValuedObjectIdentifier valuedObjectIdentifier, 
        Set<ValuedObjectAccess> accesses, Set<Pair<ValuedObjectAccess, ValuedObjectAccess>> exclude, boolean isSpecific
    ) {
        val processed = <Pair<ValuedObjectAccess, ValuedObjectAccess>> newHashSet
        val accessPair = accesses.sortAccessesAccordingToPriority
        for (priority : 0..accessPair.first) {
            val prioAccesses = accessPair.second.get(priority) 
            for (access : prioAccesses) {
                for (compPriority : priority..accessPair.first) {
                    val compAccesses = accessPair.second.get(compPriority) 
                    for (compAccess : compAccesses) {
                        if (exclude === null || 
                            !exclude.exists[ first.node == access.node && second.node == compAccess.node ] 
                        ) {
                            if (!access.isSpecific || !compAccess.isSpecific || isSpecific) {
                                valuedObjectIdentifier.processDependency(access, compAccess)
                                processed.add(new Pair<ValuedObjectAccess, ValuedObjectAccess>(access, compAccess))
                                processed.add(new Pair<ValuedObjectAccess, ValuedObjectAccess>(compAccess, access))
                            }
                        }
                    }
                }
            }
        }
        return processed
    }
    
    protected def void processDependency(ValuedObjectIdentifier valuedObjectIdentifier, ValuedObjectAccess source, ValuedObjectAccess target) {
        if (source.node == target.node) return
        val type = source.accessType(target)
        if (type == IGNORE) return        
        val saveOnlyConflicting = environment.getProperty(SAVE_ONLY_CONFLICTING_DEPENDENCIES)
        val concurrent = source.isConcurrentTo(target)
        if (!concurrent && saveOnlyConflicting) return
        val confluent = (type == WRITE_WRITE && source.isConfluentTo(target))
        if (confluent && saveOnlyConflicting) return

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
            if (source.schedule instanceof ScheduleDeclaration) {
                val scheduleDeclaration = source.schedule.asScheduleDeclaration
                if (source.priority == target.priority) {
                    if (scheduleDeclaration.priorities.size > source.priority) {
                        val classification = scheduleDeclaration.priorities.get(source.priority)
                        if (classification == PriorityProtocol.CONFLUENT) {
                            return IGNORE
                        }
                    }    
                } 
            }
            if (source.priority == target.priority) return WRITE_WRITE
            return WRITE_READ 
        }
        return UNKNOWN
    }
    
    abstract protected def Function1<? super EObject, Boolean> getConcurrentForkFilter()
    
    protected def boolean isConcurrentTo(ValuedObjectAccess source, ValuedObjectAccess target) {
        for (sourceFork : source.forkStack.filter(getConcurrentForkFilter)) {
            for (targetFork : target.forkStack.filter(getConcurrentForkFilter)) {
                if (sourceFork == targetFork) {
                     val sourceEntry = source.forkStack.getOwnThreadEntry(sourceFork)
                     val targetEntry = target.forkStack.getOwnThreadEntry(targetFork)
                     return sourceEntry != targetEntry
                }
            }
        }
        return false
    }
    
    abstract protected def Class<?> getThreadEntryClass() 
    
    protected def getOwnThreadEntry(ForkStack forkStack, EObject fork) {
        val forkIndex = forkStack.indexOf(fork)
        if (forkIndex == 0) {
            throw new IllegalArgumentException("The given fork stack is corrupt. The Fork node must no be the head element of the stack.")
        }
        var EObject entry = null
        // It is possible that a fork-thread has more than one entry node on the stack
        // because the exit node was not reached. This is not a problem, because the 
        // join will clean the stack. However, you have to use the entry that was pushed
        // last on the stack in relation to the fork.
        for (i : 1..forkIndex) {
            val node = forkStack.get(forkIndex - i)
            if (getThreadEntryClass.isInstance(node)) {
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
                        // It's the same value.
                        return true
                    } if (source.node.asAssignment.expression.equals2(target.node.asAssignment.expression)) {
                        // Semantically, it's the same expression.
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
    
    private def Assignment asAssignment(EObject eObject) {
        eObject as Assignment
    }
}
