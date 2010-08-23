package org.eclipse.papyrus.diagram.statemachine.custom.edit.part;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gef.requests.SelectionRequest;
import org.eclipse.gef.tools.DeselectAllTracker;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.internal.tools.RubberbandDragTracker;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.statemachine.custom.figures.CustomShapeCompartmentFigure;
import org.eclipse.papyrus.diagram.statemachine.edit.parts.RegionCompartmentEditPart;
import org.eclipse.uml2.uml.Region;

public class CustomRegionCompartmentEditPart extends RegionCompartmentEditPart {

	public CustomRegionCompartmentEditPart(View view) {
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

	public IFigure createFigure() {
		CustomShapeCompartmentFigure result = new CustomShapeCompartmentFigure(getCompartmentName(), getMapMode());
		result.setBorder(null);
		return result;
	}

	@Override
	public DragTracker getDragTracker(Request req) {
		if(!supportsDragSelection())
			return super.getDragTracker(req);

		if(req instanceof SelectionRequest && ((SelectionRequest)req).getLastButtonPressed() == 3)
			return new DeselectAllTracker(this) {

				protected boolean handleButtonDown(int button) {
					getCurrentViewer().select(getParent());
					return true;
				}
			};
		return new RubberbandDragTracker() {

			protected void handleFinished() {
				if(getViewer().getSelectedEditParts().isEmpty())
					getViewer().select(getParent());
			}
		};
	}

	@Override
	protected void refreshVisuals() {
		// TODO Auto-generated method stub
		super.refreshVisuals();

		View regionView = (View)((View)getModel()).eContainer();
		Region region = (Region)regionView.getElement();

		((CustomShapeCompartmentFigure)getFigure()).setToolTip(region.getName());

	}
}
