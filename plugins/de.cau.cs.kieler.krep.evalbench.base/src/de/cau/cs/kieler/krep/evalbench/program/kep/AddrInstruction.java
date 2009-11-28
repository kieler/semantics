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
/**
 * @generated
 * 
 */
public class AddrInstruction extends Instruction {

    Label addr;

    public AddrInstruction(String id, String name, Label addr, SCLine sc) {
        super(id, name, sc);
        this.addr = addr;
    }

    @Override
    public String encode() {
        return "" + super.encode() + addr.encode();
    }

    @Override
    public String info() {
        return super.info() + " " + addr.info();
    }

    @Override
    public String toString() {
        return super.toString() + addr.toString() + " ";
    }

    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.Instruction#length()
     */
    @Override
    public int length() {
        return super.length() + addr.length();
    }

    public Label getAddr() {
        return addr;
    }

    public void setAddr(Label addr) {
        this.addr = addr;
    }

}
