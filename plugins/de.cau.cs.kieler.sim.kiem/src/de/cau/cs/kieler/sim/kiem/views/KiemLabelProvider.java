package de.cau.cs.kieler.sim.kiem.views;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;
import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.extension.DataComponent;

public class KiemLabelProvider implements ITableLabelProvider {

	// define icons
	private static final Image PRODUCER_ENABLED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/producer.png").createImage();
	private static final Image PRODUCER_DISABLED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/producerDisabled.png").createImage();
	private static final Image CONSUMER_ENABLED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/consumer.png").createImage();
	private static final Image CONSUMER_DISABLED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/consumerDisabled.png").createImage();
	private static final Image PRODUCERCONSUMER_ENABLED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/producerConsumer.png").createImage();
	private static final Image PRODUCERCONSUMER_DISABLED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/producerConsumerDisabled.png").createImage();
	private static final Image INITCOMPONENT_ENABLED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/initComponent.png").createImage();
private static final Image INITCOMPONENT_DISABLED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/initComponentDisabled.png").createImage();

	
	private static final Image CHECKED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/checked.png").createImage();
	private static final Image CHECKED_DISABLED = AbstractUIPlugin
				.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/checkedDisabled.png").createImage();
	private static final Image UNCHECKED = AbstractUIPlugin
				.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/unchecked.png").createImage();
	private static final Image UNCHECKED_DISABLED = AbstractUIPlugin
				.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/uncheckedDisabled.png").createImage();
	private static final Image CHECKEDPLAIN = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/checkedplain.png").createImage();
	private static final Image CHECKEDPLAIN_DISABLED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/checkedplainDisabled.png").createImage();
	private static final Image CHECKEDPLAIN_MASTER = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/checkedplainMaster.png").createImage();

	private static final Image FOLDED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
				"icons/fold.png").createImage();
	private static final Image FOLDED_DISABLED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
				"icons/foldDisabled.png").createImage();
	private static final Image UNFOLDED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
				"icons/unfold.png").createImage();
	private static final Image UNFOLDED_DISABLED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
				"icons/unfoldDisabled.png").createImage();

	
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
			if (dataComponentEx.isProducerConsumer()) {
				//producer
				if (dataComponentEx.isEnabled()) {
					//enabled
					return PRODUCERCONSUMER_ENABLED;
				}
				else {
					//disabled
					return PRODUCERCONSUMER_DISABLED;
				}
			}
			else if (dataComponentEx.isProducer()) {
				//producer
				if (dataComponentEx.isEnabled()) {
					//enabled
					return PRODUCER_ENABLED;
				}
				else {
					//disabled
					return PRODUCER_DISABLED;
				}
			}
			else if (dataComponentEx.isConsumer()) {
				//consumer
				if (dataComponentEx.isEnabled()) {
					//enabled
					return CONSUMER_ENABLED;
				}
				else {
					//disabled
					return CONSUMER_DISABLED;
				}
			}
			else {
				//consumer
				if (dataComponentEx.isEnabled()) {
					//enabled
					return INITCOMPONENT_ENABLED;
				}
				else {
					//disabled
					return INITCOMPONENT_DISABLED;
				}
			}
		}
		else if (columnIndex == 2) {
			if (dataComponentEx.isEnabled()) {
				//enabled
				if (parent.KIEM.execution == null)
					return CHECKED;
				else
					return CHECKED_DISABLED;
			}
			else {
				//disabled
				if (parent.KIEM.execution == null)
					return UNCHECKED;
				else
					return UNCHECKED_DISABLED;
			}
		}
		else if (columnIndex == 4) {
			if (dataComponentEx.isMaster()) {
				//enabled
				if (dataComponentEx.isEnabled())
					return CHECKEDPLAIN_MASTER;
				else
					return CHECKEDPLAIN_DISABLED;					
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
						return CHECKEDPLAIN_MASTER;
					else
						return CHECKEDPLAIN;
				}
				else
					return CHECKEDPLAIN_DISABLED;					
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
				if (dataComponentEx.isProducerConsumer())
					type = "Consumer/Producer";
				else if (dataComponentEx.isProducer())
					type = "Producer";
				else if (dataComponentEx.isConsumer())
					type = "Consumer";
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
		// TODO Auto-generated method stub

	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

}
