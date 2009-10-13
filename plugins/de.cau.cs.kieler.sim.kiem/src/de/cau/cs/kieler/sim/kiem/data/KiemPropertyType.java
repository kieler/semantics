/******************************************************************************
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
 ******************************************************************************/

package de.cau.cs.kieler.sim.kiem.data;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * The abstract class KiemPropertyType. This implements the basic and 
 * default behavior of a KiemPropertyType. A new KiemPropertyType must
 * extend this abstract class and may provide its own CellEditor by 
 * overriding {@link #provideCellEditor(Composite)}. It may also provide
 * its own icon Image by overriding the {@link #provideIcon()} method.
 * 
 * By default the TextCellEditor and a blank default property icon will
 * be used.
 *
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public abstract class KiemPropertyType implements  IKiemPropertyType {
	
	/** The cell editor. */
	protected CellEditor cellEditor;
	
	/** The Constant PROPERTY_DEFAULT. */
	private static final Image PROPERTY_DEFAULT = AbstractUIPlugin
	.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
			"icons/propertyIcon.png").createImage();
	
	//-------------------------------------------------------------------------

	/**
	 * Instantiates a new KiemPropertyType. The cell editor will be created 
	 * when the {@link de.cau.cs.kieler.sim.kiem.views.KiemPropertyEditing#getCellEditor}
	 * is called by the EditingSupport of the KiemView table-tree.
	 */
	public KiemPropertyType() {
		cellEditor = null;
	}

	//-------------------------------------------------------------------------
	
	/**
	 * Gets the id of the property type.
	 * 
	 * @return the id
	 */
	public  final String getId() {
		return (this.getClass().getPackage() + this.getClass().getName());
	}

	//-------------------------------------------------------------------------

	/**
	 * Provides a cell editor of this KiemPropertyType. This method may be
	 * overridden by implementing classes. By default it provides a
	 * TextCellEditor.
	 * 
	 * @param parent the parent SWT composite that holds the Cell Editor
	 * 
	 * @return the cell editor for this KiemPropertyType
	 */
	public CellEditor provideCellEditor(Composite parent) {
		return new TextCellEditor(parent);
	}

	//-------------------------------------------------------------------------

	/**
	 * Provide an icon Image for this KiemPropertyType. This method may be
	 * overridden by implementing classes. By default it provides a
	 * plain property icon.
	 * 
	 * @return the icon Image to display in the KiemView table-tree
	 */
	public Image provideIcon() {
		return null;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Sets the default cell editor. This method is called by the EditingSupport
	 * and should be left untouched. Please use the method
	 * {@link #provideCellEditor(Composite)} to provide a different than the
	 * default CellEditor.
	 * 
	 * @param parent the parent SWT composite that holds the Cell Editor
	 */
	public final void setCellEditor(Composite parent) {
		cellEditor = provideCellEditor(parent);
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Gets the CellEditor that is used for this KiemPropertyType. This method
	 * is called by the EditingSupport and should be left untouched. Please 
	 * use the method {@link #provideCellEditor(Composite)} to provide a 
	 * different than the default CellEditor.
	 * 
	 * @return the CellEditor
	 */
	public final CellEditor getCellEditor() {
		return cellEditor;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Gets the icon Image of this KiemPropertyType. This method is called by
	 * the LabelProvide and should be left untouched. Please use the method
	 * {@link #provideIcon()} to provide a different than the default 
	 * icon Image.
	 * 
	 * @return the icon Image
	 */
	public final Image getIcon() {
		if (provideIcon() != null) {
			return provideIcon();
		}
		return PROPERTY_DEFAULT;
	}
	
}
