package org.eclipse.papyrus.diagram.statemachine.custom.edit.part;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.statemachine.custom.figures.RegionFigure;
import org.eclipse.papyrus.diagram.statemachine.custom.helpers.Zone;
import org.eclipse.papyrus.diagram.statemachine.custom.policies.CustomRegionDragTracker;
import org.eclipse.papyrus.diagram.statemachine.custom.policies.CustomRegionResizableEditPolicy;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.RegionEditPart;

public class CustomRegionEditPart extends RegionEditPart {

	/** The DragTracker associated to the EditPart. */
	private DragTracker tracker = null;

	public CustomRegionEditPart(View view) {
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

	/**
	 * This method is overridden to store the DragTracker locally.
	 * 
	 * @param request
	 *        the associated Request
	 * 
	 * @return the DragTracker created by the superclass
	 */
	@Override
	public DragTracker getDragTracker(Request request) {
		tracker = new CustomRegionDragTracker(this);
		return tracker;
	}

	/**
	 * This method provides access to the RegionDragTracker if any or returns
	 * null.
	 * 
	 * @return the RegionDragTracker
	 */
	public CustomRegionDragTracker getRegionDragTracker() {
		if((tracker != null) && (tracker instanceof CustomRegionDragTracker))
			return (CustomRegionDragTracker)tracker;
		return null;
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		if(getParent() != null)
			refreshVisuals();
	}

	@Override
	protected void refreshVisuals() {
		// TODO Auto-generated method stub
		super.refreshVisuals();

		View view = (View)getModel();
		RegionFigure f = getPrimaryShape();

		// check the region zone
		String zone = Zone.getZone(view);
		// check the neighbours if any and change the corresponding flags in the
		// figure
		if(Zone.hasRightNeighbours(zone))
			f.setDisplayRightBorder(true);
		else
			f.setDisplayRightBorder(false);
		if(Zone.hasBottomNeighbours(zone))
			f.setDisplayBottomBorder(true);
		else
			f.setDisplayBottomBorder(false);

		CustomRegionResizableEditPolicy policy = (CustomRegionResizableEditPolicy)getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
		// test for allowed directions
		int dirs = Zone.getAllowedResizeDirections(zone);
		// constrain the edit policy with these directions
		if(policy != null)
			policy.setResizeDirections(dirs);

	}
}
