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

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.Binding
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.kicool.kitt.tracing.internal.TracingEcoreUtilExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.sccharts.PolicyClassDeclaration
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsClassExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsReferenceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.scg.processors.ReferenceCallProcessor
import de.cau.cs.kieler.scl.MethodImplementationDeclaration
import java.util.List
import org.eclipse.xtext.xbase.lib.Functions.Function1

/**
 * @author glu
 * 
 */
class ReferenceCallPreprocessor extends SCChartsProcessor implements Traceable {

    @Inject extension AnnotationsExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SCChartsClassExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsReferenceExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension TracingEcoreUtilExtensions

    val REF_CALL_INSTANCE_PREFIX = "_"
    val REF_CALL_EXT_SCC_ANNOTATION = "header"
    val REF_CALL_NON_INSTANTANEOUS_ANNOTATION = "isDelayed"
    val REF_CALL_TICK_METHOD_NAME = ReferenceCallProcessor.REF_CALL_TICK_METHOD_NAME
    val REF_CALL_RESET_METHOD_NAME = ReferenceCallProcessor.REF_CALL_RESET_METHOD_NAME
    val REF_CALL_CPIN_METHOD_NAME = ReferenceCallProcessor.REF_CALL_CPIN_METHOD_NAME
    val REF_CALL_CPOUT_METHOD_NAME = ReferenceCallProcessor.REF_CALL_CPOUT_METHOD_NAME
    val REF_CALL_TERM_METHOD_NAME = ReferenceCallProcessor.REF_CALL_TERM_METHOD_NAME
    val REF_CALL_TAG_ANNOTATION = ReferenceCallProcessor.REF_CALL_TAG_ANNOTATION
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
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
            rootStates.immutableCopy.forEach [ transformRootState ]
            /* Remove SCCharts declared as header files */
            rootStates.removeAll(rootStates.filter[hasAnnotation(REF_CALL_EXT_SCC_ANNOTATION)].toList)
        ]
    }
    
    protected def void transformRootState(State rootState) {
        rootState.allContainedStates.filter[isReferencing && isModuleCallReference].toList().forEach [ ref |
            /* Copy into model if imported. */
            if (!model.rootStates.exists[name == ref.reference.target.name]) {
                val newRootState = (ref.reference.target as State).copy => [ref.reference.target = it]
                model.rootStates.add(newRootState)
                newRootState.transformRootState
            } else {          
            }
            /* Get proxy class and create instance */
            val proxyClass = createOrGetProxyClass(ref)
            val instance = proxyClass.createValuedObject(REF_CALL_INSTANCE_PREFIX + ref.name).uniqueName
            /* Tranform referencing state to proxy superstate containing glue logic. */
            ref.createProxyState(proxyClass, instance,
                ref.reference.scope.hasAnnotation(REF_CALL_NON_INSTANTANEOUS_ANNOTATION))
            /* Remove original reference.
             * Could also keep the reference in order to link later but naming-based solution is more general
             * => external modules.
             */
            ref.reference = null
        ]
        rootState.declarations.filter(PolicyClassDeclaration).filter[hasAnnotation(REF_CALL_TAG_ANNOTATION)].forEach [
            cleanupDeclarations
        ]
    }

    protected def createProxyState(State ref, PolicyClassDeclaration proxyClass, ValuedObject instance,
        boolean delayed) {
        val region = ref.createControlflowRegion(ref.name)
        if (delayed) {
            region.createDelayedTransitions(ref, proxyClass, instance)
        } else {
            region.createInstantaneousTransitions(ref, proxyClass, instance)
        }
    }

    protected def createDelayedTransitions(ControlflowRegion region, State ref, PolicyClassDeclaration proxyClass,
        ValuedObject instance) {
        val init = region.createInitialState("I")
        val call = region.createState("C")
        val term = region.createFinalState("T")
        val conn = region.createState("connector") => [
            connector = true
        ]

        val tick_method = proxyClass.declarations.findFirst [
            valuedObjects.head.name == REF_CALL_TICK_METHOD_NAME
        ].valuedObjects.head
        val reset_method = proxyClass.declarations.findFirst [
            valuedObjects.head.name == REF_CALL_RESET_METHOD_NAME
        ].valuedObjects.head
        val cpin_method = proxyClass.declarations.findFirst [
            valuedObjects.head.name == REF_CALL_CPIN_METHOD_NAME
        ].valuedObjects.head
        val cpout_method = proxyClass.declarations.findFirst [
            valuedObjects.head.name == REF_CALL_CPOUT_METHOD_NAME
        ].valuedObjects.head
        val term_method = proxyClass.declarations.findFirst [
            valuedObjects.head.name == REF_CALL_TERM_METHOD_NAME
        ].valuedObjects.head

        init.createTransitionTo(call) => [
            delay = DelayType::IMMEDIATE

            effects.add(createReferenceCallEffect => [
                subReference = reset_method.reference
                valuedObject = instance
            ])
            effects.add(createReferenceCallEffect => [
                subReference = cpin_method.reference
                valuedObject = instance
                parameters.addAll(inputParamsFromBindings(ref, instance))
            ])
            effects.add(createReferenceCallEffect => [
                subReference = tick_method.reference
                valuedObject = instance
            ])
            effects.add(createReferenceCallEffect => [
                subReference = cpout_method.reference
                valuedObject = instance
                parameters.addAll(outputParamsFromBindings(ref, instance))
            ])
        ]

        call.createTransitionTo(conn) => [

            effects.add(createReferenceCallEffect => [
                subReference = cpin_method.reference
                valuedObject = instance
                parameters.addAll(inputParamsFromBindings(ref, instance))
            ])
            effects.add(createReferenceCallEffect => [
                subReference = tick_method.reference
                valuedObject = instance
            ])
            effects.add(createReferenceCallEffect => [
                subReference = cpout_method.reference
                valuedObject = instance
                parameters.addAll(outputParamsFromBindings(ref, instance))
            ])
        ]

        conn.createTransitionTo(term) => [
            delay = DelayType::IMMEDIATE

            trigger = createReferenceCall => [
                subReference = term_method.reference
                valuedObject = instance

            ]
        ]

        conn.createTransitionTo(call) => [delay = DelayType::IMMEDIATE]
    }

    protected def createInstantaneousTransitions(ControlflowRegion region, State ref, PolicyClassDeclaration proxyClass,
        ValuedObject instance) {
        val init = region.createInitialState("I")
        val call = region.createState("C")
        val dely = region.createState("D")
        val term = region.createFinalState("T")
        val conn = region.createState("connector") => [
            connector = true
        ]

        val tick_method = proxyClass.declarations.findFirst [
            valuedObjects.head.name == REF_CALL_TICK_METHOD_NAME
        ].valuedObjects.head
        val reset_method = proxyClass.declarations.findFirst [
            valuedObjects.head.name == REF_CALL_RESET_METHOD_NAME
        ].valuedObjects.head
        val cpin_method = proxyClass.declarations.findFirst [
            valuedObjects.head.name == REF_CALL_CPIN_METHOD_NAME
        ].valuedObjects.head
        val cpout_method = proxyClass.declarations.findFirst [
            valuedObjects.head.name == REF_CALL_CPOUT_METHOD_NAME
        ].valuedObjects.head
        val term_method = proxyClass.declarations.findFirst [
            valuedObjects.head.name == REF_CALL_TERM_METHOD_NAME
        ].valuedObjects.head

        init.createTransitionTo(call) => [
            delay = DelayType::IMMEDIATE

            effects.add(createReferenceCallEffect => [
                subReference = reset_method.reference
                valuedObject = instance
            ])
        ]

        call.createTransitionTo(conn) => [
            delay = DelayType::IMMEDIATE

            effects.add(createReferenceCallEffect => [
                subReference = cpin_method.reference
                valuedObject = instance
                parameters.addAll(inputParamsFromBindings(ref, instance))
            ])
            effects.add(createReferenceCallEffect => [
                subReference = tick_method.reference
                valuedObject = instance
            ])
            effects.add(createReferenceCallEffect => [
                subReference = cpout_method.reference
                valuedObject = instance
                parameters.addAll(outputParamsFromBindings(ref, instance))
            ])
        ]

        conn.createTransitionTo(term) => [
            delay = DelayType::IMMEDIATE

            trigger = createReferenceCall => [
                subReference = term_method.reference
                valuedObject = instance

            ]
        ]

        conn.createTransitionTo(dely) => [delay = DelayType::IMMEDIATE]

        dely.createTransitionTo(call)
    }

    protected def PolicyClassDeclaration createOrGetProxyClass(State ref) {
        val maybeDecl = ref.getClassDeclaration
        val decl = maybeDecl !== null
                ? maybeDecl as PolicyClassDeclaration
                : createPolicyClassDeclaration => [
                name = ref.reference.scope.name
                host = true

                // Declare interface variables
                declarations.addAll(ref.reference.scope.declarations.filter(VariableDeclaration).filter[input || output].map[copy])

                // Declare method placeholders.
                var tickDecl = createMethodImplementationDeclaration => [
                    it.createValuedObject(REF_CALL_TICK_METHOD_NAME)
                ]
                var resetDecl = createMethodImplementationDeclaration => [
                    it.createValuedObject(REF_CALL_RESET_METHOD_NAME)
                ]
                var cpinDecl = createMethodImplementationDeclaration => [ d |
                    d.createValuedObject(REF_CALL_CPIN_METHOD_NAME)
                    d.parameterDeclarations.addAll(it.declarations.filter(VariableDeclaration).filter[input].unroll)
                ]
                var cpoutDecl = createMethodImplementationDeclaration => [ d |
                    d.createValuedObject(REF_CALL_CPOUT_METHOD_NAME)
                    d.parameterDeclarations.addAll(it.declarations.filter(VariableDeclaration).filter[output].unroll)
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

                // Declare _TERM member
                declarations.add(createVariableDeclaration => [
                    type = ValueType::BOOL
                    valuedObjects.add(createValuedObject("_TERM"))
                ])

                ref.getRootState.declarations.add(it)

                // Add #include hostcode annotation
                ref.getRootState.annotations.add(
                    createStringAnnotation("hostcode-c-header", "#include \"" + ref.reference.scope.name + ".h\""))

                // Tag as module class
                it.annotations.add(createTagAnnotation(REF_CALL_TAG_ANNOTATION))
            ]
        return decl
    }

    protected def PolicyClassDeclaration getClassDeclaration(State ref) {
        val decls = ref.getRootState.declarations.filter(PolicyClassDeclaration)
        val result = decls.filter[name == ref.reference.scope.name]
        return result.head
    }

    protected def List<Parameter> filteredParamsFromBindings(State ref, ValuedObject instance,
        Function1<Binding, Boolean> predicate) {
        val bindings = ref.createBindings
        val parameters = <Parameter>newArrayList
        val classVarVOs = ref.classDeclaration.declarations.filter(VariableDeclaration).map[valuedObjects].flatten.
            toList
        for (binding : bindings.filter(predicate).sortBy [ b |
            classVarVOs.indexOf(classVarVOs.findFirst[name == b.targetValuedObject.name])
        ]) {
            parameters.add(createParameter => [
                // TODO guard against complex source expressions => undefined behavior
                expression = binding.sourceExpression.copy
            ])
        }

        return parameters
    }

    protected def boolean input(Binding binding) {
        return binding.targetValuedObject.input
    }

    protected def boolean output(Binding binding) {
        return binding.targetValuedObject.output
    }

    protected def List<Parameter> inputParamsFromBindings(State ref, ValuedObject instance) {
        return ref.filteredParamsFromBindings(instance, [input])
    }

    protected def List<Parameter> outputParamsFromBindings(State ref, ValuedObject instance) {
        return ref.filteredParamsFromBindings(instance, [output])
    }

    protected def ValuedObject getVarVOByName(PolicyClassDeclaration classDef, String varName) {
        val classDefs = classDef.declarations.filter(VariableDeclaration)
        val vos = classDefs.map[valuedObjects].flatten
        val filteredvos = vos.filter[name == varName]
        val result = filteredvos.head
        return result
    }

    protected def Iterable<VariableDeclaration> unroll(Iterable<VariableDeclaration> decls) {
        decls.map [ d |
            d.valuedObjects.map [ v |
                d.copy => [
                    valuedObjects.clear
                    valuedObjects.add(v.copy)
                ]
            ]
        ].flatten
    }

    protected def cleanupDeclarations(PolicyClassDeclaration proxyClass) {
        proxyClass.declarations.filter(VariableDeclaration).forEach [
            input = false
            output = false
        ]
        proxyClass.declarations.filter(MethodImplementationDeclaration).map[parameterDeclarations].flatten.forEach [
            (it as VariableDeclaration) => [
                input = false
                output = false
            ]
        ]
    }

}
