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

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class KiemPropertyTypeBool extends KiemPropertyType
									implements IKiemPropertyType {
	
	private static final long serialVersionUID = -5476290662796694133L;
	private static final Image PROPERTY_BOOL = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/propertyBoolIcon.png").createImage();
	private static final String[] BOOL_ITEMS = {"false", "true"};

	public KiemPropertyTypeBool() {
		super();
	}
	
	@Override 
	public CellEditor provideCellEditor(Composite parent) {
		return new ComboBoxCellEditor(parent, 
									BOOL_ITEMS, 
									SWT.Deactivate);
	}

	public Object getValue(KiemProperty property) {
		if (property.getValue().equals("true")) return 1;
		else return 0;
	}

	public void setValue(KiemProperty property, Object value) {
		if (Integer.parseInt((String)value) == 0) {
			property.setValue("false");
		}
		else {
			property.setValue("true");
		}
	}

	@Override
	public Image provideIcon() {
		return PROPERTY_BOOL;
	}

}
