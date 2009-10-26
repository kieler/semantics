/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.krep.editors.klp.klp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.krep.editors.klp.klp.KlpPackage#getOperator()
 * @model
 * @generated
 */
public enum Operator implements Enumerator {
	/**
	 * The '<em><b>Add</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD_VALUE
	 * @generated
	 * @ordered
	 */
	ADD(0, "add", "ADD"),

	/**
	 * The '<em><b>Iadd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IADD_VALUE
	 * @generated
	 * @ordered
	 */
	IADD(1, "iadd", "IADD"),

	/**
	 * The '<em><b>Sub</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUB_VALUE
	 * @generated
	 * @ordered
	 */
	SUB(2, "sub", "SUB"),

	/**
	 * The '<em><b>Mul</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUL_VALUE
	 * @generated
	 * @ordered
	 */
	MUL(3, "mul", "MUL"),

	/**
	 * The '<em><b>Div</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIV_VALUE
	 * @generated
	 * @ordered
	 */
	DIV(4, "div", "DIV"),

	/**
	 * The '<em><b>And</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND_VALUE
	 * @generated
	 * @ordered
	 */
	AND(5, "and", "AND"),

	/**
	 * The '<em><b>Or</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR_VALUE
	 * @generated
	 * @ordered
	 */
	OR(6, "or", "OR"),

	/**
	 * The '<em><b>Xor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XOR_VALUE
	 * @generated
	 * @ordered
	 */
	XOR(7, "xor", "XOR"),

	/**
	 * The '<em><b>Lt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT_VALUE
	 * @generated
	 * @ordered
	 */
	LT(8, "lt", "LT"),

	/**
	 * The '<em><b>Le</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LE_VALUE
	 * @generated
	 * @ordered
	 */
	LE(9, "le", "LE"),

	/**
	 * The '<em><b>Eq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQ_VALUE
	 * @generated
	 * @ordered
	 */
	EQ(10, "eq", "EQ"),

	/**
	 * The '<em><b>Ge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GE_VALUE
	 * @generated
	 * @ordered
	 */
	GE(11, "ge", "GE"),

	/**
	 * The '<em><b>Gt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GT_VALUE
	 * @generated
	 * @ordered
	 */
	GT(12, "gt", "GT"),

	/**
	 * The '<em><b>Neq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEQ_VALUE
	 * @generated
	 * @ordered
	 */
	NEQ(13, "neq", "NEQ"),

	/**
	 * The '<em><b>Isub</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISUB_VALUE
	 * @generated
	 * @ordered
	 */
	ISUB(14, "isub", "ISUB"),

	/**
	 * The '<em><b>Imul</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMUL_VALUE
	 * @generated
	 * @ordered
	 */
	IMUL(15, "imul", "IMUL"),

	/**
	 * The '<em><b>Idiv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDIV_VALUE
	 * @generated
	 * @ordered
	 */
	IDIV(16, "idiv", "IDIV"),

	/**
	 * The '<em><b>Iand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IAND_VALUE
	 * @generated
	 * @ordered
	 */
	IAND(17, "iand", "IAND"),

	/**
	 * The '<em><b>Ior</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IOR_VALUE
	 * @generated
	 * @ordered
	 */
	IOR(18, "ior", "IOR"),

	/**
	 * The '<em><b>Ixor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IXOR_VALUE
	 * @generated
	 * @ordered
	 */
	IXOR(19, "ixor", "IXOR"),

	/**
	 * The '<em><b>Ilt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ILT_VALUE
	 * @generated
	 * @ordered
	 */
	ILT(20, "ilt", "ILT"),

	/**
	 * The '<em><b>Ile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ILE_VALUE
	 * @generated
	 * @ordered
	 */
	ILE(21, "ile", "ILE"),

	/**
	 * The '<em><b>Ieq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IEQ_VALUE
	 * @generated
	 * @ordered
	 */
	IEQ(22, "ieq", "IEQ"),

	/**
	 * The '<em><b>Ige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGE_VALUE
	 * @generated
	 * @ordered
	 */
	IGE(23, "ige", "IGE"),

	/**
	 * The '<em><b>Igt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGT_VALUE
	 * @generated
	 * @ordered
	 */
	IGT(24, "igt", "IGT"),

	/**
	 * The '<em><b>Ineq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INEQ_VALUE
	 * @generated
	 * @ordered
	 */
	INEQ(25, "ineq", "INEQ");

	/**
	 * The '<em><b>Add</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Add</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADD
	 * @model name="add" literal="ADD"
	 * @generated
	 * @ordered
	 */
	public static final int ADD_VALUE = 0;

	/**
	 * The '<em><b>Iadd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Iadd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IADD
	 * @model name="iadd" literal="IADD"
	 * @generated
	 * @ordered
	 */
	public static final int IADD_VALUE = 1;

	/**
	 * The '<em><b>Sub</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sub</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUB
	 * @model name="sub" literal="SUB"
	 * @generated
	 * @ordered
	 */
	public static final int SUB_VALUE = 2;

	/**
	 * The '<em><b>Mul</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mul</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MUL
	 * @model name="mul" literal="MUL"
	 * @generated
	 * @ordered
	 */
	public static final int MUL_VALUE = 3;

	/**
	 * The '<em><b>Div</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Div</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIV
	 * @model name="div" literal="DIV"
	 * @generated
	 * @ordered
	 */
	public static final int DIV_VALUE = 4;

	/**
	 * The '<em><b>And</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>And</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AND
	 * @model name="and" literal="AND"
	 * @generated
	 * @ordered
	 */
	public static final int AND_VALUE = 5;

	/**
	 * The '<em><b>Or</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Or</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OR
	 * @model name="or" literal="OR"
	 * @generated
	 * @ordered
	 */
	public static final int OR_VALUE = 6;

	/**
	 * The '<em><b>Xor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Xor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XOR
	 * @model name="xor" literal="XOR"
	 * @generated
	 * @ordered
	 */
	public static final int XOR_VALUE = 7;

	/**
	 * The '<em><b>Lt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LT
	 * @model name="lt" literal="LT"
	 * @generated
	 * @ordered
	 */
	public static final int LT_VALUE = 8;

	/**
	 * The '<em><b>Le</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Le</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LE
	 * @model name="le" literal="LE"
	 * @generated
	 * @ordered
	 */
	public static final int LE_VALUE = 9;

	/**
	 * The '<em><b>Eq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eq</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQ
	 * @model name="eq" literal="EQ"
	 * @generated
	 * @ordered
	 */
	public static final int EQ_VALUE = 10;

	/**
	 * The '<em><b>Ge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ge</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GE
	 * @model name="ge" literal="GE"
	 * @generated
	 * @ordered
	 */
	public static final int GE_VALUE = 11;

	/**
	 * The '<em><b>Gt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GT
	 * @model name="gt" literal="GT"
	 * @generated
	 * @ordered
	 */
	public static final int GT_VALUE = 12;

	/**
	 * The '<em><b>Neq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Neq</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEQ
	 * @model name="neq" literal="NEQ"
	 * @generated
	 * @ordered
	 */
	public static final int NEQ_VALUE = 13;

	/**
	 * The '<em><b>Isub</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Isub</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISUB
	 * @model name="isub" literal="ISUB"
	 * @generated
	 * @ordered
	 */
	public static final int ISUB_VALUE = 14;

	/**
	 * The '<em><b>Imul</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Imul</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMUL
	 * @model name="imul" literal="IMUL"
	 * @generated
	 * @ordered
	 */
	public static final int IMUL_VALUE = 15;

	/**
	 * The '<em><b>Idiv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Idiv</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDIV
	 * @model name="idiv" literal="IDIV"
	 * @generated
	 * @ordered
	 */
	public static final int IDIV_VALUE = 16;

	/**
	 * The '<em><b>Iand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Iand</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IAND
	 * @model name="iand" literal="IAND"
	 * @generated
	 * @ordered
	 */
	public static final int IAND_VALUE = 17;

	/**
	 * The '<em><b>Ior</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ior</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IOR
	 * @model name="ior" literal="IOR"
	 * @generated
	 * @ordered
	 */
	public static final int IOR_VALUE = 18;

	/**
	 * The '<em><b>Ixor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ixor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IXOR
	 * @model name="ixor" literal="IXOR"
	 * @generated
	 * @ordered
	 */
	public static final int IXOR_VALUE = 19;

	/**
	 * The '<em><b>Ilt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ilt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ILT
	 * @model name="ilt" literal="ILT"
	 * @generated
	 * @ordered
	 */
	public static final int ILT_VALUE = 20;

	/**
	 * The '<em><b>Ile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ile</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ILE
	 * @model name="ile" literal="ILE"
	 * @generated
	 * @ordered
	 */
	public static final int ILE_VALUE = 21;

	/**
	 * The '<em><b>Ieq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ieq</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IEQ
	 * @model name="ieq" literal="IEQ"
	 * @generated
	 * @ordered
	 */
	public static final int IEQ_VALUE = 22;

	/**
	 * The '<em><b>Ige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ige</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IGE
	 * @model name="ige" literal="IGE"
	 * @generated
	 * @ordered
	 */
	public static final int IGE_VALUE = 23;

	/**
	 * The '<em><b>Igt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Igt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IGT
	 * @model name="igt" literal="IGT"
	 * @generated
	 * @ordered
	 */
	public static final int IGT_VALUE = 24;

	/**
	 * The '<em><b>Ineq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ineq</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INEQ
	 * @model name="ineq" literal="INEQ"
	 * @generated
	 * @ordered
	 */
	public static final int INEQ_VALUE = 25;

	/**
	 * An array of all the '<em><b>Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Operator[] VALUES_ARRAY =
		new Operator[] {
			ADD,
			IADD,
			SUB,
			MUL,
			DIV,
			AND,
			OR,
			XOR,
			LT,
			LE,
			EQ,
			GE,
			GT,
			NEQ,
			ISUB,
			IMUL,
			IDIV,
			IAND,
			IOR,
			IXOR,
			ILT,
			ILE,
			IEQ,
			IGE,
			IGT,
			INEQ,
		};

	/**
	 * A public read-only list of all the '<em><b>Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Operator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Operator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Operator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Operator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Operator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Operator get(int value) {
		switch (value) {
			case ADD_VALUE: return ADD;
			case IADD_VALUE: return IADD;
			case SUB_VALUE: return SUB;
			case MUL_VALUE: return MUL;
			case DIV_VALUE: return DIV;
			case AND_VALUE: return AND;
			case OR_VALUE: return OR;
			case XOR_VALUE: return XOR;
			case LT_VALUE: return LT;
			case LE_VALUE: return LE;
			case EQ_VALUE: return EQ;
			case GE_VALUE: return GE;
			case GT_VALUE: return GT;
			case NEQ_VALUE: return NEQ;
			case ISUB_VALUE: return ISUB;
			case IMUL_VALUE: return IMUL;
			case IDIV_VALUE: return IDIV;
			case IAND_VALUE: return IAND;
			case IOR_VALUE: return IOR;
			case IXOR_VALUE: return IXOR;
			case ILT_VALUE: return ILT;
			case ILE_VALUE: return ILE;
			case IEQ_VALUE: return IEQ;
			case IGE_VALUE: return IGE;
			case IGT_VALUE: return IGT;
			case INEQ_VALUE: return INEQ;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Operator(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Operator
