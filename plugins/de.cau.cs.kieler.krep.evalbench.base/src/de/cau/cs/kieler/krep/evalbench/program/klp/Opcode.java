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
 * @author ctr Opcode for KLP instructions
 */
public enum Opcode {
	// Initialize and synchonization
	/**
	 * initialize valued register
	 */
	SETCLK(0x01),
	/**
	 * initialize clock register
	 */
	SETPC(0x02),
	/**
	 * Stop computation for this tick
	 */
	DONE(0x04),
	/**
	 * declare input
	 */
	INPUT(0x05),
	/**
	 * declare output
	 */
	OUTPUT(0x07),
	/**
	 * set priority for a register
	 */
	PRIO(0x09),
	// Arithmetic
	/**
	 * addition
	 */
	ADD(0x10),
	/**
	 * immediate addition
	 */
	IADD(0x20),
	/**
	 * subtract
	 */
	SUB(0x11),
	/**
	 * subtract immediate
	 */
	ISUB(0x21),
	/**
	 * Multiply
	 */
	MUL(0x12),
	/**
	 * Multiply immediate
	 */
	IMUL(0x22),
	/**
	 * divide
	 */
	DIV(0x13),
	/**
	 * divide immediate
	 */
	IDIV(0x23),
	// Boolean
	/**
	 * boolean and
	 */
	AND(0x3A),
	/**
	 * boolean immediate and
	 */
	IAND(0x4A),
	/**
	 * boolean or
	 */
	OR(0x3B),
	/**
	 * boolean immediate or
	 */
	IOR(0x4B),
	/**
	 * boolean xor
	 */
	XOR(0x3C),
	/**
	 * boolean immediate xor
	 */
	IXOR(0x4C),
	// Comparison
	/**
	 * less than
	 */
	LT(0x14),
	/**
	 * less or equal than
	 */
	LE(0x15),
	/**
	 * equal
	 */
	EQ(0x16),
	/**
	 * greater or equal than
	 */
	GE(0x17),
	/**
	 * greater than
	 */
	GT(0x18),
	/**
	 * not equal
	 */
	NEQ(0x19),
	/**
	 * less than
	 */
	ILT(0x24),
	/**
	 * less or equal than
	 */
	ILE(0x25),
	/**
	 * equal
	 */
	IEQ(0x26),
	/**
	 * greater or equal than
	 */
	IGE(0x27),
	/**
	 * greater than
	 */
	IGT(0x28),
	/**
	 * not equal
	 */
	INEQ(0x29),
	// Jumps
	/**
	 * Unconditional jump
	 */
	JMP(0x0A),
	/**
	 * jump when true
	 */
	JT(0x44),
	/**
	 * jump when false
	 */
	JF(0x45),
	/**
	 * jump when zero
	 */
	JZ(0x2A),
	/**
	 * jump when not zero
	 */
	JNZ(0x2B),
	// Moving,
	/**
	 * move clock to valued register
	 */
	INT(0x50),
	/**
	 * move valued register to clock
	 */
	BOOL(0x2C),
	/**
	 * move value register to valued register
	 */
	VVMOV(0x2D),
	/**
	 * move constant to valued register
	 */
	IVMOV(0x0B),
	/**
	 * move clock register to clock register
	 */
	CCMOV(0x41),
	/**
	 * move constant to clock register
	 */
	ICMOV(0x0C);

	private final int code;

	private Opcode(int code) {
		this.code = code;
	}

	/**
	 * @return object code for the instruction
	 */
	public int getCode() {
		return code;
	}

}
