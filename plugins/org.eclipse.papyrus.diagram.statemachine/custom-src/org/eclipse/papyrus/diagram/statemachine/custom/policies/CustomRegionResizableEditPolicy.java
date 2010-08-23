package org.eclipse.papyrus.diagram.statemachine.custom.policies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.handles.ResizableHandleKit;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.statemachine.custom.figures.RegionFigure;
import org.eclipse.papyrus.diagram.statemachine.custom.helpers.Zone;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.RegionEditPart;

public class CustomRegionResizableEditPolicy extends ResizableEditPolicy {

	/** The associated request. */
	private ChangeBoundsRequest request;

	/**
	 * The target figure, i.e. the figure associated to the targetNode region .
	 * Used to change of coordinates.
	 */
	private RegionFigure targetFig;

	/** Flag to indicate a change in the referent figure is needed. */
	private boolean changeReferentFigure = false;

	/**
	 * Provides a specific list of SelectionHandles.
	 * 
	 * @return a list of the Handles
	 */
	@Override
	protected List createSelectionHandles() {
		List list = new ArrayList();
		int dirs = getResizeDirections();
		// by default (case when dirs == -1 or 0)
		// no move nor resize handles are provided
		// this is to cope with the default region included in the statemachine
		// for which it would not make any sense
		if(dirs > 0) {
			// resize handles are added depending on a bit-wise test of dirs
			// in any case we do not provide oblique resize handles
			if((dirs & PositionConstants.EAST) != 0)
				ResizableHandleKit.addHandle((GraphicalEditPart)getHost(), list, PositionConstants.EAST);
			if((dirs & PositionConstants.SOUTH) != 0)
				ResizableHandleKit.addHandle((GraphicalEditPart)getHost(), list, PositionConstants.SOUTH);
			if((dirs & PositionConstants.WEST) != 0)
				ResizableHandleKit.addHandle((GraphicalEditPart)getHost(), list, PositionConstants.WEST);
			if((dirs & PositionConstants.NORTH) != 0) {
				ResizableHandleKit.addHandle((GraphicalEditPart)getHost(), list, PositionConstants.NORTH);
			}
		}
		return list;
	}

	/**
	 * This method is overridden to change the ghost figure shown when either
	 * resizing a region or moving it around. In the case of a resize we need to
	 * update the bounds of the ghost figure as the union of bounds of resized
	 * regions. This is done by a check of the neighboring regions which share
	 * the same border to be moved by the resize request. In the case of a move
	 * we need to show what will happen to the region when dropped on a given
	 * one: thus show a half-sized region located on one of the side of its
	 * parent region depending on the position of the mouse. In the course of
	 * this process we assign a corresponding drop location to the region.
	 * 
	 * @param a
	 *        rectangle which is the bounds of the ghost figure to be shown
	 */
	@Override
	protected Rectangle getInitialFeedbackBounds() {
		Dimension sizeDelta = request.getSizeDelta();

		// restore default flag value
		changeReferentFigure = false;

		// we test whether this is a move request or a resize request
		if((sizeDelta.width == 0) && (sizeDelta.height == 0)) {
			return super.getInitialFeedbackBounds();
		}
		// this is a resize request
		else {
			// retrieve the direction of resize
			int direction = request.getResizeDirection();
			// retrieve the edit part associated to the policy
			RegionEditPart regionEP = (RegionEditPart)getHost();
			// the associated region view
			View region = (View)regionEP.getModel();
			// a list to get all the nodes impacted by the resize
			List<View> nodes = new ArrayList<View>();
			// test the direction and call the appropriate method
			if(direction == PositionConstants.NORTH)
				// retrieve the list of nodes that are at the BOTTOM of NORTH
				// border
				nodes = Zone.getRegionTopBorderInsideNeighbours(region);
			else if(direction == PositionConstants.SOUTH)
				// retrieve the list of nodes that are at the TOP of SOUTH
				// border
				nodes = Zone.getRegionBottomBorderInsideNeighbours(region);
			else if(direction == PositionConstants.EAST)
				// retrieve the list of nodes that are at the LEFT of EAST
				// border
				nodes = Zone.getRegionRightBorderInsideNeighbours(region);
			else if(direction == PositionConstants.WEST)
				// retrieve the list of nodes that are at the RIGHT of WEST
				// border
				nodes = Zone.getRegionLeftBorderInsideNeighbours(region);
			// now compute the bounds of the node union
			Rectangle rect = null;
			Iterator<View> it = nodes.iterator();
			while(it.hasNext()) {
				View view = it.next();
				Rectangle currentBounds = Zone.getBounds(view);
				if(rect == null)
					rect = currentBounds;
				else
					rect = rect.union(currentBounds);
			}
			return rect;
		}
	}

	/**
	 * This method is overridden here to save the request and change the figure
	 * used to perform coordinate change.
	 * 
	 * @param request
	 *        the Request
	 */
	@Override
	protected void showChangeBoundsFeedback(ChangeBoundsRequest request) {
		this.request = (ChangeBoundsRequest)request;
		IFigure feedback = getDragSourceFeedbackFigure();

		PrecisionRectangle rect = new PrecisionRectangle(getInitialFeedbackBounds().getCopy());

		// if regions are part of different state machines or state
		if(changeReferentFigure)
			// use the target figure as referent for coordinate change
			targetFig.translateToAbsolute(rect);
		// both regions are part of the same state machine or state
		else
			// use default host figure
			getHostFigure().translateToAbsolute(rect);
		rect.translate(request.getMoveDelta());
		rect.resize(request.getSizeDelta());

		feedback.translateToRelative(rect);
		feedback.setBounds(rect);
	}

	@Override
	public void showSourceFeedback(Request request) {
		if(REQ_RESIZE.equals(request.getType()))
			showChangeBoundsFeedback((ChangeBoundsRequest)request);
	}

}
