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

import com.google.common.collect.HashMultimap
import com.google.common.collect.LinkedHashMultimap
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.AccessModifier
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsInheritanceExtensions
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

/**
 * 
 * @author als
 */
class Inheritance extends SCChartsProcessor implements Traceable {

    @Inject extension SCChartsInheritanceExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsDeclarationExtensions
    
    public static val GENERATED_PREFIX = "_"
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.inheritance"
    }
    
    override getName() {
        "Inheritance"
    }
    
    override process() {
        for(rootState : new ArrayList<State>(model.rootStates)) {
            rootState.inheritBaseStates
        }
    }
    
    def inheritBaseStates(State state) {
        if (!state.baseStates.nullOrEmpty) {
            val allBaseStates = state.allInheritedStates
            
            // copy annotations
            state.annotations.addAll(allBaseStates.map[annotations.map[copy]].flatten)
            
            // copy declarations
            val replacements = newHashMap
            val voNames = HashMultimap.<String, ValuedObject>create
            for (decl : state.declarations) {
                for (vo : decl.valuedObjects) {
                    voNames.put(vo.name, vo)
                }
            }
            val implicitlyBoundInSuperState = newHashSet
            var container = state.eContainer
            while (container !== null) {
                if (container instanceof State) {
                    if (!container.baseStates.nullOrEmpty) {
                        implicitlyBoundInSuperState.addAll(container.allInheritedStates.map[declarations].flatten.filter(VariableDeclaration).filter[input == true || output == true])
                    }
                }
                container = container.eContainer
            }
            val newDecls = newArrayList
            for (baseDelc : allBaseStates.map[declarations].flatten.filter[!implicitlyBoundInSuperState.contains(it)]) {
                var newDecl = baseDelc.copy
                
                if (newDecl.access !== AccessModifier.PUBLIC) { // rename
                    for (vo : newDecl.valuedObjects) {
                        vo.name = GENERATED_PREFIX + (baseDelc.eContainer as State).name + "_" + vo.name
                    }
                    newDecl.access = AccessModifier.PUBLIC
                }

                for (baseVoIdx : baseDelc.valuedObjects.indexed) {
                    val baseVO = baseVoIdx.value
                    val newVO = newDecl.valuedObjects.get(baseVoIdx.key)
                    if (voNames.containsKey(newVO.name)) {
                        environment.errors.add("Conflicting variable declaration with name " + newVO.name + " in inheritance hierarchy.", baseVO, true)
                    } else {
                        replacements.put(baseVO, newVO)
                        voStore.update(newVO, "inherited")
                    }
                    voNames.put(newVO.name, newVO)
                }
                newDecl.valuedObjects.removeIf[voNames.get(it.name).size > 1]
                if (!newDecl.valuedObjects.empty) {
                    newDecls += newDecl 
                }
            }
            state.declarations.addAll(0, newDecls)
            
            // replace references in declarations/methods
            state.declarations.forEach[replaceVOR(replacements)]
            
            // copy actions
            state.actions.addAll(0, allBaseStates.map[actions.map[copy]].flatten.toList)
            
            // replace references in state actions
            state.actions.forEach[replaceVOR(replacements)]
            
            // copy regions
            val overrriders = state.regions.filter[override].toList
            state.regions.addAll(0, state.allVisibleInheritedRegions.map[copy].toList)
            overrriders.forEach[override = false]
            // conflicts
            val regionNames = LinkedHashMultimap.<String, Region>create
            for (r : state.regions) {
                if (!r.name.nullOrEmpty) {
                    regionNames.put(r.name, r)
                }
            }
            for (conflict : regionNames.keySet.filter[regionNames.get(it).size > 1]) {
                for (r : regionNames.get(conflict)) {
                    environment.errors.add("Conflicting region with name " + r.name + " in inheritance hierarchy.", r, true)
                }
            }

            // replace references in state regions
            state.regions.forEach[replaceVOR(replacements)]
            
            // remove base states
            state.baseStates.clear
        }
    }
    
    def replaceVOR(EObject object, java.util.Map<ValuedObject, ValuedObject> replacements) {
        for (vor: object.eAllContents.filter(ValuedObjectReference).filter[replacements.containsKey(valuedObject)].toList) {
            if (!(vor.eContainer instanceof ValuedObjectReference)) {
                vor.valuedObject = replacements.get(vor.valuedObject)
                vor.subReference.replaceSubVOR(vor.valuedObject)
            }
        }
    }
    
    def void replaceSubVOR(ValuedObjectReference vor, ValuedObject parent) {
        if (vor !== null && parent !== null) {
            val decl = parent.declaration
            if (decl instanceof ClassDeclaration) {
                vor.valuedObject = decl.innerValuedObjects.findFirst[it.name == vor.valuedObject.name]
                vor.subReference.replaceSubVOR(vor.valuedObject)
            }
        }
    }
}
