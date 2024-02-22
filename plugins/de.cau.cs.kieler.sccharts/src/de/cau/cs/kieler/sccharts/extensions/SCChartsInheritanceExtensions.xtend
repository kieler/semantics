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
package de.cau.cs.kieler.sccharts.extensions

import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsAccessVisibilityExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsGenericParameterExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsOverloadingExtensions
import de.cau.cs.kieler.sccharts.BaseStateReference
import de.cau.cs.kieler.sccharts.LocalAction
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.scl.MethodImplementationDeclaration
import java.util.Collection
import java.util.HashSet
import java.util.LinkedHashMap
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.ToString

import static extension java.lang.String.format

/**
 * @author als
 *
 */
class SCChartsInheritanceExtensions {
    
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsAccessVisibilityExtensions
    @Inject extension KExpressionsGenericParameterExtensions
    @Inject extension SCChartsGenericTypeExtensions
    
    /**
     * Returns all base states.
     */
    def Iterable<State> baseStates(State state) {
        return state.baseStateReferences.map[target].filterNull
    }
    
    /**
     * Returns a set of all states contained in the inheritance hierarchy of the given state.
     */
    def Set<State> getAllInheritedStates(State state) {
        val allBaseStates = <State>newLinkedHashSet
        
        if (state !== null && !state.baseStateReferences.nullOrEmpty) {
            val work = newLinkedList
            work.addAll(state.baseStates.toSet)
            work.removeIf[it == state]
            
            while (!work.empty) {
                val s = work.pop
                allBaseStates += s
                for (base : s.baseStateReferences.reverseView.map[target].filterNull) { // Depth first
                    if (base != state && !work.contains(base) && !allBaseStates.contains(base)) {
                        work.push(base)
                    }
                }
            }
        }
        return allBaseStates
    }
    
    /**
     * Returns a set of all states contained in the inheritance hierarchy of the given state in depth first order.
     */
    def List<State> getAllInheritedStatesDepthFirst(State state) {
        val allBaseStates = <State>newLinkedList
        
        if (state !== null && !state.baseStateReferences.nullOrEmpty) {
            val work = newLinkedList
            work.addAll(state.baseStates.toSet.filter[it != state].map[new Pair(it, null)])
            
            while (!work.empty) {
                val entry = work.pop
                val s = entry.key
                val parent = entry.value
                if (allBaseStates.contains(parent)) {
                    allBaseStates.add(allBaseStates.indexOf(parent), s)
                } else {
                    allBaseStates += s
                }
                for (base : s.baseStateReferences.reverseView.map[target].filterNull) { // Depth first
                    if (base != state 
                        && !work.exists[it.key == base]
                        && !allBaseStates.contains(base)
                    ) {
                        work.push(new Pair(base, s))
                    }
                }
            }
        }
        return allBaseStates
    }
    
    /**
     * Returns a list of all base states references contained in the inheritance hierarchy acending depth.
     */
    def List<BaseStateReference> getAllInheritedStateReferencesHierachically(State state) {
        return state.getAllInheritedStateReferencesHierachicallyLeveled.entrySet.map[key].toList
    }
    def LinkedHashMap<BaseStateReference, Integer> getAllInheritedStateReferencesHierachicallyLeveled(State state) {
        val allBaseStateRefs = new LinkedHashMap<BaseStateReference, Integer>
        
        if (state !== null && !state.baseStateReferences.nullOrEmpty) {
            val work = newLinkedList
            state.baseStateReferences.forEach[allBaseStateRefs.put(it, 1)]
            work.addAll(state.baseStateReferences)
            work.removeIf[it.target == state]
            
            while (!work.empty) {
                val ref = work.pop
                val target = ref.target
                if (!target.baseStateReferences.nullOrEmpty) {
                    val level = allBaseStateRefs.get(ref) + 1
                    for (baseRef : target.baseStateReferences.filterNull) { // Depth first
                        if (baseRef.target !== null && baseRef.target != state && !work.contains(baseRef) && !allBaseStateRefs.containsKey(baseRef)) {
                            allBaseStateRefs.put(baseRef, level)
                            work.add(baseRef)
                        }
                    }
                }
            }
        }
        
        return allBaseStateRefs
    }
    
    /**
     * Returns an iterator of all visible (no private) declarations of all states contained in the inheritance hierarchy of the given state.
     * Conflicting duplicates will be included.
     */
    def Iterable<Declaration> getAllVisibleInheritedDeclarations(State state) {
        return state.getAllInheritedStates.map[it.declarations].flatten.filter[!it.isPrivate]
    }
    def Iterable<Declaration> getAllVisibleInheritedDeclarationsDepthFirst(State state) {
        return state.allInheritedStatesDepthFirst.map[it.declarations].flatten.filter[!it.isPrivate]
    }
    
    /**
     * Returns an iterator of all declarations in all states contained in the inheritance hierarchy of the given state.
     * Conflicting duplicates will be included.
     */
    def Iterable<Declaration> getAllInheritedDeclarations(State state) {
        return state.getAllInheritedStates.map[it.declarations].flatten
    }
    
    /**
     * Returns an iterator of all actions of all states contained in the inheritance hierarchy of the given state.
     */
    def Iterable<LocalAction> getAllVisibleInheritedActions(State state) {
        return state.getAllInheritedStates.map[it.actions].flatten
    }
    
    /**
     * Returns an iterator of all visible (override region will hide overridden ones) regions of all states contained in the inheritance hierarchy of the given state.
     * Conflicting duplicates will be included.
     */
    def Iterable<Region> getAllVisibleInheritedRegions(State state) {
        return state.getAllVisibleInheritedRegions(true)
    }
    
    /**
     * Returns an iterator of all visible (override region will hide overridden ones) regions of all states contained in the inheritance hierarchy of the given state.
     * Conflicting duplicates will be included.
     * @param directOverride if true the given state also contributed as overrider.
     *
     */
    def Iterable<Region> getAllVisibleInheritedRegions(State state, boolean directOverride) {
        if (state !== null && !state.baseStateReferences.nullOrEmpty) {
            val regions = newLinkedHashSet
            val path = newLinkedList(state)
            val indexes = newLinkedList(-1)
            val overrides = <List<Region>>newLinkedList
            if (directOverride) {
                overrides.push(state.regions.filter[!name.nullOrEmpty && override].toList)
            } else {
                overrides.push(emptyList)
            }
            
            while (!path.empty) {
                val s = path.peek
                val idx = indexes.pop + 1
                if (idx == 0 && s != state) {
                    regions += s.regions.filter[ r | r.name.nullOrEmpty || !overrides.flatten.exists[r.name.equals(name)]]
                    overrides.push(s.regions.filter[!name.nullOrEmpty && override].toList)
                }
                if (s.baseStateReferences === null || s.baseStateReferences.size <= idx) {
                    path.pop
                    overrides.pop
                } else {
                    indexes.push(idx)
                    val base = s.baseStateReferences.get(idx)?.target
                    // check cycle
                    if (base !== null && !path.contains(base)) {
                        path.push(base)
                        indexes.push(-1)
                    }
                }
            }
            
            return regions
        }
        return emptyList
    }
    
    /**
     * Returns true if the given state has an acyclic hierarchy.
     */
    def hasAcyclicHierarchy(State state) {
        return state.hierarchyCycles.empty
    }
    
    /**
     * Returns states that are included in hierarchy cycles, values id the index of the baseState of the given state which includes the cycle.
     */
    def getHierarchyCycles(State state) {
        val cycles = HashMultimap.<State, Integer>create
        if (state !== null && !state.baseStateReferences.nullOrEmpty) {
            // DFS with checks if new child already exists in path to root.
            val path = newLinkedList(state)
            val indexes = newLinkedList(-1)
            while (!path.empty) {
                val s = path.peek
                val idx = indexes.pop + 1
                if (s.baseStateReferences === null || s.baseStateReferences.size <= idx) {
                    path.pop
                } else {
                    indexes.push(idx)
                    val base = s.baseStateReferences.get(idx)?.target
                    // check cycle
                    if (path.contains(base)) {
                        cycles.put(base, indexes.last)
                    } else {
                        path.push(base)
                        indexes.push(-1)
                    }
                }
            }
        }
        return cycles
    }
    
    def Collection<MethodInheritanceInfo> getMethodInheritanceInfos(State state) {
        val infos = newArrayList
        val effective = newHashMap
        
        // local ones
        for (method : state.methodDeclarations) {
            val info = new MethodInheritanceInfo(method)
            infos += info
            if (effective.containsKey(info.signatureID)) {
                info.errors += "Multiple definitions of methods with the same signature (%s).".format(info.signatureID) +
                    // TODO remove when implemented
                    " Note that method overloading is currently only supported for parameters of different length, not type."
            } else {
                effective.put(info.signatureID, info)
            }
        }
        
        // TODO: implement overloading based on types
        
        // inherited
        val leveldBaseStates = state.allInheritedStateReferencesHierachicallyLeveled
        for (base : leveldBaseStates.entrySet) {
            val baseState = base.key.target
            for (method : baseState.methodDeclarations) {
                val info = new MethodInheritanceInfo(method)
                info.inheritanceLevel = base.value
                infos += info
                
                if (!method.isPrivate) {
                    if (effective.containsKey(info.signatureID)) {
                        val repl = effective.get(info.signatureID)
                        val replMethod = repl.decl
                        
                        if (info.inheritanceLevel < repl.inheritanceLevel) {
                            info.errors += "Multiple definitions of the same method (%s) in the inheritance hierarchy but no overrider to solve this ambiguity (diamond problem).".format(info.name)
                            repl.errors += "Multiple definitions of the same method (%s) in the inheritance hierarchy but no overrider to solve this ambiguity (diamond problem).".format(info.name)
                        } else if (!replMethod.^override) {
                            info.errors += "Method (%s) was redefined in the inheritance hierarchy but not marked as override.".format(info.name)
                            repl.errors += "Methods with the same signature is already inherited (%s). Mark this declaration as override (keyword) to replace previous definitions.".format(info.signatureID) +
                                // TODO remove when implemented
                                " Note that method overloading is currently only supported for parameters of different length, not type."
                        }
                        if (replMethod.^override) {
                            if (method.returnType != replMethod.returnType) {
                                if (method.returnType === ValueType.PRIMITIVE) {
                                    var ValueType actualType = null
                                    val typeVO = method.returnReference
                                    if (typeVO instanceof ValuedObject) {
                                        actualType = typeVO.inferGenericType(replMethod)
                                    }
                                    
                                    if (actualType === null) {
                                        repl.errors += "Overriding methods must not declare a different return type (%s vs. %s). Generic types must be kept generic until concretized.".format(method.returnType, replMethod.returnType)
                                    } else if (actualType !== replMethod.returnType) {
                                        repl.errors += "Overriding methods must not declare a different return type than the given generic type argument (%s vs. %s).".format(actualType, replMethod.returnType)
                                    }
                                } else {
                                    repl.errors += "Overriding methods must not declare a different return type (%s vs. %s).".format(method.returnType, replMethod.returnType)
                                }
                            }
                            if (method.parameterDeclarations.size != replMethod.parameterDeclarations.size) {
                                repl.errors += "Overriding methods must not declare a parameter with a different length (%s vs. %s).".format(method.parameterDeclarations.size, replMethod.parameterDeclarations.size)
                            } else {
                                for (i : 0..<method.parameterDeclarations.size) {
                                    val oP = method.parameterDeclarations.get(i)
                                    val rP = replMethod.parameterDeclarations.get(i)
                                    if (oP.class != rP.class) {
                                        if (rP instanceof VariableDeclaration && oP instanceof ReferenceDeclaration && (oP as ReferenceDeclaration).reference.isGenericParamter) {
                                            // Special case concretizing generic parameter types
                                            val rPType = (rP as VariableDeclaration).type
                                            var ValueType actualType = null
                                            val typeVO = (oP as ReferenceDeclaration).reference
                                            if (typeVO instanceof ValuedObject) {
                                                actualType = typeVO.inferGenericType(replMethod)
                                            }
                                            
                                            if (actualType === null) {
                                                repl.errors += "Overriding methods must not declare a parameter with a different type (index %d). Generic types must be kept generic until concretized.".format(i)
                                            } else if (actualType !== rPType) {
                                                repl.errors += "Overriding methods must not declare a different return type than the given generic type argument (index %d: %s vs. %s).".format(i, actualType, rPType)
                                            }
                                        } else {
                                            repl.errors += "Overriding methods must not declare a parameter with a different type (index %d).".format(i)
                                        }
                                    } else if (oP instanceof VariableDeclaration && rP instanceof VariableDeclaration) {
                                        if ((oP as VariableDeclaration).type != (rP as VariableDeclaration).type) {
                                            repl.errors += "Overriding methods must not declare a parameter with a different type (index %d: %s vs. %s).".format(i, (oP as VariableDeclaration).type, (rP as VariableDeclaration).type)
                                        }
                                    } else if (oP instanceof ReferenceDeclaration && rP instanceof ReferenceDeclaration) {
                                        if ((oP as ReferenceDeclaration).reference != (rP as ReferenceDeclaration).reference) {
                                            repl.errors += "Overriding methods must not declare a parameter with a different type (index %d: %s vs. %s).".format(i, (oP as ReferenceDeclaration).reference, (rP as ReferenceDeclaration).reference)
                                        }
                                    }
                                }
                            }
                        }
                        info.overrider = replMethod
                        repl.overriding = true
                        repl.overrides += info.decl
                    } else {
                        effective.put(info.name, info)
                    }
                }
            }
        }
        
        // final checks
        for (info : infos) {
            if (info.decl.^override) {
                if (!info.overriding) {
                    info.errors += "No matching or visible method found with this signature to override."
                }
                if (!info.implemented) {
                    info.errors += "An overriding method must provide an implementation!"
                }
            }
        }
        
        return infos
    }
    
    def State getNextSuperStateWithBaseStates(Scope scope) {
        var EObject parent = scope
        while (parent !== null) {
            if (parent instanceof State) {
                if (!parent.baseStateReferences.nullOrEmpty) {
                    return parent
                }
            }
            parent = parent.eContainer
        }
        return null
    }
    
    def BaseStateReference baseReference(State state) {
        return SCChartsFactory.eINSTANCE.createBaseStateReference => [
            target = state
        ]
    }

}

@Accessors
@ToString
class MethodInheritanceInfo {
    val MethodDeclaration decl
    val String signatureID
    val boolean implemented
    val List<String> errors = newArrayList
    
    var int inheritanceLevel = 0
    var boolean overriding = false
    var boolean overloaded = false
    var MethodDeclaration overrider = null
    val Set<MethodDeclaration> overrides = new HashSet()
    
    new(MethodDeclaration decl) {
        this.decl = decl
        this.implemented = (decl instanceof MethodImplementationDeclaration)
                    && (decl as MethodImplementationDeclaration).implemented
        this.signatureID = KExpressionsOverloadingExtensions.getMethodSignatureID(decl)       
    }
    
    def getName() {
        return decl?.valuedObjects?.head?.name
    }
    
    def isInherited() {
        return inheritanceLevel !== 0
    }
}