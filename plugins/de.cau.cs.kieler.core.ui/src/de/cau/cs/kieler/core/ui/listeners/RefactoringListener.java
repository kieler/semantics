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

import java.io.File;

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
            File partner = getPartner(path);
            if (partner != null) {
                partner.delete();
            }
        }
    }

    /**
     * Calculates the partner to a synccharts model file.
     * 
     * @param path
     *            the .kixs file
     * @return the .kids file
     */
    private File getPartner(final IPath path) {
        File result = null;
        if (path.getFileExtension().equals("kixs")) {
            IPath partnerPath = path.removeFileExtension().addFileExtension(
                    "kids");
            String location = Platform.getLocation().toOSString()
                    + partnerPath.toOSString();
            IPath partnerLocation = Path.fromOSString(location);
            result = partnerLocation.toFile();
        }
        return result;
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
            File partner = getPartner(path);
            if (partner != null) {
                IPath srcName = path.removeFileExtension();
                String name = srcName.segment(srcName.segmentCount() - 1);
                name = dest.toOSString() + IPath.SEPARATOR + name + ".kids";
                IPath newPath = Path.fromOSString(Platform.getLocation()
                        .toOSString()
                        + name);
                partner.renameTo(newPath.toFile());
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
        File partner = getPartner(location);
        if (partner != null) {
            String newPath = location.removeFileExtension().removeLastSegments(
                    1).addTrailingSeparator().toOSString()
                    + newName;
            IPath newLocation = Path.fromOSString(Platform.getLocation()
                    .toOSString()
                    + newPath);
            IPath partnerPath = newLocation.removeFileExtension()
                    .addFileExtension("kids");
            partner.renameTo(partnerPath.toFile());
        }
    }
}
