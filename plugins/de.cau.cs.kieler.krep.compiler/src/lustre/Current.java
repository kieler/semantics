package lustre;

import helper.Debug;

import java.util.HashMap;
import java.util.LinkedList;

import exceptions.ClockException;
import exceptions.TypeException;

/**
 * Lustre clock operator current
 * @author ctr
 *
 */
public class Current extends Expression  {
 Expression e;
  
    /**
     * @param name unique name of this expression
     * @param e body of current expression
     */
    public Current(String name, Expression e){
	super(name);
	this.e=e;
    }
    
    @Override
    public String toString() {
	return "(current " + e.toString() + ")";
    }

    @Override
    public boolean isAtom() {
	return true;
    }

    @Override
    public Expression propagatePre(HashMap<String, Expression> eqs) {
	return  e.propagatePre(eqs);
    }

//    @Override
//    public ceq.Expression toCEQ() {
//	System.err.printf("found current inside ceq");
//	System.exit(1);
//	return null;
//    }


    @Override
    protected void inferType() throws TypeException {
	e.inferType();
	this.type=e.type;
    }

    @Override
    public ClockList inferClock(HashMap<String, Variable> env)  throws ClockException {
	clock= e.inferClock(env).clone();
	clock.removeClock();
	return clock;
    }

    @Override
    public void propagateClock(ClockList l) {
	clock=l.clone();
	e.propagateClock(clock);
	Debug.low(clock.toString() + " " + this.toString());
    }

    @Override
    public ceq.Equation declock(String basename, int stage, String C,
	    LinkedList<ceq.Equation> aux) {
	ceq.Equation res = e.declock(basename, 1, C, aux);
	if(stage==0){
	    if(!(e instanceof When)){
		System.err.println("internal error: no when inside current");
	    }
	    return res;
	}else{
	    ceq.Variable v = ceq.Variable.getTemp(basename, type);
	    res.setName(v.getName());
	    aux.add(res);
	    return new ceq.Equation(name, new ceq.VarAccess(v, false));
	}
    }

    @Override
    public Expression liftClock() {
	e=e.liftClock();
	return this;
    }

    @Override
    public Expression extractPre(HashMap<String, Expression> eqs) {
	e=e.extractPre(eqs);
	return this;
    }
}
