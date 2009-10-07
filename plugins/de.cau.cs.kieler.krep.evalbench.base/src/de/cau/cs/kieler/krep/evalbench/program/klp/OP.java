/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.program.klp;

/**
 * @author ctr possible ALU operations
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

	/*
	 * @Override public String toString() { String res = null; switch (this) {
	 * case AND: res = " and "; break; case OR: res = " or "; break; case XOR:
	 * res = " xor "; break; case LT: res = "<"; break; case LE: res = "<=";
	 * break; case EQ: res = "="; break; case GE: res = ">="; break; case GT:
	 * res = ">"; break; case NEQ: res = "<>"; break; case ADD: res = "+";
	 * break; case SUB: res = "-"; break; case MUL: res = "*"; break; case DIV:
	 * res = "/"; break;
	 * 
	 * } return res; }
	 */
}