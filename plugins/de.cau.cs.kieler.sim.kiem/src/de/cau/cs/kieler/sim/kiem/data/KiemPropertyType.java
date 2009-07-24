/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
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

public abstract class KiemPropertyType implements Serializable,
										IKiemPropertyType {
	private static final long serialVersionUID = 3312580956244391881L;
	protected CellEditor cellEditor;
	
	private static final Image PROPERTY_DEFAULT = AbstractUIPlugin
	.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
			"icons/propertyIcon.png").createImage();
	
	public KiemPropertyType() {
		cellEditor = null;
	}

	//------------------------------------------------------------------------
	
	public CellEditor provideCellEditor(Composite parent) {
		return new TextCellEditor(parent);
	}

	public Image provideIcon() {
		return null;
	}
	
	//------------------------------------------------------------------------

	public final void setCellEditor(Composite parent) {
		cellEditor = provideCellEditor(parent);
	}
	
	public final CellEditor getCellEditor() {
		return cellEditor;
	}
	
	public final Image getIcon() {
		if (provideIcon() != null) {
			return provideIcon();
		}
		return PROPERTY_DEFAULT;
	}
	
}
