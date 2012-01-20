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
package de.cau.cs.kieler.core.model.handlers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Semaphore;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.model.CoreModelPlugin;
import de.cau.cs.kieler.core.model.GraphicalFrameworkService;
import de.cau.cs.kieler.core.model.triggers.ReInitDiagramDoneTrigger;
import de.cau.cs.kieler.core.ui.CoreUIPlugin;
import de.cau.cs.kieler.core.ui.commands.AffectedFileSelectionDialog;
import de.cau.cs.kieler.core.util.Maybe;

/**
 * A command handler that reinitializes a diagram file from a given model file.
 * 
 * @author soh
 * @author msp
 * @kieler.rating 2010-06-14 proposed yellow soh
 */
public abstract class AbstractInitDiagramHandler extends AbstractHandler {

    /**
     * Provides the file extension for the diagram file.
     * 
     * @return the file extension
     */
    protected abstract String getDiagramExtension();

    /**
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        // get the selection
        ISelection selection = HandlerUtil.getCurrentSelection(event);
        if (selection instanceof IStructuredSelection) {
            Iterator<?> iter = ((IStructuredSelection) selection).iterator();
            Set<Resource> processedResources = new HashSet<Resource>();
            while (iter.hasNext()) {
                Object o = iter.next();
                IFile file = null;
                if (o instanceof IFile) {
                    file = (IFile) o;
                } else if (o instanceof EditPart) {
                    EditPart editPart = (EditPart) o;
                    EObject eObj = GraphicalFrameworkService.getInstance()
                            .getBridge(editPart).getElement(editPart);
                    if (eObj != null) {
                        Resource resource = eObj.eResource();
                        if (!processedResources.contains(resource)) {
                            processedResources.add(resource);
                            URI uri = resource.getURI();
                            IPath path = Path.fromOSString(uri.toPlatformString(true));
                            file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
                        }
                    }
                }
                if (file != null) {
                    // execute transformation
                    reinitialize(file);
                }
            }
            // refresh workspace when done to show changes
            refreshWorkspace();
        }
        return null;
    }

    /**
     * Refresh the workspace.
     */
    protected void refreshWorkspace() {
        // Here we have to block the caller until eclipse has finished
        // refreshing the workspace, otherwise necessary files might
        // not show up.
        WaitUntilDoneMonitor monitor = new WaitUntilDoneMonitor();
        try {
            ResourcesPlugin.getWorkspace().getRoot()
                    .refreshLocal(IResource.DEPTH_INFINITE, monitor);
            monitor.waitUntilDone();
        } catch (CoreException exception) {
            StatusManager.getManager().handle(exception, CoreModelPlugin.PLUGIN_ID);
        }
    }

    /**
     * Get the user selection of the affected files.
     * 
     * @param affectedFiles
     *            the affected files.
     * @return the selected files
     */
    private List<IFile> getUserSelection(final List<IFile> affectedFiles) {
        final Maybe<List<IFile>> result = Maybe.create();
        PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
            public void run() {
                Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

                AffectedFileSelectionDialog dialog =
                        new AffectedFileSelectionDialog(shell, affectedFiles);
                result.set(dialog.openDialog());
            }
        });
        return result.get();
    }

    /**
     * Reinitialize the diagram file. The current diagram file is removed, if present, and replaced
     * by a new diagram file which is initialized from the model.
     * 
     * @param file the model file
     */
    public void reinitialize(final IFile file) {
        IContainer container = file.getParent();
        List<IFile> partners = findPartners(file, container);

        List<IFile> selection;
        if (partners.isEmpty()) {
            IPath fullPath = file.getFullPath();
            String name = fullPath.removeFileExtension().lastSegment();
            IPath targetPath = new Path(name + "." + getDiagramExtension());
            int i = 0;
            while (container.exists(targetPath)) {
                targetPath = new Path(name + (++i) + "." + getDiagramExtension());
            }
            selection = new ArrayList<IFile>(1);
            selection.add(ResourcesPlugin.getWorkspace().getRoot().getFile(
                    container.getFullPath().append(targetPath)));
        } else {
            selection = getUserSelection(partners);
        }

        if (selection != null) {
            reinitializeSelectedFiles(file, partners, selection);
        }
    }

    /**
     * Reinitialize the selected diagram files.
     * 
     * @param modelFile the model file
     * @param partners list of partner diagram files
     * @param selection the user's selection of diagram files
     */
    private void reinitializeSelectedFiles(final IFile modelFile,
            final List<IFile> partners, final List<IFile> selection) {
        try {
            PlatformUI.getWorkbench().getProgressService()
                    .busyCursorWhile(new IRunnableWithProgress() {
                public void run(final IProgressMonitor monitor)
                        throws InvocationTargetException, InterruptedException {
                    for (IFile partner : selection) {
                        performPreOperationActions(modelFile, partners, monitor);

                        // delete old diagram file
                        IResource[] resources = new IResource[1];
                        resources[0] = partner;
                        try {
                            ResourcesPlugin.getWorkspace().delete(resources, true, null);
                        } catch (CoreException exception) {
                            StatusManager.getManager().handle(exception, CoreModelPlugin.PLUGIN_ID);
                        }
                        IEditorPart newEditor = initializeDiagram(modelFile, partner, monitor);

                        performPostOperationAction(modelFile, partners, monitor, newEditor);

                        ReInitDiagramDoneTrigger.triggerAll(newEditor);
                    }
                }
            });
        } catch (InvocationTargetException exception) {
            IStatus status = new Status(IStatus.ERROR, CoreModelPlugin.PLUGIN_ID,
                    "Error during initialization.", exception.getCause());
            StatusManager.getManager().handle(status);
        } catch (InterruptedException exception) {
            // ignore exception
        }

    }

    /**
     * Perform actions after the reinitialization. Default implementation does nothing.
     * Subclasses may override.
     * 
     * @param path
     *            the file
     * @param partners
     *            the partner files
     * @param monitor
     *            the progress monitor
     * @param newEditor
     *            the newly opened editor
     */
    protected void performPostOperationAction(final IFile path,
            final List<IFile> partners, final IProgressMonitor monitor,
            final IEditorPart newEditor) {
    }

    /**
     * Perform actions prior to the reinitialization. Default implementation does nothing.
     * Subclasses may override.
     * 
     * @param path
     *            the file
     * @param partners
     *            the affected partner files
     * @param monitor
     *            the progress monitor
     */
    protected void performPreOperationActions(final IFile path,
            final List<IFile> partners, final IProgressMonitor monitor) {
    }

    /**
     * Search the given container for files that reference the given model.
     * 
     * @param root
     *            the root container
     * @param modelFile
     *            the model file
     * @return a list of files that reference the model
     */
    private List<IFile> findPartners(final IFile modelFile, final IContainer root) {
        List<IFile> result = new LinkedList<IFile>();
        try {
            String name = modelFile.getName();
            for (IResource res : root.members()) {
                if (res instanceof IFile) {
                    IFile file = (IFile) res;
                    if (getDiagramExtension().equals(file.getFileExtension())) {

                        // found relevant file
                        try {
                            BufferedReader br = new BufferedReader(new InputStreamReader(
                                    file.getContents()));

                            // line that is read at the moment
                            String s = br.readLine();

                            // search the file for references to the model file
                            while (s != null) {
                                if (s.contains(name)) {
                                    result.add(file);
                                    break;
                                }
                                s = br.readLine();
                            }

                            // close streams
                            br.close();
                        } catch (FileNotFoundException exception) {
                            IStatus status = new Status(IStatus.ERROR, CoreModelPlugin.PLUGIN_ID,
                                    "Error while searching for partner files.", exception);
                            StatusManager.getManager().handle(status);
                        } catch (IOException exception) {
                            IStatus status = new Status(IStatus.ERROR, CoreModelPlugin.PLUGIN_ID,
                                    "Error while searching for partner files.", exception);
                            StatusManager.getManager().handle(status);
                        }
                    }
                }
            }
        } catch (CoreException exception) {
            StatusManager.getManager().handle(exception, CoreModelPlugin.PLUGIN_ID);
        }
        return result;
    }

    /**
     * Initialize a diagram file from a given model file.
     * 
     * @param modelFile
     *            the source file.
     * @param diagramFile
     *            the destination file.
     * @param monitor
     *            the progress monitor
     * @return the diagram editor that was opened, may be null
     */
    public IEditorPart initializeDiagram(final IFile modelFile,
            final IFile diagramFile, final IProgressMonitor monitor) {
        URI domainModelURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

        TransactionalEditingDomain editingDomain = createEditingDomain();
        ResourceSet resourceSet = editingDomain.getResourceSet();

        EObject modelRoot = null;
        try {
            Resource resource = resourceSet.getResource(domainModelURI, true);
            modelRoot = resource.getContents().get(0);
        } catch (WrappedException ex) {
            IStatus status = new Status(IStatus.ERROR, CoreModelPlugin.PLUGIN_ID,
                    "Error while reading the model file.", ex.exception());
            StatusManager.getManager().handle(status, StatusManager.SHOW);
            return null;
        }
        if (modelRoot == null) {
            IStatus status = new Status(IStatus.ERROR, CoreUIPlugin.PLUGIN_ID,
                            "Unable to read the domain model from the given file.");
            StatusManager.getManager().handle(status, StatusManager.LOG);
            return null;
        }
        return createNewDiagram(modelRoot, editingDomain, diagramFile, monitor);
    }

    /**
     * Create a new transactional editing domain. For GMF this is done using
     * <pre>
     *   GMFEditingDomainFactory.INSTANCE.createEditingDomain()
     * <pre>
     * 
     * @return a new transactional editing domain
     */
    protected abstract TransactionalEditingDomain createEditingDomain();

    /**
     * Create a new diagram file from the given semantics model. Subclasses must
     * override this as it is specific for each different diagram type.
     * 
     * @param modelRoot
     *            the root element of the domain model.
     * @param editingDomain
     *            the editing domain.
     * @param diagramPath
     *            the destination file
     * @param monitor
     *            the progress monitor
     * @return the editor that was opened for the diagram, may be null
     */
    public abstract IEditorPart createNewDiagram(final EObject modelRoot,
            final TransactionalEditingDomain editingDomain,
            final IFile diagramPath, IProgressMonitor monitor);

    /**
     * Utility method for opening an editor on the resource.
     * 
     * @param diagramResource
     *            the resource
     * @param editorId
     *            the editor id
     * @return the opened editor
     * @throws PartInitException
     *             if the editor was not opened
     */
    protected IEditorPart openDiagram(final Resource diagramResource,
            final String editorId) throws PartInitException {
        String path = diagramResource.getURI().toPlatformString(true);
        IResource workspaceResource = ResourcesPlugin.getWorkspace().getRoot()
                        .findMember(new Path(path));
        if (workspaceResource instanceof IFile) {
            IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                            .getActivePage();
            return page.openEditor(new FileEditorInput((IFile) workspaceResource), editorId);
        }
        return null;
    }

    /**
     * A monitor that blocks the calling thread until the monitored thread is
     * done.
     * 
     * @author soh
     * @kieler.rating 2010-03-01 proposed yellow
     */
    private static class WaitUntilDoneMonitor implements IProgressMonitor {

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
                // ignore exception
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
}
