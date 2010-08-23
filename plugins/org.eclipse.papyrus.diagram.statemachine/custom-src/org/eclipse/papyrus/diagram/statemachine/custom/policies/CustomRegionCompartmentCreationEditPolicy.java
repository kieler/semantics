package org.eclipse.papyrus.diagram.statemachine.custom.policies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.LayerManager;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.common.commands.SemanticAdapter;
import org.eclipse.papyrus.diagram.statemachine.custom.commands.CustomRegionCreateElementCommand;
import org.eclipse.papyrus.diagram.statemachine.custom.figures.RegionFigure;
import org.eclipse.papyrus.diagram.statemachine.custom.helpers.Zone;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.RegionEditPart;
import org.eclipse.papyrus.diagram.statemachine.providers.UMLElementTypes;

public class CustomRegionCompartmentCreationEditPolicy extends CreationEditPolicy {

	IFigure sizeOnDropFeedback = null;

	String dropLocation = Zone.RIGHT;

	@Override
	public void eraseTargetFeedback(Request request) {
		if(sizeOnDropFeedback != null) {
			LayerManager.Helper.find(getHost()).getLayer(LayerConstants.FEEDBACK_LAYER).remove(sizeOnDropFeedback);
			sizeOnDropFeedback = null;
		}
	}

	@Override
	public Command getCommand(Request request) {

		// CHECK THIS
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart)getHost()).getEditingDomain();
		CompositeTransactionalCommand cc = new CompositeTransactionalCommand(editingDomain, DiagramUIMessages.AddCommand_Label);
		if(understandsRequest(request)) {
			if(request instanceof CreateUnspecifiedTypeRequest) {
				CreateUnspecifiedTypeRequest unspecReq = (CreateUnspecifiedTypeRequest)request;
				for(Iterator iter = unspecReq.getElementTypes().iterator(); iter.hasNext();) {
					IElementType elementType = (IElementType)iter.next();
					CreateRequest createRequest = unspecReq.getRequestForType(elementType);

					if(((IHintedType)elementType).getSemanticHint().equals(((IHintedType)UMLElementTypes.Region_3000).getSemanticHint())) {

						// starting point is the existing region compartment on
						// which mouse was moving
						View existingRegionCompartmentView = (View)getHost().getModel();
						// the existing region view
						View existingRegionView = (View)existingRegionCompartmentView.eContainer();
						// get and adaptable for it, to pass on to commands
						IAdaptable adaptableForExistingRegionView = (IAdaptable)new SemanticAdapter(null, existingRegionView);

						// do the whole job
						CustomRegionCreateElementCommand createNewRegion = new CustomRegionCreateElementCommand(adaptableForExistingRegionView, null, ((IGraphicalEditPart)getHost()).getDiagramPreferencesHint(), editingDomain, DiagramUIMessages.CreateCommand_Label, dropLocation);

						cc.compose(createNewRegion);

						return new ICommandProxy(cc.reduce());
					}
				}
			} else if(request instanceof ChangeBoundsRequest) {
				ChangeBoundsRequest changeBoundsRequest = (ChangeBoundsRequest)request;
				Point mouseLocation = changeBoundsRequest.getLocation();

				DropObjectsRequest dropRequest = new DropObjectsRequest();
				dropRequest.setLocation(mouseLocation);

				List<View> list = new ArrayList<View>();
				Iterator<EditPart> it = changeBoundsRequest.getEditParts().iterator();
				while(it.hasNext()) {
					EditPart ep = it.next();
					if(ep instanceof RegionEditPart) {
						View regionToDrag = (View)ep.getModel();
						list.add(regionToDrag);
					}
				}
				dropRequest.setObjects(list);
				return getHost().getCommand(dropRequest);
			}

			return super.getCommand(request);
		}
		return null;
	}

	protected IFigure getSizeOnDropFeedback() {
		if(sizeOnDropFeedback == null) {
			sizeOnDropFeedback = new RectangleFigure();
			FigureUtilities.makeGhostShape((Shape)sizeOnDropFeedback);
			((Shape)sizeOnDropFeedback).setLineStyle(Graphics.LINE_DASHDOT);
			sizeOnDropFeedback.setForegroundColor(ColorConstants.white);
			LayerManager.Helper.find(getHost()).getLayer(LayerConstants.FEEDBACK_LAYER).add(sizeOnDropFeedback);
		}
		return sizeOnDropFeedback;
	}

	@Override
	public void showTargetFeedback(Request request) {
		if(request instanceof CreateUnspecifiedTypeRequest) {
			CreateUnspecifiedTypeRequest unspecReq = (CreateUnspecifiedTypeRequest)request;
			for(Iterator iter = unspecReq.getElementTypes().iterator(); iter.hasNext();) {
				IElementType elementType = (IElementType)iter.next();
				if(elementType.equals(UMLElementTypes.Region_3000)) {
					RegionFigure targetFig = ((RegionEditPart)getHost().getParent()).getPrimaryShape();

					// make a local copy
					Rectangle targetFigBounds = targetFig.getBounds().getCopy();
					// transform the coordinates to absolute
					targetFig.translateToAbsolute(targetFigBounds);
					// retrieve mouse location
					Point mouseLocation = unspecReq.getLocation();

					// get the drop location, i.e. RIGHT, LEFT, TOP, BOTTOM
					dropLocation = Zone.getZoneFromLocationInRectangleWithAbsoluteCoordinates(mouseLocation, targetFigBounds);

					// perform corresponding change (scaling, translation) on
					// targetFigBounds
					// and updates the graph node drop location property
					if(Zone.isTop(dropLocation)) {
						targetFigBounds.setSize(targetFigBounds.getSize().scale(1.0, 0.5));
					} else if(Zone.isLeft(dropLocation)) {
						targetFigBounds.setSize(targetFigBounds.getSize().scale(0.5, 1.0));
					} else if(Zone.isRight(dropLocation)) {
						targetFigBounds.setSize(targetFigBounds.getSize().scale(0.5, 1.0));
						targetFigBounds.translate(targetFigBounds.width, 0);
					} else if(Zone.isBottom(dropLocation)) {
						targetFigBounds.setSize(targetFigBounds.getSize().scale(1.0, 0.5));
						targetFigBounds.translate(0, targetFigBounds.height);
					}

					getSizeOnDropFeedback().setBounds(new PrecisionRectangle(targetFigBounds));
				}
			}
		}
	}
}
