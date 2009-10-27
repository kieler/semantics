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

public class Label extends Identifer {
    int line;

    public Label(String name, Integer addr, int line) {
        super(name, addr);
        this.line = line;
    }

    public Label(String name, Integer addr) {
        super(name, addr);

    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public String encode() {
        return super.encode(Constants.addr_width);
    }

    @Override
    public String info() {
        StringBuffer result = new StringBuffer();
        while (result.length() < Constants.addr_width)
            result.append("A");
        return result.toString();
    }

    @Override
    public String print() {
        return super.print() + "\t[" + this.line + "]";
    }

    public String printLabel() {
        StringBuffer result = new StringBuffer();
        result.append(name);
        while (result.length() < Constants.max_LabelPrint)
            result.append(" ");
        return result.toString();
    }

    @Override
    public int length() {
        return Constants.addr_width;
    }
}
