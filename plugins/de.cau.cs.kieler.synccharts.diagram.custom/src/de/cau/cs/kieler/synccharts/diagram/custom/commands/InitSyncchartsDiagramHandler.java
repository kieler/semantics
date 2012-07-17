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

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
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
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.model.handlers.AbstractInitDiagramHandler;
import de.cau.cs.kieler.core.util.Maybe;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.part.Messages;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorPlugin;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorUtil;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsVisualIDRegistry;

/**
 * A command that reinitializes a diagram file from a given kixs file.
 * 
 * @author soh
 */
public class InitSyncchartsDiagramHandler extends
        AbstractInitDiagramHandler {

    /** File extension for diagram files. */
    private static final String DIAGRAM_EXTENSION = "kids";

    /**
     * {@inheritDoc}
     */
    @Override
    public IEditorPart createNewDiagram(final EObject diagramRoot,
            final TransactionalEditingDomain editingDomain,
            final IFile diagramFile, final IProgressMonitor monitor) {
        URI diagramModelURI = URI.createPlatformResourceURI(diagramFile.getFullPath()
                        .toString(), true);
        ResourceSet resourceSet = editingDomain.getResourceSet();
        final Resource diagramResource = resourceSet.createResource(diagramModelURI);
        
        final Maybe<IEditorPart> result = new Maybe<IEditorPart>(null);
        final AbstractTransactionalCommand command = new AbstractTransactionalCommand(
                        editingDomain,
                        Messages.SyncchartsNewDiagramFileWizard_InitDiagramCommand,
                        Collections.singletonList(diagramFile)) {
            @Override
            protected CommandResult doExecuteWithResult(
                    final IProgressMonitor monitor,
                    final IAdaptable info) throws ExecutionException {
                int diagramVID = SyncchartsVisualIDRegistry
                                .getDiagramVisualID(diagramRoot);
                if (diagramVID != RegionEditPart.VISUAL_ID) {
                    String msg = Messages.SyncchartsNewDiagramFileWizard_IncorrectRootError;
                    return CommandResult.newErrorCommandResult(msg);
                }
                Diagram diagram = ViewService .createDiagram(
                                        diagramRoot,
                                        RegionEditPart.MODEL_ID,
                                        SyncchartsDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
                diagramResource.getContents().add(diagram);
                return CommandResult.newOKCommandResult();
            }
        };
                
        PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
            public void run() {
                try {
                    OperationHistoryFactory.getOperationHistory().execute(
                            command, new NullProgressMonitor(), null);
                    diagramResource.save(SyncchartsDiagramEditorUtil.getSaveOptions());
                    SyncchartsDiagramEditorUtil.setCharset(diagramFile);
                    
                    IEditorPart editor = openDiagram(diagramResource, SyncchartsDiagramEditor.ID);
                    result.set(editor);
                } catch (ExecutionException exception) {
                    IStatus status = new Status(IStatus.ERROR, SyncchartsDiagramEditorPlugin.ID,
                            "Error while saving diagram file.", exception);
                    StatusManager.getManager().handle(status, StatusManager.SHOW);
                } catch (IOException exception) {
                    IStatus status = new Status(IStatus.ERROR, SyncchartsDiagramEditorPlugin.ID,
                            "Error while saving diagram file.", exception);
                    StatusManager.getManager().handle(status, StatusManager.SHOW);
                } catch (PartInitException exception) {
                    StatusManager.getManager().handle(exception.getStatus(), StatusManager.SHOW);
                }
            }
        });
        return result.get();
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
    protected TransactionalEditingDomain createEditingDomain() {
        return GMFEditingDomainFactory.INSTANCE.createEditingDomain();
    }
    
}
