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
 * @author ctr uncondintional jump
 */
public class Jmp extends Instruction {

    private Label label;

    /**
     * @param l
     *            label to jump to
     */
    public Jmp(final Label l) {
        this.label = l;
    }

    @Override
    public String toString() {
        return "  " + "JMP\t" + label.getName();
    }

    /*
     * @Override public String getObj() { return writeObj(Opcode.JMP.getCode(), label.getPos(),0,0);
     * }
     */

}
