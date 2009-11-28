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

/** @generated */public class Watcher extends Identifer {

    public Watcher(int ident) {

        if (ident > Constants.max_watcher)
            throw new IllegalArgumentException("Watcher ID (" + ident
                    + ") is greater then " + Constants.max_watcher);
        this.id = ident;

    }

    @Override
    public String encode() {
        {
            StringBuffer result = new StringBuffer();
            if (this.id != null) {
                result.append(super.encode(Constants.watcher_width));
            } else
                while (result.length() < Constants.watcher_width)
                    result.append("0");
            assert result.length() == Constants.watcher_width : "Opcode length for watcher should be "
                    + Constants.watcher_width
                    + " but is "
                    + result.length()
                    + "!";

            return result.toString();
        }

    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }

    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.Identifer#info()
     */
    @Override
    public String info() {
        StringBuffer result = new StringBuffer();
        while (result.length() < Constants.watcher_width)
            result.append("W");
        return result.toString();
    }

    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.Identifer#length()
     */
    @Override
    public int length() {
        return Constants.watcher_width;
    }

}
