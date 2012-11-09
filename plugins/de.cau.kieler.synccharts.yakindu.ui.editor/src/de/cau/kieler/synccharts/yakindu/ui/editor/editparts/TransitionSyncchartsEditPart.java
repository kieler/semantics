package de.cau.kieler.synccharts.yakindu.ui.editor.editparts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.notation.View;
import org.yakindu.sct.ui.editor.editparts.TransitionEditPart;

import de.cau.kieler.synccharts.yakindu.ui.editor.figures.TransitionSyncchartsFigure;

public class TransitionSyncchartsEditPart extends TransitionEditPart {

	public TransitionSyncchartsEditPart(View view) {
		super(view);
	}
	
	@Override
	protected Connection createConnectionFigure() {
		return new TransitionSyncchartsFigure(getMapMode());
	}
	
}