package de.cau.cs.kieler.sim.kiem.data;

import org.eclipse.swt.graphics.Image;

public interface IKiemPropertyType {
	public Object getValue(Object element);
	
	public void setValue(Object element, Object value);
	
	public Image getIcon();
	
}
