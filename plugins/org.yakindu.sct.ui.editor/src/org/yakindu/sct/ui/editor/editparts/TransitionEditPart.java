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
package org.yakindu.sct.ui.editor.editparts;

import org.eclipse.draw2d.Connection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.yakindu.sct.ui.editor.editor.figures.TransitionFigure;

import com.google.inject.Inject;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public class TransitionEditPart extends ConnectionNodeEditPart {

	@Inject
	private TransitionFigure primaryShape;

	public TransitionEditPart() {
		super(null);
	}

	@Override
	protected Connection createConnectionFigure() {
		return primaryShape;
	}

	private TransitionFigure getPrimaryShape() {
		return (TransitionFigure) getFigure();
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
