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
package de.cau.cs.kieler.core.model.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.cau.cs.kieler.core.model.validation.ValidationManager;

/**
 * Handler for triggering the validate action in the checkfile manager.
 * 
 * @author soh
 * @kieler.ignore We'd like to get rid of this.
 */
public class ValidateActionHandler extends AbstractHandler {

    /**
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        if (ValidationManager.hasValidateActionsForActiveEditor()) {
            ValidationManager.validateActiveEditor();
        }
        return null;
    }
}
