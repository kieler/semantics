package de.cau.cs.kieler.synccharts.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.cau.cs.kieler.synccharts.diagram.edit.commands.StateRegionCreateCommand;
import de.cau.cs.kieler.synccharts.diagram.edit.commands.TextualCodeCreateCommand;
import de.cau.cs.kieler.synccharts.diagram.providers.SyncchartsElementTypes;

/**
 * @generated
 */
public class StateRegionCompartmentItemSemanticEditPolicy extends
    SyncchartsBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public StateRegionCompartmentItemSemanticEditPolicy() {
        super(SyncchartsElementTypes.State_3040);
    }

    /**
     * @generated
     */
    protected Command getCreateCommand(CreateElementRequest req) {
        if (SyncchartsElementTypes.TextualCode_3046 == req.getElementType()) {
            return getGEFWrapper(new TextualCodeCreateCommand(req));
        }
        if (SyncchartsElementTypes.Region_3039 == req.getElementType()) {
            return getGEFWrapper(new StateRegionCreateCommand(req));
        }
        return super.getCreateCommand(req);
    }

}
