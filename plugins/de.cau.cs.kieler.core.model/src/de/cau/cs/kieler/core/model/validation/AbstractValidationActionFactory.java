/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.validation;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.core.model.util.EditorUtils;

/**
 * Abstract implementation of a factory for validate actions. Gathers all
 * information and produces a validate action for the currently active editor.
 * 
 * @author soh
 * @kieler.ignore We'd like to get rid of this.
 */
public abstract class AbstractValidationActionFactory implements
        IValidationActionFactory {

    /**
     * Construct a validate action. The currently active editor is assumed to be
     * correct at this point.
     * 
     * @param page
     *            the page
     * @return the action
     */
    public abstract Action getValidationAction(final IWorkbenchPage page);

    /**
     * Check if the active editor is supported.
     * 
     * @param editor
     *            the editor to check
     * @return true if the editor is supported
     */
    public abstract boolean supportsEditor(IEditorPart editor);

    /**
     * 
     * {@inheritDoc}
     */
    public Action getValidationActionForEditor(final IEditorPart editor) {
        if (supportsEditor(editor)) {
            return getValidationAction(editor.getSite().getPage());
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public Action getValidationActionForActiveEditor() {
        IEditorPart editor = EditorUtils.getLastActiveEditor();
        if (editor == null) {
            return null;
        }
        if (supportsEditor(editor)) {
            IWorkbenchWindow window = PlatformUI.getWorkbench()
                    .getActiveWorkbenchWindow();
            if (window != null) {
                IWorkbenchPage page = window.getActivePage();
                if (page != null) {
                    return getValidationAction(page);
                }
            }
        }
        return null;
    }
}
