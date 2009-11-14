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
package de.cau.cs.kieler.krep.compiler.krp.statement;

public class Recv extends Statement {

    String Name;
    Integer ID;
    Integer Reg;

    public Recv(String name) {
        super();
        Name = name;
    }

    @Override
    public String toString() {
        return "RECV " + Name;
    }
}
