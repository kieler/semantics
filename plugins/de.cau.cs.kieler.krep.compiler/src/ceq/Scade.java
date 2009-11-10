package ceq;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;

import ceq.Variable.Kind;

import exceptions.ClockException;
import exceptions.TypeException;

import parser.scadeLexer;
import parser.scadeParser;
import prog.Type;

/**
 * @author ctr
 * 
 *         Container class to hold parsed lustre or ec file. Contains methods
 *         for type and clock inference.
 */
public class Scade extends Program implements Scope {

    public Scade(String name) {
	super(name);
    }

    /**
     * parse input stream which is expected to be a Scade textual file
     * 
     * @param in
     * @throws IOException
     * @throws ClockException
     * @throws TypeException
     */
    public Scade(InputStream in) throws IOException, ClockException,
	    TypeException {
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
	for(Automaton ssm: ssms){
	    ssm.setIO();
	}
	this.propagateConst();
	this.simplify();
    }

    public void setIO() {
	for(Equation eq: eqs){
	    Variable v = Variable.get(eq.getName());
	    if(!locals.contains(v)){
		outputs.add(v);
		if(!vars.containsKey(v.getName())){
		    vars.put(v.getName(), v);
		}
	    }
	}
	
	for(Equation eq:eqs){
	    for(Variable v: eq.getDeps()){
		if (!vars.containsKey(v.getName())){
		    inputs.add(v);
		    vars.put(v.getName(), v);
		}
	    }
	}
	    
	for(Automaton ssm: ssms){
	    ssm.setIO();
	}
	
    }

    /**
     * Transform Lustre program into simplified ceq
     * 
     * @returns the simplified program
     */
    public ceq.Program getCEQ() {
	return this;

    }

    /**
     * @param s
     *            name of the additional equation
     * @param e
     *            expression to compute the value
     */
    public void addEq(String s, Expression e) {
	eqs.add(new Equation(s, e));
    }

    public void addVar(Variable v) {
	vars.put(v.getName(), v);
	if (v.isInput()) {
	    inputs.add(v);
	} else if (v.isOutput()) {
	    outputs.add(v);
	} else {
	    locals.add(v);
	}
    }

    public void addInput(String s, Type t) {
	Variable v = Variable.get(s, Kind.INPUT, t);
	addVar(v);
    }

    public void setName(String name) {
	this.name = name;
    }

    public void add(Automaton a) {
	ssms.add(a);

    }

    public void add(LinkedList<Variable> vars) {
	for (Variable v : vars) {
	    addVar(v);
	}

    }

    @Override
    public void add(Equation eq) {
	eqs.add(eq);

    }

    @Override
    public void addEq(LinkedList<Equation> eq) {
	for (Equation e : eq) {
	    add(e);
	}

    }

}
