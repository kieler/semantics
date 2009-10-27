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
 */

package de.cau.cs.kieler.sim.table.views;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * The class TableDataLabelProvider provides the labels and images
 * for the content of an TableData entry within the table ViewPart.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class TableDataLabelProvider implements ITableLabelProvider {

	// define icons
	/** The Constant CHECKED. */
	private static final Image CHECKED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.table",
					"icons/checked.png").createImage();
	
	/** The Constant CHECKED_DISABLED. */
	private static final Image CHECKED_DISABLED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.table",
					"icons/checkedDisabled.png").createImage();
	
	/** The Constant UNCHECKED. */
	private static final Image UNCHECKED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.table",
					"icons/unchecked.png").createImage();
	
	/** The Constant UNCHECKED_DISABLED. */
	private static final Image UNCHECKED_DISABLED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.table",
					"icons/uncheckedDisabled.png").createImage();
	
	/** The Constant PERMANENT. */
	private static final Image PERMANENT = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.table",
					"icons/permanent.png").createImage();

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(java.lang.Object, int)
	 */
	public Image getColumnImage(Object element, int columnIndex) {
		TableData tableData = (TableData) element;
		if (columnIndex == 1) {
			if (!tableData.isPermanent()) {
				if (tableData.isPresent())
					return CHECKED;
				else if (tableData.isSignal())
					return UNCHECKED;
				else
					return null;
			}
			else {
				if (tableData.isPresent())
					return CHECKED_DISABLED;
				else if (tableData.isSignal())
					return UNCHECKED_DISABLED;
				else
					return null;
			}
		}
		if (columnIndex == 2) {
			if (tableData.isPermanent()) {
				return PERMANENT;
			}
		}
		return null;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object, int)
	 */
	public String getColumnText(Object element, int columnIndex) {
		TableData tableData = (TableData) element;
		switch (columnIndex) {
		case 0 :  // NOT_VISIBLE_COLUMN
			return ""; 
		case 1 :  // PRESENT_COLUMN
			return ""; 
		case 2 : // KEY_COLUMN
			if (tableData.isModified())
				return "*"+tableData.getKey();
			else
				return tableData.getKey();
		case 3 : // VALUE_COLUMN 
			return tableData.getValue();
		default :
			throw new RuntimeException("columnIndex out of bounds (4)");
		}
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 */
	public void addListener(ILabelProviderListener listener) {
		//noop
	}
	
	//-------------------------------------------------------------------------
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
	 */
	public void dispose() {
		//noop
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang.Object, java.lang.String)
	 */
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 */
	public void removeListener(ILabelProviderListener listener) {
		//noop
	}

}
