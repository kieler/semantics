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
package de.cau.cs.kieler.core.model.ui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Semaphore;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.EvaluationContext;
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
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.progress.IProgressService;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.model.trigger.ReInitDiagramDoneTrigger;
import de.cau.cs.kieler.core.ui.CoreUIPlugin;
import de.cau.cs.kieler.core.ui.commands.AffectedFileSelectionDialog;

/**
 * A command that reinitializes a diagram file from a given model file.
 * 
 * @author soh
 * @kieler.rating 2010-06-14 proposed yellow soh
 */
public abstract class AbstractReInitDiagramCommand extends AbstractHandler {

    /**
     * Provides the file extension for the diagram file.
     * 
     * @return the file extension
     */
    protected abstract String getDiagramExtension();

    /**
     * Provides the file extension for the model file.
     * 
     * @return the file extension
     */
    protected abstract String getModelExtension();

    /**
     * Checks whether the selection consists of edit parts in files with the
     * model extension or files with the model extension.
     * 
     * @param evaluationContext
     *            the evaluation context
     */
    @Override
    @SuppressWarnings("restriction")
    public void setEnabled(final Object evaluationContext) {
        if (evaluationContext instanceof EvaluationContext) {
            EvaluationContext evalContext =
                    (EvaluationContext) evaluationContext;

            // get list of selected files
            Object defVar = evalContext.getDefaultVariable();
            if (defVar instanceof Iterable<?>) {
                Iterable<?> iterable = (Iterable<?>) defVar;
                Iterator<?> iter = iterable.iterator();
                while (iter.hasNext()) {
                    Object o = iter.next();
                    IPath path = null;
                    if (o instanceof org.eclipse.core.internal.resources.File) {
                        // selection is an a file
                        path =
                                ((org.eclipse.core.internal.resources.File) o)
                                        .getFullPath();
                    } else if (o instanceof EditPart) {
                        EditPart editPart = (EditPart) o;
                        EObject eObj = getEObjectFromEditPart(editPart);
                        // no model element found for the edit part
                        if (eObj == null) {
                            super.setBaseEnabled(false);
                            return;
                        }
                        Resource res = eObj.eResource();
                        // edit part doesn't belong to a resource
                        if (res == null) {
                            super.setBaseEnabled(false);
                            return;
                        }
                        URI uri = res.getURI();
                        // set the path to the path of the file
                        path = Path.fromOSString(uri.toPlatformString(true));

                    }
                    // check if file has the model extension
                    if (path != null
                            && path.getFileExtension().equals(
                                    getModelExtension())) {
                        super.setBaseEnabled(true);
                        return;
                    }
                }
            }
        }
        super.setBaseEnabled(false);
    }

    /**
     * GMF method for getting model element from EditPart. Subclasses should
     * override.
     * 
     * @param editPart
     *            the editpart
     * @return the domain model element
     */
    public EObject getEObjectFromEditPart(final EditPart editPart) {
        Object model = editPart.getModel();
        if (model instanceof View) {
            return ((View) model).getElement();
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("restriction")
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        // get the selection
        Object object = event.getApplicationContext();
        if (object instanceof EvaluationContext) {
            EvaluationContext evalContext = (EvaluationContext) object;
            // get list of selected files
            Object defVar = evalContext.getDefaultVariable();
            if (defVar instanceof Iterable<?>) {
                Iterable<?> iterable = (Iterable<?>) defVar;
                Iterator<?> iter = iterable.iterator();
                while (iter.hasNext()) {
                    Object o = iter.next();
                    IPath path = null;
                    // perform same checks as in set enabled
                    if (o instanceof org.eclipse.core.internal.resources.File) {
                        path =
                                ((org.eclipse.core.internal.resources.File) o)
                                        .getFullPath();
                    } else if (o instanceof EditPart) {
                        EditPart editPart = (EditPart) o;
                        EObject eObj = getEObjectFromEditPart(editPart);
                        if (eObj != null) {
                            URI uri = eObj.eResource().getURI();
                            path =
                                    Path.fromOSString(uri
                                            .toPlatformString(true));
                        }
                    }
                    if (path != null) {
                        IFile file =
                                ResourcesPlugin.getWorkspace().getRoot()
                                        .getFile(path);
                        try {
                            // execute transformation
                            reinitialize(file);
                        } catch (RuntimeException e0) {
                            e0.printStackTrace();
                            throw e0;
                        }
                    }
                }
                // refresh workspace when done to show changes
                refreshWorkspace();
            }
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
        } catch (CoreException e0) {
            e0.printStackTrace();
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
        final List<IFile> result = new LinkedList<IFile>();
        PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

            public void run() {
                Shell shell =
                        PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                                .getShell();

                AffectedFileSelectionDialog dialog =
                        new AffectedFileSelectionDialog(shell, affectedFiles);
                List<IFile> results = dialog.openDialog();
                if (results != null) {
                    result.addAll(results);
                }
            }
        });
        return result;
    }

    /**
     * Reinitialize the diagram file.
     * 
     * @param path
     *            the path of the model file
     */
    public void reinitialize(final IFile path) {
        List<IFile> partners = getPartners(path);

        List<IFile> selection = new LinkedList<IFile>();
        if (partners.isEmpty()) {
            IPath plain = path.getFullPath().removeFileExtension();
            IPath newPath = plain.addFileExtension(getDiagramExtension());
            IFile file =
                    ResourcesPlugin.getWorkspace().getRoot().getFile(newPath);
            int i = 0;
            while (file.exists()) {
                newPath = plain.append(i++ + "");
                file =
                        ResourcesPlugin.getWorkspace().getRoot()
                                .getFile(newPath);
            }
            selection.add(file);
        } else {
            selection = getUserSelection(partners);
        }

        reinitializeSelectedFiles(path, partners, selection);

    }

    /**
     * 
     * @param path
     * @param partners
     * @param selection
     */
    private void reinitializeSelectedFiles(final IFile path,
            final List<IFile> partners, final List<IFile> selection) {
        IWorkbench wb = PlatformUI.getWorkbench();
        IProgressService ps = wb.getProgressService();
        try {
            ps.busyCursorWhile(new IRunnableWithProgress() {

                public void run(final IProgressMonitor monitor)
                        throws InvocationTargetException, InterruptedException {
                    for (IFile partner : selection) {
                        performPreOperationActions(path, partners, monitor);

                        IFile kixsPath =
                                path.getFileExtension().equals(
                                        getModelExtension()) ? path : partner;
                        IFile kidsPath =
                                path.getFileExtension().equals(
                                        getDiagramExtension()) ? path : partner;

                        // delete old diagram file
                        if (kidsPath != null) {
                            IResource[] resources = new IResource[1];
                            resources[0] = kidsPath;
                            try {
                                ResourcesPlugin.getWorkspace().delete(
                                        resources, true, null);
                            } catch (CoreException e0) {
                                e0.printStackTrace();
                            }
                        }
                        IEditorPart newEditor =
                                reinitializeDiagram(kixsPath, kidsPath, monitor);

                        performPostOperationAction(path, partners, monitor,
                                newEditor);

                        ReInitDiagramDoneTrigger.triggerAll(newEditor);
                    }
                }
            });
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /**
     * Perform actions after the reinit. Default implemenations does nothing.
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
    @SuppressWarnings("unused")
    protected void performPostOperationAction(final IFile path,
            final List<IFile> partners, final IProgressMonitor monitor,
            final IEditorPart newEditor) {
    }

    /**
     * Perform actions prior to the reinit. Default implemenations does nothing.
     * Subclasses may override.
     * 
     * @param path
     *            the file
     * @param partners
     *            the partner files
     * @param monitor
     *            the progress monitor
     */
    @SuppressWarnings("unused")
    protected void performPreOperationActions(final IFile path,
            final List<IFile> partners, final IProgressMonitor monitor) {
    }

    /**
     * Get the partner files for a specific file.
     * 
     * @param path
     *            the file
     * @return the list of partners
     */
    private List<IFile> getPartners(final IFile path) {
        List<IFile> files = new LinkedList<IFile>();
        // recursively search the workspace
        if (path.getFileExtension().equals(getModelExtension())) {
            find(files, path.getParent(), path);
        }
        List<IFile> result = new LinkedList<IFile>();
        for (IFile file : files) {
            if (file != null
                    && (!file.exists() || path.getFileExtension().equals(
                            getModelExtension()))) {
                result.add(file);
            }
        }
        return result;
    }

    /**
     * Internal method to recursively search the whole workspace.
     * 
     * @param result
     *            the list of affected files.
     * @param root
     *            the root file
     * @param model
     *            the model file
     */
    private void find(final List<IFile> result, final IContainer root,
            final IFile model) {

        try {
            IResource[] members = root.members();

            for (IResource res : members) {

                if (res instanceof IFile) {
                    IFile file = (IFile) res;
                    if (file.getFileExtension().equals(getDiagramExtension())) {

                        // found relevant file
                        try {
                            InputStream is = file.getContents();
                            InputStreamReader isr = new InputStreamReader(is);
                            BufferedReader br = new BufferedReader(isr);

                            // line that is read at the moment
                            String s = br.readLine();
                            boolean found = false;

                            // search the file for references to the model file
                            while (s != null && !found) {
                                if (s.contains(model.getName())) {
                                    if (!found) {
                                        found = true;
                                        result.add(file);
                                    }
                                }
                                if (!found) {
                                    s = br.readLine();
                                }
                            }

                            // close streams
                            br.close();
                            isr.close();
                            is.close();
                        } catch (FileNotFoundException e0) {
                            e0.printStackTrace();
                        } catch (IOException e0) {
                            e0.printStackTrace();
                        }
                    }
                }
            }

        } catch (CoreException e01) {
            e01.printStackTrace();
        }
    }

    /**
     * Reinitialize the diagram from a given model file.
     * 
     * @param modelPath
     *            the source file.
     * @param diagramPath
     *            the destination file.
     * @param monitor
     *            the progress monitor
     * @return the diagram editor that was opened, may be null
     */
    public IEditorPart reinitializeDiagram(final IFile modelPath,
            final IFile diagramPath, final IProgressMonitor monitor) {
        String[] array = modelPath.toString().split("/");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length - 1; i++) {
            if (!array[i].equals("L")) {
                builder.append(array[i] + "/");
            }
        }
        builder.append(array[array.length - 1]);
        URI domainModelURI =
                URI.createPlatformResourceURI(builder.toString(), true);

        TransactionalEditingDomain editingDomain = createEditingDomain();
        ResourceSet resourceSet = editingDomain.getResourceSet();

        EObject modelRoot = null;
        try {
            Resource resource = resourceSet.getResource(domainModelURI, true);
            modelRoot = resource.getContents().get(0);
        } catch (WrappedException ex) {
            ex.printStackTrace();
            return null;
        }
        if (modelRoot == null) {
            IStatus status =
                    new Status(IStatus.ERROR, CoreUIPlugin.PLUGIN_ID,
                            "DiagramRoot is null.");
            StatusManager.getManager().handle(status, StatusManager.LOG);
            return null;
        }
        return createNewDiagram(modelRoot, editingDomain, diagramPath, monitor);
    }

    /**
     * GMF method for creating a new transactional editing domain. Subclasses
     * should override.
     * 
     * @return a new transactional editing domain
     */
    protected TransactionalEditingDomain createEditingDomain() {
        return GMFEditingDomainFactory.INSTANCE.createEditingDomain();
    }

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
     * @param diagram
     *            the resource
     * @param editorId
     *            the editor id
     * @return the opened editor
     * @throws PartInitException
     *             if the editor was not opened
     */
    protected IEditorPart openDiagram(final Resource diagram,
            final String editorId) throws PartInitException {
        String path = diagram.getURI().toPlatformString(true);
        IResource workspaceResource =
                ResourcesPlugin.getWorkspace().getRoot()
                        .findMember(new Path(path));
        if (workspaceResource instanceof IFile) {
            IWorkbenchPage page =
                    PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                            .getActivePage();
            return page.openEditor(new FileEditorInput(
                    (IFile) workspaceResource), editorId);
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
}
