/**
 * Copyright (c) 2010 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package de.cau.cs.kieler.yakindu.ui.editor.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.yakindu.sct.ui.editor.editparts.TransitionExpressionEditPart;

import com.google.inject.Inject;

/**
 * 
 * @author cmot, original by itemis
 * 
 */
public class SplineTransitionEditPart extends ConnectionNodeEditPart {

	@Inject
	private SplineTransitionFigure primaryShape;

	public SplineTransitionEditPart() {
		super(null);
	}

	@Override
	protected Connection createConnectionFigure() {
		return primaryShape;
	}

	private SplineTransitionFigure getPrimaryShape() {
		return (SplineTransitionFigure) getFigure();
	}

	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (childEditPart instanceof TransitionExpressionEditPart) {
			getPrimaryShape().add(
					((TransitionExpressionEditPart) childEditPart).getFigure());
		} else
			super.addChildVisual(childEditPart, index);
	}

	@Override
	protected void removeChildVisual(EditPart childEditPart) {
		if (childEditPart instanceof TransitionExpressionEditPart) {
			getPrimaryShape().remove(
					((TransitionExpressionEditPart) childEditPart).getFigure());
		}
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		if (NotationPackage.eINSTANCE.getFontStyle().getEAllAttributes()
				.contains(notification.getFeature())) {
			refreshFont();
		} else {
			super.handleNotificationEvent(notification);
		}
	}

}
