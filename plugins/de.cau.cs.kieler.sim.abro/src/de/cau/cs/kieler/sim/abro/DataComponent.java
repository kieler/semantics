package de.cau.cs.kieler.sim.abro;

import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyList;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeChoice;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeWorkspaceFile;
import de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.json.JSONException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

public class DataComponent extends JSONObjectDataComponent implements
		IJSONObjectDataComponent {
	
	boolean wA;
	boolean wB;
	boolean dA;
	boolean dB;
	boolean done;
	String stateName;
	
	boolean paused; //demonstrate isPauseFlag() usage
	
	public DataComponent() {
	}
	
	private void resetABO() {
		wA = true;
		wB = true;
		dA = false;
		dB = false;
		done = false;
	}
	private void transition_wA_dA() {
		wA = false;
		dA = true;
	}
	private void transition_wB_dB() {
		wB = false;
		dB = true;
	}
	private void transition_done() {
		dB = false;
		dA = false;
		done = true;
		paused = true;
	}
	
	public JSONObject step(JSONObject JSONobject) {
//System.out.println("ABRO received: "+ JSONobject.toString());
		JSONObject returnObj = new JSONObject();
		try{
			if (JSONobject.has("R")) {
				resetABO();
			}
			else {
				if (wA && JSONobject.has("A")) {
					transition_wA_dA();
				}
				if (wB && JSONobject.has("B")) {
					transition_wB_dB();
				}
				if (dA && dB) {
					transition_done();
					returnObj.accumulate("O","");
				}
			}
			if (done) {
				returnObj.accumulate(stateName,"done");
			}
			if (dA && !dB) {
				returnObj.accumulate(stateName,"dA, wB");
			}
			if (dB && !dA) {
				returnObj.accumulate(stateName,"wA, dB");
			}
			if (wA && wB) {
				returnObj.accumulate(stateName,"wA, wB");
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return returnObj;
	}

	//--------------------------------------------------------------------------
	//additional methods
	
	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		stateName = getProperties()[0].getValue();
		System.out.println("ABRO in Java in Kieler IN ACTION :-) initialize");
		resetABO();
		paused = false;
	}

	@Override
	public void wrapup() {
	}
	
	public boolean isObserver() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isProducer() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public boolean isModelFileNeeded() {
		return false;
	}
	
	@Override
	public boolean isMaster() {
		return false;
	}

	@Override
	public boolean isPauseFlag() {
		return false;
	}
	
	@Override
	public void commandPause() {
		paused = false;
	}

	@Override
	public String[] getLocalInterfaceVariables() {
		String[] signals = {getProperties()[0].getValue(), "A", "B", "R", "O"}; 
		return signals;
	}
	
	@Override
	public boolean isMultiInstantiable() {
		return true;
	}

	@Override
	public KiemProperty[] initializeProperties() {
		KiemProperty[] properties = new KiemProperty[6];
		properties[0] = new KiemProperty(
				"state name",
				"state");
		properties[1] = new KiemProperty(
				"some bool",
				true);
		properties[2] = new KiemProperty(
				"an integer",
				2);
		properties[3] = new KiemProperty(
				"a file",
				new KiemPropertyTypeFile(),
				"c:/nothing.txt");
		String[] items = {"trace 1","trace 2", "trace 3", "trace 4"};
		properties[4] = new KiemProperty(
				"a choice",
				new KiemPropertyTypeChoice(items),
				items[2]);
		properties[5] = new KiemProperty(
				"workspace file",
				new KiemPropertyTypeWorkspaceFile(),
				"/nothing.txt");
		return properties;
	}	
	
}
