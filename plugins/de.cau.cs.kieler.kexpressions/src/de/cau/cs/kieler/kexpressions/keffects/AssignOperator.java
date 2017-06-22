/**
 */
package de.cau.cs.kieler.kexpressions.keffects;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Assign Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getAssignOperator()
 * @model
 * @generated
 */
public enum AssignOperator implements Enumerator {
    /**
     * The '<em><b>ASSIGN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSIGN_VALUE
     * @generated
     * @ordered
     */
    ASSIGN(0, "ASSIGN", "ASSIGN"),

    /**
     * The '<em><b>ASSIGNADD</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSIGNADD_VALUE
     * @generated
     * @ordered
     */
    ASSIGNADD(1, "ASSIGNADD", "ASSIGNADD"),

    /**
     * The '<em><b>ASSIGNSUB</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSIGNSUB_VALUE
     * @generated
     * @ordered
     */
    ASSIGNSUB(2, "ASSIGNSUB", "ASSIGNSUB"),

    /**
     * The '<em><b>ASSIGNMUL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSIGNMUL_VALUE
     * @generated
     * @ordered
     */
    ASSIGNMUL(3, "ASSIGNMUL", "ASSIGNMUL"),

    /**
     * The '<em><b>ASSIGNDIV</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSIGNDIV_VALUE
     * @generated
     * @ordered
     */
    ASSIGNDIV(4, "ASSIGNDIV", "ASSIGNDIV"),

    /**
     * The '<em><b>ASSIGNMOD</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSIGNMOD_VALUE
     * @generated
     * @ordered
     */
    ASSIGNMOD(5, "ASSIGNMOD", "ASSIGNMOD"),

    /**
     * The '<em><b>ASSIGNAND</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSIGNAND_VALUE
     * @generated
     * @ordered
     */
    ASSIGNAND(6, "ASSIGNAND", "ASSIGNAND"),

    /**
     * The '<em><b>ASSIGNOR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSIGNOR_VALUE
     * @generated
     * @ordered
     */
    ASSIGNOR(7, "ASSIGNOR", "ASSIGNOR"),

    /**
     * The '<em><b>ASSIGNXOR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSIGNXOR_VALUE
     * @generated
     * @ordered
     */
    ASSIGNXOR(8, "ASSIGNXOR", "ASSIGNXOR"),

    /**
     * The '<em><b>POSTFIXADD</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POSTFIXADD_VALUE
     * @generated
     * @ordered
     */
    POSTFIXADD(9, "POSTFIXADD", "POSTFIXADD"),

    /**
     * The '<em><b>POSTFIXSUB</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POSTFIXSUB_VALUE
     * @generated
     * @ordered
     */
    POSTFIXSUB(10, "POSTFIXSUB", "POSTFIXSUB"),

    /**
     * The '<em><b>ASSIGNMIN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSIGNMIN_VALUE
     * @generated
     * @ordered
     */
    ASSIGNMIN(11, "ASSIGNMIN", "ASSIGNMIN"),

    /**
     * The '<em><b>ASSIGNMAX</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSIGNMAX_VALUE
     * @generated
     * @ordered
     */
    ASSIGNMAX(12, "ASSIGNMAX", "");

    /**
     * The '<em><b>ASSIGN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ASSIGN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ASSIGN
     * @model
     * @generated
     * @ordered
     */
    public static final int ASSIGN_VALUE = 0;

    /**
     * The '<em><b>ASSIGNADD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ASSIGNADD</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ASSIGNADD
     * @model
     * @generated
     * @ordered
     */
    public static final int ASSIGNADD_VALUE = 1;

    /**
     * The '<em><b>ASSIGNSUB</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ASSIGNSUB</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ASSIGNSUB
     * @model
     * @generated
     * @ordered
     */
    public static final int ASSIGNSUB_VALUE = 2;

    /**
     * The '<em><b>ASSIGNMUL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ASSIGNMUL</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ASSIGNMUL
     * @model
     * @generated
     * @ordered
     */
    public static final int ASSIGNMUL_VALUE = 3;

    /**
     * The '<em><b>ASSIGNDIV</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ASSIGNDIV</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ASSIGNDIV
     * @model
     * @generated
     * @ordered
     */
    public static final int ASSIGNDIV_VALUE = 4;

    /**
     * The '<em><b>ASSIGNMOD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ASSIGNMOD</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ASSIGNMOD
     * @model
     * @generated
     * @ordered
     */
    public static final int ASSIGNMOD_VALUE = 5;

    /**
     * The '<em><b>ASSIGNAND</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ASSIGNAND</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ASSIGNAND
     * @model
     * @generated
     * @ordered
     */
    public static final int ASSIGNAND_VALUE = 6;

    /**
     * The '<em><b>ASSIGNOR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ASSIGNOR</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ASSIGNOR
     * @model
     * @generated
     * @ordered
     */
    public static final int ASSIGNOR_VALUE = 7;

    /**
     * The '<em><b>ASSIGNXOR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ASSIGNXOR</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ASSIGNXOR
     * @model
     * @generated
     * @ordered
     */
    public static final int ASSIGNXOR_VALUE = 8;

    /**
     * The '<em><b>POSTFIXADD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>POSTFIXADD</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POSTFIXADD
     * @model
     * @generated
     * @ordered
     */
    public static final int POSTFIXADD_VALUE = 9;

    /**
     * The '<em><b>POSTFIXSUB</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>POSTFIXSUB</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POSTFIXSUB
     * @model
     * @generated
     * @ordered
     */
    public static final int POSTFIXSUB_VALUE = 10;

    /**
     * The '<em><b>ASSIGNMIN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ASSIGNMIN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ASSIGNMIN
     * @model
     * @generated
     * @ordered
     */
    public static final int ASSIGNMIN_VALUE = 11;

    /**
     * The '<em><b>ASSIGNMAX</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ASSIGNMAX</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ASSIGNMAX
     * @model literal=""
     * @generated
     * @ordered
     */
    public static final int ASSIGNMAX_VALUE = 12;

    /**
     * An array of all the '<em><b>Assign Operator</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AssignOperator[] VALUES_ARRAY =
        new AssignOperator[] {
            ASSIGN,
            ASSIGNADD,
            ASSIGNSUB,
            ASSIGNMUL,
            ASSIGNDIV,
            ASSIGNMOD,
            ASSIGNAND,
            ASSIGNOR,
            ASSIGNXOR,
            POSTFIXADD,
            POSTFIXSUB,
            ASSIGNMIN,
            ASSIGNMAX,
        };

    /**
     * A public read-only list of all the '<em><b>Assign Operator</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<AssignOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Assign Operator</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AssignOperator get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AssignOperator result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Assign Operator</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AssignOperator getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AssignOperator result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Assign Operator</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AssignOperator get(int value) {
        switch (value) {
            case ASSIGN_VALUE: return ASSIGN;
            case ASSIGNADD_VALUE: return ASSIGNADD;
            case ASSIGNSUB_VALUE: return ASSIGNSUB;
            case ASSIGNMUL_VALUE: return ASSIGNMUL;
            case ASSIGNDIV_VALUE: return ASSIGNDIV;
            case ASSIGNMOD_VALUE: return ASSIGNMOD;
            case ASSIGNAND_VALUE: return ASSIGNAND;
            case ASSIGNOR_VALUE: return ASSIGNOR;
            case ASSIGNXOR_VALUE: return ASSIGNXOR;
            case POSTFIXADD_VALUE: return POSTFIXADD;
            case POSTFIXSUB_VALUE: return POSTFIXSUB;
            case ASSIGNMIN_VALUE: return ASSIGNMIN;
            case ASSIGNMAX_VALUE: return ASSIGNMAX;
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
    private AssignOperator(int value, String name, String literal) {
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
    
} //AssignOperator
