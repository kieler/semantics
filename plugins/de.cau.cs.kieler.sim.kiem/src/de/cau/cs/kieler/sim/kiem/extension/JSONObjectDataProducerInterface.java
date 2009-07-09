package de.cau.cs.kieler.sim.kiem.extension;

import de.cau.cs.kieler.sim.kiem.json.*;

public interface JSONObjectDataProducerInterface  {
	
	public void initialize();

	public JSONObject step();

	public void reset();

}
