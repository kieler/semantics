/**
 */
package de.cau.cs.kieler.kexpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Parameter Access Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getParameterAccessType()
 * @model
 * @generated
 */
public enum ParameterAccessType implements Enumerator {
    /**
     * The '<em><b>CALL BY VALUE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CALL_BY_VALUE_VALUE
     * @generated
     * @ordered
     */
    CALL_BY_VALUE(0, "CALL_BY_VALUE", "CALL_BY_VALUE"),

    /**
     * The '<em><b>CALL BY REFERENCE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CALL_BY_REFERENCE_VALUE
     * @generated
     * @ordered
     */
    CALL_BY_REFERENCE(1, "CALL_BY_REFERENCE", "CALL_BY_REFERENCE"),

    /**
     * The '<em><b>PURE OUTPUT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PURE_OUTPUT_VALUE
     * @generated
     * @ordered
     */
    PURE_OUTPUT(2, "PURE_OUTPUT", "PURE_OUTPUT");

    /**
     * The '<em><b>CALL BY VALUE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CALL_BY_VALUE
     * @model
     * @generated
     * @ordered
     */
    public static final int CALL_BY_VALUE_VALUE = 0;

    /**
     * The '<em><b>CALL BY REFERENCE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CALL_BY_REFERENCE
     * @model
     * @generated
     * @ordered
     */
    public static final int CALL_BY_REFERENCE_VALUE = 1;

    /**
     * The '<em><b>PURE OUTPUT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PURE_OUTPUT
     * @model
     * @generated
     * @ordered
     */
    public static final int PURE_OUTPUT_VALUE = 2;

    /**
     * An array of all the '<em><b>Parameter Access Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ParameterAccessType[] VALUES_ARRAY =
        new ParameterAccessType[] {
            CALL_BY_VALUE,
            CALL_BY_REFERENCE,
            PURE_OUTPUT,
        };

    /**
     * A public read-only list of all the '<em><b>Parameter Access Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ParameterAccessType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Parameter Access Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ParameterAccessType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ParameterAccessType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Parameter Access Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ParameterAccessType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ParameterAccessType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Parameter Access Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ParameterAccessType get(int value) {
        switch (value) {
            case CALL_BY_VALUE_VALUE: return CALL_BY_VALUE;
            case CALL_BY_REFERENCE_VALUE: return CALL_BY_REFERENCE;
            case PURE_OUTPUT_VALUE: return PURE_OUTPUT;
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
    private ParameterAccessType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
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
    
} //ParameterAccessType
