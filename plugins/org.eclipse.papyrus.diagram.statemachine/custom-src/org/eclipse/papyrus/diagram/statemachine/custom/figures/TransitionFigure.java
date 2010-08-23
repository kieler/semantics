package org.eclipse.papyrus.diagram.statemachine.custom.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.papyrus.diagram.common.figure.edge.DashedEdgeFigure;

public class TransitionFigure extends DashedEdgeFigure {

	/**
	 * use to if the arrow will be displayed
	 */
	protected boolean arrow = true;

	/**
	 * Creates a new UMLEdgeFigure.
	 */
	public TransitionFigure() {
		super();
		setStyle();
	}

	/**
	 * Sets initial Style for the figure. It does not give any special Color for
	 * Background and Foreground. This is the style used for classic arrows:
	 * ------>
	 */
	protected void setStyle() {
		PolylineDecoration dec = new PolylineDecoration();
		dec.setScale(15, 5);
		dec.setLineWidth(1);
		if(arrow) {
			this.setTargetDecoration(dec);
		} else {
			this.setTargetDecoration(null);
		}// arrow at target endpoint
		this.setLineStyle(Graphics.LINE_CUSTOM); // line drawing style

	}
}
