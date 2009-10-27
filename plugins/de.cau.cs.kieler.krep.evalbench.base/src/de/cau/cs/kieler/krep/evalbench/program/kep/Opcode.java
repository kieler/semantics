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

public class Opcode {

    String opcode;
    String info;

    public Opcode(String opcode, String info) {
        assert (opcode.length() == Constants.id_width) : "Opcode length is"
                + opcode.length() + "but should be" + Constants.id_width + "!";
        this.opcode = opcode;
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public String getOpcode() {
        return opcode;
    }

}
