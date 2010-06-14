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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListSelectionDialog;

/**
 * Dialog for selecting the files affected by a reinitialization operation.
 * 
 * @author soh
 * @kieler.rating 2010-06-14 proposed yellow soh
 */
public class AffectedFileSelectionDialog implements IStructuredContentProvider,
        ILabelProvider {

    /** The shell where to display the dialog. */
    private Shell shell;

    /** The list of affected files. */
    private List<IPath> affectedFiles;

    /** The message to display. */
    private static final String MESSAGE = "Select which diagrams should be"
            + "reinitialized.\n\n WARNING: This will delete all notes and layout information";

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
            final List<IPath> files) {
        shell = theShell;
        affectedFiles = files;
    }

    /**
     * Open the list selection dialog.
     * 
     * @return the list of files selected by the user or null if the user
     *         clicked on Cancel
     */
    public List<IPath> openDialog() {
        ListSelectionDialog dialog = new ListSelectionDialog(shell,
                affectedFiles, this, this, MESSAGE);
        dialog.setHelpAvailable(false);
        // by default all files are selected
        dialog.setInitialElementSelections(affectedFiles);

        // return list if user pressed OK, else return null
        if (dialog.open() == Dialog.OK) {
            Object[] result = dialog.getResult();

            // convert result to the desired format
            List<IPath> output = new LinkedList<IPath>();
            for (Object o : result) {
                output.add((IPath) o);
            }
            return output;
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public Object[] getElements(final Object inputElement) {
        List<IPath> input = new LinkedList<IPath>();
        if (inputElement instanceof List<?>) {
            input = (List<IPath>) inputElement;
        }
        return input.toArray(new IPath[input.size()]);
    }

    /**
     * {@inheritDoc}
     */
    public void dispose() {
    }

    /**
     * {@inheritDoc}
     */
    public void inputChanged(final Viewer viewer, final Object oldInput,
            final Object newInput) {
    }

    /**
     * {@inheritDoc}
     */
    public Image getImage(final Object element) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public String getText(final Object element) {
        if (element instanceof IPath) {
            IPath data = (IPath) element;
            return data.toOSString();
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public void addListener(final ILabelProviderListener listener) {
    }

    /**
     * {@inheritDoc}
     */
    public boolean isLabelProperty(final Object element, final String property) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public void removeListener(final ILabelProviderListener listener) {
    }
}
