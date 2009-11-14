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

import de.cau.cs.kieler.krep.compiler.ceq.Variable;

/**
 * @author ctr immediate move
 */
public class IMov extends Instruction {

    private Variable to;
    // private Type type;
    private int val;

    /**
     * move integer value to register
     * 
     * @param to
     *            register that stores the value
     * @param val
     *            constant value to move
     */
    public IMov(Variable to, int val) {
        this.to = to;
        this.val = val; // new Read(Register.get(v.toString()), pre);
        // this.type=Type.INT;
    }

    /**
     * move boolean value to register
     * 
     * @param to
     *            register that stores the value
     * @param val
     *            constant value to move
     */
    public IMov(Variable to, boolean val) {
        this.to = to;
        this.val = val ? 1 : 0; // new Read(Register.get(v.toString()), pre);
        // this.type=Type.BOOL;
    }

    @Override
    public String toString() {
        String res = "  I";
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
        res += "MOV\t" + to.getName() + "\t" + String.valueOf(val);

        return res;
    }

    // @Override
    // public String getObj() {
    // int op;
    // if(to.getType()==Type.BOOL){
    // op=Opcode.ICMOV.getCode();
    // }else{
    // op=Opcode.IVMOV.getCode();
    // }
    // return writeObj(op, 2*to.getId(), val, 0);
    // }

}
