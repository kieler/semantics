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

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IWorkbenchPartConstants;

import de.cau.cs.kieler.kico.klighd.view.ModelView;

/**
 * @author als
 *
 */
public class EditorSafeListener implements IPropertyListener {

    public interface SafeEventListener {
        /**
         * The event handler for the editor save event.
         * 
         * @param editor
         *            the saved editor
         */
        public void onEditorSaved(IEditorPart editor);
    }

    private SafeEventListener listener;

    /**
     * 
     */
    public EditorSafeListener(SafeEventListener listener) {
        this.listener = listener;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void propertyChanged(Object source, int propId) {
        IEditorPart editor = (IEditorPart) source;
        if (propId == IWorkbenchPartConstants.PROP_DIRTY && !editor.isDirty()) {
            // dirty flag changed and editor is not dirty -> saved
            // Notify all related model views
            listener.onEditorSaved(editor);
        }
    }

    public void add(IEditorPart editor) {
        if (editor != null) {
            editor.addPropertyListener(this);
        }
    }

    public void remove(IEditorPart editor) {
        if (editor != null) {
            editor.removePropertyListener(this);
        }
    }

}
