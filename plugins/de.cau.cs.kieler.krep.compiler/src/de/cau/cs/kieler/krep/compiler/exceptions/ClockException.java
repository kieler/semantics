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
package de.cau.cs.kieler.krep.compiler.exceptions;

import de.cau.cs.kieler.core.KielerException;
import de.cau.cs.kieler.krep.compiler.lustre.ClockList;
import de.cau.cs.kieler.krep.compiler.lustre.Expression;

/**
 * Exception to indicate an error in the clock calculus.
 * 
 * @kieler.rating 2010-02-05 yellow 
 *   review by cmot, msp, tam
 * 
 * @author ctr 
 * 
 * 
 */
public class ClockException extends KielerException {

    private static final long serialVersionUID = 1L;

    private Expression context;

    private ClockList expected;

    private ClockList actual;

    private String msg = null;

    /**
     * @param ctxt
     *            Expression in which the error occurs
     * @param expc
     *            clock list expected for this expression
     * @param act
     *            clock list inferred for the expression
     */
    public ClockException(final Expression ctxt, final ClockList expc, final ClockList act) {
        super("Clock Exception");
        this.context = ctxt;
        this.actual = act;
        this.expected = expc;
        this.msg = toString();
    }

    /**
     * @param messsage
     *            message that describes the clock failure
     */
    public ClockException(final String messsage) {
        super(messsage);
    }

    @Override
    public String toString() {
        if (msg != null) {
            return msg;
        } else {
            String res = "Clock Exception in expression: ";
            if (context == null) {
                res += "try to remove non-existing clock";
            } else {
                res += context.toString() + "\n";
                res += "expected:" + expected.toString() + "\n";
                res += "actual:" + actual.toString() + "\n";
            }
            return res;
        }
    }
}
