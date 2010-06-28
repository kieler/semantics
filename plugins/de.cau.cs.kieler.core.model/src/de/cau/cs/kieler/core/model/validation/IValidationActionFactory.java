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
import org.eclipse.ui.IWorkbenchPage;

/**
 * Factory for creating the validate actions used in the validation.
 * 
 * @author soh
 * @kieler.rating 2010-06-11 proposed yellow soh
 */
public interface IValidationActionFactory {

    /**
     * Get the validate action for the given ePackage.
     * 
     * @param page the workbench page
     * @return the action
     */
    Action getValidationAction(IWorkbenchPage page);

}
