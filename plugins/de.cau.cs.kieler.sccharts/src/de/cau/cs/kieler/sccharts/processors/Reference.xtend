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

import com.google.common.collect.Iterables
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.AccessModifier
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.GenericTypeReference
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.SpecialAccessExpression
import de.cau.cs.kieler.kexpressions.ThisExpression
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValueTypeReference
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.VectorValue
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsGenericParameterExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kexpressions.kext.extensions.BindingType
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.Replacements
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.CodeEffect
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsInheritanceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsReferenceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.processors.dataflow.Dataflow
import de.cau.cs.kieler.scl.Conditional
import de.cau.cs.kieler.scl.Loop
import de.cau.cs.kieler.scl.MethodImplementationDeclaration
import de.cau.cs.kieler.scl.Return
import java.util.Set

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import static extension java.lang.String.format

/**
 * Give me a state, Vasili. One state only please.
 * https://www.youtube.com/watch?v=jr0JaXfKj68
 * 
 * @author ssm
 * @kieler.design 2017-07-18 proposed
 * @kieler.rating 2017-07-18 proposed yellow  
 */
class Reference extends SCChartsProcessor implements Traceable {
    
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsGenericParameterExtensions
    @Inject extension KExtDeclarationExtensions    
    @Inject extension SCChartsScopeExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCChartsReferenceExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsCoreExtensions
    @Inject extension SCChartsInheritanceExtensions
    @Inject extension KExpressionsCreateExtensions
    extension SCChartsFactory = SCChartsFactory.eINSTANCE
    
    public static val IProperty<Boolean> EXPAND_REFERENCED_STATES = 
        new Property<Boolean>("de.cau.cs.kieler.sccharts.reference.expandStates", true)
    public static val IProperty<Boolean> RENAME_SHADOWED_VARIABLES = 
        new Property<Boolean>("de.cau.cs.kieler.sccharts.reference.renameShadowsVariables", true)      
    public static val IProperty<String> VARIABLE_RENAME_PREFIX =
        new Property<String>("de.cau.cs.kieler.sccharts.reference.variableRenamePrefix", "_")      
    public static val IProperty<String> VARIABLE_RENAME_SUFFIX =
        new Property<String>("de.cau.cs.kieler.sccharts.reference.variableRenameSuffix", "_")

    public static val REF_CLASS_ORIGIN = "classOrigin"
    
    protected var Dataflow dataflowProcessor = null
    protected var Inheritance inheritanceProcessor = null
    protected var StaticAccess staticAccessProcessor = null
    protected var Enum enumProcessor = null
    protected var MethodSignaling methodSignalingProcessor = null
    
    protected val replacedWithLiterals = <ValuedObject> newHashSet
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.reference"
    }
    
    override getName() {
        "Reference Expansion"
    }
    
    override process() {
        replacedWithLiterals.clear
        dataflowProcessor = KiCoolRegistration.getProcessorInstance(Dataflow.ID) as Dataflow
        dataflowProcessor?.setEnvironment(sourceEnvironment, environment)
        inheritanceProcessor = KiCoolRegistration.getProcessorInstance(Inheritance.ID) as Inheritance
        inheritanceProcessor?.setEnvironment(sourceEnvironment, environment)
        staticAccessProcessor = KiCoolRegistration.getProcessorInstance(StaticAccess.ID) as StaticAccess
        staticAccessProcessor?.setEnvironment(sourceEnvironment, environment)
        enumProcessor = KiCoolRegistration.getProcessorInstance(Enum.ID) as Enum
        enumProcessor?.setEnvironment(sourceEnvironment, environment)
        methodSignalingProcessor = KiCoolRegistration.getProcessorInstance(MethodSignaling.ID) as MethodSignaling
        methodSignalingProcessor?.setEnvironment(sourceEnvironment, environment)
        
        val model = getModel
        
        // Process root states depending on expansion is triggered or not.
        val rootStateList = if (environment.getProperty(EXPAND_REFERENCED_STATES)) {
            newArrayList(model.rootStates.head)
        } else {
            model.rootStates.immutableCopy
        }
        
        for(rootState : rootStateList) {
            rootState.expandRoot(null, true)
            enumProcessor?.consolidateEnumDeclarations(rootState)
        }
        
        if (environment.getProperty(EXPAND_REFERENCED_STATES)) {
            val firstRoot = model.rootStates.head
            model.rootStates.removeIf[ it !== firstRoot ]
            
            model.imports.clear
        }
    }
    
    protected def void expandRoot(State rootState, Replacements replacements, boolean validate) {
        // Handle inheritance
        val statesWithInheritance = rootState.allContainedStates.filter[ !baseStateReferences.nullOrEmpty ].toList
        for (state : statesWithInheritance) {
            inheritanceProcessor?.inheritBaseStates(state, replacements)
        }
        inheritanceProcessor?.inheritBaseStates(rootState, replacements)
        
        // Handle method signaling here because it is easier than a standalone transformation
        methodSignalingProcessor?.transform(rootState)

        // Bind generic parameters
        if (!rootState.genericParameterDeclarations.nullOrEmpty) {
            if (replacements === null || (replacements.empty && replacements.typeReplacements.empty)) {
                environment.errors.add("A root SCChart cannot have unbound generic parameters.", rootState, true)
            } else {
                // Replace generic types
                rootState.replaceGenericTypeParametersInState(replacements)
                // Replace generic VOs
                rootState.replaceValuedObjectReferencesInState(replacements, false)
                
                // Remove generics
                rootState.genericParameterDeclarations.clear
            }
        }
        
        // Handle references
        if (environment.getProperty(EXPAND_REFERENCED_STATES)) {
            val statesWithReferences = rootState.allContainedStates.filter[isReferencing && isModuleExpansionReference].toList
            val regionsWithReferences = rootState.allContainedRegions.filter[isReferencing].toList
            
            for (state : statesWithReferences) {
                state.expandReferencedScope(new Replacements(replacements))
            }
            for (region : regionsWithReferences) {
                region.expandReferencedScope(new Replacements(replacements))
            }
        }
        
        if (dataflowProcessor !== null) {
            // Optimize this.
            dataflowProcessor.processState(rootState)
            // Handle reference declarations not handled by dataflow
            rootState.handleSCChartsDatatype(replacements)
            
            if (environment.getProperty(EXPAND_REFERENCED_STATES)) {
                val statesWithReferences2 = rootState.getAllContainedStates.filter[isReferencing && isModuleExpansionReference].toList
                val regionsWithReferences2 = rootState.allContainedRegions.filter[isReferencing].toList
                for (state : statesWithReferences2) {
                    state.expandReferencedScope(new Replacements(replacements))
                }
                for (region : regionsWithReferences2) {
                    region.expandReferencedScope(new Replacements(replacements))
                }
            }
        }
        
        staticAccessProcessor?.handleStaticAccesses(rootState)
        
        if (validate && !rootState.validate) {
            throw new IllegalStateException("References objects are not contained in the resource!")
        }
    }
    
    /** Expands one referenced state and keeps track of the replacement stack. */
    protected def void expandReferencedScope(Scope scopeWithReference, Replacements replacements) {
        // Check target scope
        if (!scopeWithReference.isReferencingScope) {
            environment.errors.add("Invalid reference " + scopeWithReference.reference.target.name
                + "! Only States/Regions can be instantiated.", scopeWithReference, true)
            return
        }
        
        // Create the new scope via copy. All internal references are ok. However, you must correct the bindings now.
        val newScope = scopeWithReference.reference.scope.copy.asScope => [ 
            name = scopeWithReference.name 
            label = scopeWithReference.label
            if (scopeWithReference instanceof State) {
                (it as State).initial = scopeWithReference.initial;
                (it as State).final = scopeWithReference.final
            }
            for (annotation : scopeWithReference.annotations) {
                 it.annotations += annotation.copy
            }
        ]
        
        if (newScope instanceof State) {
            // Inherit from base states
            inheritanceProcessor?.inheritBaseStates(newScope, replacements)
        }
        
        // Push all declarations of the state with the reference onto the replacement stack and search for
        // similar valued objects in the copy.  
        for (valuedObject : scopeWithReference.declarations.map[ valuedObjects ].flatten) {
            replacements.push(valuedObject, newScope.findValuedObjectByName(valuedObject.name).reference)
        }
        
        val bindings = if (scopeWithReference.reference.^super) {
            // Assumption: super only in overriding regions
            inheritanceProcessor?.getBindingsOfPreviousInheritance(scopeWithReference)?:emptyList
        } else {
            scopeWithReference.createBindings(replacements)
        }
        for (binding : bindings) {
            if (binding.errors > 0) {
                environment.errors.add("There are binding errors in a referenced state!\n" + 
                    binding.errorMessages.join("\n"),
                    scopeWithReference, true)
            } else if (binding.type === BindingType.GENERIC_TYPE) {
                replacements.typeReplacements.put(binding.targetValuedObject.name, binding.sourceExpression)
            } else if (!scopeWithReference.reference.^super || !replacements.containsKey(binding.targetValuedObject)){ // if binding is super binding, only register in replacements if VO does not exits there yet
                // TODO: target indices not supported yet
                replacements.push(binding.targetValuedObject, binding.sourceExpression)
            }
        }
        
        // If the output declarations have initialization parts, add them as entry actions because
        // the declaration will be removed at the end of the transformation.
        for (initialization : newScope.declarations.filter(VariableDeclaration).filter[ output ].map[ valuedObjects ].
            flatten.filter[ initialValue !== null ]) {
            newScope.createEntryAction.effects += initialization.createAssignment(initialization.initialValue)                            
        }
        
        if (newScope instanceof State) {
            // Replace generic types
            newScope.replaceGenericTypeParametersInState(replacements)
            // Remove generics
            newScope.genericParameterDeclarations.clear
            
            // Correct all valued object references in the new state.
            newScope.resolveNameClashes(scopeWithReference, replacements)
            newScope.replaceValuedObjectReferencesInState(replacements, true)
            
    
            // Add the new state to the parent region, correct all transitions, and finally remove the original 
            // referenced state.        
            val parent = scopeWithReference.eContainer as ControlflowRegion
            parent.states.add(newScope)
            for (transition : (scopeWithReference as State).outgoingTransitions.immutableCopy) {
                transition.sourceState = newScope
            }
            for (transition : (scopeWithReference as State).incomingTransitions.immutableCopy) {
                transition.targetState = newScope
            }
            scopeWithReference.remove
        } else if (newScope instanceof Region) {
            // Correct all valued object references in the new state.
            newScope.resolveNameClashes(scopeWithReference, replacements)
            newScope.replaceValuedObjectReferences(replacements, true)        
    
            // Add the new state to the parent region, correct all transitions, and finally remove the original 
            // referenced state.        
            val parent = scopeWithReference.eContainer as State
            parent.regions.add(newScope)
            scopeWithReference.remove
        }
        
        
        // Remove the input/output declarations from the new state. They should be bound by now.
        newScope.declarations.removeIf[ input || output ]
        // Add the new variables names to the name set.
        
        snapshot

        // Transform any dataflow regions via the dataflow co-processors.        
        if (dataflowProcessor !== null) {
            val processState = if (newScope instanceof Region) newScope.eContainer as State else newScope as State
            // Optimize this.
            dataflowProcessor.processState(processState)
            val statesWithReferences = processState.getAllContainedStates.filter[isReferencing && isModuleExpansionReference].toList
            for (state : statesWithReferences) {
                state.expandReferencedScope(new Replacements)
            }
        }
    }
    
    /** Replace valued object reference inside the given scope. */
    protected def void replaceValuedObjectReferences(Scope scope, Replacements replacements, boolean expand) {
        // Push this scopes variables onto the replacement stack.
        val valuedObjects = scope.declarations.map[ valuedObjects ].flatten.toList
        for (valuedObject : valuedObjects) {
            replacements.push(valuedObject, valuedObject.reference)
        }
        
        // For each type, call the appropriate method.
        switch(scope) {
            Region: scope.replaceValuedObjectReferencesInRegion(replacements, expand)
            State: scope.replaceValuedObjectReferencesInState(replacements, expand)
        }
        
        // Pop this scopes variables from the replacement stack.
        for (valuedObject : valuedObjects) {
            replacements.pop(valuedObject)
        }
    }
    
    /** Replaces valued object references inside the given state. */
    protected def replaceValuedObjectReferencesInState(State state, Replacements replacements, boolean expand) {
        // Handle refereces in declarations
        for (decl : state.declarations.immutableCopy) {
            decl.replaceValuedObjectReferencesInDeclaration(replacements)
        }
        
        // Delegate actions, trigger and effects. Remember: Transitions are also actions within another 
        // attribute of the class.
        for (action : state.actions + state.outgoingTransitions) {
            action.replaceValuedObjectReferencesInAction(replacements)
        }

        // If the state is also a referenced state, process the parameters and expand this state, too.
        // Do this with the actual replacement stack.        
        if (state.reference !== null) {
            for (parameter : state.reference.parameters) {
                parameter.replaceReferences(replacements)
            }
            if (expand) {
                state.expandReferencedScope(new Replacements(replacements))
            }
        }
        
        // Delegate the region replacement.
        for (region : state.regions) {
            region.replaceValuedObjectReferences(replacements, expand)
        }
    }
    
    /** Replaces valued object references inside the given region. */
    protected def replaceValuedObjectReferencesInRegion(Region region, Replacements replacements, boolean expand) {
        // Handle refereces in declarations
        for (decl : region.declarations.immutableCopy) {
            decl.replaceValuedObjectReferencesInDeclaration(replacements)
        }
        
        // Delegate actions, trigger and effects. Remember: Transitions are also actions within another 
        // attribute of the class.
        for (action : region.actions) {
            action.replaceValuedObjectReferencesInAction(replacements)
        }

        // If the state is also a referenced state, process the parameters and expand this state, too.
        // Do this with the actual replacement stack.        
        if (region.reference !== null) {
            for (parameter : region.reference.parameters) {
                parameter.replaceReferences(replacements)
            }
            if (expand) {
                region.expandReferencedScope(new Replacements(replacements))
            }
        }
        
        if (region instanceof ControlflowRegion) {
            for (state : region.states.immutableCopy) {
                state.replaceValuedObjectReferences(replacements, expand)
            }
        } else if (region instanceof DataflowRegion) {
            for (equation: region.equations.immutableCopy) {
                equation.replaceReferences(replacements)   
            }
        }
    }
    
    /** Replaces valued object references inside the given action. */
    protected def replaceValuedObjectReferencesInAction(Action action, Replacements replacements) {
        action.trigger?.replaceReferences(replacements)
        for (effect : action.effects) {
            effect.replaceReferences(replacements)
        }
    }
    
    /** Replaces valued object references inside declarations. */
    protected def replaceValuedObjectReferencesInDeclaration(Declaration decl, Replacements replacements) {
        if (decl instanceof MethodImplementationDeclaration) {
            decl.replaceValuedObjectReferencesInSclScope(replacements)
        }
        for (vo : decl.valuedObjects) {
            // Handle cardinalities
            for (cardinal : vo.cardinalities.filterNull) {
                cardinal.replaceReferences(replacements)
            }
            if (vo.initialValue !== null) {
                vo.initialValue.replaceReferences(replacements)
            }
            for (ex : vo.genericParameters.map[expression]) {
                ex.replaceReferences(replacements)
            }
            for (ex : vo.parameters.map[expression]) {
                ex.replaceReferences(replacements)
            }
        }
    }
    
    /** Replaces generic type references inside the given state. */
    protected def replaceGenericTypeParametersInState(State state, Replacements replacements) {
        val statesWithReferences = state.allContainedStates.filter[isReferencing].toList
        for (s : statesWithReferences) {
            if (s.reference.target.isGenericParamter) {
                val typeExpr = replacements.typeReplacements.get(s.reference.target.name)
                if (typeExpr instanceof GenericTypeReference) {
                    if (typeExpr.type instanceof Scope) {
                        s.reference.target = typeExpr.type
                        if (!typeExpr.genericParameters.empty) {
                            if (s.reference.genericParameters.empty) {
                                s.reference.genericParameters += typeExpr.genericParameters.map[copy]
                            } else {
                                environment.errors.add("Conflicting generic parameters passed to scope call in %s via generic type and in call.".format(s.name), s, true)
                            }
                        }
                    }
                }
            }
        }
        val referencesDecls = state.allScopes.map[
            declarations.filter(ReferenceDeclaration).filter[reference !== null].iterator
        ].flatten.toList
        for (refDecl : referencesDecls) {
            if (refDecl.reference.isGenericParamter) {
                val typeExpr = replacements.typeReplacements.get((refDecl.reference as ValuedObject).name)
                if (typeExpr instanceof GenericTypeReference) {
                    if (typeExpr.type instanceof Scope) {
                        refDecl.reference = typeExpr.type
                        if (!typeExpr.genericParameters.empty) {
                            if (refDecl.genericParameters.empty) {
                                refDecl.genericParameters += typeExpr.genericParameters.map[copy]
                            } else {
                                environment.errors.add("Conflicting generic parameters passed to reference declaration of %s via generic type and in declaration.".format(refDecl.valuedObjects.map[name].join("/")), refDecl.nextScope, true)
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
    }
    
    /** Replaces valued object references inside scope from scl (due to methods). */
    protected def void replaceValuedObjectReferencesInSclScope(de.cau.cs.kieler.scl.Scope scope, Replacements replacements) {
        val VOs = <ValuedObject>newArrayList
        // Push this scopes variables onto the replacement stack.
        if (scope instanceof Conditional) {
            scope.expression.replaceReferences(replacements)
        } else if (scope instanceof MethodImplementationDeclaration) {
            VOs += scope.parameterDeclarations.map[valuedObjects].flatten.toList
        } else if (scope instanceof Loop) {
            if (scope.initializationDeclaration !== null) {
                VOs += scope.initializationDeclaration.valuedObjects
            }
        }
        VOs += scope.declarations.map[valuedObjects].flatten.toList
        for (valuedObject : VOs) {
            replacements.push(valuedObject, valuedObject.reference)
        }
        
        if (scope instanceof Loop) {
            scope.initialization?.replaceReferences(replacements)
            scope.initializationDeclaration?.valuedObjects?.head?.initialValue?.replaceReferences(replacements)
            scope.condition?.replaceReferences(replacements)
            scope.afterthought?.replaceReferences(replacements)
        }
        
        // Process statements
        for (stm : scope.statements) {
            if (stm instanceof de.cau.cs.kieler.scl.Scope) {
                stm.replaceValuedObjectReferencesInSclScope(replacements)
            } else if (stm instanceof de.cau.cs.kieler.scl.Assignment) {
                stm.replaceReferences(replacements)
            } else if (stm instanceof Return) {
                stm.expression?.replaceReferences(replacements)
            }
        }
        
        // Pop this scopes variables from the replacement stack.
        for (valuedObject : VOs) {
            replacements.pop(valuedObject)
        }
        
        // Process else scope in conditional
        if (scope instanceof Conditional) {
            scope.^else?.replaceValuedObjectReferencesInSclScope(replacements)
        }
    }
    
    /** Replace valued object references inside a valued object reference. */
    protected dispatch def void replaceReferences(ValuedObjectReference valuedObjectReference, Replacements replacements) {
        // Check if there is a replacement on the stack. 
        val newRef = replacements.peek(valuedObjectReference.valuedObject)
        if (newRef !== null) {
            if (newRef instanceof ValuedObjectReference) {
                // If there is a replacement and it is a valued object reference, re-set the target of the 
                // valued object reference.
                // Also process the indices. It's possible the valued object reference is a reference to an array. 
                valuedObjectReference.valuedObject = (newRef as ValuedObjectReference).valuedObject
                for (index : valuedObjectReference.indices) {
                    index.replaceReferences(replacements)
                }

                // If the binding is an array reference, add the references to the valued object reference.                
                if (!newRef.indices.empty && valuedObjectReference.indices.empty) {
                    valuedObjectReference.indices.clear
                    for (index : newRef.indices) {
                        if (index instanceof Value) {
                            valuedObjectReference.indices += index.copy  
                        } else {
                            val vor = index.copy
                            vor.replaceReferences(replacements)
                            valuedObjectReference.indices += vor
                        } 
                    }
                }
                
                if (newRef.subReference !== null) {
                    val subRef = newRef.subReference.copy
                    subRef.lowermostReference.subReference = valuedObjectReference.subReference
                    valuedObjectReference.subReference = subRef
                }
                if (valuedObjectReference.subReference !== null) {
                    valuedObjectReference.subReference.replaceReferences(replacements)
                }
            } else if (newRef instanceof ThisExpression) {
                if (valuedObjectReference.subReference !== null) {
                    // Replace by sub ref (implicit this)
                    val sub = valuedObjectReference.subReference
                    val rootStateOfThis = newRef.nextScope.rootState
                    val rootStateVO = rootStateOfThis.valuedObjects.findFirst[it.name.equals(sub.valuedObject.name)]
                    
                    valuedObjectReference.valuedObject = rootStateVO !== null ? rootStateVO : sub.valuedObject

                    valuedObjectReference.indices.clear
                    valuedObjectReference.indices += sub.indices
                    for (index : valuedObjectReference.indices) {
                        index.replaceReferences(replacements)
                    }
                    
                    valuedObjectReference.schedule += sub.schedule
                    
                    valuedObjectReference.subReference = sub.subReference
                    if (valuedObjectReference.subReference !== null) {
                        valuedObjectReference.subReference.replaceReferences(replacements)
                    }
                } else {// Remove VOR entirely
                    valuedObjectReference.remove
                }
            } else if (newRef instanceof Value) {
                // If the replacement is a literal, delegate.
                valuedObjectReference.replaceReferenceWithLiteral(newRef)
            } else {
                // If there is an unknown replacement, report an error.
                environment.errors.add("A binding for the valued object reference \"" + valuedObjectReference.valuedObject.name + 
                    "\" exists, but " + 
                    "the type \"" + newRef.class.getName + "\" is not supported.", valuedObjectReference, true)
            }
        } else {
            // Even if there is no replacement, process the indices. 
            for (index : valuedObjectReference.indices) {
                index.replaceReferences(replacements)
            }
            // Try to fix sub reference if no longer contained in parent
            valuedObjectReference.fixMemberReferenceIfParentChanged(false)
            // Process further sub refs
            if (valuedObjectReference.subReference !== null) {
                valuedObjectReference.subReference.replaceReferences(replacements)
            }
        }
    }
    
    /** Replaces a valued object reference with a literal. */
    protected def void replaceReferenceWithLiteral(ValuedObjectReference valuedObjectReference, Value value) {
        val valuedObject = valuedObjectReference.valuedObject
        if (replacedWithLiterals.contains(valuedObject)) return;
        val oldDeclaration = valuedObject.variableDeclaration
        if (oldDeclaration !== null) {
            val newDeclaration = createVariableDeclaration(oldDeclaration.type)
            // The literal never changes, thus this new declaration could be set as const.
            // However, the user could decide to prefer a variable for readability.
            // Thus, we only declare it const if the old declaration was declared as const.
            newDeclaration.const = oldDeclaration.isConst
            oldDeclaration.eContainer.asScope.declarations += newDeclaration
            newDeclaration.valuedObjects += valuedObject
            valuedObject.initialValue = value.copy   
            replacedWithLiterals += valuedObject
        } else {
            valuedObjectReference.replace(value.copy)
        }
    }
    
    /** Delegates the replacement to the sub expressions of an operator expression */
    protected dispatch def void replaceReferences(OperatorExpression operatorExpression, Replacements replacements) {
        for (subExpression : operatorExpression.subExpressions) {
            subExpression.replaceReferences(replacements)
        }
    }
    
    protected dispatch def void replaceReferences(VectorValue vectorValue, Replacements replacements) {
        for(value : vectorValue.values) {
            value.replaceReferences(replacements)
        }
    }    
    
    /** Literals will not be replaced. */
    protected dispatch def void replaceReferences(Value value, Replacements replacements) {
        // do nothing
    }
    
    /** StaticAccessExpression will not be replaced. */
    protected dispatch def void replaceReferences(SpecialAccessExpression ex, Replacements replacements) {
        // do nothing, do not bind, resolved later
    }
    
    /** Expression types that do not have dedicated dispatch methods will be ignored. */
    protected dispatch def void replaceReferences(Expression expression, Replacements replacements) {
        environment.warnings.add("The expression type \"" + expression.class.name + 
            "\" is unknown to the reference transformation. It is ignored.", expression, true)
    }

    /** Replace valuzed object references in assignments. */
    protected dispatch def void replaceReferences(Assignment assignment, Replacements replacements) {
        // Delegate the expression replacement.
        assignment.expression?.replaceReferences(replacements)
        
        // Check if there is a replacement.
        val newRef = replacements.peek(assignment.valuedObject)
        if (newRef !== null) {
            if (newRef instanceof ValuedObjectReference) { 
                assignment.valuedObject = newRef.valuedObject
                if (assignment.indices.empty && !newRef.indices.empty) {
                    // Array indices were bound to a scalar. Add the right indices.
                    for (index : newRef.indices) {
                        if (index instanceof Value) {
                            assignment.indices += index.copy  
                        } else {
                            val vor = index.copy
                            vor.replaceReferences(replacements)
                            assignment.indices += vor
                        } 
                    }
                } else {
                    // The assign already assigned to an array. Just fix the references.
                    for (index : assignment.indices) {
                        index.replaceReferences(replacements)
                    }     
                }
            } else {
                environment.errors.add("A binding for the valued object \"" + assignment.valuedObject.name + 
                    "\" in an assignment exists, but is not another valued object.\n" + 
                    "The type \"" + newRef.class.getName + "\" is not supported.", assignment, true)
            }
        } else {
            // The valued object itself is not bound. However, the indices could be; transform.
            for (index : assignment.indices) {
                index.replaceReferences(replacements)
            }     
        }
    }
    
    /** Replace valued object references in emissions. */
    protected dispatch def void replaceReferences(Emission emission, Replacements replacements) {
        // Delegate value processing.
        emission.newValue?.replaceReferences(replacements)
        
        // Check if there is a replacement.
        val newRef = replacements.peek(emission.valuedObject)
        if (newRef !== null) {
            if (newRef instanceof ValuedObjectReference) { 
                emission.valuedObject = (newRef as ValuedObjectReference).valuedObject
            } else {
                environment.errors.add("A binding for the valued object \"" + emission.valuedObject.name + 
                    "\" in an emission exists, but is not another valued object.\n" + 
                    "The type \"" + newRef.class.getName + "\" is not supported.", emission, true)
            }
        }        
    }
    
    /** Delegate parameter expression and explicit bindings. */
    protected dispatch def void replaceReferences(Parameter parameter, Replacements replacements) {
        parameter.expression.replaceReferences(replacements)
        for(index : parameter.explicitBindingIndices) {
            index.replaceReferences(replacements)   
        }
    }
    
    /** Replace parameters of reference calls if necessary. */
    protected dispatch def void replaceReferences(ReferenceCall referenceCall, Replacements replacements) {
        (referenceCall as ValuedObjectReference)._replaceReferences(replacements) // Bypass dispatch to prevent infinite recursion
        for (parameter : referenceCall.parameters) {
            parameter.replaceReferences(replacements)
        }
    }
    
    /** Handle Code Effect. */
    protected dispatch def void replaceReferences(CodeEffect code, Replacements replacements) {
        code.replaceValuedObjectReferencesInSclScope(replacements)       
    }
    
    
    protected def void resolveNameClashes(Scope scope, Scope oldScope, Replacements replacements) {
        if (!environment.getProperty(RENAME_SHADOWED_VARIABLES))
            return;
            
        val VOs = scope.eAllContents.filter(Declaration).filter[ !input && !output ].map[ valuedObjects ].toIterable.flatten.toList
//        val replacementVONames = replacements.values.filter(Stack).map[ it.head ].
//            filter(ValuedObjectReference).map[ valuedObject ].map[ name ].toSet
        
        val replacementVONames = oldScope.eContainer.asScope.getAllReservedVariableNames
        
        for (vo : VOs) {
            if (replacementVONames.contains(vo.name)) {
                val newNameBase = environment.getProperty(VARIABLE_RENAME_PREFIX) + vo.name +  
                    environment.getProperty(VARIABLE_RENAME_SUFFIX)
                var newName = newNameBase
                var index = 2
                while(replacementVONames.contains(newName)) {
                    newName = newNameBase + index
                    index++
                }
                vo.name = newName    
            }
        }        
    }
    
    private def Set<String> getAllReservedVariableNames(Scope scope) {
        val reserved = scope.declarations.map[ valuedObjects ].flatten.map[ name ].toSet
        if (scope.eContainer !== null && scope.eContainer instanceof Scope) {
            reserved.addAll(scope.eContainer.asScope.getAllReservedVariableNames)
        }
        return reserved
    }
    
    /** Validate if all referenced valued object are contained in the resource.*/
    protected def boolean validate(State state) {
        var success = true
        val valuedObjects = <ValuedObject> newHashSet
        
        for (vo : state.eAllContents.filter(ValuedObject).toList) {
            valuedObjects += vo
        }
        
        for (vor : state.eAllContents.filter(ValuedObjectReference).toList) {
            if (!valuedObjects.contains(vor.valuedObject)) {
                
                var container = vor.eContainer
                while(!(container instanceof State)) {
                    container = container.eContainer
                }
                
                environment.errors.add("The valued object reference points to a valued object (" + vor.valuedObject?.name + ") that is not contained in the model!", container, true)
//                System.err.println("The valued object reference points to a valued object that is not contained in the model! " + 
//                    vor.valuedObject?.name + " " + vor + " " + (container as State).name)
                success = false
            }
        }
        
        success
    }
    
    def void handleSCChartsDatatype(State state, Replacements parentReplacements) {
        // Disable snapshots globally because while generating states for refs the snapshot results are not visible because not yet part of the root model
        val initialSnapshotsFlag = environment.getProperty(Environment.SNAPSHOTS_ENABLED)
        environment.setProperty(Environment.SNAPSHOTS_ENABLED, false)
        
        val scopesWithReferencesDecl = state.allScopes.filter[ !declarations.filter(ReferenceDeclaration).filter[reference !== null && !input].empty ].toList
        for (scope : scopesWithReferencesDecl) {
            val refs = scope.declarations.filter(ReferenceDeclaration).filter[reference !== null].toList
            refs.separateGenericTypeDependentReferenceDeclarations
            for (ref : refs) {
                var refTarget = ref.reference
                if (refTarget instanceof State) {
                    val tracedCopy = refTarget.tracedCopyAndReturnCopier
                    val newState = tracedCopy.key
                    val copier = tracedCopy.value
                    
                    // Generics binding
                    // Using head VO is ok because of previous separating
                    val replacements = new Replacements(parentReplacements)
                    val bindings = ref.valuedObjects.head.createBindings(replacements)
                    for (binding : bindings) {
                        // FIXME: Subtyping cannot be checked during compilation because some relations are already gone
                        // Assumes that the validator invalidated these model before
                        val ignoreSubtypeErrors = binding.targetValuedObject?.declaration instanceof ReferenceDeclaration
                        if (binding.errors > 0 && !ignoreSubtypeErrors) {
                            environment.errors.add("There are binding errors in a state with reference declaration of "
                                + ref.valuedObjects.map[name].join("/") + "!\n"
                                + binding.errorMessages.join("\n"), 
                                state, true)
                        } else if (binding.type === BindingType.GENERIC_TYPE) {
                            replacements.typeReplacements.put(binding.targetValuedObject.name, binding.sourceExpression)
                        } else {
                            // TODO: target indices not supported yet
                            replacements.push(binding.targetValuedObject, binding.sourceExpression)
                        }
                    }
                    
                    // Handle enums
                    for (entry : copier.entrySet) {
                        val orig = entry.key
                        if (orig instanceof Declaration) {
                            if (orig.isEnum) {
                                Enum.markCopyForConsolidation(entry.value as Declaration, orig)
                            }
                        }
                    }
                    
                    newState.expandRoot(replacements, false)
                    if (refTarget.genericParameterDeclarations.empty && refTarget.baseStateReferences.empty) {
                        // In case there are no base states or generic, the binding is not implicitly performed and must be done here
                        newState.replaceValuedObjectReferencesInState(replacements, false)
                    }
                    
                    val classDecl = createPolicyClassDeclaration => [
                        type = ValueType.CLASS
                        name = newState.name
                        valuedObjects += ref.valuedObjects
                        declarations += newState.declarations
                        annotations += newState.annotations
                    ]
                    classDecl.addStringAnnotation(REF_CLASS_ORIGIN, Iterables.concat(#[refTarget.name], refTarget.baseStates.map[name]))
                    
                    // Remove the input/output declarations from the new class. They should be bound beforehand.
                    classDecl.declarations.removeIf[ input || output ]
                    // All declarations will be public to enable access by regions that are moved outside the class
                    classDecl.declarations.forEach[ access = AccessModifier.PUBLIC ]
                    // Clear parameters
                    classDecl.valuedObjects.forEach[ parameters.clear; genericParameters.clear ]
                    
                    val classVOs = classDecl.innerValuedObjects.toSet
                    ref.replace(classDecl)
                    if (classDecl.declarations.empty) {
                        classDecl.remove
                    }
                    
                    // Fix Methods
                    // WHY ???
//                    for (method : classDecl.declarations.filter(MethodImplementationDeclaration)) {
//                        for (vor : method.eAllContents.filter(ValuedObjectReference).toIterable) {
//                            val oldDecl = vor.valuedObject.declaration
//                            if (oldDecl.eContainer instanceof State) {
//                                vor.valuedObject = classDecl.innerValuedObjects.findFirst[vor.valuedObject.name.equals(name)]
//                            }
//                        }
//                    }
                    
                    // Copy inner behavior
                    val targetContainerState = if (scope instanceof Region) {
                        scope.eContainer as State
                    } else {
                        scope as State
                    }
                    for (vo : classDecl.valuedObjects) {
                        var allCardinalities = 1
                        val maxIndices = newArrayList()
                        val nextIndices = newArrayList()
                        if (vo.array) {
                            for (car : vo.cardinalities) {
                                if (car instanceof IntValue) {
                                    allCardinalities *= car.value
                                    maxIndices += car.value
                                } else if (car instanceof ValuedObjectReference 
                                    && (car as ValuedObjectReference).valuedObject?.variableDeclaration?.const
                                    && (car as ValuedObjectReference).valuedObject.initialValue instanceof IntValue) {
                                        val value = ((car as ValuedObjectReference).valuedObject.initialValue as IntValue).value
                                        allCardinalities *= value
                                        maxIndices += value
                                } else {
                                    environment.errors.add("Can only handle reference arrays with constant cardinality", scope, true)
                                }
                                nextIndices += 0
                            }
                        }
                        for (x : 0..allCardinalities-1) {
                            // Clone regions
                            for (region : newState.regions) {
                                val newRegion = region.copy
                                newRegion.name = vo.name + (region.name?:"default")
                                for (vor : newRegion.eAllContents.filter(ValuedObjectReference).toList) {
                                    if (!(vor.eContainer instanceof ValuedObjectReference) && classVOs.contains(vor.valuedObject)) {// Not a sub reference and local variable
                                        vor.prependReferenceToReference(vo)
                                        if (vo.array) {
                                            vor.indices += nextIndices.map[createIntValue(it)]
                                        }
                                    }
                                }
                                targetContainerState.regions += newRegion
                            }
                            // Clone actions
                            for (action : newState.actions) {
                                val newAction = action.copy
                                for (vor : newAction.eAllContents.filter(ValuedObjectReference).toList) {
                                    if (!(vor.eContainer instanceof ValuedObjectReference) && classVOs.contains(vor.valuedObject)) {// Not a sub reference and local variable
                                        vor.prependReferenceToReference(vo)
                                        if (vo.array) {
                                            vor.indices += nextIndices.map[createIntValue(it)]
                                        }
                                    }
                                }
                                targetContainerState.actions += newAction
                            }
                            if (vo.array) {
                                var next = true
                                for (i : (vo.cardinalities.size-1)..0) {
                                    if (next) {
                                        nextIndices.set(i, nextIndices.get(i) + 1)
                                        if (nextIndices.get(i) >= maxIndices.get(i)) {
                                            nextIndices.set(i, 0)
                                        } else {
                                            next = false
                                        }
                                    }
                                }
                            }
                        }
                    }
                    
                    // Fix (sub) VORs
                    for (vor : state.eAllContents.filter(ValuedObjectReference).filter[classDecl.valuedObjects.contains(it.valuedObject)].toList) {
                        var sub = vor.subReference
                        while (sub !== null) {
                            val vo = sub.valuedObject
                            val parent = sub.eContainer as ValuedObjectReference
                            if (vo !== null && parent !== null) {
                                val decl = parent.valuedObject.eContainer as Declaration
                                if (decl instanceof ClassDeclaration) {
                                    // Find by name
                                    sub.valuedObject = decl.innerValuedObjects.findFirst[vo.name.equals(name)]
                                }
                            }
                            sub = sub.subReference
                        }
                    }
                    
                    if (initialSnapshotsFlag) {
                        environment.setProperty(Environment.SNAPSHOTS_ENABLED, true)
                        snapshot
                        environment.setProperty(Environment.SNAPSHOTS_ENABLED, false)
                    }
                }
            }
        }
        
        environment.setProperty(Environment.SNAPSHOTS_ENABLED, initialSnapshotsFlag)
    }

}
