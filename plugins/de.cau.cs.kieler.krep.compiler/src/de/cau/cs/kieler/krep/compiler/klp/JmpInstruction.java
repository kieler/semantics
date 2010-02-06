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
package de.cau.cs.kieler.krep.compiler.klp;

/**
 *  Uncondintional jump.
 *  
 * @kieler.rating 2010-02-05 yellow 
 *   review by cmot, msp, tam
 * 
 * @author ctr
 */
public class JmpInstruction extends AbstractInstruction {

    private LabelInstruction label;

    /**
     * @param l
     *            label to jump to
     */
    public JmpInstruction(final LabelInstruction l) {
        this.label = l;
    }

    @Override
    public String toString() {
        return "  " + "JMP\t" + label.getName();
    }
}
