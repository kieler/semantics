package de.cau.cs.kieler.xkev.extension;

import de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

public class DataOberserver extends JSONObjectDataComponent implements
		IJSONObjectDataComponent {

	public DataOberserver() {
		// TODO Auto-generated method stub
	}

	@Override
	public JSONObject step(JSONObject JSONobject) throws KiemExecutionException {
		// TODO The new JSON Data must be connected with
		// the old SVG-Graphic and updated afterwords 
		return null;//Because it's only an Observer right now
	}

	@Override
	public void initialize() throws KiemInitializationException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isObserver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isProducer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void wrapup() throws KiemInitializationException {
		// TODO Auto-generated method stub

	}

}
