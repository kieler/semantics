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
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.CodeEffect
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.scl.SCLFactory

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

/**
 * 
 * @author als
 */
class SclCodeEffect extends SCChartsProcessor implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.codeEffects"
    }
    
    override getName() {
        "SCL Code Effects"
    }

    override process() {
        setModel(model.transform)
    }
    
    // PROCESSOR CONSTRAINTS
    // After: MacroExpansion, Region Actions

    //-------------------------------------------------------------------------
    @Inject extension SCChartsScopeExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    
    extension SCLFactory = SCLFactory.eINSTANCE

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_effect"
    private var counter = 0
    
    def transform(SCCharts sccharts) {
        for (rootState : sccharts.rootStates) {
            counter = 0
            // Traverse all states
            for (state : rootState.getAllStates.toList) {
                state.transformCodeEffects;
            }
        }
        return sccharts
    }

    def void transformCodeEffects(State state) {
        // Actions
        for (action : state.actions) {
            for (codeEffect : action.effects.filter(CodeEffect).toList) {
                codeEffect.transformCodeEffect(state)
            }
        }
        // Transitions
        val parent = state.parentRegion?.parentState
        if (parent !== null) {
            for (transition : state.outgoingTransitions) {
                for (codeEffect : transition.effects.filter(CodeEffect).toList) {
                    codeEffect.transformCodeEffect(parent)
                }
            }
        }
    }
    
    def void transformCodeEffect(CodeEffect effect, State targetState) {
        val vo = createValuedObject(GENERATED_PREFIX + counter++).trace(effect)
        targetState.declarations += createMethodImplementationDeclaration => [
            trace(effect)
            valuedObjects += vo
            returnType = ValueType.VOID
            // Move content
            annotations += effect.annotations
            declarations += effect.declarations
            statements += effect.statements
        ]
        effect.replace(createReferenceCallEffect => [
            valuedObject = vo
            schedule += effect.schedule
        ])
    }

}
