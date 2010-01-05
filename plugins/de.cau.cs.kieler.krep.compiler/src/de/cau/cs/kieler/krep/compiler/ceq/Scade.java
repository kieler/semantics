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
import de.cau.cs.kieler.krep.compiler.helper.Type;
import de.cau.cs.kieler.krep.compiler.parser.scadeLexer;
import de.cau.cs.kieler.krep.compiler.parser.scadeParser;

/**
 * Representation of a Scade program, this extends a ceq program by a parser for Scade files.
 * 
 * @kieler.rating 2010-01-05 proposed yellow ctr
 * 
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
     * @param in
     *            input stream with scade program.
     * @throws IOException
     *             thrown when the input stream cannot be read
     * @throws ClockException
     *             thrown at errors in clock inference
     * @throws TypeException
     *             thrown at errors in type inference
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
        for (Automaton ssm : getSsms()) {
            ssm.setIO();
        }
        this.propagateConst();
        this.simplify();
    }

    /**
     * infer io from equations.
     */
    public void setIO() {
        for (final Equation eq : getEqs()) {
            final Variable v = Variable.get(eq.getName());
            if (!getLocals().contains(v)) {
                getOutputs().add(v);
                if (!getVars().containsKey(v.getName())) {
                    getVars().put(v.getName(), v);
                }
            }
        }

        for (final Equation eq : getEqs()) {
            for (final Variable v : eq.getDeps()) {
                if (!getVars().containsKey(v.getName())) {
                    getInputs().add(v);
                    getVars().put(v.getName(), v);
                }
            }
        }

        for (final Automaton ssm : getSsms()) {
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
        getEqs().add(new Equation(s, e));
    }

    @Override
    public void addVar(final Variable v) {
        getVars().put(v.getName(), v);
        if (v.isInput()) {
            getInputs().add(v);
        } else if (v.isOutput()) {
            getOutputs().add(v);
        } else {
            getLocals().add(v);
        }
    }

    /**
     * @param s
     *            name of input signal
     * @param t
     *            type of new input signal
     */
    public void addInput(final String s, final Type t) {
        Variable v = Variable.get(s, Kind.INPUT, t);
        addVar(v);
    }

    /**
     * 
     * {@inheritDoc}
     */
    public void add(final Automaton a) {
        getSsms().add(a);

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
        getEqs().add(eq);

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
