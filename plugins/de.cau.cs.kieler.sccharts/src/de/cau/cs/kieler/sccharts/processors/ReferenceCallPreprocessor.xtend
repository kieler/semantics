/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
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
import de.cau.cs.kieler.kexpressions.services.KExpressionsGrammarAccess.ExpressionElements
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kicool.deploy.AdditionalResources.Type
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsDependencyExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.ValueType

/**
 * @author glu
 *
 */
class ReferenceCallPreprocessor extends SCChartsProcessor implements Traceable {
    
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsReferenceExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsInheritanceExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension KExpressionsCallExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KEffectsDependencyExtensions
    @Inject extension KExpressionsComplexCreateExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension SCChartsClassExtensions
    
    static final String REF_CALL_CLASS_SUFFIX = "Class"
    static final String REF_CALL_INSTANCE_SUFFIX = "_instance"
    static final String REF_CALL_STUB_SUFFIX = "_stub"
    
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
                    // declare stub class placeholder
                    val classDecl = createPolicyClassDeclaration() => [
                        name = ref.reference.scope.name + REF_CALL_CLASS_SUFFIX
                        uniqueName
                        host = true
                        it.createValuedObject(it.name + REF_CALL_INSTANCE_SUFFIX) => [uniqueName]
                        ref.name = it.name + REF_CALL_STUB_SUFFIX
                        // declare method placeholders
                        var tickDecl = createMethodImplementationDeclaration => [
                            it.createValuedObject("tick")
                        ]
                        var resetDecl = createMethodImplementationDeclaration => [
                            it.createValuedObject("reset")
                        ]
                        var cpinDecl = createMethodImplementationDeclaration => [
                            it.createValuedObject("copy_inputs")
                        ]
                        var cpoutDecl = createMethodImplementationDeclaration => [
                            it.createValuedObject("copy_outputs")
                        ]
                        var termDecl = createMethodImplementationDeclaration => [
                            it.createValuedObject("get_term")
                            returnType = ValueType::BOOL
                        ]
                        declarations.add(tickDecl)
                        declarations.add(resetDecl)
                        declarations.add(cpinDecl)
                        declarations.add(cpoutDecl)
                        declarations.add(termDecl)
                        rootState.declarations.add(it)
                    ]
                    /* remove original reference
                     * could also keep the reference in order to link later but naming-based solution is more general
                     * => external modules
                     */
                    ref.reference = null
                    // tranform referencing state to superstate containing glue logic
                    ref.createControlflowRegion(ref.name) => [
                        var init = it.createInitialState("I")
                        var call = it.createState("C")
                        var term = it.createFinalState("T")
                        /* get references to methods declared above
                         * TODO find a more elegant solution
                         */
                        val tick_method = classDecl.declarations.findFirst[
                            valuedObjects.head.name == "tick"
                        ].valuedObjects.head
                        val reset_method = classDecl.declarations.findFirst[
                            valuedObjects.head.name == "reset"
                        ].valuedObjects.head
                        val cpin_method = classDecl.declarations.findFirst[
                            valuedObjects.head.name == "copy_inputs"
                        ].valuedObjects.head
                        val cpout_method = classDecl.declarations.findFirst[
                            valuedObjects.head.name == "copy_outputs"
                        ].valuedObjects.head
                        val term_method = classDecl.declarations.findFirst[
                            valuedObjects.head.name == "get_term"
                        ].valuedObjects.head
                        
                        /* on entry (without history) reset referenced model and call tick once */
                        init.createTransitionTo(call) => [
                            delay = DelayType::IMMEDIATE
                            effects.add(createReferenceCallEffect => [
                                subReference = reset_method.reference
                                valuedObject = classDecl.valuedObjects.head
                            ])
                            effects.add(createReferenceCallEffect => [
                                subReference = cpin_method.reference
                                valuedObject = classDecl.valuedObjects.head
                            ])
                            effects.add(createReferenceCallEffect => [
                                subReference = tick_method.reference
                                valuedObject = classDecl.valuedObjects.head
                            ])
                            effects.add(createReferenceCallEffect => [
                                subReference = cpout_method.reference
                                valuedObject = classDecl.valuedObjects.head
                            ])
                        ]
                        
                        /* self transition from call state to call state (if not terminated) */
                        call.createTransitionTo(call) => [
                            effects.add(createReferenceCallEffect => [
                                subReference = cpin_method.reference
                                valuedObject = classDecl.valuedObjects.head
                            ])
                            effects.add(createReferenceCallEffect => [
                                subReference = tick_method.reference
                                valuedObject = classDecl.valuedObjects.head
                            ])
                            effects.add(createReferenceCallEffect => [
                                subReference = cpout_method.reference
                                valuedObject = classDecl.valuedObjects.head
                            ])
                        ]
                        
                        /* if referenced model terminates, terminate immediately */
                        call.createTransitionTo(term) => [
                            delay = DelayType::IMMEDIATE
                            trigger = createReferenceCall => [
                                subReference = term_method.reference
                                valuedObject = classDecl.valuedObjects.head
                            ]
                        ]
                    ]
                ]
            ]
        ]
    }
    
}