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
package de.cau.cs.kieler.sim.esi;

import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.sim.esi.esi.signal;
import de.cau.cs.kieler.sim.esi.esi.tick;
import de.cau.cs.kieler.sim.trace.ITick;
import de.cau.cs.kieler.sim.trace.Signal;

/**
 * @author ctr
 * 
 */
public class EsiTick implements ITick {

    private tick tick;

    /**
     * @param current
     */
    public EsiTick(final tick t) {
        this.tick = t;
    }

    /**
     * {@inheritDoc}
     */
    public List<Signal> getInputs() {
        LinkedList<Signal> res = new LinkedList<Signal>();
        for (signal s : tick.getInput()) {
            res.add(new Signal(s.getName()));
        }
        return res;
    }

    /**
     * {@inheritDoc}
     */
    public List<Signal> getOutputs() {
        LinkedList<Signal> res = new LinkedList<Signal>();
        for (signal s : tick.getOutput()) {
            res.add(new Signal(s.getName()));
        }
        return res;
    }

}
