package de.cau.cs.kieler.synccharts.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.cau.cs.kieler.synccharts.diagram.edit.commands.State2CreateCommand;
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
		super(SyncchartsElementTypes.Region_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SyncchartsElementTypes.State_3002 == req.getElementType()) {
			return getGEFWrapper(new State2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
