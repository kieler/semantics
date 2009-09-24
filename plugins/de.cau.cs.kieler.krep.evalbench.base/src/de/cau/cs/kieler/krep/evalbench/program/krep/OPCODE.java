package de.cau.cs.kieler.krep.evalbench.program.krep;

/**
 * @author ctr KREP opcode for complete ISA
 */
public class OPCODE {
    /**
     * addition
     */
    public final static byte ADD = 0x20;

    /**
     * immediate ADD
     */
    public final static byte IADD = 0x21;

    /**
     * subtraction
     */
    public final static byte SUB = 0x22;

    /**
     * immediate subtraction
     */
    public final static byte ISUB = 0x23;

    /**
     * multiplication
     */
    public final static byte MUL = 0x24;

    /**
     * immediate multiplication
     */
    public final static byte IMUL = 0x25;

    /**
     * division
     */
    public final static byte DIV = 0x26;

    /**
     * immediate division
     */
    public final static byte IDIV = 0x27;

    /**
     * modulo
     */
    public final static byte MOD = 0x28;

    /**
     * immediate modulo 
     */
    public final static byte IMOD = 0x29;

    /**
     * negate value
     */
    public final static byte NEG = 0x2A;

    /**
     * boolean and
     */
    public final static byte AND = 0x70;

    /**
     * boolean or
     */
    public final static byte OR = 0x71;

    /**
     * boolean exclusive or
     */
    public final static byte XOR = 0x72;

    /**
     * negation 
     */
    public final static byte NOT = 0x73;

    /**
     * immediate and
     */
    public final static byte IAND = 0x74;

    /**
     * immediate or
     */
    public final static byte IOR = 0x75;

    /**
     * immediate exclusive or
     */
    public final static byte IXOR = 0x76;

    /**
     * unconditional jump
     */
    public final static byte JMP = 0x40;

    /**
     * jump when zero
     */
    public final static byte JZ = 0x42;

    /**
     * move register to register
     */
    public final static byte RRMOV = 0x50;

    /**
     * move immediate value to register 
     */
    public final static byte IRMOV = 0x51;

    /**
     * send value
     */
    public final static byte SEND = 0x60;

    /**
     * receive value
     */
    public final static byte RECV = 0x61;

    /**
     * synchronize with other cores 
     */
    public final static byte SYNC = 0x62;
}
