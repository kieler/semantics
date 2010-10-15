package de.cau.cs.kieler.synccharts.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.cau.cs.kieler.synccharts.diagram.edit.commands.RegionStateCreateCommand;
import de.cau.cs.kieler.synccharts.diagram.edit.commands.TextualCodeCreateCommand;
import de.cau.cs.kieler.synccharts.diagram.providers.SyncchartsElementTypes;

/**
 * @generated
 */
public class RegionStateCompartmentItemSemanticEditPolicy extends
    SyncchartsBaseItemSemanticEditPolicy {

    /**
     * @generated
     */
    public RegionStateCompartmentItemSemanticEditPolicy() {
        super(SyncchartsElementTypes.Region_3039);
    }

    /**
     * @generated
     */
    protected Command getCreateCommand(CreateElementRequest req) {
        if (SyncchartsElementTypes.State_3040 == req.getElementType()) {
            return getGEFWrapper(new RegionStateCreateCommand(req));
        }
        if (SyncchartsElementTypes.TextualCode_3046 == req.getElementType()) {
            return getGEFWrapper(new TextualCodeCreateCommand(req));
        }
        return super.getCreateCommand(req);
    }

}
