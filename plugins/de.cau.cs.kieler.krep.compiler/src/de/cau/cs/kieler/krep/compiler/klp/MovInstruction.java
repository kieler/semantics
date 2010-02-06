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

import de.cau.cs.kieler.krep.compiler.ceq.Variable;

/**
 * Copy register value to another register.
 * 
 * @kieler.rating 2010-01-05 proposed yellow ctr
 * 
 * @author ctr 
 */
public class MovInstruction extends AbstractInstruction {

    private Variable to;
    private RegAccess from;

    /**
     * @param toReg
     *            target register
     * @param fromReg
     *            source register
     */
    public MovInstruction(final Variable toReg, final RegAccess fromReg) {
        this.to = toReg;
        this.from = fromReg; // new Read(Register.get(v.toString()), pre);
    }

    @Override
    public String toString() {
        String res = "  ";
        switch (from.getType()) {
        case BOOL:
            res += "C";
            break;
        case INT:
            res += "V";
            break;
        case REAL:
            break;
        }
        switch (to.getType()) {
        case BOOL:
            res += "C";
            break;
        case INT:
            res += "V";
            break;
        case REAL:
            break;
        }
        res += "MOV\t" + to.getName() + "\t" + from.toString();
        return res;
    }

    /*
     * @Override public String getObj() { int op=-1; switch(to.getType()){ case BOOL:
     * switch(from.getType()){ case BOOL: op = Opcode.CCMOV.getCode(); break; case INT: op =
     * Opcode.BOOL.getCode(); break; case REAL: op = -1; break; } break; case INT:
     * switch(from.getType()){ case BOOL: op = Opcode.INT.getCode(); break; case INT: op =
     * Opcode.VVMOV.getCode(); break; case REAL: op = -1; break; } break; case REAL: op = -1; }
     * return writeObj(op, 2*to.getId(), from.getId(), 0); }
     */

}
