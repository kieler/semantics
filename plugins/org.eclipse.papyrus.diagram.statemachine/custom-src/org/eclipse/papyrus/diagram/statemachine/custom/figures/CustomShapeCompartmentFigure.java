package org.eclipse.papyrus.diagram.statemachine.custom.figures;

import org.eclipse.draw2d.ScrollPane;
import org.eclipse.gmf.runtime.diagram.ui.figures.ShapeCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;

public class CustomShapeCompartmentFigure extends ShapeCompartmentFigure {

	public CustomShapeCompartmentFigure(String compartmentTitle, IMapMode mm) {
		super(compartmentTitle, mm);

		setTitleVisibility(false);

		scrollPane.setScrollBarVisibility(ScrollPane.NEVER);
		scrollPane.setBorder(null);
	}

	@Override
	protected void configureFigure(IMapMode mm) {
		super.configureFigure(mm);
		scrollPane.setScrollBarVisibility(ScrollPane.NEVER);
		scrollPane.setBorder(null);
	}
}
