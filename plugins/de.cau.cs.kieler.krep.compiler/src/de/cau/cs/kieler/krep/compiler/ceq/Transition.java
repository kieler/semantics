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

import java.util.HashMap;
import java.util.LinkedList;

import de.cau.cs.kieler.krep.compiler.ceq.Variable.Kind;
import de.cau.cs.kieler.krep.compiler.klp.CJmpInstruction;
import de.cau.cs.kieler.krep.compiler.klp.AbstractInstruction;
import de.cau.cs.kieler.krep.compiler.klp.LabelInstruction;
import de.cau.cs.kieler.krep.compiler.klp.RegAccess;
import de.cau.cs.kieler.krep.compiler.klp.CJmpInstruction.Cond;
import de.cau.cs.kieler.krep.compiler.util.Type;

/**
 * A transition in an Safe State Machine, consitiing of a trigger and a target state.
 * 
 * @kieler.rating 2010-02-05 yellow 
 *   review by cmot, msp, tam

 * @author ctr
 * 
 */
public class Transition {
    private String target;
    private Expression trigger;

    /**
     * @param triggerExpr
     *            trigger of the expression
     * 
     * @param targetState
     *            id of the target state
     */
    public Transition(final Expression triggerExpr, final String targetState) {
        this.trigger = triggerExpr;
        this.target = targetState;
    }

    @Override
    public String toString() {
        String res = "if " + trigger.toString() + " restart " + target;
        return res;
    }

    /**
     * @return id of the target state
     */
    public String getTarget() {
        return target;
    }

    /**
     * 
     * 
     * @param ssm
     *            name of the ssm that contains the transitions
     * @param source
     *            source state
     * @param suffix
     *            additional suffix to allow uniqe transition names
     * @return klp instructions to implement the transitions
     */
    public LinkedList<AbstractInstruction> compile(final String ssm, final String source,
            final String suffix) {
        LinkedList<AbstractInstruction> res = new LinkedList<AbstractInstruction>();
        RegAccess r;
        if (trigger instanceof VarAccessExpression) {
            r = new RegAccess((VarAccessExpression) trigger);
        } else {
            Variable v = Program.getVar(ssm, Kind.LOCAL, Type.BOOL);
            res.addAll(trigger.toKlp(v));
            r = new RegAccess(v, false);
        }
        res.add(new CJmpInstruction(Cond.T, r, LabelInstruction.get(source + "2" + target + suffix)));
        return res;
    }

    /**
     * @param equiv
     *            map of equivalent variables
     */
    public void replace(final HashMap<String, Variable> equiv) {
        trigger.replaceVar(equiv);

    }
}
