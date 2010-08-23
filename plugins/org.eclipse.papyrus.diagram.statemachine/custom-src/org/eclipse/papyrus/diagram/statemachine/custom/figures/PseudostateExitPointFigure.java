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

import java.util.Iterator;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * PseudostateExitPointFigure.
 * 
 */
public class PseudostateExitPointFigure extends Ellipse {

	/**
	 * Default Constructor.
	 */
	public PseudostateExitPointFigure() {
		super();
		Dimension dim1 = new Dimension(22, 22);
		this.setPreferredSize(new Dimension(dim1));
		this.setMaximumSize(new Dimension(dim1));
		this.setMinimumSize(new Dimension(dim1));
		this.setSize(dim1);

	}

	/**
	 * Does nothing.
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
		graphics.pushState();
		IFigure ancestor = getParent();
		while((ancestor != null) && !(ancestor instanceof RegionFigure))
			ancestor = ancestor.getParent();
		if(ancestor != null) {
			if(((RegionFigure)ancestor).getBorderColor() != null)
				graphics.setForegroundColor(((RegionFigure)ancestor).getBorderColor());
			if(((RegionFigure)ancestor).getBackgroundColor() != null)
				graphics.setBackgroundColor(((RegionFigure)ancestor).getBackgroundColor());
		} else {
			ancestor = getParent();
			Iterator it = ancestor.getChildren().iterator();
			boolean found = false;
			while(it.hasNext() && !found) {
				ancestor = (IFigure)it.next();
				if(ancestor instanceof StateMachineFigure)
					found = true;
			}
			if(found) {
				if(((StateMachineFigure)ancestor).getBorderColor() != null)
					graphics.setForegroundColor(((StateMachineFigure)ancestor).getBorderColor());
				if(((StateMachineFigure)ancestor).getBackgroundColor() != null)
					graphics.setBackgroundColor(((StateMachineFigure)ancestor).getBackgroundColor());
			}
		}
		Rectangle r = Rectangle.SINGLETON;
		r.setBounds(getBounds());
		r.width--;
		r.height--;
		r.shrink((lineWidth - 1) / 2, (lineWidth - 1) / 2);
		graphics.drawOval(r);
		r.shrink(1, 1);
		graphics.fillOval(r);

		// intersection coordinates.
		int x = (int)(bounds.width / (2 * Math.sqrt(2)));
		int y = (int)(bounds.height / (2 * Math.sqrt(2)));

		// cross.
		graphics.drawLine(bounds.getCenter().translate(x, -y), bounds.getCenter().translate(-x, y));
		graphics.drawLine(bounds.getCenter().translate(-x, -y), bounds.getCenter().translate(x, y));

		graphics.popState();
	}
}
