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
package de.cau.cs.kieler.krep.compiler.krp;

//package krp;
//
//import helper.Debug;
//
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.ListIterator;
//
//import ceq.Ceq;
//import ceq.Equation;
//import ceq.Program;
//import ceq.Variable;
//
//import dependencies.DepGraph;
//
//
///**
// * @author ctr
// * CEQ program, eg, a bunch of CEQ equation plus information on inputs and outputs
// */
//public class Core extends Program{
//
//    //protected HashMap<String, Variable> vars = new HashMap<String, Variable>();
//
//    //protected LinkedList<Variable> inputs = new LinkedList<Variable>();
//    //protected LinkedList<Variable> outputs = new LinkedList<Variable>();
//    //protected LinkedList<Variable> locals = new LinkedList<Variable>();
//    
//    //protected LinkedList<Equation> eqs = new LinkedList<Equation>();
//
//    private Integer delay = null;
//    
//    public Core(String name){
//	super(name);
//    }
//    
//    /**
//     * @param name name of the program
//     * @param vars variables that are used (including information on IO)
//     * @param eqs list of clocked equations
//     */
//   /* public void init(//final String name, 
//	    final LinkedList<Variable> vars,
//	    final LinkedList<Equation> eqs) {
//	for (Variable v : vars) {
//	    if (v != null) {
//		this.vars.put(v.getName(), v);
//		if(v.isOutput()){
//		    outputs.add(v);
//		}else if (v.isInput()){
//		    inputs.add(v);
//		}
//	    }
//	}
//	if (eqs == null) {
//	    this.eqs = new LinkedList<Equation>();
//	} else {
//	    HashMap<String, List<Variable>> deps = new HashMap<String, List<Variable>>();
//		for(Equation e:eqs){
//		  deps.put(e.getName(), e.getDeps());   
//		}
//		DepGraph d = new DepGraph(deps);
//		// make sure that outputs are not reordered
//		ListIterator<Variable> i = outputs.listIterator();
//		Variable o1 = i.next();
//		while(i.hasNext()){
//		    Variable o2 = i.next();
//		    d.add(o1.getName(), o2.getName());
//		    o1=o2;
//		}
//	
//		List<String> sort = d.sort();
//		for(String s:sort){
//		    for(Equation e: eqs ){
//			if(s.equals(e.getName())){
//			    this.eqs.add(e);
//			}
//		    }
//		}
//	}
//    }*/
//
//    /*public void flatten(){
//	LinkedList<Equation> aux = new LinkedList<Equation>();
//	LinkedList<Variable vs> 
//	for(Equation eq:eqs){
//	    Variable vs = 
//	    aux.addAll(eq.flatten(vars));
//	}
//	eqs.addAll(aux);
//    }*/
//    
//    public void add(Equation eq){
//	eqs.add(eq);
//    }
//    
//    @Override
//    public String toString(){
//	return toLustre();
//    }
//    
//    /**
//     * print as Lustre program
//     */
//
//    public String toLustre() {
//	return Ceq.toLustre(name, inputs, outputs, locals, eqs);
//    }
//
//    /**
//     * @param name of the program
//     */
//   /* public void setName(String name) {
//	this.name = name;
//
//    }*/
//
//    public void inferIO(){
//	for (Equation eq:eqs){
//	    outputs.add(Variable.get(eq.getName() ));//, eq.getClock()));
//	}
//	for (Equation eq:eqs){
//	    for(Variable v: eq.getDeps()){
//		Variable var = Variable.get(v.getName());
//		if(!outputs.contains(var)){
//		    inputs.add(var);
//		}
//	    }
//	}
//    }
//    
//  /*  public String getName() {
//	return name;
//    }*/
//    
//    public void removeOutput(Variable v){
//	locals.add(v);
//	outputs.remove(v);
//    }
//
//    /*public LinkedList<Variable> getOutputs() {
//	return outputs;
//    }*/
//    
//    /*public LinkedList<KrpVariable> getInputs() {
//	return inputs;
//    }*/
//    public void padDelay(){
//	Debug.low("Core: " + name);
//	for(Equation eq: eqs){
//	//    int delay = Variable.get(eq.getName()).delay;
//	//    Debug.low("delay " + eq.getName() + " = "  + delay );
//	    eq.padDelay();
//	}
//    }
//
//}
//
//
//
//
//
////package krp;
////
////import java.util.HashMap;
////import java.util.LinkedList;
////import java.util.List;
////import java.util.Map.Entry;
////
////import ceq.Equation;
////import ceq.Program;
////
////import dependencies.DepGraph;
////import krp.statement.*;
////import lustre.Expression;
////import lustre.Variable;
////
////public class Core extends Program {
////
////    private List<Statement> stmts;
////    
////    public Core(String name) {
////	super(name);
////    }
////
////    public void compile() {
////	HashMap<String, Variable> preVars = new HashMap<String, Variable>();
////	stmts = new LinkedList<Statement>();
////
////	/*for (Entry<String, Type> e : input.entrySet()) {
////	    stmts.add(new Recv(e.getKey()));
////	}
////
////	for (Entry<String, Type> e : output.entrySet()) {
////	    stmts.add(new Send(e.getKey()));
////	}*/
////
////	Label start = new Label();
////	stmts.add(start);
////	stmts.add(new Sync());
////
////	//DepGraph d = new DepGraph(eqs);
////	//for (String s : d.sort()) {
////	for(Equation eq:eqs){
////	
////	    //Expression e = eqs.get(s);
////
////	    //if (e != null) {
////		List<Statement> t = eq.toKrp();
////		stmts.addAll(t);
////		/*for (Variable v : e.getVars()) {
////		    if (v.getDelay() > 0) {
////			if (preVars.containsKey(v.getName())) {
////			    preVars.get(v.getName());
////			}else{
////			    preVars.put(v.getName(), v);
////			}
////		    }
////		}
////
////	    }*/
////	}
////	for(Entry<String, Variable> e: preVars.entrySet()){
////	   stmts.addAll(e.getValue().compilePre());   
////	}
////
////	stmts.add(new Jmp(start.toString()));
////    }
////
////    public String toKrp() {
////
////	boolean i = false;
////
////	if (stmts == null) {
////	    compile();
////	}
////
////	String res = new String();
////
////	for (Statement t : stmts) {
////	    if (t.getClass() == Label.class) {
////		res += Label.indent(((Label) t).toString() + ": ");
////		i = true;
////	    } else {
////		if (!i) {
////		    res += Label.indent();
////		}
////		res += t.toString() + "\n";
////		i = false;
////	    }
////	}
////
////	return res;
////    }
// //}
