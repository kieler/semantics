/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.krep.evalbench.trace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;


import de.cau.cs.kieler.krep.evalbench.comm.Signal;
import de.cau.cs.kieler.krep.evalbench.program.IAssembler;

/**
 * A trace is a set of ticks, which contains input and output valuations.
 * 
 * @author ctr
 * 
 */
public class Trace implements Iterator<Tick> {

    /** List of ticks in this trace. */
    protected ArrayList<Tick> ticks = new ArrayList<Tick>();

    private ArrayList<Boolean> valid = new ArrayList<Boolean>();

    private int step = 0;

    /**
     *  Signal index for all signals in the trace.
     */
    protected HashMap<String, Integer> index;

    /**
     * read trace from a file.
     * 
     * @param asm
     *            the assembler program that is tested by this trace
     */
    public Trace(final IAssembler asm) {
        super();
        ticks = new ArrayList<Tick>();
        step = 0;
        valid = new ArrayList<Boolean>();
        index = asm.getSignalIndex();
    }

    /**
     * Generate new Trace from a list of ticks.
     * 
     * @param ts
     *            ticks of the trace
     */
    public Trace(final LinkedList<Tick> ts) {
        super();
        ticks = new ArrayList<Tick>(ts);
        step = 0;
        valid = new ArrayList<Boolean>();
        for (int i = 0; i < ts.size(); i++) {
            valid.add(null);
        }
        index = null;
    }

    /**
     * add signal to the last tick of the trace.
     * 
     * @param io
     *            indicate whether this is an input or output
     * @param s
     *            the additional signal
     */
    public void add(final IO io, final Signal s) {
        if (ticks.isEmpty()) {
            ticks.add(new Tick());
            valid.add(null);
        }
        Integer i = index.get(s.getName());
        if (i == null) {
            System.err.println("unkown signal:" + s.getName());
        } else {
            s.setIndex(i);
            ticks.get(ticks.size() - 1).add(io, s);
        }
    }

    /**
     * generate new Tick from scratch.
     */
    public void startTick() {
        ticks.add(new Tick());
        valid.add(null);
    }

    /**
     * Reset the trace counter to the start of the tick.
     */
    public void reset() {
        step = 0;

        valid = new ArrayList<Boolean>();
        for (Tick t : ticks) {
            t.clearOutput();
            valid.add(null);
        }
        // current = ticks.iterator();
        // notifyListeners();
    }

    /**
     * 
     * @return current number of steps
     */
    public int getPos() {
        return step;
    }

    /**
     * 
     * @return number of steps
     */
    public int size() {
        return ticks.size();
    }

    /**
     * {@inheritDoc}
     * 
     */
    public void remove() {
        // nothing to do
    }

    /**
     * 
     * @return true if the trace contains more ticks
     */
    public boolean hasNext() {
        // return current.hasNext();
        return step < ticks.size();
    }

    /**
     * 
     * @return String representation of the trace for table in Trace view
     */
    public LinkedList<String[]> getTicks() {
        LinkedList<String[]> res = new LinkedList<String[]>();
        for (int i = 0; i < ticks.size(); i++) {
            Tick tick = ticks.get(i);
            Boolean isValid = valid.get(i);
            String v = "";
            if (isValid != null) {
                Boolean.toString(isValid);
            }
            String[] t = { tick.toString(IO.INPUT), tick.toString(IO.OUTPUT),
                    tick.toString(IO.SAVED_OUTPUT), v, String.valueOf(tick.getRT()) };
            res.add(t);
        }
        return res;
        // return res.toArray(new String[0][0]);
    }

    /**
     * set the value of the output signal in the current tick.
     * 
     * @param output
     *            tick which outputs are read
     */
    public void setOutput(final Tick output) {
        int i = step - 1;
        if (i >= 0 && i < ticks.size()) {
            ticks.get(i).setOutput(output);
        }
        // notifyListeners();
    }

    /**
     * @return the current tick
     */
    public Tick getTick() {
        return ticks.get(step);

    }

    /**
     * activate the next tick.
     * 
     * @return the next tick
     */
    public final Tick next() {
        // notifyListeners();
        if (step < ticks.size()) {
            return ticks.get(step++);
        } else {
            return null;
        }
    }

    /**
     * @return true when the outputs of the current tick match the reference outputs
     */
    public boolean validateCurrent() {
        int i = step - 1;
        if (i >= 0 && i < ticks.size()) {
            boolean res = ticks.get(i).validate(ticks.get(i));
            valid.set(i, res);
            return res;
        }
        return true;
        // notifyListeners();
    }

    /**
     * check for the whole trace, that the outputs match the reference outputs.
     */
    public void validate() {
        final int delay = 0;
        for (int i = 0; i < ticks.size(); i++) {
            final int j = i - delay;
            if (j < 0) {
                valid.set(i, null);
            } else {
                valid.set(i, ticks.get(i).validate(ticks.get(j)));
            }
        }
        for (int i = ticks.size() - delay; i < ticks.size(); i++) {
            valid.set(i, null);
        }
        // notifyListeners();
    }

    /**
     * @return true, if the outputs match the reference output in all ticks
     */
    public boolean isValid() {
        for (Boolean b : valid) {
            if (b != null) {
                if (!b) {
                    return false;
                }
            }
        }
        return true;
    }

    // Misc
    @Override
    public String toString() {
        StringBuffer res = new StringBuffer();
        for (Tick tick : ticks) {
            res.append(tick.toString(IO.INPUT) + ";\n");
        }
        return res.toString();
    }

   

    /**
     * @return String to indicate minimal, average and maximal execution times
     */
    public String getWCRT() {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int avg = 0;
        for (final Tick t : ticks) {
            final int i = t.getRT();
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
            avg += i;
        }
        if (ticks.size() > 0) {
            avg = avg / ticks.size();
        }
        return "{" + min + " / " + avg + " / " + max + "}";
    }

    /**
     * save the current value of all outputs as a reference.
     */
    public void snapshot() {
        for (final Tick tick : ticks) {
            tick.snapshot();
        }

    }

    /**
     * add an additional tick to the end of the trace.
     * 
     * @param t
     *            the additional tick
     */
    public void add(final Tick t) {
        if (ticks.isEmpty()) {
            ticks.add(new Tick());
            valid.add(null);
        }
        ticks.add(t);
    }
}
