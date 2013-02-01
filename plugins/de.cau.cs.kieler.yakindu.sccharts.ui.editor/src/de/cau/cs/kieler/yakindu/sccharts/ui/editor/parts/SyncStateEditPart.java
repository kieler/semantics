package de.cau.cs.kieler.yakindu.sccharts.ui.editor.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.yakindu.sct.ui.editor.editparts.StateEditPart;

import de.cau.cs.kieler.yakindu.sccharts.ui.editor.syncgraph.SyncState;

/**
 * Implement the Initial and Final state EditParts
 * 
 * @author wah
 * 
 */
public class SyncStateEditPart extends StateEditPart {
	
	private final int INITIAL_STATE_LINE_WIDTH = 2;
	

	@Override
	protected void handleNotificationEvent(Notification notification) {

		EObject element = resolveSemanticElement();
		if (element instanceof SyncState) {
			boolean isInitialState = ((SyncState) element).isIsInitial();
			boolean isFinalState = ((SyncState) element).isIsFinal();

			if (isInitialState) {
				getPrimaryShape().setLineWidth(INITIAL_STATE_LINE_WIDTH);
				getPrimaryShape().setForegroundColor(ColorConstants.black);
				getPrimaryShape().repaint();
			}
			
			if(isFinalState) {
				//TODO double line border for final state
				getPrimaryShape().setLineWidth(10);
				getPrimaryShape().repaint();
			}

		}
		super.handleNotificationEvent(notification);

	}
	
}
