/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Call Concurrency Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * CallConcurrencyKind is an enumeration type.
 * <!-- end-model-doc -->
 * @see uml.UmlPackage#getCallConcurrencyKind()
 * @model
 * @generated
 */
public enum CallConcurrencyKind implements Enumerator {
    /**
     * The '<em><b>Sequential</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SEQUENTIAL_VALUE
     * @generated
     * @ordered
     */
    SEQUENTIAL(0, "sequential", "sequential"),

    /**
     * The '<em><b>Guarded</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GUARDED_VALUE
     * @generated
     * @ordered
     */
    GUARDED(1, "guarded", "guarded"),

    /**
     * The '<em><b>Concurrent</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONCURRENT_VALUE
     * @generated
     * @ordered
     */
    CONCURRENT(2, "concurrent", "concurrent");

    /**
     * The '<em><b>Sequential</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No concurrency management mechanism is associated with the operation and, therefore, concurrency conflicts may occur. Instances that invoke a behavioral feature need to coordinate so that only one invocation to a target on any behavioral feature occurs at once.
     * <!-- end-model-doc -->
     * @see #SEQUENTIAL
     * @model name="sequential"
     * @generated
     * @ordered
     */
    public static final int SEQUENTIAL_VALUE = 0;

    /**
     * The '<em><b>Guarded</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Multiple invocations of a behavioral feature may occur simultaneously to one instance, but only one is allowed to commence. The others are blocked until the performance of the currently executing behavioral feature is complete. It is the responsibility of the system designer to ensure that deadlocks do not occur due to simultaneous blocks.
     * <!-- end-model-doc -->
     * @see #GUARDED
     * @model name="guarded"
     * @generated
     * @ordered
     */
    public static final int GUARDED_VALUE = 1;

    /**
     * The '<em><b>Concurrent</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Multiple invocations of a behavioral feature may occur simultaneously to one instance and all of them may proceed concurrently.
     * <!-- end-model-doc -->
     * @see #CONCURRENT
     * @model name="concurrent"
     * @generated
     * @ordered
     */
    public static final int CONCURRENT_VALUE = 2;

    /**
     * An array of all the '<em><b>Call Concurrency Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final CallConcurrencyKind[] VALUES_ARRAY =
        new CallConcurrencyKind[] {
            SEQUENTIAL,
            GUARDED,
            CONCURRENT,
        };

    /**
     * A public read-only list of all the '<em><b>Call Concurrency Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<CallConcurrencyKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Call Concurrency Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CallConcurrencyKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CallConcurrencyKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Call Concurrency Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CallConcurrencyKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CallConcurrencyKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Call Concurrency Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CallConcurrencyKind get(int value) {
        switch (value) {
            case SEQUENTIAL_VALUE: return SEQUENTIAL;
            case GUARDED_VALUE: return GUARDED;
            case CONCURRENT_VALUE: return CONCURRENT;
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
    private CallConcurrencyKind(int value, String name, String literal) {
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
    
} //CallConcurrencyKind
