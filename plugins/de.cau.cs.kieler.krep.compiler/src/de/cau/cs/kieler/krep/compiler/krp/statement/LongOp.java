package de.cau.cs.kieler.krep.compiler.krp.statement;

import de.cau.cs.kieler.krep.compiler.lustre.Operator;

public class LongOp extends Statement {
    Operator kind;
    String res;
    String op1;
    String op2;
    
    Integer R_op1;
    Integer R_op2;
    Integer R_res;
     
    public LongOp(Operator kind, String res, String op1, String op2) {
	super();
	this.kind = kind;
	this.res = res;
	this.op1 = op1;
	this.op2 = op2;
    }
    
 
    
    @Override
    public String toString(){
	String result = kind.toKrp() + " " + res + " " + op1;
	if (op2!=null){
	    result += " " + op2;
	}
	    
	return  result;
    }
}
