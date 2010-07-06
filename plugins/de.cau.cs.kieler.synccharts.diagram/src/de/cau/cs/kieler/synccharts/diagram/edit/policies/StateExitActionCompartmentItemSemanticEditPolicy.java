package de.cau.cs.kieler.synccharts.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.cau.cs.kieler.synccharts.diagram.edit.commands.StateExitActionCreateCommand;
import de.cau.cs.kieler.synccharts.diagram.providers.SyncchartsElementTypes;

/**
 * @generated
 */
public class StateExitActionCompartmentItemSemanticEditPolicy extends
    SyncchartsBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public StateExitActionCompartmentItemSemanticEditPolicy() {
        super(SyncchartsElementTypes.State_3024);
    }

    /**
     * @generated
     */
    protected Command getCreateCommand(CreateElementRequest req) {
        if (SyncchartsElementTypes.Action_3028 == req.getElementType()) {
            return getGEFWrapper(new StateExitActionCreateCommand(req));
        }
        return super.getCreateCommand(req);
    }

}
