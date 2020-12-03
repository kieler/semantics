/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.ui.synthesis.action

import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.simulation.CoSimulationExeWrapper
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.ui.SimulationUIPlugin
import java.io.File
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.ui.dialogs.ResourceSelectionDialog
import org.eclipse.ui.statushandlers.StatusManager

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class AddCoSimulationAction implements IAction {

    /** The action ID. */
    public static final String ID =
            "de.cau.cs.kieler.simulation.ui.synthesis.action.AddCoSimulationAction";

    /**
     * {@inheritDoc}
     */
    override ActionResult execute(ActionContext context) {
        val vc = context.viewContext
        val simCtx = vc.getInputModel

        // get model
        if (simCtx instanceof SimulationContext) {
            val shell = context.viewContext.viewer.control.shell
            val workspace = ResourcesPlugin.getWorkspace()
            val root = workspace.getRoot()

            // Configure dialog
            val dialog = new ResourceSelectionDialog(shell, root, "Select an executable for co-simulation")
            dialog.open
            val results = dialog.result
            if (results !== null) {
                try {
                    val file = results.head
                    if (file instanceof IFile) {
                        val sim = new CoSimulationExeWrapper(new File(file.locationURI))
                        simCtx.addModel(sim)
                    }
                } catch (Exception e) {
                    e.printStackTrace
                    StatusManager.getManager().handle(new Status(IStatus.ERROR,
                        SimulationUIPlugin.PLUGIN_ID, e.getMessage(), e), StatusManager.SHOW)
                }
            }
        }
        return IAction.ActionResult.createResult(false);
    }

}
