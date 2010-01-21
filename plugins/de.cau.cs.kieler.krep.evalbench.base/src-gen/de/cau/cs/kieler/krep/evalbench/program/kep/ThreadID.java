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

/** @generated */public class ThreadID extends Identifer {
    PrioID prio;

    public ThreadID(int ident, int prio_val) throws IllegalArgumentException {
        PrioID prio;
        try {
            prio = new PrioID(prio_val);

        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
        int idt = ident;
        if (idt > Constants.max_threadId)
            throw new IllegalArgumentException("Thread ID (" + idt
                    + ") is greater then " + Constants.max_threadId);
        this.id = idt;
        this.prio = prio;
    }

    @Override
    public String encode() {
        return "0" + super.encode(Constants.threadId_width);

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
        while (result.length() < Constants.threadId_width)
            result.append("T");
        result.append("0");
        return result.toString();

    }

    /*
     * (non-Javadoc)
     * 
     * @see kasm.classes.Identifer#length()
     */
    @Override
    public int length() {
        return Constants.threadId_width + 1;

    }

    public PrioID getPrio() {
        return prio;
    }

}
