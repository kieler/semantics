package de.cau.cs.kieler.krep.compiler.ceq;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.krep.compiler.klp.instructions.*;
import de.cau.cs.kieler.krep.compiler.lustre.Operator;
import de.cau.cs.kieler.krep.compiler.prog.Type;



/**
 * @author ctr
 * boolean not
 */
public class Not extends Expression {
    private Expression e;

    /**
     * @param name name of the expression
     * @param e sub-expression that is negated
     */
    public Not(final String name, final Expression e) {
	super(name);
	this.e = e;
    }

    @Override
    public List<String> getVars() {
	return e.getVars();
    }

    @Override
    public List<Variable> getDeps() {
	return e.getDeps();
    }

    @Override
    public String toString() {
	return "(not " + e.toString() + ")";
    }

    @Override
    public Expression flatten(String name, HashMap<String, Variable> vars,
	    LinkedList<Expression> es) {
	if (e.isAtom()) {
	    return this;
	} else {
	    e = e.flatten(name, vars, es);
	    Variable t = Variable.getTemp(name, e.getType());
	    es.add(e);
	    return new Not(t.getName(), new VarAccess(t, false));
	}
    }

    @Override
    public boolean isAtom() {
	return false;
    }

    @Override
    public LinkedList<Instruction> toKlp(Variable r) {
	LinkedList<Instruction> instr = new LinkedList<Instruction>();
	if (!(e instanceof VarAccess)) {
	    //Variable v = Variable.getTemp(name, e.getType());    
	    //VarAccess va = new VarAccess(v, false);
	    instr.addAll(e.toKlp(r));
	    instr.add(new IBinOp(r, new Read(new VarAccess(r, false)), 1, Operator.XOR));
	   // System.err.println("Non trivial not:" + e.toString());
	} else {
	    VarAccess v = (VarAccess) e;
	    instr.add(new IBinOp(r, new Read(v), 1, Operator.XOR));
	}
	return instr;
    }

    @Override
    public Type getType() {
	return Type.BOOL;
    }
    
    @Override
    public Expression padDelay(HashMap<String, Integer> delay, int n) {
	e = e.padDelay(delay, n);
	return this;
    }

    @Override
    public Const propagateConst(HashMap<String, Const> con) {
	Const c = e.propagateConst(con);
	if(c==null){
	    return null;
	}else{
	    return new Const(c.name, c.getVal()==0?1:0);
	}
    }

    @Override
    public Expression staticEval() {
	e=e.staticEval();
	if(e instanceof Const){
	    Const c = (Const)e;
	   return  new Const(c.name, c.getVal()==0?1:0);
	}else{
	    return this;
	}
	
    }

    @Override
    public void replaceVar(HashMap<String, Variable> equiv) {
	e.replaceVar(equiv);
    }

    @Override
    public int wcrt() {
	if(e instanceof VarAccess){
	    return 1;
	}else{
	    return 1 + e.wcrt();
	}
    }

    @Override
    public Expression replace(String var, Expression expr) {
	e=e.replace(var, expr);
	return this;
    }
	
}
