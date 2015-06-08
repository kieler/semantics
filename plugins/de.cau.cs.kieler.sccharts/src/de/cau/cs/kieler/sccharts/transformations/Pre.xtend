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

import com.google.common.collect.ImmutableList
import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.features.SCChartsFeature

import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.core.kexpressions.keffects.Emission

/**
 * SCCharts Pre Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class Pre extends AbstractExpansionTransformation implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::PRE_ID
    }

    override getName() {
        return SCChartsTransformation::PRE_NAME
    }

    override getExpandsFeatureId() {
        return SCChartsFeature::PRE_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet(SCChartsFeature::INITIALIZATION_ID)
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet()
    }

    //-------------------------------------------------------------------------
    @Inject
    extension KExpressionsExtension

    @Inject
    extension SCChartsExtension

    @Inject
    extension de.cau.cs.kieler.sccharts.features.Pre

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    private val nameCache = <String>newArrayList

    //-------------------------------------------------------------------------
    //--                        P R E -  O P E R A T O R                     --
    //-------------------------------------------------------------------------
    // Transforming PRE Operator.
    def State transform(State rootState) {
        val targetRootState = rootState.fixAllPriorities;

        // Traverse all states
        targetRootState.getAllStates.forEach [ targetState |
            targetState.transformPre(targetRootState);
        ]
        targetRootState.fixAllTextualOrdersByPriorities;
    }

    // Traverse all states that might declare a valuedObject that is used with the PRE operator
    def void transformPre(State state, State targetRootState) {

        // Filter all valuedObjects and retrieve those that are referenced
        val allActions = state.eAllContents.filter(typeof(Action));
        val allPreValuedObjects = state.valuedObjects.filter(
            valuedObject|
                allActions.filter(
                    action|
                        action.getPreExpression(valuedObject).hasNext ||
                            action.getPreValExpression(valuedObject).hasNext).hasNext);

        for (preValuedObject : ImmutableList::copyOf(allPreValuedObjects)) {
            preValuedObject.setDefaultTrace
            val newPre = state.createValuedObject(GENERATED_PREFIX + "pre" + GENERATED_PREFIX + preValuedObject.name).
                uniqueNameCached(nameCache)
            newPre.applyAttributes(preValuedObject)
            val newAux = state.createValuedObject(GENERATED_PREFIX + "aux" + GENERATED_PREFIX + preValuedObject.name).
                uniqueNameCached(nameCache)
            newAux.applyAttributes(preValuedObject)

            val preRegion = state.createControlflowRegion(GENERATED_PREFIX + "Pre").uniqueNameCached(nameCache)
            val preInit = preRegion.createInitialState(GENERATED_PREFIX + "Init").uniqueNameCached(nameCache).setFinal
            val preWait = preRegion.createFinalState(GENERATED_PREFIX + "Wait").uniqueNameCached(nameCache)

            //            val preDone = preRegion.createFinalState(GENERATED_PREFIX + "Done").uniqueName
            val transInitWait = preInit.createImmediateTransitionTo(preWait)
            transInitWait.addEffect(newAux.assign(preValuedObject.reference))

            val transWaitInit = preWait.createTransitionTo(preInit)
            transWaitInit.addEffect(newPre.assign(newAux.reference))

            //            val transWaitDone = preWait.createTransitionTo(preDone)
            //            transWaitDone.setTrigger()
            //            val transInitDone = preInit.createTransitionTo(preDone)
            // Replace the ComplexExpression Pre(S) by the ValuedObjectReference PreS in all actions            
            // Replace the ComplexExpression Pre(?S) by the OperatorExpression ?PreS in all actions            
            while (allActions.hasNext) {
                val action = allActions.next
                val preExpressions = action.getPreExpression(preValuedObject);
                val preValExpressions = action.getPreValExpression(preValuedObject);

                while (preExpressions.hasNext) {
                    val preExpression = preExpressions.next
                    val container = preExpression.eContainer;

                    if (container instanceof OperatorExpression) {

                        // If nested PRE or PRE inside another complex expression
                        (container as OperatorExpression).subExpressions.remove(preExpression);
                        (container as OperatorExpression).add(newPre.reference);
                    } else if (container instanceof Action) {

                        // If PRE directly a trigger
                        (container as Action).setTrigger(newPre.reference)
                    }
                }

                while (preValExpressions.hasNext) {
                    val preValExpression = preValExpressions.next
                    val container = preValExpression.eContainer;

                    if ((!preValExpression.subExpressions.nullOrEmpty) &&
                        preValExpression.subExpressions.get(0) instanceof OperatorExpression &&
                        (preValExpression.subExpressions.get(0) as OperatorExpression).operator == OperatorType::VAL) {

                        // Transform pre(?V) --> ?PreV
                        val valueExpression = preValExpression.subExpressions.get(0);
                        (valueExpression as OperatorExpression).subExpressions.remove(0);
                        (valueExpression as OperatorExpression).add(newPre.reference);
                        if (container instanceof Emission) {
                            (container as Emission).setNewValue(valueExpression.copy);
                        } else if (container instanceof OperatorExpression) {

                            // If nested PRE or PRE inside another complex expression
                            (container as OperatorExpression).subExpressions.remove(preValExpression);
                            (container as OperatorExpression).add(valueExpression.copy);
                        }
                    }

                }
            }

        }

    }

}
