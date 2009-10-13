///******************************************************************************
// * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
// *
// * http://www.informatik.uni-kiel.de/rtsys/kieler/
// * 
// * Copyright ${year} by
// * + Christian-Albrechts-University of Kiel
// *   + Department of Computer Science
// *     + Real-Time and Embedded Systems Group
// * 
// * This code is provided under the terms of the Eclipse Public License (EPL).
// * See the file epl-v10.html for the license text.
// ******************************************************************************/
//package de.cau.cs.kieler.krep.evalbench.program.krep;
//
//import java.util.Map;
//
///**
// * @author ctr Arithmetic integer operation
// */
//public class LongOp extends Statement {
//	Operator kind;
//	String res;
//	String op1;
//	String op2;
//
//	Integer R_op1 = 0;
//	Integer R_op2 = 0;
//	Integer R_res = 0;
//
//	/**
//	 * @param kind
//	 *            operator
//	 * @param res
//	 *            name of target register
//	 * @param op1
//	 *            name first operator
//	 * @param op2
//	 *            name of second operator
//	 */
//	public LongOp(Operator kind, String res, String op1, String op2) {
//		super();
//		this.kind = kind;
//		this.res = res;
//		this.op1 = op1;
//		this.op2 = op2;
//	}
//
//	@Override
//	public int[] getBytes() {
//		int[] b = { 0, R_res, R_op1, R_op2 };
//		switch (kind) {
//		case ADD:
//			b[0] = OPCODE.ADD;
//			break;
//		case MUL:
//			b[0] = OPCODE.MUL;
//			break;
//		case SUB:
//			b[0] = OPCODE.SUB;
//			break;
//		case DIV:
//			b[0] = OPCODE.DIV;
//			break;
//		case AND:
//			b[0] = OPCODE.AND;
//			break;
//		case OR:
//			b[0] = OPCODE.OR;
//			break;
//		case XOR:
//			b[0] = OPCODE.XOR;
//			break;
//		default:
//			b[0] = OPCODE.NOT;
//			break;
//		}
//		return b;
//	}
//
//	@Override
//	public String toString() {
//		String r = kind.toString();
//		String op = "";
//		switch (kind) {
//		case ADD:
//			op = "+";
//			break;
//		case MUL:
//			op = "*";
//			break;
//		case DIV:
//			op = "/";
//			break;
//		case SUB:
//			op = "-";
//			break;
//		case AND:
//			op = "&&";
//			break;
//		case OR:
//			op = "||";
//			break;
//		case XOR:
//			op = "^";
//			break;
//		default:
//			op = "not";
//			break;
//		}
//		r += " " + R_res + " " + R_op1 + " " + R_op2;
//		r += " (" + res + "<-" + op1 + " " + op + " " + op2 + ")";
//		return r;
//	}
//
//	@Override
//	public void allocateRegs(Map<String, Integer> regs) {
//		R_res = regs.get(res);
//		if (R_res == null) {
//			R_res = regs.size() + 1;
//			regs.put(res, R_res);
//		}
//		R_op1 = regs.get(op1);
//		if (R_op1 == null) {
//			R_op1 = regs.size() + 1;
//			regs.put(op1, R_op1);
//		}
//		R_op2 = regs.get(op2);
//		if (R_op2 == null) {
//			R_op2 = regs.size() + 1;
//			regs.put(op2, R_op2);
//		}
//	}
//
//}
