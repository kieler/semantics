/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.ui.editor.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;

/**
 * The transition decorators. This class creates the weak abort (no decorator),
 * strong abort (red filled circle), and normal termination (green filled
 * triangle) transition decorators. This class is used by the
 * SyncTransitionEditPart class.
 * 
 * @author wah
 * @kieler.rating green 2013-04-13
 */
public abstract class TransitionDecorator {

	public static final int LINE_WIDTH = 1;

	private static final int TERMINATION_SIZE = 2;
	private static final double TERMINATION_X_SCALE = 4.0;
	private static final double TERMINATION_Y_SCALE = 2.5;

	/**
	 * Create the normal termination decoration (a triangle filled with a green
	 * color).
	 * 
	 * @return The decoration.
	 */
	public static RotatableDecoration createNormalTerminationDecoration(int w) {
		PolygonDecoration triangleDecoration = new PolygonDecoration();
		// triangleDecoration.setLineWidth(getMapMode().DPtoLP(LINE_WIDTH));
		triangleDecoration.setLineWidth(w);
		triangleDecoration.setForegroundColor(ColorConstants.black);
		triangleDecoration.setBackgroundColor(ColorConstants.green);
		PointList triangleDecorationPoints = new PointList();
		triangleDecorationPoints.addPoint(0, TERMINATION_SIZE);
		triangleDecorationPoints.addPoint(-TERMINATION_SIZE, 0);
		triangleDecorationPoints.addPoint(0, -TERMINATION_SIZE);
		triangleDecoration.setTemplate(triangleDecorationPoints);
		triangleDecoration.setScale(TERMINATION_X_SCALE, TERMINATION_Y_SCALE);
		return triangleDecoration;
	}

	private static final int STRONG_ABORT_SIZE = 2;
	private static final double STRONG_ABORT_SCALE = 2.0;

	/**
	 * Create the strong abortion decoration (a circle filled with a red color).
	 * 
	 * @return The decoration.
	 */
	public static RotatableDecoration createStrongAbortDecoration(int w) {
		PolygonDecoration circleDecoration = new CircleDecoration();
		// circleDecoration.setLineWidth(getMapMode().DPtoLP(LINE_WIDTH));
		circleDecoration.setLineWidth(w);
		circleDecoration.setForegroundColor(ColorConstants.black);
		circleDecoration.setBackgroundColor(ColorConstants.red);
		PointList circleDecorationPoints = new PointList();
		circleDecorationPoints.addPoint(STRONG_ABORT_SIZE, STRONG_ABORT_SIZE);
		circleDecorationPoints.addPoint(-STRONG_ABORT_SIZE, -STRONG_ABORT_SIZE);
		circleDecoration.setTemplate(circleDecorationPoints);
		circleDecoration.setScale(STRONG_ABORT_SCALE, STRONG_ABORT_SCALE);
		return circleDecoration;
	}

	private static final int HISTORY_SIZE = 4;
	private static final double HISTORY_SCALE = 2.2;
	private static final double HEIGHT_RATIO = 0.25;
	private static final double WIDTH_RATIO = 0.25;

	/**
	 * Create the history target decoration (a black circle havin the letter H
	 * inside).
	 * 
	 * @return The decoration.
	 */
	public static RotatableDecoration createHistoryTargetDecoration() {
		CircleDecoration historyDecoration = new CircleDecoration() {
			protected void outlineShape(final Graphics graphics) {
				// draw the 'H' letter
				graphics.pushState();
				graphics.setForegroundColor(org.eclipse.draw2d.ColorConstants.white);
				graphics.drawLine(
						bounds.getCenter().getTranslated(
								(int) (-bounds.width * WIDTH_RATIO),
								(int) (-bounds.height * HEIGHT_RATIO)),
						bounds.getCenter().getTranslated(
								(int) (-bounds.width * WIDTH_RATIO),
								(int) (bounds.height * HEIGHT_RATIO)));
				graphics.drawLine(
						bounds.getCenter().getTranslated(
								(int) (bounds.width * WIDTH_RATIO),
								(int) (-bounds.height * HEIGHT_RATIO)),
						bounds.getCenter().getTranslated(
								(int) (bounds.width * WIDTH_RATIO),
								(int) (bounds.height * HEIGHT_RATIO)));
				graphics.drawLine(
						bounds.getCenter().getTranslated(
								(int) (-bounds.width * WIDTH_RATIO), 0),
						bounds.getCenter().getTranslated(
								(int) (bounds.width * WIDTH_RATIO), 0));
				graphics.popState();
			}
		};
		historyDecoration.setLineWidth(LINE_WIDTH);
		historyDecoration.setForegroundColor(ColorConstants.black);
		historyDecoration.setBackgroundColor(ColorConstants.black);
		PointList historyDecorationPoints = new PointList();
		historyDecorationPoints.addPoint(HISTORY_SIZE, HISTORY_SIZE);
		historyDecorationPoints.addPoint(-HISTORY_SIZE, -HISTORY_SIZE);
		historyDecoration.setTemplate(historyDecorationPoints);
		historyDecoration.setScale(HISTORY_SCALE, HISTORY_SCALE);
		return historyDecoration;
	}

	/**
	 * Creates a target decorator (arrowhead). 
	 * 
	 * @return RotatableDecoration
	 */
	public static RotatableDecoration createTransitionTargetDecoration() {
		PolygonDecoration df = new PolygonDecoration();
		df.setFill(true);
		df.setLineWidth(1);
		df.setTemplate(PolygonDecoration.TRIANGLE_TIP);
		return df;
	}
}
