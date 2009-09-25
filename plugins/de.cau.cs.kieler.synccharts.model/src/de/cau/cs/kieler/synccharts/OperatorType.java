/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operator Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getOperatorType()
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
    EQ(1, "EQ", "="),

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
    NOT(0, "NOT", "not"),

    /**
     * The '<em><b>VAL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VAL_VALUE
     * @generated
     * @ordered
     */
    VAL(0, "VAL", "?"),

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
     * The '<em><b>AND</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AND_VALUE
     * @generated
     * @ordered
     */
    AND(4, "AND", "and"),

    /**
     * The '<em><b>OR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OR_VALUE
     * @generated
     * @ordered
     */
    OR(5, "OR", "or"),

    /**
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
    MOD(13, "MOD", "mod");

    /**
     * The '<em><b>EQ</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>EQ</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EQ
     * @model literal="="
     * @generated
     * @ordered
     */
    public static final int EQ_VALUE = 1;

    /**
     * The '<em><b>LT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>LT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LT
     * @model literal="<"
     * @generated
     * @ordered
     */
    public static final int LT_VALUE = 2;

    /**
     * The '<em><b>LEQ</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>LEQ</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LEQ
     * @model literal="<="
     * @generated
     * @ordered
     */
    public static final int LEQ_VALUE = 3;

    /**
     * The '<em><b>GT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>GT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GT
     * @model literal=">"
     * @generated
     * @ordered
     */
    public static final int GT_VALUE = 12;

    /**
     * The '<em><b>GEQ</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>GEQ</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GEQ
     * @model literal=">="
     * @generated
     * @ordered
     */
    public static final int GEQ_VALUE = 10;

    /**
     * The '<em><b>NOT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NOT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NOT
     * @model literal="not"
     * @generated
     * @ordered
     */
    public static final int NOT_VALUE = 0;

    /**
     * The '<em><b>VAL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>VAL</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VAL
     * @model literal="?"
     * @generated
     * @ordered
     */
    public static final int VAL_VALUE = 0;

    /**
     * The '<em><b>PRE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>PRE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PRE
     * @model literal="pre"
     * @generated
     * @ordered
     */
    public static final int PRE_VALUE = 11;

    /**
     * The '<em><b>AND</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>AND</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AND
     * @model literal="and"
     * @generated
     * @ordered
     */
    public static final int AND_VALUE = 4;

    /**
     * The '<em><b>OR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>OR</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OR
     * @model literal="or"
     * @generated
     * @ordered
     */
    public static final int OR_VALUE = 5;

    /**
     * The '<em><b>ADD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ADD</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ADD
     * @model literal="+"
     * @generated
     * @ordered
     */
    public static final int ADD_VALUE = 6;

    /**
     * The '<em><b>SUB</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SUB</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SUB
     * @model literal="-"
     * @generated
     * @ordered
     */
    public static final int SUB_VALUE = 7;

    /**
     * The '<em><b>MULT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MULT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MULT
     * @model literal="*"
     * @generated
     * @ordered
     */
    public static final int MULT_VALUE = 8;

    /**
     * The '<em><b>DIV</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DIV</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DIV
     * @model literal="/"
     * @generated
     * @ordered
     */
    public static final int DIV_VALUE = 9;

    /**
     * The '<em><b>MOD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MOD</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MOD
     * @model literal="mod"
     * @generated
     * @ordered
     */
    public static final int MOD_VALUE = 13;

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
            AND,
            OR,
            ADD,
            SUB,
            MULT,
            DIV,
            MOD,
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
            case PRE_VALUE: return PRE;
            case AND_VALUE: return AND;
            case OR_VALUE: return OR;
            case ADD_VALUE: return ADD;
            case SUB_VALUE: return SUB;
            case MULT_VALUE: return MULT;
            case DIV_VALUE: return DIV;
            case MOD_VALUE: return MOD;
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
