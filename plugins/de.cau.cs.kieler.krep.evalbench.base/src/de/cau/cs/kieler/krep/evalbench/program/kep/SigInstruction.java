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

public class SigInstruction extends Instruction {

    KepSignal sig;

    public SigInstruction(String id, String name, KepSignal sig, SCLine sc) {
        super(id, name, sc);
        this.sig = sig;
    }

    @Override
    public String encode() {
        return "" + super.encode() + sig.encode();
    }

    @Override
    public String info() {
        return super.info() + " " + sig.info();
    }

    @Override
    public String toString() {
        return super.toString() + " " + sig.toString();
    }

    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.Instruction#length()
     */
    @Override
    public int length() {
        return super.length() + sig.length();
    }

    public KepSignal getSig() {
        return sig;
    }

}
