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
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * The Class KiemPropertyTypeFile. This implements a sample KiemPropertyType that
 * uses a standard SWT dialog to browse for a file.
 *
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public class KiemPropertyTypeFile extends KiemPropertyType
									implements IKiemPropertyType {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7428611730135550207L;


	/** The Constant PROPERTY_FILE. */
	private static final Image PROPERTY_FILE = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/propertyFileIcon.png").createImage();

	
	/** The Constant DEFAULT_FILTER_NAMES. */
	private static final String[] DEFAULT_FILTER_NAMES = {"All Files (*.*)"};
	
	/** The Constant DEFAULT_FILTER_EXTS. */
	private static final String[] DEFAULT_FILTER_EXTS = {"*.*"};
	
	/** The filter extension names. */
	private String[] filterNames;
	
	/** The filter extensions. */
	private String[] filterExts;
	
	//-------------------------------------------------------------------------

	/**
	 * Instantiates a new KiemPropertyType file.
	 */
	public KiemPropertyTypeFile() {
		super();
		this.filterNames = DEFAULT_FILTER_NAMES;
		this.filterExts = DEFAULT_FILTER_EXTS;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.data.IKiemPropertyType#getValue(de.cau.cs.kieler.sim.kiem.data.KiemProperty)
	 */
	public Object getValue(KiemProperty property) {
		return property.value;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.data.IKiemPropertyType#setValue(de.cau.cs.kieler.sim.kiem.data.KiemProperty, java.lang.Object)
	 */
	public void setValue(KiemProperty property, Object value) {
		if (value != null)
			property.setValue((String)value);
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.data.KiemPropertyType#provideIcon()
	 */
	@Override
	public Image provideIcon() {
		return PROPERTY_FILE;
	}
	
	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.data.KiemPropertyType#provideCellEditor(org.eclipse.swt.widgets.Composite)
	 */
	@Override 
	public CellEditor provideCellEditor(Composite parent) {
		return new CustomDialogCellEditor(parent);
	}

	//-------------------------------------------------------------------------

	/**
	 * Sets the filter extension names.
	 * 
	 * @param filterNames the new filter names
	 */
	public void setFilterNames(String[] filterNames) {
		this.filterNames = filterNames;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Gets the filter extension names.
	 * 
	 * @return the filter names
	 */
	public String[] getFilterNames() {
		return this.filterNames;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Sets the filter extensions.
	 * 
	 * @param filterExts the new filter extensions 
	 */
	public void setFilterExts(String[] filterExts) {
		this.filterExts = filterExts;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Gets the filter extensions.
	 * 
	 * @return the filter extensions
	 */
	public String[] getFilterExts() {
		return this.filterExts;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * The Class CustomDialogCellEditor.
	 */
	public class CustomDialogCellEditor extends DialogCellEditor {
		
    	//---------------------------------------------------------------------

		/**
    	 * Instantiates a new custom dialog cell editor.
    	 * 
    	 * @param parent the parent
    	 */
    	public CustomDialogCellEditor(Composite parent) {
	        super(parent);
	    }
    	
    	//---------------------------------------------------------------------

		/* (non-Javadoc)
		 * @see org.eclipse.jface.viewers.DialogCellEditor#openDialogBox(org.eclipse.swt.widgets.Control)
		 */
		@Override
		protected Object openDialogBox(Control cellEditorWindow) {
				
			FileDialog dlg = new FileDialog(cellEditorWindow.getShell(), SWT.SINGLE);
			dlg.setOverwrite(true);
			String fn = dlg.open();
			if (fn != null) {
				return dlg.getFilterPath().toString()+
				System.getProperty("file.separator") + 
				dlg.getFileName().toString();
			}
			return null;
		}
		
	}

}
