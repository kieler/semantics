package de.cau.cs.kieler.krep.compiler.ceq;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.krep.compiler.helper.Debug;
import de.cau.cs.kieler.krep.compiler.klp.instructions.*;
import de.cau.cs.kieler.krep.compiler.lustre.Operator;
import de.cau.cs.kieler.krep.compiler.prog.Type;



/**
 * @author ctr CEQ binary operations, this includes comparison, arithmetic and
 *         logic
 */
public class BinOp extends Expression {
    private Expression e1, e2;

    private Operator op;

    /**
     * construct binary operator
     * 
     * @param name
     *            name of this expression
     * @param e1
     *            first expression
     * @param e2
     *            second expression
     * @param op
     *            Operator
     */
    public BinOp(String name, Expression e1, Expression e2, Operator op) {
	super(name);
	this.e1 = e1;
	this.e2 = e2;
	this.op = op;
    }

    @Override
    public List<String> getVars() {
	List<String> res = e1.getVars();
	res.addAll(e2.getVars());
	return res;
    }

    @Override
    public List<Variable> getDeps() {
	List<Variable> res = e1.getDeps();
	res.addAll(e2.getDeps());
	return res;
    }

    @Override
    public Expression flatten(String name, HashMap<String, Variable> vars,
	    LinkedList<Expression> es) {
	boolean atom1 = e1.isAtom();
	boolean atom2 = e2.isAtom();
	Debug.low("flatten: " + toString());
	if (!atom1) {
	    Expression expr = e1.flatten(name, vars, es);
	    Variable v = Variable.getTemp(name, e1.getType());
	    vars.put(v.getName(), v);
	    VarAccess t = new VarAccess(v, false);
	    expr.name = t.getName();
	    Debug.low("flatten: " + expr.toString() + "->" + t.getName());
	    es.add(expr);
	    e1 = t;    
	}
	if (!atom2) {
	    Expression expr = e2.flatten(name, vars, es);
	    Variable v = Variable.getTemp(name, e2.getType());
	    vars.put(v.getName(), v);
	    VarAccess t = new VarAccess(v, false);
	    expr.name = t.getName();
	    es.add(expr);
	    e2 = t;
	}
	if (!atom1) {
	    Variable.destroyTemp(name);
	}
	if (!atom2) {
	    Variable.destroyTemp(name);
	}
	return this;
    }

    @Override
    public boolean isAtom() {
	return false;
    }

    @Override
    public Type getType() {
	Type res = null;
	switch (op) {
	case AND:
	case OR:
	case XOR:
	case LT:
	case LE:
	case EQ:
	case GE:
	case GT:
	case NEQ:
	case IMPL:
	    res = Type.BOOL;
	    break;
	case ADD:
	case SUB:
	case MUL:
	case DIV:
	case MOD:
	    res = Type.INT;
	    break;
	}
	return res;
    }

    @Override
    public LinkedList<Instruction> toKlp(Variable r) {
	LinkedList<Instruction> instr = new LinkedList<Instruction>();
	VarAccess v1 = null, v2 = null;
	Const c1 = null, c2 = null;
	if (e1 instanceof VarAccess) {
	    v1 = (VarAccess) e1;
	} else if (e1 instanceof Const) {
	    c1 = (Const) e1;
	}
	if (e2 instanceof VarAccess) {
	    v2 = (VarAccess) e2;
	} else if (e2 instanceof Const) {
	    c2 = (Const) e2;
	}

	if (v1 != null && v2 != null) {
	    instr.add(new de.cau.cs.kieler.krep.compiler.klp.instructions.BinOp(r, new Read(v1), new Read(v2),
		    op));
	} else if (v1 != null && c2 != null) {
	    instr.add(new de.cau.cs.kieler.krep.compiler.klp.instructions.IBinOp(r, new Read(v1), c2.getVal(),
		    op));
	} else if (c1 != null && v2 != null) {
	    instr.add(new de.cau.cs.kieler.krep.compiler.klp.instructions.IMov(r, c1.getVal()));
	    instr.add(new de.cau.cs.kieler.krep.compiler.klp.instructions.BinOp(r, new Read(r, false),
		    new Read(v2), op));
	} else if (v1 != null) {
	    instr.addAll(e2.toKlp(r));
	    instr.add(new de.cau.cs.kieler.krep.compiler.klp.instructions.BinOp(r, new Read(v1), new Read(r,
		    false), op));
	} else if (v2 != null) {
	    instr.addAll(e1.toKlp(r));
	    instr.add(new de.cau.cs.kieler.krep.compiler.klp.instructions.BinOp(r, new Read(r, false),
		    new Read(v2), op));
	} else if (c2 != null) {
	    instr.addAll(e1.toKlp(r));
	    instr.add(new de.cau.cs.kieler.krep.compiler.klp.instructions.IBinOp(r, new Read(r, false), c2
		    .getVal(), op));
	} else {
	    Variable var1 = Variable.getTemp(name, e1.getType());
	    VarAccess temp1 = new VarAccess(var1, false);
	    instr.addAll(e1.toKlp(var1));
	    Variable var2 = Variable.getTemp(name, e2.getType());
	    VarAccess temp2 = new VarAccess(var2, false);
	    instr.addAll(e2.toKlp(var2));
  
	    instr.add(new de.cau.cs.kieler.krep.compiler.klp.instructions.BinOp(r, new Read(temp1), new Read(temp2),
		    op));
	    Variable.destroyTemp(name);
	    Variable.destroyTemp(name);
	    //System.err.println("non trivial binary operator: " + toString());
	}
	return instr;
    }

    @Override
    public String toString() {
	return "(" + e1.toString() + " " + op.toString() + " " + e2.toString()
		+ ")";
    }

    @Override
    public Expression padDelay(HashMap<String, Integer> delay, int n) {
	e1 = e1.padDelay(delay, n);
	e2 = e2.padDelay(delay, n);
	return this;
    }

    @Override
    public Const propagateConst(HashMap<String, Const> con) {
	Const c1 = e1.propagateConst(con);
	Const c2 = e2.propagateConst(con);
	if (c1 != null) {
	    e1 = c1;
	}
	if (c2 != null) {
	    e2 = c2;
	}
	if (c1 != null && c2 != null) {
	    return new Const(name, Operator.eval(c1.getVal(), c2.getVal(), op));
	}
	return null;

    }

    @Override
    public Expression staticEval() {
	Expression res;
	Const c1 = null;
	Const c2 = null;
	e1 = e1.staticEval();
	e2 = e2.staticEval();
	if (e1 instanceof Const) {
	    c1 = (Const) e1;
	}
	if (e2 instanceof Const) {
	    c2 = (Const) e2;
	}
	if (c1 != null && c2 != null) {
	    return new Const(name, Operator.eval(c1.getVal(), c2.getVal(), op));
	} else if (c1 != null) {
	    switch(op){
	    case ADD: 
		if(c1.getVal()==0){
		    res= e2;
		}else{
		    res= this;
		}
		break;
	    case AND:
		if(c1.getVal()==0){
		    res= c1;
		}else{
		    res= e2;
		}
		break;
	    case OR:
		if(c1.getVal()==0){
		    res= e2;
		}else{
		    res= c1;
		}
		break;
	    case XOR:
		if(c1.getVal()==0){
		    res= e2;
		}else{
		    res= this;
		}
		break;
	    case IMPL:
		res=this;
		break;
	   default:
	       //SUB, MUL, DIV, MOD, LT, LE, EQ, GE, GT, NEQ;
	       res= this;
	    
	    }
	} else if (c2 != null) {
	    switch(op){
	    case ADD:
	    case SUB:
		if(c2.getVal()==0){
		    res= e1;
		}else{
		    res= this;
		}
		break;		
	    case AND:
		if(c2.getVal()==0){
		    res= c2;
		}else{
		    res= e1;
		}
		break;
	    case OR:
		if(c2.getVal()==0){
		    res= e1;
		}else{
		    res= c2;
		}
		break;
	    case XOR:
		if(c2.getVal()==0){
		    res= e1;
		}else{
		    res= this;
		}
		break;
	    case IMPL:
		res=this;
		break;
	   default:
	       //SUB, MUL, DIV, MOD, LT, LE, EQ, GE, GT, NEQ;
	       res= this;
	    
	    }
	} else {
	    res= this;
	}
	return res;
    }

    @Override
    public void replaceVar(HashMap<String, Variable> equiv) {
	e1.replaceVar(equiv);
	e2.replaceVar(equiv);
	
    }

    @Override
    public int wcrt() {
	int  res =1;
	VarAccess v1 = null, v2 = null;
	Const c1 = null, c2 = null;
	if (e1 instanceof VarAccess) {
	    v1 = (VarAccess) e1;
	} else if (e1 instanceof Const) {
	    //c1 = (Const) e1;
	}
	if (e2 instanceof VarAccess) {
	    v2 = (VarAccess) e2;
	} else if (e2 instanceof Const) {
	    //c2 = (Const) e2;
	}

	if (v1 != null && v2 != null) {
	    res=1;
	} else if (v1 != null && c2 != null) {
	    res=1;
	} else if (c1 != null && v2 != null) {
	    res=2;
	} else if (v1 != null) {
	    res=e2.wcrt()+1;
	} else if (v2 != null) {
	    res=e1.wcrt()+1;
	} else if (c2 != null) {
	    res = e1.wcrt()+1;
	} else {
	    res = e1.wcrt()+e2.wcrt()+1;
	}
	Debug.low("wcrt(" + toString() + ") = " + res );
	return res;
    }

    @Override
    public Expression replace(String var, Expression expr) {
	e1=e1.replace(var, expr);
	e2=e2.replace(var, expr);
	return this;
    }

}
