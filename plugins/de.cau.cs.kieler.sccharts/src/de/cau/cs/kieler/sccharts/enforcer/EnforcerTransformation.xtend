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
package de.cau.cs.kieler.sccharts.enforcer

import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.VariableDeclaration
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.core.kexpressions.keffects.KEffectsFactory
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import java.util.Set

//import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * SCCharts Enforcer Transformation.
 * 
 * @author ssm
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class EnforcerTransformation extends AbstractExpansionTransformation implements Traceable {

    public static val ENFORCER_TRANSFORMATION_ID = "sccharts.enforcer"
    public static val ENFORCER_TRANSFORMATION_NAME = "Enforcer"
    
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension SCChartsExtension
    
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return ENFORCER_TRANSFORMATION_ID
    }

    override getName() {
        return ENFORCER_TRANSFORMATION_NAME
    }

    override getExpandsFeatureId() {
        return EnforcerFeature.ENFORCER_FEATURE_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet()
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet()
    }

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }
    
    def State transform(State rootState) {
        val inputs = <ValuedObject> newHashSet
        val outputs = <ValuedObject> newHashSet  
        for(declaration : rootState.declarations.filter(VariableDeclaration)) {
            if (declaration.input) inputs += declaration.valuedObjects
            if (declaration.output) outputs += declaration.valuedObjects
        }
        
        val SARegion = rootState.regions.filter(ControlflowRegion).head
        val inputRegion = SARegion => [ 
            id = "input"
        ]
        val outputRegion = SARegion.copy => [ 
            id = "output"
            rootState.regions += it
        ]
            
        val tickRegion = rootState.createTickRegion(inputs, outputs)
        inputRegion.modifyInputRegion(inputs, outputs)
        outputRegion.modifyOutputRegion(inputs, outputs)
        
        inputRegion.annotations += createTypedStringAnnotation("layout", "priority", "3")
        tickRegion.annotations += createTypedStringAnnotation("layout", "priority", "2")
        outputRegion.annotations += createTypedStringAnnotation("layout", "priority", "1")
                
        inputRegion.optimizeRegion(inputs, outputs)
        outputRegion.optimizeRegion(inputs, outputs)
        
        rootState
    }
    
    protected def ControlflowRegion modifyInputRegion(ControlflowRegion region, Set<ValuedObject> inputs, 
        Set<ValuedObject> outputs) {
        
        val violationState = region.states.filter[ violation ].head
        for(vt : violationState.incomingTransitions.immutableCopy) {
            val references = vt.trigger.getAllReferences
            if (references.map[ valuedObject ].exists[ outputs.contains(it) ]) {
                // Output is present, cannot do anything
                vt.remove
            } else {
                // no outputs available, apply edit_i here
                vt.applyEditI(inputs, outputs)
            }
        }
        
        violationState.remove
        
        region
    }
    
    protected def ControlflowRegion modifyOutputRegion(ControlflowRegion region, Set<ValuedObject> inputs, 
        Set<ValuedObject> outputs) {

        val violationState = region.states.filter[ violation ].head
        for(vt : violationState.incomingTransitions.immutableCopy) {
            val references = vt.trigger.getAllReferences
            if (references.map[ valuedObject ].exists[ outputs.contains(it) ]) {
                // Output is present, apply edit_o here
                vt.applyEditO(inputs, outputs)
            } else {
                // only inputs present, should already be handled
                vt.remove
            }
        }
        
        violationState.remove
        
        region
    }
    
    protected def Transition applyEditI(Transition transition,
        Set<ValuedObject> inputs, Set<ValuedObject> outputs) {
            
        // EXAMPLE
        transition.targetState = transition.sourceState
        val inputRefs = transition.trigger.getAllReferences.map[ valuedObject ]
        for(input : inputRefs) {
            KEffectsFactory.eINSTANCE.createAssignment => [
                valuedObject = input
                expression = FALSE
                transition.effects += it
            ]
        }
        transition
    }

    protected def Transition applyEditO(Transition transition, 
        Set<ValuedObject> inputs, Set<ValuedObject> outputs) {
            
        // EXAMPLE
        transition.targetState = transition.sourceState
        val outputRefs = transition.trigger.getAllReferences.map[ valuedObject ].filter[ outputs.contains(it) ]
        for(output : outputRefs) {
            KEffectsFactory.eINSTANCE.createAssignment => [
                valuedObject = output
                expression = FALSE
                transition.effects += it
            ]
        }
        
        transition
    }
    
    protected def ControlflowRegion optimizeRegion(ControlflowRegion region, Set<ValuedObject> inputs,
        Set<ValuedObject> outputs) {
    
        val states = region.states.immutableCopy
        for(s : states) {
            if (s.outgoingTransitions.size == 0) {
                s.remove
            }
        }
        
        if (region.states.size == 0) {
            region.remove
        }
        
        region        
    }    
    
    protected def Region createTickRegion(State rootState, Set<ValuedObject> inputs, Set<ValuedObject> outputs) {
        val tickFunctionDeclaration = KExpressionsFactory.eINSTANCE.createReferenceDeclaration => [ 
            extern = "tick"
            rootState.declarations += it
        ]
        val tickFunctionVO = KExpressionsFactory.eINSTANCE.createValuedObject => [
            name = "tick"
            tickFunctionDeclaration.valuedObjects += it
        ]                 
        val tickRegion = rootState.createControlflowRegion("tick") => [ label = "tick" ]
        val tickState = tickRegion.createState("T") => [ initial = true ]
        val tickTransition = tickState.createTransitionTo(tickState)
        val tickCallEffect = KEffectsFactory.eINSTANCE.createReferenceCallEffect => [
            valuedObject = tickFunctionVO
            tickTransition.effects += it
        ]
        inputs.forEach[ input |
            KExpressionsFactory.eINSTANCE.createParameter => [
                it.expression = input.reference
                tickCallEffect.parameters += it
            ]
        ]
        outputs.forEach[ input |
            KExpressionsFactory.eINSTANCE.createParameter => [
                it.expression = input.reference
                it.callByReference = true
                tickCallEffect.parameters += it
            ]
        ]
        
        tickRegion
    }


}
