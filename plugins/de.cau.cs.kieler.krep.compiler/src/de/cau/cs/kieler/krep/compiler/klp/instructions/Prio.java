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
package de.cau.cs.kieler.krep.compiler.klp.instructions;

public class Prio extends Instruction {

    private int prio;
    private String reg;

    public Prio(String reg, int prio) {
        this.reg = reg;
        this.prio = prio;
    }

    @Override
    public String toString() {
        return "  PRIO " + reg + " " + prio;
    }

}
