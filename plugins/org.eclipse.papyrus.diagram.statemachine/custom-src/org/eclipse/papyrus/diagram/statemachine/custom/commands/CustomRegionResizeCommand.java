package org.eclipse.papyrus.diagram.statemachine.custom.commands;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.statemachine.custom.helpers.Zone;

public class CustomRegionResizeCommand extends AbstractTransactionalCommand {

	CreateViewRequest.ViewDescriptor viewDescriptor;

	IAdaptable adaptable;

	PreferencesHint prefHints;

	/**
	 * The request to perform.
	 */
	private ChangeBoundsRequest request = null;

	/**
	 * The bounds rectangle.
	 */
	private Rectangle bounds = null;

	public CustomRegionResizeCommand(IAdaptable adaptable, PreferencesHint prefHints, TransactionalEditingDomain domain, String label, ChangeBoundsRequest request, Rectangle bounds) {
		super(domain, label, null);

		this.adaptable = adaptable;
		this.prefHints = prefHints;

		this.request = request;
		this.bounds = bounds;

		viewDescriptor = new ViewDescriptor(adaptable, prefHints);

		// make sure the return object is available even before
		// executing/undoing/redoing
		setResult(CommandResult.newOKCommandResult(viewDescriptor));

	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {

		View region = (View)adaptable.getAdapter(View.class);
		// a bunch of initializations
		int direction = request.getResizeDirection();
		int dx = request.getSizeDelta().width;
		int dy = request.getSizeDelta().height;

		// depending on the direction of resize there are different
		// scaling/translation to be
		// performed
		// on the nodes sitting on either side of the border which is to be
		// moved
		// the various cases follow the same structure
		// first: retrieve a list of node on a given side of the border
		// second: perform various setting of bounds
		switch(direction) {
		case PositionConstants.WEST:
			// a resize that moves a LEFT border

			// retrieve the nodes on the LEFT side of LEFT border
			List<View> todo = Zone.getRegionLeftBorderOutsideNeighbours(region);
			Iterator<View> it = todo.iterator();
			while(it.hasNext()) {
				View view = it.next();
				// for each of these we add (-dx) to their width
				int width = Zone.getWidth(view);
				width -= dx;
				Zone.setWidth(view, width);
			}
			// retrieve the nodes on the RIGHT side of LEFT border
			todo = Zone.getRegionLeftBorderInsideNeighbours(region);
			it = todo.iterator();
			while(it.hasNext()) {
				View view = it.next();
				// for each of these we add dx to their width and translate
				// their x of (-dx)
				int width = Zone.getWidth(view);
				width += dx;
				Zone.setWidth(view, width);
				int x = Zone.getX(view);
				x -= dx;
				Zone.setX(view, x);
			}
			break;
		case PositionConstants.EAST:
			// a resize that moves a RIGHT border

			// retrieve the nodes on the LEFT side of RIGHT border
			todo = Zone.getRegionRightBorderInsideNeighbours(region);
			it = todo.iterator();
			while(it.hasNext()) {
				View view = it.next();
				// for each of these we add dx to their width
				int width = Zone.getWidth(view);
				width += dx;
				Zone.setWidth(view, width);
			}
			// retrieve the nodes on the RIGHT side of RIGHT border
			todo = Zone.getRegionRightBorderOutsideNeighbours(region);
			it = todo.iterator();
			while(it.hasNext()) {
				View view = it.next();
				// for each of these we add (-dx) to their width and translate
				// their x of dx
				int width = Zone.getWidth(view);
				width -= dx;
				Zone.setWidth(view, width);
				int x = Zone.getX(view);
				x += dx;
				Zone.setX(view, x);
			}
			break;
		case PositionConstants.NORTH:
			// a resize that moves a TOP border

			// retrieve the nodes on the BOTTOM side of TOP border
			todo = Zone.getRegionTopBorderInsideNeighbours(region);
			it = todo.iterator();
			while(it.hasNext()) {
				View view = it.next();
				// for each of these we add dy to their height and (-dy) to
				// their y
				int height = Zone.getHeight(view);
				height += dy;
				Zone.setHeight(view, height);
				int y = Zone.getY(view);
				y -= dy;
				Zone.setY(view, y);
			}
			// retrieve the nodes on the TOP side of TOP border
			todo = Zone.getRegionTopBorderOutsideNeighbours(region);
			it = todo.iterator();
			while(it.hasNext()) {
				View view = it.next();
				// for each of these we add (-dy) to their height
				int height = Zone.getHeight(view);
				height -= dy;
				Zone.setHeight(view, height);
			}
			break;
		case PositionConstants.SOUTH:
			// a resize that moves a BOTTOM border

			// retrieve the nodes on the TOP side of BOTTOM border
			todo = Zone.getRegionBottomBorderInsideNeighbours(region);
			it = todo.iterator();
			while(it.hasNext()) {
				View view = it.next();
				// for each of these we add dy to their height
				int height = Zone.getHeight(view);
				height += dy;
				Zone.setHeight(view, height);
			}
			// retrieve the nodes on the BOTTOM side of BOTTOM border
			todo = Zone.getRegionBottomBorderOutsideNeighbours(region);
			it = todo.iterator();
			while(it.hasNext()) {
				View view = it.next();
				// for each of these we add (-dy) to their height and dy to
				// their y
				int height = Zone.getHeight(view);
				height -= dy;
				Zone.setHeight(view, height);
				int y = Zone.getY(view);
				y += dy;
				Zone.setY(view, y);
			}
			break;
		}// switch
		return CommandResult.newOKCommandResult();
	}

	public void reverseRequest() {
		request.getMoveDelta().negate();
	}
}
