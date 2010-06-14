package de.cau.cs.kieler.synccharts.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.cau.cs.kieler.synccharts.diagram.edit.commands.SuspensionTriggerCreateCommand;
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
		super(SyncchartsElementTypes.State_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SyncchartsElementTypes.Action_3018 == req.getElementType()) {
			return getGEFWrapper(new SuspensionTriggerCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
