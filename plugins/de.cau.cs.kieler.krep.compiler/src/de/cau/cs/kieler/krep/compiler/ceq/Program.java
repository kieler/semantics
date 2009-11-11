package de.cau.cs.kieler.krep.compiler.ceq;


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import de.cau.cs.kieler.krep.compiler.dependencies.DepGraph;
import de.cau.cs.kieler.krep.compiler.helper.Debug;

/**
 * @author ctr CEQ program, eg, a bunch of CEQ equation plus information on
 *         inputs and outputs
 */
public class Program {
    protected String name;

    protected HashMap<String, Variable> vars = new HashMap<String, Variable>();

    protected LinkedList<Variable> inputs = new LinkedList<Variable>();

    protected LinkedList<Variable> outputs = new LinkedList<Variable>();

    protected LinkedList<Variable> locals = new LinkedList<Variable>();

    protected LinkedList<Equation> eqs = new LinkedList<Equation>();

    protected LinkedList<Automaton> ssms = new LinkedList<Automaton>();

    protected DepGraph depGraph = null;

    /**
     * generate empty program
     * 
     * @param name
     *            of the main node
     */
    public Program(final String name) {
	this.name = name;
    }

    /**
     * generate progrm from an existing one
     * 
     * @param name
     * @param p
     */
    public Program(final String name, final Program p) {
	this.name = name;
	this.vars = p.vars;
	this.inputs = p.inputs;
	this.outputs = p.outputs;
	this.locals = p.locals;
	this.eqs = p.eqs;
	this.depGraph = p.depGraph;
	this.ssms = p.ssms;
    }

    /**
     * @param name
     *            name of the program
     * @param vars
     *            variables that are used (including information on IO)
     * @param eqs
     *            list of clocked equations
     */
    public void init() {
	HashMap<String, LinkedList<String>> deps = new HashMap<String, LinkedList<String>>();
	for (Equation e : eqs) {
	    LinkedList<String> d = new LinkedList<String>();
	    for (Variable v : e.getDeps()) {
		d.add(v.getName());
	    }
	    if (e.getClock() != null) {
		d.add(e.getClock());
	    }
	    deps.put(e.getName(), d);
	}
	
	for(Automaton a: ssms){
	    LinkedList<String> d = new LinkedList<String>();
	    for(Variable in: a.getInputs()){
		d.add(in.getName());
	    }
	    deps.put(a.getName(), d);
	    for(Variable out: a.getOutputs()){
		d = deps.get(out.getName());
		if(d==null){
		    d= new LinkedList<String>();
		}
		d.add(a.getName());
		deps.put(out.getName(), d);
	    }
	    a.init();
	}

	depGraph = new DepGraph(deps);
	for (Automaton ssm: ssms){
	    depGraph.addSubGraph(ssm.getName(), ssm.getDepGraph());
	}
	// make sure that outputs are not reordered
	ListIterator<Variable> i = outputs.listIterator();
	/*Variable o1 = i.next();
	while (i.hasNext()) {
	    Variable o2 = i.next();
	    depGraph.add(o1.getName(), o2.getName());
	    o1 = o2;
	}*/
	LinkedList<Equation> tmp = new LinkedList<Equation>();
	List<String> sort = depGraph.sort();
	for (String s : sort) {
	    for (Equation e : eqs) {
		if (s.equals(e.getName())) {
		    tmp.add(e);
		}
	    }
	}
	eqs = tmp;
    }

    /**
     * replace complex expression by temporary computations
     */
    public void flatten() {
	final LinkedList<Equation> aux = new LinkedList<Equation>();
	for (final Equation eq : eqs) {
	    aux.addAll(eq.flatten(vars));
	}
	eqs.addAll(aux);
    }

    @Override
    public String toString() {
	return toLustre();
    }

    /**
     * @return Lustre code for the program
     */
    public String toLustre() {
	// LinkedList<Variable> local = new LinkedList<Variable>();
	for (Variable v : vars.values()) {
	    if (!v.isInput() && !v.isOutput() && !locals.contains(v)) {
		locals.add(v);
	    }
	}

	return Ceq.toLustre(name, inputs, outputs, locals, eqs, ssms);
    }

    /**
     * @param name
     *            of the program
     */
    public void setName(String name) {
	this.name = name;

    }

    /**
     * propagate constant values
     */
    public void propagateConst() {
	final HashMap<String, Const> con = new HashMap<String, Const>();
	boolean done = false;
	while(!done){
	    done = true;
	for (final Equation e : eqs) {
	    final Const c = e.propagateConst(con);
	    if (c != null && !con.containsKey(e.getName())) {
		con.put(e.getName(), c);
		done = false;
	    }
	}
	}
	final LinkedList<Equation> keep = new LinkedList<Equation>();
	final HashSet<String> out = new HashSet<String>();
	for (final Variable o : outputs) {
	    out.add(o.getName());
	}
	for (final Equation e : eqs) {
	    if (con.containsKey(e.getName()) && !out.contains(e.getName())) {
		vars.remove(e.getName());
	    } else {
		Const c = con.get(e.getClock());
		if (c != null) {
		    e.setClock(null);
		}
		keep.add(e);
	    }
	}
	eqs = keep;
	for (Automaton ssm : ssms) {
	    ssm.propagateConst();
	}

    }

    /**
     * perform static evaluation
     */
    public void staticEval() {
	for (final Equation e : eqs) {
	    e.staticEval();
	}
    }

    /**
     * @return name of the main node
     */
    public String getName() {
	return name;
    }

    /**
     * @return outputs of the program
     */
    public LinkedList<Variable> getOutputs() {
	return outputs;
    }

    /**
     * @return inputs of the program
     */
    public LinkedList<Variable> getInputs() {
	return inputs;
    }

    /**
     * @param v
     *            additional variable
     */
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
     * @param eq
     *            additional equation
     */
    public void addEq(final Equation eq) {
	eqs.add(eq);
    }

    /**
     * remove equivalent equations
     */
    public void removeEquiv() {
	Debug.low("remove equivalent equations");

	HashMap<String, Variable> equiv = new HashMap<String, Variable>();
	for (Equation e : eqs) {
	    Expression expr = e.getExpr();
	    if (expr instanceof VarAccess) {
		VarAccess v = (VarAccess) expr;
		if (e.getClock() == null && e.getInit() == null) {
		    equiv.put(e.getName(), Variable.get(v.getName()));
		    Debug.low("\t" + e.getName() + " = " + v.getName());
		}

	    }
	}
	// make sure that outputs are not removed
	for (Variable v : outputs) {
	    if (equiv.containsKey(v.getName())) {
		equiv.remove(v.getName());
	    }
	}
	replace(equiv);

    }
    
    public void replace(HashMap<String, Variable> equiv){
	if (!equiv.isEmpty()) {
	    LinkedList<Equation> keep = new LinkedList<Equation>();
	    for (Equation eq : eqs) {
		eq.replaceVar(equiv);
		if (!equiv.containsKey(eq.getName())) {
		    keep.add(eq);
		} else {
		    Variable v = Variable.get(eq.getName());
		    vars.remove(eq.getName());
		    locals.remove(v);
		}
	    }
	    eqs = keep;
	    
	    for(Automaton ssm: ssms){
		ssm.replace(equiv);
	    }
	}
    }

    public int wcrt() {
	Debug.low("WCRT:");
	int res = 0;
	for (Equation e : eqs) {
	    int t = e.wcrt();
	    Debug.low(e.getName() + "->" + t);
	    res += t;
	}
	return res;
    }

    public void addLocal(Variable v) {
	locals.add(v);
    }

    public void addOutput(Variable v) {
	outputs.add(v);
    }

    public void addInput(Variable v) {
	inputs.add(v);
    }

    public void simplify() {
	// Count number of readers for each flow
	HashMap<String, Integer> index = new HashMap<String, Integer>();
	int i =0;
	for (Equation eq : eqs) {
	    index.put(eq.getName(), i);
	    i++;
	}
	
	int[] nReader = new int[eqs.size()];
	
	for (Equation eq : eqs) {
	    for (String v : eq.getPDeps()) {
		Integer k = index.get(v);
		if (k != null) {
		    nReader[k]++;
		}
	    }
	}

	LinkedList<Equation> keep = new LinkedList<Equation>();
	for(i=0; i<eqs.size(); i++){
	    Equation eq = eqs.get(i);
	    if(nReader[i]==1 && locals.contains(Variable.get(eq.getName()))){
		Debug.low("replace " + eq.getName());
		boolean ok=true;
		for(Equation e: eqs){
		    if(!e.replace(eq)){
			keep.add(eq);
			ok=false;
		    }
		}
		if(ok){
		    vars.remove(Variable.get(eq.getName()).getName());
		}
	    }else{
		keep.add(eq);
	    }
	}
	
	eqs=keep;
	
	for (Automaton ssm : ssms) {
	    ssm.simplify();
	}

	removeEquiv();
    }
}
