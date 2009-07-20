package de.cau.cs.kieler.sim.kiem.views;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.ui.KiemIcons;

public class KiemLabelProvider implements ITableLabelProvider {

	
	private KiemView parent;
	
	public KiemLabelProvider(KiemView parent) {
		super();
		this.parent = parent;
	}

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
				if (parent.KIEM.execution == null)
					return KiemIcons.CHECKED;
				else
					return KiemIcons.CHECKED_DISABLED;
			}
			else {
				//disabled
				if (parent.KIEM.execution == null)
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
		else if (columnIndex == 5) {
			if (dataComponentEx.isModelFileNeeded()) {
				//enabled
				if (dataComponentEx.isEnabled()) {
					if (dataComponentEx.isMaster())
						return KiemIcons.CHECKEDPLAIN_MASTER;
					else
						return KiemIcons.CHECKEDPLAIN;
				}
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
			case 5 : // NEEDMODEL_COLUMN
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

	public void addListener(ILabelProviderListener listener) {
	}

	public void dispose() {
	}

	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	public void removeListener(ILabelProviderListener listener) {
	}

}
