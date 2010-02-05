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
package de.cau.cs.kieler.krep.compiler.ceq;

import java.util.LinkedList;

/**
 * Static helper functions for clocked equations.
 * 
 * @kieler.rating 2010-02-05 proposed yellow 
 *   review by cmot, msp, tam
 * 
 * @author ctr
 */
public final class Ceq {

    private Ceq() {
    }

    /**
     * @param name
     *            name of the main node
     * @param inputs
     *            list of all input signals
     * @param outputs
     *            list of all output singals
     * @param locals
     *            list of all local signals
     * @param eqs
     *            all clocked equations
     * @param ssms
     *            all automata
     * @return generate Lustre code for a given set of clocked equations
     */
    public static String toLustre(final String name, final LinkedList<? extends Variable> inputs,
            final LinkedList<? extends Variable> outputs,
            final LinkedList<? extends Variable> locals, final LinkedList<Equation> eqs,
            final LinkedList<Automaton> ssms) {
        StringBuffer res = new StringBuffer("node " + name + " (\n");
        for (final Variable v : inputs) {
            res.append("    " + v.toString() + ";\n");
        }
        res.append(") returns (\n");
        for (final Variable v : outputs) {
            res.append("    " + v.toString() + ";\n");
        }
        res.append(");\n");
        if (!locals.isEmpty()) {
            res.append("var\n");
            for (final Variable v : locals) {
                res.append("    " + v.toString() + ";\n");
            }
        }
        res.append("let\n");
        for (final Equation eq : eqs) {
            res.append("  " + eq.toString());
        }
        res.append("\n");

        for (final Automaton ssm : ssms) {
            res.append(ssm.toString());
        }
        res.append("tel\n");
        return res.toString();
    }
}
