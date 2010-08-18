package de.cau.cs.kieler.uml2.sim.maude.validation;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.IWorkbenchPage;

import de.cau.cs.kieler.core.model.validation.IValidationActionFactory;
import org.eclipse.papyrus.diagram.statemachine.part.ValidateAction;

public class ValidationActionFactory implements IValidationActionFactory {

    public ValidationActionFactory() {
    }

    public Action getValidationAction(IWorkbenchPage page) {
        return new ValidateAction(page);
    }

}
