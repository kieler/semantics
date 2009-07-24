/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/

package de.cau.cs.kieler.sim.table;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class TableDataLabelProvider implements ITableLabelProvider {

	// define icons
	private static final Image CHECKED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.table",
					"icons/checked.png").createImage();
	private static final Image CHECKED_DISABLED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.table",
					"icons/checkedDisabled.png").createImage();
	private static final Image UNCHECKED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.table",
					"icons/unchecked.png").createImage();
	private static final Image PERMANENT = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.table",
					"icons/permanent.png").createImage();


	public Image getColumnImage(Object element, int columnIndex) {
		TableData tableData = (TableData) element;
		if (columnIndex == 1) {
			if (tableData.isPresent()) {
				if (tableData.isPermanent())
					return CHECKED_DISABLED;
				else
					return CHECKED;
			}
			else {
				return UNCHECKED;
			}
		}
		if (columnIndex == 2) {
			if (tableData.isPermanent()) {
				return PERMANENT;
			}
		}
		return null;
	}

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

	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

}
