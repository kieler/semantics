package lustre;

import helper.Debug;

import java.util.HashMap;
import java.util.LinkedList;

import exceptions.ClockException;
import exceptions.TypeException;

import prog.Type;

/**
 * @author ctr
 * Lustre "not" operator
 */
public class Not extends Expression {
    private Expression e;

    /**
     * @param name uniue name of the expression 
     * @param e expression to negate
     */
    public Not(String name, Expression e) {
	super(name);
	this.e = e;
    }

    @Override
    public String toString() {
	return "(not " + e.toString() + ")";
    }

    @Override
    public Expression propagatePre(HashMap<String, Expression> eqs) {
	e = e.propagatePre(eqs);
	return this;
    }

    @Override
    public boolean isAtom() {
	return false;
    }

//    @Override
//    public ceq.Expression toCEQ() {
//	return new ceq.Not(name, e.toCEQ());
//    }

    @Override
    protected void inferType() throws TypeException {
	e.inferType();
	type = e.type;
	if(type!=Type.BOOL){
	    throw new TypeException(e, Type.BOOL.toString(), e.type.toString());
	}
    }

    @Override
    public ClockList inferClock(HashMap<String, Variable> env) throws ClockException {
	clock = e.inferClock(env);
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
	ceq.Equation eq = e.declock(basename, 3, C, aux);
	return new ceq.Equation(name, new ceq.Not(name, eq.getExpr()));
	
    }

    @Override
    public Expression liftClock() {
	e = e.liftClock();
	if(e instanceof When){
	    When w = (When)e;
	    e=w.getExpression();
	    w.setExpression(this);
	    return w;
	}else{
	    return this;
	}
    }

    @Override
    public Expression extractPre(HashMap<String, Expression> eqs) {
	e=e.extractPre(eqs);
	return this;
    }
}
