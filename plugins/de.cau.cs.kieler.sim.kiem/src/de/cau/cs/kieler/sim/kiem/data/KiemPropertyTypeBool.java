package de.cau.cs.kieler.sim.kiem.data;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class KiemPropertyTypeBool extends KiemPropertyType
									implements IKiemPropertyType {
	
	private static final Image PROPERTY_BOOL = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/propertyBoolIcon.png").createImage();
	private static final String[] BOOL_ITEMS = {"false", "true"};

	public KiemPropertyTypeBool() {
		super();
	}
	
	@Override 
	public void setCellEditor(Composite parent) {
		cellEditor = new ComboBoxCellEditor(parent, 
									BOOL_ITEMS, 
									SWT.Deactivate);
	}

	@Override
	public Object getValue(Object element) {
		KiemProperty property = (KiemProperty)element;
		if (property.getValue().equals("true")) return 1;
		else return 0;
	}

	@Override
	public void setValue(Object element, Object value) {
		KiemProperty property = (KiemProperty)element;
		if ((Integer) value == 0) {
			property.setValue("false");
		}
		else {
			property.setValue("true");
		}
	}

	@Override
	public Image getIcon() {
		// TODO Auto-generated method stub
		return PROPERTY_BOOL;
	}

}
