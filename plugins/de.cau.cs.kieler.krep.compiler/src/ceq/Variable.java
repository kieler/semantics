package ceq;

import java.util.HashMap;

import klp.Klp;
import klp.instructions.Label;

import prog.Type;

/**
 * @author ctr A Variable declaration ceq.
 */
public class Variable {

	/**
	 * @author ctr
	 * Kind of variable, input, output, local or temp
	 */
	public enum Kind {
		/**
		 * 	input variable
		 */
		INPUT, 
		/**
		 * output variable
		 */
		OUTPUT,
		/**
		 * local variable
		 */
		LOCAL, 
		/**
		 * temporary variable, without pre value 
		 */
		TEMP
	}

	private String name;

	private Type type;

	private Kind kind;

	private int id;
	
	/** core on which this variable is computed */
	//public Integer core = null;
	
	/** delay between computation of the variable and the global input*/ 
	//public Integer delay = null;

	private static HashMap<String, Variable> vars = new HashMap<String, Variable>();

	private static HashMap<String, Integer> temps = new HashMap<String, Integer>();
	
	//private static int[] nClock = new int[] {0,0,2,0};
	/** count number of variables for each kin */ 
	private static int[] nValue = new int[] {0,0,0,0};

	
	private int getKindId(final Kind k){
		switch(k){
		case INPUT: return 0;
		case OUTPUT: return 1;
		case LOCAL: return 2;
		case TEMP: return 3;
		}
		return 0;
	}

	/**
	 * generate new Variable declaration
	 * 
	 * @param name
	 *            name of the variable
	 * @param kind
	 * 			  kind of the variable 
	 * @param type
	 *            type of the variable
	 * @param clock
	 */
	public Variable(String name, Kind kind, Type type) {
		super();
		this.name = name;
		this.kind = kind;
		this.type = type;
		id=nValue[getKindId(kind)]++;
		if(vars.containsKey(name)){
		    System.err.println("variable " + name + " already defined");
		}
		vars.put(name, this);
	}

	
	
	/**
	 * Create Variable with the same information as an existing Lustre Variable
	 * @param var lustre variable
	 * @param kind 
	 */
	public Variable(final lustre.Variable var, final Kind kind){
	    this(var.getName(), kind, var.getType()); 
	}

	/**
	 * implement singleton pattern
	 * @param name name of the variable
	 * @param t type of the variable
	 * @return variable with same name if it exists, new temp variable otherwise
	 */
	public static Variable get(String name) {
	    Variable v = vars.get(name);
	    if(v==null){
		System.err.println("variable " + name + " not defined");
	    }
	    return v;
	}
	
	public static Variable get(String name, Kind kind, Type type) {
	    Variable v = vars.get(name);
	    if(v==null){
		v = new Variable(name, kind, type);
		
	    }
	    return v;
	}
	
	
	/**
	 * @return variable kind, ie, input, output, local or temp
	 */
	public Kind getKind() {
		return kind;
	}

	/**
	 * @return type of the variable
	 */
	public Type getType() {
		return type;
	}

	@Override
	public String toString() {
		return name + ": " + type;
	}

	/**
	 * @return name of the variable
	 */
	public String getName() {
		return name;
	}

	
	/**
	 * @return true if the variable is an input
	 */
	public boolean isInput() {
		return kind == Kind.INPUT;
	}

	/**
	 * @return true if the variable is an output
	 */
	public boolean isOutput() {
		return kind == Kind.OUTPUT;
	}

	/**
	 * @return true if the variable is local
	 */
	public boolean isLocal() {
		return kind == Kind.LOCAL;
	}

	/**
	 * @return true if the variable is only temporary defined
	 */
	public boolean isTemp() {
		return kind == Kind.TEMP;
	}
	
	
	/**
	 * @param clock clock on which the variable runs
	 * @return KLP assembler to initialize variable
	 */
	public String toKlp(String clock) {
	    String res = "";
	    switch(kind){
	    case INPUT:
	      res += "  INPUT\t\t" + name + "\n";
	      break;
	    case OUTPUT:
		      res += "  OUTPUT\t" + name + "\n";
		      break;	 
	    case LOCAL:
		      res += "  LOCAL\t\t" + name + "\n";
		      break;
	    case TEMP: // no need to initialze
		break;
	      
	    }
	    if(kind == Kind.LOCAL || kind == Kind.OUTPUT){
		res += "  INIT";
		switch(type){
		case BOOL: res+= "C";break;
		case INT: res+="V"; break;
		case REAL: break;
		}
		res += "\t" + name;
		res += "\t" + Label.get(name).getName();
		res += "\t" + (clock==null?"":clock);
	    }
	    return res;
	}

	/**
	 * give register id of this variable
	 * @return register id
	 */
	public int getId(){
		int i=0;
		switch(kind){
		case INPUT: i=0; break;
		case OUTPUT: i=Klp.N_IO; break;
		case LOCAL: i=2*Klp.N_IO; break;
		case TEMP: i=2*Klp.N_IO + Klp.N_LOCAL; break;
		}
		return id+i;
	}

	/**
	 * @param prefix of the temporary variable
	 * @param type of the new variable
	 * @return new temporary variable
	 */
	public static Variable getTemp(final String prefix, final Type type) {
	    Integer i =temps.get(prefix);
	    if(i==null){
		i=0;
	    }
	    String temp = prefix + "_" + i;
	    i++;
	    temps.put(prefix, i);
	    Variable v = vars.get(temp);
	    if( v!=null){
		return v;
	    }else{
		return new Variable(temp, Kind.LOCAL, type);
	    }
	}

	public static void destroyTemp(final String prefix){
	    Integer i =temps.get(prefix);
	    if(i==null){
		i=1;
	    }
	    i--;
	    temps.put(prefix, i);  
	}
	
	public static int getMax() {
	    return vars.size();
	}
}
