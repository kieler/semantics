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

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import de.cau.cs.kieler.sim.esi.esi.kvpair;
import de.cau.cs.kieler.sim.esi.esi.signal;
import de.cau.cs.kieler.sim.esi.esi.tick;

/**
 * @author ctr
 * @author Sebastian Schäfer - ssc AT informatik.uni-kiel.de
 * @kieler.rating 2011-12-07 red
 * 
 */
public class EsiTick implements ITick {

    private tick tick;

    /**
     * @param t
     */
    public EsiTick(final tick t) {
        this.tick = t;
    }

    /**
     * {@inheritDoc}
     */
    public List<ISignal> getInputs() {
        LinkedList<ISignal> res = new LinkedList<ISignal>();
        for (signal s : tick.getInput()) {
            res.add(new EsiSignal(s.getName()));
        }
        return res;
    }

    /**
     * {@inheritDoc}
     */
    public List<ISignal> getOutputs() {
        LinkedList<ISignal> res = new LinkedList<ISignal>();
        for (signal s : tick.getOutput()) {
            res.add(new EsiSignal(s.getName()));
        }
        return res;
    }

    /**
     * {@inheritDoc}
     */
    public Map<String, String> getExtraInfos() {
        HashMap<String, String> retval = new HashMap<String, String>();
        for (kvpair kv : tick.getExtraInfos()) {
            retval.put(kv.getK(), kv.getVal());
        }
        
        return retval;
    }

}
