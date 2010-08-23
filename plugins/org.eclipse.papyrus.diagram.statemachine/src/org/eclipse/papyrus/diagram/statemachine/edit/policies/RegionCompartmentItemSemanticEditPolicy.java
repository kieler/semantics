package org.eclipse.papyrus.diagram.statemachine.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.papyrus.diagram.statemachine.edit.commands.FinalStateCreateCommand;
import org.eclipse.papyrus.diagram.statemachine.edit.commands.PseudostateCreateCommand;
import org.eclipse.papyrus.diagram.statemachine.edit.commands.StateCreateCommand;
import org.eclipse.papyrus.diagram.statemachine.providers.UMLElementTypes;

/**
 * @generated
 */
public class RegionCompartmentItemSemanticEditPolicy extends
		UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RegionCompartmentItemSemanticEditPolicy() {
		super(UMLElementTypes.Region_3000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.Pseudostate_4000 == req.getElementType()) {
			return getGEFWrapper(new PseudostateCreateCommand(req));
		}
		if (UMLElementTypes.FinalState_5000 == req.getElementType()) {
			return getGEFWrapper(new FinalStateCreateCommand(req));
		}
		if (UMLElementTypes.State_6000 == req.getElementType()) {
			return getGEFWrapper(new StateCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
