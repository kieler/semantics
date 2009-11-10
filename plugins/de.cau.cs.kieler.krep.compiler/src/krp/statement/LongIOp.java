package krp.statement;

import lustre.Operator;

public class LongIOp extends Statement {
    Operator kind;
    String res;
    String op1;
    int op2;
    
    Integer R_op1;
    Integer R_res;
     
    public LongIOp(Operator kind, String res, String op1, int op2) {
	super();
	this.kind = kind;
	this.res = res;
	this.op1 = op1;
	this.op2 = op2;
    }

  
    
    @Override
    public String toString(){
	return "I" + kind.toKrp() + " " + res + " " + op1 + " " + op2;
    }
    
}
