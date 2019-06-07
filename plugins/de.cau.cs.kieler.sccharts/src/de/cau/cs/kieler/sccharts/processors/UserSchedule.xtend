/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.processors

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.Schedulable
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Effect
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import java.util.List
import org.eclipse.emf.ecore.EObject

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.sccharts.PolicyClassDeclaration
import java.lang.invoke.MethodHandles.Lookup
import java.util.LinkedHashMap
import com.google.common.collect.HashMultimap
import com.google.common.collect.LinkedHashMultimap
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.keffects.Emission
import com.google.common.collect.HashBiMap
import de.cau.cs.kieler.kexpressions.PriorityProtocol
import com.google.common.collect.Multimap
import java.util.HashMap
import java.util.LinkedList
import com.google.common.collect.Sets
import de.cau.cs.kieler.kexpressions.ScheduleDeclaration
import de.cau.cs.kieler.kexpressions.AccessModifier

/**
 * 
 * @author ssm
 * @kieler.design 2017-12-12 proposed
 * @kieler.rating 2017-12-12 proposed yellow  
 */
class UserSchedule extends SCChartsProcessor implements Traceable {
    
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension AnnotationsExtensions
        
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.userSchedule"
    }
    
    override getName() {
        "User Schedule"
    }
    
    override process() {
        val model = getModel
        
        for (rootState : model.rootStates) {
            rootState.transformContracts
            rootState.transformUserSchedule   
        }
    }
    
    protected def void transformUserSchedule(State rootState) {
        val userSchedules = rootState.eAllContents.filter(Scope).filter[ !schedule.nullOrEmpty ].toList
        
        for (s : userSchedules) {
            switch(s) {
            State: s.transformUserScheduleState
            ControlflowRegion: s.transformUserScheduleControlflowRegion 
            }
            
        }
    }
    
    protected def void transformUserScheduleState(State state) {
        val schedule = state.schedule
        
        for (t : state.outgoingTransitions) {
            t.applyUserSchedule(schedule)    
        }
        
        if (state.simple) return;
        
        
        for (a : state.actions) {
            a.applyUserSchedule(schedule)
        }
        
        
        // Dataflow regions are not necessary because they are already transformed.
        for (r : state.regions.filter(ControlflowRegion).toList) {
            r.applyUserSchedule(schedule)
            r.transformUserScheduleControlflowRegion
        }
        
        for (s : state.schedule.immutableCopy) {
            s.remove
        }
    }

    protected def void transformUserScheduleControlflowRegion(ControlflowRegion cfRegion) {
        val schedule = cfRegion.schedule
        
        for (a : cfRegion.actions) {
            a.applyUserSchedule(schedule)
        }    
        
        for (s : cfRegion.states) {
            s.applyUserSchedule(schedule) 
        }    

        for (s : cfRegion.schedule.immutableCopy) {
            s.remove
        }

    }
    
    def void transformContracts(State rootState) {
        // Handle Policies
        // ---------------
        val policiesClasses = rootState.allScopes.map[declarations.iterator].flatten.filter(PolicyClassDeclaration).filter[policy !== null].toList
        for (policyClass : policiesClasses) {
            val policy = policyClass.policy
            val methods = policyClass.declarations.filter(MethodDeclaration).toList
            val methodVO = methods.toMap[valuedObjects.head]
            
            // Add SD
            val sdVO = createValuedObject(policy.name)
            val sdDecl = createScheduleDeclaration => [valuedObjects += sdVO]
            policyClass.declarations.add(0, sdDecl)
            
            var collectedMethods = newLinkedHashSet
            var collectedMethodsInStates = newLinkedHashSet
            val allBlockings = HashMultimap.create
            val collectedStrategies = HashMultimap.create
            
            val visited = newHashSet
            val next = newLinkedHashSet
            next += policy.states.findFirst[initial]
            while (!next.empty) {
                val state = next.head
                next.remove(state)
                visited += state
                
                for (transition : state.outgoingTransitions.filter[trigger !== null]) {
                    // find blockings
                    val trig = transition.trigger
                    if (trig instanceof ValuedObjectReference) {
                        val method = methodVO.get(trig.valuedObject)
                        if (method !== null) {
                            collectedMethods += method
                            val blockings = transition.effects.filter(Emission).map[methodVO.get(reference.valuedObject)].filterNull.toList
                            val sequentialBlockings = collectedMethodsInStates.filter[it !== method].toList
                            collectedStrategies.put(method, if (blockings.contains(method)) PriorityProtocol.CONFLICT else PriorityProtocol.CONFLUENT)
                            allBlockings.putAll(method, blockings + sequentialBlockings)
                        }
                    }
                    
                    // next
                    val target = transition.targetState
                    if (!visited.contains(target) && !next.contains(target)) {
                        next += target
                    }
                }
                collectedMethodsInStates += collectedMethods
            }
            
            // Order
            val orderedMethods = collectedMethods.toList.topologicalSort(allBlockings)
            orderedMethods.reverse
            
            //println(orderedMethods.map[valuedObjects.head.name].join(" "))
            
            val strategies = newHashMap
            for (method : collectedStrategies.keySet) {
                if (collectedStrategies.get(method).contains(PriorityProtocol.CONFLICT)) {
                    strategies.put(method, PriorityProtocol.CONFLICT)
                } else {
                    strategies.put(method, PriorityProtocol.CONFLUENT)
                }
            }
            
            // Create groups
            var index = 1
            val indices = HashMultimap.create
            indices.put(0, orderedMethods.head)
            for (method : orderedMethods.drop(1)) {
                val prev = indices.get(index - 1)
                                
                if (allBlockings.get(method).toSet.equals(prev.map[allBlockings.get(it)].flatten.toSet)
                    && prev.map[strategies.get(it)].forall[it === strategies.get(method)]) { // Same index
                    indices.put(index - 1, method)
                } else {
                    indices.put(index, method)
                    index++
                }
            }
            
            // Check validity
            var valid = true
            val revIndicies = newHashMap
            indices.entries.forEach[revIndicies.put(value, key)]
            for (blocker : allBlockings.entries) {
                if (revIndicies.get(blocker.value) >= revIndicies.get(blocker.key)) {
                    println("Invalid ordering in static policy approximation for: " + blocker.value.valuedObjects.head.name + " with precedence over " + blocker.key.valuedObjects.head.name)
                    valid = false
                }
            }
            if (!valid) {
                environment.errors.add("Cannot find static approximation for policy automaton")
            }
            
            
            // Apply SDs
            for (i : 0..index-1) {
                val indexMethods = indices.get(i)
                sdDecl.priorities += strategies.get(methods.head)
                indexMethods.forEach[schedule += createScheduleReference(sdVO) => [priority = i]]
            }
            
            // Remove
            policyClass.policy = null
            snapshot
        }
        
        
        // Handle Class SDs
        // ----------------
        val calls = rootState.eAllContents.filter(ReferenceCall).toList
        val handledMethods = newHashSet
        for (call : calls) {
            var MethodDeclaration method
            if (call.subReference === null && call.valuedObject.eContainer instanceof MethodDeclaration) {
                method = call.valuedObject.eContainer as MethodDeclaration
            } else {
                var sub = call.subReference
                while (sub !== null) {
                    if (sub.subReference !== null) {
                        sub = sub.subReference
                    } else if (sub.valuedObject.eContainer instanceof MethodDeclaration) {
                        method = sub.valuedObject.eContainer as MethodDeclaration
                        sub = null
                    } else {
                        sub = null
                    }
                }
            }
            
            if (method !== null) {
                // SDs
                if (!method.schedule.nullOrEmpty) {
                    var EObject attach = call
                    //call.addScheduleCopy(method.schedule)
                    while (!(attach instanceof Effect || attach instanceof Action)) {
                        attach = attach.eContainer
                    }
                    if (attach instanceof Effect) {
                        attach.addScheduleCopy(method.schedule)
                    } else if(attach instanceof Action) {
                        attach.trigger.addScheduleCopy(method.schedule)
                    }
                    handledMethods += method
                }
            }
        }
        // Remove schedules from method decl
        val handledScheduleDecl = <ScheduleDeclaration>newHashSet
        for (method : handledMethods) {
            handledScheduleDecl += method.schedule.map[valuedObject.eContainer as ScheduleDeclaration]
            method.schedule.clear
        }
        // Move schedule decl to top level
        for (sdDecl : handledScheduleDecl) {
            rootState.declarations += sdDecl
            sdDecl.access = AccessModifier.PUBLIC
        }
    }
    
    // The function to do Topological Sort. It uses recursive topologicalSortUtil() 
    protected def topologicalSort(List<MethodDeclaration> methods, Multimap<MethodDeclaration, MethodDeclaration> blockings) { 
        val ordering = <MethodDeclaration>newLinkedList
  
        val visited = newHashMap
        for (method: methods) {
            visited.put(method, false)
        }
  
        for (method: methods) {
            if (visited.get(method) == false) {
                topologicalSortUtil(method, visited, ordering, blockings)
            }
        }
  
        return ordering
    }
    
    // A recursive function used by topologicalSort 
    protected def void topologicalSortUtil(MethodDeclaration method,
        HashMap<MethodDeclaration, Boolean> visited,
        LinkedList<MethodDeclaration> ordering,
        Multimap<MethodDeclaration, MethodDeclaration> blockings
    ) {
        // Mark the current node as visited. 
        visited.put(method, true)
        for (blocker : blockings.get(method)) {
            if (visited.get(blocker) == false) {
                topologicalSortUtil(blocker, visited, ordering, blockings)
            }
        }
        // Push current node to stack which stores result 
        ordering.push(method); 
    } 
  

    
    protected def void applyUserSchedule(Action action, List<ScheduleObjectReference> schedule) {
        action.trigger?.addScheduleCopy(schedule)
        for (e : action.effects) {
            e.applyUserSchedule(schedule)
        }
    }
    
    protected def void applyUserSchedule(Effect effect, List<ScheduleObjectReference> schedule) {
        effect.addScheduleCopy(schedule)
        
    }
    
    protected def void applyUserSchedule(State state, List<ScheduleObjectReference> schedule) {
        if (state.simple) {
            for (t : state.outgoingTransitions) {
                t.applyUserSchedule(schedule)
            }
        } else {
            state.addScheduleCopy(schedule)
            state.transformUserScheduleState
        }
    }
    
    protected def void applyUserSchedule(ControlflowRegion cfRegion, List<ScheduleObjectReference> schedule) {
        cfRegion.addScheduleCopy(schedule)
    }
    
    protected def void addScheduleCopy(Schedulable schedulable, List<ScheduleObjectReference> schedule) {
        for (s : schedule) {
            schedulable.schedule += s.copy
        }
    }
    
}
