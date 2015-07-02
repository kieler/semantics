/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.ksbase.gmf.handler;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.ksbase.core.TransformException;
import de.cau.cs.kieler.ksbase.m2m.ITransformationFramework;
import de.cau.cs.kieler.ksbase.ui.KSBasEUIPlugin;

/**
 * The command to execute a transformation.
 * 
 * @author mim
 */
public class TransformationCommand extends AbstractTransactionalCommand {

    /** The component that handles execution of a transformation. **/
    private ITransformationFramework transformationFramework;

    /**
     * Creates a command to execute a transformation.
     * 
     * @param domain
     *            the editing domain through which model changes are made
     * @param label
     *            the command label
     * @param adapter
     *            an adapter to the {@code View} of the base diagram
     */
    public TransformationCommand(final TransactionalEditingDomain domain,
            final String label, final IAdaptable adapter) {
        super(domain, label, null);
        transformationFramework = null;
    }

    /**
     * Executes the transformation. This will only work, if a component has been
     * set before.
     * 
     * @see org.eclipse.gmf.runtime.emf.commands.core.command.
     *      AbstractTransactionalCommand
     *      #doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor,
     *      org.eclipse.core.runtime.IAdaptable)
     * 
     * @param monitor
     *            Progress monitor for the execution
     * @param info
     *            Additional informations for the command
     * @return Either an Error/Warning command result if the execution failed,
     *         or else OK
     * @throws ExecutionException
     *             if the Execution failed due to a critical error.
     */
    @Override
    protected CommandResult doExecuteWithResult(final IProgressMonitor monitor,
            final IAdaptable info) throws ExecutionException {
        if (transformationFramework != null) {
            try {
                transformationFramework.executeTransformation();
            } catch (TransformException e0) {
                return CommandResult.newErrorCommandResult(e0);
            }

            IEditorPart activeEditor = PlatformUI.getWorkbench()
                    .getActiveWorkbenchWindow().getActivePage()
                    .getActiveEditor();

            if (activeEditor instanceof IDiagramWorkbenchPart) {
                EObject obj = ((View) ((IDiagramWorkbenchPart) activeEditor)
                        .getDiagramEditPart().getModel()).getElement();

                List<?> editPolicies = CanonicalEditPolicy
                        .getRegisteredEditPolicies(obj);
                for (Iterator<?> it = editPolicies.iterator(); it.hasNext();) {

                    CanonicalEditPolicy nextEditPolicy = (CanonicalEditPolicy) it
                            .next();

                    nextEditPolicy.refresh();
                }

                IDiagramGraphicalViewer graphViewer = ((IDiagramWorkbenchPart) activeEditor)
                        .getDiagramGraphicalViewer();
                graphViewer.flush();
            }
            // Clear the component, so a missing call to'initalize' won't
            // execute the same command
            // twice.
            transformationFramework = null;
            return CommandResult.newOKCommandResult();
        } else {
            KSBasEUIPlugin
                    .getDefault()
                    .logError(
                            "Failed to execute transformation, "
                                    + "it seems like the framework is not correctly initalized!");
            return null;
        }
    }

    /**
     * Initializes the transformation.
     * 
     * @param editPart
     *            Current edit part
     * @param selection
     *            Current selection
     * @param command
     *            The command to execute
     * @param fileName
     *            Name of the transformation file
     * @param packages
     *            The packages of the underlying meta model
     * @param framework
     *            The transformation framework to use for execution
     * @return False if an error occurred
     */
    public final boolean initialize(final IEditorPart editPart,
            final List<Object> selection, final String command,
            final String fileName, final List<String> packages,
            final ITransformationFramework framework) {
        transformationFramework = framework;

        // List<EObject> sel = selection.toList();
        // List<EObject> sel = ModelingUtil.getModelElementsFromSelection();
        transformationFramework.setParameters(selection
                .toArray(new Object[selection.size()]));
        return transformationFramework.initializeTransformation(fileName,
                command, packages.toArray(new String[packages.size()]));
    }

}
