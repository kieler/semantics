/*******************************************************************************
 * Copyright (c) 2006 CEA List.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     CEA List - initial API and implementation
 *******************************************************************************/
package org.eclipse.papyrus.diagram.statemachine.custom.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Dimension;

/**
 * PseudostateTerminateFigure.
 * 
 */
public class PseudostateTerminateFigure extends Shape {

	/**
	 * Default Constructor.
	 */
	public PseudostateTerminateFigure() {
		super();
		Dimension dim1 = new Dimension(22, 22);
		this.setPreferredSize(new Dimension(dim1));
		this.setMaximumSize(new Dimension(dim1));
		this.setMinimumSize(new Dimension(dim1));
		this.setSize(dim1);


		setLineWidth(2);
	}

	/**
	 * Does nothing
	 * 
	 * @see org.eclipse.draw2d.Shape#fillShape(org.eclipse.draw2d.Graphics)
	 */
	@Override
	protected void fillShape(Graphics graphics) {
	}

	/**
	 * @see org.eclipse.draw2d.Shape#outlineShape(org.eclipse.draw2d.Graphics)
	 */
	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.drawLine(bounds.getTopLeft(), bounds.getBottomRight());
		graphics.drawLine(bounds.getTopRight(), bounds.getBottomLeft());
	}
}
