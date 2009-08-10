package de.cau.cs.kieler.synccharts.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.cau.cs.kieler.synccharts.diagram.edit.commands.ActionCreateCommand;
import de.cau.cs.kieler.synccharts.diagram.providers.SyncchartsElementTypes;

/**
 * @generated
 */
public class StateOnEntryActionItemSemanticEditPolicy extends
		SyncchartsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StateOnEntryActionItemSemanticEditPolicy() {
		super(SyncchartsElementTypes.State_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SyncchartsElementTypes.Action_3004 == req.getElementType()) {
			return getGEFWrapper(new ActionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
