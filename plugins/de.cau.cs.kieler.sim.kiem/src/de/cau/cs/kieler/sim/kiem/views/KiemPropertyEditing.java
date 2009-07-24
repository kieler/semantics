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
 ******************************************************************************/

package de.cau.cs.kieler.sim.kiem.views;

import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

import de.cau.cs.kieler.sim.kiem.data.KiemProperty;

public class KiemPropertyEditing extends EditingSupport {
	private KiemView parent;
	private Composite tree;
	
	public KiemPropertyEditing(KiemView parent, 
						  ColumnViewer viewer, 
						  int columnIndex) {
		super(viewer);
		
		// Create the correct editor based on the column index
		switch (columnIndex) {
		case 1:
			this.tree = ((TreeViewer)viewer).getTree();
			break;
		default:
			throw new RuntimeException("Editing not supported");
		}
		this.parent = parent;
	}

	@Override
	protected boolean canEdit(Object element) {
		//do not allow to modify enabled/disabled status during execution
		if (parent.KIEMInstance.execution != null) 
			return false;
		return true;
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		KiemProperty property = (KiemProperty)element;
		property.getType().setCellEditor(tree);
		return property.getType().getCellEditor();
	}

	@Override
	protected Object getValue(Object element) {
		KiemProperty property = (KiemProperty)element;
		return property.getType().getValue(property);
	}

	@Override
	protected void setValue(Object element, Object value) {
		KiemProperty property = (KiemProperty)element;
		property.getType().setValue(property, ""+value);
		getViewer().update(element, null);
	}

}
