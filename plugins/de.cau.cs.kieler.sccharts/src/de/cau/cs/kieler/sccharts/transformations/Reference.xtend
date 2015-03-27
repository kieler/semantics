/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.sccharts.Assignment
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.core.kexpressions.TextExpression
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.sccharts.Binding
import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.sccharts.features.SCChartsFeature
import com.google.common.collect.Sets
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup

/**
 * SCCharts Reference Transformation.
 * 
 * @author ssm
 * @kieler.design 2014-05-19 proposed 
 * @kieler.rating 2014-05-19 proposed yellow
 */
class Reference extends Transformation {

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

        // TODO: Check
        return Sets.newHashSet()
    }

    override getNotHandlesFeatureIds() {

        // TODO: Check
        return Sets.newHashSet()
    }

    //-------------------------------------------------------------------------
    @Inject
    extension KExpressionsExtension

    @Inject
    extension AnnotationsExtensions

    @Inject
    extension SCChartsExtension

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    static private final String HOSTCODE_ANNOTATION = "alterHostcode"
    static private final String PROPAGATE_ANNOTATION = "propagate"

    private val propagatedBindings = <String, Binding>newHashMap

    //-------------------------------------------------------------------------
    //--                        R E F E R E N C E                            --
    //-------------------------------------------------------------------------
    // ...
    def State transform(State rootState) {
        val targetRootState = rootState.fixAllPriorities;

        // Traverse all referenced states
        targetRootState.allContainedStates.filter[referencedState].toList.immutableCopy.forEach [
            transformReference(targetRootState)
        ]
        
        targetRootState;
    }

    def void transformReference(State state, State targetRootState) {

        // Referenced scopes are always SCCharts
        // Each referenced state must be contained in a region.
        val newState = (state.referencedScope as State).copyState => [
            state.parentRegion.states += it
            id = state.id
            label = state.label
        ]

        var newStateIterator = newState.eAllContents
        while (newStateIterator.hasNext) {
            val eObject = newStateIterator.next
            if (eObject instanceof Assignment || eObject instanceof ValuedObjectReference ||
                eObject instanceof TextExpression || eObject instanceof Binding) {
                for (binding : state.bindings) {
                    if (eObject instanceof Assignment) {
                        val assignment = (eObject as Assignment);
                        val assignmentCopy = assignment.copy;
                        if (assignment.valuedObject.name == binding.formal.name) {
                            assignment.valuedObject = binding.actual
                        }
                        assignment.indices.clear
                        for (index : assignmentCopy.indices) {
                            assignment.indices.add(index.copy);
                        }
                    } else if (eObject instanceof ValuedObjectReference) {
                        val valuedObjectReference = (eObject as ValuedObjectReference);
                        val valuedObjectReferenceCopy = valuedObjectReference.copy
                        if (valuedObjectReference.valuedObject.name == binding.formal.name) {
                            valuedObjectReference.valuedObject = binding.actual
                        }
                        valuedObjectReference.indices.clear
                        for (index : valuedObjectReferenceCopy.indices) {
                            valuedObjectReference.indices.add(index.copy);
                        }
                    } else if (eObject instanceof Binding) {
                        val bing = eObject as Binding
                        if (bing.actual.name == binding.formal.name) {
                            bing.actual = binding.actual
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
                val objects = valuedObjects.filter[name == bindingName].toList
                objects.immutableCopy.forEach[delete]
            ]
        ]

        newState.declarations.immutableCopy.forEach [ declaration |
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

        newState.allContainedStates.filter[referencedState].toList.immutableCopy.forEach [
            transformReference(newState)
        ]
    }

    private def String findPropagatedName(String name) {
        var newName = name

        for (k : propagatedBindings.keySet) {
            if (k == name) {
                newName = propagatedBindings.get(k).actual.name
                return newName.findPropagatedName
            }
        }

        newName
    }

}
