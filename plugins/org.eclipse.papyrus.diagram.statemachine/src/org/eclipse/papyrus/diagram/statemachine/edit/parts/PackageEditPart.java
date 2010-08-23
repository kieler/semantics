package org.eclipse.papyrus.diagram.statemachine.edit.parts;

import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.IClippingStrategy;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.NonResizableLabelEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.common.editpolicies.DuplicatePasteEditPolicy;
import org.eclipse.papyrus.diagram.common.providers.ViewInfo;
import org.eclipse.papyrus.diagram.common.util.MDTUtil;
import org.eclipse.papyrus.diagram.statemachine.custom.policies.CustomPackageCreationEditPolicy;
import org.eclipse.papyrus.diagram.statemachine.custom.policies.CustomPackageXYLayoutEditPolicy;
import org.eclipse.papyrus.diagram.statemachine.custom.policies.CustomStateMachineDiagramDragDropEditPolicy;
import org.eclipse.papyrus.diagram.statemachine.custom.policies.RemoveOrphanViewPolicy;
import org.eclipse.papyrus.diagram.statemachine.edit.policies.PackageItemSemanticEditPolicy;
import org.eclipse.papyrus.diagram.statemachine.part.UMLVisualIDRegistry;

/**
 * @generated
 */
public class PackageEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	/* package-local */static class LinkLabelDragPolicy extends
			NonResizableLabelEditPolicy {

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected List createSelectionHandles() {
			MoveHandle mh = new MoveHandle((GraphicalEditPart) getHost());
			mh.setBorder(null);
			return Collections.singletonList(mh);
		}
	}

	/**
	 * @generated
	 */
	/* package-local */static class NodeLabelDragPolicy extends
			NonResizableEditPolicy {

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected List createSelectionHandles() {
			MoveHandle h = new MoveHandle((GraphicalEditPart) getHost());
			h.setBorder(null);
			return Collections.singletonList(h);
		}

		/**
		 * @generated
		 */
		public Command getCommand(Request request) {
			return null;
		}

		/**
		 * @generated
		 */
		public boolean understandsRequest(Request request) {
			return false;
		}
	}

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "PapyrusUMLStateMachineDiagram"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public PackageEditPart(View view) {
		super(view);

		getFigure().setClippingStrategy(new IClippingStrategy() {

			public Rectangle[] getClip(IFigure childFigure) {
				// very inefficient, since it implies several tree traversals. Bit handles modifications of the tree structure
				// It's a workaround instead of the better solution to fix BorderedNodeFigure (overload and let it return
				// getExtendedBounds)
				// See bug 313985 (https://bugs.eclipse.org/bugs/show_bug.cgi?id=313985) for more details
				applyClippingStrategy(childFigure);
				if (childFigure instanceof BorderedNodeFigure) {
					return new Rectangle[] { ((BorderedNodeFigure) childFigure)
							.getExtendedBounds() };

				} else {
					return new Rectangle[] { childFigure.getBounds() };
				}
			}
		});
	}

	/**
	 * @generated
	 */
	public void applyClippingStrategy(IFigure fig) {
		boolean hasBorderedNodeChild = false;
		for (Object child : fig.getChildren()) {
			if (child instanceof IFigure) {
				applyClippingStrategy((IFigure) child);
				if (child instanceof BorderedNodeFigure) {
					hasBorderedNodeChild = true;
				}
			}
		}
		if (hasBorderedNodeChild && (fig.getClippingStrategy() == null)) {
			fig.setClippingStrategy(new IClippingStrategy() {

				public Rectangle[] getClip(IFigure childFigure) {
					if (childFigure instanceof BorderedNodeFigure) {
						return new Rectangle[] { ((BorderedNodeFigure) childFigure)
								.getExtendedBounds() };
					} else {
						return new Rectangle[] { childFigure.getBounds() };
					}
				}
			});
		}

	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(DuplicatePasteEditPolicy.PASTE_ROLE,
				new DuplicatePasteEditPolicy());

		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PackageItemSemanticEditPolicy());

		//in Papyrus diagrams are not strongly synchronised
		//installEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CANONICAL_ROLE, new org.eclipse.papyrus.diagram.statemachine.edit.policies.PackageCanonicalEditPolicy());

		installEditPolicy("RemoveOrphanView", new RemoveOrphanViewPolicy()); //$NON-NLS-1$
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CustomPackageCreationEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new CustomPackageXYLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new CustomStateMachineDiagramDragDropEditPolicy());
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

	/**
	 * @generated
	 */
	public Object getAdapter(Class adapter) {

		if (adapter != null && adapter.equals(ViewInfo.class)) {
			return UMLVisualIDRegistry.getDiagramViewInfo();
		}
		return super.getAdapter(adapter);
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {

		super.handleNotificationEvent(event);
		if (event.getNotifier() instanceof EAnnotation) {
			EAnnotation eAnnotation = (EAnnotation) event.getNotifier();
			if (eAnnotation.getSource() != null
					&& eAnnotation.getSource().equals(
							MDTUtil.FilterViewAndLabelsSource)) {
				//modification form MOSKitt approach, canonical policies are not called
				MDTUtil.filterDiagramViews(this.getDiagramView());
			}
		}
	}

}
