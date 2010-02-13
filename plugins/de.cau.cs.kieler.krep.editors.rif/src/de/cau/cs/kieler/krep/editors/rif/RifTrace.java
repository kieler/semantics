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


import de.cau.cs.kieler.krep.editors.rif.rif.Tick;
import de.cau.cs.kieler.krep.editors.rif.rif.Trace;
import de.cau.cs.kieler.sim.esi.esi.tick;
import de.cau.cs.kieler.sim.esi.trace.ITrace;

/**
 * @author ctr
 * 
 */
public class RifTrace implements ITrace {

    private Trace trace;

    private Tick current = null;

    private int pos;

    public RifTrace(Trace t) {
        pos = 0;
        this.trace = t;
    }

    /**
     * {@inheritDoc}
     */
    public tick current() {
        return null;
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
    public tick next() {

        if (trace.getTick().size() > pos) {
            current = trace.getTick().get(pos);
            pos++;
            return null;
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

}

