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
 * @author ctr abstract superclass for all KLP assembler instructions
 */
abstract public class Instruction {

    protected String comment;

    @Override
    abstract public String toString();

    /**
     * give object code for this instruction
     * 
     * @return 4 Bytes for this instruction
     */
    // abstract public String getObj();

    /**
     * write object-code of an instruction
     * 
     * @param op
     *            operator
     * @param arg0
     * @param arg1
     * @param arg2
     * @return String representations of the four bytes of the instruction
     */
    /*
     * public static String writeObj(int op, int arg0, int arg1, int arg2){ return padByte(op) +" "
     * + padByte(arg0) + " " + padByte(arg1) + " " + padByte(arg2); }
     * 
     * private static String padByte(int b){ String res = Integer.toHexString(b);
     * if(res.length()<2){ res = "0" + res; }else if(res.length()>2){ res =
     * res.substring(res.length()-2); } return res; }
     */

    public void setComment(String c) {
        comment = c;
    }

    public String getComment() {
        if (comment == null) {
            return "";
        } else {
            return "\t# " + comment;
        }
    }

}
