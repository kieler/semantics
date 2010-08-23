package org.eclipse.papyrus.diagram.statemachine.edit.policies;

import java.util.ArrayList;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.papyrus.diagram.common.command.wrappers.EMFtoGEFCommandWrapper;
import org.eclipse.papyrus.diagram.statemachine.providers.UMLElementTypes;

/**
 * @generated
 */
public class TransitionItemSemanticEditPolicy extends
		UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TransitionItemSemanticEditPolicy() {
		super(UMLElementTypes.Transition_7000);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		ArrayList todestroy = new ArrayList();
		todestroy.add(req.getElementToDestroy());
		return new EMFtoGEFCommandWrapper(new DeleteCommand(getEditingDomain(),
				todestroy));
		//return getGEFWrapper(new org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand(req));
	}

}
