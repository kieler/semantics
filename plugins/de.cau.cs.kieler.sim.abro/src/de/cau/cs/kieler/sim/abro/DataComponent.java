package de.cau.cs.kieler.sim.abro;

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
	
	public DataComponent() {
		resetABO();
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
				returnObj.accumulate("state","done");
			}
			if (dA && !dB) {
				returnObj.accumulate("state","dA, wB");
			}
			if (dB && !dA) {
				returnObj.accumulate("state","wA, dB");
			}
			if (wA && wB) {
				returnObj.accumulate("state","wA, wB");
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return returnObj;
	}

	public void initialize() {
		// TODO Auto-generated method stub
		resetABO();
	}

	public boolean isConsumer() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isProducer() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public boolean needModelFile() {
		return false;
	}
	
	@Override
	public boolean isMaster() {
		return false;
	}

	@Override
	public boolean isDeltaConsumer() {
		return true;
	}
	
	@Override
	public String[] getLocalInterfaceVariables() {
		String[] signals = {"state", "A", "B", "R", "O"}; 
		return signals;
	}

}
