package de.cau.cs.kieler.yakindu.sccharts.ui.editor.parts;

import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.yakindu.sct.ui.editor.editor.figures.StateFigure;
import org.yakindu.sct.ui.editor.editor.figures.utils.MapModeUtils;
import org.yakindu.sct.ui.editor.editparts.StateEditPart;

import com.google.inject.Inject;

import de.cau.cs.kieler.yakindu.sccharts.ui.editor.figures.SyncStateFigure;
import de.cau.cs.kieler.yakindu.sgraph.syncgraph.SyncState;
import de.cau.cs.kieler.yakindu.sgraph.syncgraph.SyncgraphPackage;

/**
 * Implement the Initial and Final state EditParts
 * 
 * @author wah
 * 
 */
public class SyncStateEditPart extends StateEditPart {

	@Inject
	private SyncStateFigure primaryShape;

	private boolean isInitialState = false;
	private boolean isFinalState = false;

	public SyncStateFigure getPrimaryShape() {
		return primaryShape;
	}

	@Override
	protected NodeFigure createNodeFigure() {
		updateStateType();
		NodeFigure figure = new DefaultSizeNodeFigure(getDefaultSize()) {
			@Override
			// StateFigure is drawed smaller (Blurshadow size)
			public Rectangle getHandleBounds() {
				Insets insets = new Insets(0, 0, StateFigure.BLUR_SHADOW_WIDTH,
						StateFigure.BLUR_SHADOW_WIDTH);

				return new Rectangle(getBounds().x + insets.left, getBounds().y
						+ insets.top, getBounds().width
						- (insets.right + insets.left), getBounds().height
						- (insets.bottom + insets.top));
			}

		};
		figure.setLayoutManager(new StackLayout());
		figure.setMinimumSize(getDefaultSize());
		figure.add(getPrimaryShape());
		return figure;
	}

	private Dimension getDefaultSize() {
		return MapModeUtils.getDefaultSizeDimension(getMapMode());
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		// update the state Border
		if (notification.getFeature() == SyncgraphPackage.Literals.SYNC_STATE__IS_INITIAL
				|| notification.getFeature() == SyncgraphPackage.Literals.SYNC_STATE__IS_FINAL) {
			updateStateType();
			getPrimaryShape().refreshBorder();
			getPrimaryShape().repaint();
		}
		super.handleNotificationEvent(notification);
	}

	/**
	 * Update the State type (thick border for initial state and double line
	 * border for final state)
	 */
	private void updateStateType() {
		EObject element = resolveSemanticElement();
		if (element instanceof SyncState) {
			isInitialState = ((SyncState) element).isIsInitial();
			isFinalState = ((SyncState) element).isIsFinal();
			getPrimaryShape().setThickBorder(isInitialState);
			getPrimaryShape().setDoubleLineBorder(isFinalState);
		}

	}
}
