package de.cau.kieler.synccharts.yakindu.ui.editor.figures;

import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;

/**
 * 
 * @author wah
 *
 */
public class TransitionSyncchartsFigure extends PolylineConnectionEx {

	private final IMapMode mapMode;

	public TransitionSyncchartsFigure(IMapMode mapMode) {
		System.out.println("Hallo, it works");
		this.mapMode = mapMode;
		setLineWidth(mapMode.DPtoLP(1));
		setTargetDecoration(createTargetDecoration());
	}

	protected IMapMode getMapMode() {
		return mapMode;
	}

	private RotatableDecoration createTargetDecoration() {
		PolygonDecoration df = new PolygonDecoration();
		df.setFill(true);
		df.setLineWidth(getMapMode().DPtoLP(1));
		df.setTemplate(PolygonDecoration.INVERTED_TRIANGLE_TIP);
		return df;
	}
}
