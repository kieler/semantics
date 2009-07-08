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


	@Override
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

	@Override
	public String getColumnText(Object element, int columnIndex) {
		TableData tableData = (TableData) element;
		switch (columnIndex) {
		case 0 :  // PRESENT_COLUMN
			return ""; 
		case 1 : // KEY_COLUMN
			return tableData.getKey();
		case 2 : // VALUE_COLUMN 
			return tableData.getValue();
		default :
			throw new RuntimeException("columnIndex out of bounds (3)");
		}
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

}
