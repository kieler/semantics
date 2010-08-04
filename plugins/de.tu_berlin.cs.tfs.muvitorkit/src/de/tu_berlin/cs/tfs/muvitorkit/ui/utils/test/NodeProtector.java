package de.tu_berlin.cs.tfs.muvitorkit.ui.utils.test;

import de.tu_berlin.cs.tfs.muvitorkit.gef.editparts.AdapterGraphicalEditPart;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.EditPartViewer.Conditional;
import org.eclipse.gef.requests.ChangeBoundsRequest;

/**
 * the class is used for the node protection, that means that no node can have a
 * position at another node
 */
public class NodeProtector {

	private NodeProtector() {
	}

	public static void proof(final AdapterGraphicalEditPart<?> nodeEditPart,
			final Point newLocation) {
		final IFigure nodeFigure = nodeEditPart.getFigure();
		final ChangeBoundsRequest request = new ChangeBoundsRequest(
				RequestConstants.REQ_MOVE);
		final EditPartViewer viewer = nodeEditPart.getViewer();
		final Conditional conditional = new EditPartViewer.Conditional() {
			public boolean evaluate(final EditPart editpart) {
				return editpart != nodeEditPart
						&& editpart.understandsRequest(request);
			}
		};

		final Point neededDelta = Point.SINGLETON.setLocation(0, 0);

		final Rectangle tempBounds = nodeFigure.getBounds().translate(
				newLocation);

		// top right (move down)
		final GraphicalEditPart conflictingPart = (GraphicalEditPart) viewer
				.findObjectAtExcluding(tempBounds.getTopRight(), null,
						conditional);
		if (conflictingPart != viewer.getContents()) {
			final Rectangle conflictingFigureBounds = conflictingPart
					.getFigure().getBounds();
			neededDelta.translate(0, conflictingFigureBounds.getBottomLeft().y
					- tempBounds.getTopRight().y);
			tempBounds.translate(neededDelta);
		}

		// bottom right (move left)

		// bottom left (move up)

		// top left (move right)

	}
}
