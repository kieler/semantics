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
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.core.kexpressions.keffects.Assignment
import de.cau.cs.kieler.core.kexpressions.keffects.Emission
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup
import de.cau.cs.kieler.sccharts.features.SCChartsFeature

import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransformationExtension
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Transition

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
        return Sets.newHashSet(SCChartsFeature::COMPLEXFINALSTATE_ID, SCChartsFeature::INITIALIZATION_ID)
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(SCChartsFeatureGroup::EXPANSION_ID, SCChartsFeature::SIGNAL_ID)
    }

    //-------------------------------------------------------------------------

    @Inject
    extension KExpressionsComplexCreateExtensions
    
    @Inject
    extension SCChartsExtension

    @Inject
    extension SCChartsTransformationExtension

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
        // FIXME: getAllStates will return (at least!) the root state twice! fix this!
        // Woraround now: convert to a set
        for (targetState : targetRootState.getAllStates.toSet.immutableCopy) {
            //System.out.println("STATE: " + targetState + ", " + targetState.id)
            targetState.transformPre(targetRootState);
        }

        targetRootState.fixAllTextualOrdersByPriorities;
    }

    // Traverse all states that might declare a valuedObject that is used with the PRE operator
    def void transformPre(State state, State targetRootState) {
        state.setDefaultTrace
        
        // If the state has outgoing terminations, we need to finalize the during
        // actions in case we end the states over these transitions
         val outgoingTerminations = state.outgoingTransitions.filter(e|e.typeTermination)
         val hasOutgoingTerminations = outgoingTerminations.length > 0
         val complexPre = ((hasOutgoingTerminations || state.isRootState) && state.regionsMayTerminate)        

        // Filter all valuedObjects and retrieve those that are referenced
        val allActions = state.eAllContents.filter(typeof(Action)).toList;
        val allPreValuedObjects = state.valuedObjects.filter(
            valuedObject|
                allActions.filter(
                    action|
                        action.getPreExpression(valuedObject).hasNext ||
                            action.getPreValExpression(valuedObject).hasNext).size > 0).toList;

        var ControlflowRegion preRegion = null;
        var State preInit = null;
        var State preWait = null;
        var Transition transInitWait = null;
        var Transition transWaitInit = null;
        
		for (preValuedObject : allPreValuedObjects.immutableCopy) {
		    if (preRegion == null || preInit == null || preWait == null) {
		        allPreValuedObjects.setDefaultTrace
		        
		        preRegion = state.createControlflowRegion(GENERATED_PREFIX + "Pre").uniqueNameCached(nameCache)
		        preInit = preRegion.createInitialState(GENERATED_PREFIX + "Init").uniqueNameCached(nameCache)
                preWait = preRegion.createState(GENERATED_PREFIX + "Wait").uniqueNameCached(nameCache)
                if (complexPre) {
                    preWait.setFinal
                    preInit.setFinal
                }
                
                transInitWait = preInit.createImmediateTransitionTo(preWait);
                transWaitInit = preWait.createTransitionTo(preInit);
            }
		    
		    // Tracing
            preValuedObject.setDefaultTrace
            
            val newPre = state.createVariable(GENERATED_PREFIX + "pre" + GENERATED_PREFIX 
                + preValuedObject.name).setType(preValuedObject.getType).uniqueNameCached(nameCache)
            newPre.copyAttributes(preValuedObject)
            val newAux = state.createVariable(GENERATED_PREFIX + "reg" + GENERATED_PREFIX 
                + preValuedObject.name).setType(preValuedObject.getType).uniqueNameCached(nameCache)
            newAux.copyAttributes(preValuedObject)


            //            val preDone = preRegion.createFinalState(GENERATED_PREFIX + "Done").uniqueName
            transInitWait.addEffect(newAux.assign(preValuedObject.reference))

            transWaitInit.addEffect(newPre.assign(newAux.reference))

            //            val transWaitDone = preWait.createTransitionTo(preDone)
            //            transWaitDone.setTrigger()
            //            val transInitDone = preInit.createTransitionTo(preDone)
            // Replace the ComplexExpression Pre(S) by the ValuedObjectReference PreS in all actions            
            // Replace the ComplexExpression Pre(?S) by the OperatorExpression ?PreS in all actions            
            for (action : allActions) {
                val preExpressions = action.getPreExpression(preValuedObject);
                val preValExpressions = action.getPreValExpression(preValuedObject);

                while (preExpressions.hasNext) {
                    val preExpression = preExpressions.next
                    val container = preExpression.eContainer;

                    if (container instanceof OperatorExpression) {

                        // If nested PRE or PRE inside another complex expression
                        val i = (container as OperatorExpression).subExpressions.indexOf(preExpression)
                        (container as OperatorExpression).subExpressions.remove(preExpression);
                        (container as OperatorExpression).subExpressions.add(i, newPre.reference);
                    } else if (container instanceof Action) {

                        // If PRE directly a trigger
                        (container as Action).setTrigger(newPre.reference)
                    } else if (container instanceof Assignment) {

                        // If PRE directly a assigned value
                        (container as Assignment).expression = newPre.reference
                    } else if (container instanceof Emission) {

                        // If PRE directly an emitted value
                        (container as Emission).newValue = newPre.reference
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
