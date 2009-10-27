/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.dsl.kits.autolayout;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.ui.IEditorPart;
import de.cau.cs.kieler.viewmanagement.ACombination;
import de.cau.cs.kieler.viewmanagement.ATrigger;
import de.cau.cs.kieler.viewmanagement.RunLogic;
import de.cau.cs.kieler.viewmanagement.TriggerEventObject;

/**
 * @author oba
 * 
 */
public class AutoLayoutCombination extends ACombination {
	AutoLayoutTrigger trigger; // the auto layout trigger
	AutoLayoutEffect effect; // the auto layout effect
	DiagramEditPart targetEditPart; // the shape edit part that is used as a
	// target for the layout action
	IEditorPart activeEditorPart; // the active editor part

	/**
	 * 
	 */
	public AutoLayoutCombination() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.cau.cs.kieler.viewmanagement.ACombination#evaluate(de.cau.cs.kieler
	 * .viewmanagement.TriggerEventObject)
	 */
	@Override
	public boolean evaluate(TriggerEventObject triggerEvent) {
		EditPart affectedObject = translateToEditPart(triggerEvent
				.getAffectedObject(), parent);
		if (affectedObject instanceof DiagramEditPart) {
			this.targetEditPart = (DiagramEditPart) affectedObject;
			// Add editorPart if supplied
			if (triggerEvent.getParameters() instanceof IEditorPart)
				this.activeEditorPart = (IEditorPart) triggerEvent
						.getParameters();

			return true;
		} else
			return false;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.cau.cs.kieler.viewmanagement.ACombination#execute()
	 */
	@Override
	public void execute() {
		if (effect == null)
			effect = new AutoLayoutEffect();
		effect.setTarget(targetEditPart);
		effect.setParameters(activeEditorPart);
		effect.execute();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.cau.cs.kieler.viewmanagement.ACombination#getTriggers()
	 */
	@Override
	public List<ATrigger> getTriggers() {
		this.trigger = (AutoLayoutTrigger) RunLogic
				.getTrigger("de.cau.cs.kieler.synccharts.dsl.kits.autolayout.AutoLayoutTrigger");
		List<ATrigger> triggerList = new ArrayList<ATrigger>();
		triggerList.add(trigger);
		return triggerList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.cau.cs.kieler.viewmanagement.ACombination#undoLastEffect()
	 */
	@Override
	public void undoLastEffect() {
		// TODO Auto-generated method stub

	}

}
