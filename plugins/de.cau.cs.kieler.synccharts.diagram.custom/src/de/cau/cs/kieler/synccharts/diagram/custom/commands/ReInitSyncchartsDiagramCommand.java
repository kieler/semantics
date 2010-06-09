/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.diagram.custom.commands;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Semaphore;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.WorkbenchJob;

import de.cau.cs.kieler.core.ui.commands.ReInitDiagramCommand;
import de.cau.cs.kieler.kiml.ui.layout.DiagramLayoutManager;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.part.Messages;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorPlugin;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorUtil;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsVisualIDRegistry;

/**
 * A command that reinitializes a diagram file from a given kixs file.
 * 
 * @author soh
 * @kieler.rating 2010-03-01 proposed yellow
 */
public class ReInitSyncchartsDiagramCommand extends ReInitDiagramCommand {

    /** File extension for diagram files. */
    private static final String DIAGRAM_EXTENSION = "kids";

    /** File extension for model files. */
    private static final String MODEL_EXTENSION = "kixs";

    /** Delay for the auto layout. */
    private static final long AUTO_LAYOUT_DELAY = 1000;

    /**
     * Perform actions after the reinit.
     * 
     * @param path
     *            the file
     * @param partners
     *            the partner files
     */
    @Override
    protected void performPostOperationAction(final IPath path,
            final List<IPath> partners) {
        WorkbenchJob job = new WorkbenchJob("") {

            @Override
            public IStatus runInUIThread(final IProgressMonitor monitor) {
                // perform auto layout
                IEditorPart editor = getActiveEditor();
                EditPart part = null;
                if (editor != null) {
                    DiagramLayoutManager.layout(editor, part, false, true);
                }
                return new Status(IStatus.OK,
                        "de.cau.cs.kieler.synccharts.diagram.custom", "Done");
            }
        };

        job.schedule(AUTO_LAYOUT_DELAY);
    }

    /**
     * Get the active editor for the page.
     * 
     * @return the active editor.
     */
    private IEditorPart getActiveEditor() {
        IEditorPart result = null;
        IWorkbench workbench = PlatformUI.getWorkbench();
        if (workbench != null) {
            IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
            if (window != null) {
                IWorkbenchPage page = window.getActivePage();
                if (page != null) {
                    result = page.getActiveEditor();
                }
            }
        }
        return result;
    }

    /**
     * Create a new diagram file from the given semantics model.
     * 
     * @param diagramRoot
     *            the root element.
     * @param editingDomain
     *            the editing domain.
     * @param kidsPath
     *            the destination file
     * @return true if the creation was successful
     */
    @Override
    protected boolean createNewDiagram(final EObject diagramRoot,
            final TransactionalEditingDomain editingDomain, final IPath kidsPath) {
        List<IFile> affectedFiles = new LinkedList<IFile>();
        refreshWorkspace();

        // get the destination file
        IFile diagramFile = ResourcesPlugin.getWorkspace().getRoot().getFile(
                kidsPath);
        refreshWorkspace();

        if (!diagramFile.exists()) {
            // create a new file
            byte[] buf = { 0 };
            InputStream stream = new ByteArrayInputStream(buf);
            try {
                diagramFile.create(stream, true, null);
                refreshWorkspace();
                stream.close();
            } catch (CoreException e0) {
                e0.printStackTrace();
            } catch (IOException e0) {
                e0.printStackTrace();
            }
        }

        SyncchartsDiagramEditorUtil.setCharset(diagramFile);
        affectedFiles.add(diagramFile);
        URI diagramModelURI = URI.createPlatformResourceURI(diagramFile
                .getFullPath().toString(), true);
        ResourceSet resourceSet = editingDomain.getResourceSet();
        final Resource diagramResource = resourceSet
                .createResource(diagramModelURI);
        AbstractTransactionalCommand command = new AbstractTransactionalCommand(
                editingDomain,
                Messages.SyncchartsNewDiagramFileWizard_InitDiagramCommand,
                affectedFiles) {

            @Override
            protected CommandResult doExecuteWithResult(
                    final IProgressMonitor monitor, final IAdaptable info)
                    throws ExecutionException {
                int diagramVID = SyncchartsVisualIDRegistry
                        .getDiagramVisualID(diagramRoot);
                if (diagramVID != RegionEditPart.VISUAL_ID) {
                    String msg = Messages.SyncchartsNewDiagramFileWizard_IncorrectRootError;
                    return CommandResult.newErrorCommandResult(msg);
                }
                Diagram diagram = ViewService.createDiagram(diagramRoot,
                        RegionEditPart.MODEL_ID,
                        SyncchartsDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
                diagramResource.getContents().add(diagram);
                return CommandResult.newOKCommandResult();
            }
        };
        try {
            OperationHistoryFactory.getOperationHistory().execute(command,
                    new NullProgressMonitor(), null);
            diagramResource.save(SyncchartsDiagramEditorUtil.getSaveOptions());
            SyncchartsDiagramEditorUtil.openDiagram(diagramResource);
        } catch (ExecutionException e) {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Unable to create model and diagram", e); //$NON-NLS-1$
        } catch (IOException ex) {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Save operation failed for: " + diagramModelURI, ex); //$NON-NLS-1$
        } catch (PartInitException ex) {
            SyncchartsDiagramEditorPlugin.getInstance().logError(
                    "Unable to open editor", ex); //$NON-NLS-1$
        }
        return true;
    }

    /**
     * A monitor that blocks the calling thread until the monitored thread is
     * done.
     * 
     * @author soh
     * @kieler.rating 2010-03-01 proposed yellow
     */
    public class WaitUntilDoneMonitor implements IProgressMonitor {

        /** The semaphore to wait in. */
        private Semaphore sem = new Semaphore(0);

        /**
         * 
         * {@inheritDoc}
         */
        public void worked(final int work) {
        }

        /**
         * 
         */
        public void waitUntilDone() {
            try {
                sem.acquire();
            } catch (InterruptedException e0) {
                e0.printStackTrace();
            }
        }

        /**
         * 
         * {@inheritDoc}
         */
        public void subTask(final String name) {
        }

        /**
         * 
         * {@inheritDoc}
         */
        public void setTaskName(final String name) {
        }

        /**
         * 
         * {@inheritDoc}
         */
        public void setCanceled(final boolean value) {
        }

        /**
         * 
         * {@inheritDoc}
         */
        public boolean isCanceled() {
            return false;
        }

        /**
         * 
         * {@inheritDoc}
         */
        public void internalWorked(final double work) {
        }

        /**
         * 
         * {@inheritDoc}
         */
        public void done() {
            sem.release();
        }

        /**
         * 
         * {@inheritDoc}
         */
        public void beginTask(final String name, final int totalWork) {
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getDiagramExtension() {
        return DIAGRAM_EXTENSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getModelExtension() {
        return MODEL_EXTENSION;
    }
}
