package de.cau.cs.kieler.synccharts.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.cau.cs.kieler.synccharts.diagram.edit.commands.InnerActionCreateCommand;
import de.cau.cs.kieler.synccharts.diagram.providers.SyncchartsElementTypes;

/**
 * @generated
 */
public class StateInnerActionCompartmentItemSemanticEditPolicy extends
        SyncchartsBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public StateInnerActionCompartmentItemSemanticEditPolicy() {
        super(SyncchartsElementTypes.State_2002);
    }

    /**
     * @generated
     */
    protected Command getCreateCommand(CreateElementRequest req) {
        if (SyncchartsElementTypes.Action_3014 == req.getElementType()) {
            return getGEFWrapper(new InnerActionCreateCommand(req));
        }
        return super.getCreateCommand(req);
    }

}
