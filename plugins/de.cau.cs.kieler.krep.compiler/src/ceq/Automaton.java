package ceq;

import java.util.HashMap;
import java.util.LinkedList;

import ceq.Variable.Kind;
import dependencies.DepGraph;

import klp.instructions.Comment;
import klp.instructions.DeclareReg;
import klp.instructions.InitReg;
import klp.instructions.Instruction;
import klp.instructions.Label;
import klp.instructions.Prio;

public class Automaton {
    private String name;
    
    private State initial;
    
    private LinkedList<State> states = new LinkedList<State>();
    
    private LinkedList<Variable> inputs = new LinkedList<Variable>();

    private LinkedList<Variable> outputs = new LinkedList<Variable>();
    
    public LinkedList<Variable> getInputs() {
        return inputs;
    }

    public LinkedList<Variable> getOutputs() {
        return outputs;
    }

    public Automaton(String name){
	this.name=name;
    }
    
    public String getName(){
	return name;
    }
    
    public String toString(){
	String res = "automaton " + name + "\n";
	for(State s: states){
	    res += s.toString() + "\n";
	}
	return res;
    }
    
    public void add(State s){
    	states.add(s);
    	if (s.isInitial()){
    	    initial=s;
    	}
    }

    public LinkedList<Instruction> compile(int prioOffset) {
	LinkedList<Instruction> res = new LinkedList<Instruction>();
	HashMap<String, State> name2state = new HashMap<String, State>();
	for(State s: states){
	    name2state.put(s.getName(), s);
	}
	
	// Controller
	//res.add(Label.get(name));
	for (State s: states){
	    res.add(Label.get(name + "_" + s.getName()));
	    res.getLast().setComment("Controller for state " + s.getName());
	    res.addAll(s.compileCtrl(name, name2state, prioOffset));
	}
	
	
	// State Body
	for(State s: states){
	    res.add(new Comment("Equations inside " + s.getName()));
	    res.addAll(s.compileBody());
	}
	
	return res;
    }

    public void propagateConst() {
	for(State s:states){
	    s.propagateConst();
	}
	
    }

    public void simplify() {
	for(State s:states){
	    s.simplify();
	}
	
    }

    public String getKlpHeader() {
	String res = "  LOCAL " + name + "\n";
	
	return res;
    }

    public void setIO() {
	for(State s: states){
	    s.setIO();
	}
	inputs.addAll(initial.getInputs());
	outputs.addAll(initial.getOutputs());
	
    }

    public LinkedList<Instruction> compileInit(boolean setInputs, boolean setOutputs, int prioOffset) {
	LinkedList<Instruction> res = new LinkedList<Instruction>();
	if(setInputs){
	    res.add(new DeclareReg(name, Kind.LOCAL));
	    res.add(new InitReg(name, Kind.LOCAL, name + "_" + initial.getName(), null));
	}
	res.add(new Prio(name, initial.getMaxPrio()));
	res.addAll(initial.compileInit(setInputs, setOutputs, prioOffset));
	return res;
    }
    
    void init(){
	for (State s: states){
	    s.init();
	}
    }

    public DepGraph getDepGraph() {
	return initial.getDepGraph();
    }

    public void replace(HashMap<String, Variable> equiv) {
	LinkedList<Variable> tmp= new LinkedList<Variable>();
	for(Variable v: inputs){
	    if(equiv.containsKey(v.getName())){
		tmp.add(equiv.get(v.getName()));
	    }else{
		tmp.add(v);
	    }
	}
	inputs=tmp;
	tmp = new LinkedList<Variable>();
	for(Variable v: outputs){
	    if(equiv.containsKey(v.getName())){
		tmp.add(equiv.get(v.getName()));
	    }else{
		tmp.add(v);
	    }
	}
	outputs=tmp;
	for(State s: states){
	    s.replace(equiv);
	}
    }
    
}
