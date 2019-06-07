/**
 */
package de.cau.cs.kieler.kexpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Priority Protocol</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getPriorityProtocol()
 * @model
 * @generated
 */
public enum PriorityProtocol implements Enumerator {
    /**
     * The '<em><b>CONFLICT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONFLICT_VALUE
     * @generated
     * @ordered
     */
    CONFLICT(0, "CONFLICT", "CONFLICT"),

    /**
     * The '<em><b>CONFLUENT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONFLUENT_VALUE
     * @generated
     * @ordered
     */
    CONFLUENT(1, "CONFLUENT", "CONFLUENT");

    /**
     * The '<em><b>CONFLICT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CONFLICT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONFLICT
     * @model
     * @generated
     * @ordered
     */
    public static final int CONFLICT_VALUE = 0;

    /**
     * The '<em><b>CONFLUENT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CONFLUENT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONFLUENT
     * @model
     * @generated
     * @ordered
     */
    public static final int CONFLUENT_VALUE = 1;

    /**
     * An array of all the '<em><b>Priority Protocol</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final PriorityProtocol[] VALUES_ARRAY =
        new PriorityProtocol[] {
            CONFLICT,
            CONFLUENT,
        };

    /**
     * A public read-only list of all the '<em><b>Priority Protocol</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<PriorityProtocol> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Priority Protocol</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PriorityProtocol get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PriorityProtocol result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Priority Protocol</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PriorityProtocol getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PriorityProtocol result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Priority Protocol</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PriorityProtocol get(int value) {
        switch (value) {
            case CONFLICT_VALUE: return CONFLICT;
            case CONFLUENT_VALUE: return CONFLUENT;
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
    private PriorityProtocol(int value, String name, String literal) {
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
    
} //PriorityProtocol
