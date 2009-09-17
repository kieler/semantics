package de.cau.cs.kieler.synccharts.sim.ptolemy;

import de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

public class DataComponent extends JSONObjectDataComponent implements
		IJSONObjectDataComponent {

	public DataComponent() {
		// TODO Auto-generated constructor stub
	}

	public JSONObject step(JSONObject JSONobject) throws KiemExecutionException {
		// TODO Auto-generated method stub
		return null;
	}

	public void initialize() throws KiemInitializationException {
		// TODO Auto-generated method stub

	}

	public boolean isObserver() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isProducer() {
		// TODO Auto-generated method stub
		return true;
	}

	public void wrapup() throws KiemInitializationException {
		// TODO Auto-generated method stub

	}

}
