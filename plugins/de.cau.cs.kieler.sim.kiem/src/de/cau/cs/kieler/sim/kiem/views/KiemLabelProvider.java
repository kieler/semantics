package de.cau.cs.kieler.sim.kiem.views;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import de.cau.cs.kieler.sim.kiem.extension.DataProducerConsumer;

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
	private static final Image CHECKED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/checked.png").createImage();
	private static final Image UNCHECKED = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/unchecked.png").createImage();
	private static final Image CHECKEDPLAIN = AbstractUIPlugin
			.imageDescriptorFromPlugin("de.cau.cs.kieler.sim.kiem",
					"icons/checkedplain.png").createImage();


	public Image getColumnImage(Object element, int columnIndex) {
		DataProducerConsumer dataProducerConsumer = (DataProducerConsumer)element;
		if (columnIndex == 0) {
			if (dataProducerConsumer.isEnabled()) {
				//enabled
				return CHECKED;
			}
			else {
				//disabled
				return UNCHECKED;
			}
		}
		else if (columnIndex == 1) {
			if (dataProducerConsumer.isProducer()) {
				//producer
				if (dataProducerConsumer.isEnabled()) {
					//enabled
					return PRODUCER_ENABLED;
				}
				else {
					//disabled
					return PRODUCER_DISABLED;
				}
			}
			else {
				//consumer
				if (dataProducerConsumer.isEnabled()) {
					//enabled
					return CONSUMER_ENABLED;
				}
				else {
					//disabled
					return CONSUMER_DISABLED;
				}
			}
		}
		else if (columnIndex == 3) {
			if (dataProducerConsumer.isJSON()) {
				//enabled
				return CHECKEDPLAIN;
			}
			else {
				//disabled
				return null;
			}
		}
		else if (columnIndex == 4) {
			if (dataProducerConsumer.isMaster()) {
				//enabled
				return CHECKEDPLAIN;
			}
			else {
				//disabled
				return null;
			}
		}
		else if (columnIndex == 5) {
			if (dataProducerConsumer.needModelFile()) {
				//enabled
				return CHECKEDPLAIN;
			}
			else {
				//disabled
				return null;
			}
		}
		return null;
	}

	public String getColumnText(Object element, int columnIndex) {
		DataProducerConsumer dataProducerConsumer = (DataProducerConsumer)element;
		switch (columnIndex) {
		case 0 :  // ENABLED_COLUMN
			return ""; 
		case 1 : // NAME_COLUMN
			return dataProducerConsumer.getName();
		case 2 : // TYPE_COLUMN
			String type = "Producer";
			if (dataProducerConsumer.isConsumer())
				type = "Consumer";
			return type;
		case 3 : // JSON_COLUMN 
			return "";
		case 4 : // MASTER_COLUMN
			return "";
		case 5 : // NEEDMODEL_COLUMN
			return "";
		default :
			throw new RuntimeException("columnIndex out of bounds (6)");
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
