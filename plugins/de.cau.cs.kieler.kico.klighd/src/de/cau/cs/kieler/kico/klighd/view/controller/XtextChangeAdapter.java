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
 * @author als
 *
 */
public class XtextChangeAdapter implements IXtextModelListener {

    public interface XtextChangeListener {
        /**
         * The event handler for the editor save event.
         * 
         * @param editor
         *            the saved editor
         */
        /**
         * 
         * @param editor
         * @param resource
         */
        public void onChanged(XtextEditor editor, XtextResource resource);
    }

    private XtextChangeListener listener;

    private XtextEditor editor;

    /**
     * 
     */
    public XtextChangeAdapter(XtextChangeListener listener) {
        this.listener = listener;
    }

    public void activate(XtextEditor editor) {
        if (editor != null) {
            this.editor = editor;
            editor.getDocument().addModelListener(this);
        }
    }

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
            listener.onChanged(editor, resource);
        }
    }

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
