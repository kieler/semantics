package klp.instructions;

import ceq.Variable;
import lustre.Operator;

/**
 * @author ctr
 * Immediate binary operation
 */
public class IBinOp extends Instruction {
    private Variable to;

    private Read r1;

    private int val;

    private Operator op;

    /**
     * @param to variable that stores the result
     * @param r1 register that holds first parameter
     * @param c  constant value as second parameter
     * @param op operation
     */
    public IBinOp(Variable to, Read r1, int c, Operator op) {
	super();
	this.to = to;
	this.r1 = r1;
	this.val = c;
	this.op = op;
    }

    @Override
    public String toString() {
	return "  I" + op.toKlp() + "\t" + to.getName() + "\t" + r1.toString()
		+ "\t" + val;
    }

//    @Override
//    public String getObj() {
//	return writeObj(toObj(), 2*to.getId(), r1.getId(), val);
//    }
//
//
//    private int toObj() {
//	int res = 0;
//	switch (op) {
//	case AND:
//	    res = Opcode.IAND.getCode();
//	    break;
//	case OR:
//	    res = Opcode.IOR.getCode();
//	    break;
//	case XOR:
//	    res = Opcode.IXOR.getCode();
//	    break;
//	/*
//	 * case LT: res = Opcode.ILT.getCode(); break; case LE: res =
//	 * Opcode.ILE.getCode(); break; case EQ: res = Opcode.IEQ.getCode();
//	 * break; case GE: res = Opcode.IGE.getCode(); break; case GT: res =
//	 * Opcode.IGT.getCode(); break; case NEQ: res = Opcode.INEQ.getCode();
//	 * break;
//	 */
//	case ADD:
//	    res = Opcode.IADD.getCode();
//	    break;
//	case SUB:
//	    res = Opcode.ISUB.getCode();
//	    break;
//	case MUL:
//	    res = Opcode.IMUL.getCode();
//	    break;
//	case DIV:
//	    res = Opcode.IDIV.getCode();
//	    break;
//	}
//	return res;
//    }
}
