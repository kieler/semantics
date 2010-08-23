package org.eclipse.papyrus.diagram.statemachine.custom.policies;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.tools.DragEditPartsTrackerEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.common.commands.SemanticAdapter;
import org.eclipse.papyrus.diagram.statemachine.custom.commands.CustomRegionResizeCommand;
import org.eclipse.papyrus.diagram.statemachine.custom.figures.RegionFigure;
import org.eclipse.papyrus.diagram.statemachine.custom.helpers.Zone;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.RegionCompartmentEditPart;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.RegionEditPart;

/**
 * A specific drag tracker for regions. It locally stores the potential target
 * edit part during a drag and drop.
 * 
 * @author David Servat
 */
public class CustomRegionDragTracker extends DragEditPartsTrackerEx {

	/** The RegionEditPart. */
	protected RegionEditPart regionEP = null;

	CustomRegionResizeCommand internalResizeCommand = null;

	Rectangle regionFigureBounds;

	public CustomRegionDragTracker(RegionEditPart regionEditPart) {
		super(regionEditPart);
		this.regionEP = regionEditPart;
	}

	public Rectangle getRegionFigureBounds() {
		return regionFigureBounds.getCopy();
	}

	/**
	 * This method returns the target RegionEditPart if any, or returns null.
	 * 
	 * @return the target RegionEditPart
	 */
	public RegionEditPart getTargetRegionEditPart() {
		EditPart ep = getTargetEditPart();
		if((ep != null) && (ep instanceof RegionCompartmentEditPart) && ep.getParent().getParent().equals(regionEP.getParent())) {
			return (RegionEditPart)ep.getParent();
		}
		return null;
	}

	@Override
	protected boolean handleButtonUp(int button) {
		try {
			if(internalResizeCommand != null)
				internalResizeCommand.undo(null, null);
		} catch (ExecutionException e) {
		}

		return super.handleButtonUp(button);
	}

	@Override
	protected boolean handleDragStarted() {
		// TODO Auto-generated method stub
		boolean b = super.handleDragStarted();

		CustomRegionResizableEditPolicy policy = (CustomRegionResizableEditPolicy)regionEP.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);

		regionEP.setSelected(EditPart.SELECTED_NONE);

		View regionView = (View)regionEP.getModel();
		IAdaptable adaptableForRegion = new SemanticAdapter(null, regionView);

		ChangeBoundsRequest internalResizeRequest = new ChangeBoundsRequest();
		int regionWidth = Zone.getWidth(regionView);
		int regionHeight = Zone.getHeight(regionView);

		RegionFigure regionFigure = regionEP.getPrimaryShape();
		regionFigureBounds = regionFigure.getBounds().getCopy();
		// transform the coordinates to absolute
		regionFigure.translateToAbsolute(regionFigureBounds);

		String zone = Zone.getZone(regionView);
		if(Zone.isRight(zone)) {
			internalResizeRequest.setResizeDirection(PositionConstants.WEST);
			internalResizeRequest.setSizeDelta(new Dimension(-regionWidth, 0));
		} else if(Zone.isLeft(zone)) {
			internalResizeRequest.setResizeDirection(PositionConstants.EAST);
			internalResizeRequest.setSizeDelta(new Dimension(-regionWidth, 0));
		} else if(Zone.isTop(zone)) {
			internalResizeRequest.setResizeDirection(PositionConstants.SOUTH);
			internalResizeRequest.setSizeDelta(new Dimension(0, -regionHeight));
		} else if(Zone.isBottom(zone)) {
			internalResizeRequest.setResizeDirection(PositionConstants.NORTH);
			internalResizeRequest.setSizeDelta(new Dimension(0, -regionHeight));
		}

		internalResizeCommand = new CustomRegionResizeCommand(adaptableForRegion, null, regionEP.getEditingDomain(), null, internalResizeRequest, null);

		try {
			internalResizeCommand.execute(null, null);
		} catch (ExecutionException e) {
		}

		return b;
	}

}
