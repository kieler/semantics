/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.ui.editor.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.yakindu.sct.ui.editor.editor.figures.TransitionFigure;
import org.yakindu.sct.ui.editor.editparts.TransitionEditPart;
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition;
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType;

/**
 * 
 * The SyncTransition editpart.
 * 
 * @author wah
 * 
 */
public class SyncTransitionEditPart extends TransitionEditPart {

	@Override
	protected Connection createConnectionFigure() {
		TransitionFigure transition = (TransitionFigure) super
				.createConnectionFigure();
		updateTransitionSourceDecorator(transition);
		updateTransitionTargetDecorator(transition);
		return transition;
	}

	/**
	 * Returns the TransitionFigure
	 * 
	 * @return the TransitionFigure
	 */
	private TransitionFigure getPrimaryShape() {
		return (TransitionFigure) getFigure();
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		updateTransitionSourceDecorator(getPrimaryShape());
		updateTransitionTargetDecorator(getPrimaryShape());
		getPrimaryShape().repaint();
		super.handleNotificationEvent(notification);
	}

	/**
	 * Update the source decorator (red circle for strong abortion, green
	 * triangle for normal termination, and no decorator for weak abortion)
	 * 
	 * @param The
	 *            transition figure
	 */
	private void updateTransitionSourceDecorator(TransitionFigure transition) {
		EObject element = resolveSemanticElement();
		if (element instanceof SyncTransition) {
			TransitionType type = ((SyncTransition) element).getType();
			switch (type) {
			case WEAKABORT:
				transition.setSourceDecoration(null);
				break;
			case NORMALTERMINATION:
				transition.setSourceDecoration(TransitionDecorator
						.createNormalTerminationDecoration(getMapMode().DPtoLP(
								TransitionDecorator.LINE_WIDTH)));
				break;
			case STRONGABORT:
				transition.setSourceDecoration(TransitionDecorator
						.createStrongAbortDecoration(getMapMode().DPtoLP(
								TransitionDecorator.LINE_WIDTH)));
				break;
			}
		}
	}

	/**
	 * Update the target decorator if the transition is a Histroy Transition
	 * 
	 * @param The
	 *            transition figure
	 */
	private void updateTransitionTargetDecorator(TransitionFigure transition) {
		EObject element = resolveSemanticElement();
		if (element instanceof SyncTransition) {
			boolean isHistory = ((SyncTransition) element).isIsHistory();
			if (isHistory) {
				transition.setTargetDecoration(TransitionDecorator
						.createHistoryTargetDecoration());
			} else {
				transition.setTargetDecoration(TransitionDecorator
						.createTransitionTargetDecoration());
			}
		}
	}

}
