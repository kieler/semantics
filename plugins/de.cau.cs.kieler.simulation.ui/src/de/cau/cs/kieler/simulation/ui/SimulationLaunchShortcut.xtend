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
package de.cau.cs.kieler.simulation.ui

import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.debug.ui.ILaunchShortcut
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.ide.ResourceUtil
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.StepAction
import de.cau.cs.kieler.simulation.handlers.CSimulator
import de.cau.cs.kieler.simulation.handlers.Redirect

/**
 * @author aas
 *
 */
class SimulationLaunchShortcut implements ILaunchShortcut{
    
    /**
     * The file handle from which this launch shortcut has been startet.
     */
    protected List<IFile> files = newArrayList()
    /**
     * The mode in which the shortcut was used. This is either 'run' or 'debug'.
     */
    protected String mode = ""
    /**
     * The file handle from which this launch shortcut has been startet.
     */
    protected IProject project
    
    /**
     * {@inheritDoc}
     */
    override void launch(IEditorPart editor, String mode) {
        val file = ResourceUtil.getFile(editor.editorInput)
        if (file != null) {
            this.files = #[file]
            this.project = file.project
            this.mode = mode
            launch()
        }
    }

    /**
     * {@inheritDoc}
     */
    override void launch(ISelection selection, String mode) {
        this.mode = mode
        if (selection instanceof IStructuredSelection) {
            val structuredSelection = selection as IStructuredSelection
            if (structuredSelection.firstElement instanceof IFile) {
                val file = structuredSelection.firstElement as IFile
                if(file != null) {
                    this.files = structuredSelection.toList
                    this.project = file.project
                    this.mode = mode
                    launch()         
                }
            }    
        }
    }
    
    private def void launch() {
        // TODO: Hard coded stuff
        val simMan = new SimulationManager()
        if(files.size == 1) {
            val simulator = new CSimulator()
            simulator.executable = files.get(0)
            simMan.dataHandlers.add(simulator)
            val simAction = new StepAction(StepAction.Method.WRITE, simulator)
            simMan.actions.add(simAction)
            
            simMan.initialize()
        } else if(files.size == 2) {
            
            val simulatorModel = new CSimulator()
            simulatorModel.executable = files.get(0)
            simMan.dataHandlers.add(simulatorModel)
            
            val simulatorEnv = new CSimulator()
            simulatorEnv.executable = files.get(1)
            simMan.dataHandlers.add(simulatorEnv)
            
            val redirect = new Redirect()
            redirect.from = simulatorEnv.modelName
            redirect.to = simulatorModel.modelName
            
            val simAction1 = new StepAction(StepAction.Method.WRITE, simulatorEnv)
            simMan.actions.add(simAction1)
            val simAction2 = new StepAction(StepAction.Method.WRITE, redirect)
            simMan.actions.add(simAction2)
            val simAction3 = new StepAction(StepAction.Method.WRITE, simulatorModel)
            simMan.actions.add(simAction3)
            
            simMan.initialize()
        }
        SimulationConsole.writeToConsole("\nNew simulation")
        SimulationConsole.writeToConsole("Initial pool:"+simMan.currentPool)
    }
}