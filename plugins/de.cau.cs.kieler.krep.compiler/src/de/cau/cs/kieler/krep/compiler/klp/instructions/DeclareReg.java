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

import de.cau.cs.kieler.krep.compiler.ceq.Variable.Kind;

public class DeclareReg extends Instruction {

    private String reg;
    private Kind kind;

    public DeclareReg(String reg, Kind kind) {
        this.reg = reg;
        this.kind = kind;
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
