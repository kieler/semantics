package de.cau.cs.kieler.yakindu.sccharts.ui.editor.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
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
			switch (type) {
			case WEAKABORT:
				break;
			case NORMALTERMINATION:
				transition.setSourceDecoration(createNormalTerminationDecoration());
				break;
			case STRONGABORT:
				transition.setSourceDecoration(createStrongAbortDecoration());
				break;
			}
		}
		return transition;
	}


	private static final int LINE_WIDTH = 1;

	private static final int TERMINATION_SIZE = 2;
	private static final double TERMINATION_X_SCALE = 4.0;
	private static final double TERMINATION_Y_SCALE = 2.5;

	/**
	 * Create the normal termination decoration.
	 * 
	 * @return The decoration.
	 */
	private RotatableDecoration createNormalTerminationDecoration() {
		PolygonDecoration triangleDecoration = new PolygonDecoration();
		triangleDecoration.setLineWidth(getMapMode().DPtoLP(LINE_WIDTH));
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
	 * Create the strong abortion decoration.
	 * 
	 * @return The decoration.
	 */
	private RotatableDecoration createStrongAbortDecoration() {
		PolygonDecoration circleDecoration = new CircleDecoration();
		circleDecoration.setLineWidth(getMapMode().DPtoLP(LINE_WIDTH));
		circleDecoration.setForegroundColor(ColorConstants.black);
		circleDecoration.setBackgroundColor(ColorConstants.red);
		PointList circleDecorationPoints = new PointList();
		circleDecorationPoints.addPoint(STRONG_ABORT_SIZE, STRONG_ABORT_SIZE);
		circleDecorationPoints.addPoint(-STRONG_ABORT_SIZE, -STRONG_ABORT_SIZE);
		circleDecoration.setTemplate(circleDecorationPoints);
		circleDecoration.setScale(STRONG_ABORT_SCALE, STRONG_ABORT_SCALE);
		return circleDecoration;
	}

}
