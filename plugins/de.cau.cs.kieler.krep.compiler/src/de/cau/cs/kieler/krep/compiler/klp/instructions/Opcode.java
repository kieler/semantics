/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.krep.compiler.klp.instructions;

//package klp.instructions;
//
///**
// * @author ctr
// * Opcode for KLP instructions
// */
//public enum Opcode {
//    //Initialize and synchonization
//    /**
//     * initialize valued register
//     */
//    INITV (0x01),
//    /**
//     * initialize clock register
//     */
//    INITC (0x02),
//    /**
//     * start actual computation
//     */
//    START (0x03),
//    /**
//     * Stop computation for this tick
//     */
//    DONE (0x04),
//    //Arithmetic
//    /**
//     * addition
//     */
//    ADD (0x10),
//    /**
//     * immediate addition
//     */
//    IADD (0x11),
//    /**
//     * subtract
//     */
//    SUB (0x12),
//    /**
//     * subtract immediate
//     */
//    ISUB (0x13),
//    /**
//     * Multiply
//     */
//    MUL (0x14),
//    /**
//     * Multiply immediate
//     */
//    IMUL (0x15),
//    /**
//     * divide
//     */
//    DIV (0x16),
//    /**
//     * divide immediate
//     */
//    IDIV (0x17),
//    //Boolean 
//    /**
//     * boolean and
//     */
//    AND (0x20),
//    /**
//     * boolean immedite and
//     */
//    IAND (0x21),
//    /**
//     * boolean or
//     */
//    OR (0x22),
//    /**
//     * boolean immediate or
//     */
//    IOR(0x23),
//    /**
//     * boolean xor
//     */
//    XOR(0x24),
//    /**
//     * boolean immediate xor
//     */
//    IXOR(0x25),
//    //Comparison
//    /**
//     * less than
//     */
//    LT (0x30),
//    /**
//     * less or equal than
//     */
//    LE(0x31),
//    /**
//     * equal
//     */
//    EQ(0x32),
//    /**
//     * greater or equal than
//     */
//    GE(0x33),
//    /**
//     * greater than
//     */
//    GT(0x34),
//    /**
//     * not equal
//     */
//    NEQ(0x35),
//    //Jumps
//    /**
//     * Unconditional jump
//     */
//    JMP(0x40),
//    /**
//     * jump when true
//     */
//    JT(0x41),
//    /**
//     * jump when false
//     */
//    JF(0x42),
//    /**
//     * jump when zero
//     */
//    JZ(0x44),
//    /**
//     * jump when not zero
//     */
//    JNZ(0x43),
//    //Moving,
//    /**
//     * move clock to valued register
//     */
//    INT (0x50),
//    /**
//     * move valued register to clock
//     */
//    BOOL(0x51),
//    /**
//     * move value register to valued register
//     */
//    VVMOV(0x52),
//    /**
//     * move constant to valued register
//     */
//    IVMOV (0x53),
//    /**
//     * move clock register to clock register 
//     */
//    CCMOV (0x54),
//    /**
//     * move constant to clock register
//     */
//    ICMOV(0x55);
//    
//    private final int code;
//    
//    private Opcode(int code){
//	this.code=code;
//    }
//    
//    /**
//     * @return object code for the instruction
//     */
//    public int getCode(){
//	return code;
//    }
//    
// }
