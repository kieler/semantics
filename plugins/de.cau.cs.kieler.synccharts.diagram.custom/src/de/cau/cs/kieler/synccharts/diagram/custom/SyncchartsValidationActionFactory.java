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
package de.cau.cs.kieler.synccharts.diagram.custom;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.IWorkbenchPage;

import de.cau.cs.kieler.core.model.validation.IValidationActionFactory;
import de.cau.cs.kieler.synccharts.diagram.part.ValidateAction;

/**
 * @author soh
 */
public class SyncchartsValidationActionFactory implements
        IValidationActionFactory {

    /**
     * {@inheritDoc}
     */
    public Action getValidationAction(final IWorkbenchPage page) {
        return new ValidateAction(page);
    }

}
