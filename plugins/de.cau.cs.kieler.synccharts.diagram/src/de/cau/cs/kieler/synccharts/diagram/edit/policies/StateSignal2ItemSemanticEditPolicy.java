package de.cau.cs.kieler.synccharts.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.cau.cs.kieler.synccharts.diagram.edit.commands.SignalCreateCommand;
import de.cau.cs.kieler.synccharts.diagram.providers.SyncchartsElementTypes;

/**
 * @generated
 */
public class StateSignal2ItemSemanticEditPolicy extends
		SyncchartsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StateSignal2ItemSemanticEditPolicy() {
		super(SyncchartsElementTypes.State_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SyncchartsElementTypes.Signal_3003 == req.getElementType()) {
			return getGEFWrapper(new SignalCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
