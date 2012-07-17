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

/**
 * Factory for creating the validate actions used in the validation.
 * 
 * @author soh
 */
public interface IValidationActionFactory {

    /**
     * Get the validate action for the active editor. Should return null if the
     * editor is not supported.
     * 
     * @param editor
     *            the editor
     * @return the action or null
     */
    Action getValidationActionForEditor(IEditorPart editor);

    /**
     * Get the validate action for the active editor. Should return null if the
     * active editor is not supported.
     * 
     * @return the action or null
     */
    Action getValidationActionForActiveEditor();

}
