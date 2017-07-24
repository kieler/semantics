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
package de.cau.cs.kieler.sccharts.transformations

import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.UniqueNameCache
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.KEffectsFactory
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsUniqueNameExtensions
import de.cau.cs.kieler.sccharts.features.SCChartsFeature

import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*

/**
 * SCCharts Reference Transformation.
 * 
 * @author ssm
 * @kieler.design 2014-05-19 proposed 
 * @kieler.rating 2014-05-19 proposed yellow
 */
class Reference extends AbstractExpansionTransformation implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::REFERENCE_ID
    }

    override getName() {
        return SCChartsTransformation::REFERENCE_NAME
    }

    override getExpandsFeatureId() {
        return SCChartsFeature::REFERENCE_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet()
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet()
    }

    //-------------------------------------------------------------------------
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsComplexCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsUniqueNameExtensions
    
    private val nameCache = new UniqueNameCache

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"
    static val CONST_VO_PREFIX = "_literal"

    static private final String HOSTCODE_ANNOTATION = "alterHostcode"
    static private final String PROPAGATE_ANNOTATION = "propagate"
    
    static private final val CALLVO_NAME = GENERATED_PREFIX + "call" 
    private var callCounter = 0

    //-------------------------------------------------------------------------
    //--                        R E F E R E N C E                            --
    //-------------------------------------------------------------------------
    // ...
    
    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }
        
    def State transform(State rootState) {
        callCounter = 0
        
        // Traverse all referenced states
        rootState.allContainedStates.filter[referencedState].toList.forEach [
            transformReference(rootState)
        ]
        
        rootState
    }
    
    def void transformReference(State state, State rootState) {
        val referenceDeclaration = createReferenceDeclaration => [
            rootState.declarations += it
            reference = state.reference.scope
        ]
        val rVO = createValuedObject(CALLVO_NAME + callCounter).attachTo(referenceDeclaration)
        callCounter++
        
        val callRegion = state.createControlflowRegion("")
        val crInitial = callRegion.createInitialState(GENERATED_PREFIX + "init")
        val crFinal = callRegion.createState(GENERATED_PREFIX + "do")
        val crTransition = crInitial.createImmediateTransitionTo(crFinal)
        crFinal.createTransitionTo(crInitial) 
        
        val crAction = KEffectsFactory.eINSTANCE.createReferenceCallEffect 
        crAction.valuedObject = rVO
        state.reference.parameters.forEach[ crAction.parameters += it.copy ]
        
        crTransition.addEffect(crAction)       
        
        state.reference = null    
        state.reference.parameters.removeIf[true] 
    }

    def void transformReference2(State state, State targetRootState) {        
        state.setDefaultTrace
        // Referenced scopes are always SCCharts
        // Each referenced state must be contained in a region.
        val newState = (state.reference.scope as State).copyState => [
            state.parentRegion.states += it
            id = state.id
            label = state.label
        ]

/*        var newStateIterator = newState.eAllContents
        while (newStateIterator.hasNext) {
            val eObject = newStateIterator.next
            if (eObject instanceof Assignment || eObject instanceof ValuedObjectReference ||
                eObject instanceof TextExpression || eObject instanceof Binding) {
                for (binding : state.bindings) {
                    if (eObject instanceof Emission) {
                        val emission = (eObject as Emission);
                        val emissionCopy = emission.nontracingCopy;
                        if (emission.valuedObject.name == binding.formal.name) {
                            emission.valuedObject = binding.actual
                        }
                    } else if (eObject instanceof Assignment) {
                        val assignment = (eObject as Assignment);
                        val assignmentCopy = assignment.nontracingCopy;
                        if ((assignment.valuedObject.declaration.input ||
                             assignment.valuedObject.declaration.output)
                            && assignment.valuedObject.name == binding.formal.name) {
                            assignment.valuedObject = binding.actual
                            assignment.indices.clear
                            for (index : assignmentCopy.indices) {
                                assignment.indices.add(index.nontracingCopy.rtrace(binding));
                            }
                            
                            // Use binding indices when bind to scalar.
                            if (binding.indices.size > 0 && assignment.indices.size == 0) {
                                assignment.indices.clear
                                for(index : binding.indices) {
                                    assignment.indices.add(index.nontracingCopy.rtrace(binding))
                                }                                
                            }                        
                        }
                    } else if (eObject instanceof ValuedObjectReference) {
                        val valuedObjectReference = (eObject as ValuedObjectReference);
                        val valuedObjectReferenceCopy = valuedObjectReference.nontracingCopy
                        if ((valuedObjectReference.valuedObject.declaration.input ||
                             valuedObjectReference.valuedObject.declaration.output)
                            && valuedObjectReference.valuedObject.name.equals(binding.formal.name)) {
                            
                            if (binding.actual != null) {
                                valuedObjectReference.valuedObject = binding.actual 
                                // This should be handled by copyState.
                                // However, we need more testing for bindings with arrays.
    //                            valuedObjectReference.indices.clear
    //                            for (index : valuedObjectReferenceCopy.indices) {
    //                                valuedObjectReference.indices.add(index.nontracingCopy.rtrace(binding));
    //                            }
    
                                if (binding.indices.size > 0) {
                                    valuedObjectReference.indices.clear
                                    for(index : binding.indices) {
                                        valuedObjectReference.indices.add(index.nontracingCopy.rtrace(binding))
                                    }                                
                                }
                            } else { // bind to literal
                                val newConstVO = createValuedObject(CONST_VO_PREFIX + binding.value.hashCode) => [
                                    initialValue = binding.value.copy
                                ]
                                binding.value.createDeclaration.attach(newConstVO) => [
                                    const = true
                                    newState.declarations += it 
                                ]
                                valuedObjectReference.valuedObject = newConstVO
                            }
                        }
                    } else if (eObject instanceof Binding) {
                        val bing = eObject as Binding
                        if ((bing.actual.declaration.input ||
                             bing.actual.declaration.output)
                            && bing.actual.name == binding.formal.name) {
                            bing.actual = binding.actual
                            for(index : binding.indices) {
                                bing.indices.add(index.nontracingCopy.rtrace(binding))
                            }
                        }
                    } else if (eObject instanceof TextExpression) {
                        if (binding.hasAnnotation(HOSTCODE_ANNOTATION)) {
                            val texp = (eObject as TextExpression)
                            texp.text = texp.text.replaceAll(binding.formal.name, binding.actual.name)
                        }
                    }
                }
            }
        }

        state.bindings.forEach [ binding |
            if (binding.hasAnnotation(PROPAGATE_ANNOTATION)) {
                propagatedBindings.put(binding.formal.name, binding)
            }
            newState.declarations.immutableCopy.forEach [
                val bindingName = binding.formal.name
                val objects = valuedObjects.filter[name.equals(bindingName)].toList
                objects.immutableCopy.forEach[delete]
            ]
        ]

        newState.variableDeclarations.immutableCopy.forEach [ declaration |
            if (declaration.isInput || declaration.isOutput) {
                declaration.valuedObjects.forEach [
                    val newObject = (newState.eContainer as Scope).findValuedObjectByName(name)
                    if (newObject != null) {
                        newState.replaceAllOccurrences(it, newObject)
                    } else {
                        val propagatedName = name.findPropagatedName
                        if (!propagatedName.nullOrEmpty) {
                            val propagatedNewObject = (newState.eContainer as Scope).
                                findValuedObjectByName(propagatedName)
                            newState.replaceAllOccurrences(it, propagatedNewObject)
                        }
                    }
                ]
                declaration.delete
            }
        ]

        state.incomingTransitions.immutableCopy.forEach[targetState = newState]
        state.outgoingTransitions.immutableCopy.forEach[sourceState = newState]

        newState => [
            initial = state.initial
            ^final = state.^final
        ]

        state.remove

        newState.allContainedStates.filter[referencedState].immutableCopy.forEach [
            transformReference(newState)
        ]
        * */
    }

    
}
