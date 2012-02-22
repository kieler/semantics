/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.eso;

import java.util.HashSet;
import java.util.Set;

import de.cau.cs.kieler.sim.eso.eso.signal;
import de.cau.cs.kieler.sim.eso.eso.tick;
import de.cau.cs.kieler.sim.eso.eso.trace;

/**
 * @author ctr
 * 
 */
public class EsoTrace implements ITrace {

    private trace trace;

    private tick current = null;

    private int pos;

    public EsoTrace(trace t) {
        pos = 0;
        this.trace = t;
    }

    /**
     * {@inheritDoc}
     */
    public ITick current() {
        return new EsoTick(current);
    }
    
    /**
     * Get a specific tick
     */
    public ITick get(long index) throws IndexOutOfBoundsException {
        return new EsoTick(trace.getTicks().get((int) index));
    }
    
    /**
     * {@inheritDoc}
     */
    public int getSize() {
        return trace.getTicks().size();
    }

    /**
     * {@inheritDoc}
     */
    public int getRemaining() {
        return trace.getTicks().size() - pos;
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return getRemaining() > 0;
    }

    /**
     * {@inheritDoc}
     */
    public EsoTick next() {

        if (trace.getTicks().size() > pos) {
            current = trace.getTicks().get(pos);
            pos++;
            return new EsoTick(current);
        } else {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    public void reset() {
        pos = 0;
        current = null;
    }

    /**
     * {@inheritDoc}
     */
    public Set<String> getSignals() {
        Set<String> res = new HashSet<String>();
        for (tick t : this.trace.getTicks()) {
            for (signal s : t.getInput()) {
                res.add(s.getName());
            }
            for (signal s : t.getOutput()) {
                res.add(s.getName());
            }
        }
        return res;
    }

    /**
     * {@inheritDoc}
     */
    public Set<String> getOutputs() {
        Set<String> res = new HashSet<String>();
        for (tick t : this.trace.getTicks()) {
          
            for (signal s : t.getOutput()) {
                res.add(s.getName());
            }
        }
        return res;
    }
    
    /**
     * {@inheritDoc}
     */
    public void remove() {
        if (pos > trace.getTicks().size()) {
            trace.getTicks().remove(pos);
        }
        current = trace.getTicks().get(pos);
    }

    @Override
    public String toString() {
        StringBuffer res = new StringBuffer();
        for (tick t : trace.getTicks()) {
            for (signal s : t.getInput()) {
                res.append(s.getName() + " ");
            }
            res.append(";");
        }
        return res.toString();
    }

}
