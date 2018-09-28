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
package de.cau.cs.kieler.sccharts.processors.transformators

import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsInheritanceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsReferenceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.kexpressions.ValuedObjectReference

/**
 * 
 * @author als
 */
class Inheritance extends SCChartsProcessor implements Traceable {
    
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExtDeclarationExtensions    
    @Inject extension SCChartsScopeExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCChartsReferenceExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsInheritanceExtensions
    
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
            val names = HashMultimap.<String, ValuedObject>create
            for (decl : state.declarations) {
                for (vo : decl.valuedObjects) {
                    names.put(vo.name, vo)
                }
            }
            val newDecls = newArrayList
            for (baseDelc : allBaseStates.map[declarations].flatten) {
                var newDecl = baseDelc.copy
                
                if (newDecl.private) { // rename
                    for (vo : newDecl.valuedObjects) {
                        vo.name = GENERATED_PREFIX + (baseDelc.eContainer as State).name + "_" + vo.name
                    }
                }

                for (baseVoIdx : baseDelc.valuedObjects.indexed) {
                    val baseVO = baseVoIdx.value
                    val newVO = newDecl.valuedObjects.get(baseVoIdx.key)
                    if (names.containsKey(newVO.name)) {
                        environment.errors.add("Conflicting variable declaration with name " + newVO.name + " in inheritance hierarchy.", baseVO, true)
                    } else {
                        replacements.put(baseVO, newVO)
                        voStore.update(newVO, "inherited")
                    }
                    names.put(newVO.name, newVO)
                }
                newDecl.valuedObjects.removeIf[names.get(it.name).size > 1]
                if (!newDecl.valuedObjects.empty) {
                    newDecls += newDecl 
                }
            }
            state.declarations.addAll(0, newDecls)
            
            // copy actions
            state.actions.addAll(0, allBaseStates.map[actions.map[copy]].flatten.toList)
            
            // replace references in state actions
            state.actions.forEach[replaceVOR(replacements)]
            
            // copy regions
            state.regions.addAll(0, state.allVisibleInheritedRegions.map[copy].toList)
            // TODO overriding and conflicts!
//            for (conflict : allBaseStates.allConflictingInheritedRegions) {
//            }

            // replace references in state regions
            state.regions.forEach[replaceVOR(replacements)]

            // remove base states
            state.baseStates.clear
        }
    }
    
    def replaceVOR(EObject object, java.util.Map<ValuedObject, ValuedObject> replacements) {
        for (vor: object.eAllContents.filter(ValuedObjectReference).filter[replacements.containsKey(valuedObject)].toList) {
            vor.valuedObject = replacements.get(vor.valuedObject)
        }
    }
}
