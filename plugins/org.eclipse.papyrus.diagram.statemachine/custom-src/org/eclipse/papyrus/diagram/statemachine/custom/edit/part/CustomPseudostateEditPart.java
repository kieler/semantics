package org.eclipse.papyrus.diagram.statemachine.custom.edit.part;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.statemachine.custom.figures.PseudostateChoiceFigure;
import org.eclipse.papyrus.diagram.statemachine.custom.figures.PseudostateDeepHistoryFigure;
import org.eclipse.papyrus.diagram.statemachine.custom.figures.PseudostateEntryPointFigure;
import org.eclipse.papyrus.diagram.statemachine.custom.figures.PseudostateExitPointFigure;
import org.eclipse.papyrus.diagram.statemachine.custom.figures.PseudostateForkFigure;
import org.eclipse.papyrus.diagram.statemachine.custom.figures.PseudostateInitialFigure;
import org.eclipse.papyrus.diagram.statemachine.custom.figures.PseudostateJoinFigure;
import org.eclipse.papyrus.diagram.statemachine.custom.figures.PseudostateJunctionFigure;
import org.eclipse.papyrus.diagram.statemachine.custom.figures.PseudostateShallowHistoryFigure;
import org.eclipse.papyrus.diagram.statemachine.custom.figures.PseudostateTerminateFigure;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.PseudostateEditPart;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.UMLFactory;

public class CustomPseudostateEditPart extends PseudostateEditPart {

	public CustomPseudostateEditPart(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
		// TODO Auto-generated method stub
		super.createDefaultEditPolicies();
		removeEditPolicy(EditPolicyRoles.CONNECTION_HANDLES_ROLE);
		removeEditPolicy(EditPolicyRoles.POPUPBAR_ROLE);

	}

	/**
	 * Used with the custom palette. The figure depends of the value of the
	 * PseudoStateKind property
	 */
	protected IFigure createNodeShape() {
		PseudostateKind pseudoStateKind = ((Pseudostate)((View)this.getModel()).getElement()).getKind();
		switch(pseudoStateKind) {
		case SHALLOW_HISTORY_LITERAL:
			return primaryShape = new PseudostateShallowHistoryFigure();
		case INITIAL_LITERAL:
			return primaryShape = new PseudostateInitialFigure();
		case DEEP_HISTORY_LITERAL:
			return primaryShape = new PseudostateDeepHistoryFigure();
		case FORK_LITERAL:
			return primaryShape = new PseudostateForkFigure();
		case JOIN_LITERAL:
			return primaryShape = new PseudostateJoinFigure();
		case JUNCTION_LITERAL:
			return primaryShape = new PseudostateJunctionFigure();
		case CHOICE_LITERAL:
			return primaryShape = new PseudostateChoiceFigure();
		case ENTRY_POINT_LITERAL:
			return primaryShape = new PseudostateEntryPointFigure();
		case EXIT_POINT_LITERAL:
			return primaryShape = new PseudostateExitPointFigure();
		case TERMINATE_LITERAL:
			return primaryShape = new PseudostateTerminateFigure();
		}

		return null;

	}

	/**
	 * Used to delete the default figure of the PseudoState and to create a new
	 * figure corresponding to the value of the PseudoStateKind property
	 * 
	 */
	protected void handleNotificationEvent(Notification evt) {
		super.handleNotificationEvent(evt);
		if(UMLFactory.eINSTANCE.getUMLPackage().getPseudostate_Kind().equals(evt.getFeature())) {
			super.handleMajorSemanticChange();
		}
	}

}
