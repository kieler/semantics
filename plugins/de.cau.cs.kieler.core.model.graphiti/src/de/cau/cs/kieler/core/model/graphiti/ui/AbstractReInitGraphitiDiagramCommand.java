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
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.graphiti.ui.editor.DiagramEditorFactory;
import org.eclipse.graphiti.ui.internal.parts.DiagramEditPart;
import org.eclipse.graphiti.ui.internal.parts.IPictogramElementEditPart;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.IEditorPart;
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
@SuppressWarnings("restriction")
public abstract class AbstractReInitGraphitiDiagramCommand extends
        AbstractReInitDiagramCommand {

    /**
     * Creates a new AbstractReInitGraphitiDiagramCommand.java.
     * 
     * @param diagramTypeNameParam
     *            the name
     * @param gridSizeParam
     *            the grid size
     * @param snapToGridParam
     *            true if it should snap to grid
     */
    public AbstractReInitGraphitiDiagramCommand(
            final String diagramTypeNameParam, final int gridSizeParam,
            final boolean snapToGridParam) {
        super();
        this.diagramTypeName = diagramTypeNameParam;
        this.gridSize = gridSizeParam;
        this.snapToGrid = snapToGridParam;
    }

    private String diagramTypeName;
    private int gridSize;
    private boolean snapToGrid;

    /**
     * Getter for the editor id.
     * 
     * @return the id
     */
    protected abstract String getEditorId();

    /**
     * Getter for the container.
     * 
     * @return the container
     */
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
            IPictogramElementEditPart part = (IPictogramElementEditPart) editPart;
            return part.getPictogramElement();
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean createNewDiagram(final EObject modelRootParam,
            final TransactionalEditingDomain editingDomain,
            final IFile diagramPath) {
        final Maybe<Resource> diagramResource = new Maybe<Resource>();
        IRunnableWithProgress op = new WorkspaceModifyOperation(null) {
            @Override
            protected void execute(final IProgressMonitor monitor)
                    throws CoreException, InterruptedException {
                diagramResource.set(createDiagram(diagramPath, modelRootParam,
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
     * @param modelRootParam
     *            URI for the model file
     * @param editingDomain
     *            the editing domain
     * @param progressMonitor
     *            progress monitor
     * @return a resource for the new diagram file
     */
    private Resource createDiagram(final IFile diagramFile,
            final EObject modelRootParam,
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
                            modelRootParam);
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
     * @param modelRootParam
     *            the root element
     */
    private void createModel(final Resource diagramResource,
            final String diagramName, final EObject modelRootParam) {
        final Resource modelResource = modelRootParam.eResource();
        modelResource.setTrackingModification(true);
        // EObject domainModel = createModel(modelName);
        // modelResource.getContents().add(domainModel);
        diagramResource.setTrackingModification(true);
        Diagram newDiagram = Graphiti.getPeCreateService().createDiagram(
                diagramTypeName, diagramName, gridSize, snapToGrid);
        PictogramLink link = PictogramsFactory.eINSTANCE.createPictogramLink();
        link.setPictogramElement(newDiagram);
        link.getBusinessObjects().add(modelRootParam);
        diagramResource.getContents().add(newDiagram);
    }

    private List<EObject> connections;
    private Map<EObject, PictogramElement> elements;

    /**
     * 
     * @param editor
     */
    protected void linkModelToDiagram(final DiagramEditor editor) {
        connections = new LinkedList<EObject>();
        elements = new HashMap<EObject, PictogramElement>();

        IDiagramTypeProvider dtp = editor.getDiagramTypeProvider();
        IFeatureProvider provider = dtp.getFeatureProvider();

        EditPart part = editor.getGraphicalViewer().getContents();

        if (part instanceof DiagramEditPart) {
            DiagramEditPart dep = (DiagramEditPart) part;
            PictogramElement elem = dep.getPictogramElement();
            List<EObject> list = elem.getLink().getBusinessObjects();
            EObject modelRoot = list.get(0);
            if (elem instanceof ContainerShape) {
                for (EObject eObj : modelRoot.eContents()) {
                    linkToDiagram(eObj, provider, (ContainerShape) elem, editor);
                }

                processConnections(provider, editor);
            }
        }
    }

    protected abstract boolean isConnection(EObject eObj);

    protected abstract EObject getConnectionSource(EObject connection);

    protected abstract EObject getConnectionTarget(EObject connection);

    /**
     * @param provider
     * @param editor
     */
    private void processConnections(final IFeatureProvider provider,
            final DiagramEditor editor) {
        for (EObject connection : connections) {
            AddConnectionContext context = processConnection(elements,
                    connection);

            if (context != null) {
                addAndLinkIfPossible(provider, context, editor);
            }
        }
    }

    /**
     * Process a single connection. This method should be overridden if the
     * standard implementation doesn't produce the desired results. When the
     * method is called it can be guaranteed that all other elements have
     * already been added to the diagram.
     * 
     * @param elementsParam
     *            the map of already added elements.
     * @param connection
     *            the domain model element of the connection to be added
     * @return the context to execute for adding
     */
    protected AddConnectionContext processConnection(
            final Map<EObject, PictogramElement> elementsParam,
            final EObject connection) {
        EObject src = getConnectionSource(connection);
        EObject target = getConnectionTarget(connection);

        PictogramElement srcElement = elementsParam.get(src);
        PictogramElement targetElement = elementsParam.get(target);

        Anchor srcAnchor = null;
        ContainerShape srcContainer = null;
        if (srcElement instanceof ContainerShape) {
            srcContainer = (ContainerShape) srcElement;
            srcAnchor = srcContainer.getAnchors().get(0);
        } else if (srcElement instanceof Anchor) {
            srcAnchor = (Anchor) srcElement;
            AnchorContainer container = srcAnchor.getParent();
            if (container instanceof ContainerShape) {
                srcContainer = (ContainerShape) container;
            }
        } else if (srcElement instanceof Shape) {
            Shape s = (Shape) srcElement;
            srcAnchor = s.getAnchors().get(0);
            srcContainer = s.getContainer();
        }
        Anchor targetAnchor = null;
        ContainerShape targetContainer = null;
        if (targetElement instanceof ContainerShape) {
            targetContainer = (ContainerShape) targetElement;
            targetAnchor = targetContainer.getAnchors().get(0);
        } else if (targetElement instanceof Anchor) {
            targetAnchor = (Anchor) targetElement;
            AnchorContainer container = targetAnchor.getParent();
            if (container instanceof ContainerShape) {
                targetContainer = (ContainerShape) container;
            }
        } else if (targetElement instanceof Shape) {
            Shape s = (Shape) targetElement;
            targetAnchor = s.getAnchors().get(0);
            targetContainer = s.getContainer();
        }

        AddConnectionContext context = new AddConnectionContext(srcAnchor,
                targetAnchor);
        context.setNewObject(connection);
        context.setTargetContainer(srcContainer);

        return context;
    }

    /**
     * Add the eObject to the diagram and connections it.
     * 
     * @param provider
     * @param context
     * @param editor
     * @param eObj
     * @return
     */
    private PictogramElement addAndLinkIfPossible(
            final IFeatureProvider provider, final AddContext context,
            final DiagramEditor editor) {
        final TransactionalEditingDomain domain = editor.getEditingDomain();
        CommandStack cs = domain.getCommandStack();
        final Maybe<PictogramElement> result = new Maybe<PictogramElement>();

        final IAddFeature feature = provider.getAddFeature(context);

        if (feature != null) {
            cs.execute(new RecordingCommand(domain) {

                @Override
                protected void doExecute() {
                    result.set(feature.add(context));
                }
            });
        }

        return result.get();
    }

    /**
     * Link the given eObject to newly create elements in the diagram.
     * 
     * @param eObj
     * @param provider
     * @param container
     * @param editor
     */
    private void linkToDiagram(final EObject eObj,
            final IFeatureProvider provider, final ContainerShape container,
            final DiagramEditor editor) {
        if (isConnection(eObj)) {
            connections.add(eObj);
            return;
        }
        AddContext context = new AddContext();
        context.setNewObject(eObj);
        context.setTargetContainer(container);
        PictogramElement element = addAndLinkIfPossible(provider, context,
                editor);

        if (element != null) {
            elements.put(eObj, element);

            if (element instanceof ContainerShape) {
                ContainerShape cs = (ContainerShape) element;
                for (EObject child : eObj.eContents()) {
                    linkToDiagram(child, provider, cs, editor);
                }
            }
        }
    }

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
            IEditorPart theEditor = page.openEditor(new FileEditorInput(
                    (IFile) workspaceResource), getEditorId());
            if (theEditor instanceof DiagramEditor) {
                linkModelToDiagram((DiagramEditor) theEditor);
            }
        }
    }
}
