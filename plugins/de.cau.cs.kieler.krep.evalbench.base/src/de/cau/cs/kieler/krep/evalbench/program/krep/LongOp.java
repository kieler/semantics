package de.cau.cs.kieler.krep.evalbench.program.krep;

import java.util.Map;

/**
 * @author ctr
 * Arithmetic integer operation
 */
public class LongOp extends Statement {
    Operator kind;
    String res;
    String op1;
    String op2;
    
    Integer R_op1;
    Integer R_op2;
    Integer R_res;
     
    /**
     * @param kind operator
     * @param res name of target register
     * @param op1 name first operator
     * @param op2 name of second operator 
     */
    public LongOp(Operator kind, String res, String op1, String op2) {
	super();
	this.kind = kind;
	this.res = res;
	this.op1 = op1;
	this.op2 = op2;
    }
    
    @Override
    public int[] getBytes() {
	int[] b= {0, R_res, R_op1, R_op2}; 
	switch(kind){
	case ADD: b[0]=OPCODE.ADD; break;
	case MUL: b[0]=OPCODE.MUL; break;
	case SUB: b[0]=OPCODE.SUB; break;
	case DIV: b[0]=OPCODE.DIV; break;
	case AND: b[0]=OPCODE.AND; break;
	case OR:  b[0]=OPCODE.OR;  break;
	case XOR: b[0]=OPCODE.XOR; break;
	case NOT: b[0]=OPCODE.NOT; break;
	}
	return b;
    }
    
    @Override
    public String toString(){
	String r = kind.toString();
	String op = new String(); 
	switch(kind){
	case ADD: op = "+"; break;
	case MUL: op = "*"; break;
	case DIV: op = "/"; break;
	case SUB: op = "-"; break;
	case AND: op = "&&"; break;
	case OR: op = "||"; break;
	case XOR: op = "^"; break;
	case NOT: op = "not"; break;
	}
	r += " " + R_res + " " + R_op1 + " " + R_op2;
	r += " (" + res + "<-" + op1 + " " + op + " " + op2  + ")";
	return r;
    }
    
    @Override
    public void allocateRegs(Map<String,Integer> regs){
	R_res=regs.get(res);
	if (R_res==null){
	   R_res = regs.size()+1;
	   regs.put(res, R_res);
	} 
	R_op1=regs.get(op1);
	if (R_op1==null){
	   R_op1 = regs.size()+1;
	   regs.put(op1, R_op1);
	} 
	R_op2=regs.get(op2);
	if (R_op2==null){
	   R_op2 = regs.size()+1;
	   regs.put(op2, R_op2);
	} 
    }
    

}
