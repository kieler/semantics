package de.cau.cs.kieler.sim.kiem.extension;

public interface JSONStringDataConsumerInterface  {
	
	public void initialize();
	
	public boolean isDeltaListener();

	public void updateData(String JSONstring);
}
