package de.cau.cs.kieler.krep.evalbench.program.klp;

/**
 * @author ctr
 * possible ALU operations
 */
public enum OP {
	/**
	 * boolean and
	 */
	AND,
	/**
	 * boolean or
	 */
	OR, 
	/**
	 * boolean xor
	 */
	XOR, 
	/**
	 * less than
	 */
	LT, 
	/**
	 * less than or equal
	 */
	LE, 
	/**
	 * equal
	 */
	EQ, 
	/**
	 * greater than or equal
	 */
	GE, 
	/**
	 * greater than
	 */
	GT, 
	/**
	 * not equal
	 */
	NEQ, 
	/**
	 * addition
	 */
	ADD, 
	/**
	 * subtraction
	 */
	SUB,
	/**
	 * multiplication
	 */
	MUL, 
	/**
	 * division
	 */
	DIV;

/*	@Override
	public String toString() {
	    String res = null;
	    switch (this) {
	    case AND:
		res = " and ";
		break;
	    case OR:
		res = " or ";
		break;
	    case XOR:
		res = " xor ";
		break;
	    case LT:
		res = "<";
		break;
	    case LE:
		res = "<=";
		break;
	    case EQ:
		res = "=";
		break;
	    case GE:
		res = ">=";
		break;
	    case GT:
		res = ">";
		break;
	    case NEQ:
		res = "<>";
		break;
	    case ADD:
		res = "+";
		break;
	    case SUB:
		res = "-";
		break;
	    case MUL:
		res = "*";
		break;
	    case DIV:
		res = "/";
		break;

	    }
	    return res;
	}*/
}