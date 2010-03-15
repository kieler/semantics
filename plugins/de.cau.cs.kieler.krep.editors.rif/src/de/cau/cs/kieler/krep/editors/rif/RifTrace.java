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
package de.cau.cs.kieler.krep.editors.rif;

import java.util.HashSet;
import java.util.Set;

import de.cau.cs.kieler.krep.editors.rif.rif.Tick;
import de.cau.cs.kieler.krep.editors.rif.rif.Trace;
import de.cau.cs.kieler.krep.editors.rif.rif.decl;
import de.cau.cs.kieler.sim.trace.ITrace;

/**
 * @author ctr
 * 
 */
public class RifTrace implements ITrace {

    private Trace trace;

    private Tick current = null;

    private int pos;

    public RifTrace(final Trace t) {
        pos = 0;
        this.trace = t;
    }

    /**
     * {@inheritDoc}
     */
    public RifTick current() {
        return new RifTick(trace.getInputs(), trace.getOutputs(), current);
    }

    /**
     * {@inheritDoc}
     */
    public int getRemaining() {
        return trace.getTick().size() - pos;
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
    public RifTick next() {

        if (trace.getTick().size() > pos) {
            current = trace.getTick().get(pos);
            pos++;
            return new RifTick(trace.getInputs(), trace.getOutputs(), current);
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
        for (decl d : trace.getInputs()) {
            res.add(d.getName());
        }
        for (decl d : trace.getOutputs()) {
            res.add(d.getName());
        }
        return res;
    }
    
    /**
     * {@inheritDoc}
     */
    public Set<String> getOutputs() {
        Set<String> res = new HashSet<String>();
        for (decl d : trace.getOutputs()) {
            res.add(d.getName());
        }
        return res;
    }

    /**
     * {@inheritDoc}
     */
    public void remove() {
        // TODO implement

    }

}
