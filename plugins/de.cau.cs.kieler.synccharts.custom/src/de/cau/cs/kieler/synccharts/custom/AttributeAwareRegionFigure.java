package de.cau.cs.kieler.synccharts.custom;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.gef.EditPart;

//public class AttributeAwareRegionFigure extends AttributeAwareFigure {
    public class AttributeAwareRegionFigure extends NeighborAwareOpenRectangleFigure {
    
	// The figure for regions; actually they do not need to be attribute aware,
	// but if they were not, the code templates would not work since we cannot
	// distinguish different classes in code templates (at least I can't)
	public AttributeAwareRegionFigure(EditPart e) {
		super();
		//this.setModelElementAndRegisterFromEditPart(e);
		
		this.setFill(false);
		this.setLineWidth(2);
		this.setLineStyle(Graphics.LINE_DASH);
		this.setForegroundColor(ColorConstants.gray);
		
		this.setSiblingLevel(2);
	}
}
