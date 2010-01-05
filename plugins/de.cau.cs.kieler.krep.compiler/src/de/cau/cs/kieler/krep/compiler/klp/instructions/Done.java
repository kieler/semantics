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
package de.cau.cs.kieler.krep.compiler.klp.instructions;

/**
 * Done instruction to indicate the end of the tick.
 * 
 * @kieler.rating 2010-01-05 proposed yellow ctr
 * 
 * @author ctr
 */
public class Done extends Instruction {

    private Label label;

    /**
     * @param l
     *            label from where to start in the next tick
     */
    public Done(final Label l) {
        this.label = l;
    }

    @Override
    public String toString() {
        return "  " + "DONE" + "\t" + label.getName();
    }
}
