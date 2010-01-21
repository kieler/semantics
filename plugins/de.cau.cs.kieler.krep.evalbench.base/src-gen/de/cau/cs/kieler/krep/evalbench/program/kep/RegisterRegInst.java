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

/** @generated */public class RegisterRegInst extends RegisterInst {

    Register source;

    public RegisterRegInst(String id, String name, Register target,
            Register source, SCLine sc) {
        super(id, name, target, sc);
        this.source = source;
    }

    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.RegisterExp#info()
     */
    @Override
    public String info() {
        return super.info() + " " + source.info();
    }

    @Override
    public String toString() {
        return "" + super.toString() + "-" + source.toString();
    }

    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.RegisterExp#length()
     */
    @Override
    public int length() {
        return super.length() + source.length();
    }

    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.RegisterExp#encode()
     */
    @Override
    public String encode() {
        return super.encode() + source.encode();
    }

}
