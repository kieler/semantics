/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
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
 ******************************************************************************/

package de.cau.cs.kieler.sim.kiem.data;

import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class KiemPropertyTypeInt extends KiemPropertyType
									implements IKiemPropertyType {
	
	private static final long serialVersionUID = 8908596145125394334L;
	private static final Image PROPERTY_INT = AbstractUIPlugin
	.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
			"icons/propertyIntIcon.png").createImage();

	public KiemPropertyTypeInt() {
		super();
	}

	public Object getValue(KiemProperty property) {
		return property.value;
	}

	public void setValue(KiemProperty property, Object value) {
		try {
			property.setValue(""+Integer.valueOf((String)value));
		}catch(Exception e) {
		}
	}

	@Override
	public Image provideIcon() {
		return PROPERTY_INT;
	}

}
