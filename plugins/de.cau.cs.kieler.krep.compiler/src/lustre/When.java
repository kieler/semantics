package lustre;

import helper.Debug;

import java.util.HashMap;
import java.util.LinkedList;

import prog.Type;
import exceptions.ClockException;
import exceptions.TypeException;

/**
 * @author ctr Lustre binary expression this includes when and ->
 */
public class When extends Expression {
    private Expression e;

    private VarAccess c;

    /**
     * generate new binary operation
     * 
     * @param name
     *            of the expression
     * @param e
     * @param c
     */
    public When(String name, Expression e, VarAccess c) {
	super(name);
	this.e = e;
	this.c = c;
    }

    @Override
    public String toString() {
	return "(" + e.toString() + " when " + c.toString() + ")";
    }

    @Override
    public boolean isAtom() {
	return false;
    }

//    @Override
//    public ceq.Expression toCEQ() {
//	ceq.Expression res = null;
//	System.err.println("found nestet when in ceq: " + toString());
//	System.exit(1);
//	return res;
//    }

    @Override
    protected void inferType() throws TypeException {
	e.inferType();
	Type t1 = e.type;
	c.inferType();
	Type t2 = c.type;

	if (t2 == Type.BOOL) {
	    type = t1;
	} else {
	    throw new TypeException(c, "BOOL", t2.toString());
	}

    }

    @Override
    public Expression propagatePre(HashMap<String, Expression> eqs) {
	e = e.propagatePre(eqs);
	return this;
    }

    @Override
    public ClockList inferClock(HashMap<String, Variable> env) throws ClockException {
	ClockList l1 = e.inferClock(env);
	ClockList l2 = c.inferClock(env);
	if (!l1.equals(l2)) {
	    throw new ClockException(this, l1, l2);
	}
	clock = l1.clone();
	clock.addClock(c.getName());
	return clock;
    }

    @Override
    public void propagateClock(ClockList l) {
	clock = l.clone();
	ClockList c2 = clock.clone();
	c2.addClock(c.getName());
	e.propagateClock(c2);
	c.propagateClock(clock);

	Debug.low(clock.toString() + " " + this.toString());
    }

    @Override
    public ceq.Equation declock(String basename, int stage, String C,
	    LinkedList<ceq.Equation> aux) {
	ceq.Equation res = e.declock(basename, 2, c.getName(), aux);
	if (stage < 2) { // not inside when
	    res.setClock(c.getName());
	    return res;
	} else {
	    ceq.Variable v = ceq.Variable.getTemp(basename, type);
	    //, clock.getClock());
	    
	    res.setName(v.getName());
	    aux.add(res);
	    return new ceq.Equation(name, null, new  ceq.VarAccess(ceq.Variable.get(v.getName()), false), c.getName());
	}
    }

    @Override
    public Expression liftClock() {
	e=e.liftClock();
	return this;
    }
    public void setExpression(Expression e) {
	this.e=e;	
    }
    
    public Expression getExpression() {
	return e;
    }
    
    public boolean sameClock(When w){
	return c.equals(w.c);
    }

    @Override
    public Expression extractPre(HashMap<String, Expression> eqs) {
	e=e.extractPre(eqs);
	return this;
    }
}
