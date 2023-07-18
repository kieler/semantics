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
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.sccharts.processors.SCChartsProcessor
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.ValuedObject

/**
 * SCCharts CountDelay Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class CountDelay extends SCChartsProcessor implements Traceable {

    public static val IProperty<Boolean> COUNT_DELAY_ENABLE_STRUCTUREBASED = 
        new Property<Boolean>("de.cau.cs.kieler.sccharts.countDelay.structurebased", false)   

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.countDelay"
    }

    override getName() {
        "Count Delay"
    }

    override process() {
        setModel(model.transform)
    }


    //-------------------------------------------------------------------------
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsComplexCreateExtensions
    @Inject extension KEffectsExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension AnnotationsExtensions

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_cd"
    

    //-------------------------------------------------------------------------
    //--                   C O U N T   D E L A Y                             --
    //-------------------------------------------------------------------------
    // ...
    def State transform(State rootState) {
        // Traverse all transitions
        for (targetTransition : rootState.getAllContainedTransitions.toList) {
            targetTransition.transformCountDelay(rootState);
        }
        rootState
    }

    // This will encode count delays in transitions.
    def void transformCountDelay(Transition transition, State targetRootState) {
        val triggerDelay = transition.triggerDelay;
        if (triggerDelay <= 1) {
            return
        }
        
        if (environment.getProperty(COUNT_DELAY_ENABLE_STRUCTUREBASED) && 
            transition.sourceState.simple && transition.sourceState.outgoingTransitions.filter[ it.triggerDelay > 1].size == 1
        ) {
            transition.transformCountDelayStructurally(targetRootState)
            return
        }
        
        transition.setDefaultTrace
        val sourceState = transition.sourceState
        val parentState = sourceState.parentRegion.parentState
        val counter = parentState.createValuedObject(GENERATED_PREFIX + "counter", createIntDeclaration).uniqueName
        voStore.update(counter, SCCHARTS_GENERATED)
        
        verificationHack(counter, triggerDelay)

        //Add entry action
        val entryAction = sourceState.createEntryAction
        entryAction.addEffect(counter.createAssignment(0.createIntValue))
        entryAction.addTagAnnotation(Deferred.DO_NOT_DEFER)

        // Pre allows to put the during action in the source state and not in the parent state
        // Add during action
        val duringAction = sourceState.createDuringAction
        // Meeting 2016-11-09 Semantics Meetings (ssm)
        // https://rtsys.informatik.uni-kiel.de/confluence/pages/viewpage.action?pageId=20153744
        // In case of a delayed transition we decided to NOT "count" if the trigger evaluates to true in the "initial tick".
        // i.e., the tick when the state is entered 
        duringAction.immediate = transition.implicitlyImmediate
        duringAction.setTrigger(transition.trigger.copy)
        duringAction.addEffect(counter.createAssignment(counter.reference.add((1.createIntValue))))

        // Modify original trigger
        // trigger := (pre(counter) == delay - 1) && trigger
        val trigger = createLogicalAndExpression(
            createEQExpression(
                createOperatorExpression(OperatorType.PRE) => [
                    subExpressions += counter.reference
                ],
                (transition.triggerDelay - 1).createIntValue
            ),
            transition.trigger
        )
        transition.setTrigger(trigger)
        transition.setTriggerDelay(1)
    }
    
    def void transformCountDelayStructurally(Transition transition, State targetRootState) {
        val createdTransitions = <Transition> newHashSet => [ it += transition ]
        val immediate = transition.implicitlyImmediate
        val priority = transition.priority
        val int count = transition.triggerDelay
        val source = transition.sourceState
        var State lastState = source
        for (i : 2..count) {
            val newState = source.parentRegion.createState(GENERATED_PREFIX + source.name + i)
            val otherTransitions = source.outgoingTransitions.filter[ !createdTransitions.contains(it) ].toList
            for (t : otherTransitions) {
                val transitionCopy = t.copy
                transitionCopy.sourceState = newState
                transitionCopy.targetState = t.targetState
            }
            
            val prevState = lastState
            transition.copy => [
                sourceState = prevState
                targetState = newState
                triggerDelay = 1
                effects.immutableCopy.forEach[ it.remove ]
                setSpecificPriority(priority)
                delay = DelayType.DELAYED
                
                createdTransitions += it
            ]
            lastState = newState
        }
        
        transition.sourceState = lastState
        transition.triggerDelay = 1
        transition.delay = DelayType.DELAYED
        transition.setSpecificPriority(priority)
        
        // Immediate count delay
        source.outgoingTransitions.findFirst[createdTransitions.contains(it)].immediate = immediate
    }

    // This will encode count delays in transitions.
    def void transformCountDelay_NoPre(Transition transition, State targetRootState) {
        if (transition.triggerDelay > 1) {
            transition.setDefaultTrace
            val sourceState = transition.sourceState
            val parentState = sourceState.parentRegion.parentState
            val counter = parentState.createValuedObject(GENERATED_PREFIX + "counter", createIntDeclaration).uniqueName

            //Add entry action
            val entryAction = sourceState.createEntryAction
            entryAction.addEffect(counter.createAssignment(0.createIntValue))
            
            if (!transition.implicitlyImmediate) {
                // Meeting 2016-11-09 Semantics Meetings (ssm)
                // https://rtsys.informatik.uni-kiel.de/confluence/pages/viewpage.action?pageId=20153744
                
                // In case of a delayed transition we decided to NOT "count" if the trigger evaluates to true in the "initial tick", i.e., the tick
                // when the state is entered 
                val entryAction2 = sourceState.createEntryAction
                entryAction2.addEffect(counter.createAssignment((-1).createIntValue))
                entryAction2.setTrigger(transition.trigger.copy)
            }

            // The during action MUST be added to the PARENT state NOT the SOURCE state because
            // otherwise (for a strong abort) taking the strong abort transition would not be
            // allowed to be triggered from inside!
            // Add during action
            val duringAction = parentState.createImmediateDuringAction
            duringAction.setTrigger(transition.trigger)
            duringAction.addEffect(counter.createAssignment(counter.reference.add((1.createIntValue))))

            // Modify original trigger
            // trigger := (counter == delay)
            val trigger = counter.reference.createEQExpression(transition.triggerDelay.createIntValue)
            transition.setTrigger(trigger)
            transition.setTriggerDelay(1)
        }
    }
    
    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }
    
    /**
     * This hacks some verification adaption into this transformation without introducing a dependency to kieler.verification
     */
    private def verificationHack(ValuedObject counter, int triggerDelay) {
        try {
            // Add range assumption for verification
            compilationContext.startEnvironment.allProperties.forEach[p1, p2|
                if(p1.id.equals("de.cau.cs.kieler.verification.context")) {
                    p2.class.getMethod("addRangeAssumtion", ValuedObject, int, int).invoke(p2, counter, 0, triggerDelay)
                }
            ]
        } catch (Exception e) {
            environment.errors.add(new Exception("Range assumption could not be copied for CountDelay"))
        }
    }

}
