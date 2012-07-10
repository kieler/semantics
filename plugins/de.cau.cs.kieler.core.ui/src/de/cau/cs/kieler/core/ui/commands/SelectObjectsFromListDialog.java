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

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListSelectionDialog;

/**
 * Dialog for selecting object from a list of objects.
 * 
 * @author soh
 * @param <Type> The type of object
 */
public class SelectObjectsFromListDialog<Type> implements
        IStructuredContentProvider, ILabelProvider {

    /** The shell where to display the dialog. */
    private Shell shell;

    /** The list of affected files. */
    private List<Type> allObjects;

    /** The message to display. */
    private String message;

    /** Translates the object. */
    private FunctionReturningString<Type> toString;

    /**
     * 
     * Creates a new dialog.
     * 
     * @param theShell
     *            the shell
     * @param allParam
     *            the initial objects.
     * @param messageParam
     *            the message to display
     * @param toStringParam
     *            a function for conversion to string
     */
    public SelectObjectsFromListDialog(final Shell theShell,
            final List<Type> allParam, final String messageParam,
            final FunctionReturningString<Type> toStringParam) {
        message = messageParam;
        shell = theShell;
        allObjects = allParam;
        toString = toStringParam;
    }

    /**
     * 
     * Creates a new dialog.
     * 
     * @param theShell
     *            the shell
     * @param allParam
     *            the initial objects.
     * @param messageParam
     *            the message to display
     */
    public SelectObjectsFromListDialog(final Shell theShell,
            final List<Type> allParam, final String messageParam) {
        message = messageParam;
        shell = theShell;
        allObjects = allParam;
        toString = null;
    }

    /**
     * Open the list selection dialog.
     * 
     * @return the list of object selected by the user
     */
    @SuppressWarnings("unchecked")
    public List<Type> openDialog() {
        ListSelectionDialog dialog = new ListSelectionDialog(shell, allObjects,
                this, this, message);
        dialog.setHelpAvailable(false);
        // by default all files are selected
        dialog.setInitialElementSelections(allObjects);

        // return list if user pressed OK, else return null
        if (dialog.open() == Dialog.OK) {
            Object[] result = dialog.getResult();

            // convert result to the desired format
            List<Type> output = new LinkedList<Type>();
            for (Object o : result) {
                try {
                    output.add((Type) o);
                } catch (ClassCastException e0) {
                    /* do nothing, should not happen */
                }
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
        List<Type> input = new LinkedList<Type>();
        if (inputElement instanceof List<?>) {
            input = (List<Type>) inputElement;
        }
        return input.toArray(new Object[input.size()]);
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
    @SuppressWarnings("unchecked")
    public String getText(final Object element) {
        Type data = (Type) element;
        if (toString != null) {
            return toString.evaluate(data);
        }
        return data.toString();
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
