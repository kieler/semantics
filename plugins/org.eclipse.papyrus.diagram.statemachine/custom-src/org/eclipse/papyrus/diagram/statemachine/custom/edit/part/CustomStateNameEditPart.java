package org.eclipse.papyrus.diagram.statemachine.custom.edit.part;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.statemachine.custom.figures.StateFigure;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateNameEditPart;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;

public class CustomStateNameEditPart extends StateNameEditPart {

	public CustomStateNameEditPart(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void createDefaultEditPolicies() {
		// TODO Auto-generated method stub
		super.createDefaultEditPolicies();
		removeEditPolicy(EditPolicyRoles.CONNECTION_HANDLES_ROLE);
		removeEditPolicy(EditPolicyRoles.POPUPBAR_ROLE);

	}

	private String behaviorKindAsString(Behavior b) {
		if(b instanceof Activity)
			return "Activity";
		if(b instanceof StateMachine)
			return "StateMachine";
		if(b instanceof OpaqueBehavior)
			return "OpaqueBehavior";
		return "";
	}

	public String getInformationFromState(State state) {
		String textToEdit = "";

		// entryActivity
		if(state.getEntry() != null) {
			String kind = behaviorKindAsString(state.getEntry());
			textToEdit = "/entry " + kind + " " + state.getEntry().getName();
		}

		// doActivity
		if(state.getDoActivity() != null) {
			String kind = behaviorKindAsString(state.getDoActivity());
			textToEdit = textToEdit + "\n/do " + kind + " " + state.getDoActivity().getName();
		}

		// exitActivity
		if(state.getExit() != null) {
			String kind = behaviorKindAsString(state.getExit());
			textToEdit = textToEdit + "\n/exit " + kind + " " + state.getExit().getName();
		}

		textToEdit += "\n";
		return textToEdit;
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		// TODO Auto-generated method stub
		super.handleNotificationEvent(notification);

		
		refreshVisuals();
	}

	@Override
	protected void refreshVisuals() {
		// TODO Auto-generated method stub
		super.refreshVisuals();

		StateFigure stateFigure = ((StateEditPart)getParent()).getPrimaryShape();
		State state = (State)((View)getModel()).getElement();

		stateFigure.fillInformation(getInformationFromState(state));
	}
}
