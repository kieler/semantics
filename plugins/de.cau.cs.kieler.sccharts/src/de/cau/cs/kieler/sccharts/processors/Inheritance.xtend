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
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.GenericParameterDeclaration
import de.cau.cs.kieler.kexpressions.GenericTypeReference
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValueTypeReference
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCompareExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsGenericParameterExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kexpressions.kext.extensions.Binding
import de.cau.cs.kieler.kexpressions.kext.extensions.BindingType
import de.cau.cs.kieler.kexpressions.kext.extensions.Replacements
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsInheritanceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsReferenceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension java.lang.String.format

/**
 * 
 * @author als
 */
class Inheritance extends SCChartsProcessor implements Traceable {

    @Inject extension SCChartsInheritanceExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension SCChartsReferenceExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension KExpressionsGenericParameterExtensions
    @Inject extension KExpressionsCompareExtensions
    
    public static val GENERATED_PREFIX = "_"
    
    public static val ID = "de.cau.cs.kieler.sccharts.processors.inheritance"
    
    private val lateInheritanceBindings = <Scope, List<Binding>>newHashMap
    
    override getId() {
        ID
    }
    
    override getName() {
        "Inheritance"
    }
    
    override process() {
        for(rootState : new ArrayList<State>(model.rootStates)) {
            rootState.inheritBaseStates(new Replacements)
        }
    }
    
    def inheritBaseStates(State state, Replacements rootReplacements) {
        if (!state.baseStateReferences.nullOrEmpty) {
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
                    if (!container.baseStateReferences.nullOrEmpty) {
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
            
            
            // Handle explicit binding and generic params
            val bindingReplacements = <ValuedObject, Expression>newHashMap
            // Bound upstream
            if (rootReplacements !== null) {
                for (name : rootReplacements.keySet) {
                    if (voNames.containsKey(name)) {
                        for (vo : voNames.get(name)) {
                            bindingReplacements.put(vo, rootReplacements.peek(name))
                        }
                    }
                }
            }
            val typeReplacements = <ValuedObject, Expression>newHashMap
            // Bound upstream
            if (rootReplacements !== null) {
                for (param : state.genericParameterDeclarations) {
                    val vo = param.valuedObjects.head
                    if (param.isTypeDeclaration) {
                        if (rootReplacements.typeReplacements.containsKey(vo)) {
                            typeReplacements.put(vo, rootReplacements.typeReplacements.get(vo.name))
                        }
                    } else if (rootReplacements.containsKey(vo)) {
                        bindingReplacements.put(vo, rootReplacements.peek(vo))
                    }
                }
            }
            // Bound in hierarchy
            for (baseRef : state.getAllInheritedStatesReferencesHierachically) {
                // IO binding parameters
                if (!baseRef.parameters.nullOrEmpty) {
                    val bindings = baseRef.target.createBindings(baseRef.parameters, new Replacements, newHashMap)
                    for (binding : bindings) {
                        val target = replacements.get(binding.targetValuedObject)?:binding.targetValuedObject
                        if (bindingReplacements.containsKey(target)) { // Already bound
                            environment.warnings.add("Explicit binding in inheritance hierachy (%s -> %s) was overridden by a higher level one (%s -> %s).".format(
                                binding.targetValuedObject.name,
                                binding.sourceExpression.toString, 
                                binding.targetValuedObject.name,
                                bindingReplacements.get(target).toString
                            ))
                        } else {
                            var replacement = binding.sourceExpression.copy
                            if (replacement instanceof ValuedObjectReference) {
                                if (replacements.containsKey((replacement as ValuedObjectReference).valuedObject)) {
                                    (replacement as ValuedObjectReference).valuedObject = replacements.get((replacement as ValuedObjectReference).valuedObject)
                                }
                                if (bindingReplacements.containsKey(replacement.valuedObject)) {
                                    replacement = bindingReplacements.get(replacement.valuedObject)
                                }
                            }
                            replacement.replaceVOR(replacements)
                            bindingReplacements.put(target, replacement)
                        }
                    }
                }
                // generic paramters
                if (!baseRef.genericParameters.nullOrEmpty) {
                    val gBindings = baseRef.createGenericParameterBindings()
                    for (binding : gBindings) {
                        val target = binding.targetValuedObject
                        if (binding.errorMessages.empty) {
                            var replacement = binding.sourceExpression.copy
                            replacement.replaceVOR(replacements)
                            if (binding.type === BindingType.GENERIC_TYPE) {
                                // relsolve
                                while (replacement instanceof ValuedObjectReference
                                    && (replacement as ValuedObjectReference).valuedObject !== null
                                    && typeReplacements.containsKey((replacement as ValuedObjectReference).valuedObject)) {
                                    replacement = typeReplacements.get((replacement as ValuedObjectReference).valuedObject)
                                }
                                if (typeReplacements.containsKey(target)) {
                                    val bound = typeReplacements.get(target)
                                    if (bound !== replacement) {
                                        environment.errors.add("Conflicting generic parameters. Type paramter %s of %s was already set to %s and cannot be set to %s".format(
                                            target.name,
                                            baseRef.target.name, 
                                            bound.toString,
                                            replacement.toString
                                        ))
                                    }
                                } else {
                                    typeReplacements.put(target, replacement)
                                }
                            } else {
                                // relsolve
                                while (replacement instanceof ValuedObjectReference
                                    && (replacement as ValuedObjectReference).valuedObject !== null
                                    && (bindingReplacements.containsKey((replacement as ValuedObjectReference).valuedObject)
                                     || rootReplacements?.containsKey((replacement as ValuedObjectReference).valuedObject))) {
                                    if (bindingReplacements.containsKey((replacement as ValuedObjectReference).valuedObject)) {
                                        replacement = bindingReplacements.get((replacement as ValuedObjectReference).valuedObject)
                                    } else if (rootReplacements?.containsKey((replacement as ValuedObjectReference).valuedObject)) {
                                        replacement = rootReplacements.peek((replacement as ValuedObjectReference).valuedObject)
                                    }
                                }
                                if (bindingReplacements.containsKey(target)) {
                                    val bound = bindingReplacements.get(target)
                                    if (bound !== replacement) {
                                        environment.errors.add("Conflicting generic parameters. Binding Paramter %s of %s was already set to %s and cannot be set to %s".format(
                                            target.name,
                                            baseRef.target.name, 
                                            bound.toString,
                                            replacement.toString
                                        ))
                                    }
                                } else {
                                    bindingReplacements.put(target, replacement)
                                }
                            }
                        } else {
                            environment.errors.add("Errornous generic parameter. Paramter %s of %s was not set correcly. %s".format(
                                target?.name,
                                baseRef.target.name,
                                binding.errorMessages.join("\n")
                            ))
                        }
                    }
                }
            }
            // Save bindings in case we need them for later overriding (super reference)
            // TODO support scoping
            val laterBinding = newArrayList
            laterBinding += bindingReplacements.entrySet.map[e | new Binding() => [targetValuedObject = e.key; sourceExpression = e.value]]
            laterBinding += typeReplacements.entrySet.map[e | new Binding() => [type = BindingType.GENERIC_TYPE; targetValuedObject = e.key; sourceExpression = e.value]]
            lateInheritanceBindings.put(state, laterBinding)
            // Replace bound VOs
            for (vor : state.eAllContents.filter(ValuedObjectReference).filter[!it.isSubReference].toIterable) {
                // replace with binding
                var Expression replacement
                if (bindingReplacements.containsKey(vor.valuedObject)) {
                    replacement = bindingReplacements.get(vor.valuedObject).copy
                } else if (rootReplacements !== null && rootReplacements.containsKey(vor.valuedObject)) {
                    replacement = rootReplacements.peek(vor.valuedObject)
                    replacement.replaceVOR(replacements)
                }
                if (replacement !== null) {
                    if (replacement instanceof ValuedObjectReference) {
                        vor.valuedObject = replacement.valuedObject
                        vor.indices.addAll(0, replacement.indices)
                        if (replacement.subReference !== null) {
                            replacement.lowermostReference.subReference = vor.subReference
                            vor.subReference = replacement.subReference
                        }
                        if (vor.subReference !== null) {
                            vor.subReference.fixMemberReferenceIfParentChanged(true)
                        }
                    } else if (replacement instanceof Value) {
                        vor.replace(replacement)
                    } else {
                        // If there is an unknown replacement, report an error.
                        environment.errors.add("A binding for the valued object reference \"" + vor.valuedObject.name + 
                            "\" exists, but the type \"" + replacement.class.getName + "\" is not supported.", vor, true)
                    }
                }
            }
            // Clean up
            for (vo : bindingReplacements.keySet) {
                // remove bound VOs
                val decl = vo.declaration
                if (!(decl instanceof GenericParameterDeclaration)) {
                    vo.remove
                    voStore.remove(vo)
                    if (decl.valuedObjects.empty) decl.remove
                }
            }
            // Replace bound types
            // TODO support inheriting from generic type
            val referencesDecls = newDecls.filter(ReferenceDeclaration).filter[reference !== null]
            for (refDecl : referencesDecls) {
                if (refDecl.reference.isGenericParamter) {
                    val typeExpr = typeReplacements.get((refDecl.reference as ValuedObject))
                    if (typeExpr instanceof GenericTypeReference) {
                        if (typeExpr.type instanceof Scope) {
                            refDecl.reference = typeExpr.type
                            if (!typeExpr.genericParameters.empty) {
                                if (refDecl.genericParameters.empty) {
                                    refDecl.genericParameters += typeExpr.genericParameters.map[copy]
                                } else {
                                    environment.errors.add("Conflicting generic parameters passed to reference declaration of %s via generic type and in declaration.".format(refDecl.valuedObjects.map[name].join("/")), state, true)
                                }
                            }
                        }
                    } else if (typeExpr instanceof ValueTypeReference) {
                        val vDecl = createVariableDeclaration(typeExpr.valueType)
                        vDecl.valuedObjects += refDecl.valuedObjects
                        vDecl.access = refDecl.access
                        refDecl.replace(vDecl)
                    }
                }
            }
            state.genericParameterDeclarations.clear
            
            // remove base states
            state.baseStateReferences.clear
            
            snapshot
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
    
    def List<Binding> getBindingsOfPreviousInheritance(Scope scopeWithReference) {
        if (scopeWithReference !== null && scopeWithReference.isReferencingScope && scopeWithReference.reference.^super) {
            var parent = scopeWithReference.eContainer
            while (parent instanceof Scope) {
                if (lateInheritanceBindings.containsKey(parent)) {
                    return lateInheritanceBindings.get(parent)
                } else {
                    parent = parent.eContainer
                }
            }
        }
        emptyList
    }
}
