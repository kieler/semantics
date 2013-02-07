package de.cau.cs.kieler.yakindu.sccharts.ui.editor.parts;

import org.yakindu.sct.ui.editor.editparts.RegionEditPart;

import com.google.inject.Inject;

import de.cau.cs.kieler.yakindu.sccharts.ui.editor.figures.SyncRegionFigure;

public class SyncRegionEditPart extends RegionEditPart {
	@Inject
	private SyncRegionFigure primaryShape;
	
	@Override
	protected SyncRegionFigure getPrimaryShape() {
		return primaryShape;
	}
}
