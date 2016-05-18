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
package de.cau.cs.kieler.sccharts.text.ui.SCTGenerator

import org.eclipse.core.runtime.jobs.Job
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.State
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.core.resources.IProject
import java.io.IOException
import org.eclipse.core.commands.ExecutionException
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions

/**
 * @author ssm
 * 
 */
class SCTGenerator {

    @Inject extension KExpressionsDeclarationExtensions
    
    @Inject extension KExpressionsValuedObjectExtensions

    @Inject extension SCChartsExtension

    private static val ID_PREFIX = "model"
    private static val STATE_PREFIX = "S"
    private static val REGION_PREFIX = "R"
    private static val INPUT_PREFIX = "I"
    private static val OUTPUT_PREFIX = "O"
    
    private static val MODEL_EXTENSION = "sct"

    def createModels(SCTGeneratorDialog dialog, IProject project) {

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
                    monitor.worked(1)
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




    private def createModel(SCTGeneratorDialog dialog, IProject project, String id) {
        var int statesLeft = random(dialog.numberOfStatesMin, dialog.numberOfStatesMax)
        val int inputs = random(dialog.numberOfInputsMin, dialog.numberOfInputsMax)
        val int outputs = random(dialog.numberOfInputsMin, dialog.numberOfInputsMax)
        
        val rootState = createSCChart => [
            it.id = id
            it.label = id
            it.declarations += createDeclaration(ValueType.BOOL) => [
                input = true
                for(var int i = 0; i < inputs; i++) { 
                    val j = i 
                    it.valuedObjects += createValuedObject => [ it.name = INPUT_PREFIX + j ]
                }
            ]
            it.declarations += createDeclaration(ValueType.BOOL) => [
                output = true
                for(var int i = 0; i < outputs; i++) { 
                    val j = i 
                    it.valuedObjects += createValuedObject => [ it.name = OUTPUT_PREFIX + j ]
                }
            ]
        ]
        
        
        rootState.createRegions(dialog, 0, statesLeft)

        rootState.saveModel(project)
    }
    
    
    private def createRegions(State state, SCTGeneratorDialog dialog, int hierarchy, int statesLeft) {
        var regionCount = 1
        var repeat = false
        do {
            repeat = false
            if (dialog.chanceForConcurrency.chance && regionCount < dialog.maxConcurrency) {
                regionCount++
                repeat = true
            }
        } while (repeat)
        
        var regionStateCounter = statesLeft
        for(var int i = 0; i < regionCount; i++) {
            var regionStateCount = regionStateCounter
            if (i < regionCount - 1) {
                regionStateCount = random(2, regionStateCounter / regionCount)
            }
            val region = createControlflowRegion(state, REGION_PREFIX + i)
            region.createStates(dialog, hierarchy + 1, regionStateCount)
            
            val states = region.states.toList
            
//            for (s : states) {
//                val int transitions = random(dialog.numberOfTransitionsMin, dialog.numberOfTransitionsMax)
//                for(var int t = 1; t < transitions; t++) {
//                    val transition = s.createTransitionTo(s)
//                    if (dialog.chanceForImmediate.chance) {
//                        transition.immediate = true
//                    }
//                }
//            }
        }
    }
    
    
    private def createStates(ControlflowRegion region, SCTGeneratorDialog dialog, int hierarchy, int statesLeft) {
        var stateCounter = 0
        
        var lastState = region.createState(STATE_PREFIX + stateCounter) => [ initial = true ]
        stateCounter++
        
        while(stateCounter + 1 < statesLeft) {
            var newState = region.createState(STATE_PREFIX + stateCounter)
            
            var transition = lastState.createTransitionTo(newState)
            var transition2 = lastState.createTransitionTo(newState)

            stateCounter++
            
            if (dialog.chanceForSuperstate.chance && stateCounter + 2 < statesLeft) {
                val stateCost = random(1, statesLeft - 1)
                newState.createRegions(dialog, hierarchy, stateCost)
                stateCounter += stateCost
            }

            lastState = newState            
        }
        
        var newState = region.createState(STATE_PREFIX + stateCounter) => [ final = true ]
        lastState.createTransitionTo(newState)
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
        (min + (max  + 1 - min) * Math.random) as int
    }
    
    private def int random(int count) {
        (count * Math.random) as int
    }    
    
    private def boolean chance(double rnd) {
        Math.random < rnd
    }
    
}
