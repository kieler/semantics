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

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.swt.widgets.Shell;

/**
 * Dialog for selecting the files affected by a reinitialization operation.
 * 
 * @author soh
 */
public class AffectedFileSelectionDialog extends
        SelectObjectsFromListDialog<IFile> {

    /** The message to display. */
    private static final String MESSAGE = "Select which diagrams should be"
            + " reinitialized.\n\n WARNING: This will delete all notes and layout information";

    /**
     * 
     * Creates a new AffectedFileSelectionDialog.
     * 
     * @param theShell
     *            the shell
     * @param files
     *            the files
     */
    public AffectedFileSelectionDialog(final Shell theShell,
            final List<IFile> files) {
        super(theShell, files, MESSAGE,
                new FunctionReturningString.IFileToStringFunction());
    }
}
