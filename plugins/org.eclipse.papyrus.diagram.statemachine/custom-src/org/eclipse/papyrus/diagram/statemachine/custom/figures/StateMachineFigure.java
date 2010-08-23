package org.eclipse.papyrus.diagram.statemachine.custom.figures;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.notation.GradientStyle;
import org.eclipse.papyrus.diagram.common.figure.node.AutomaticCompartmentLayoutManager;
import org.eclipse.papyrus.diagram.common.figure.node.CompartmentFigure;

/**
 * Represents a classifier.
 */
public class StateMachineFigure extends CompartmentFigure {

	int arcwidth = 20;

	/** The StateMachine Compartment */
	private final static String STATEMACHINE_COMPARTMENT = "stateMachineCompartment";

	/** The List of Compartment */
	private final static List<String> COMPARTMENT = new ArrayList<String>() {

		private static final long serialVersionUID = 1L;
		{
			add(STATEMACHINE_COMPARTMENT);
		}
	};

	/**
	 * Default Constructor
	 */
	public StateMachineFigure() {
		this(null);
	}

	/**
	 * Create a new StateMachine figure with the given tag
	 * 
	 * @param tagLabel
	 *        a String that will be displayed at the top of the figure
	 */
	public StateMachineFigure(String tagLabel) {
		super(COMPARTMENT, tagLabel);
		shadowborder = new RoundedShadowBorder(getForegroundColor());
		setBorder(shadowborder);
		((AutomaticCompartmentLayoutManager)getLayoutManager()).setAddExtraHeight(false);
	}

	/**
	 * Get the statemachine compartment figure
	 * 
	 * @return
	 */
	public RectangleFigure getStateMachineCompartmentFigure() {
		return getCompartment(STATEMACHINE_COMPARTMENT);
	}

	@Override
	protected void paintBackground(Graphics graphics, Rectangle rectangle) {
		Rectangle r = rectangle;

		if(isUsingGradient()) {
			applyTransparency(graphics);
			boolean isVertical = (getGradientStyle() == GradientStyle.VERTICAL) ? true : false;
			graphics.setBackgroundColor(FigureUtilities.integerToColor(getGradientColor1()));
			graphics.setForegroundColor(FigureUtilities.integerToColor(getGradientColor2()));
			Rectangle tmp = new Rectangle(r.x + arcwidth / 2, r.y, r.width - arcwidth + 1, r.height);
			graphics.fillGradient(tmp, isVertical);
			tmp = new Rectangle(r.x, r.y + arcwidth / 2, r.width, r.height - arcwidth + 1);
			graphics.fillGradient(tmp, isVertical);
			if(isVertical) {
				graphics.setBackgroundColor(FigureUtilities.integerToColor(getGradientColor1()));
				graphics.fillArc(r.x + r.width - arcwidth, r.y + r.height - arcwidth, arcwidth, arcwidth, 270, 90);
				graphics.fillArc(r.x, r.y + r.height - arcwidth, arcwidth, arcwidth, 180, 90);
				graphics.setBackgroundColor(FigureUtilities.integerToColor(getGradientColor2()));
				graphics.fillArc(r.x + r.width - arcwidth, r.y, arcwidth, arcwidth, 0, 90);
				graphics.fillArc(r.x, r.y, arcwidth, arcwidth, 90, 90);
			} else {
				graphics.setBackgroundColor(FigureUtilities.integerToColor(getGradientColor1()));
				graphics.fillArc(r.x + r.width - arcwidth, r.y + r.height - arcwidth, arcwidth, arcwidth, 270, 90);
				graphics.fillArc(r.x + r.width - arcwidth, r.y, arcwidth, arcwidth, 0, 90);
				graphics.setBackgroundColor(FigureUtilities.integerToColor(getGradientColor2()));
				graphics.fillArc(r.x, r.y, arcwidth, arcwidth, 90, 90);
				graphics.fillArc(r.x, r.y + r.height - arcwidth, arcwidth, arcwidth, 180, 90);
			}
		} else {

			if(isShadow())
				r = r.getCopy().shrink(1, 1).translate(-1, -1);

			graphics.fillArc(r.x, r.y, arcwidth, arcwidth, 90, 90);
			graphics.fillArc(r.x + r.width - arcwidth, r.y, arcwidth, arcwidth, 0, 90);
			graphics.fillArc(r.x + r.width - arcwidth, r.y + r.height - arcwidth, arcwidth, arcwidth, 270, 90);
			graphics.fillArc(r.x, r.y + r.height - arcwidth, arcwidth, arcwidth, 180, 90);

			graphics.fillRectangle(r.x + arcwidth / 2, r.y, r.width - arcwidth + 1, r.height);
			graphics.fillRectangle(r.x, r.y + arcwidth / 2, r.width, r.height - arcwidth + 1);

		}
	}

	@Override
	public void paintFigure(Graphics graphics) {
		paintBackground(graphics, getBounds());

		shadowborder.setColor(getForegroundColor());
	}

	@Override
	public void setShadow(boolean shadow) {
		super.setShadow(shadow);
		if(!shadow) {
			RoundedBorder bord = new RoundedBorder(arcwidth, arcwidth);
			this.setBorder(bord);
		}
	}
}
