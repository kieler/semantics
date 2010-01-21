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

/** @generated */public class Exit extends AddrInstruction {
    Label fromAddr;

    public Exit(Label toAddr, Label fromAddr, SCLine sc) {
        super(Constants.EXIT.getOpcode(), Constants.EXIT.getInfo(), toAddr, sc);
        this.fromAddr = fromAddr;
    }

    @Override
    public String encode() {
        return "" + super.encode() + fromAddr.encode();
    }

    @Override
    public String info() {
        return super.info() + " " + fromAddr.info();
    }

    @Override
    public String toString() {
        return "" + super.toString() + "-" + fromAddr.toString();
    }

    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.Instruction#length()
     */
    @Override
    public int length() {
        return super.length() + fromAddr.length();
    }
}
