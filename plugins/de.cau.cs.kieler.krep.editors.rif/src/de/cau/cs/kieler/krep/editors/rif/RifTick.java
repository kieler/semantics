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

import de.cau.cs.kieler.krep.editors.rif.rif.Data;
import de.cau.cs.kieler.krep.editors.rif.rif.Tick;
import de.cau.cs.kieler.sim.trace.ITick;
import de.cau.cs.kieler.sim.trace.Signal;

/**
 * @author ctr
 * 
 */
public class RifTick implements ITick {

    private Tick tick;

    /**
     * @param theTick
     */
    public RifTick(Tick theTick) {
        this.tick = theTick;
    }

    /**
     * {@inheritDoc}
     */
    public List<Signal> getInputs() {
        LinkedList<Signal> res = new LinkedList<Signal>();
        for(Data d: tick.getInput()){
          
        }
        return res;
    }

    /**
     * {@inheritDoc}
     */
    public List<Signal> getOutputs() {
        // TODO Auto-generated method stub
        return null;
    }

}
