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

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * A decoration that depicts a circle.
 * 
 * @author wah
 * @kieler.rating green 2013-04-13
 */
public class CircleDecoration extends PolygonDecoration {

	private static final int VALUE_SIDE_INSET = 1;

	/**
	 * Sets the angle by which rotation is to be done on the PolygonDecoration.
	 * This method has to be empty, otherwise the circle would change its size
	 * at different angles.
	 * 
	 * @param angle
	 *            angle of rotation
	 */
	@Override
	public void setRotation(final double angle) {
	}

	/**
	 * {@inheritDoc} This method shrinks a rectangle by the VALUE_SIDE_INSET and
	 * draws it in g.
	 */
	@Override
	protected void outlineShape(final Graphics g) {
		Rectangle ovalBounds = getBounds().getCopy();
		ovalBounds.shrink(new Insets(VALUE_SIDE_INSET));
		g.drawOval(ovalBounds);
	}

	/**
	 * {@inheritDoc} This method shrinks a rectangle by the VALUE_SIDE_INSET and
	 * fills it in g.
	 */
	@Override
	protected void fillShape(final Graphics g) {
		Rectangle ovalBounds = getBounds().getCopy();
		ovalBounds.shrink(new Insets(VALUE_SIDE_INSET));
		g.fillOval(ovalBounds);
	}

}
