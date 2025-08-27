/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.processors

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.UniqueNameCache
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsArrayExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransformationExtension
import java.util.HashMap
import java.util.List
import java.util.Stack
import org.eclipse.emf.ecore.EObject

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * SCCharts Pre Transformation.
 * 
 * @author cmot, aas
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class Pre extends SCChartsProcessor implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.pre"
    }
    
    override getName() {
        "Pre"
    }
 
    override process() {
        setModel(model.transform)
    }

    //-------------------------------------------------------------------------

    @Inject extension KExpressionsCreateExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsTransformationExtension
    @Inject extension KExpressionsArrayExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    
    val nameCache = new UniqueNameCache

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    //-------------------------------------------------------------------------
    //--                        P R E -  O P E R A T O R                     --
    //-------------------------------------------------------------------------
    // Transforming PRE Operator.
    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }
    
    private def State transform(State rootState) {
        nameCache.clear
                
        val targetRootState = rootState
        val transformedVariables = <List<ValuedObject>, ValuedObject>newHashMap

        // Find all pre statements
        val allPreExpressionsInnerFirst = new Stack<OperatorExpression>
        val iterator = rootState.eAllContents
        while(iterator.hasNext) {
            val obj = iterator.next
            if(obj instanceof OperatorExpression) {
                if(obj.operator == OperatorType::PRE) {
                    allPreExpressionsInnerFirst.add(obj)    
                }
            }
        }

        // Traverse all pre statements, inner pre statements must be handled first
        while(!allPreExpressionsInnerFirst.isEmpty) {
            val pre = allPreExpressionsInnerFirst.pop
            pre.transform(targetRootState, transformedVariables)
        }
        targetRootState
    }
    
    private def transform(OperatorExpression pre, State targetRootState, HashMap<List<ValuedObject>, ValuedObject> transformedVariables) {
        val valuedObjectRef = pre.valuedObjectReference?.lowermostReference
        if(valuedObjectRef !== null) {
            val key = pre.valuedObjectReference.expressionKey
            val valuedObject = valuedObjectRef.valuedObject
            if(valuedObject !== null && !transformedVariables.containsKey(key)) {
                transformedVariables.put(key, pre.transform(valuedObject, key))
            }
            pre.replaceWithTransformedVariable(valuedObjectRef, transformedVariables.get(key))
        }
    }
    
    private def transform(OperatorExpression pre, ValuedObject valuedObject, List<ValuedObject> key) {
        pre.setDefaultTrace // All following newly created objects are traced to this pre operator

        // Create a register variable
        val state = valuedObject.parentState
        val regName = GENERATED_PREFIX + "reg_" + key.map[name].join("_")
        val regVariable = state.createPreVariable(regName, valuedObject)
        regVariable.initialValue = getNeutralElement(valuedObject)
        val arrayIndexIterator = valuedObject.cardinalities.indexIterable
                
        // Create a pre variable
        val preName = GENERATED_PREFIX + "pre_" + key.map[name].join("_")
        val preVariable = state.createPreVariable(preName, valuedObject)
        // This initial value is initialized immediately with the initial value of the register variable
        preVariable.initialValue = null
        
        // Create a during action in which the pre variable is set to the register variable,
        // and afterwards the register variable is set to the original variable.
        // Thus the pre variable has the value of the original variable from the last tick.
        val duringAction = state.createImmediateDuringAction

        // Create assignments
        if(arrayIndexIterator === null) {
            if (pre.subExpressions.length == 2) {
                duringAction.trigger = pre.subExpressions.get(1)
            }
            duringAction.addEffectBefore(regVariable.createAssignment(pre.subExpressions.head.copy))
            duringAction.addEffectBefore(preVariable.createAssignment(regVariable.reference))    
        } else {
            for(arrayIndex : arrayIndexIterator) {
                // Assign register variable to valued object
                val asmExpression = pre.subExpressions.head.copy as ValuedObjectReference
                asmExpression.lowermostReference.indices.clear
                asmExpression.lowermostReference.indices.addAll(arrayIndex.convert)
                val regAssignment = regVariable.createAssignment(asmExpression)
                regAssignment.indices.addAll(arrayIndex.convert)
                duringAction.addEffect(regAssignment)
                // Assign pre variable to register variable
                val regVariableReference = regVariable.reference
                regVariableReference.indices.addAll(arrayIndex.convert)
                val preAssignment = preVariable.createAssignment(regVariableReference)
                preAssignment.indices.addAll(arrayIndex.convert)
                duringAction.addEffectBefore(preAssignment)
                
                if (pre.subExpressions.length == 2) {
                    duringAction.trigger = pre.subExpressions.get(1)
                }
            }
        }

        // Remember this pre variable for the original valued object
        return preVariable
    }
    
    private def ValuedObject createPreVariable(State state, String name, ValuedObject source) {
        val v = state.createValuedObject(name)
        v.copyAttributes(source)
        v.declaration2.copyAttributes(source.declaration2)
        v.declaration2.input = false
        v.declaration2.output = false
        voStore.update(v, SCCHARTS_GENERATED, "pre")
        
        verificationHack(v, source)
        return v
    }
    
    private def Expression getNeutralElement(ValuedObject valuedObject) {
        val type = valuedObject.type
        // In case of array, return a vector where each field is the neutral element.
        // Otherwise just return the neutral element for the valued object's type.
        if(valuedObject.isArray) {
            return valuedObject.cardinalities.getNeutralVector(type)
        } else {
            return getNeutralElement(type)
        }
    }
    
    private def Expression getNeutralVector(List<Expression> cardinalities, ValueType type){
        val vec = createVectorValue
        // Add the neutral element for each array index
        val dimensions = cardinalities.size
        // Get the neutral element (might be another vector) for this dimension
        var Expression neutralElement
        if(dimensions == 1) { 
            neutralElement = getNeutralElement(type)    
        } else if(dimensions > 1) {
            val restCardinalities = cardinalities.subList(1, dimensions)
            neutralElement = getNeutralVector(restCardinalities, type)
        } else {
            environment.errors.add(new Exception("Cardinalities may not be empty"))
        }
        // Add the neutral element in each field of this dimension
        val card = cardinalities.get(0)
        val dimensionSize = card.convert
        for(var i=0; i < dimensionSize; i++) {
            vec.values.add(neutralElement.copy)    
        }
        return vec
    }
    
    private def Expression getNeutralElement(ValueType type) {
        switch(type) {
            case BOOL : { return createBoolValue(false) }
            case INT, case UNSIGNED : { return createIntValue(0) }
            case FLOAT, case DOUBLE : { return createFloatValue(0) }
            case STRING : { return createNullValue() }
            default: {
                return null
            }
        }
    }
    
    private def replaceWithTransformedVariable(OperatorExpression pre, ValuedObjectReference valuedObjectReference, ValuedObject preVariable) {
        // Replace the pre expression in the parent container with the newly created pre variable for the valued object reference
        if(preVariable !== null) {
            val container = pre.eContainer
            val replacementExpression = preVariable.reference
            replacementExpression.indices.addAll(valuedObjectReference.indices)
            replacementExpression.trace(pre)
            var isReplaced = false
            switch(container) {
                Assignment : {
                    // The pre expression was used in an assignment
                    container.expression = replacementExpression
                    isReplaced = true
                }
                OperatorExpression : {
                    // Construct the same sub expressions without using any pre statement
                    val subExpressionsWithoutPre = <Expression>newArrayList
                    for(e : container.subExpressions) {
                        if(e == pre) {
                            subExpressionsWithoutPre.add(replacementExpression)
                        } else {
                            subExpressionsWithoutPre.add(e)
                        }
                    }
                    container.subExpressions.clear
                    container.subExpressions.addAll(subExpressionsWithoutPre)
                    isReplaced = true
                }
                Transition : {
                    if(container.trigger == pre) {
                        container.trigger = replacementExpression
                        isReplaced = true
                    }
                }
                ValuedObjectReference : {
                    if(container.indices.contains(pre)) {
                        container.indices.set(container.indices.indexOf(pre), replacementExpression)
                        isReplaced = true
                    }
                }
                default: {
                    environment.errors.add(new Exception("Pre expressions are only supported in assignments, triggers and other pre expressions, but got "+container))
                    // Don't show the generic error that the expression could not be replaced. It would be redundant
                    isReplaced = true
                }
            }
            if(!isReplaced) {
                environment.errors.add(new Exception("Pre expression could not be substituted in "+container))
            }
        }
    }
    
    private def State getParentState(EObject obj) {
        val parent = obj.eContainer
        if(parent instanceof State) {
            return parent
        } else {
            return parent.getParentState
        }
    }
    
    private def getValuedObjectReference(OperatorExpression pre) {
        if(pre.operator == OperatorType::PRE) {
            if(pre.subExpressions.size == 1 || pre.subExpressions.size == 2) {
                val subExp = pre.subExpressions.get(0)
                if(subExp instanceof ValuedObjectReference) {
                    return subExp
                }
            }
        }
        return null
    }
    
    /**
     * This hacks some verification adaption into this transformation without introducing a dependency to kieler.verification
     */
    private def verificationHack(ValuedObject vo, ValuedObject source) {
        try {
            // Copy range assumptions for verification
            compilationContext.startEnvironment.allProperties.forEach[p1, p2|
                if(p1.id.equals("de.cau.cs.kieler.verification.context")) {
                    p2.class.getMethod("copyAssumptions", ValuedObject, ValuedObject).invoke(p2, vo, source)
                }
            ]
        } catch (Exception e) {
            environment.errors.add(new Exception("Pre expression range assumption could not be copied"))
        }
    }
    
    def List<ValuedObject> expressionKey(ValuedObjectReference vor) {
        val key = newArrayList(vor.valuedObject)
        if (vor.subReference !== null) {
            key.addAll(vor.subReference.expressionKey)
            if (!vor.indices.empty) {
                throw new IllegalArgumentException("Cannot handle pre operator on arrays of classes")
            }
        }
        return key
    }
}
