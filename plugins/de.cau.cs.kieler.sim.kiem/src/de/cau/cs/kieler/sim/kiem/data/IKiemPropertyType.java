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

// TODO: Auto-generated Javadoc
/**
 * The Interface IKiemPropertyType.
 *
 * @author Christian Motika <cmot@informatik.uni-kiel.de>
 * 
 */
public interface IKiemPropertyType {
	
	/**
	 * Gets the value.
	 * 
	 * @param property the property
	 * 
	 * @return the value
	 */
	public Object getValue(KiemProperty property);
	
	/**
	 * Sets the value.
	 * 
	 * @param property the property
	 * @param value the value
	 */
	public void setValue(KiemProperty property, Object value);
	
}
