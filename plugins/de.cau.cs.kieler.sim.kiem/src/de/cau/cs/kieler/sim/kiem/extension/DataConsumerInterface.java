package de.cau.cs.kieler.sim.kiem.extension;

import de.cau.cs.kieler.sim.kiem.json.*;

public interface DataConsumerInterface  {
	
	public void ExecutionInitialize();

	public void UpdateAllData(JSONObject object);
	
	public void UpdateDeltaData(JSONObject object);
	
	public void UpdateAllData(String string);

	public void UpdateDeltaData(String string);
}
