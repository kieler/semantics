/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.core.kexpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operator Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * OperatorTypes are used for OperatorExpressions. 
 * The types may reference any corresponding
 * operator or function that may make use of
 * an arbitrary number of subExpressions. Hence it
 * contains unary and binary operators.
 * <!-- end-model-doc -->
 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getOperatorType()
 * @model
 * @generated
 */
public enum OperatorType implements Enumerator {
    /**
	 * The '<em><b>EQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #EQ_VALUE
	 * @generated
	 * @ordered
	 */
    EQ(1, "EQ", "=="),

    /**
	 * The '<em><b>LT</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #LT_VALUE
	 * @generated
	 * @ordered
	 */
    LT(2, "LT", "<"),

    /**
	 * The '<em><b>LEQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #LEQ_VALUE
	 * @generated
	 * @ordered
	 */
    LEQ(3, "LEQ", "<="),

    /**
	 * The '<em><b>GT</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #GT_VALUE
	 * @generated
	 * @ordered
	 */
    GT(12, "GT", ">"),

    /**
	 * The '<em><b>GEQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #GEQ_VALUE
	 * @generated
	 * @ordered
	 */
    GEQ(10, "GEQ", ">="),

    /**
	 * The '<em><b>NOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #NOT_VALUE
	 * @generated
	 * @ordered
	 */
    NOT(0, "NOT", "!"),

    /**
	 * The '<em><b>VAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #VAL_VALUE
	 * @generated
	 * @ordered
	 */
    VAL(15, "VAL", "val"),

    /**
	 * The '<em><b>PRE</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #PRE_VALUE
	 * @generated
	 * @ordered
	 */
    PRE(11, "PRE", "pre"),

    /**
	 * The '<em><b>NE</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #NE_VALUE
	 * @generated
	 * @ordered
	 */
    NE(14, "NE", "!="),

    /**
	 * The '<em><b>LOGICAL AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #LOGICAL_AND_VALUE
	 * @generated
	 * @ordered
	 */
    LOGICAL_AND(4, "LOGICAL_AND", "&&"), /**
	 * The '<em><b>LOGICAL OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #LOGICAL_OR_VALUE
	 * @generated
	 * @ordered
	 */
    LOGICAL_OR(5, "LOGICAL_OR", "||"), /**
	 * The '<em><b>ADD</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #ADD_VALUE
	 * @generated
	 * @ordered
	 */
    ADD(6, "ADD", "+"),

    /**
	 * The '<em><b>SUB</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #SUB_VALUE
	 * @generated
	 * @ordered
	 */
    SUB(7, "SUB", "-"),

    /**
	 * The '<em><b>MULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #MULT_VALUE
	 * @generated
	 * @ordered
	 */
    MULT(8, "MULT", "*"),

    /**
	 * The '<em><b>DIV</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #DIV_VALUE
	 * @generated
	 * @ordered
	 */
    DIV(9, "DIV", "/"),

    /**
	 * The '<em><b>MOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #MOD_VALUE
	 * @generated
	 * @ordered
	 */
    MOD(13, "MOD", "%"), /**
	 * The '<em><b>BITWISE OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #BITWISE_OR_VALUE
	 * @generated
	 * @ordered
	 */
    BITWISE_OR(17, "BITWISE_OR", "|"), /**
	 * The '<em><b>BITWISE AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #BITWISE_AND_VALUE
	 * @generated
	 * @ordered
	 */
    BITWISE_AND(16, "BITWISE_AND", "&"), /**
	 * The '<em><b>POSTFIX ADD</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #POSTFIX_ADD_VALUE
	 * @generated
	 * @ordered
	 */
    POSTFIX_ADD(18, "POSTFIX_ADD", "POSTFIX_ADD"), /**
	 * The '<em><b>POSTFIX SUB</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #POSTFIX_SUB_VALUE
	 * @generated
	 * @ordered
	 */
    POSTFIX_SUB(19, "POSTFIX_SUB", "POSTFIX_SUB");
    /**
	 * The '<em><b>EQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Equals operator
	 * <!-- end-model-doc -->
	 * @see #EQ
	 * @model literal="=="
	 * @generated
	 * @ordered
	 */
    public static final int EQ_VALUE = 1;

    /**
	 * The '<em><b>LT</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Less than operator. (Not commutative!)
	 * <!-- end-model-doc -->
	 * @see #LT
	 * @model literal="<"
	 * @generated
	 * @ordered
	 */
    public static final int LT_VALUE = 2;

    /**
	 * The '<em><b>LEQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Less or Equal operator. (Not commutative!)
	 * <!-- end-model-doc -->
	 * @see #LEQ
	 * @model literal="<="
	 * @generated
	 * @ordered
	 */
    public static final int LEQ_VALUE = 3;

    /**
	 * The '<em><b>GT</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Greater than operator. (Not commutative!)
	 * <!-- end-model-doc -->
	 * @see #GT
	 * @model literal=">"
	 * @generated
	 * @ordered
	 */
    public static final int GT_VALUE = 12;

    /**
	 * The '<em><b>GEQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Greater or Equal operator. (Not commutative!)
	 * <!-- end-model-doc -->
	 * @see #GEQ
	 * @model literal=">="
	 * @generated
	 * @ordered
	 */
    public static final int GEQ_VALUE = 10;

    /**
	 * The '<em><b>NOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logical Negation operator (unary)
	 * <!-- end-model-doc -->
	 * @see #NOT
	 * @model literal="!"
	 * @generated
	 * @ordered
	 */
    public static final int NOT_VALUE = 0;

    /**
	 * The '<em><b>VAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value operator. Returns the value of a Signal referenced by a SignalReference.
	 * <!-- end-model-doc -->
	 * @see #VAL
	 * @model literal="val"
	 * @generated
	 * @ordered
	 */
    public static final int VAL_VALUE = 15;

    /**
	 * The '<em><b>PRE</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pre operator, returns the previous state of a Signal referenced by a SignalReference.
	 * <!-- end-model-doc -->
	 * @see #PRE
	 * @model literal="pre"
	 * @generated
	 * @ordered
	 */
    public static final int PRE_VALUE = 11;

    /**
	 * The '<em><b>NE</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Equal operator.
	 * 
	 * <!-- end-model-doc -->
	 * @see #NE
	 * @model literal="!="
	 * @generated
	 * @ordered
	 */
    public static final int NE_VALUE = 14;

    /**
	 * The '<em><b>LOGICAL AND</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logical AND operator.
	 * 
	 * <!-- end-model-doc -->
	 * @see #LOGICAL_AND
	 * @model literal="&&"
	 * @generated
	 * @ordered
	 */
    public static final int LOGICAL_AND_VALUE = 4;

    /**
	 * The '<em><b>LOGICAL OR</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logical OR operator.
	 * <!-- end-model-doc -->
	 * @see #LOGICAL_OR
	 * @model literal="||"
	 * @generated
	 * @ordered
	 */
    public static final int LOGICAL_OR_VALUE = 5;

    /**
	 * The '<em><b>ADD</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arithmetic addition operator.
	 * <!-- end-model-doc -->
	 * @see #ADD
	 * @model literal="+"
	 * @generated
	 * @ordered
	 */
    public static final int ADD_VALUE = 6;

    /**
	 * The '<em><b>SUB</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arithmetic subtraction operator. (Not commutative!)
	 * <!-- end-model-doc -->
	 * @see #SUB
	 * @model literal="-"
	 * @generated
	 * @ordered
	 */
    public static final int SUB_VALUE = 7;

    /**
	 * The '<em><b>MULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arithmetic multiplication operator.
	 * <!-- end-model-doc -->
	 * @see #MULT
	 * @model literal="*"
	 * @generated
	 * @ordered
	 */
    public static final int MULT_VALUE = 8;

    /**
	 * The '<em><b>DIV</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aithmetic division operator. (Not commutative!)
	 * <!-- end-model-doc -->
	 * @see #DIV
	 * @model literal="/"
	 * @generated
	 * @ordered
	 */
    public static final int DIV_VALUE = 9;

    /**
	 * The '<em><b>MOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arithmetic modulo operation. (Not commutative!)
	 * <!-- end-model-doc -->
	 * @see #MOD
	 * @model literal="%"
	 * @generated
	 * @ordered
	 */
    public static final int MOD_VALUE = 13;

    /**
	 * The '<em><b>BITWISE OR</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>BITWISE OR</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @see #BITWISE_OR
	 * @model literal="|"
	 * @generated
	 * @ordered
	 */
    public static final int BITWISE_OR_VALUE = 17;

    /**
	 * The '<em><b>BITWISE AND</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>BITWISE AND</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @see #BITWISE_AND
	 * @model literal="&"
	 * @generated
	 * @ordered
	 */
    public static final int BITWISE_AND_VALUE = 16;

    /**
	 * The '<em><b>POSTFIX ADD</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>POSTFIX ADD</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @see #POSTFIX_ADD
	 * @model
	 * @generated
	 * @ordered
	 */
    public static final int POSTFIX_ADD_VALUE = 18;

    /**
	 * The '<em><b>POSTFIX SUB</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>POSTFIX SUB</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @see #POSTFIX_SUB
	 * @model
	 * @generated
	 * @ordered
	 */
    public static final int POSTFIX_SUB_VALUE = 19;

    /**
	 * An array of all the '<em><b>Operator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private static final OperatorType[] VALUES_ARRAY =
        new OperatorType[] {
			EQ,
			LT,
			LEQ,
			GT,
			GEQ,
			NOT,
			VAL,
			PRE,
			NE,
			LOGICAL_AND,
			LOGICAL_OR,
			ADD,
			SUB,
			MULT,
			DIV,
			MOD,
			BITWISE_OR,
			BITWISE_AND,
			POSTFIX_ADD,
			POSTFIX_SUB,
		};

    /**
	 * A public read-only list of all the '<em><b>Operator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final List<OperatorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
	 * Returns the '<em><b>Operator Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
    public static OperatorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperatorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

    /**
	 * Returns the '<em><b>Operator Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
    public static OperatorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperatorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

    /**
	 * Returns the '<em><b>Operator Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
    public static OperatorType get(int value) {
		switch (value) {
			case EQ_VALUE: return EQ;
			case LT_VALUE: return LT;
			case LEQ_VALUE: return LEQ;
			case GT_VALUE: return GT;
			case GEQ_VALUE: return GEQ;
			case NOT_VALUE: return NOT;
			case VAL_VALUE: return VAL;
			case PRE_VALUE: return PRE;
			case NE_VALUE: return NE;
			case LOGICAL_AND_VALUE: return LOGICAL_AND;
			case LOGICAL_OR_VALUE: return LOGICAL_OR;
			case ADD_VALUE: return ADD;
			case SUB_VALUE: return SUB;
			case MULT_VALUE: return MULT;
			case DIV_VALUE: return DIV;
			case MOD_VALUE: return MOD;
			case BITWISE_OR_VALUE: return BITWISE_OR;
			case BITWISE_AND_VALUE: return BITWISE_AND;
			case POSTFIX_ADD_VALUE: return POSTFIX_ADD;
			case POSTFIX_SUB_VALUE: return POSTFIX_SUB;
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
    private OperatorType(int value, String name, String literal) {
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
    
} //OperatorType
