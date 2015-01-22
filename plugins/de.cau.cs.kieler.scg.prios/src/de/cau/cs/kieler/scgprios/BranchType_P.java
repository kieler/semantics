/**
 */
package de.cau.cs.kieler.scgprios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Branch Type P</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getBranchType_P()
 * @model
 * @generated
 */
public enum BranchType_P implements Enumerator {
    /**
     * The '<em><b>NORMAL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NORMAL_VALUE
     * @generated
     * @ordered
     */
    NORMAL(0, "NORMAL", "NORMAL"),

    /**
     * The '<em><b>TRUEBRANCH</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRUEBRANCH_VALUE
     * @generated
     * @ordered
     */
    TRUEBRANCH(1, "TRUEBRANCH", "TRUEBRANCH"),

    /**
     * The '<em><b>ELSEBRANCH</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ELSEBRANCH_VALUE
     * @generated
     * @ordered
     */
    ELSEBRANCH(2, "ELSEBRANCH", "ELSEBRANCH");

    /**
     * The '<em><b>NORMAL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NORMAL</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NORMAL
     * @model
     * @generated
     * @ordered
     */
    public static final int NORMAL_VALUE = 0;

    /**
     * The '<em><b>TRUEBRANCH</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>TRUEBRANCH</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TRUEBRANCH
     * @model
     * @generated
     * @ordered
     */
    public static final int TRUEBRANCH_VALUE = 1;

    /**
     * The '<em><b>ELSEBRANCH</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ELSEBRANCH</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ELSEBRANCH
     * @model
     * @generated
     * @ordered
     */
    public static final int ELSEBRANCH_VALUE = 2;

    /**
     * An array of all the '<em><b>Branch Type P</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final BranchType_P[] VALUES_ARRAY =
        new BranchType_P[] {
            NORMAL,
            TRUEBRANCH,
            ELSEBRANCH,
        };

    /**
     * A public read-only list of all the '<em><b>Branch Type P</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<BranchType_P> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Branch Type P</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static BranchType_P get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            BranchType_P result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Branch Type P</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static BranchType_P getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            BranchType_P result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Branch Type P</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static BranchType_P get(int value) {
        switch (value) {
            case NORMAL_VALUE: return NORMAL;
            case TRUEBRANCH_VALUE: return TRUEBRANCH;
            case ELSEBRANCH_VALUE: return ELSEBRANCH;
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
    private BranchType_P(int value, String name, String literal) {
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
    
} //BranchType_P
