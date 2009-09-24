package de.cau.cs.kieler.krep.evalbench.comm;

import java.util.LinkedList;

/**
 * Listener for signal events which occur when a program
 * tick is performed.
 * 
 * @author msp
 */
public interface ISignalListener {
	
	/**
	 * Executed when a program tick is performed.
	 * 
	 * @param inputs global input signal status
	 * @param outputs global output signal status
	 */
	public void tickPerformed(LinkedList<Signal> inputs, LinkedList<Signal> outputs);
	
}
