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
 * Exceptions that is thrown for any error during type inference.
 * 
 * @kieler.rating 2010-01-05 proposed yellow ctr
 * 
 * @author ctr 
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
     * @param ctxt
     *            Expression in which the error occurs
     * @param expct
     *            type expected for this expression
     * @param act
     *            type inferred for the expression
     */
    public TypeException(final Expression ctxt, final String expct, final String act) {
        super();
        this.actual = act;
        this.context = ctxt;
        this.expected = expct;
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
