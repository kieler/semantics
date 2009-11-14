package de.cau.cs.kieler.krep.compiler.prog;

/*package program;

 import helper.Debug;

 import java.io.IOException;
 import java.io.InputStream;
 import java.util.ArrayList;

 import java.util.Map.Entry;

 import lustre.Expression;
 import lustre.Lustre;

 import parser.*;

 import dependencies.Cluster;
 import dependencies.DepGraph;

 import lustre.*;

 public class Program {

 private Lustre prog=null;

 private ArrayList<Core> cores = new ArrayList<Core>();

 private DepGraph depGraph = null;

 public Program(InputStream in) {
 super();
 try{
 prog = new Lustre(in);
 //	    depGraph = prog.getDepGraph();
 }catch(IOException e){
 e.printStackTrace();
 }
 }

 public void compile(int n) {
 for (int i = 0; i < n; i++) {
 cores.add(new Core("Core" + i));
 }

 depGraph.split(n);
 Cluster cluster = depGraph.getCluster();
 /*for (Entry<String, Expression> e : prog.getEqs().entrySet()) {
 String v1 = e.getKey();	    
 if(prog.output.containsKey(e.getKey())){
 cores.get(cluster.getID(v1)-1).addOutput(v1, Type.INT) ;
 }
 Debug.low(v1 + ": " + cluster.getID(v1));
 for (Variable dep : e.getValue().getVars()) {
 String v2 = dep.getName();
 int target = cluster.getID(v1);
 int source = cluster.getID(v2);
 if (source != target) {
 int delay = cluster.getDelay(v1) - cluster.getDelay(v2);
 e.getValue().delay(delay, v2);
 if (source != 0) {
 cores.get(source - 1).addOutput(v2, Type.INT);
 }
 if (target != 0) {
 cores.get(target - 1).addInput(v2, Type.INT);
 }
 }
 }
 }*/
/*
 * for (Entry<String, Expression> e : prog.getEqs().entrySet()) { int id =
 * cluster.getID(e.getKey()); if (id != 0) { cores.get(id - 1).addEq(e.getKey(), e.getValue()); } }
 * 
 * for (Core c : cores) { c.compile(); }
 * 
 * }
 * 
 * public String toDot() { return depGraph.toDot(); }
 * 
 * public String toLus() { return prog.(); }
 * 
 * public String toKrp() { String res = new String(); /*for (Entry<String, Type> i :
 * prog.getInputs().entrySet()) { res += "INPUT " + i.getKey() + "\n"; } for (Entry<String, Type> i
 * : prog.getOutputs().entrySet()) { res += "OUTPUT " + i.getKey() + "\n"; } res += "\n";
 * 
 * for (Core c : cores) { res += "_PROC\n"; res += c.toKrp() + "\n"; } return res; }
 * 
 * }
 */
