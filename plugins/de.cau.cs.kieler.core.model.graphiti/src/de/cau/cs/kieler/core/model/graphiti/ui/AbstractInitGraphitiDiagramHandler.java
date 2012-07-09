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
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.AbstractTransactionalCommandStack;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPart;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.graphiti.ui.internal.parts.DiagramEditPart;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.model.graphiti.ModelGraphitiPlugin;
import de.cau.cs.kieler.core.model.handlers.AbstractInitDiagramHandler;
import de.cau.cs.kieler.core.util.Maybe;

/**
 * Abstract super class for commands that initialize any graphiti diagram.
 * 
 * @author soh
 */
@SuppressWarnings("restriction")
public abstract class AbstractInitGraphitiDiagramHandler extends
        AbstractInitDiagramHandler {

    /**
     * Command for performing the reinitialization process.
     * 
     * @author soh
     */
    private class ReInitCommand extends AbstractCommand {

        /** The provider for creating the add features. */
        private IFeatureProvider provider;
        /** The model root element. */
        private EObject modelRoot;
        /** The diagram root element. */
        private PictogramElement elem;
        /** The editor. */
        private DiagramEditor editor;

        /**
         * 
         * Creates a new ReinitCommand.
         * 
         * @param providerParam
         *            the provider
         * @param modelRootParam
         *            the model root
         * @param elemParam
         *            the diagram root
         * @param editorParam
         *            the editor
         */
        public ReInitCommand(final IFeatureProvider providerParam,
                final EObject modelRootParam, final PictogramElement elemParam,
                final DiagramEditor editorParam) {
            provider = providerParam;
            modelRoot = modelRootParam;
            elem = elemParam;
            editor = editorParam;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean canExecute() {
            return true;
        }

        /**
         * {@inheritDoc}
         */
        public void execute() {
            // process children of the root element
            for (EObject eObj : modelRoot.eContents()) {
                ContainerShape contShape = (ContainerShape) elem;
                linkToDiagram(eObj, provider, contShape, editor);
            }
            // deal with connections after finished
            processConnections(provider);
            // align box relative anchors after incoming/outgoing connections
            // can be determined
            alignBoxRelativeAnchors();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean canUndo() {
            return false;
        }

        /**
         * {@inheritDoc}
         */
        public void redo() {
            execute();
        }
    }

    /** Options for executing the command. */
    private Map<String, Boolean> cmdOptions = null;

    /** The name of the diagram type. */
    private String diagramTypeName;
    /** the grid size. */
    private int gridSize;
    /** true if snap to grid should be on by default. */
    private boolean snapToGrid;

    /**
     * Creates a new AbstractReInitGraphitiDiagramCommand.
     * 
     * @param diagramTypeNameParam
     *            the name
     * @param gridSizeParam
     *            the grid size
     * @param snapToGridParam
     *            true if it should snap to grid
     */
    public AbstractInitGraphitiDiagramHandler(
            final String diagramTypeNameParam, final int gridSizeParam,
            final boolean snapToGridParam) {
        super();
        this.diagramTypeName = diagramTypeNameParam;
        this.gridSize = gridSizeParam;
        this.snapToGrid = snapToGridParam;

        cmdOptions = new HashMap<String, Boolean>();
        // disable notifications and validations
        // saves considerable time on huge diagrams (34 seconds -> 3 seconds)
        cmdOptions.put(TransactionImpl.OPTION_NO_NOTIFICATIONS, true);
        cmdOptions.put(TransactionImpl.OPTION_NO_VALIDATION, true);
    }

    /**
     * Getter for the editor id.
     * 
     * @return the id
     */
    protected abstract String getEditorId();

    /**
     * {@inheritDoc}
     */
    @Override
    protected TransactionalEditingDomain createEditingDomain() {
        return GraphitiUi.getEmfService().createResourceSetAndEditingDomain();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IEditorPart createNewDiagram(final EObject modelRootParam,
            final TransactionalEditingDomain editingDomain,
            final IFile diagramFile, final IProgressMonitor monitor) {
        // taken from the new wizard and adapted
        Resource diagramResource = createDiagram(diagramFile, modelRootParam, editingDomain, monitor);
        if (diagramResource != null && getEditorId() != null) {
            try {
                return openDiagram(diagramResource);
            } catch (PartInitException exception) {
                StatusManager.getManager().handle(exception.getStatus(), StatusManager.SHOW);
            } catch (InterruptedException exception) {
                // ignore exception
            } catch (RollbackException exception) {
                StatusManager.getManager().handle(exception.getStatus(), StatusManager.SHOW);
            }
        }

        return null;
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
        // taken from the new wizard and adapted
        progressMonitor.beginTask("Creating diagram and model files", 2);
        // create a resource set
        ResourceSet resourceSet = editingDomain.getResourceSet();
        CommandStack commandStack = editingDomain.getCommandStack();

        if (!diagramFile.exists()) {
            InputStream input = new ByteArrayInputStream("".getBytes());
            try {
                diagramFile.create(input, IResource.NONE,
                        new NullProgressMonitor());
            } catch (CoreException e0) {
                e0.printStackTrace();
            }
        }
        // create resource for the diagram
        String path = diagramFile.getFullPath().toString();
        final Resource diagramResource =
                resourceSet.createResource(URI.createPlatformResourceURI(path,
                        true));
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
                diagramResource.save(GraphitiNewWizard.createSaveOptions());
            } catch (IOException exception) {
                IStatus status =
                        new Status(IStatus.ERROR,
                                ModelGraphitiPlugin.PLUGIN_ID,
                                "Unable to store model and diagram resources",
                                exception);
                StatusManager.getManager().handle(status);
            }
            GraphitiNewWizard.setCharset(WorkspaceSynchronizer
                    .getFile(diagramResource));
        }
        progressMonitor.done();
        return diagramResource;
    }

    /**
     * Link the domain model root to the diagram.
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
        diagramResource.setTrackingModification(false);
        Diagram newDiagram =
                Graphiti.getPeCreateService().createDiagram(diagramTypeName,
                        diagramName, gridSize, snapToGrid);
        PictogramLink link = PictogramsFactory.eINSTANCE.createPictogramLink();
        link.setPictogramElement(newDiagram);
        link.getBusinessObjects().add(modelRootParam);
        diagramResource.getContents().add(newDiagram);
    }

    /**
     * List of connections to be processed after the other elements are
     * finished.
     */
    private Set<EObject> connections;
    /** Store the elements that are already added and linked. */
    private Map<EObject, PictogramElement> elements;
    /** Store entities with box relative anchors that have to be layouted. */
    private Set<AnchorContainer> itemsWithBoxRelativeAnchors;

    /**
     * Align all BoxRelativeAnchors to a sensible position.
     */
    private void alignBoxRelativeAnchors() {
        for (AnchorContainer ac : itemsWithBoxRelativeAnchors) {
            alignBoxRelativeAnchors(ac);
        }
    }

    /**
     * Constants for the direction of the layout. Used for port alignment.
     * 
     * @author soh
     */
    private static enum LayoutDirection {
        LEFT, RIGHT, DOWN, UP;

        /**
         * Gives the opposite direction.
         * 
         * @return the opposite direction
         */
        public LayoutDirection opposite() {
            switch (this) {
            case DOWN:
                return UP;
            case LEFT:
                return RIGHT;
            case RIGHT:
                return LEFT;
            case UP:
                return DOWN;
            }
            return null;
        }
    }

    /**
     * Align the BoxRelativeAnchors on one container to a sensible position.
     * This method places all BoxRelativeAnchors with incoming connections on
     * the left side. All BoxRelativeAnchors with outgoing connections are
     * placed on the right side. BoxRelativeAnchors with no connections are
     * placed equally on the side with less connections.
     * 
     * @param ac
     *            the anchor container.
     */
    public void alignBoxRelativeAnchors(final AnchorContainer ac) {
        alignBoxRelativeAnchors(ac, LayoutDirection.RIGHT);
    }

    /**
     * Align the BoxRelativeAnchors according to the layout direction.
     * 
     * @param ac
     *            the anchor container.
     * @param dir
     *            the direction.
     */
    public void alignBoxRelativeAnchors(final AnchorContainer ac,
            final LayoutDirection dir) {
        List<Anchor> anchors = ac.getAnchors();
        List<BoxRelativeAnchor> in = new LinkedList<BoxRelativeAnchor>();
        List<BoxRelativeAnchor> out = new LinkedList<BoxRelativeAnchor>();
        determineSideForAnchors(anchors, in, out);
        alignPortsOnSide(in, dir.opposite());
        alignPortsOnSide(out, dir);
    }

    private static final float PORT_DISTANCE = 2.0f;
    private static final float SIDE_RELATION = 0.05f;

    /**
     * Distribute the ports equally on the specified side.
     * 
     * @param ports
     *            the list of ports to distribute
     * @param side
     *            the side on which to align the ports
     */
    protected void alignPortsOnSide(final List<BoxRelativeAnchor> ports,
            final LayoutDirection side) {
        float interval = 1.0f / (ports.size() + 1.0f);
        float offset = 1.0f;
        if (ports.size() > 1) {
            BoxRelativeAnchor firstPort = ports.get(0);
            AnchorContainer parent = firstPort.getParent();
            GraphicsAlgorithm ga = findVisibleGa(parent.getGraphicsAlgorithm());
            int newWidth = ga.getWidth();
            int newHeight = ga.getHeight();
            int newParentWidth = parent.getGraphicsAlgorithm().getWidth();
            int newParentHeight = parent.getGraphicsAlgorithm().getHeight();
            int portHeight = firstPort.getGraphicsAlgorithm().getHeight();
            int minHeight =
                    Math.round(PORT_DISTANCE * ports.size() * portHeight);
            int invisibleHeight = parent.getGraphicsAlgorithm().getHeight();
            int heightDif = invisibleHeight - ga.getHeight();
            int portWidth = firstPort.getGraphicsAlgorithm().getWidth();
            int minWidth = Math.round(PORT_DISTANCE * ports.size() * portWidth);
            int invisibleWidth = parent.getGraphicsAlgorithm().getWidth();
            int widthDif = invisibleWidth - ga.getWidth();
            if (side == LayoutDirection.LEFT || side == LayoutDirection.RIGHT) {
                newHeight = Math.max(ga.getHeight(), minHeight);
                newParentHeight = newHeight + heightDif;
                newWidth =
                        Math.max(ga.getWidth(),
                                Math.round(newHeight * SIDE_RELATION));
                newParentWidth = newWidth + widthDif;
                if (portHeight * ports.size() > newParentHeight) {
                    offset = 0.0f;
                    interval = 1.0f / (ports.size() - 1.0f);
                }
            } else {
                newWidth = Math.max(ga.getWidth(), minWidth);
                newParentWidth = newWidth + widthDif;
                newHeight =
                        Math.max(ga.getHeight(),
                                Math.round(newWidth * SIDE_RELATION));
                newParentHeight = newHeight + heightDif;
                if (portWidth * ports.size() > newParentWidth) {
                    offset = 0.0f;
                    interval = 1.0f / (ports.size() - 1.0f);
                }
            }
            parent.getGraphicsAlgorithm().setHeight(newParentHeight);
            ga.setHeight(newHeight);
            parent.getGraphicsAlgorithm().setWidth(newParentWidth);
            ga.setWidth(newWidth);
        }
        for (int i = 0; i < ports.size(); i++) {
            BoxRelativeAnchor port = ports.get(i);
            if (side == LayoutDirection.LEFT || side == LayoutDirection.RIGHT) {
                port.setRelativeWidth(side == LayoutDirection.LEFT ? 0.0 : 1.0);
                port.setRelativeHeight((i + offset) * interval);
            } else {
                port.setRelativeWidth((i + offset) * interval);
                port.setRelativeHeight(side == LayoutDirection.UP ? 0.0 : 1.0);
            }
        }
    }

    /**
     * Find a visible GraphicsAlgorithm to stick the ports on.
     * 
     * @param graphicsAlgorithm
     *            parent GA
     * @return a visible GA
     */
    protected GraphicsAlgorithm findVisibleGa(
            final GraphicsAlgorithm graphicsAlgorithm) {
        if (graphicsAlgorithm.getLineVisible()) {
            return graphicsAlgorithm;
        }
        GraphicsAlgorithm result = graphicsAlgorithm;
        for (GraphicsAlgorithm ga : graphicsAlgorithm
                .getGraphicsAlgorithmChildren()) {
            GraphicsAlgorithm returned = findVisibleGa(ga);
            if (returned.getLineVisible()) {
                result = returned;
                break;
            }
        }
        return result;
    }

    /**
     * Determine on which side to place a port. Ports with more incoming than
     * outgoing edges are placed on the left. Ports with more outgoing than
     * incoming edges are placed on the right. A port with equal number of
     * incoming and outgoing edges is placed on the side which has the least
     * number of ports.
     * 
     * @param anchors
     *            the anchors to distribute
     * @param inPorts
     *            the ports on the left
     * @param outPorts
     *            the ports on the right
     */
    protected void determineSideForAnchors(final List<Anchor> anchors,
            final List<BoxRelativeAnchor> inPorts,
            final List<BoxRelativeAnchor> outPorts) {
        List<BoxRelativeAnchor> undef = new LinkedList<BoxRelativeAnchor>();
        for (Anchor a : anchors) {
            if (a instanceof BoxRelativeAnchor) {
                BoxRelativeAnchor port = (BoxRelativeAnchor) a;
                List<Connection> out = a.getOutgoingConnections();
                List<Connection> in = a.getIncomingConnections();
                if (out.size() == in.size()) {
                    undef.add(port);
                } else if (out.size() > in.size()) {
                    outPorts.add(port);
                } else {
                    inPorts.add(port);
                }
            }
        }
        for (BoxRelativeAnchor a : undef) {
            if (inPorts.size() > outPorts.size()) {
                outPorts.add(a);
            } else {
                inPorts.add(a);
            }
        }
    }

    /**
     * Link the model to the newly created diagram inside the editor.
     * 
     * @param editor
     *            the editor
     * @throws RollbackException
     *             if the transaction was rolled back
     * @throws InterruptedException
     *             if the transaction was interrupted
     */
    protected void linkModelToDiagram(final DiagramEditor editor)
            throws InterruptedException, RollbackException {
        connections = new HashSet<EObject>();
        elements = new HashMap<EObject, PictogramElement>();
        itemsWithBoxRelativeAnchors = new HashSet<AnchorContainer>();
        // get the feature provider for getting the AddFeatures
        IDiagramTypeProvider dtp = editor.getDiagramTypeProvider();
        IFeatureProvider provider = dtp.getFeatureProvider();

        // get the root edit part for the diagram
        EditPart part = editor.getGraphicalViewer().getContents();

        if (part instanceof DiagramEditPart) {
            DiagramEditPart dep = (DiagramEditPart) part;
            PictogramElement elem = dep.getPictogramElement();
            List<EObject> list = elem.getLink().getBusinessObjects();
            EObject modelRoot = list.get(0);
            if (elem instanceof ContainerShape) {
                TransactionalEditingDomain domain = editor.getEditingDomain();
                CommandStack cs = domain.getCommandStack();
                AbstractTransactionalCommandStack atcs =
                        (AbstractTransactionalCommandStack) cs;
                atcs.execute(new ReInitCommand(provider, modelRoot, elem,
                        editor), cmdOptions);
            }
        }
    }

    /**
     * The given domain model element represents a connection which should be
     * dealt with after all other elements are added. This is necessary since
     * connection require their source and target to be already present while
     * adding.
     * 
     * @param eObj
     *            the domain model element
     * @return true if the element represents a connection
     */
    protected abstract boolean isConnection(EObject eObj);

    /**
     * Get the source element of a connection.
     * 
     * @param connection
     *            the connection
     * @return the source of the connection
     */
    protected abstract EObject getConnectionSource(EObject connection);

    /**
     * Get the target element for a connection.
     * 
     * @param connection
     *            the connection
     * @return the target of the connection
     */
    protected abstract EObject getConnectionTarget(EObject connection);

    /**
     * Process the list of connections after the rest is finished.
     * 
     * @param provider
     *            the feature provider for getting the AddConnectionFeatures
     */
    private void processConnections(final IFeatureProvider provider) {
        for (EObject connection : connections) {
            AddConnectionContext context =
                    processConnection(elements, connection);

            if (context != null) {
                PictogramElement elem = addAndLinkIfPossible(provider, context);

                provider.updateIfPossibleAndNeeded(new UpdateContext(elem));
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
        // the domain model source and target
        EObject src = getConnectionSource(connection);
        EObject target = getConnectionTarget(connection);

        // the already added graphical elements
        PictogramElement srcElement = elementsParam.get(src);
        PictogramElement targetElement = elementsParam.get(target);

        // Determine the source anchor and container
        Anchor srcAnchor = null;
        ContainerShape srcContainer = null;
        if (srcElement instanceof ContainerShape) {
            // The source is a simple node (e.g. KAOM Entity)
            srcContainer = (ContainerShape) srcElement;
            srcAnchor = srcContainer.getAnchors().get(0);
        } else if (srcElement instanceof Anchor) {
            // The source is an anchor itself (e.g. KAOM Port)
            srcAnchor = (Anchor) srcElement;
            AnchorContainer container = srcAnchor.getParent();
            if (container instanceof ContainerShape) {
                srcContainer = (ContainerShape) container;
            }
        } else if (srcElement instanceof Shape) {
            // The source is a generic shape (e.g. KAOM Relation)
            Shape s = (Shape) srcElement;
            srcAnchor = s.getAnchors().get(0);
            srcContainer = s.getContainer();
        }

        // Determine the target anchor
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

        // create the context
        AddConnectionContext context =
                new AddConnectionContext(srcAnchor, targetAnchor);
        context.setNewObject(connection);
        context.setTargetContainer(srcContainer);
        return context;
    }

    /**
     * Add the eObject to the diagram.
     * 
     * @param provider
     *            feature provider for the features
     * @param context
     *            the context (must be AddConnectionContext if the domain model
     *            element is a connection)
     * @param eObj
     *            the domain model element to add
     * @return the added diagram element or null
     */
    private PictogramElement addAndLinkIfPossible(
            final IFeatureProvider provider, final AddContext context) {
        PictogramElement result = null;
        IAddFeature feature = provider.getAddFeature(context);
        if (feature != null) {
            // only do something if the element has a graphical representation
            result = feature.add(context);
        }
        return result;
    }

    /**
     * Link the given eObject to newly created elements in the diagram.
     * 
     * @param eObj
     *            the domain model element to add
     * @param provider
     *            the feature provider for getting the AddFeatures
     * @param container
     *            the parent container
     * @param editor
     *            the editor
     */
    private void linkToDiagram(final EObject eObj,
            final IFeatureProvider provider, final ContainerShape container,
            final DiagramEditor editor) {
        if (isConnection(eObj)) {
            // connections should be dealt with after
            // all other elements are present
            connections.add(eObj);
            return;
        }
        // create a context for adding the element
        AddContext context = new AddContext();
        context.setNewObject(eObj);
        context.setTargetContainer(container);

        // add the element
        PictogramElement element = addAndLinkIfPossible(provider, context);

        if (element != null) {
            // only do something if the element has a graphical representation
            elements.put(eObj, element);

            if (addChildrenRecursively(eObj)) {
                if (element instanceof BoxRelativeAnchor) {
                    BoxRelativeAnchor port = (BoxRelativeAnchor) element;
                    AnchorContainer ac = port.getParent();
                    itemsWithBoxRelativeAnchors.add(ac);
                }

                if (element instanceof ContainerShape) {
                    // element may contain visible children
                    ContainerShape cs = (ContainerShape) element;
                    // recursively add children of the domain model element
                    for (EObject child : eObj.eContents()) {
                        linkToDiagram(child, provider, cs, editor);
                    }
                }
            } else {
                findElements(element);
            }
        }
    }

    /**
     * Recursively find all elements that were recursively added by an
     * AddFeature outside the control of the ReInitCommand.
     * 
     * @param elem
     *            the element
     */
    private void findElements(final PictogramElement elem) {
        if (elem == null || elem.getLink() == null
                || elem.getLink().getBusinessObjects().isEmpty()) {
            return;
        }
        EObject modelElem = elem.getLink().getBusinessObjects().get(0);
        if (isConnection(modelElem)) {
            // connections should be dealt with after
            // all other elements are present
            connections.add(modelElem);
            return;
        } else if (elem instanceof Anchor) {
            for (Connection c : ((Anchor) elem).getOutgoingConnections()) {
                findElements(c);
            }
        }
        if (modelElem != null) {
            elements.put(modelElem, elem);
        }
        for (EObject child : elem.eContents()) {
            if (child instanceof PictogramElement) {
                findElements((PictogramElement) child);
            }
        }
    }

    /**
     * If true all contained elements will be added recursively. If false it is
     * assumed that the graphical elements for all children were already added
     * when the parent element is added.
     * 
     * @param eObj
     *            the model element
     * @return true if the method should be called again for all children
     */
    protected boolean addChildrenRecursively(final EObject eObj) {
        return true;
    }

    /**
     * Open the diagram from the given resource.
     * 
     * @param diagramResource
     *            a resource for a diagram file
     * @return the opened diagram editor
     * @throws PartInitException
     *             if the diagram could not be opened
     * @throws RollbackException
     *             if the transaction was rolled back
     * @throws InterruptedException
     *             if the transaction was interrupted
     */
    private IEditorPart openDiagram(final Resource diagramResource)
            throws PartInitException, InterruptedException, RollbackException {
        String path = diagramResource.getURI().toPlatformString(true);
        final IResource workspaceResource =
                ResourcesPlugin.getWorkspace().getRoot()
                        .findMember(new Path(path));
        if (workspaceResource instanceof IFile) {
            final Maybe<IEditorPart> editor = new Maybe<IEditorPart>();
            final Maybe<PartInitException> except =
                    new Maybe<PartInitException>();
            PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

                public void run() {
                    IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                            .getActivePage();
                    try {
                        editor.set(page.openEditor(new FileEditorInput(
                                (IFile) workspaceResource), getEditorId()));
                    } catch (PartInitException e) {
                        except.set(e);
                    }
                }
            });
            if (except.get() != null) {
                throw except.get();
            }
            IEditorPart theEditor = editor.get();
            if (theEditor instanceof DiagramEditor) {
                // editor is open, can add the rest of the elements now
                linkModelToDiagram((DiagramEditor) theEditor);
            }
            return theEditor;
        }
        return null;
    }
}
