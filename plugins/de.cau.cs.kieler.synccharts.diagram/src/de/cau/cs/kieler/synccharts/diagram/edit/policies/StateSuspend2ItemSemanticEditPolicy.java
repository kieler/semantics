package de.cau.cs.kieler.synccharts.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.cau.cs.kieler.synccharts.diagram.edit.commands.Action4CreateCommand;
import de.cau.cs.kieler.synccharts.diagram.providers.SyncchartsElementTypes;

/**
 * @generated
 */
public class StateSuspend2ItemSemanticEditPolicy extends SyncchartsBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public StateSuspend2ItemSemanticEditPolicy() {
        super(SyncchartsElementTypes.State_3002);
    }

    /**
     * @generated
     */
    protected Command getCreateCommand(CreateElementRequest req) {
        if (SyncchartsElementTypes.Action_3008 == req.getElementType()) {
            return getGEFWrapper(new Action4CreateCommand(req));
        }
        return super.getCreateCommand(req);
    }

}
