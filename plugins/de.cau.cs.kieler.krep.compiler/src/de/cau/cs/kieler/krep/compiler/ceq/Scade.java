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

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;

import de.cau.cs.kieler.krep.compiler.ceq.Variable.Kind;
import de.cau.cs.kieler.krep.compiler.exceptions.ClockException;
import de.cau.cs.kieler.krep.compiler.exceptions.TypeException;
import de.cau.cs.kieler.krep.compiler.parser.scadeLexer;
import de.cau.cs.kieler.krep.compiler.parser.scadeParser;
import de.cau.cs.kieler.krep.compiler.prog.Type;

/**
 * @author ctr
 * 
 */
public class Scade extends Program implements Scope {

    /**
     * @param name
     *            name of the scade program.
     */
    public Scade(final String name) {
        super(name);
    }

    /**
     * parse input stream which is expected to be a Scade textual file.
     * 
     * @param in input stream with scade program.
     * @throws IOException thrown when the input stream cannot be read
     * @throws ClockException thrown at errors in clock inference
     * @throws TypeException thrown at errors in type inference
     */
    public Scade(final InputStream in) throws IOException, ClockException, TypeException {
        super("Scade");

        scadeLexer lex = new scadeLexer(new ANTLRInputStream(in));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        scadeParser parser = new scadeParser(tokens);

        try {
            parser.setProg(this);
            parser.program();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Automaton ssm : ssms) {
            ssm.setIO();
        }
        this.propagateConst();
        this.simplify();
    }

    /**
     * infer io from equations.
     */
    public void setIO() {
        for (final Equation eq : eqs) {
            final Variable v = Variable.get(eq.getName());
            if (!locals.contains(v)) {
                outputs.add(v);
                if (!vars.containsKey(v.getName())) {
                    vars.put(v.getName(), v);
                }
            }
        }

        for (final Equation eq : eqs) {
            for (final Variable v : eq.getDeps()) {
                if (!vars.containsKey(v.getName())) {
                    inputs.add(v);
                    vars.put(v.getName(), v);
                }
            }
        }

        for (final Automaton ssm : ssms) {
            ssm.setIO();
        }

    }

    /**
     * Transform Lustre program into simplified ceq.
     * 
     * @return the simplified program
     */
    public Program getCEQ() {
        return this;

    }

    /**
     * @param s
     *            name of the additional equation
     * @param e
     *            expression to compute the value
     */
    public void addEq(final String s, final Expression e) {
        eqs.add(new Equation(s, e));
    }

    @Override
    public void addVar(final Variable v) {
        vars.put(v.getName(), v);
        if (v.isInput()) {
            inputs.add(v);
        } else if (v.isOutput()) {
            outputs.add(v);
        } else {
            locals.add(v);
        }
    }

    /**
     * @param s name of input signal
     * @param t type of new input signal
     */
    public void addInput(final String s, final Type t) {
        Variable v = Variable.get(s, Kind.INPUT, t);
        addVar(v);
    }

    @Override
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * 
     * {@inheritDoc}
     */
    public void add(final Automaton a) {
        ssms.add(a);

    }

    /**
     * 
     * {@inheritDoc}
     */
    public void add(final LinkedList<Variable> vars) {
        for (Variable v : vars) {
            addVar(v);
        }

    }

    /**
     * 
     * {@inheritDoc}
     */
    public void add(final Equation eq) {
        eqs.add(eq);

    }

    /**
     * 
     * {@inheritDoc}
     */
    public void addEq(final LinkedList<Equation> eq) {
        for (Equation e : eq) {
            add(e);
        }

    }

}
