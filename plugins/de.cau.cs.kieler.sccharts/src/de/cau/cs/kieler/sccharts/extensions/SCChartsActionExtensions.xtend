/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.extensions

import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.sccharts.LocalAction
import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.kexpressions.keffects.Effect
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.ExitAction
import de.cau.cs.kieler.sccharts.SuspendAction
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsReplacementExtensions

/**
 * @author ssm
 * @kieler.design 2017-06-28 proposed 
 * @kieler.rating 2017-06-28 proposed yellow 
 *
 */
class SCChartsActionExtensions {
    
    @Inject extension KExpressionsReplacementExtensions
    @Inject extension KEffectsExtensions
    
    def setImmediate(Action action) {
        action => [ delay = DelayType.IMMEDIATE ]
    }

    def setImmediate(Action action, boolean immediate) {        
        action => [ delay = if (immediate) DelayType.IMMEDIATE else DelayType.UNDEFINED ]
    }

    def setNotImmediate(Action action) {
        action => [ delay = DelayType.UNDEFINED ]
    }
    
    def isImmediate(Action action) {
        action.delay == DelayType.IMMEDIATE
    }

    def getAllContainedEmissions(Action action) {
        action.eAllContents().filter(Emission)
    }

    def getAllContainedAssignments(Action action) {
        action.eAllContents().filter(Assignment)
    }

    def addEffect(Action action, Effect effect) {
        effect => [ action.effects += it ]
    }  
    
    def addEffectBefore(Action action, Effect effect) {
        action => [ effects.add(0, effect) ]
    }
    
    def clearEffects(Action action) {
        action => [ effects.clear ]
    }

    // superfluous, just for transformation code naming reasons
    def addEmission(Action action, Emission emission) {
        emission => [ action.addEffect(emission) ]
    }

    def createDuringAction(Scope scope) {
        SCChartsFactory::eINSTANCE.createDuringAction => [ scope.actions += it ]
    }

    // was retrieveDuringAction
    def getOrCreateDuringAction(Scope scope, boolean immediate) {
        val duringActions = scope.duringActions.filter[ it.immediate == immediate ]
        if (!duringActions.empty) { return duringActions.head }
        scope.createDuringAction => [ it.immediate = immediate ]
    }

    // Create an immediate during action for a state.
    def createImmediateDuringAction(Scope scope) {
        scope.createDuringAction => [ immediate = true ]
    }

    def createEntryAction(Scope scope) { 
        SCChartsFactory::eINSTANCE.createEntryAction => [ scope.actions += it ]
    }
    
    def createEntryAction(Scope scope, int index) {
        SCChartsFactory::eINSTANCE.createEntryAction => [ scope.actions.add(index, it) ]
    }    

    def createImmediateEntryAction(Scope scope) {
        scope.createEntryAction => [ immediate = true ]
    }
    
    def createImmediateEntryAction(Scope scope, int index) {
        scope.createEntryAction(index) => [ immediate = true ]
    }    

    def createExitAction(Scope scope) {
        SCChartsFactory::eINSTANCE.createExitAction => [ scope.actions += it ]
    }

    def createImmediateExitAction(Scope scope) {
        scope.createExitAction => [ immediate = true]
    }

    def createSuspendAction(Scope scope) {
        SCChartsFactory::eINSTANCE.createSuspendAction => [ scope.actions += it ]
    }

    def createImmediateSuspendAction(Scope scope) {
        scope.createSuspendAction => [ immediate = true ]
    }

    def getEntryActions(Scope scope) {
        scope.actions.filter(EntryAction)
    }
    
    def getDuringActions(Scope scope) {
        scope.actions.filter(DuringAction)
    }

    def getExitActions(Scope scope) {
        scope.actions.filter(ExitAction)
    }

    def getSuspendActions(Scope scope) {
        scope.actions.filter(SuspendAction)
    }

    // These are actions that expand to INNER content like during or exit actions.
    def boolean containsInnerActions(State state) {
        return (!state.duringActions.nullOrEmpty || !state.exitActions.nullOrEmpty || !state.entryActions.nullOrEmpty)
    }    
    
    def LocalAction applyAttributes(LocalAction localAction, LocalAction locationActionWithAttributes) {
        localAction.setImmediate(locationActionWithAttributes.isImmediate)
        localAction.setDelay(locationActionWithAttributes.delay)
        localAction.setLabel(locationActionWithAttributes.label)
        localAction.setTrigger(locationActionWithAttributes.trigger)
        localAction.effects.clear
        for (effect : locationActionWithAttributes.effects) {
            localAction.addEffect(effect.copy)
        }
        localAction
    }
    
    def addAssignment(Action action, Assignment assignment) {
        assignment => [ action.addEffect(it) ]
    }    
    
    def createAssignment(Action action, ValuedObject valuedObject) {
        valuedObject.createAssignment => [ action.addAssignment(it) ]
    }
      
//  superfluous, see KEffectsExtensions
//    def createAssignment(ValuedObject valuedObject, Expression expression) {
//        valuedObject.createAssignment => [ it.expression = expression ]
//    }  
    
    def createAssignment(Action action, ValuedObject valuedObject, Expression newValue) {
        valuedObject.createAssignment(newValue) => [ action.addAssignment(it) ]
    }      
    
        def Emission createEmission(Action action, ValuedObject valuedObject) {
        val emission = valuedObject.emit
        action.addEmission(emission)
        emission
    }
    
    def Emission createEmission(Action action, ValuedObject valuedObject, Expression newValue) {
        valuedObject.createEmission(newValue) => [ action.addEmission(it) ]
    }    
    
    def void replace(Action action, Expression searchExpression, Expression replaceExpression) {
        action.setTrigger(action.trigger.replace(searchExpression, replaceExpression))
    }    
}