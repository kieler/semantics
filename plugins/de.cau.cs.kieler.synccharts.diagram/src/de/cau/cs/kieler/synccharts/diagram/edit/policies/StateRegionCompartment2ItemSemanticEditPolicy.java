package de.cau.cs.kieler.synccharts.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.cau.cs.kieler.synccharts.diagram.edit.commands.RegionCreateCommand;
import de.cau.cs.kieler.synccharts.diagram.providers.SyncchartsElementTypes;

/**
 * @generated
 */
public class StateRegionCompartment2ItemSemanticEditPolicy extends
		SyncchartsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StateRegionCompartment2ItemSemanticEditPolicy() {
		super(SyncchartsElementTypes.State_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SyncchartsElementTypes.Region_3001 == req.getElementType()) {
			return getGEFWrapper(new RegionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
