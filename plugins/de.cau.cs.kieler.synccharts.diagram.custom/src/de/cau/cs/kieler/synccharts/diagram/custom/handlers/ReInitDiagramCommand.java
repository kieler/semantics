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
package de.cau.cs.kieler.synccharts.diagram.custom.handlers;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Semaphore;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.expressions.EvaluationContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;

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
public class ReInitDiagramCommand extends AbstractHandler {

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
                    if (o instanceof org.eclipse.core.internal.resources.File) {
                        IPath path = ((org.eclipse.core.internal.resources.File) o)
                                .getFullPath();
                        try {
                            reinitialize(path);
                        } catch (IOException e0) {
                            e0.printStackTrace();
                        } catch (RuntimeException e0) {
                            e0.printStackTrace();
                            return null;
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
    private void refreshWorkspace() {
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
     * Reinitialize the diagram file.
     * 
     * @param path
     *            the path of either the kids or the kixs file
     * @throws IOException
     *             if the operation failed
     */
    private void reinitialize(final IPath path) throws IOException {
        IPath partner = getPartner(path);

        IPath kixsPath = path.getFileExtension().equals("kixs") ? path
                : partner;
        IPath kidsPath = path.getFileExtension().equals("kids") ? path
                : partner;
        File kidsFile = getFile(kidsPath);

        // getDiagramSetup(kidsFile)

        // delete old diagram file
        if (kidsFile != null) {
            kidsFile.delete();
        }

        reinitializeDiagram(kixsPath, kidsPath);
        // kidsFile = getPartner(kixsFile)
        // addDiagramSetup(kidsFile)

        // perform auto layout
        IEditorPart editor = getActiveEditor();
        EditPart part = null;
        if (editor != null) {
            DiagramLayoutManager.layout(editor, part, false, true);
        }
    }

    /**
     * Get the active editor for the page.
     * 
     * @return the active editor.
     */
    private IEditorPart getActiveEditor() {
        IEditorPart result = null;
        IWorkbench workbench = SyncchartsDiagramEditorPlugin.getInstance()
                .getWorkbench();
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
     * Calculates the partner to a synccharts file.
     * 
     * @param path
     *            a file
     * @return the partner file
     * @throws IOException
     *             if the partner file is not valid
     */
    private IPath getPartner(final IPath path) throws IOException {
        String ext = path.getFileExtension();
        String newExt = ext.equals("kixs") ? "kids" : "kixs";
        IPath partnerPath = path.removeFileExtension().addFileExtension(newExt);
        File result = getFile(partnerPath);
        if (result == null || (!result.exists() && newExt.equals("kixs"))) {
            throw new IOException("No kixs file.");
        }
        return partnerPath;
    }

    /**
     * Get the file object to a given path
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
     * Reinitialize the diagram from a given kixs file
     * 
     * @param kixsPath
     *            the source file.
     * @param kidsPath
     *            the destination file.
     */
    private void reinitializeDiagram(final IPath kixsPath, final IPath kidsPath) {
        URI domainModelURI = URI.createPlatformResourceURI(kixsPath.toString(),
                true);

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
        createNewDiagram(diagramRoot, editingDomain, kidsPath);
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
    public boolean createNewDiagram(final EObject diagramRoot,
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
                    IProgressMonitor monitor, IAdaptable info)
                    throws ExecutionException {
                int diagramVID = SyncchartsVisualIDRegistry
                        .getDiagramVisualID(diagramRoot);
                if (diagramVID != RegionEditPart.VISUAL_ID) {
                    return CommandResult
                            .newErrorCommandResult(Messages.SyncchartsNewDiagramFileWizard_IncorrectRootError);
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

        public void worked(int work) {
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

        public void subTask(String name) {
        }

        public void setTaskName(String name) {
        }

        public void setCanceled(boolean value) {
        }

        public boolean isCanceled() {
            return false;
        }

        public void internalWorked(double work) {
        }

        public void done() {
            sem.release();
        }

        public void beginTask(String name, int totalWork) {
        }
    }
}
