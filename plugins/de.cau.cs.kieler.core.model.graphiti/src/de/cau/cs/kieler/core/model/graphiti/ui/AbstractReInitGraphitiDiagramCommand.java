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
package de.cau.cs.kieler.core.model.graphiti.ui;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPart;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.editor.DiagramEditorFactory;
import org.eclipse.graphiti.ui.internal.parts.IPictogramElementEditPart;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.model.graphiti.KielerGraphitiPlugin;
import de.cau.cs.kieler.core.ui.commands.AbstractReInitDiagramCommand;
import de.cau.cs.kieler.core.util.Maybe;

/**
 * @author soh
 */
public abstract class AbstractReInitGraphitiDiagramCommand extends
        AbstractReInitDiagramCommand {

    /**
     * Creates a new AbstractReInitGraphitiDiagramCommand.java.
     * 
     * @param diagramTypeName
     * @param gridSize
     * @param snapToGrid
     */
    public AbstractReInitGraphitiDiagramCommand(final String diagramTypeName,
            final int gridSize, final boolean snapToGrid) {
        super();
        this.diagramTypeName = diagramTypeName;
        this.gridSize = gridSize;
        this.snapToGrid = snapToGrid;
    }

    private String diagramTypeName;
    private int gridSize;
    private boolean snapToGrid;

    protected abstract String getEditorId();

    private IWorkbenchWindow getContainer() {
        return PlatformUI.getWorkbench().getActiveWorkbenchWindow();
    }

    @Override
    protected TransactionalEditingDomain createEditingDomain() {
        return DiagramEditorFactory.createResourceSetAndEditingDomain();
    }

    @Override
    public EObject getEObjectFromEditPart(final EditPart editPart) {
        if (editPart instanceof IPictogramElementEditPart) {
            System.out.println("yses");
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean createNewDiagram(final EObject modelRoot,
            final TransactionalEditingDomain editingDomain,
            final IFile diagramPath) {
        final Maybe<Resource> diagramResource = new Maybe<Resource>();
        IRunnableWithProgress op = new WorkspaceModifyOperation(null) {
            @Override
            protected void execute(final IProgressMonitor monitor)
                    throws CoreException, InterruptedException {
                diagramResource.set(createDiagram(diagramPath, modelRoot,
                        editingDomain, monitor));
                if (diagramResource.get() != null && getEditorId() != null) {
                    try {
                        openDiagram(diagramResource.get());
                    } catch (PartInitException exception) {
                        ErrorDialog.openError(getContainer().getShell(),
                                "Error opening diagram editor", null,
                                exception.getStatus());
                    }
                }
            }
        };
        try {
            getContainer().run(false, true, op);
        } catch (InterruptedException exception) {
            return false;
        } catch (InvocationTargetException exception) {
            if (exception.getTargetException() instanceof CoreException) {
                ErrorDialog.openError(getContainer().getShell(),
                        "Creation Problems", null, ((CoreException) exception
                                .getTargetException()).getStatus());
            } else {
                IStatus status = new Status(IStatus.ERROR,
                        KielerGraphitiPlugin.PLUGIN_ID,
                        "Error creating diagram",
                        exception.getTargetException());
                StatusManager.getManager().handle(status, StatusManager.LOG);
            }
            return false;
        }
        return diagramResource.get() != null;
    }

    /**
     * Create a diagram with given URIs.
     * 
     * @param diagramFile
     *            URI for the diagram file
     * @param modelRoot
     *            URI for the model file
     * @param editingDomain
     *            the editing domain
     * @param progressMonitor
     *            progress monitor
     * @return a resource for the new diagram file
     */
    private Resource createDiagram(final IFile diagramFile,
            final EObject modelRoot,
            final TransactionalEditingDomain editingDomain,
            final IProgressMonitor progressMonitor) {
        progressMonitor.beginTask("Creating diagram and model files", 2);
        // create a resource set and editing domain
        // TransactionalEditingDomain editingDomain = DiagramEditorFactory
        // .createResourceSetAndEditingDomain();
        ResourceSet resourceSet = editingDomain.getResourceSet();
        CommandStack commandStack = editingDomain.getCommandStack();
        // create resources for the diagram and domain model files

        if (!diagramFile.exists()) {
            InputStream input = new ByteArrayInputStream("".getBytes());
            try {
                diagramFile.create(input, IResource.NONE,
                        new NullProgressMonitor());
            } catch (CoreException e0) {
                e0.printStackTrace();
            }
        }
        String path = diagramFile.getFullPath().toString();
        final Resource diagramResource = resourceSet.createResource(URI
                .createPlatformResourceURI(path, true));
        if (diagramResource != null/*&& modelResource != null*/) {
            commandStack.execute(new RecordingCommand(editingDomain) {
                @Override
                protected void doExecute() {
                    createModel(diagramResource, diagramFile.getName(),
                            modelRoot);
                }
            });
            progressMonitor.worked(1);

            try {
                // modelResource.save(createSaveOptions());
                diagramResource.save(GraphitiNewWizard.createSaveOptions());
            } catch (IOException exception) {
                IStatus status = new Status(IStatus.ERROR,
                        KielerGraphitiPlugin.PLUGIN_ID,
                        "Unable to store model and diagram resources",
                        exception);
                StatusManager.getManager().handle(status);
            }
            // setCharset(WorkspaceSynchronizer.getFile(modelResource));
            GraphitiNewWizard.setCharset(WorkspaceSynchronizer
                    .getFile(diagramResource));
        }
        progressMonitor.done();
        return diagramResource;
    }

    /**
     * Create a model in the given resources.
     * 
     * @param diagramResource
     *            resource for the diagram model
     * @param diagramName
     *            name of the diagram model
     * @param modelResource
     *            resource for the domain model
     * @param modelName
     *            name of the domain model
     */
    private void createModel(final Resource diagramResource,
            final String diagramName, final EObject modelRoot) {
        final Resource modelResource = modelRoot.eResource();
        modelResource.setTrackingModification(true);
        // EObject domainModel = createModel(modelName);
        // modelResource.getContents().add(domainModel);
        diagramResource.setTrackingModification(true);
        Diagram diagram = Graphiti.getPeCreateService().createDiagram(
                diagramTypeName, diagramName, gridSize, snapToGrid);
        linkModelToDiagram(modelRoot, diagram, diagramResource);
    }

    protected abstract void linkModelToDiagram(EObject modelRoot,
            Diagram diagram, Resource diagramResource);

    /**
     * Open the diagram from the given resource.
     * 
     * @param diagramResource
     *            a resource for a diagram file
     * @throws PartInitException
     *             if the diagram could not be opened
     */
    private void openDiagram(final Resource diagramResource)
            throws PartInitException {
        String path = diagramResource.getURI().toPlatformString(true);
        IResource workspaceResource = ResourcesPlugin.getWorkspace().getRoot()
                .findMember(new Path(path));
        if (workspaceResource instanceof IFile) {
            IWorkbenchPage page = getContainer().getActivePage();
            page.openEditor(new FileEditorInput((IFile) workspaceResource),
                    getEditorId());
        }
    }
}
