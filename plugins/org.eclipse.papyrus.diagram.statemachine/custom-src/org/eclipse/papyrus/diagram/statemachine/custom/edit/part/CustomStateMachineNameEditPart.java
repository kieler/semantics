package org.eclipse.papyrus.diagram.statemachine.custom.edit.part;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.common.commands.SemanticAdapter;
import org.eclipse.papyrus.diagram.statemachine.custom.commands.CustomStateMachineResizeCommand;
import org.eclipse.papyrus.diagram.statemachine.custom.helpers.Zone;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateMachineNameEditPart;

public class CustomStateMachineNameEditPart extends StateMachineNameEditPart {

	public CustomStateMachineNameEditPart(View view) {
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

	@Override
	protected void handleNotificationEvent(Notification notification) {
		// TODO Auto-generated method stub
		super.handleNotificationEvent(notification);

		WrappingLabel stateMachineLabel = (WrappingLabel)getFigure();
		Dimension stateMachineLabelBounds = stateMachineLabel.getPreferredSize();
		View stateMachineLabelView = (View)getModel();
		View stateMachineView = (View)stateMachineLabelView.eContainer();
		View stateMachineCompartView = (View)stateMachineView.getChildren().get(1);

		int stateMachineHeight = Zone.getHeight(stateMachineView);
		int stateMachineWidth = Zone.getWidth(stateMachineView);

		int stateMachineCompartHeight = Zone.getHeight(stateMachineCompartView);

		// Zone.setHeight(stateMachineLabelView,
		// stateMachineLabelBounds.height);
		int dx = stateMachineLabelBounds.width - stateMachineWidth;
		int dy = stateMachineCompartHeight + stateMachineLabelBounds.height - stateMachineHeight;
		int x = Zone.getX(stateMachineView);
		int y = Zone.getY(stateMachineView);

		if((stateMachineHeight != -1) && (stateMachineLabelBounds.width != 0) && (dy != 0)) {
			dx = (dx > 0) ? dx : 0;
			// a resize request, which we route to the specific ResizeCommand
			IAdaptable adaptableForStateMachine = new SemanticAdapter(null, stateMachineView);
			ChangeBoundsRequest internalResizeRequest = new ChangeBoundsRequest();
			internalResizeRequest.setResizeDirection(PositionConstants.EAST);
			internalResizeRequest.setSizeDelta(new Dimension(dx, dy));
			Rectangle rect = new Rectangle(x, y, stateMachineWidth + dx, stateMachineHeight + dy);

			CustomStateMachineResizeCommand internalResizeCommand = new CustomStateMachineResizeCommand(adaptableForStateMachine, getDiagramPreferencesHint(), getEditingDomain(), DiagramUIMessages.CreateCommand_Label, internalResizeRequest, rect, true);
			internalResizeCommand.setOptions(Collections.singletonMap(Transaction.OPTION_UNPROTECTED, Boolean.TRUE));
			try {
				internalResizeCommand.execute(null, null);
			} catch (ExecutionException e) {
			}

		}
		refreshVisuals();
	}

	@Override
	protected void refreshVisuals() {
		// TODO Auto-generated method stub
		super.refreshVisuals();
	}
}
