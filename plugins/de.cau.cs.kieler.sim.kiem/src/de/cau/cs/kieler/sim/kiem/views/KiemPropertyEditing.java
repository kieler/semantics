/******************************************************************************
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
 ******************************************************************************/

package de.cau.cs.kieler.sim.kiem.views;

import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

import de.cau.cs.kieler.sim.kiem.data.KiemProperty;

/**
 * The Class KiemPropertyEditing. It handles the editing support for
 * KiemProperties in the DataComponentExs table of the KiemView.
 *
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public class KiemPropertyEditing extends EditingSupport {
	
	/** The parent view to trigger a refresh. */
	private KiemView parent;
	
	/** The tree (table) to operate on. */
	private Composite tree;

	//-------------------------------------------------------------------------
	
	/**
	 * Instantiates a new KiemPropertyEditing for the tree. KiemProperty 
	 * values are in the second column (index 1) of the tree-table of 
	 * DataComponentExs where the first column (index 0) holds the KiemProperty
	 * key. Hence editing support for KiemProperties is only available for the
	 * first, the value column. Otherwise an error is generated.
	 * 
	 * @param parent the parent view
	 * @param viewer the column viewer
	 * @param columnIndex the column index
	 */
	public KiemPropertyEditing(KiemView parent, 
						  ColumnViewer viewer, 
						  int columnIndex) {
		super(viewer);
		
		// Create the correct editor based on the column index
		switch (columnIndex) {
		case 1:
			//save the tree of the viewer inside tree for later
			//register the appropriate cell editor for it
			this.tree = ((TreeViewer)viewer).getTree();
			break;
		default:
			throw new RuntimeException("Editing not supported");
		}
		this.parent = parent;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.EditingSupport#canEdit(java.lang.Object)
	 */
	@Override
	protected boolean canEdit(Object element) {
		//do not allow to modify enabled/disabled status during execution
		if (parent.KIEMInstance.execution != null) 
			return false;
		return true;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.EditingSupport#getCellEditor(java.lang.Object)
	 */
	@Override
	protected CellEditor getCellEditor(Object element) {
		//this gets not a special (static) cell editor
		//but a dynamic one that is based on the KiemPropertyType of
		//the KiemProperty element
		KiemProperty property = (KiemProperty)element;
		property.getType().setCellEditor(tree);
		return property.getType().getCellEditor();
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.EditingSupport#getValue(java.lang.Object)
	 */
	@Override
	protected Object getValue(Object element) {
		//get the value using the getValue() method of the KiemPropertyType
		KiemProperty property = (KiemProperty)element;
		return property.getType().getValue(property);
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.EditingSupport#setValue(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void setValue(Object element, Object value) {
		//set the value using the getValue() method of the KiemPropertyType
		KiemProperty property = (KiemProperty)element;
		String oldValue = ""+property.getValue();
		property.getType().setValue(property, ""+value);
		String newValue = ""+property.getValue();
		boolean valueChanged
					= !(newValue.equals(oldValue));
		getViewer().update(element, null);
		if (valueChanged)
			parent.setDirty(true);
	}

}
