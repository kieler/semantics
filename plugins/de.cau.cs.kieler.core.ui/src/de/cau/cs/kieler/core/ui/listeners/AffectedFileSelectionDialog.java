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
import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListSelectionDialog;

import de.cau.cs.kieler.core.ui.listeners.RefactoringListener.OP;

/**
 * @author soh
 */
public class AffectedFileSelectionDialog implements IStructuredContentProvider,
        ILabelProvider {

    private Shell shell;

    private List<File> affectedFiles;

    private OP operation;

    public AffectedFileSelectionDialog(final Shell theShell,
            final List<File> files, OP theOP) {
        shell = theShell;
        affectedFiles = files;
        operation = theOP;
    }

    public List<File> openDialog() {
        ListSelectionDialog dialog = new ListSelectionDialog(shell,
                affectedFiles, this, this, getMessage());
        dialog.setHelpAvailable(false);
        dialog.setInitialElementSelections(affectedFiles);

        if (dialog.open() == Dialog.OK) {
            Object[] result = dialog.getResult();

            // convert result to the format
            List<File> output = new LinkedList<File>();
            for (Object o : result) {
                output.add((File) o);
            }
            return output;
        }
        return null;
    }

    private String getMessage() {
        switch (operation) {
        case DELETE:
            return "The following files are affected by "
                    + "the deletion and should be deleted as well.";

        }
        return "";
    }

    /**
     * {@inheritDoc}
     */
    public Object[] getElements(final Object inputElement) {
        List<File> input = new LinkedList<File>();
        if (inputElement instanceof List<?>) {
            input = (List<File>) inputElement;
        }
        return input.toArray(new File[input.size()]);
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
        if (element instanceof File) {
            File data = (File) element;
            return data.getPath();
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
