package de.cau.cs.kieler.synccharts.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.cau.cs.kieler.synccharts.diagram.edit.commands.StateSuspensionTriggerCreateCommand;
import de.cau.cs.kieler.synccharts.diagram.providers.SyncchartsElementTypes;

/**
 * @generated
 */
public class StateSuspensionTriggerCompartmentItemSemanticEditPolicy extends
    SyncchartsBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public StateSuspensionTriggerCompartmentItemSemanticEditPolicy() {
        super(SyncchartsElementTypes.State_2005);
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
