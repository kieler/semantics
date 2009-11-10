package lustre;

import java.util.HashMap;
import prog.Type;

/**
 * @author ctr
 * a Lustre variable This is used both for declaration and access of a variable
 */
public class Variable {

    private static HashMap<String, Integer> temps = new HashMap<String, Integer>();
    private static HashMap<String, Variable> vars = new HashMap<String, Variable>();
    
    private Type type;
    private ClockList clock;
    private String name;
    
    /**
     * @param name name of the variable
     * @param t type of the variable
     * This assumes that the variable runs on the base clock.
     */
    public Variable(String name, Type t) {
	this(name, t, null);

    }
    /**
     * @param name name of the variable
     * @param t type of the variable
     * @param clock clock on which this variable runs
     */
    public Variable(String name, Type t, String clock) {
	//super(name);
	this.name=name;
	if(vars.containsKey(name)){
	    System.err.println("Variabel " + name + " allready defined");
	}
	this.type = t;
	this.clock=new ClockList();
	if(clock!=null){
	    this.clock.addClock(clock);
	}
	vars.put(name, this);
    }
    
    /**
     * @param clock on which the variable shall run
     */
    public void setClock(String clock){
	if(clock!=null){    
	    this.clock.addClock(clock);
	}
    }

    @Override
    public String toString() {
	return name;
    }

    public String getName(){
	return name;
    }
    
    public Type getType(){
	return type;
    }
    
    public ClockList getClock(){
	return clock;
    }
    
    /**
     * @param prefix prefix of the temporary variable
     * @return a new variable with a unique name
     */
    public static Variable getTemp(String prefix, Type type, String clock) {
	if (!temps.containsKey(prefix)) {
	    temps.put(prefix, 0);
	}
	temps.put(prefix, temps.get(prefix) + 1);

	return new Variable(prefix + "_" + temps.get(prefix), type, clock);
    }

    public static Variable get(String name) {
	Variable res = vars.get(name);
	if(res==null){
	    System.err.println("Variable " + name + " not defined");
	    return new Variable(name, Type.INT);	    
	}else{
	    return res;
	}
    }

    
    public boolean equals(final Variable v){
	return name.equals(v.name);
    }
}
