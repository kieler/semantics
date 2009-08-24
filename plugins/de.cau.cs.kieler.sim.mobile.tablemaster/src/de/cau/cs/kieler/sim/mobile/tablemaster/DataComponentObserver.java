package de.cau.cs.kieler.sim.mobile.tablemaster;

import de.cau.cs.kieler.sim.kiem.extension.IJSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

public class DataComponentObserver extends JSONStringDataComponent implements
		IJSONStringDataComponent {

	private long currentStep;
	private	long totalSteps;
	private boolean executing;
	
	private static DataComponentObserver instance;

	public static DataComponentObserver getInstance() {
		return instance;
	}
	
	public DataComponentObserver() {
		instance = this;
	}
	
	@Override
	public void notifyStep(long currentStep, long totalSteps) {
		this.currentStep = currentStep;
		this.totalSteps = totalSteps;
	}

	public String step(String jSONString) throws KiemExecutionException {
		JSONObject object = null;
		try{
			object = new JSONObject(jSONString);
			String stepsString = currentStep+"/"+totalSteps;
			if (currentStep == totalSteps)
				stepsString = currentStep+"";
			object.accumulate("_KIEMExecutionSteps",stepsString);
		}catch(Exception e){}
		String type = "P";
		if (this.isHistoryStep()) type = "H";
		String inData = type + object.toString();
		System.out.println(inData);
		DataComponentMaster.tcpServer.println(inData);
		return null;
	}

	public void initialize() throws KiemInitializationException {
		executing = true;
		JSONObject object = new JSONObject();
		String[] interfaceKeys = this.getInterfaceKeys();
		if (interfaceKeys == null) return;
		for (int c = 0; c < interfaceKeys.length; c++) {
			try {
				object.accumulate(""+c, interfaceKeys[c]);
			}catch(Exception e) {
				throw new KiemInitializationException(
						"Cannot marshall interface keys", true, e);
			}
		}
		System.out.println("INITIALIZE: "+object.toString());
		DataComponentMaster.tcpServer.println("I"+object.toString());
	}

	public boolean isObserver() {
		return true;
	}
	
	public boolean isHistoryObserver() {
		return true;
	}

	public boolean isDeltaObserver() {
		return true;
	}

	public boolean isProducer() {
		return false;
	}

	public void wrapup() throws KiemInitializationException {
		executing = false;
	}
	
	public boolean isExecuting() {
		return executing;
	}

}
