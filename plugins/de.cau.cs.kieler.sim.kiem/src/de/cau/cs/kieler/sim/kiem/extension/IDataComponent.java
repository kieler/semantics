package de.cau.cs.kieler.sim.kiem.extension;

import de.cau.cs.kieler.sim.kiem.data.KiemProperty;

public interface IDataComponent {

	//initialize prior execution
	public void initialize();

	//DataComponent is a producer and returns != null in step method
	public boolean isProducer();

	//DataComponent is a Observer and needs a parameter != null in step method
	public boolean isObserver();

}
