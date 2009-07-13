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
	private static final Image UNCHECKED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.table",
					"icons/unchecked.png").createImage();


	public Image getColumnImage(Object element, int columnIndex) {
		TableData tableData = (TableData) element;
		if (columnIndex == 0) {
			if (tableData.isPresent()) {
				return CHECKED;
			}
			else {
				return UNCHECKED;
			}
		}
		return null;
	}

	public String getColumnText(Object element, int columnIndex) {
		TableData tableData = (TableData) element;
		switch (columnIndex) {
		case 0 :  // PRESENT_COLUMN
			return ""; 
		case 1 : // KEY_COLUMN
			if (tableData.isModified())
				return "*"+tableData.getKey();
			else
				return tableData.getKey();
		case 2 : // VALUE_COLUMN 
			return tableData.getValue();
		default :
			throw new RuntimeException("columnIndex out of bounds (3)");
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
