package de.cau.cs.kieler.kico.internal;

import java.util.ArrayList;
import java.util.List;


/**
 * Class for time measurement handling in the Kieler compiler context.
 * 
 * @author ssm
 * @kieler.design 2015-06-22 proposed
 * @kieler.rating 2015-06-22 proposed yellow
 * 
 */
public class Timing {
	
	/** Start value */
 	protected long startStamp;
 	
 	/** List of intermediate elapsed time results */
   	private List<Long> timings =  new ArrayList<Long>();
    	
   	/** Constructor */
   	public Timing() {
   		reset();
   	}
    
   	/**
   	 * Resets the timing.
   	 */
   	public void reset() {
   		timings.clear();
   		startStamp = System.nanoTime();
   		timings.add(startStamp);
   	}
    	
   	/** 
   	 * Returns the elapsed time.
   	 * 
   	 * @return The elapsed time
   	 */
   	public long elapsed() {
   		return System.nanoTime() - startStamp;
   	}
    
   	/**
   	 * Returns the elapsed time and stores the value in the list.
   	 * 
   	 * @return The elapsed time
   	 */
   	public long save() {
   		long result = elapsed();
   		timings.add(result);
   		return result;
   	}
    	
   	/**
   	 * Returns the list of timings.
   	 * 
   	 * @return List of timings
   	 */
   	public List<Long> getTimings() {
   		return timings;
   	}
    	
}
