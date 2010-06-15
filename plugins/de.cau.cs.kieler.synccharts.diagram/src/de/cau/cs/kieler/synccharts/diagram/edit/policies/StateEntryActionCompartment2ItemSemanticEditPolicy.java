package de.cau.cs.kieler.synccharts.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.cau.cs.kieler.synccharts.diagram.edit.commands.EntryActionCreateCommand;
import de.cau.cs.kieler.synccharts.diagram.providers.SyncchartsElementTypes;

/**
 * @generated
 */
public class StateEntryActionCompartment2ItemSemanticEditPolicy extends
        SyncchartsBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public StateEntryActionCompartment2ItemSemanticEditPolicy() {
        super(SyncchartsElementTypes.State_3010);
    }

    /**
     * @generated
     */
    protected Command getCreateCommand(CreateElementRequest req) {
        if (SyncchartsElementTypes.Action_3012 == req.getElementType()) {
            return getGEFWrapper(new EntryActionCreateCommand(req));
        }
        return super.getCreateCommand(req);
    }

}
