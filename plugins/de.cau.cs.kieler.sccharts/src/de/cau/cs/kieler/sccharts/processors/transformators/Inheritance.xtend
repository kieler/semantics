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
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.Replacements
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsInheritanceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsReferenceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import java.util.ArrayList

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

/**
 * 
 * @author als
 */
class Inheritance extends Reference {
    
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExtDeclarationExtensions    
    @Inject extension SCChartsScopeExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCChartsReferenceExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsInheritanceExtensions
    
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
            val replacements = new Replacements
            val names = HashMultimap.<String, ValuedObject>create
            for (decl : state.declarations) {
                for (vo : decl.valuedObjects) {
                    names.put(vo.name, vo)
                }
            }
            val newDecls = newArrayList
            for (baseDelc : allBaseStates.map[declarations].flatten) {
                var newDecl = baseDelc.copy

                for (baseVoIdx : baseDelc.valuedObjects.indexed) {
                    val baseVO = baseVoIdx.value
                    val newVO = newDecl.valuedObjects.get(baseVoIdx.key)
                    if (names.containsKey(newVO.name)) {
                        val effectiveVO = names.get(newVO.name).head
                        val effectiveDecl = effectiveVO.declaration
                        // merge
                        if (newDecl.isMergeableDeclaration(effectiveDecl)) {
                            newDecl.annotations.addAll(effectiveDecl.annotations.map[copy])
                            environment.infos.add("Merged duplicate variable declaration with name " + newVO.name + " in inheritance hierarchy.", effectiveVO, true)
                        } else {
                            environment.errors.add("Conflicting variable declaration with name " + newVO.name + " in inheritance hierarchy.", effectiveVO, true)
                        }
                        replacements.push(baseVO, effectiveVO.reference)
                    } else {
                        replacements.push(baseVO, newVO.reference)
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
            state.actions.forEach[replaceValuedObjectReferencesInAction(replacements)]
            
            // copy regions
            state.regions.addAll(0, state.allInheritedRegions.map[copy].toList)
            // TODO overriding and conflicts!
//            for (conflict : allBaseStates.allConflictingInheritedRegions) {
//            }

            // replace references in state regions
            state.regions.forEach[replaceValuedObjectReferences(replacements)]

            // remove base states
            state.baseStates.clear
        }
    }
}
