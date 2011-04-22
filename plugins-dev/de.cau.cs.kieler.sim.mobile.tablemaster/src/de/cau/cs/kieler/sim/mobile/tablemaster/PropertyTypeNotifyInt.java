/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
 */

package de.cau.cs.kieler.sim.mobile.tablemaster;

import de.cau.cs.kieler.sim.kiem.data.IKiemPropertyType;
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyType;

/**
 * The Class KiemPropertyTypeInt. This implements a sample KiemPropertyType for
 * a specialized version of an integer type that notifies the 
 * DataComponentMaster upon a change.
 *
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public class PropertyTypeNotifyInt extends KiemPropertyType
									implements IKiemPropertyType {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8908596145125394334L;
	
	//-------------------------------------------------------------------------

	/**
	 * Instantiates a new KiemPropertyType int.
	 */
	public PropertyTypeNotifyInt() {
		super();
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.data.IKiemPropertyType#getValue(de.cau.cs.kieler.sim.kiem.data.KiemProperty)
	 */
	public Object getValue(KiemProperty property) {
		return property.getValue();
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.data.IKiemPropertyType#setValue(de.cau.cs.kieler.sim.kiem.data.KiemProperty, java.lang.Object)
	 */
	public void setValue(KiemProperty property, Object value) {
		try {
			if (Integer.valueOf((String)value) < 0) return;
			if (Integer.valueOf((String)value) > 10000) return;
			//notify the DataComponentMaster so that the listening port
			//can be adapted
			DataComponentMaster.setPort(Integer.valueOf((String)value));
			property.setValue(""+Integer.valueOf((String)value));
		}catch(Exception e) {
		}
	}

}
