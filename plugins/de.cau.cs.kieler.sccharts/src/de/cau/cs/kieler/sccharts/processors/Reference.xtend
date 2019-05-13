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
import de.cau.cs.kieler.annotations.NamedObject
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.VectorValue
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.Replacements
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsReferenceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.processors.dataflow.Dataflow
import java.util.Set

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration

/**
 * Give me a state, Vasili. One state only please.
 * https://www.youtube.com/watch?v=jr0JaXfKj68
 * 
 * @author ssm
 * @kieler.design 2017-07-18 proposed
 * @kieler.rating 2017-07-18 proposed yellow  
 */
class Reference extends SCChartsProcessor implements Traceable {
    
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExtDeclarationExtensions    
    @Inject extension SCChartsScopeExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCChartsReferenceExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsCoreExtensions
    extension SCChartsFactory = SCChartsFactory.eINSTANCE
    
    public static val IProperty<Boolean> RENAME_SHADOWED_VARIABLES = 
       new Property<Boolean>("de.cau.cs.kieler.sccharts.reference.renameShadowsVariables", true)      
    public static val IProperty<String> VARIABLE_RENAME_PREFIX =
       new Property<String>("de.cau.cs.kieler.sccharts.reference.variableRenamePrefix", "_")      
    public static val IProperty<String> VARIABLE_RENAME_SUFFIX =
       new Property<String>("de.cau.cs.kieler.sccharts.reference.variableRenameSuffix", "_")      
    
    protected var Dataflow dataflowProcessor = null
    protected var Inheritance inheritanceProcessor = null
    
    protected val replacedWithLiterals = <ValuedObject> newHashSet
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.reference"
    }
    
    override getName() {
        "Reference Expansion"
    }
    
    override process() {
        replacedWithLiterals.clear
        dataflowProcessor = KiCoolRegistration.getProcessorInstance("de.cau.cs.kieler.sccharts.processors.dataflow") as Dataflow
        dataflowProcessor?.setEnvironment(sourceEnvironment, environment)
        inheritanceProcessor = KiCoolRegistration.getProcessorInstance("de.cau.cs.kieler.sccharts.processors.inheritance") as Inheritance
        inheritanceProcessor?.setEnvironment(sourceEnvironment, environment)
        
        val model = getModel
        
        // For now, just expand the root state. Alternative methods may create different results with multiple SCCharts.
        for(rootState : newArrayList(model.rootStates.head)) {
            rootState.expandRoot
        }
        
        val firstRoot = model.rootStates.head
        model.rootStates.removeIf[it !== firstRoot]
        
        model.imports.clear
    }
    
    protected def void expandRoot(State rootState) {
        // Handle inheritance
        val statesWithInheritance = rootState.allContainedStates.filter[ !baseStates.nullOrEmpty ].toList
        
        for (state : statesWithInheritance) {
            inheritanceProcessor?.inheritBaseStates(state)
        }
        inheritanceProcessor?.inheritBaseStates(rootState)
        
        val statesWithReferences = rootState.allContainedStates.filter[ reference !== null && reference.scope !== null ].toList
        val regionsWithReferences = rootState.allContainedRegions.filter[ reference !== null && reference.scope !== null ].toList
        
        for (state : statesWithReferences) {
            state.expandReferencedScope(new Replacements)
        }
        
        for (region : regionsWithReferences) {
            region.expandReferencedScope(new Replacements)
        }
        
        if (dataflowProcessor !== null) {
            // Optimize this.
            dataflowProcessor.processState(rootState)
            // Handle reference declarations not handled by dataflow
            rootState.handleSCChartsDatatype
            
            val statesWithReferences2 = rootState.getAllContainedStates.filter[ reference !== null && reference.scope !== null ]
            val regionsWithReferences2 = rootState.allContainedRegions.filter[ reference !== null && reference.scope !== null ].toList
            for (state : statesWithReferences2.toList) {
                state.expandReferencedScope(new Replacements)
            }
            for (region : regionsWithReferences2) {
                region.expandReferencedScope(new Replacements)
            }
        }
        
        if (!rootState.validate) 
            throw new IllegalStateException("References objects are not contained in the resource!")
    }
    
    /** Expands one referenced state and keeps track of the replacement stack. */
    protected def void expandReferencedScope(Scope scopeWithReference, Replacements replacements) {
        // Create the new scope via copy. All internal references are ok. However, you must correct the bindings now.
        val newScope = scopeWithReference.reference.scope.copy.asScope => [ 
            name = scopeWithReference.name 
            label = scopeWithReference.label
            if (scopeWithReference instanceof State) {
                (it as State).initial = scopeWithReference.initial;
                (it as State).final = scopeWithReference.final
            }
            for (annotation : scopeWithReference.annotations) {
                 annotations += annotation.copy
            }
        ]
        
        if (newScope instanceof State) {
            // Inherit from base states
            inheritanceProcessor?.inheritBaseStates(newScope)
        }
        
        // Push all declarations of the state with the reference onto the replacement stack and search for
        // similar valued objects in the copy.  
        for (valuedObject : scopeWithReference.declarations.map[ valuedObjects ].flatten) {
            replacements.push(valuedObject, newScope.findValuedObjectByName(valuedObject.name).reference)
        }
        
        val bindings = scopeWithReference.createBindings(replacements)
        for (binding : bindings) {
            if (binding.errors > 0) {
                environment.errors.add("There are binding errors in a referenced state!\n" + 
                    binding.errorMessages.join("\n"), 
                    scopeWithReference, true)
            } else {
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
            // Correct all valued object references in the new state.
            newScope.resolveNameClashes(scopeWithReference, replacements)
            newScope.replaceValuedObjectReferencesInState(replacements)        
    
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
            newScope.replaceValuedObjectReferences(replacements)        
    
            // Add the new state to the parent region, correct all transitions, and finally remove the original 
            // referenced state.        
            val parent = scopeWithReference.eContainer as State
            parent.regions.add(newScope)
            scopeWithReference.remove
        }
        
        
        // Remove the input/output declarations from the new state. They should be bound by now.
        newScope.declarations.removeIf[ if (it instanceof VariableDeclaration) { input || output } else false ]
        // Add the new variables names to the name set.
        
        snapshot

        // Transform any dataflow regions via the dataflow co-processors.        
        if (dataflowProcessor !== null) {
            val processState = if (newScope instanceof Region) newScope.eContainer as State else newScope as State
            // Optimize this.
            dataflowProcessor.processState(processState)
            val statesWithReferences = processState.getAllContainedStates.filter[ reference !== null && reference.scope !== null ]
            for (state : statesWithReferences.toList) {
                state.expandReferencedScope(new Replacements)
            }
        }
    }
    
    /** Replace valued object reference inside the given scope. */
    protected def void replaceValuedObjectReferences(Scope scope, Replacements replacements) {
        // Push this scopes variables onto the replacement stack.
        val valuedObjects = scope.declarations.map[ valuedObjects ].flatten.toList
        for (valuedObject : valuedObjects) {
            replacements.push(valuedObject, valuedObject.reference)
        }
        
        // For each type, call the appropriate method.
        switch(scope) {
            Region: scope.replaceValuedObjectReferencesInRegion(replacements)
            State: scope.replaceValuedObjectReferencesInState(replacements)
        }
        
        // Pop this scopes variables from the replacement stack.
        for (valuedObject : valuedObjects) {
            replacements.pop(valuedObject)
        }
    }
    
    /** Replaces valued object references inside the given state. */
    protected def replaceValuedObjectReferencesInState(State state, Replacements replacements) {
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
            state.expandReferencedScope(replacements)
        }
        
        // Delegate the region replacement.
        for (region : state.regions) {
            region.replaceValuedObjectReferences(replacements)
        }
    }
    
    /** Replaces valued object references inside the given region. */
    protected def replaceValuedObjectReferencesInRegion(Region region, Replacements replacements) {
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
            region.expandReferencedScope(replacements)
        }
        
        if (region instanceof ControlflowRegion) {
            for (state : region.states.immutableCopy) {
                state.replaceValuedObjectReferences(replacements)
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
        }
    }
    
    /** Replaces a valued object reference with a literal. */
    protected def void replaceReferenceWithLiteral(ValuedObjectReference valuedObjectReference, Value value) {
        val valuedObject = valuedObjectReference.valuedObject
        if (replacedWithLiterals.contains(valuedObject)) return;
        val oldDeclaration = valuedObject.variableDeclaration
        val newDeclaration = createVariableDeclaration(oldDeclaration.type)
        // The literal never changes, thus this new declaration could be set as const.
        // However, the user could decide to prefer a variable for readability.
        // Thus, we only declare it const if the old declaration was declared as const.
        newDeclaration.const = oldDeclaration.isConst
        oldDeclaration.eContainer.asScope.declarations += newDeclaration
        newDeclaration.valuedObjects += valuedObject
        valuedObject.initialValue = value.copy   
        replacedWithLiterals += valuedObject
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
        for (parameter : referenceCall.parameters) {
            parameter.replaceReferences(replacements)
        }        
    }
    
    
    protected def void resolveNameClashes(Scope scope, Scope oldScope, Replacements replacements) {
        if (!environment.getProperty(RENAME_SHADOWED_VARIABLES))
            return;
            
        val VOs = scope.eAllContents.filter(VariableDeclaration).filter[ !input && !output ].map[ valuedObjects ].toIterable.flatten.toList
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
                
                environment.errors.add("The valued object reference points to a valued object (" + vor.valuedObject.name + ") that is not contained in the model!", container, true)
                System.err.println("The valued object reference points to a valued object that is not contained in the model! " + 
                    vor.valuedObject.name + " " + vor + " " + (container as State).name)
                success = false
            }
        }
        success
    }
    
    def void handleSCChartsDatatype(State state) {
        val scopesWithReferencesDecl = state.allScopes.filter[ !declarations.filter(ReferenceDeclaration).filter[reference !== null].empty ].toList
        for (scope : scopesWithReferencesDecl) {
            val refs = scope.declarations.filter(ReferenceDeclaration).filter[reference !== null].toList
            for (ref : refs) {
                var refTarget = ref.reference
                if (refTarget instanceof State) {
                    val newState = refTarget.copy as State
                    newState.expandRoot
                    val classDecl = createPolicyClassDeclaration => [
                        name = newState.name
                        valuedObjects += ref.valuedObjects
                        declarations += newState.declarations
                    ]
                    ref.replace(classDecl)
                    
                    // Fix VORs
                    for (vor : state.eAllContents.filter(ValuedObjectReference).filter[classDecl.valuedObjects.contains(it.valuedObject)].toList) {
                        var sub = vor.subReference
                        while (sub !== null) {
                            val vo = sub.valuedObject
                            val parent = sub.eContainer as ValuedObjectReference
                            val decl = parent.valuedObject.eContainer as Declaration
                            if (decl instanceof ClassDeclaration) {
                                // Find by name
                                sub.valuedObject = decl.declarations.map[valuedObjects].flatten.findFirst[vo.name.equals(name)]
                            }
                            sub = sub.subReference
                        }
                    }
                    
                    // Copy inner behavior
                    for (vo : classDecl.valuedObjects) {
                        for (region : newState.regions) {
                            val newRegion = region.copy
                            newRegion.name = vo.name + region.name
                            for (vor : newRegion.eAllContents.filter(ValuedObjectReference).toList) {
                                if (!(vor.eContainer instanceof ValuedObjectReference)) {// Not a sub reference
                                    val newVOR = vo.reference
                                    vor.replace(newVOR)
                                    newVOR.subReference = vor
                                }
                            }
                            state.regions += newRegion
                        }
                        for (action : newState.actions) {
                            val newAction = action.copy
                            for (vor : newAction.eAllContents.filter(ValuedObjectReference).toList) {
                                if (!(vor.eContainer instanceof ValuedObjectReference)) {// Not a sub reference
                                    val newVOR = vo.reference
                                    vor.replace(newVOR)
                                    newVOR.subReference = vor
                                }
                            }
                            state.actions += newAction
                        }
                    }
                }
            }
            
            
        }
    }

}
