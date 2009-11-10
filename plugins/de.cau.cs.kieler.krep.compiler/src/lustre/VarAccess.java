package lustre;

import helper.Debug;

import java.util.HashMap;
import java.util.LinkedList;

import exceptions.ClockException;
import exceptions.TypeException;

public class VarAccess extends Expression{

    private Variable var;
    
    
    public VarAccess(String name){
	this(Variable.get(name));
    }
    
    public VarAccess(Variable v){
	super(v.getName());
	this.var=v;
	this.type=var.getType();
	this.clock=var.getClock().clone();
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

    @Override
    public String getName() {
	return name;
    }

    @Override
    public Expression propagatePre(HashMap<String, Expression> eqs) {
	return new Pre("pre_" + this.name, this);
    }

    @Override
    public boolean isAtom() {
	return true;
    }

    
//    @Override
//    public ceq.Expression toCEQ() {
//	if(name.equals("false")){
//	    return new ceq.Const(name, false);
//	}else if(name.equals("true")){
//	    return new ceq.Const(name, true);    
//	}else{
//	    return new ceq.VarAccess(ceq.Variable.get(var.getName()), false);
//	}
//    }
   
    @Override
    protected void inferType() throws TypeException {
	// Noting to do, type defined by constructor
    }

    @Override
    public ClockList inferClock(HashMap<String, Variable> env) throws ClockException  {
	clock = var.getClock().clone();// new ClockList();
	return new ClockList();
    }
    
    @Override
    public void propagateClock(ClockList l) {
	clock=l.clone();
	Debug.low(clock.toString() + " " + this.toString());
    }
    
    @Override
    public ceq.Equation declock(String basename, int stage, String C,
	    LinkedList<ceq.Equation> aux) {
	    return new ceq.Equation(name, new ceq.VarAccess(ceq.Variable.get(var.getName()), false));
    }
    
    @Override
    public Expression liftClock() {
	if(!clock.isBase()){
	    return new When(this.name, this, new VarAccess(Variable.get(clock.getClock())));
	}else{
	    return this;
	}
    }
    
    public boolean equals(final VarAccess v){
	return v.var.equals(var);
    }

    @Override
    public Expression extractPre(HashMap<String, Expression> eqs) {
	return this;
    }
}
