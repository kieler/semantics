package ceq;

import java.util.HashMap;
import java.util.LinkedList;

import ceq.Variable.Kind;

import prog.Type;

import klp.instructions.CJmp;
import klp.instructions.Instruction;
import klp.instructions.Label;
import klp.instructions.Read;
import klp.instructions.CJmp.Cond;

public class Transition {
    private String target;
    private Expression trigger;
    
    public Transition(Expression trigger, String target){
    	this.trigger=trigger;
    	this.target=target;
    }
    
    public String toString(){
    	String res = "if " + trigger.toString() + " restart " + target;
    	return res;
    }

    public String getTarget(){
	return target;
    }
    
    public LinkedList<Instruction> compile(String ssm, String source, String suffix) {
	LinkedList<Instruction> res = new LinkedList<Instruction>();
	Read r;
	if(trigger instanceof VarAccess){
	    r = new Read((VarAccess)trigger);
	}else{
	    Variable v = Variable.get(ssm, Kind.LOCAL, Type.BOOL);
	    res.addAll(trigger.toKlp(v));
	    r=new Read(v, false);
	}
	res.add(new CJmp(Cond.T, r, Label.get(source + "2" + target+suffix)));	
	return res;
    }

    public void replace(HashMap<String, Variable> equiv) {
	trigger.replaceVar(equiv);
	
    }
}
