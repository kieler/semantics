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
 * Declare that a register is used. This implicitly gives the connection of the program to the
 * environment, by connecting registers and io ports.
 * 
 * @kieler.rating 2010-01-05 proposed yellow ctr
 * 
 * @author ctr
 * 
 */
public class DeclareRegInstruction extends AbstractInstruction {

    private String reg;
    private Kind kind;

    /**
     * @param r
     *            register to declare
     * @param ioKind
     *            input, output, local
     */
    public DeclareRegInstruction(final String r, final Kind ioKind) {
        this.reg = r;
        this.kind = ioKind;
    }

    @Override
    public String toString() {
        String res = "";
        switch (kind) {
        case INPUT:
            res += "  INPUT\t\t" + reg;
            break;
        case OUTPUT:
            res += "  OUTPUT\t" + reg;
            break;
        case LOCAL:
            res += "  LOCAL\t\t" + reg;
            break;
        case TEMP: // no need to initialze
            break;
        }
        return res;
    }

}
