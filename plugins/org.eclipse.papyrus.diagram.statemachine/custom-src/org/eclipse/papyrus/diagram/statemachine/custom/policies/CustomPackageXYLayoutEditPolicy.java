package org.eclipse.papyrus.diagram.statemachine.custom.policies;

import java.util.Iterator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.common.commands.SemanticAdapter;
import org.eclipse.papyrus.diagram.statemachine.custom.commands.CustomStateMachineResizeCommand;
import org.eclipse.papyrus.diagram.statemachine.custom.commands.CustomStateMachineSetBoundsCommand;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.StateMachineEditPart;

public class CustomPackageXYLayoutEditPolicy extends XYLayoutEditPolicy {

	/**
	 * This method analyzes a resize and/or move request and routes the call to
	 * the appropriate specific ResizeCommand either for a StateMachine, a
	 * State, in other cases passes on the call to the super class method.
	 * 
	 * @param child
	 *        the concerned EditPart
	 * @param constraint
	 *        the object embedding the constraint rectangle
	 * @param request
	 *        the ChangeBoundsRequest
	 * 
	 * @return
	 */

	@Override
	public Command createChangeConstraintCommand(ChangeBoundsRequest request, EditPart child, Object constraint) {
		// precautionary test
		if((request == null) || (child == null) || (constraint == null))
			throw new IllegalArgumentException();

		if(child instanceof StateMachineEditPart) {
			View stateMachine = (View)child.getModel();

			// retrieve the deltas of the resize request
			int dx = request.getSizeDelta().width;
			int dy = request.getSizeDelta().height;
			if((dx == 0) && (dy == 0)) {
				// nothing to do except move the state machine edit part
				// all locations of embedded figures are relative to it
				// and thus hold when their container is moved around
				return super.createChangeConstraintCommand(request, child, constraint);
			}

			// now we face a resize command

			TransactionalEditingDomain editingDomain = ((IGraphicalEditPart)getHost()).getEditingDomain();
			CompositeTransactionalCommand cc = new CompositeTransactionalCommand(editingDomain, DiagramUIMessages.AddCommand_Label);
			// a resize request, which we route to the specific ResizeCommand
			IAdaptable adaptableForStateMachine = new SemanticAdapter(null, stateMachine);

			CustomStateMachineResizeCommand resizeStateMachine = new CustomStateMachineResizeCommand(adaptableForStateMachine, ((IGraphicalEditPart)getHost()).getDiagramPreferencesHint(), editingDomain, DiagramUIMessages.CreateCommand_Label, request, (Rectangle)constraint, false);

			cc.add(resizeStateMachine);

			return new ICommandProxy(cc.reduce());
		}
		return super.createChangeConstraintCommand(request, child, constraint);
	}

	@Override
	protected EditPolicy createChildEditPolicy(EditPart child) {
		// specific resize edit policy which correct ghost figure management by
		// GMF
		if(child instanceof StateMachineEditPart) {
			ResizableEditPolicy policy = new ResizableEditPolicy() {

				public void eraseSourceFeedback(Request request) {
					if(RequestConstants.REQ_DROP.equals(request.getType()))
						eraseChangeBoundsFeedback((ChangeBoundsRequest)request);
					else
						super.eraseSourceFeedback(request);
				}
			};
			return policy;
		}
		// all others, namely state machines and states, pseudostates, etc.
		// will have the generic policy which allows resize in all directions
		return super.createChildEditPolicy(child);
	}

	@Override
	protected Command getCreateCommand(CreateRequest request) {
		CreateViewRequest req = (CreateViewRequest)request;

		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart)getHost()).getEditingDomain();

		CompositeTransactionalCommand cc = new CompositeTransactionalCommand(editingDomain, DiagramUIMessages.AddCommand_Label);
		Iterator iter = req.getViewDescriptors().iterator();

		final Rectangle BOUNDS = (Rectangle)getConstraintFor(request);

		while(iter.hasNext()) {
			CreateViewRequest.ViewDescriptor viewDescriptor = (CreateViewRequest.ViewDescriptor)iter.next();
			Rectangle rect = getBoundsOffest(req, BOUNDS, viewDescriptor);
			cc.compose(new CustomStateMachineSetBoundsCommand(editingDomain, DiagramUIMessages.SetLocationCommand_Label_Resize, viewDescriptor, rect));
		}

		if(cc.reduce() == null)
			return null;

		return chainGuideAttachmentCommands(request, new ICommandProxy(cc.reduce()));
	}
}
