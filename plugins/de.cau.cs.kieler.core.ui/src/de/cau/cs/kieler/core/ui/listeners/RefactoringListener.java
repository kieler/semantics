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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ltk.core.refactoring.RefactoringDescriptor;
import org.eclipse.ltk.core.refactoring.history.IRefactoringHistoryListener;
import org.eclipse.ltk.core.refactoring.history.RefactoringHistoryEvent;
import org.eclipse.ltk.core.refactoring.resource.DeleteResourcesDescriptor;
import org.eclipse.ltk.core.refactoring.resource.MoveResourcesDescriptor;
import org.eclipse.ltk.core.refactoring.resource.RenameResourceDescriptor;

/**
 * This class listens to refactoring events like delete, move, rename and
 * performs actions when files of interest are affected.
 * 
 * @author soh
 * @kieler.rating 2010-02-18 proposed yellow soh
 */
public class RefactoringListener implements IRefactoringHistoryListener {

    /** File extension for diagram files. */
    private static final String DIAGRAM_EXTENSION = "kids";

    /** File extension for model files. */
    private static final String MODEL_EXTENSION = "kixs";

    /**
     * Contains the different refactoring operations.
     * 
     * @author soh
     */
    private enum OP {
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
        RefactoringDescriptor desc = event.getDescriptor().requestDescriptor(
                null);
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
            ResourcesPlugin.getWorkspace().getRoot().refreshLocal(
                    IResource.DEPTH_INFINITE, null);
        } catch (CoreException e0) {
            e0.printStackTrace();
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

        for (IPath path : locations) {
            // File partner = getPartner(path);
            // if (partner != null) {
            // partner.delete();
            // }
            executeOperation(path, OP.DELETE, null);
        }
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
    private List<File> executeOperation(final IPath path, final OP op,
            final String newName) {
        List<File> result = new LinkedList<File>();
        if (path.getFileExtension().equals(MODEL_EXTENSION)) {
            findRec(result, Platform.getLocation().toFile(), path, op, newName);

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
     */
    private void findRec(final List<File> result, final File root,
            final IPath model, final OP op, final String newName) {
        if (root.isDirectory()) {
            // recursively look through all files in the directory
            for (File file : root.listFiles()) {
                findRec(result, file, model, op, newName);
            }
        } else if (root.getPath().endsWith(DIAGRAM_EXTENSION)) {
            // found relevant file
            try {
                InputStream is = new FileInputStream(root);
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
                            root.delete();
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
                    OutputStream os = new FileOutputStream(root);
                    OutputStreamWriter osw = new OutputStreamWriter(os);
                    BufferedWriter bw = new BufferedWriter(osw);

                    for (String string : list) {
                        bw.write(string);
                        bw.flush();
                    }
                }

            } catch (FileNotFoundException e0) {
                e0.printStackTrace();
            } catch (IOException e0) {
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
            List<File> list = executeOperation(path, OP.MOVE, null);
            for (File partner : list) {
                if (partner != null) {
                    IPath srcName = path.removeFileExtension();
                    String name = srcName.segment(srcName.segmentCount() - 1);
                    name = dest.toOSString() + IPath.SEPARATOR + name + "."
                            + DIAGRAM_EXTENSION;
                    IPath newPath = Path.fromOSString(Platform.getLocation()
                            .toOSString()
                            + name);
                    partner.renameTo(newPath.toFile());
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
        // File partner = getPartner(location);
        // if (partner != null) {
        // String newPath = location.removeFileExtension().removeLastSegments(
        // 1).addTrailingSeparator().toOSString()
        // + newName;
        // IPath newLocation = Path.fromOSString(Platform.getLocation()
        // .toOSString()
        // + newPath);
        // IPath partnerPath = newLocation.removeFileExtension()
        // .addFileExtension("kids");
        // partner.renameTo(partnerPath.toFile());
        // }
    }
}
