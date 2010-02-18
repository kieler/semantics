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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import de.cau.cs.kieler.krep.editors.rif.rif.Data;
import de.cau.cs.kieler.krep.editors.rif.rif.Tick;
import de.cau.cs.kieler.krep.editors.rif.rif.decl;
import de.cau.cs.kieler.sim.trace.ITick;
import de.cau.cs.kieler.sim.trace.Signal;

/**
 * @author ctr
 * 
 */
public class RifTick implements ITick {

    private Tick tick;
    private EList<decl> in, out;

    /**
     * @param outputs
     * @param inputs
     * @param theTick
     */
    public RifTick(EList<decl> inputs, EList<decl> outputs, Tick theTick) {
        this.tick = theTick;
        in = inputs;
        out = outputs;
    }

    /**
     * {@inheritDoc}
     */
    public List<Signal> getInputs() {
        LinkedList<Signal> res = new LinkedList<Signal>();
        for (int i = 0; i < tick.getInput().size(); i++) {
            int val = tick.getInput().get(i).getVal();
            if (tick.getInput().get(i).getTrue() != null)
                val = 1;
            if (tick.getInput().get(i).getFalse() != null)
                val = 0;
            res.add(new Signal(in.get(i).getName(), val));
        }
        return res;
    }

    /**
     * {@inheritDoc}
     */
    public List<Signal> getOutputs() {
        LinkedList<Signal> res = new LinkedList<Signal>();
        for (int i = 0; i < tick.getOutput().size(); i++) {
            int val = tick.getOutput().get(i).getVal();
            if (tick.getOutput().get(i).getTrue() != null)
                val = 1;
            if (tick.getOutput().get(i).getFalse() != null)
                val = 0;

            res.add(new Signal(out.get(i).getName(), val));
        }
        return res;
    }

}
