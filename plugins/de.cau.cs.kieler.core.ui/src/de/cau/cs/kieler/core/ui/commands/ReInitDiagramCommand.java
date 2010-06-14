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
package de.cau.cs.kieler.core.ui.commands;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Semaphore;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.EvaluationContext;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

/**
 * A command that reinitializes a diagram file from a given model file.
 * 
 * @author soh
 * @kieler.rating 2010-06-14 proposed yellow soh
 */
public abstract class ReInitDiagramCommand extends AbstractHandler {

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
            EvaluationContext evalContext = (EvaluationContext) evaluationContext;

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
                        path = ((org.eclipse.core.internal.resources.File) o)
                                .getFullPath();
                    } else if (o instanceof EditPart) {
                        EditPart editPart = (EditPart) o;
                        EObject eObj = ((View) editPart.getModel())
                                .getElement();
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
                        path = ((org.eclipse.core.internal.resources.File) o)
                                .getFullPath();
                    } else if (o instanceof EditPart) {
                        EditPart eObj = (EditPart) o;
                        URI uri = ((View) eObj.getModel()).getElement()
                                .eResource().getURI();
                        path = Path.fromOSString(uri.toPlatformString(true));
                    }
                    if (path != null) {
                        try {
                            // execute transformation
                            reinitialize(path);
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
        WaitUntilDoneMonitor monitor = new WaitUntilDoneMonitor();
        try {
            ResourcesPlugin.getWorkspace().getRoot().refreshLocal(
                    IResource.DEPTH_INFINITE, monitor);
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
    private List<IPath> getUserSelection(final List<IPath> affectedFiles) {
        final List<IPath> result = new LinkedList<IPath>();
        PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

            public void run() {
                Shell shell = PlatformUI.getWorkbench()
                        .getActiveWorkbenchWindow().getShell();

                AffectedFileSelectionDialog dialog = new AffectedFileSelectionDialog(
                        shell, affectedFiles);
                List<IPath> results = dialog.openDialog();
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
    private void reinitialize(final IPath path) {
        List<IPath> partners = getPartners(path);

        List<IPath> selection = getUserSelection(partners);

        for (IPath partner : selection) {
            performPreOperationActions(path, partners);

            IPath kixsPath = path.getFileExtension()
                    .equals(getModelExtension()) ? path : partner;
            IPath kidsPath = path.getFileExtension().equals(
                    getDiagramExtension()) ? path : partner;
            File kidsFile = getFile(kidsPath);

            // delete old diagram file
            if (kidsFile != null) {
                kidsFile.delete();
            }

            reinitializeDiagram(kixsPath, kidsPath);

            performPostOperationAction(path, partners);
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
     */
    @SuppressWarnings("unused")
    protected void performPostOperationAction(final IPath path,
            final List<IPath> partners) {
    }

    /**
     * Perform actions prior to the reinit. Default implemenations does nothing.
     * Subclasses may override.
     * 
     * @param path
     *            the file
     * @param partners
     *            the partner files
     */
    @SuppressWarnings("unused")
    protected void performPreOperationActions(final IPath path,
            final List<IPath> partners) {
    }

    /**
     * Get the partner files for a specific file.
     * 
     * @param path
     *            the file
     * @return the list of partners
     */
    private List<IPath> getPartners(final IPath path) {
        List<File> files = new LinkedList<File>();
        // recursively search the workspace
        if (path.getFileExtension().equals(getModelExtension())) {
            findRec(files, Platform.getLocation().toFile(), path);
        }
        List<IPath> result = new LinkedList<IPath>();
        for (File file : files) {
            if (file != null
                    && (!file.exists() || path.getFileExtension().equals(
                            getModelExtension()))) {
                // convert the file to Ipath and add to list of results
                IPath filePath = Path.fromOSString(file.getPath());
                result.add(filePath.makeRelativeTo(Platform.getLocation()));
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
    private void findRec(final List<File> result, final File root,
            final IPath model) {
        if (root.isDirectory()) {
            // recursively look through all files in the directory
            for (File file : root.listFiles()) {
                findRec(result, file, model);
            }
        } else if (root.getPath().endsWith("." + getDiagramExtension())) {
            // found relevant file
            try {
                InputStream is = new FileInputStream(root);
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);

                // line that is read at the moment
                String s = br.readLine();
                boolean found = false;

                // search the file for references to the model file
                while (s != null && !found) {
                    if (s.contains(model.toFile().getName())) {
                        if (!found) {
                            found = true;
                            result.add(root);
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

    /**
     * Get the file object to a given path.
     * 
     * @param path
     *            the path
     * @return the file
     */
    private File getFile(final IPath path) {
        String location = path.toOSString();
        String platformPath = Platform.getLocation().toOSString();
        if (!location.contains(platformPath)) {
            location = platformPath + location;
        }
        IPath partnerLocation = Path.fromOSString(location);
        return partnerLocation.toFile();
    }

    /**
     * Reinitialize the diagram from a given model file.
     * 
     * @param modelPath
     *            the source file.
     * @param diagramPath
     *            the destination file.
     */
    private void reinitializeDiagram(final IPath modelPath,
            final IPath diagramPath) {
        URI domainModelURI = URI.createPlatformResourceURI(
                modelPath.toString(), true);

        TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
                .createEditingDomain();
        ResourceSet resourceSet = editingDomain.getResourceSet();

        EObject diagramRoot = null;
        try {
            Resource resource = resourceSet.getResource(domainModelURI, true);
            diagramRoot = resource.getContents().get(0);
        } catch (WrappedException ex) {
            ex.printStackTrace();
            return;
        }
        if (diagramRoot == null) {
            System.out.println("DiagramRoot is null.");
            return;
        }
        createNewDiagram(diagramRoot, editingDomain, diagramPath);
    }

    /**
     * Create a new diagram file from the given semantics model. Subclasses must
     * override this as it is specific for each different diagram type.
     * 
     * @param diagramRoot
     *            the root element.
     * @param editingDomain
     *            the editing domain.
     * @param diagramPath
     *            the destination file
     * @return true if the creation was successful
     */
    protected abstract boolean createNewDiagram(final EObject diagramRoot,
            final TransactionalEditingDomain editingDomain,
            final IPath diagramPath);

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
