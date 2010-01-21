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
package de.cau.cs.kieler.krep.evalbench.program.kep;

/** @generated */public class SigRegInst extends SigInstruction {

    Register reg;

    public SigRegInst(String id, String name, Register reg, KepSignal sig,
            SCLine sc) {
        super(id, name, sig, sc);
        this.reg = reg;
    }

    public SigRegInst(String id, String name, KepSignal sig, SCLine sc) {
        super(id, name, sig, sc);
        this.reg = sig.getReg();
    }

    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.RegisterInst#encode()
     */
    @Override
    public String encode() {
        return super.encode() + reg.encode();
    }

    @Override
    public String toString() {
        return "" + super.toString() + reg.toString() + "_";
    }

    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.RegisterInst#info()
     */
    @Override
    public String info() {
        return super.info() + " " + reg.info();
    }

    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.RegisterInst#length()
     */
    @Override
    public int length() {
        return super.length() + reg.length();
    }

}
