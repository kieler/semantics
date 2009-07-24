package de.cau.cs.kieler.sim.kiem.data;

import org.eclipse.swt.graphics.Image;

public interface IKiemPropertyType {
	
	public Object getValue(KiemProperty property);
	
	public void setValue(KiemProperty property, Object value);
	
}
