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

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
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
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.progress.WorkbenchJob;

import de.cau.cs.kieler.core.ui.commands.AbstractReInitDiagramCommand;
import de.cau.cs.kieler.core.ui.util.EditorUtils;
import de.cau.cs.kieler.kiml.ui.layout.EclipseLayoutServices;
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
public class ReInitSyncchartsDiagramCommand extends
        AbstractReInitDiagramCommand {

    /** File extension for diagram files. */
    private static final String DIAGRAM_EXTENSION = "kids";

    /** File extension for model files. */
    private static final String MODEL_EXTENSION = "kixs";

    /** Delay for the auto layout. */
    private static final long AUTO_LAYOUT_DELAY = 1000;

    /**
     * Perform actions after the reinit. In this case an auto layout on the
     * currenly active diagram.
     * 
     * @param path
     *            the file
     * @param partners
     *            the partner files
     */
    @Override
    protected void performPostOperationAction(final IFile path,
            final List<IFile> partners) {
        WorkbenchJob job = new WorkbenchJob("") {

            @Override
            public IStatus runInUIThread(final IProgressMonitor monitor) {
                // perform auto layout
                IEditorPart editor = EditorUtils.getLastActiveEditor();
                EditPart part = null;
                if (editor != null) {
                    EclipseLayoutServices.getInstance().layout(editor, part,
                            false, true);
                }
                return new Status(IStatus.OK,
                        "de.cau.cs.kieler.synccharts.diagram.custom", "Done");
            }
        };

        job.schedule(AUTO_LAYOUT_DELAY);
    }

    /**
     * Create a new diagram file from the given semantics model. This code is
     * taken directly from the synccharts.diagram plugin.
     * 
     * @param diagramRoot
     *            the root element.
     * @param editingDomain
     *            the editing domain.
     * @param diagramFile
     *            the destination file
     * @return true if the creation was successful
     */
    @Override
    public boolean createNewDiagram(final EObject diagramRoot,
            final TransactionalEditingDomain editingDomain,
            final IFile diagramFile) {
        List<IFile> affectedFiles = new LinkedList<IFile>();
        refreshWorkspace();

        // get the destination file
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
