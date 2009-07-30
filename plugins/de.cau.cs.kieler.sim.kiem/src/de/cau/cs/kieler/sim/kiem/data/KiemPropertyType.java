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

import java.io.Serializable;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.plugin.AbstractUIPlugin;

// TODO: Auto-generated Javadoc
/**
 * The Class KiemPropertyType.
 *
 * @author Christian Motika <cmot@informatik.uni-kiel.de>
 * 
 */
public abstract class KiemPropertyType implements Serializable,
										IKiemPropertyType {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3312580956244391881L;
	
	/** The cell editor. */
	protected CellEditor cellEditor;
	
	/** The Constant PROPERTY_DEFAULT. */
	private static final Image PROPERTY_DEFAULT = AbstractUIPlugin
	.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
			"icons/propertyIcon.png").createImage();
	
	/**
	 * Instantiates a new kiem property type.
	 */
	public KiemPropertyType() {
		cellEditor = null;
	}

	//------------------------------------------------------------------------
	
	/**
	 * Provide cell editor.
	 * 
	 * @param parent the parent
	 * 
	 * @return the cell editor
	 */
	public CellEditor provideCellEditor(Composite parent) {
		return new TextCellEditor(parent);
	}

	/**
	 * Provide icon.
	 * 
	 * @return the image
	 */
	public Image provideIcon() {
		return null;
	}
	
	//------------------------------------------------------------------------

	/**
	 * Sets the cell editor.
	 * 
	 * @param parent the new cell editor
	 */
	public final void setCellEditor(Composite parent) {
		cellEditor = provideCellEditor(parent);
	}
	
	/**
	 * Gets the cell editor.
	 * 
	 * @return the cell editor
	 */
	public final CellEditor getCellEditor() {
		return cellEditor;
	}
	
	/**
	 * Gets the icon.
	 * 
	 * @return the icon
	 */
	public final Image getIcon() {
		if (provideIcon() != null) {
			return provideIcon();
		}
		return PROPERTY_DEFAULT;
	}
	
}
