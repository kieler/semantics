package lustre;

import helper.Debug;

import java.util.HashMap;
import java.util.LinkedList;

import prog.Type;
import exceptions.ClockException;
import exceptions.TypeException;

import krp.statement.*;

/**
 * @author ctr Lustre binary expression this includes when and ->
 */
public class Init extends Expression {
    private Expression e1, e2;

    /**
     * generate new binary operation
     * 
     * @param name
     *            of the expression
     * @param e1
     * @param e2
     * @param op
     */
    public Init(String name, Expression e1, Expression e2) {
	super(name);
	this.e1 = e1;
	this.e2 = e2;
    }

    @Override
    public String toString() {
	return "(" + e1.toString() + " -> " + e2.toString() + ")";
    }

    @Override
    public boolean isAtom() {
	return false;
    }

//    @Override
//    public ceq.Expression toCEQ() {
//	ceq.Expression res = null;
//	System.err.println("found nested init in ceq: " + toString());
//	System.exit(1);
//	return null;
//    }

    @Override
    protected void inferType() throws TypeException {
	e1.inferType();
	Type t1 = e1.type;
	e2.inferType();
	Type t2 = e2.type;
	if (t1 == t2) {
	    type = t1;
	} else {
	    throw new TypeException(this, "T x T", t1.toString() + " x "
		    + t2.toString());
	}
    }

    @Override
    public Expression propagatePre(HashMap<String, Expression> eqs) {
	e1 = e1.propagatePre(eqs);
	e2 = e2.propagatePre(eqs);
	return this;
    }

    @Override
    public ClockList inferClock(HashMap<String, Variable> env) throws ClockException {
	ClockList l1 = e1.inferClock(env);
	ClockList l2 = e2.inferClock(env);
	if (!l1.equals(l2)) {
	    throw new ClockException(this, l1, l2);
	}
	clock = l1;
	return clock;
    }

    @Override
    public void propagateClock(ClockList l) {
	clock = l.clone();
	e1.propagateClock(clock);
	e2.propagateClock(clock);
	Debug.low(clock.toString() + " " + this.toString());
    }

    @Override
    public ceq.Equation declock(String basename, int stage, String C,
	    LinkedList<ceq.Equation> aux) {
	ceq.Equation eq1 = e1.declock(basename, 3, C, aux);
	ceq.Equation eq2 = e2.declock(basename, 3, C, aux);
	if (e1.isAtom()) {
	    eq2.setInit(eq1.getExpr());
	    //e2.clock = this.clock;
	} else {
	    ceq.Variable v = ceq.Variable.getTemp(basename, type);
	    if(C!=null){
		eq1.setClock(C);
	    }
	    eq1.setName(v.getName());
	    aux.add(eq1);
	    eq2.setInit(new ceq.VarAccess(v, false));
	}
	if (stage < 3) { // not inside init
	    return eq2;
	} else {
	    ceq.Variable v =ceq.Variable.getTemp(basename, type);
	    if(C!=null){
		eq2.setClock(C);
	    }
	    eq2.setName(v.getName());
	    aux.add(eq2);
	    return new ceq.Equation(name, new ceq.VarAccess(v, false));
	}
    }

    @Override
    public Expression liftClock() {
	e1 = e1.liftClock();
	e2 = e2.liftClock();
	if (e1 instanceof When && e2 instanceof When) {
	    When w1 = (When) e1;
	    When w2 = (When) e2;
	    if (w1.sameClock(w2)) {
		e1 = w1.getExpression();
		e2 = w2.getExpression();
		w1.setExpression(this);
		return w1;
	    } else {
		return this;
	    }
	} else {
	    return this;
	}
    }

    @Override
    public Expression extractPre(HashMap<String, Expression> eqs) {
	e1=e1.extractPre(eqs);
	e2=e2.extractPre(eqs);
	return this;
    }
}
