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

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.swt.widgets.Shell;

import de.cau.cs.kieler.core.ui.commands.FunctionReturningString;
import de.cau.cs.kieler.core.ui.commands.SelectObjectsFromListDialog;
import de.cau.cs.kieler.core.ui.listeners.RefactoringListener.OP;

/**
 * Dialog for selecting the files affected by a refactoring operation.
 * 
 * @author soh
 */
public class AffectedFileSelectionDialog extends
        SelectObjectsFromListDialog<IFile> {

    /**
     * 
     * Creates a new AffectedFileSelectionDialog.
     * 
     * @param theShell
     *            the shell
     * @param files
     *            the files
     * @param theOP
     *            the operation
     */
    public AffectedFileSelectionDialog(final Shell theShell,
            final List<IFile> files, final OP theOP) {
        super(theShell, files, getMessage(theOP),
                new FunctionReturningString.IFileToStringFunction());
    }

    /**
     * Create a message for each operation.
     * 
     * @param operation
     *            the operation
     * @return the message
     */
    private static String getMessage(final OP operation) {
        switch (operation) {
        case DELETE:
            return "The following files are affected by "
                    + "the deletion and should be deleted as well.";
        case MOVE:
            return "The following files are affected by the move "
                    + "and should be moved as well.";
        case RENAME:
            return "Select affected files.";

        }
        return "";
    }

}
