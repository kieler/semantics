/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2021 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.processors

import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsClassExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsReferenceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsInheritanceExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCallExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsDependencyExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.sccharts.PolicyClassDeclaration
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions

/**
 * @author glu
 *
 */
class ReferenceCallPreprocessor extends SCChartsProcessor implements Traceable {
    
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension SCChartsClassExtensions
    @Inject extension AnnotationsExtensions
    
    val REF_CALL_INSTANCE_SUFFIX = "_d"
    val REF_CALL_TICK_METHOD_NAME = "tick"
    val REF_CALL_RESET_METHOD_NAME = "reset"
    val REF_CALL_CPIN_METHOD_NAME = "copy_inputs"
    val REF_CALL_CPOUT_METHOD_NAME = "copy_outputs"
    val REF_CALL_TERM_METHOD_NAME = "get_term"
    
    
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.referenceCallPreprocessor"
    }
    
    override getName() {
        "Reference Call Preprocessor"
    }
    
    override process() {
        setModel(model.transform)
    }
    // -------------------------------------------------------------------------
    
    def SCCharts transform(SCCharts sccharts) {
        sccharts => [
            rootStates.forEach[ rootState |
                rootState.allContainedStates.filter[isReferencing].toList().forEach [ ref |
                    val classDecl = createOrGetClassDeclaration(ref.reference.scope.name, rootState)
                    val instance = classDecl.createValuedObject(ref.name + REF_CALL_INSTANCE_SUFFIX).uniqueName
                    /* Tranform referencing state to superstate containing glue logic. */
                    ref.createControlflowRegion(ref.name) => [
                        var init = it.createInitialState("I")
                        var call = it.createState("C")
                        var term = it.createFinalState("T")
                        
                        val tick_method = classDecl.declarations.findFirst[
                            valuedObjects.head.name == REF_CALL_TICK_METHOD_NAME
                        ].valuedObjects.head
                        val reset_method = classDecl.declarations.findFirst[
                            valuedObjects.head.name == REF_CALL_RESET_METHOD_NAME
                        ].valuedObjects.head
                        val cpin_method = classDecl.declarations.findFirst[
                            valuedObjects.head.name == REF_CALL_CPIN_METHOD_NAME
                        ].valuedObjects.head
                        val cpout_method = classDecl.declarations.findFirst[
                            valuedObjects.head.name == REF_CALL_CPOUT_METHOD_NAME
                        ].valuedObjects.head
                        val term_method = classDecl.declarations.findFirst[
                            valuedObjects.head.name == REF_CALL_TERM_METHOD_NAME
                        ].valuedObjects.head
                        
                        /* On entry (without history) reset referenced model and call tick once. */
                        init.createTransitionTo(call) => [
                            delay = DelayType::IMMEDIATE
                            effects.add(createReferenceCallEffect => [
                                subReference = reset_method.reference
                                valuedObject = instance
                            ])
                            effects.add(createReferenceCallEffect => [
                                subReference = cpin_method.reference
                                valuedObject = instance
                            ])
                            effects.add(createReferenceCallEffect => [
                                subReference = tick_method.reference
                                valuedObject = instance
                            ])
                            effects.add(createReferenceCallEffect => [
                                subReference = cpout_method.reference
                                valuedObject = instance
                            ])
                        ]
                        
                        /* Self transition from call state to call state (if not terminated). */
                        call.createTransitionTo(call) => [
                            effects.add(createReferenceCallEffect => [
                                subReference = cpin_method.reference
                                valuedObject = instance
                            ])
                            effects.add(createReferenceCallEffect => [
                                subReference = tick_method.reference
                                valuedObject = instance
                            ])
                            effects.add(createReferenceCallEffect => [
                                subReference = cpout_method.reference
                                valuedObject = instance
                            ])
                        ]
                        
                        /* If referenced model terminates, terminate immediately. */
                        call.createTransitionTo(term) => [
                            delay = DelayType::IMMEDIATE
                            trigger = createReferenceCall => [
                                subReference = term_method.reference
                                valuedObject = instance
                            ]
                        ]
                    ]
                    /* Remove original reference.
                     * Could also keep the reference in order to link later but naming-based solution is more general
                     * => external modules.
                     */
                    ref.reference = null
                ]
            ]
        ]
    }

    protected def PolicyClassDeclaration createOrGetClassDeclaration(String refName, State rootState) {
        val maybeDecl = rootState.declarations.findFirst[
            PolicyClassDeclaration.isInstance(it) && (it as PolicyClassDeclaration).name == refName
        ]
        val decl = maybeDecl !== null ? maybeDecl as PolicyClassDeclaration : createPolicyClassDeclaration => [
            name = refName
            host = true
            // Declare method placeholders.
            var tickDecl = createMethodImplementationDeclaration => [
                it.createValuedObject(REF_CALL_TICK_METHOD_NAME)
            ]
            var resetDecl = createMethodImplementationDeclaration => [
                it.createValuedObject(REF_CALL_RESET_METHOD_NAME)
            ]
            var cpinDecl = createMethodImplementationDeclaration => [
                it.createValuedObject(REF_CALL_CPIN_METHOD_NAME)
            ]
            var cpoutDecl = createMethodImplementationDeclaration => [
                it.createValuedObject(REF_CALL_CPOUT_METHOD_NAME)
            ]
            var termDecl = createMethodImplementationDeclaration => [
                it.createValuedObject(REF_CALL_TERM_METHOD_NAME)
                returnType = ValueType::BOOL
            ]
            declarations.add(tickDecl)
            declarations.add(resetDecl)
            declarations.add(cpinDecl)
            declarations.add(cpoutDecl)
            declarations.add(termDecl)
            rootState.declarations.add(it)
            it.annotations.add(createTagAnnotation("Module"))
        ]
        return decl
    }

}