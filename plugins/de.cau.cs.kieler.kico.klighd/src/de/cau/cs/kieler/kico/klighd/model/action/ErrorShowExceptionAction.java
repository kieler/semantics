/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.model.action;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;

import de.cau.cs.kieler.kico.klighd.model.KiCoErrorModel;
import de.cau.cs.kieler.klighd.IAction;

/**
 * Action to open a ErrorDialog to show additional exception information of KiCoErrorModel.
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
public class ErrorShowExceptionAction implements IAction {

    public final static String ID =
            "de.cau.cs.kieler.kico.klighd.model.action.ErrorShowExceptionAction";

    /**
     * {@inheritDoc}
     */
    public ActionResult execute(ActionContext context) {
        Object inputModel = context.getViewContext().getInputModel();
        // get error model
        if (inputModel instanceof KiCoErrorModel) {
            KiCoErrorModel errorModel = (KiCoErrorModel) inputModel;
            // if exception present show in error dialog
            if (errorModel.getStackTrace() != null) {
                final Status status =
                        new Status(IStatus.INFO, ID, errorModel.getReason(),
                                new Exception(errorModel.getStackTrace()));
                ErrorDialog errorDialog =
                        new ErrorDialog(context.getViewContext().getDiagramWorkbenchPart()
                                .getSite().getShell(), errorModel.getMessage(),
                                errorModel.getMessage(), status, IStatus.INFO);
                errorDialog.setBlockOnOpen(false);
                errorDialog.create();
                errorDialog.open();
            }
        }
        return ActionResult.createResult(false);

    }

}
