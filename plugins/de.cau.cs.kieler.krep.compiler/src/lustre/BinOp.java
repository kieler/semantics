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
public class BinOp extends Expression {
    private Expression e1, e2;

    private final Operator op;

    /**
     * generate new binary operation
     * 
     * @param name
     *            of the expression
     * @param e1
     * @param e2
     * @param op
     */
    public BinOp(String name, Expression e1, Expression e2, Operator op) {
	super(name);
	this.op = op;
	this.e1 = e1;
	this.e2 = e2;
    }

    @Override
    public String toString() {
	return "(" + e1.toString() + " " + op.toString() + " " + e2.toString()
		+ ")";
    }

    @Override
    public boolean isAtom() {
	return false;
    }

//    //@Override
//    public ceq.Expression toCEQ() {
//	ceq.Expression res = null;
//	return res;
//    }

    @Override
    protected void inferType() throws TypeException {
	e1.inferType();
	Type t1 = e1.type;
	e2.inferType();
	Type t2 = e2.type;
	switch (op) {
	case ADD:
	case SUB:
	case MUL:
	case DIV:
	case MOD:
	    if (t1 == Type.INT && t2 == Type.INT) {
		type = Type.INT;
	    } else {
		throw new TypeException(this, "INT x INT", t1.toString()
			+ " x " + t2.toString());
	    }
	    break;
	case AND:
	case OR:
	case XOR:
	case IMPL:
	    if (t1 == Type.BOOL && t2 == Type.BOOL) {
		type = Type.BOOL;
	    } else {
		throw new TypeException(this, "BOOL x BOOL", t1.toString()
			+ " x " + t2.toString());
	    }
	    break;

	case GE:
	case GT:
	case LE:
	case LT:
	    if (t1 == Type.INT && t2 == Type.INT) {
		type = Type.BOOL;
	    } else {
		throw new TypeException(this, "INT x INT", t1.toString()
			+ " x " + t2.toString());
	    }
	    break;
	case EQ:
	case NEQ:
	    if ((t1 == Type.INT && t2 == Type.INT)
		    || (t1 == Type.BOOL && t2 == Type.BOOL)) {
		type = Type.BOOL;
	    } else {
		throw new TypeException(this, "INT x INT", t1.toString()
			+ " x " + t2.toString());
	    }
	    break;
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
    public ceq.Equation declock(String basename, int stage, String clock,
	    LinkedList<ceq.Equation> aux) {
	    ceq.Equation eq1 = e1.declock(basename, 3, clock, aux);
	    ceq.Equation eq2 = e2.declock(basename, 3, clock, aux);
	    return new ceq.Equation(name, new ceq.BinOp(name, eq1.getExpr(), eq2.getExpr(), op));
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
