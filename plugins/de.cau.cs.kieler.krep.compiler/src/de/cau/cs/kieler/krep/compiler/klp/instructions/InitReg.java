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

public class InitReg extends Instruction {

    private String reg;
    private String clock;
    private String label;

    public InitReg(String reg, Kind kind, String label, String clock) {
        this.reg = reg;
        this.clock = clock;
        this.label = label;
    }

    @Override
    public String toString() {
        String res = "  SETPC";
        res += "\t" + reg;
        res += "\t" + Label.get(label).getName();
        res += "\n";
        if (clock != null) {
            res += "  SETCLK";
            res += "\t" + reg;
            res += "\t" + clock;
        }
        return res;
    }

}
