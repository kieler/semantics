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
package de.cau.cs.kieler.kicool.processors

import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
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
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.kexpressions.keffects.Dependency
import de.cau.cs.kieler.kexpressions.keffects.dependencies.ForkStack
import de.cau.cs.kieler.kexpressions.keffects.dependencies.ValuedObjectIdentifier
import de.cau.cs.kieler.kexpressions.keffects.dependencies.ValuedObjectAccess
import de.cau.cs.kieler.kexpressions.keffects.dependencies.LinkableInterfaceEntry

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

    public static val IProperty<Boolean> ALLOW_OLD_SC_SYNTAX = 
        new Property<Boolean>("de.cau.cs.kieler.kexpressions.keffects.dependencies.oldSCSyntax", true)

    public static val IProperty<Boolean> ALLOW_MULTIPLE_RELATIVE_READERS = 
        new Property<Boolean>("de.cau.cs.kieler.kexpressions.keffects.dependencies.multipleRelativeReaders", false)

        
    public static val IProperty<ValuedObjectAccessors> VALUED_OBJECT_ACCESSORS = 
        new Property<ValuedObjectAccessors>("de.cau.cs.kieler.kexpressions.keffects.dependencies.valuedObjectAccessors", null)
        
    public static val IProperty<LinkableInterfaceData> LINKABLE_INTERFACE_DATA = 
        new Property<LinkableInterfaceData>("de.cau.cs.kieler.kexpressions.keffects.dependencies.linkableInterfaceData", null)
    
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
    
    /** Implement this method to tell the {@link process} method how to find the sub-models 
     * (e.g. rootstates w.r.t. sccharts).
     */
    abstract def List<S> getSubModels(P rootModel) 
    
    /** Perform a dependency analysis on a concrete sub model instance. 
     *  Therefore, two steps are executed. In the first step, the instance searches for potential dependencies and
     *  fills the {@class ValuedObjectAccessors} structure. Afterwards, the {@link addDependencies} method
     *  creates dedicated dependency objects if user-defined filter match. */
    def processSubModel(S subModel) {
        val valuedObjectAccessors = new ValuedObjectAccessors
        subModel.searchDependencies(valuedObjectAccessors)          
        environment.setProperty(VALUED_OBJECT_ACCESSORS, valuedObjectAccessors)              
        subModel.addDependencies(valuedObjectAccessors)  
        subModel.createInterfaceData(valuedObjectAccessors) 
        subModel.postProcessValuedObjectAccessors(valuedObjectAccessors)    
    }
    
    /** After a sub-model is done, this method gets called. You can put post-processing code here. */
    protected def postProcessValuedObjectAccessors(S subModel, ValuedObjectAccessors valuedObjectAccessors) {
        // Override this if you want to work with the valued object accessors afterwards.
    }

    /** Implement this method to traverse the model and find dependencies. E.g. the SCG analysis does this by dfs.
     *  In particular, you can interpret everything as an dependency. However, if you are specifically looking for
     *  kexpressions dependencies, you can call the following dedicated methods ({@link processAssignment}, 
     *  {@link processExpressionReader}) to generalize the process.  
     */
    abstract protected def void searchDependencies(S subModel, ValuedObjectAccessors valuedObjectAccessors) 
    
    /** The dependency must not be associated with the concrete object that is responsible for the dependency. 
     *  For example, even though an assignment may cause a particular dependency, the dependency object itself may be
     *  associated with the enclosing control flow region. Override this method, if the object and the association differ.  
     */
    protected def Linkable association(EObject eObject) {
        return if (eObject instanceof Linkable) eObject else null
    } 
    
    /** Protected prototype method to find dependencies in keffects assignments. */
    protected def void processAssignment(Assignment assignment, ForkStack forkStack, ValuedObjectAccessors valuedObjectAccessors) {
        // Find readers.
        val readVOIs = assignment.processExpressionReader(assignment.expression, forkStack, valuedObjectAccessors)

        // Examine the object that this assignment writes to (including potential array indices).        
        if (assignment.valuedObject === null) return;
        
        val writeVOI = new ValuedObjectIdentifier(assignment)
        
        // If a writer was detected, remove previously registered read accesses,
        // because the access is recognized as write and we don't want another write-read
        // dependency to be created.
        for (readAccess : valuedObjectAccessors.getAccesses(writeVOI).filter[ node == assignment ].toList) {
            valuedObjectAccessors.removeAccess(writeVOI, readAccess)
        }        
        
        for(index : assignment.indices) {
            val indexReaderVOIs = assignment.processExpressionReader(index, forkStack, valuedObjectAccessors)
            if (indexReaderVOIs.contains(writeVOI)) {
                environment.warnings.add("The index variable is written by the same assignment. However, the new assignment will only have effect afterwards.",
                    assignment, true)
            }
        }

        // Respect user-defined schedules.
        for(sched : newLinkedList(GLOBAL_SCHEDULE) + assignment.schedule) {
            var schedule = GLOBAL_SCHEDULE
            var ValuedObject scheduleObject = null       
            var priority = GLOBAL_WRITE
            
            // Detect relative writes.
            if (environment.getProperty(ALLOW_OLD_SC_SYNTAX)) {
                if (readVOIs.contains(writeVOI)) {
                    if (environment.getProperty(ALLOW_MULTIPLE_RELATIVE_READERS)) {
                        priority = GLOBAL_RELATIVE_WRITE
                    } else {
                        if (readVOIs.filter[it == writeVOI].size == 1 && assignment.operator == AssignOperator.ASSIGN) {
                            priority = GLOBAL_RELATIVE_WRITE    
                        }
                    }
                }
            }
            
            if (assignment.operator != AssignOperator.ASSIGN) {
                if (environment.getProperty(ALLOW_MULTIPLE_RELATIVE_READERS)) {
                    priority = GLOBAL_RELATIVE_WRITE
                } else {
                    if (!readVOIs.contains(writeVOI)) {
                        priority = GLOBAL_RELATIVE_WRITE    
                    }
                }
             }
            
            if (sched instanceof ScheduleObjectReference) {
                schedule = sched.valuedObject.declaration as ScheduleDeclaration
                scheduleObject = sched.valuedObject 
                priority = sched.priority    
            }
            
            val writeAccess = new ValuedObjectAccess(assignment, assignment.association, schedule, scheduleObject, priority, forkStack, writeVOI.isSpecificIdentifier)
            writeAccess.isWriteAccess = true
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
                
                val readAccess = new ValuedObjectAccess(node, node.association, schedule, scheduleObject, priority, forkStack, readVOI.isSpecificIdentifier)
                valuedObjectAccessors.addAccess(readVOI, readAccess)
            } 
        }
        
        return readVOIs
    }
    
    /** Add the dependencies to the model. */
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
    
    /** Create a set of related dependencies that will be considered inside the appropriate schedules.
     *  First,  user-defined schedules are considered. Lastly, the default, IUR is checked.
     */
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
    
    /** Process the dependency set: Sort the dependencies according to priority and check if a dependency object
     *  must be created. Afterwards, mark the dependency as processed.
     */
    protected def Set<Pair<ValuedObjectAccess, ValuedObjectAccess>> processDependencySet(ValuedObjectIdentifier valuedObjectIdentifier, 
        Set<ValuedObjectAccess> accesses, Set<Pair<ValuedObjectAccess, ValuedObjectAccess>> exclude, boolean isSpecific
    ) {
        val processed = <Pair<ValuedObjectAccess, ValuedObjectAccess>> newHashSet
        val accessPair = accesses.sortAccessesAccordingToPriority
        for (priority : 0..accessPair.key) {
            val prioAccesses = accessPair.value.get(priority) 
            for (access : prioAccesses) {
                for (compPriority : priority..accessPair.key) {
                    val compAccesses = accessPair.value.get(compPriority) 
                    for (compAccess : compAccesses) {
                        if (exclude === null || 
                            !exclude.exists[ key.node == access.node && value.node == compAccess.node ] 
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
    
    /** Method for the creation of the concrete dependency instance. Override this if you want to specialize. */
    protected def DataDependency createDependency(Linkable source, Linkable target) {
        return source.createDataDependency(target)
    }
    
    /** After a dependency was created, this method gets called so that the user is able to post-process the dependency creation. */
    protected def void postProcessDependency(DataDependency dependency, ValuedObjectIdentifier valuedObjectIdentifier, ValuedObjectAccess source, ValuedObjectAccess target) {
        // override if necessary
    }
    
    protected def void processDependency(ValuedObjectIdentifier valuedObjectIdentifier, ValuedObjectAccess source, ValuedObjectAccess target) {
        if (source.associatedNode == target.associatedNode) return
        val type = source.accessType(target)
        if (type == IGNORE) return        
        val saveOnlyConflicting = environment.getProperty(SAVE_ONLY_CONFLICTING_DEPENDENCIES)
        val concurrent = source.isConcurrentTo(target)
        if (!concurrent && saveOnlyConflicting) return
        val confluent = (type == WRITE_WRITE && source.isConfluentTo(target))
        if (confluent && saveOnlyConflicting) return
        
        val dependency = source.node.createDependency(target.node) => [
            it.reference = valuedObjectIdentifier.valuedObject
            it.type = type
            it.concurrent = concurrent
            it.confluent = confluent
        ]
        
        dependency.trace(source.node)       
        dependency.postProcessDependency(valuedObjectIdentifier, source, target)             
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
    
    protected def EObject getLeastCommonAncestorFork(ValuedObjectAccess source, ValuedObjectAccess target) {
        return getGenericLeastCommonAncestorFork(source.forkStack, target.forkStack, getConcurrentForkFilter)
    }
    
    protected def Pair<EObject, EObject> getLeastCommonAncestorEntries(ValuedObjectAccess source, ValuedObjectAccess target) {
        val lcaf = getLeastCommonAncestorFork(source, target)
        if (lcaf !== null) {
            val sourceEntry = source.forkStack.getOwnThreadEntry(lcaf)
            val targetEntry = target.forkStack.getOwnThreadEntry(lcaf)
            return new Pair<EObject, EObject>(sourceEntry, targetEntry)
        }
        return null
    }
    
    protected def boolean isConcurrentTo(ValuedObjectAccess source, ValuedObjectAccess target) {
        val entries = getLeastCommonAncestorEntries(source, target)
        if (entries !== null) {
            return entries.key != entries.value
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
    
    static def EObject getGenericLeastCommonAncestorFork(ForkStack sourceStack, 
        ForkStack targetStack, Function1<? super EObject, Boolean> concurrentForkFilter
    ) {
        for (sourceFork : sourceStack.filter(concurrentForkFilter)) {
            for (targetFork : targetStack.filter(concurrentForkFilter)) {
                if (sourceFork == targetFork) {
                    return sourceFork
                }
            }
        }
        return null
    }
    


    
    protected def createInterfaceData(S subModel, ValuedObjectAccessors valuedObjectAccessors) {
        val iData = new LinkableInterfaceData
        val linkables = valuedObjectAccessors.getLinkableAccessMap
        
        for (l : linkables.keySet) {
//            println(l)
            val VOIs = linkables.get(l)
            for (VOI : VOIs) {
//                println("  " + VOI)
                
                val lie = new LinkableInterfaceEntry(l, VOI.valuedObject) 
                lie.directInputAccess = !l.incomingLinks.filter(Dependency).exists[ 
                    it.reference instanceof ValuedObject && it.reference === VOI.valuedObject
                ]
                lie.directOutputAccess = !l.outgoingLinks.filter(Dependency).exists[ 
                    it.reference instanceof ValuedObject && it.reference === VOI.valuedObject
                ]
                lie.isWriteAccess = valuedObjectAccessors.map.get(VOI).exists[ 
                    it.associatedNode === l && it.isWriteAccess
                ]
                             
//                println("    direct: " + lie.directInputAccess + ", " + lie.directOutputAccess)
//                println("    write: " + lie.isWriteAccess)

                iData.add(lie)
            } 
        }
        environment.setProperty(LINKABLE_INTERFACE_DATA, iData)
    }

    
}
