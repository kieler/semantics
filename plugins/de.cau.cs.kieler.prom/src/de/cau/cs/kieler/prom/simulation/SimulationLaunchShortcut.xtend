package de.cau.cs.kieler.prom.simulation

import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.Platform
import org.eclipse.debug.ui.ILaunchShortcut
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.window.Window
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.dialogs.ElementListSelectionDialog
import org.eclipse.ui.ide.ResourceUtil

class SimulationLaunchShortcut implements ILaunchShortcut {
    
    /**
     * {@inheritDoc}
     */
    override void launch(IEditorPart editor, String mode) {
        val file = ResourceUtil.getFile(editor.editorInput)
        if (file != null)
            launch(#[file], mode)
    }

    /**
     * {@inheritDoc}
     */
    override void launch(ISelection selection, String mode) {
        if (selection instanceof IStructuredSelection) {
            val structuredSelection = selection as IStructuredSelection
            if (structuredSelection.firstElement instanceof IFile)
                launch(structuredSelection.toList, mode)
        }
    }
    
    private def void launch(List<IFile> files, String mode) {
        println("simulation shortcut:" + files)
        
        // TODO: guess which files are models that should be compiled (sct, esterel)
        // and which files are data for the simulation (eso, sct with @Environment annotation?)
        
        // Selection dialog for environment that is used for compilation?
        
        // TODO: compile via prom and get compilation result
         
        // Get and start simulator
        val simulator = getSimulatorFromDialog()
        if(simulator != null) {
            simulator.simulate(files, #[], #[]);
        }
    }
    
    private def ISimulator getSimulatorFromDialog() {
        // Get simulators from extensions
        val config = Platform.getExtensionRegistry().getConfigurationElementsFor("de.cau.cs.kieler.prom.simulator");
        
        // Label provider to display environment
        val labelProvider = new LabelProvider() {
            override getText(Object o) {
                return (o as IConfigurationElement).getAttribute("class")
            }
        }
        
        // Selection dialog
        val dialog = new ElementListSelectionDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
            labelProvider)
        dialog.title = "Simulator selection"
        dialog.message = "Select a simulator."
        dialog.setElements(config)

        // Check result
        val returnCode = dialog.open()
        if (returnCode == Window.OK) {
            val results = dialog.result
            if (results != null && results.size > 0) {
                val result = results.get(0) as IConfigurationElement
                
                // Instantiate simulator
                try {
                    val o = result.createExecutableExtension("class");
                    if (o instanceof ISimulator) {
                        return o
                    }
                } catch (CoreException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
        return null
    }
}