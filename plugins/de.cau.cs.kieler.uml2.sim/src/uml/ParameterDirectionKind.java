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
 * A representation of the literals of the enumeration '<em><b>Parameter Direction Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Parameter direction kind is an enumeration type that defines literals used to specify direction of parameters.
 * <!-- end-model-doc -->
 * @see uml.UmlPackage#getParameterDirectionKind()
 * @model
 * @generated
 */
public enum ParameterDirectionKind implements Enumerator {
    /**
     * The '<em><b>In</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IN_VALUE
     * @generated
     * @ordered
     */
    IN(0, "in", "in"),

    /**
     * The '<em><b>Inout</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INOUT_VALUE
     * @generated
     * @ordered
     */
    INOUT(1, "inout", "inout"),

    /**
     * The '<em><b>Out</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OUT_VALUE
     * @generated
     * @ordered
     */
    OUT(2, "out", "out"),

    /**
     * The '<em><b>Return</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RETURN_VALUE
     * @generated
     * @ordered
     */
    RETURN(3, "return", "return");

    /**
     * The '<em><b>In</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates that parameter values are passed into the behavioral element by the caller.
     * <!-- end-model-doc -->
     * @see #IN
     * @model name="in"
     * @generated
     * @ordered
     */
    public static final int IN_VALUE = 0;

    /**
     * The '<em><b>Inout</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates that parameter values are passed into a behavioral element by the caller and then back out to the caller from the behavioral element.
     * <!-- end-model-doc -->
     * @see #INOUT
     * @model name="inout"
     * @generated
     * @ordered
     */
    public static final int INOUT_VALUE = 1;

    /**
     * The '<em><b>Out</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates that parameter values are passed from a behavioral element out to the caller.
     * <!-- end-model-doc -->
     * @see #OUT
     * @model name="out"
     * @generated
     * @ordered
     */
    public static final int OUT_VALUE = 2;

    /**
     * The '<em><b>Return</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates that parameter values are passed as return values from a behavioral element back to the caller.
     * <!-- end-model-doc -->
     * @see #RETURN
     * @model name="return"
     * @generated
     * @ordered
     */
    public static final int RETURN_VALUE = 3;

    /**
     * An array of all the '<em><b>Parameter Direction Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ParameterDirectionKind[] VALUES_ARRAY =
        new ParameterDirectionKind[] {
            IN,
            INOUT,
            OUT,
            RETURN,
        };

    /**
     * A public read-only list of all the '<em><b>Parameter Direction Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ParameterDirectionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Parameter Direction Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ParameterDirectionKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ParameterDirectionKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Parameter Direction Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ParameterDirectionKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ParameterDirectionKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Parameter Direction Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ParameterDirectionKind get(int value) {
        switch (value) {
            case IN_VALUE: return IN;
            case INOUT_VALUE: return INOUT;
            case OUT_VALUE: return OUT;
            case RETURN_VALUE: return RETURN;
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
    private ParameterDirectionKind(int value, String name, String literal) {
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
    
} //ParameterDirectionKind
