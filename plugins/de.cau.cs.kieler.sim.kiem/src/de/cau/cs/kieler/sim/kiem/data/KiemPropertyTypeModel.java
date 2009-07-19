package de.cau.cs.kieler.sim.kiem.data;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class KiemPropertyTypeModel extends KiemPropertyType
									implements IKiemPropertyType {
	
	private static final Image PROPERTY_MODEL = AbstractUIPlugin
		.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
				"icons/propertyModelIcon.png").createImage();

	public KiemPropertyTypeModel() {
		super();
	}

	@Override
	public Object getValue(Object element) {
		KiemProperty property = (KiemProperty)element;
		return property.value;
	}

	@Override
	public void setValue(Object element, Object value) {
		KiemProperty property = (KiemProperty)element;
		property.setValue((String)value);
	}

	@Override
	public Image getIcon() {
		// TODO Auto-generated method stub
		return PROPERTY_MODEL;
	}

}
