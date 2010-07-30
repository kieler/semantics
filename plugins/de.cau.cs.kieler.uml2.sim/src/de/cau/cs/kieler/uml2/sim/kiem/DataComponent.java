package de.cau.cs.kieler.uml2.sim.kiem;

import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

public class DataComponent extends JSONObjectDataComponent implements
		IJSONObjectDataComponent {

	public DataComponent() {
		// TODO Auto-generated constructor stub
	}

	public JSONObject step(JSONObject arg0) throws KiemExecutionException {
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
