package de.cau.cs.kieler.synccharts.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.cau.cs.kieler.synccharts.diagram.edit.commands.StateSuspensionTriggerCreateCommand;
import de.cau.cs.kieler.synccharts.diagram.providers.SyncchartsElementTypes;

/**
 * @generated
 */
public class StateSuspensionTriggerCompartment2ItemSemanticEditPolicy extends
    SyncchartsBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public StateSuspensionTriggerCompartment2ItemSemanticEditPolicy() {
        super(SyncchartsElementTypes.State_3040);
    }

    /**
     * @generated
     */
    protected Command getCreateCommand(CreateElementRequest req) {
        if (SyncchartsElementTypes.Action_3045 == req.getElementType()) {
            return getGEFWrapper(new StateSuspensionTriggerCreateCommand(req));
        }
        return super.getCreateCommand(req);
    }

}
