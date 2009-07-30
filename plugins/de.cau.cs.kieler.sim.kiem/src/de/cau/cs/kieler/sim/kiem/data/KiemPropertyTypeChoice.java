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

// TODO: Auto-generated Javadoc
/**
 * The Class KiemPropertyTypeChoice.
 *
 * @author Christian Motika <cmot@informatik.uni-kiel.de>
 * 
 */
public class KiemPropertyTypeChoice extends KiemPropertyType
									implements IKiemPropertyType {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 922994563762566959L;

	/** The Constant PROPERTY_CHOICE. */
	private static final Image PROPERTY_CHOICE = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/propertyChoiceIcon.png").createImage();
	
	/** The items. */
	private String[] items;

	/**
	 * Instantiates a new kiem property type choice.
	 * 
	 * @param items the items
	 */
	public KiemPropertyTypeChoice(String[] items) {
		super();
		this.items = items;
	}
	
	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.data.KiemPropertyType#provideCellEditor(org.eclipse.swt.widgets.Composite)
	 */
	@Override 
	public CellEditor provideCellEditor(Composite parent) {
		return new ComboBoxCellEditor(parent, 
									items, 
									SWT.Deactivate);
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.data.IKiemPropertyType#getValue(de.cau.cs.kieler.sim.kiem.data.KiemProperty)
	 */
	public Object getValue(KiemProperty property) {
		for (int c = 0; c < items.length; c ++) {
			if (property.getValue().equals(items[c])) return c;
		}
		return 0; //default is the first item
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.data.IKiemPropertyType#setValue(de.cau.cs.kieler.sim.kiem.data.KiemProperty, java.lang.Object)
	 */
	public void setValue(KiemProperty element, Object value) {
		KiemProperty property = (KiemProperty)element;
		property.setValue(items[Integer.parseInt((String)value)]);
	}
	
	/**
	 * Sets the items.
	 * 
	 * @param items the new items
	 */
	public void setItems(String[] items) {
		this.items = items;
	}

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.data.KiemPropertyType#provideIcon()
	 */
	@Override
	public Image provideIcon() {
		return PROPERTY_CHOICE;
	}

}
