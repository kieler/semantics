package de.cau.cs.kieler.yakindu.sccharts.ui.editor.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.ecore.EObject;
import de.cau.cs.kieler.yakindu.sccharts.ui.editor.syncgraph.SyncTransition;
import de.cau.cs.kieler.yakindu.sccharts.ui.editor.syncgraph.TransitionType;
import org.yakindu.sct.ui.editor.editor.figures.TransitionFigure;
import org.yakindu.sct.ui.editor.editparts.TransitionEditPart;

public class SyncTransitionEditPart extends TransitionEditPart {

	@Override
	protected Connection createConnectionFigure() {
		TransitionFigure transition = (TransitionFigure) super
				.createConnectionFigure();

		EObject element = resolveSemanticElement();
		if (element instanceof SyncTransition) {
			TransitionType type = ((SyncTransition) element).getType();
			PolygonDecoration deco = createSourceDecoration();
			switch (type) {
			case NORMALTERMINATION:
				break;
			case WEAKABORT:
				deco.setBackgroundColor(ColorConstants.green);
				transition.setSourceDecoration(deco);
				break;
			case STRONGABORT:
				deco.setBackgroundColor(ColorConstants.red);
				transition.setSourceDecoration(deco);
				break;
			}
		}
		return transition;
	}

	private PolygonDecoration createSourceDecoration() {
		PolygonDecoration df = new PolygonDecoration();
		df.setFill(true);
		df.setLineWidth(1);
		df.setTemplate(new PointList(new int[] { -2, 0, -1, 1, 0, 0, -1, -1 }));
		return df;

	}

}
