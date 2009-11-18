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
    private int value;

    /**
     * move integer value to register.
     * 
     * @param toVar
     *            register that stores the value
     * @param val
     *            constant value to move
     */
    public IMov(final Variable toVar, final int val) {
        this.to = toVar;
        this.value = val; 
    }

    /**
     * move boolean value to register.
     * 
     * @param toVar
     *            register that stores the value
     * @param val
     *            constant value to move
     */
    public IMov(final Variable toVar, final boolean val) {
        this.to = toVar;
        this.value = val ? 1 : 0;
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
        res += "MOV\t" + to.getName() + "\t" + String.valueOf(value);

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
