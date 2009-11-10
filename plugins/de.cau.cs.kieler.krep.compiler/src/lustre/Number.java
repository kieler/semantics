package lustre;

import helper.Debug;

import java.util.HashMap;
import java.util.LinkedList;

import prog.Type;

import exceptions.ClockException;
import exceptions.TypeException;

/**
 * @author ctr
 * integer constant in a Lustre program
 */
public class Number extends Expression {
    int num;

    /**
     * @param name unique name fo the expression
     * @param num constant value
     */
    public Number(String name, int num) {
	super(name);
	this.num = num;
	this.type = Type.INT;
    }
    
    public Number(String name, boolean val) {
	super(name);
	this.num = val?1:0;
	this.type = Type.BOOL;
    }

    @Override
    public String toString() {
	return String.valueOf(num);
    }

    @Override
    public Expression propagatePre(HashMap<String, Expression> eqs) {
	return this;
    }

    @Override
    public boolean isAtom() {
	return true;
    }

//    @Override
//    public ceq.Expression toCEQ() {
//	ceq.Expression res = null;
//	switch(type){
//	case BOOL: res = new ceq.Const(name, num!=0); break;
//	case INT: res = new ceq.Const(name, num); break;
//	case REAL: break;
//	}
//	return res;
//    }

    @Override
    protected void inferType() throws TypeException {
	// nothing to do
    }

    @Override
    public ClockList inferClock(HashMap<String, Variable> env) throws ClockException {
	clock= new ClockList();	
	return clock;
    }

    @Override
    public void propagateClock(ClockList l) {
	clock=l.clone();
	Debug.low(clock.toString() + " " + this.toString());
    }

    @Override
    public ceq.Equation declock(String basename, int stage, String C,
	    LinkedList<ceq.Equation> aux) {
	return new ceq.Equation(name, new ceq.Const(name, num));
    }

    @Override
    public Expression liftClock() {
	return this;
    }

    @Override
    public Expression extractPre(HashMap<String, Expression> eqs) {
	return this;
    }
}
