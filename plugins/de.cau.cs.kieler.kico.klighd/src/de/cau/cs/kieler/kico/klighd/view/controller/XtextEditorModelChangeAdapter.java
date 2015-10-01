/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.view.controller;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.ui.util.ResourceUtil;

import de.cau.cs.kieler.core.WrappedException;

/**
 * An adapter to listen for the change event of an xtext editor.
 * 
 * @author als
 * @kieler.design 2015-09-29 proposed
 * @kieler.rating 2015-09-29 proposed yellow
 *
 */
public class XtextEditorModelChangeAdapter implements IXtextModelListener {

    /**
     * The listener interface for notifications of the {@link XtextEditorModelChangeAdapter}.
     * 
     * @author als
     */
    public interface XtextChangeListener {
        /**
         * The event handler for the editor change event.
         * 
         * @param editor
         *            the editor of the changed model
         * @param resource
         *            the models resource
         */
        public void onModelChanged(XtextEditor editor, XtextResource resource);
    }

    /** The listener to be notified by this adapter */
    private XtextChangeListener listener;
    /** The current editor this adapter is listening to */
    private XtextEditor editor;

    /**
     * Creates an adapter for the given listener. The adapter must be activated on an editor to
     * start fire events.
     */
    public XtextEditorModelChangeAdapter(XtextChangeListener listener) {
        this.listener = listener;
    }

    /**
     * Starts listening on the given editor.
     *
     * @param editor
     *            the editor
     */
    public void activate(XtextEditor editor) {
        if (editor != null) {
            this.editor = editor;
            editor.getDocument().addModelListener(this);
        }
    }

    /**
     * Stops the listening on the current editor.
     */
    public void deactivate() {
        if (editor != null) {
            editor.getDocument().removeModelListener(this);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void modelChanged(XtextResource resource) {
        if (!hasErrors(resource) && editor != null) {
            listener.onModelChanged(editor, resource);
        }
    }

    /**
     * Checks the given resource for error markers.
     * 
     * @param resource
     *            the resource
     * @return true if any errors are present otherwise false
     */
    private boolean hasErrors(final XtextResource resource) {
        IFile underlyingFile = ResourceUtil.getUnderlyingFile(resource);

        if (underlyingFile == null) {
            // this happens in case models being part of installed bundles (e.g. Xtend files)
            // are opened; it doesn't make sense to attach any markers to them
            return false;
        }

        try {
            /* examine the files error markers, whether one of is created by this mechanisms */
            List<IMarker> currentMarkers = Arrays.asList(
                    underlyingFile.findMarkers(IMarker.PROBLEM, false, IResource.DEPTH_INFINITE));

            /* if model is correct... */
            if (resource.getErrors().isEmpty() && currentMarkers.isEmpty()) {
                return false;
            }
        } catch (CoreException e) {
            /* in this case something went heavily wrong */
            throw new WrappedException(e);
        }

        return true;
    }

}
