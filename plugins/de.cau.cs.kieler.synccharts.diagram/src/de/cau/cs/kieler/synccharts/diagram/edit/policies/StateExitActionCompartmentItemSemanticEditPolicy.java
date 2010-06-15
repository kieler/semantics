package de.cau.cs.kieler.synccharts.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.cau.cs.kieler.synccharts.diagram.edit.commands.ExitActionCreateCommand;
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
        super(SyncchartsElementTypes.State_2002);
    }

    /**
     * @generated
     */
    protected Command getCreateCommand(CreateElementRequest req) {
        if (SyncchartsElementTypes.Action_3016 == req.getElementType()) {
            return getGEFWrapper(new ExitActionCreateCommand(req));
        }
        return super.getCreateCommand(req);
    }

}
