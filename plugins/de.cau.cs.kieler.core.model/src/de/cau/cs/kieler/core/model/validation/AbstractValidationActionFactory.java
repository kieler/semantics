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
package de.cau.cs.kieler.core.model.validation;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.core.ui.util.EditorUtils;

/**
 * Abstract implementation of a factory for validate actions. Gathers all
 * information and produces a validate action for the currently active editor.
 * 
 * @author soh
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
     * Getter for the ePackage that this validate action applies to.
     * 
     * @return the package.
     */
    public abstract boolean supportsActiveEditor(IEditorPart editor);

    /**
     * {@inheritDoc}
     */
    public Action getValidationActionForActiveEditor() {
        if (supportsActiveEditor(EditorUtils.getLastActiveEditor())) {
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
