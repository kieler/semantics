/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.interpreter

import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.Value
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import javax.inject.Inject
import static extension de.cau.cs.kieler.sccharts.iterators.ValuedObjectIterator.*
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory

/**
 * @author ssm
 *
 */
class ModelState {
    
    @Inject extension SCChartsExtension
    
    private var State rootState;
    private val valuedObjectValues = <ValuedObject, Value> newHashMap
    private val activeStates = <State> newHashSet
    private val activeTransitions = <Transition> newHashSet
    
    new(State rootState) {
        this.rootState = rootState
        reset
    }
    
    def void reset() {
        valuedObjectValues.clear
        activeStates.clear
        activeTransitions.clear
        
        populateValuedObjectValues            
    }
    
    private def populateValuedObjectValues() {
        for(vo : rootState.sccValuedObjects.toIterable) {
            val value = vo.createValue
            valuedObjectValues.put(vo, value)
        }
    }
    
    private def Value createValue(ValuedObject valuedObject) {
        if (!(valuedObject.eContainer instanceof Declaration)) {
            throw new Exception("The valued object does not have a parent declaration!")
        }
        
        val declaration = valuedObject.eContainer as Declaration
        if (declaration.type == ValueType.BOOL) {
            return KExpressionsFactory.eINSTANCE.createBoolValue => [ value = false ]
        } else if (declaration.type == ValueType.INT) {
            return KExpressionsFactory.eINSTANCE.createIntValue => [ value = 0 ]
        } else if (declaration.type == ValueType.DOUBLE) {
            return KExpressionsFactory.eINSTANCE.createDoubleValue => [ value = 0.0 ]
        } else if (declaration.type == ValueType.STRING) {
            return KExpressionsFactory.eINSTANCE.createStringValue => [ value = "" ]
        }

        throw new Exception("The requested value type of valued object " + valuedObject.name + " is not supported.")
    }
    
}