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
package de.cau.cs.kieler.core.ui.listeners;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.ltk.core.refactoring.RefactoringDescriptor;
import org.eclipse.ltk.core.refactoring.history.IRefactoringHistoryListener;
import org.eclipse.ltk.core.refactoring.history.RefactoringHistoryEvent;
import org.eclipse.ltk.core.refactoring.resource.DeleteResourcesDescriptor;
import org.eclipse.ltk.core.refactoring.resource.MoveResourcesDescriptor;
import org.eclipse.ltk.core.refactoring.resource.RenameResourceDescriptor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.ui.CoreUIPlugin;

/**
 * This class listens to refactoring events like delete, move, rename and
 * performs actions when files of interest are affected.
 * 
 * @author soh
 */
public class RefactoringListener implements IRefactoringHistoryListener {

    /**
     * File extensions for diagram files. Must be in same order as
     * MODEL_EXTENSIONS. Add new extensions here.
     */
    private static final String[] DIAGRAM_EXTENSIONS = { "kids", "kaod" }; //$NON-NLS-1$

    /**
     * File extensions for model files. Must be in same order as
     * DIAGRAM_EXTENSIONS. Add new extensions here.
     */
    private static final String[] MODEL_EXTENSIONS = { "kixs", "kaom" }; //$NON-NLS-1$

    /**
     * Contains the different refactoring operations.
     * 
     * @author soh
     */
    public enum OP {
        /** Indicates a delete action. */
        DELETE,

        /** Indicates a move. */
        MOVE,

        /** Indicates a renaming. */
        RENAME;
    }

    /**
     * {@inheritDoc}
     */
    public void historyNotification(final RefactoringHistoryEvent event) {
        // decide which of the cases to take
        RefactoringDescriptor desc = event.getDescriptor()
                .requestDescriptor(null);
        if (desc instanceof RenameResourceDescriptor) {
            RenameResourceDescriptor renameDesc = (RenameResourceDescriptor) desc;
            renameFile(renameDesc);
        }

        if (desc instanceof DeleteResourcesDescriptor) {
            DeleteResourcesDescriptor deleteDesc = (DeleteResourcesDescriptor) desc;
            deleteFile(deleteDesc);
        }

        if (desc instanceof MoveResourcesDescriptor) {
            MoveResourcesDescriptor moveDesc = (MoveResourcesDescriptor) desc;
            moveFile(moveDesc);
        }

        try {
            // refresh workspace
            ResourcesPlugin.getWorkspace().getRoot()
                    .refreshLocal(IResource.DEPTH_INFINITE, null);
        } catch (CoreException e) {
            StatusManager.getManager().handle(e, CoreUIPlugin.PLUGIN_ID);
        }
    }

    // --------------------------------------------------------------------------

    /**
     * Try to track a deletion and remove the affected diagram file.
     * 
     * @param deleteDesc
     *            the deletion descriptor
     */
    private void deleteFile(final DeleteResourcesDescriptor deleteDesc) {
        IPath[] locations = deleteDesc.getResourcePaths();
        final List<IFile> affectedFiles = new LinkedList<IFile>();

        for (IPath path : locations) {
            affectedFiles.addAll(executeOperation(path, OP.DELETE, null));
        }

        // found files, ask user for confirmation
        if (!affectedFiles.isEmpty()) {
            List<IFile> deletedFiles = getUserSelection(affectedFiles,
                    OP.DELETE);

            if (!deletedFiles.isEmpty()) {
                try {
                    ResourcesPlugin.getWorkspace().delete(
                            deletedFiles.toArray(new IResource[deletedFiles
                                    .size()]), true, null);
                } catch (CoreException e0) {
                    e0.printStackTrace();
                }
            }
        }
    }

    /**
     * Get the user selection of the affected files.
     * 
     * @param affectedFiles
     *            the affected files.
     * @param op
     *            the operation
     * @return the selected files
     */
    private List<IFile> getUserSelection(final List<IFile> affectedFiles,
            final OP op) {
        final List<IFile> result = new LinkedList<IFile>();
        if (!affectedFiles.isEmpty()) {
            PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

                public void run() {
                    // open a dialog displaying the initially found files and
                    // ask the user which of them should be affected
                    Shell shell = PlatformUI.getWorkbench()
                            .getActiveWorkbenchWindow().getShell();

                    AffectedFileSelectionDialog dialog = new AffectedFileSelectionDialog(
                            shell, affectedFiles, op);
                    List<IFile> results = dialog.openDialog();
                    if (results != null) {
                        result.addAll(results);
                    }
                }
            });
        }
        return result;
    }

    /**
     * Execute a refactoring operation.
     * 
     * @param path
     *            the old path of the file that was refactored.
     * @param op
     *            the operation
     * @param newName
     *            optionally the new name of the file
     * @return the list of files that link to the refactored file
     */
    private List<IFile> executeOperation(final IPath path, final OP op,
            final String newName) {
        List<IFile> result = new LinkedList<IFile>();
        if (path != null) {
            String ext = path.getFileExtension();

            // test the different model extensions and find which of them is
            // applicable
            for (int i = 0; i < MODEL_EXTENSIONS.length; i++) {
                if (ext != null && ext.equals(MODEL_EXTENSIONS[i])) {
                    IFile file = ResourcesPlugin.getWorkspace().getRoot()
                            .getFile(path);
                    IContainer container = file.getParent();

                    try {
                        IResource[] members = container.members();
                        for (IResource res : members) {
                            if (res instanceof IFile) {
                                find(result, (IFile) res, path, op, newName, i);
                            }
                        }
                    } catch (CoreException e0) {
                        e0.printStackTrace();
                    }
                }
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
     * @param op
     *            the operation
     * @param newName
     *            optionally the new name of the file
     * @param index
     *            the index in the model/diagram extension list to use
     */
    private void find(final List<IFile> result, final IFile root,
            final IPath model, final OP op, final String newName,
            final int index) {
        if (root == null || root.getFileExtension() == null) {
            return;
        }
        if (root.getFileExtension().equals(DIAGRAM_EXTENSIONS[index])) {
            // found relevant file
            try {
                InputStream is = root.getContents();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);

                // list where the new content of the file is build
                List<String> list = new LinkedList<String>();

                // line that is read at the moment
                String s = br.readLine();
                boolean done = false;
                boolean found = false;

                // search the file for references to the model file
                while (s != null && !done) {
                    if (s.contains(model.toFile().getName())) {
                        switch (op) {
                        case DELETE:
                            // root.delete();
                            done = true;
                            break;
                        case RENAME:
                            // replace the old name with the new one
                            s = s.replaceAll(model.toFile().getName(), newName);
                            break;
                        case MOVE:
                            done = true;
                            break;
                        }
                        if (!found) {
                            found = true;
                            result.add(root);
                        }
                    }
                    list.add(s);
                    if (!done) {
                        s = br.readLine();
                    }
                }

                // close streams
                br.close();
                isr.close();
                is.close();

                if (op.equals(OP.RENAME)) {
                    // write information back into the file
                    StringBuilder builder = new StringBuilder();
                    for (String string : list) {
                        builder.append(string);
                    }

                    try {
                        root.setContents(new ByteArrayInputStream(builder
                                .toString().getBytes("UTF-8")), true, true,
                                null);
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }

                }
            } catch (FileNotFoundException e0) {
                e0.printStackTrace();
            } catch (IOException e0) {
                e0.printStackTrace();
            } catch (CoreException e0) {
                e0.printStackTrace();
            }
        }
    }

    /**
     * Try to track the move of a number of model files and move the
     * corresponding diagram files.
     * 
     * @param moveDesc
     *            the move descriptor
     */
    private void moveFile(final MoveResourcesDescriptor moveDesc) {
        IPath[] src = moveDesc.getResourcePathsToMove();
        IPath dest = moveDesc.getDestinationPath();
        for (IPath path : src) {
            List<IFile> list = executeOperation(path, OP.MOVE, null);
            List<IFile> selection = getUserSelection(list, OP.MOVE);

            for (IFile partner : selection) {
                if (partner != null) {
                    try {
                        partner.move(
                                dest.addTrailingSeparator().append(
                                        partner.getName()), false, null);
                    } catch (CoreException e0) {
                        e0.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * Track the renaming of a model file and rename the corresponding diagram
     * file.
     * 
     * @param renameDesc
     *            the renaming descriptor
     */
    private void renameFile(final RenameResourceDescriptor renameDesc) {
        IPath location = renameDesc.getResourcePath();
        String newName = renameDesc.getNewName();
        executeOperation(location, OP.RENAME, newName);
    }
}
