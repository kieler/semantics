package de.cau.cs.kieler.sim.kiem.extension;

public interface JSONStringDataConsumerInterface  {
	
	public void executionInitialize();
	
	public boolean isDeltaListener();

	public void updateData(String JSONstring);
}
