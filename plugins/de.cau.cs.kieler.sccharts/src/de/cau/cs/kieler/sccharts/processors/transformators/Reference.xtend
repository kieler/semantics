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

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsReferenceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.Replacements

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
    
    protected var Dataflow dataflowProcessor = null
    
    protected val replacedWithLiterals = <ValuedObject> newHashSet
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.transformators.reference"
    }
    
    override getName() {
        "Reference V2"
    }
    
    override process() {
        replacedWithLiterals.clear
        dataflowProcessor = KiCoolRegistration.getProcessorInstance("de.cau.cs.kieler.sccharts.processors.transformators.dataflow") as Dataflow
        if (dataflowProcessor !== null) {
            dataflowProcessor.setEnvironment(sourceEnvironment, environment)
        }
        
        val model = getModel
        
        for(rootState : model.rootStates.toList) {
            val statesWithReferences = rootState.getAllContainedStates.filter[ reference !== null && reference.scope !== null ]
            for (state : statesWithReferences.toList) {
                state.expandReferencedState(new Replacements)
            }
            
            if (dataflowProcessor !== null) {
                // Optimize this.
                dataflowProcessor.processState(rootState)
                val statesWithReferences2 = rootState.getAllContainedStates.filter[ reference !== null && reference.scope !== null ]
                for (state : statesWithReferences2.toList) {
                    state.expandReferencedState(new Replacements)
                }
            }
            
            if (!rootState.validate) 
                throw new IllegalStateException("References objects are not contained in the resource!")
        }
        
    }   
    
    /** Expands one referenced state and keeps track of the replacement stack. */
    protected def void expandReferencedState(State stateWithReference, Replacements replacements) {
        // Create the new state via copy. All internal references are ok. However, you must correct the bindings now.
        val newState = stateWithReference.reference.scope.copy as State => [ 
            name = stateWithReference.name 
            label = stateWithReference.label
            initial = stateWithReference.initial
            final = stateWithReference.final
            for (annotation : stateWithReference.annotations) {
                 annotations += annotation.copy
            }
        ]
        
        // Push all declarations of the state with the reference onto the replacement stack and search for
        // similar valued objects in the copy.  
        for (valuedObject : stateWithReference.declarations.map[ valuedObjects ].flatten) {
            replacements.push(valuedObject, newState.findValuedObjectByName(valuedObject.name).reference)
        }
        
        // Create the binding structure. The dedicated {@code Binding} class manages the bindings.
        // CreateBindings also reports binding errors and warnings.
        val bindings = stateWithReference.createBindings(replacements)
        for (binding : bindings) {
            if (binding.errors > 0) {
                environment.errors.add("There are binding errors in a referenced state!\n" + 
                    binding.errorMessages.join("\n"), 
                    stateWithReference, true)
            } else {
                // TODO: target indices not supported yet
                replacements.push(binding.targetValuedObject, binding.sourceExpression)
            }
        }       
        
        // If the output declarations have initialization parts, add them as entry actions because
        // the declaration will be removed at the end of the transformation.
        for (initialization : newState.declarations.filter(VariableDeclaration).filter[ output ].map[ valuedObjects ].
            flatten.filter[ initialValue !== null ]) {
            newState.createEntryAction.effects += initialization.createAssignment(initialization.initialValue)                            
        }
        
        // Correct all valued object references in the new state.
        newState.replaceValuedObjectReferencesInState(replacements)        

        // Add the new state to the parent region, correct all transitions, and finally remove the original 
        // referenced state.        
        val parent = stateWithReference.eContainer as ControlflowRegion
        parent.states.add(newState)
        for (transition : stateWithReference.outgoingTransitions.immutableCopy) {
            transition.sourceState = newState
        }
        for (transition : stateWithReference.incomingTransitions.immutableCopy) {
            transition.targetState = newState
        }
        stateWithReference.remove
        
        // Remove the input/output declarations from the new state. They should be bound by now.
        newState.declarations.removeIf[ if (it instanceof VariableDeclaration) { input || output } else false ]
        
        snapshot

        // Transform any dataflow regions via the dataflow co-processors.        
        if (dataflowProcessor !== null) {
            // Optimize this.
            dataflowProcessor.processState(newState)
            val statesWithReferences = newState.getAllContainedStates.filter[ reference !== null && reference.scope !== null ]
            for (state : statesWithReferences.toList) {
                state.expandReferencedState(new Replacements)
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
        // TODO: Resolve name clash
        switch(scope) {
            ControlflowRegion: for (state : scope.states.immutableCopy) state.replaceValuedObjectReferences(replacements)
            DataflowRegion: for (equation: scope.equations.immutableCopy) equation.replaceReferences(replacements)   
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
            action.trigger?.replaceReferences(replacements)
            for (effect : action.effects) {
                effect.replaceReferences(replacements)
            }
        }

        // If the state is also a referenced state, process the parameters and expand this state, too.
        // Do this with the actual replacement stack.        
        if (state.reference !== null) {
            for (parameter : state.reference.parameters) {
                parameter.replaceReferences(replacements)
            }
            state.expandReferencedState(replacements)
        }
        
        // Delegate the region replacement.
        for (region : state.regions) {
            region.replaceValuedObjectReferences(replacements)
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
        (oldDeclaration.eContainer as Scope).declarations += newDeclaration
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

}