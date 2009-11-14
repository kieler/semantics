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

import de.cau.cs.kieler.krep.compiler.lustre.ClockList;
import de.cau.cs.kieler.krep.compiler.lustre.Expression;

/**
 * @author ctr Exception to indicate an error in the type inference
 */
public class ClockException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Expression context;

    private ClockList expected;

    private ClockList actual;

    private String msg = null;

    /**
     * @param context
     *            Expression in which the error occurs
     * @param expected
     *            clock list expected for this expression
     * @param actual
     *            clock list inferred for the expression
     */
    public ClockException(Expression context, ClockList expected, ClockList actual) {
        super();
        this.context = context;
        this.actual = actual;
        this.expected = expected;
        this.msg = toString();
    }

    /**
     * @param msg
     *            message that describes the clock failure
     */
    public ClockException(final String msg) {
        super(msg);
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
