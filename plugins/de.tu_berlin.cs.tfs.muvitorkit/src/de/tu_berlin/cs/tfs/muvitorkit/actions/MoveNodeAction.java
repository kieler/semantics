package de.tu_berlin.cs.tfs.muvitorkit.actions;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

/**
 * An action for moving selected nodes that can be moved by key strokes.
 * Depending on the ID this action has been created with appropriate commands
 * for moving all selected nodes are being created and gathered in a
 * {@link CompoundCommand}.
 * 
 * @author Tony Modica
 */
public class MoveNodeAction extends SelectionAction {

	/**
	 * The value to apply when moving a node "precisely"
	 */
	private static final int PREC_STEP = 1;

	/**
	 * The value to apply when moving a node.
	 */
	private static final int STEP = 5;

	/**
	 * ID for moving a node left by the value of {@link #STEP}.
	 */
	public static final String LEFT = "MoveNodeActionLeft";

	/**
	 * ID for moving a node right by the value of {@link #STEP}.
	 */
	public static final String RIGHT = "MoveNodeActionRight";

	/**
	 * ID for moving a node up by the value of {@link #STEP}.
	 */
	public static final String UP = "MoveNodeActionUp";

	/**
	 * ID for moving a node down by the value of {@link #STEP}.
	 */
	public static final String DOWN = "MoveNodeActionDown";

	/**
	 * ID for moving a node left by the value of {@value #PREC_STEP}.
	 */
	public static final String PREC_LEFT = "MoveNodeActionLeftPrecise";

	/**
	 * ID for moving a node right by the value of {@value #PREC_STEP}.
	 */
	public static final String PREC_RIGHT = "MoveNodeActionRightPrecise";

	/**
	 * ID for moving a node up by the value of {@value #PREC_STEP}.
	 */
	public static final String PREC_UP = "MoveNodeActionUpPrecise";

	/**
	 * ID for moving a node down by the value of {@value #PREC_STEP}.
	 */
	public static final String PREC_DOWN = "MoveNodeActionDownPrecise";

	public MoveNodeAction(final IWorkbenchPart part, final String mode) {
		super(part);
		setId(mode);
	}

	/**
	 * Gather the commands for the change bounds request from the selected edit
	 * parts in a compound command an execute it.
	 * 
	 * @see org.eclipse.jface.action.IAction#run()
	 */
	@Override
	public void run() {
		final CompoundCommand compcommand = new CompoundCommand();
		// Iterate over all selected EditParts
		for (final Object selectedObject : getSelectedObjects()) {
			// get Command for Moving this element
			if (selectedObject instanceof GraphicalEditPart) {
				final EditPart selectedEditPart = (EditPart) selectedObject;
				// move only top-level parts (not nested)
				if (selectedEditPart.getParent() != selectedEditPart
						.getViewer().getContents()) {
					continue;
				}
				final ChangeBoundsRequest request = new ChangeBoundsRequest(
						RequestConstants.REQ_MOVE);
				// set direction and length depending on this Actions's ID
				request.setMoveDelta(createMoveDelta());
				compcommand.add(selectedEditPart.getCommand(request));
			}
		}
		execute(compcommand);
	}

	/**
	 * @return A coordinate representing the delta according to the mode of the
	 *         action instance.
	 */
	private Point createMoveDelta() {
		if (getId() == MoveNodeAction.LEFT) {
			return new Point(-MoveNodeAction.STEP, 0);
		} else if (getId() == MoveNodeAction.RIGHT) {
			return new Point(MoveNodeAction.STEP, 0);
		} else if (getId() == MoveNodeAction.UP) {
			return new Point(0, -MoveNodeAction.STEP);
		} else if (getId() == MoveNodeAction.DOWN) {
			return new Point(0, MoveNodeAction.STEP);
		} else if (getId() == MoveNodeAction.PREC_LEFT) {
			return new Point(-MoveNodeAction.PREC_STEP, 0);
		} else if (getId() == MoveNodeAction.PREC_RIGHT) {
			return new Point(MoveNodeAction.PREC_STEP, 0);
		} else if (getId() == MoveNodeAction.PREC_UP) {
			return new Point(0, -MoveNodeAction.PREC_STEP);
		} else if (getId() == MoveNodeAction.PREC_DOWN) {
			return new Point(0, MoveNodeAction.PREC_STEP);
		}
		// This should not happen.
		return null;
	}

	/**
	 * Returns true if the actual selection contains at least one EditPart that
	 * understands requests of the type RequestConstants.REQ_MOVE.
	 * 
	 * @see org.eclipse.gef.ui.actions.WorkbenchPartAction#calculateEnabled()
	 */
	@Override
	protected boolean calculateEnabled() {
		final ChangeBoundsRequest testRequest = new ChangeBoundsRequest(
				RequestConstants.REQ_MOVE);
		for (final Object selectionElement : getSelectedObjects()) {
			if (selectionElement instanceof GraphicalEditPart
					&& ((GraphicalEditPart) selectionElement)
							.understandsRequest(testRequest)) {
				return true;
			}
		}
		return false;
	}
}
