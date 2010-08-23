package org.eclipse.papyrus.diagram.statemachine.custom.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.papyrus.diagram.common.figure.node.IPapyrusNodeFigure;
import org.eclipse.papyrus.diagram.common.figure.node.NodeNamedElementFigure;
import org.eclipse.swt.SWT;

public class StateFigure extends NodeNamedElementFigure implements IPapyrusNodeFigure {

	protected int roundedBorderSize = 20;

	/**
	 * The information label.
	 */
	protected WrappingLabel informationLabel;

	protected boolean isInformationShown = false;

	/**
	 * Default Constructor
	 */
	public StateFigure() {
		shadowborder = new RoundedShadowBorder(getForegroundColor());
		setBorder(shadowborder);

		createInformationLabel();
	}

	/**
	 * Create a label that contains the name of the element.
	 */
	protected void createInformationLabel() {
		informationLabel = new WrappingLabel();

		informationLabel.setOpaque(false);
		informationLabel.setAlignment(PositionConstants.LEFT);
		informationLabel.setVisible(false);
		informationLabel.setTextWrap(true);
		getInformationLabelContainer().add(informationLabel, getInformationLabelConstraint(), -1);
	}

	/**
	 * Get the container for the information label.
	 * Children should override and implement this method in case the label must not be drawn in the overall figure. The returned figure shall be
	 * created in the method {@link #createCompositeFigureStructure()}.
	 * 
	 * @return figure containing the name label
	 * @see #getDefaultLabelsContainer()
	 */
	protected IFigure getInformationLabelContainer() {
		return getDefaultLabelsContainer();
	}

	/**
	 * Get the constraint for adding the information label.
	 * Children should override and implement this method in case the label must be drawn with a specific constraint.
	 * 
	 * @return figure containing the name label
	 * @see #getInformationLabelContainer()
	 * @see #getDefaultLabelsConstraint()
	 */
	protected Object getInformationLabelConstraint() {
		return getDefaultLabelsConstraint();
	}

	public void fillInformation(String text) {
		informationLabel.setText(text);
		refreshInformationToShow();
	}

	/**
	 * Refreshes the status of the label that displays information, depending on the text to display
	 */
	protected void refreshInformationToShow() {
		String text = informationLabel.getText();
		if(text == null || text.length() == 0 || text.equalsIgnoreCase("\n")) {
			informationLabel.setVisible(false);
			isInformationShown = false;
		} else {
			informationLabel.setVisible(true);
			isInformationShown = true;
		}
	}

	public void paintFigure(Graphics graphics) {
		paintBackground(graphics, getBounds());
		shadowborder.setColor(getForegroundColor());

		refreshInformationToShow();

		if(isInformationShown) {
			Rectangle rect = informationLabel.getBounds();

			graphics.setLineStyle(SWT.BORDER_SOLID);
			graphics.setLineWidth(SWT.BOLD);

			graphics.drawLine(rect.x, rect.y - 2, rect.x + rect.width - 1, rect.y - 2);

		}

	}

	public void setShadow(boolean shadow) {
		super.setShadow(shadow);
		if(!shadow) {
			RoundedBorder bord = new RoundedBorder(roundedBorderSize, roundedBorderSize);
			this.setBorder(bord);
		}
	}

}
