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
package de.cau.cs.kieler.core.ui.views;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.ui.Messages;

/**
 * A Viewer for displaying some sort of text content.
 * 
 * @author msp, ctr
 * @kieler.design 2010-03-09 yellow 
 *   review by msp, soh
 */
public class TextViewer extends ContentViewer {

    /** Font name used for displayed text. */
    private static final String FONT_NAME = "monospace"; //$NON-NLS-1$
    /** Font size used for displayed text. */
    private static final int FONT_SIZE = 10;

    /** The text area used to display the text content. */
    private Text text;

    /**
     * Creates a new text viewer.
     * 
     * @param parent
     *            component that contains the text
     */
    public TextViewer(final Composite parent) {
        super();
        text = new Text(parent, SWT.READ_ONLY | SWT.WRAP | SWT.V_SCROLL);
        text.setEditable(false);
        text.setFont(new Font(Display.getDefault(), FONT_NAME, FONT_SIZE, SWT.NORMAL));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.Viewer#getControl()
     */
    @Override
    public Control getControl() {
        return text;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.Viewer#getSelection()
     */
    @Override
    public ISelection getSelection() {
        Point selection = text.getSelection();
        return new TextSelection(new Document(text.getText()), selection.x, selection.y
                - selection.x);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.Viewer#refresh()
     */
    @Override
    public void refresh() {
        text.redraw();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.Viewer#setSelection(org.eclipse.jface.viewers .ISelection,
     * boolean)
     */
    @Override
    public void setSelection(final ISelection selection, final boolean reveal) {
        try {
            if (selection instanceof ITextSelection) {
                ITextSelection textSelection = (ITextSelection) selection;
                text.setSelection(textSelection.getOffset(), textSelection.getOffset()
                        + textSelection.getLength());
            }
        } catch (ClassCastException e) {
            // Ignore silently
            Status myStatus = new Status(IStatus.ERROR, "de.cau.cs.kieler.core.ui", //$NON-NLS-1$
                    Messages.TextViewer_2, e);
            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
        }
    }

    /**
     * Changes the displayed text to the given string.
     * 
     * @param s
     *            text to be displayed
     */
    public void setText(final String s) {
        text.setText(s);
    }

    /**
     * Appends the given string to the currently displayed text.
     * 
     * @param s
     *            text to be appended
     */
    public void append(final String s) {
        text.append(s);
    }

    /**
     * Enable/Disable the current textviewer.
     * 
     * @param enabled
     *            true to enable the viewer
     */
    public void setEnabled(final boolean enabled) {
        text.setEnabled(enabled);
    }

}
