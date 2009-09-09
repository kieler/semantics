/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
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

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.kiml.ui.layout.DiagramLayoutManager;
import de.cau.cs.kieler.viewmanagement.AEffect;

/**
 * An {@link AEffect} for auto-layout
 * @author oba
 * 
 */
public class AutoLayoutEffect extends AEffect {

	DiagramEditPart editPart; // the edit part for the auto layout method
	IEditorPart editorPart; // the editor part for the auto layout method

	/**
	 * Auto-Layout provided by the
	 * {@link DiagramLayoutManager}
	 */
	@Override
	public void execute() {
		DiagramLayoutManager.layout(editorPart, editPart, true, true);

	}

	/**
	 * @param parameters What needs to be layouted?
	 * In this special case the parameter is an IEditorPart
	 */
	@Override
	public void setParameters(Object parameters) {
		if (parameters instanceof IEditorPart)
			this.editorPart = (IEditorPart) parameters;

	}

	/**
	 * @param target Which EditPart is targeted by the auto-layout?
	 */
	public void setTarget(DiagramEditPart target) {
		this.editPart = (DiagramEditPart) target;

	}

	@Override
	public void setTarget(ShapeEditPart target) {
		// TODO Auto-generated method stub
		
	}



}
