package lustre;

import helper.Debug;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;

import ceq.Variable.Kind;

import exceptions.ClockException;
import exceptions.TypeException;

import parser.lustreLexer;
import parser.lustreParser;

/**
 * @author ctr
 * 
 *         Container class to hold parsed lustre or ec file. Contains methods
 *         for type and clock inference.
 */
public class Lustre {

    private String name;

    private HashMap<String, Expression> eqs = new HashMap<String, Expression>();

    private HashMap<String, Variable> vars = new HashMap<String, Variable>();

    private LinkedList<Variable> input = new LinkedList<Variable>();

    private LinkedList<Variable> output = new LinkedList<Variable>();

    private LinkedList<Variable> local = new LinkedList<Variable>();

    /**
     * parse input stream which is expected to be a Lustre file
     * 
     * @param in
     * @throws IOException
     * @throws ClockException
     * @throws TypeException
     */
    public Lustre(InputStream in) throws IOException, ClockException,
	    TypeException {
	super();

	lustreLexer lex = new lustreLexer(new ANTLRInputStream(in));
	CommonTokenStream tokens = new CommonTokenStream(lex);

	lustreParser parser = new lustreParser(tokens);

	try {
	    parser.setProg(this);
	    parser.prog();
	} catch (Exception e) {
	    e.printStackTrace();
	}
	Debug.low("Lift clocks:");
	for (Entry<String, Expression> eq : eqs.entrySet()) {
	    String id = eq.getKey();
	    Expression expr = eq.getValue();

	    eqs.put(id, expr.liftClock());
	}
	Debug.low(toLustre());
	Debug.low("Infer types and clocks:");
	for (Entry<String, Expression> e : eqs.entrySet()) {
	    Debug.low(e.toString());
	    try {
		e.getValue().inferType();
		e.getValue().inferClock(vars);
		e.getValue().propagateClock(new ClockList());
	    } catch (TypeException e1) {
		e1.printStackTrace();
		System.exit(1);
	    }
	}

	Debug.low("extract pre expressions");
	HashMap<String, Expression> aux = new HashMap<String, Expression>();
	for (Entry<String, Expression> e : eqs.entrySet()) {
	    e.getValue().extractPre(aux);
	}
	eqs.putAll(aux);
	for (Entry<String, Expression> e : aux.entrySet()) {
	    local.add(Variable.get(e.getKey()));
	}
    }

    /**
     * Transform Lustre program into simplified ceq
     * 
     * @returns the simplified program
     */
    public ceq.Program getCEQ() {
	ceq.Program res = new ceq.Program(name);

	// copy variable declarations
	for (Variable v : input) {
	    res.addVar(new ceq.Variable(v, Kind.INPUT));
	}
	for (Variable v : output) {
	    res.addVar(new ceq.Variable(v, Kind.OUTPUT));
	}
	for (Variable v : local) {
	    res.addVar(new ceq.Variable(v, Kind.LOCAL));
	}

	// copy eqs
	for (Entry<String, Expression> e : eqs.entrySet()) {
	    LinkedList<ceq.Equation> aux = new LinkedList<ceq.Equation>();
	    Expression expr = e.getValue();
	    ceq.Equation eq = expr.declock(e.getKey(), 0, null, aux);
	    eq.setName(e.getKey());
	    res.addEq(eq);

	    for (ceq.Equation a : aux) {
		res.addVar(ceq.Variable.get(a.getName()));
		res.addEq(a);
	    }

	}
	res.init();
	return res;
    }

    /**
     * @param s
     *            name of the additional equation
     * @param e
     *            expression to compute the value
     */
    public void addEq(String s, Expression e) {
	eqs.put(s, e);
    }

    /**
     * @param in
     *            new input list
     */
    public void setInputs(LinkedList<lustre.Variable> in) {
	this.input = in;
	for (Variable v : in) {
	    vars.put(v.getName(), v);
	}
    }

    /**
     * @param out
     *            new output list
     */
    public void setOutputs(LinkedList<lustre.Variable> out) {
	this.output = out;
	for (Variable v : out) {
	    vars.put(v.getName(), v);
	}
    }

    /**
     * @param loc
     *            list of local variables
     */
    public void setLocals(LinkedList<lustre.Variable> loc) {
	this.local = loc;
	for (Variable v : loc) {
	    vars.put(v.getName(), v);
	}
    }

    /**
     * @return write program in Lustre syntax
     */
    public String toLustre() {
	String res = "node " + name + "(";
	for (Variable v : input) {
	    res += v.getName() + ":" + v.getType() + ";";
	}
	res += ") returns (";
	for (Variable v : output) {
	    res += v.getName() + ":" + v.getType() + ";";
	}
	res += ");\n";

	for (Variable v : local) {
	    res += "  " + v.getName() + ":" + v.getType() + ";\n";
	}
	res += "let\n";

	for (Entry<String, Expression> e : eqs.entrySet()) {
	    res += "  " + e.getKey() + " = " + e.getValue().toString() + ";\n";
	}
	res += "tel\n";
	return res;
    }

    public void setName(String name) {
	this.name = name;
    }

}
