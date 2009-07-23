package de.cau.cs.kieler.sim.kiem.data;

import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class KiemPropertyTypeChoice extends KiemPropertyType
									implements IKiemPropertyType {
	
	private static final long serialVersionUID = 922994563762566959L;

	private static final Image PROPERTY_CHOICE = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/propertyChoiceIcon.png").createImage();
	
	private String[] items;

	public KiemPropertyTypeChoice(String[] items) {
		super();
		this.items = items;
	}
	
	@Override 
	public void setCellEditor(Composite parent) {
		cellEditor = new ComboBoxCellEditor(parent, 
									items, 
									SWT.Deactivate);
	}

	@Override
	public Object getValue(KiemProperty property) {
		for (int c = 0; c < items.length; c ++) {
			if (property.getValue().equals(items[c])) return c;
		}
		return 0; //default is the first item
	}

	@Override
	public void setValue(KiemProperty element, Object value) {
		KiemProperty property = (KiemProperty)element;
		property.setValue(items[Integer.parseInt((String)value)]);
	}
	
	public void setItems(String[] items) {
		this.items = items;
	}

	@Override
	public Image getIcon() {
		return PROPERTY_CHOICE;
	}

}
