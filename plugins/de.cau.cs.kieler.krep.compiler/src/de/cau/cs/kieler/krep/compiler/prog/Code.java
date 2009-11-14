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
package de.cau.cs.kieler.krep.compiler.prog;

/*package program;

 import java.util.HashMap;
 import java.util.LinkedList;
 import java.util.Map.Entry;

 import lustre.Expression;
 import lustre.Variable;

 public abstract class Code {
 // public

 protected Code(String name) {
 super();
 this.name = name;
 }

 /*    public void addEq(String v, Expression e) {
 eqs.put(v, e);
 }

 public void addInput(String v, Type t) {
 input.add(new Variable(v, t));
 }

 public void addOutput(String v, Type t) {
 output.add(new Variable(v, t));
 }*/
/*
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

 protected String name;

 protected HashMap<String, Expression> eqs = new HashMap<String, Expression>();
 protected HashMap<String, Variable> vars = new HashMap<String, Variable>();

 protected LinkedList<Variable> input = new LinkedList<Variable>();

 protected LinkedList<Variable> output = new LinkedList<Variable>();

 protected LinkedList<Variable> local = new LinkedList<Variable>();

 }*/
