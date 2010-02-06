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

import de.cau.cs.kieler.krep.compiler.ceq.Variable.Kind;

/**
 * Initialize register.
 * 
 * @kieler.rating 2010-01-05 proposed yellow ctr
 * 
 * @author ctr
 */
public class InitRegInstruction extends AbstractInstruction {

    private String reg;
    private String clock;
    private String label;

    /**
     * @param r
     *            register to initialize
     * @param kind
     *            io kind of register
     * @param l
     *            label with runtime code
     * @param clk
     *            clock of the register
     */
    public InitRegInstruction(final String r, final Kind kind, final String l, final String clk) {
        this.reg = r;
        this.clock = clk;
        this.label = l;
    }

    @Override
    public String toString() {
        String res = "  SETPC";
        res += "\t" + reg;
        res += "\t" + LabelInstruction.get(label).getName();
        res += "\n";
        if (clock != null) {
            res += "  SETCLK";
            res += "\t" + reg;
            res += "\t" + clock;
        }
        return res;
    }

}
