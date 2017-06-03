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
package de.cau.cs.kieler.simulation.ui.launch

import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.StepAction
import de.cau.cs.kieler.simulation.handlers.ExecutableSimulator
import de.cau.cs.kieler.simulation.handlers.Redirect
import de.cau.cs.kieler.simulation.ui.SimulationConsole
import de.cau.cs.kieler.simulation.ui.handlers.DataPoolHandler
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.debug.ui.ILaunchShortcut
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.ide.ResourceUtil
import org.eclipse.ui.PlatformUI
import de.cau.cs.kieler.simulation.ui.views.DataPoolView
import org.eclipse.ui.statushandlers.StatusManager
import org.eclipse.ui.statushandlers.StatusAdapter
import org.eclipse.core.runtime.Status
import de.cau.cs.kieler.simulation.SimulationPlugin
import org.eclipse.jface.dialogs.ErrorDialog

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
                    
                    
                    try {
                        launch()
                    } catch (Exception e){
                        val status = new Status(Status.ERROR, SimulationPlugin.PLUGIN_ID, "There was an error during simulation.", e)
                        StatusManager.getManager().handle(status, StatusManager.SHOW);
                        SimulationManager.instance.stop()
                        throw e
                    }
                }
            }    
        }
    }
    
    private def void launch() {
        // Show data pool view
        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(DataPoolView.VIEW_ID);
        
        // TODO: Hard coded stuff
        if(files.size == 1) {
            val simulator = new ExecutableSimulator()
            simulator.executable = files.get(0)
            
            var simMan = SimulationManager.instance
            if(simMan == null || simMan.isStopped) {
                simMan = new SimulationManager()
                val dataPool = new DataPoolHandler()
                simMan.addHandler(dataPool)
                simMan.addAction(StepAction.Method.WRITE, simulator)
                simMan.initialize()
                
                SimulationConsole.writeToConsole("\n\nNew simulation")
                SimulationConsole.writeToConsole("Initial pool:"+simMan.currentPool)
            } else {
                simMan.addAction(StepAction.Method.WRITE, simulator)
                simMan.append(simulator)
                
                SimulationConsole.writeToConsole("Appended simulator")
                SimulationConsole.writeToConsole("New pool:"+simMan.currentPool)
            }
            
        } else if(files.size == 2) {
            val simMan = new SimulationManager()
            
            val simulatorModel = new ExecutableSimulator()
            simulatorModel.executable = files.get(0)
            
            val simulatorEnv = new ExecutableSimulator()
            simulatorEnv.executable = files.get(1)
            
            val redirectEnvToModel = new Redirect()
            redirectEnvToModel.from = simulatorEnv.modelName
            redirectEnvToModel.to = simulatorModel.modelName
            
            val redirectModelToEnv = new Redirect()
            redirectModelToEnv.from = simulatorModel.modelName
            redirectModelToEnv.to = simulatorEnv.modelName
            
            val dataPool = new DataPoolHandler()
            
            simMan.addHandler(dataPool)
            simMan.addAction(StepAction.Method.WRITE, simulatorEnv)
            simMan.addAction(StepAction.Method.WRITE, redirectEnvToModel)
            simMan.addAction(StepAction.Method.WRITE, simulatorModel)
            simMan.addAction(StepAction.Method.WRITE, redirectModelToEnv)
            
            simMan.initialize()
            
            SimulationConsole.writeToConsole("\n\nNew simulation")
            SimulationConsole.writeToConsole("Initial pool:"+simMan.currentPool)
        }
    }
}