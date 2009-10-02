package de.cau.cs.kieler.krep.evalbench.trace;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import de.cau.cs.kieler.krep.evalbench.comm.Signal;


/**
 * One tick in a trace. contains input and output signals with their values, as
 * well as output signals that were saved at a given time.
 * 
 * @author ctr
 * 
 */

public class Tick {
    private LinkedList<Signal> inputs = new LinkedList<Signal>();

    private LinkedList<Signal> outputs = new LinkedList<Signal>();

    private LinkedList<Signal> saved_outputs = new LinkedList<Signal>();

    private int rt=0;
    
    /**
     * generate empty tick
     */
    public Tick() {
	super();
    }

    /**
     * copy tick contents
     * 
     * @param t
     *            tick to copy
     */
    public Tick(Tick t) {
	super();
	for (Signal s : t.inputs) {
	    inputs.add(new Signal(s));
	}
	for (Signal s : t.outputs) {
	    outputs.add(new Signal(s));
	}
	for (Signal s : t.saved_outputs) {
	    saved_outputs.add(new Signal(s));
	}
	this.rt = t.rt;
    }

    /**
     * Generate tick
     * 
     * @param inputs
     *            list of input signals with their values
     * @param outputs
     *            list of output signals with their values
     */
    public Tick(LinkedList<Signal> inputs, LinkedList<Signal> outputs) {
	this.inputs = inputs;
	this.outputs = outputs;
    }

    /**
     * Add additional signal to a tick
     * 
     * @param io
     *            indicates what kind of signal this is
     * @param s
     *            the signal
     */
    public void add(final IO io, final Signal s) {
	switch (io) {
	case INPUT:
	    inputs.add(s);
	    break;
	case OUTPUT:
	    outputs.add(s);
	    break;
	case SAVED_OUTPUT:
	    saved_outputs.add(s);
	    break;
	}
    }

    /**
     * print part of the tick
     * 
     * @param io
     *            indicate whether input, output or reference outputs are
     *            printed
     * @return
     *		  String representation
     */
    public String toString(final IO io) {
	String res = "";
	LinkedList<Signal> sigs = null;
	switch (io) {
	case INPUT:
	    sigs = inputs;
	    break;
	case OUTPUT:
	    sigs = outputs;
	    break;
	case SAVED_OUTPUT:
	    sigs = saved_outputs;
	    break;
	}
	for (Signal s : sigs) {
	    if (s != null && s.getPresent()) {
		res += s.toString() + " ";
	    }
	}
	return res;
    }

    /**
     * @return input signals 
     */
    public LinkedList<Signal> getInputs() {
	return inputs;
    }

    /**
     * @return output signals
     */
    public LinkedList<Signal> getOutputs() {
	return outputs;
    }

    /**
     * save the current status of all outputs
     */

    public void snapshot() {
	saved_outputs = new LinkedList<Signal>();
	for (Signal s : outputs) {
	    saved_outputs.add(new Signal(s));
	    s.setPresent(false);
	    if (s.isValued()) {
		s.setValue(0);
	    }
	}
	Collections.sort(saved_outputs);
	outputs.clear();
    }

    /**
     * test whether the current output is equal to the last snapshot of tick t
     * 
     * @param tick
     *            tick that contains the snapshot
     * @return true when they are the same
     */
    public boolean validate(Tick tick) {
	if (outputs.size() != tick.saved_outputs.size()) {
	    return false;
	}
	Iterator<Signal> i = outputs.iterator();
	Iterator<Signal> j = tick.saved_outputs.iterator();

	while (i.hasNext()) {
	    Signal r = i.next();
	    Signal s = j.next();

	    if (!s.getName().equals(r.getName())){
		return false;
	    }
	    if(s.isValued() && r.isValued()){
		if (!s.getValue().equals(r.getValue())) {
		    return false;
		}
	    }
	}
	return true;
    }

    /**
     * copy all outputs from Tick t 
     * @param t 
     */
    public void setOutput(Tick t) {
	if(t!=null){
	outputs = new LinkedList<Signal>();
	for (Signal s : t.outputs) {
	    outputs.add(new Signal(s));
	}
	Collections.sort(outputs);
	rt = t.rt;
	}
    }
    
    /**
     * return the reaction time to compute this tick
     * @param rt reaction time
     */
    public void setRT(int rt){
	this.rt = rt;
    }
    
    /**
     * @return reacion time to compute the tick
     */
    public int getRT(){
	  return rt;
    }

    /**
     * restores the initial state by removing all output signals
     */
    public void clearOutput() {
	outputs.clear();
    }

}
