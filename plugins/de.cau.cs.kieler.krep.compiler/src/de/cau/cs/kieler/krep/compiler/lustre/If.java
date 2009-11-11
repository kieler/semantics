package de.cau.cs.kieler.krep.compiler.lustre;


import java.util.HashMap;
import java.util.LinkedList;

import de.cau.cs.kieler.krep.compiler.exceptions.ClockException;
import de.cau.cs.kieler.krep.compiler.exceptions.TypeException;
import de.cau.cs.kieler.krep.compiler.helper.Debug;
import de.cau.cs.kieler.krep.compiler.prog.Type;



/**
 * @author ctr
 * Lustre IF Expression
 */
public class If extends Expression {
    private Expression e1, e2, e3;

    /**
     * @param name unique name of this expression
     * @param e1 boolean expression to test
     * @param e2 expression to evaluate in then case
     * @param e3 expression to evaluate in else case
     */
    public If(String name, Expression e1, Expression e2, Expression e3) {
	super(name);
	this.e1 = e1;
	this.e2 = e2;
	this.e3 = e3;
    }

    @Override
    public String toString() {
	return "if " + e1.toString() + " then " + e2.toString() + " else "
		+ e3.toString();
    }


    @Override
    public Expression propagatePre(HashMap<String, Expression> eqs) {
	e1 = e1.propagatePre(eqs);
	e2 = e2.propagatePre(eqs);
	e3 = e3.propagatePre(eqs);
	return this;
    }

    @Override
    public boolean isAtom() {
	return false;
    }

//    @Override
//    public ceq.Expression toCEQ() {
//	return new ceq.If(name, e1.toCEQ(), e2.toCEQ(), e3.toCEQ());
//    }

    @Override
    protected void inferType() throws TypeException {
	e1.inferType();
	e2.inferType();
	e3.inferType();
	if(e1.type!=Type.BOOL) {
	    throw new TypeException(e1, Type.BOOL.toString(), e1.type.toString());
	}
	if(e2.type!=e3.type){
	    throw new TypeException(this,
		    "BOOL x T x T",
		    e1.type.toString() + " x " + e2.type.toString() + " x " + e3.type.toString()); 
	}
	type=e2.type;
    }

    @Override
    public ClockList  inferClock(HashMap<String, Variable> env) throws ClockException {
	ClockList  l1 = e1.inferClock(env);
	ClockList  l2 = e2.inferClock(env);
	ClockList  l3 = e3.inferClock(env);
	if(!l1.equals(l2)){
	    throw new ClockException(this, l1, l2);
	}
	if(!l1.equals(l3)){
	    throw new ClockException(this, l1, l3);
	}
	clock=l1;
	return clock;
    }

    @Override
    public void propagateClock(ClockList l) {
	clock=l.clone();
	e1.propagateClock(clock);
	e2.propagateClock(clock);
	e3.propagateClock(clock);
	Debug.low(clock.toString() + " " + this.toString());
    }

    @Override
    public de.cau.cs.kieler.krep.compiler.ceq.Equation declock(String basename, int stage, String C,
	    LinkedList<de.cau.cs.kieler.krep.compiler.ceq.Equation> aux) {
	de.cau.cs.kieler.krep.compiler.ceq.Equation eq1=e1.declock(basename, 3, C, aux);
	de.cau.cs.kieler.krep.compiler.ceq.Equation eq2=e2.declock(basename, 3, C, aux);
	de.cau.cs.kieler.krep.compiler.ceq.Equation eq3=e3.declock(basename, 3, C, aux);
	return new de.cau.cs.kieler.krep.compiler.ceq.Equation(name, new de.cau.cs.kieler.krep.compiler.ceq.If(name, eq1.getExpr(), eq2.getExpr(), eq3.getExpr()));
    }

    @Override
    public Expression liftClock() {
	e1=e1.liftClock();
	e2=e2.liftClock();
	e3=e3.liftClock();
	if(e1 instanceof When && e2 instanceof When && e3 instanceof When){
	    When w1=(When)e1;
	    When w2=(When)e2;
	    When w3=(When)e3;
	    if(w1.sameClock(w2) && w1.sameClock(w3)){
		e1=w1.getExpression();
		e2=w2.getExpression();
		e3=w3.getExpression();
		w1.setExpression(this);
		return w1;
	    }else{
		return this;
	    }
	}else{
	    return this;
	}
    }

    @Override
    public Expression extractPre(HashMap<String, Expression> eqs) {
	e1=e1.extractPre(eqs);
	e2=e2.extractPre(eqs);
	e3=e3.extractPre(eqs);
	return this;
    }

}
