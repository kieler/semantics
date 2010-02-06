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
package de.cau.cs.kieler.krep.compiler.klp;

import de.cau.cs.kieler.krep.compiler.ceq.Program;
import de.cau.cs.kieler.krep.compiler.ceq.VarAccessExpression;
import de.cau.cs.kieler.krep.compiler.ceq.Variable;
import de.cau.cs.kieler.krep.compiler.util.Type;

/**
 * Reading access to a register. Can read either previous or current value.
 * 
 * @kieler.rating 2010-02-05 yellow 
 *   review by cmot, msp, tam
 * 
 * @author ctr 
 */
public class RegAccess {
    private Variable var;

    private boolean pre;

    /**
     * @param v
     *            variable to read from
     * @param isPre
     *            true if previous value should be read
     */
    public RegAccess(final Variable v, final boolean isPre) {
        super();
        this.pre = isPre;
        this.var = v;
    }

    /**
     * @param v
     *            CEQ access to a variable
     */
    public RegAccess(final VarAccessExpression v) {
        super();
        this.pre = v.isPre();
        this.var = Program.getVar(v.getName());
    }

    @Override
    public String toString() {
        String res = "";
        if (pre) {
            res += "pre(";
        }
        res += var.getName();
        if (pre) {
            res += ")";
        }
        return res;
    }

    /**
     * @return Type of the variable
     */
    public Type getType() {
        return var.getType();
    }

    /**
     * @return KLP id under which the value is stored. The first bits are the register id, followed
     *         by the pre flag.
     * 
     */
    public int getId() {
        return 2 * var.getId() + (pre ? 1 : 0);
    }

}
