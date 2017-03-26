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
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.KEffectsFactory
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
    
    //--                 K I C O      C O N F I G U R A T I O N              --
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


    /**
     * Transform method for new SCCharts with more than one root state.
     * Each root state will be transformed.  
     */
    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }

    /**
     * Transform method for root states.
     */    
    def State transform(State rootState) {
        // Create new sets for inputs and outputs and fill them appropriately.
        val inputs = <ValuedObject> newHashSet
        val outputs = <ValuedObject> newHashSet  
        for(declaration : rootState.declarations.filter(VariableDeclaration)) {
            if (declaration.input) inputs += declaration.valuedObjects
            if (declaration.output) outputs += declaration.valuedObjects
        }
        
        // The SA is located in the first (and only) region of the SCChart.
        // It resembles the initial pre-processed input and output regions of the enforcer.
        // Hence, copy the region for the output region. The original will serve as input region.
        val SARegion = rootState.regions.filter(ControlflowRegion).head
        val inputRegion = SARegion => [ id = "input" ]
        val outputRegion = SARegion.copy => [ id = "output" rootState.regions += it ]
           
        // Additionally, create a region for the tick function.
        val tickRegion = rootState.createTickRegion(inputs, outputs)
        
        // Now, modifiy the input and the output regions according to the enforcer algorithm.
        inputRegion.modifyInputRegion(inputs, outputs)
        outputRegion.modifyOutputRegion(inputs, outputs)
        
        // Layout stuff: Always layout input | tick | output
        inputRegion.annotations += createTypedStringAnnotation("layout", "priority", "3")
        tickRegion.annotations += createTypedStringAnnotation("layout", "priority", "2")
        outputRegion.annotations += createTypedStringAnnotation("layout", "priority", "1")
                
        // Optimize the regions... some states are superfluous.
//        inputRegion.optimizeRegion(inputs, outputs)
//        outputRegion.optimizeRegion(inputs, outputs)
        
        if (rootState.id.endsWith("SA")) {
            rootState.id = 
                rootState.id.substring(0, rootState.id.length-2) + "Enf"
        }
        if (rootState.label.endsWith("SA")) {
            rootState.label = 
                rootState.label.substring(0, rootState.label.length-2) + "Enf"
        }
        
        // Return the root state.
        rootState
    }
    
    /**
     * This method modifies the input region according to the enforcer algorithm.
     */
    protected def ControlflowRegion modifyInputRegion(ControlflowRegion region, Set<ValuedObject> inputs, 
        Set<ValuedObject> outputs) {
        
        // Retrieve the violation state and look at every incoming transition.
        val violationState = region.states.filter[ violation ].head
        for(vt : violationState.incomingTransitions.immutableCopy) {
            
            // Look at all variable references. If an output is present, then the input region cannot to anything.
            val references = vt.trigger.getAllReferences
            if (references.map[ valuedObject ].exists[ outputs.contains(it) ]) {
                // Output is present, cannot do anything
                vt.remove
            } else {
                // no outputs available, apply edit_i here
                vt.applyEditI(inputs, outputs)
            }
        }
        
        // Remove the violation state.
        violationState.remove
        region
    }
    
    /**
     * This method modifies the output region according to the enforcer algorithm.
     */
    protected def ControlflowRegion modifyOutputRegion(ControlflowRegion region, Set<ValuedObject> inputs, 
        Set<ValuedObject> outputs) {

        // Retrieve the violation state and look at every incoming transition
        val violationState = region.states.filter[ violation ].head
        for(vt : violationState.incomingTransitions.immutableCopy) {
            
            // Look at all variable references. If no output is present, then this case should already be dealt with
            // in the input region. 
            val references = vt.trigger.getAllReferences
            if (references.map[ valuedObject ].exists[ outputs.contains(it) ]) {
                // Output is present, apply edit_o here
                vt.applyEditO(inputs, outputs)
            } else {
                // only inputs present, should already be handled
                vt.remove
            }
        }

        // Remove the violation state.        
        violationState.remove
        region
    }
  
    /**
     * This method implements the editI function that determines the behavior of the enforcer in the input region.
     */  
    protected def Transition applyEditI(Transition transition,
        Set<ValuedObject> inputs, Set<ValuedObject> outputs) {
            
        // EXAMPLE
        // Set all trigger to false
        transition.targetState = transition.sourceState
        val inputRefs = transition.trigger.getAllReferences.map[ valuedObject ]
        for(input : <ValuedObject> newArrayList(inputRefs.last)) {
            KEffectsFactory.eINSTANCE.createAssignment => [
                valuedObject = input
                expression = FALSE
                transition.effects += it
            ]
        }
        transition
    }

    /**
     * This method implements the editO function that determines the behavior of the enforcer in the output region.
     */  
    protected def Transition applyEditO(Transition transition, 
        Set<ValuedObject> inputs, Set<ValuedObject> outputs) {
            
        // EXAMPLE
        // Set all trigger to false
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
    
    /**
     * Optimize input region.
     */
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
    
    /**
     * Creates the tick region.
     */
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
