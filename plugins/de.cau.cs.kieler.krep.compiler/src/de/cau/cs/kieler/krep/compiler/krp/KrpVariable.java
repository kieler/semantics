package de.cau.cs.kieler.krep.compiler.krp;
//package krp;
//
//import java.util.HashMap;
//
//import prog.Type;
//import ceq.Variable;
//import ceq.Variable.Kind;
//
//public class KrpVariable extends Variable {
//
//    private Integer busID;
//    private Integer core;
//    
//    private static HashMap<String, KrpVariable> vars = new HashMap<String, KrpVariable>();
//    
//    private KrpVariable(String name, Kind kind, Type type, String clock) {
//	super(name, kind, type, clock);
//	vars.put(this.name, this);
//    }
//
//    public static KrpVariable get(String name, Type type, String clock){
//	if(vars.containsKey(name)){
//	    System.err.println("variable " + name + " already defined!");
//	    return null;
//	}
//	else return new KrpVariable(name, Kind.LOCAL, type, clock);
//    }
//    
//    public static KrpVariable get(String name){
//	KrpVariable res = vars.get(name);
//	if(res==null){
//	    System.err.println("variable " + name + " not defined!");
//	    
//	}
//	return res;
//    }
//    
//    public Integer getBusID() {
//        return busID;
//    }
//
//
//    public void setBusID(Integer busID) {
//        this.busID = busID;
//    }
//
//
//    public Integer getCore() {
//        return core;
//    }
//
//
//    public void setCore(Integer core) {
//        this.core = core;
//    }
//
//}
