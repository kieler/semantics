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

import de.cau.cs.kieler.krep.compiler.lustre.Expression;

/**
 * @author ctr thrown for any error during type inference
 */
public class TypeException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Expression context;
    private String expected;
    private String actual;

    /**
     * @param context
     *            Expression in which the error occurs
     * @param expected
     *            type expected for this expression
     * @param actual
     *            type inferred for the expression
     */
    public TypeException(Expression context, String expected, String actual) {
        super();
        this.actual = actual;
        this.context = context;
        this.expected = expected;
    }

    @Override
    public String toString() {
        String res = "Type Exception in expression: ";
        res += context.toString() + "\n";
        res += "expected " + expected + "\n";
        res += "got       " + actual + "\n";
        return res;
    }
}
