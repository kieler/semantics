package de.cau.cs.kieler.sim.kiem.extension;

public interface IJSONStringDataComponent  {
	
	//one step function for a consumer and producer
	//for a producer only the argument will always be null
	//for a consumer only this method will be called asynchronous
	public String step(String JSONString);   

}
