package de.cau.cs.kieler.krep.evalbench.trace;

/**
 * @author ctr
 * Interface for listeners that are notified when he current trace is changed
 */
public interface ITraceListener {
   
	/**
	 * the current trace has changed
	 * @param newTrace true if the table has changed, false if only the current index changed
	 */
	public void traceChanged(boolean newTrace);
	

}
