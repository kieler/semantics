package de.cau.cs.kieler.sim.kiem.data;

import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class KiemPropertyTypeString extends KiemPropertyType
									implements IKiemPropertyType {
	
	private static final long serialVersionUID = 2752993929727262411L;
	private static final Image PROPERTY_STRING = AbstractUIPlugin
	.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
			"icons/propertyStringIcon.png").createImage();

	public KiemPropertyTypeString() {
		super();
	}

	@Override
	public Object getValue(KiemProperty property) {
		return property.value;
	}

	@Override
	public void setValue(KiemProperty property, Object value) {
		property.setValue((String)value);
	}

	@Override
	public Image getIcon() {
		return PROPERTY_STRING;
	}

}
