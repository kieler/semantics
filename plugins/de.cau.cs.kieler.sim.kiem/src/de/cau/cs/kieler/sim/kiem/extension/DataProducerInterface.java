package de.cau.cs.kieler.sim.kiem.extension;

public interface DataProducerInterface  {
	
	public void ExecutionInitialize(String ModelFile);

	public void ExecutionStep();

	public void ExecutionPlay();

	public void ExecutionStop();

	public void ExecutionPause();

}
