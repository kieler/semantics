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
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup
import de.cau.cs.kieler.sccharts.features.SCChartsFeature

import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.SCCharts


/**
 * SCCharts CountDelay Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class CountDelay extends AbstractExpansionTransformation implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::COUNTDELAY_ID
    }

    override getName() {
        return SCChartsTransformation::COUNTDELAY_NAME
    }

    override getExpandsFeatureId() {
        return SCChartsFeature::COUNTDELAY_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet(SCChartsFeature::DURING_ID, SCChartsFeature::ENTRY_ID)
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(SCChartsFeature::SUSPEND_ID, SCChartsFeatureGroup::EXPANSION_ID)
    }

    //-------------------------------------------------------------------------
    @Inject
    extension KExpressionsCreateExtensions
    
    @Inject
    extension KExpressionsComplexCreateExtensions
    
    @Inject
    extension KExpressionsDeclarationExtensions
    
    @Inject
    extension KExpressionsValuedObjectExtensions
    
    @Inject
    extension SCChartsExtension

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    //-------------------------------------------------------------------------
    //--                   C O U N T   D E L A Y                             --
    //-------------------------------------------------------------------------
    // ...
    def State transform(State rootState) {
        var targetRootState = rootState.fixAllPriorities;

        // Traverse all transitions
        for (targetTransition : targetRootState.getAllContainedTransitions) {
            targetTransition.transformCountDelay(targetRootState);
        }

        targetRootState.fixAllTextualOrdersByPriorities;
    }

    // This will encode count delays in transitions.
    def void transformCountDelay(Transition transition, State targetRootState) {
        if (transition.delay > 1) {
            transition.setDefaultTrace
            val sourceState = transition.sourceState
            val parentState = sourceState.parentRegion.parentState
            val counter = parentState.createValuedObject(GENERATED_PREFIX + "counter", createIntDeclaration).uniqueName

            //Add entry action
            val entryAction = sourceState.createEntryAction
            entryAction.addEffect(counter.assign(0.createIntValue))
            
            if (!transition.isImmediate2) {
                // Meeting 2016-11-09 Semantics Meetings (ssm)
                // https://rtsys.informatik.uni-kiel.de/confluence/pages/viewpage.action?pageId=20153744
                
                // In case of a delayed transition we decided to NOT "count" if the trigger evaluates to true in the "initial tick", i.e., the tick
                // when the state is entered 
                val entryAction2 = sourceState.createEntryAction
                entryAction2.addEffect(counter.assign((-1).createIntValue))
                entryAction2.setTrigger(transition.trigger.copy)
            }

            // The during action MUST be added to the PARENT state NOT the SOURCE state because
            // otherwise (for a strong abort) taking the strong abort transition would not be
            // allowed to be triggered from inside!
            // Add during action
            val duringAction = parentState.createImmediateDuringAction
            duringAction.setTrigger(transition.trigger)
            duringAction.addEffect(counter.assign(counter.reference.add((1.createIntValue))))

            // Modify original trigger
            // trigger := (counter == delay)
            val trigger = counter.reference.createEQExpression(transition.delay.createIntValue)
            transition.setTrigger(trigger)
            transition.setDelay(1)
        }
    }
    
    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }

}

