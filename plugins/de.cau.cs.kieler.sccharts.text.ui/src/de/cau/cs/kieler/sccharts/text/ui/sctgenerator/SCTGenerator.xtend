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
package de.cau.cs.kieler.sccharts.text.ui.sctgenerator

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import java.io.IOException
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import de.cau.cs.kieler.core.kexpressions.keffects.Assignment
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsExtensions
import org.eclipse.emf.ecore.EObject

/**
 * @author ssm
 * 
 */
class SCTGenerator {

    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCChartsExtension

    private static val ID_PREFIX = "model"
    private static val STATE_PREFIX = "S"
    private static val REGION_PREFIX = "R"
    private static val INPUT_PREFIX = "I"
    private static val OUTPUT_PREFIX = "O"

    private static val MODEL_EXTENSION = "sct"

    def createModels(de.cau.cs.kieler.sccharts.text.ui.sctgenerator.SCTGeneratorDialog dialog, IProject project) {

        val job = new Job("Creating Models") {

            override protected run(IProgressMonitor monitor) {
                val numberOfModels = dialog.numberOfModels
                monitor.beginTask("Creating Models", numberOfModels)
                for (var int i = 0; i < numberOfModels; i++) {
                    var String is = "" + i
                    while (is.length < numberOfModels.toString.length) {
                        is = "0" + is
                    }
                    createModel(dialog, project, ID_PREFIX + is)
                    if (i % 2 == 0) {
                        monitor.worked(2)
                    }
                    if (monitor.canceled) {
                        return Status.CANCEL_STATUS
                    }
                }
                project.refreshLocal(1, monitor)
                return Status.OK_STATUS
            }

        }

        job.setUser(true)
        job.schedule
    }

    private def createModel(de.cau.cs.kieler.sccharts.text.ui.sctgenerator.SCTGeneratorDialog dialog, IProject project,
        String id) {
        var int statesLeft = random(dialog.numberOfStatesMin, dialog.numberOfStatesMax)
        val int inputs = random(dialog.numberOfInputsMin, dialog.numberOfInputsMax)
        val int outputs = random(dialog.numberOfInputsMin, dialog.numberOfInputsMax)

        val rootState = createSCChart => [
            it.id = id
            it.label = id
            it.declarations += createDeclaration(ValueType.BOOL) => [
                input = true
                for (var int i = 0; i < inputs; i++) {
                    val j = i
                    it.valuedObjects += createValuedObject => [it.name = INPUT_PREFIX + j]
                }
            ]
            it.declarations += createDeclaration(ValueType.BOOL) => [
                output = true
                for (var int i = 0; i < outputs; i++) {
                    val j = i
                    it.valuedObjects += createValuedObject => [it.name = OUTPUT_PREFIX + j]
                }
            ]
        ]

        rootState.createRegions(dialog, 0, statesLeft)

        rootState.saveModel(project)
    }

    private def createRegions(State state, de.cau.cs.kieler.sccharts.text.ui.sctgenerator.SCTGeneratorDialog dialog,
        int hierarchy, int statesLeft) {
        val regionCount = 1 + dialog.chanceForConcurrency.chance(dialog.maxConcurrency)

        var regionStateCounter = statesLeft
        for (var int i = 0; i < regionCount; i++) {
            var regionStateCount = regionStateCounter
            if (i < regionCount - 1) {
                regionStateCount = random(2, regionStateCounter / regionCount)
            }
            val region = createControlflowRegion(state, REGION_PREFIX + i)
            region.createStates(dialog, hierarchy + 1, regionStateCount)

            val states = region.states.filter[final != true].toList

            for (s : states) {
                val int transitions = 1 + dialog.chanceForNewTransition.chance(dialog.maxTransitions)
                for (var int t = 1; t < transitions; t++) {
                    s.createTransition(states.get(states.size.random)) =>
                        [
                            it.createTransitionTrigger(dialog)
                            it.createTransitionEffects(dialog)
                            if (dialog.chanceForImmediate.chance) {
                                if ((it.eContainer.asState != it.targetState) &&
                                    !((it.eContainer.asState.incomingTransitions.filter[immediate].size > 0) &&
                                        (it.targetState.outgoingTransitions.filter[immediate].size > 0))) {
                                    it.immediate = true
                                }
                            }
                        ]
                }
            }
        }
    }

    private def createStates(ControlflowRegion region,
        de.cau.cs.kieler.sccharts.text.ui.sctgenerator.SCTGeneratorDialog dialog, int hierarchy, int statesLeft) {
        var stateCounter = 0

        var lastState = region.createState(STATE_PREFIX + stateCounter) => [initial = true]
        stateCounter++

        while (stateCounter + 1 < statesLeft) {
            var newState = region.createState(STATE_PREFIX + stateCounter)

            stateCounter++

            if (dialog.chanceForSuperstate.chance && stateCounter + 2 < statesLeft) {
                val stateCost = random(1, statesLeft - 1)
                newState.createRegions(dialog, hierarchy, stateCost)
                stateCounter += stateCost
            }

            lastState.createTransition(newState) => [
                it.createTransitionTrigger(dialog)
                it.createTransitionEffects(dialog)
            ]

            lastState = newState
        }

        var newState = region.createState(STATE_PREFIX + stateCounter) => [final = true]
        lastState.createTransition(newState) => [
            it.createTransitionTrigger(dialog)
            it.createTransitionEffects(dialog)
        ]
    }

    private def createTransitionTrigger(Transition transition,
        de.cau.cs.kieler.sccharts.text.ui.sctgenerator.SCTGeneratorDialog dialog) {
        val triggerDepth = dialog.chanceForExpressions.chance(dialog.maxExpressionDepth)
        if(triggerDepth == 0) return transition

        val rootState = (transition.eContainer as State).getRootState
        transition.trigger = createTriggerExpression(rootState.declarations.filter[input == true].head, triggerDepth)
        transition
    }

    private def Expression createTriggerExpression(Declaration declaration, int triggerDepth) {
        if (triggerDepth > 1) {
            createOperatorExpression => [
                it.operator = if(Math.random < 0.5) OperatorType.LOGICAL_AND else OperatorType.LOGICAL_OR
                it.subExpressions += createTriggerExpression(declaration, triggerDepth - 1)
                it.subExpressions += createTriggerExpression(declaration, triggerDepth - 1)
            ]
        } else {
            declaration.valuedObjects.get(declaration.valuedObjects.size.random).reference
        }
    }

    private def createTransitionEffects(Transition transition,
        de.cau.cs.kieler.sccharts.text.ui.sctgenerator.SCTGeneratorDialog dialog) {
        var effectCount = dialog.chanceForExpressions.chance(dialog.maxExpressionDepth)
        if(effectCount == 0) return transition

        val rootState = (transition.eContainer as State).getRootState
        for (var int i = 0; i < effectCount; i++) {
            transition.effects += createEffectExpression(rootState.declarations.filter[output == true].head)
        }
        transition
    }

    private def Assignment createEffectExpression(Declaration declaration) {
        createAssignment(
            declaration.valuedObjects.get(declaration.valuedObjects.size.random),
            if(Math.random < 0.5) TRUE else TRUE
        )
    }

    private def saveModel(State rootState, IProject project) {
        var output = URI.createURI(project.locationURI.toString() + "/" + rootState.id);
        output = output.appendFileExtension(MODEL_EXTENSION);

        try {
            val resSet = new ResourceSetImpl();
            val saveRes = resSet.createResource(output);

            saveRes.getContents().add(rootState);
            saveRes.save(null)
        } catch (IOException e) {
            throw new ExecutionException("Cannot write output model file: " + e.getMessage());
        }
    }

    private def int random(int min, int max) {
        (min + (max + 1 - min) * Math.random) as int
    }

    private def int random(int count) {
        (count * Math.random) as int
    }

    private def boolean chance(double rnd) {
        Math.random < rnd
    }

    private def int chance(double rnd, int max) {
        var count = 0
        var boolean repeat
        do {
            repeat = false
            if (rnd.chance && count < max) {
                count++
                repeat = true
            }
        } while (repeat)
        count
    }

    private def createTransition(State sourceState, State targetState) {
        var transition = SCChartsFactory::eINSTANCE.createTransition()
        transition.targetState = targetState
        sourceState.outgoingTransitions += transition
        transition
    }

    private def asState(EObject obj) {
        obj as State
    }

}
