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

/**
 * 
 * Prio statement to change the priority of a thread.
 * @author ctr
 *
 */
public class Prio extends Instruction {

    private int prio;
    private String reg;

    /**
     * 
     * @param register associated with the thread thats priority is changed
     * @param priority new priority
     */
    public Prio(final String register, final int priority) {
        this.reg = register;
        this.prio = priority;
    }

    @Override
    public String toString() {
        return "  PRIO " + reg + " " + prio;
    }

}
