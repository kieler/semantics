/**
 */
package de.cau.cs.kieler.scl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fork Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.scl.SCLPackage#getForkType()
 * @model
 * @generated
 */
public enum ForkType implements Enumerator {
    /**
     * The '<em><b>PARALLEL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PARALLEL_VALUE
     * @generated
     * @ordered
     */
    PARALLEL(0, "PARALLEL", "PARALLEL"),

    /**
     * The '<em><b>SEQUENTIAL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SEQUENTIAL_VALUE
     * @generated
     * @ordered
     */
    SEQUENTIAL(1, "SEQUENTIAL", "SEQUENTIAL"),

    /**
     * The '<em><b>SEQUENTIAL PREEMPTIVE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SEQUENTIAL_PREEMPTIVE_VALUE
     * @generated
     * @ordered
     */
    SEQUENTIAL_PREEMPTIVE(2, "SEQUENTIAL_PREEMPTIVE", "SEQUENTIAL_PREEMPTIVE");

    /**
     * The '<em><b>PARALLEL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PARALLEL
     * @model
     * @generated
     * @ordered
     */
    public static final int PARALLEL_VALUE = 0;

    /**
     * The '<em><b>SEQUENTIAL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SEQUENTIAL
     * @model
     * @generated
     * @ordered
     */
    public static final int SEQUENTIAL_VALUE = 1;

    /**
     * The '<em><b>SEQUENTIAL PREEMPTIVE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SEQUENTIAL_PREEMPTIVE
     * @model
     * @generated
     * @ordered
     */
    public static final int SEQUENTIAL_PREEMPTIVE_VALUE = 2;

    /**
     * An array of all the '<em><b>Fork Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ForkType[] VALUES_ARRAY =
        new ForkType[] {
            PARALLEL,
            SEQUENTIAL,
            SEQUENTIAL_PREEMPTIVE,
        };

    /**
     * A public read-only list of all the '<em><b>Fork Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ForkType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Fork Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ForkType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ForkType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Fork Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ForkType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ForkType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Fork Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ForkType get(int value) {
        switch (value) {
            case PARALLEL_VALUE: return PARALLEL;
            case SEQUENTIAL_VALUE: return SEQUENTIAL;
            case SEQUENTIAL_PREEMPTIVE_VALUE: return SEQUENTIAL_PREEMPTIVE;
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
    private ForkType(int value, String name, String literal) {
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
    
} //ForkType
