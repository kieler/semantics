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

package de.cau.cs.kieler.sim.kiem.views;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.ui.KiemIcons;

/**
 * The Class KiemLabelProvider provides the labels for the table of
 * DataComponentExs in the KiemView.
 */
public class KiemLabelProvider implements ITableLabelProvider {

	
	/** The parent view. This is used to trigger a refresh. */
	private KiemView parent;
	
	//-------------------------------------------------------------------------
	
	/**
	 * Instantiates a new kiem label provider.
	 * 
	 * @param parent the parent view
	 */
	public KiemLabelProvider(KiemView parent) {
		super();
		this.parent = parent;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(java.lang.Object, int)
	 */
	public Image getColumnImage(Object element, int columnIndex) {
		//if property
		if (element instanceof KiemProperty) { 
			if (columnIndex == 0) {
				KiemProperty property = (KiemProperty)element;
				return property.getType().getIcon(); 
			}
			else 
				return null;
		}

		//if component
		DataComponentEx dataComponentEx = (DataComponentEx)element;
		if (columnIndex == 0) {
			if (dataComponentEx.isProducerObserver()) {
				//producer
				if (dataComponentEx.isEnabled()) {
					//enabled
					return KiemIcons.PRODUCEROBSERVER_ENABLED;
				}
				else {
					//disabled
					return KiemIcons.PRODUCEROBSERVER_DISABLED;
				}
			}
			else if (dataComponentEx.isProducer()) {
				//producer
				if (dataComponentEx.isEnabled()) {
					//enabled
					return KiemIcons.PRODUCER_ENABLED;
				}
				else {
					//disabled
					return KiemIcons.PRODUCER_DISABLED;
				}
			}
			else if (dataComponentEx.isObserver()) {
				//Observer
				if (dataComponentEx.isEnabled()) {
					//enabled
					return KiemIcons.OBSERVER_ENABLED;
				}
				else {
					//disabled
					return KiemIcons.OBSERVER_DISABLED;
				}
			}
			else {
				//Observer
				if (dataComponentEx.isEnabled()) {
					//enabled
					return KiemIcons.INITCOMPONENT_ENABLED;
				}
				else {
					//disabled
					return KiemIcons.INITCOMPONENT_DISABLED;
				}
			}
		}
		else if (columnIndex == 2) {
			if (dataComponentEx.isEnabled()) {
				//enabled
				if (parent.KIEMInstance.execution == null)
					return KiemIcons.CHECKED;
				else
					return KiemIcons.CHECKED_DISABLED;
			}
			else {
				//disabled
				if (parent.KIEMInstance.execution == null)
					return KiemIcons.UNCHECKED;
				else
					return KiemIcons.UNCHECKED_DISABLED;
			}
		}
		else if (columnIndex == 4) {
			if (dataComponentEx.isMaster()) {
				//enabled
				if (dataComponentEx.isEnabled())
					return KiemIcons.CHECKEDPLAIN_MASTER;
				else
					return KiemIcons.CHECKEDPLAIN_DISABLED;					
			}
			else {
				//disabled
				return null;
			}
		}
		return null;
	}
	
	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object, int)
	 */
	public String getColumnText(Object element, int columnIndex) {
		if (element instanceof KiemProperty) { 
			switch (columnIndex) {
			case 0 :  // NAME_COLUMN or KEY_COLUMN
				{KiemProperty kiemProperty = (KiemProperty)element;
				return kiemProperty.getKey();}
			case 1 :  // VALUE_COLUMN
				{KiemProperty kiemProperty = (KiemProperty)element;
				return kiemProperty.getValue();}
			case 2 :  // ENABLED_COLUMN
				return "";
			case 3 : // TYPE_COLUMN
				return "";
			case 4 : // MASTER_COLUMN
				return "";
			default :
				throw new RuntimeException("columnIndex out of bounds (6)");
			}
		}
		else {
			DataComponentEx dataComponentEx = (DataComponentEx)element;
			switch (columnIndex) {
			case 0 :  // NAME_COLUMN or KEY_COLUMN
				return dataComponentEx.getName();
			case 1 :  // VALUE_COLUMN
				return "";
			case 2 :  // ENABLED_COLUMN
				return "";
			case 3 : // TYPE_COLUMN
				String type = "";
				if (dataComponentEx.isProducerObserver())
					type = "Observer/Producer";
				else if (dataComponentEx.isProducer())
					type = "Producer";
				else if (dataComponentEx.isObserver())
					type = "Observer";
				else
					type = "Initializer";
				return type;
			case 4 : // MASTER_COLUMN
				return "";
			case 5 : // NEEDMODEL_COLUMN
				return "";
			default :
				throw new RuntimeException("columnIndex out of bounds (6)");
			}
		}
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 */
	public void addListener(ILabelProviderListener listener) {
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
	 */
	public void dispose() {
	}
	
	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang.Object, java.lang.String)
	 */
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	public void removeListener(ILabelProviderListener listener) {
	}

}
