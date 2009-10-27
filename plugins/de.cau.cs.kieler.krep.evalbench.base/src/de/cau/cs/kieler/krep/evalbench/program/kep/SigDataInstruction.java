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

public class SigDataInstruction extends SigInstruction {

    Data data;

    public SigDataInstruction(String id, String name, KepSignal sig, Data data,
            SCLine sc) {
        super(id, name, sig, sc);
        this.data = data;
    }

    public SigDataInstruction(String id, String name, KepSignal sig, SCLine sc) {
        super(id, name, sig, sc);
        this.data = sig.getValue();
    }

    @Override
    public String encode() {
        String res = super.encode();
        if (data != null) {
            res += data.encode();
        }
        return res;
    }

    @Override
    public String toString() {
        String res = super.toString();
        if (data != null) {
            res += ", #" + data.toString();
        }
        return res;
    }

    @Override
    public String info() {
        return super.info() + " " + data.info();
    }

    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.Instruction#length()
     */
    @Override
    public int length() {
        int res = super.length();
        if (data != null) {
            res += data.length();
        }
        return res;
    }

}
