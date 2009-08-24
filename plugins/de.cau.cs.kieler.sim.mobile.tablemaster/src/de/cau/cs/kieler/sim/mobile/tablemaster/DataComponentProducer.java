package de.cau.cs.kieler.sim.mobile.tablemaster;

import de.cau.cs.kieler.sim.kiem.extension.IJSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

public class DataComponentProducer extends JSONStringDataComponent implements
		IJSONStringDataComponent {
	
	private static String dataToSend;
	
	public DataComponentProducer() {
	}
	
	public static void setDataToSend(String dataToSend) {
		if (DataComponentProducer.dataToSend != null) {
			try {
				JSONObject base = 
						new JSONObject(DataComponentProducer.dataToSend);
				JSONObject merge = new JSONObject(dataToSend);
				DataComponentProducer.dataToSend =
						 JSONMerger.mergeObjects(base, merge).toString();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
			DataComponentProducer.dataToSend = dataToSend;
		}
		System.out.println("MOBILE DATA: "+dataToSend);
	}

	public String step(String JSONString) throws KiemExecutionException {
		String dataToSendTmp = DataComponentProducer.dataToSend;
		System.out.println("MOBILE STEP: "+dataToSend);
		DataComponentProducer.dataToSend = null;
		return dataToSendTmp;
	}

	public void initialize() throws KiemInitializationException {
	}

	public boolean isObserver() {
		return false;
	}

	public boolean isProducer() {
		return true;
	}

	public void wrapup() throws KiemInitializationException {
	}

}
