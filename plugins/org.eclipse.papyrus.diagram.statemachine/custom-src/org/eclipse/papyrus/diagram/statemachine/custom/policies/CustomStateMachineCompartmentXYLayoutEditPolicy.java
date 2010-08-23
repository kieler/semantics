package org.eclipse.papyrus.diagram.statemachine.custom.policies;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.common.commands.SemanticAdapter;
import org.eclipse.papyrus.diagram.statemachine.custom.commands.CustomRegionResizeCommand;
import org.eclipse.papyrus.diagram.statemachine.custom.helpers.Zone;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.RegionEditPart;

public class CustomStateMachineCompartmentXYLayoutEditPolicy extends XYLayoutEditPolicy {

	/**
	 * This method analyzes a resize and/or move request and routes the call to
	 * the appropriate specific ResizeCommand either for a Region, in other
	 * cases passes on the call to the super class method.
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
	protected Command createChangeConstraintCommand(ChangeBoundsRequest request, EditPart child, Object constraint) {
		// precautionary test
		if((request == null) || (child == null) || (constraint == null))
			throw new IllegalArgumentException();

		if(child instanceof RegionEditPart) {
			View region = (View)child.getModel();

			// retrieve the deltas of the resize request
			int dx = request.getSizeDelta().width;
			int dy = request.getSizeDelta().height;
			if((dx == 0) && (dy == 0)) {
				return UnexecutableCommand.INSTANCE;
			}

			// now we face a resize command involving potentially multiple
			// regions

			TransactionalEditingDomain editingDomain = ((IGraphicalEditPart)getHost()).getEditingDomain();
			CompositeTransactionalCommand cc = new CompositeTransactionalCommand(editingDomain, DiagramUIMessages.AddCommand_Label);
			// a resize request, which we route to the specific ResizeCommand
			IAdaptable adaptableForRegion = new SemanticAdapter(null, region);

			CustomRegionResizeCommand resizeRegion = new CustomRegionResizeCommand(adaptableForRegion, ((IGraphicalEditPart)getHost()).getDiagramPreferencesHint(), editingDomain, DiagramUIMessages.CreateCommand_Label, request, (Rectangle)constraint);

			cc.add(resizeRegion);

			return new ICommandProxy(cc.reduce());
		}
		return super.createChangeConstraintCommand(request, child, constraint);
	}

	@Override
	protected EditPolicy createChildEditPolicy(EditPart child) {
		// specific resize edit policy for regions
		// we want to avoid resize in oblique directions such as NORTH_EAST
		// and restrict resize to inner expansion
		// which do not cause a resize of the embedding statemachine
		if(child instanceof RegionEditPart) {
			CustomRegionResizableEditPolicy policy = new CustomRegionResizableEditPolicy();
			// retrieve the region view
			View region = (View)child.getModel();
			// its zone property
			String zone = Zone.getZone(region);
			// test for allowed directions
			int dirs = Zone.getAllowedResizeDirections(zone);
			// constrain the edit policy with these directions
			policy.setResizeDirections(dirs);
			return policy;
		}
		// all others, namely state machines and states, pseudostates, etc.
		// will have the generic policy which allows resize in all directions
		return super.createChildEditPolicy(child);
	}
}
