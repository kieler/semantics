package de.cau.cs.kieler.sim.kiem.extension;

import de.cau.cs.kieler.sim.kiem.json.*;

public interface JSONObjectDataConsumerInterface  {
	
	public void executionInitialize();
	
	public boolean isDeltaListener();

	public void updateData(JSONObject JSONobject);

}
