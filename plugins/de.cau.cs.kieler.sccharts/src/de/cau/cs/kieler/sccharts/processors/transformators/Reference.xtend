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
import com.google.inject.Injector
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsReferenceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.VariableDeclaration

/**
 * Give me a state, Vasili. One state only please.
 * https://www.youtube.com/watch?v=jr0JaXfKj68
 * 
 * @author ssm
 * @kieler.design 2017-07-18 proposed
 * @kieler.rating 2017-07-18 proposed yellow  
 */
class Reference extends SCChartsProcessor {
    
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExtDeclarationExtensions    
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsReferenceExtensions
    @Inject Injector injector
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.transformators.reference"
    }
    
    override getName() {
        "Reference V2"
    }
    
    override process() {
        val model = getModel
        
        for(rootState : model.rootStates.toList) {
            val statesWithReferences = rootState.getAllContainedStates.filter[ reference != null && reference.scope != null ]
            for (state : statesWithReferences.toList) {
                state.expandReferencedState(new Replacements)
            }
        }
    }   
    
    protected def expandReferencedState(State stateWithReference, Replacements replacements) {
        val newState = stateWithReference.reference.scope.copy as State => [ 
            name = stateWithReference.name 
            label = stateWithReference.label
            initial = stateWithReference.initial
            final = stateWithReference.final
            for (annotation : stateWithReference.annotations) {
                 annotations += annotation.copy
            }
        ]
        
        for (valuedObject : stateWithReference.declarations.map[ valuedObjects ].flatten) {
            replacements.push(valuedObject, newState.findValuedObjectByName(valuedObject.name).reference)
        }
        
        val bindings = stateWithReference.createBindings
        
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
        
        
//        for (region : newState.regions) {
//            region.replaceValuedObjectReferences(replacements)
//        } 
        
        newState.replaceValuedObjectReferencesInState(replacements)        
        
        val parent = stateWithReference.eContainer as ControlflowRegion
        
        parent.states.add(newState)
        
        for (transition : stateWithReference.outgoingTransitions.immutableCopy) {
            transition.sourceState = newState
        }
        for (transition : stateWithReference.incomingTransitions.immutableCopy) {
            transition.targetState = newState
        }
        
        stateWithReference.remove
        
        newState.declarations.removeIf[ if (it instanceof VariableDeclaration) { input || output } else false ]
        
        snapshot
    } 
    
    protected def void replaceValuedObjectReferences(Scope scope, Replacements replacements) {
        val valuedObjects = scope.declarations.map[ valuedObjects ].flatten.toList
        for (valuedObject : valuedObjects) {
            replacements.push(valuedObject, valuedObject.reference)
        }
        
        
        // TODO: Resolve name clash
        switch(scope) {
            ControlflowRegion: for (state : scope.states.immutableCopy) state.replaceValuedObjectReferences(replacements)  
            State: scope.replaceValuedObjectReferencesInState(replacements)
        }
        
        for (valuedObject : valuedObjects) {
            replacements.pop(valuedObject)
        }
    }
    
    protected def replaceValuedObjectReferencesInState(State state, Replacements replacements) {
        for (action : state.actions + state.outgoingTransitions) {
            action.trigger?.replaceReferences(replacements)
            for (effect : action.effects) {
                effect.replaceReferences(replacements)
            }
        }
        
        if (state.reference != null) {
            for (parameter : state.reference.parameters) {
                parameter.replaceReferences(replacements)
            }
            state.expandReferencedState(replacements)
        }
        
        for (region : state.regions) {
            region.replaceValuedObjectReferences(replacements)
        }
    }
    
    protected dispatch def void replaceReferences(ValuedObjectReference valuedObjectReference, Replacements replacements) {
        val newRef = replacements.peek(valuedObjectReference.valuedObject)
        // TODO: Bind Literals
        if (newRef != null) {
            if (newRef instanceof ValuedObjectReference) { 
                valuedObjectReference.valuedObject = (newRef as ValuedObjectReference).valuedObject
                for (index : valuedObjectReference.indices) {
                    index.replaceReferences(replacements)
                }   
            } else {
                environment.errors.add("A binding for the valued object reference \"" + valuedObjectReference.valuedObject.name + 
                    "\" exists, but is not another valued object reference.\n" + 
                    "The type \"" + newRef.class.getName + "\" is not supported.", valuedObjectReference, true)
            }
        }
    }
    
    protected dispatch def void replaceReferences(OperatorExpression operatorExpression, Replacements replacements) {
        for (subExpression : operatorExpression.subExpressions) {
            subExpression.replaceReferences(replacements)
        }
    }
    
    protected dispatch def void replaceReferences(Value value, Replacements replacements) {
        // do nothing
    }
    
    protected dispatch def void replaceReferences(Expression expression, Replacements replacements) {
        environment.warnings.add("The expression type \"" + expression.class.name + 
            "\" is unknown to the reference transformation. It is ignored.", expression, true)
    }

    protected dispatch def void replaceReferences(Assignment assignment, Replacements replacements) {
        assignment.expression.replaceReferences(replacements)
        
        val newRef = replacements.peek(assignment.valuedObject)
        if (newRef != null) {
            if (newRef instanceof ValuedObjectReference) { 
                assignment.valuedObject = (newRef as ValuedObjectReference).valuedObject
                for (index : assignment.indices) {
                    index.replaceReferences(replacements)
                }     
            } else {
                environment.errors.add("A binding for the valued object \"" + assignment.valuedObject.name + 
                    "\" in an assignment exists, but is not another valued object.\n" + 
                    "The type \"" + newRef.class.getName + "\" is not supported.", assignment, true)
            }
        }
    }
    
    protected dispatch def void replaceReferences(Emission emission, Replacements replacements) {
        emission.newValue?.replaceReferences(replacements)
        
        val newRef = replacements.peek(emission.valuedObject)
        if (newRef != null) {
            if (newRef instanceof ValuedObjectReference) { 
                emission.valuedObject = (newRef as ValuedObjectReference).valuedObject
            } else {
                environment.errors.add("A binding for the valued object \"" + emission.valuedObject.name + 
                    "\" in an emission exists, but is not another valued object.\n" + 
                    "The type \"" + newRef.class.getName + "\" is not supported.", emission, true)
            }
        }        
    }
    
    protected dispatch def void replaceReferences(Parameter parameter, Replacements replacements) {
        parameter.expression.replaceReferences(replacements)
        for(index : parameter.explicitBindingIndices) {
            index.replaceReferences(replacements)   
        }
    }
    


}