/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.ui.editor.parts;

import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.yakindu.sct.ui.editor.editor.figures.StateFigure;
import org.yakindu.sct.ui.editor.editparts.StateEditPart;

import com.google.inject.Inject;

import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState;
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphPackage;
import de.cau.cs.kieler.yakindu.ui.editor.figures.SyncStateFigure;
import de.cau.cs.kieler.yakindu.ui.editor.figures.utils.SyncMapModeUtils;

/**
 * Implement the Initial and Final state EditParts.
 * 
 * @author wah
 * @kieler.rating green 2013-04-13
 * 
 */
public class SyncStateEditPart extends StateEditPart {

	@Inject
	private SyncStateFigure primaryShape;

	/**
	 * This method returns the primary shape (the SyncState figure).
	 */
	public SyncStateFigure getPrimaryShape() {
		return primaryShape;
	}

	/**
	 * This method overrides the createNodeFigure from the StateEditPart to set
	 * the new default size of a state.
	 */
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
		return SyncMapModeUtils.getDefaultSizeDimension(getMapMode());
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		// Update the state Border.
		// If the state is set to initial state, draw a thicker line border.
		// If the state is set to final state, draw a double line border.
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
	 * border for final state).
	 */
	private void updateStateType() {
		EObject element = resolveSemanticElement();
		if (element instanceof SyncState) {
			getPrimaryShape().setThickBorder(
					((SyncState) element).isIsInitial());
			getPrimaryShape().setDoubleLineBorder(
					((SyncState) element).isIsFinal());
		}
	}
}
