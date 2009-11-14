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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import de.cau.cs.kieler.krep.compiler.ceq.Equation;
import de.cau.cs.kieler.krep.compiler.ceq.Program;
import de.cau.cs.kieler.krep.compiler.ceq.Variable;

/**
 * @author ctr KRP instructions of a program
 */
public class Krp extends Program {
    // TODO restore KRP compiler

    private HashMap<String, Integer> delay = new HashMap<String, Integer>();

    private ArrayList<Program> cores = new ArrayList<Program>();

    public Krp(String name) {
        super(name);
    }

    public Krp(String name, Program p) {
        super(name, p);
    }

    public void compile(int n) {
        ArrayList<HashSet<String>> deps = new ArrayList<HashSet<String>>();
        HashMap<String, HashSet<Integer>> reader = new HashMap<String, HashSet<Integer>>();

        flatten();
        depGraph.split(n);

        // Fill delays
        for (Variable v : inputs) {
            delay.put(v.getName(), 0);
            reader.put(v.getName(), new HashSet<Integer>());
        }

        for (Equation eq : eqs) {
            String name = eq.getName();
            delay.put(name, depGraph.getCore(name) + 1);
            reader.put(name, new HashSet<Integer>());
        }

        for (int i = 0; i < n; i++) {
            cores.add(new Program(this.name + "_" + i));
            deps.add(new HashSet<String>());
        }

        // padDelay;
        for (Equation eq : eqs) {
            eq.padDelay(delay);
        }

        for (Equation eq : eqs) {
            String name = eq.getName();
            for (String v : eq.getPDeps()) {
                reader.get(v).add(depGraph.getCore(name));
            }
        }

        for (Equation eq : eqs) {
            String name = eq.getName();
            int d = delay.get(name);
            Program c = cores.get(d - 1);
            c.addEq(eq);
        }

        // fix IO
        locals.clear();
        for (Entry<String, HashSet<Integer>> e : reader.entrySet()) {
            String name = e.getKey();
            int writer = depGraph.getCore(name);
            HashSet<Integer> read = e.getValue();
            Variable v = Variable.get(name);

            if (v.isLocal() && read.size() == 1 && read.iterator().next() == writer) {
                // local in one corelus2ec
                cores.get(writer).addLocal(v);
            } else {
                if (!v.isInput()) {
                    cores.get(writer).addOutput(v);
                    if (!v.isOutput()) {
                        locals.add(v);
                    }
                }
                for (int i : read) {
                    if (v.isInput() || i != writer) {
                        cores.get(i).addInput(v);
                    }
                }
            }
        }
    }

    public String toDot() {
        return depGraph.toDot(true);
    }

    public String printMain() {
        String res = "";
        // main node
        res += "node " + name + "_krp (\n";
        for (Variable v : inputs) {
            res += "  " + v.getName() + ": " + v.getType() + ";\n";
        }
        res += ") returns (\n";
        for (Variable v : outputs) {
            res += "  " + v.getName() + ": " + v.getType() + ";\n";
        }
        res += ");\n";
        if (locals.size() > 0) {
            res += "var\n";
        }
        for (Variable v : locals) {
            res += "  " + v.getName() + ":" + v.getType().toString() + ";\n";
        }
        res += "let\n";

        for (int i = 0; i < cores.size(); i++) {
            Program p = cores.get(i);
            res += "  (";
            for (Variable v : p.getOutputs()) {
                res += v.getName();
                if (v != p.getOutputs().getLast()) {
                    res += ",";
                }
            }
            res += ") = " + p.getName() + "(";

            for (Variable v : p.getInputs()) {
                res += "pre(" + v.getName() + ")";
                if (v != p.getInputs().getLast()) {
                    res += ",";
                }
            }
            res += ");\n";
        }
        res += "tel\n";
        return res;
    }

    public String toLus(int i) {
        return cores.get(i).toLustre() + "\n";
    }
}
