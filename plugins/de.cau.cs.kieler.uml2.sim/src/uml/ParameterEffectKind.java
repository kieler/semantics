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
 * A representation of the literals of the enumeration '<em><b>Parameter Effect Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The datatype ParameterEffectKind is an enumeration that indicates the effect of a behavior on values passed in or out of its parameters.
 * <!-- end-model-doc -->
 * @see uml.UmlPackage#getParameterEffectKind()
 * @model
 * @generated
 */
public enum ParameterEffectKind implements Enumerator {
    /**
     * The '<em><b>Create</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CREATE_VALUE
     * @generated
     * @ordered
     */
    CREATE(0, "create", "create"),

    /**
     * The '<em><b>Read</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #READ_VALUE
     * @generated
     * @ordered
     */
    READ(1, "read", "read"),

    /**
     * The '<em><b>Update</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UPDATE_VALUE
     * @generated
     * @ordered
     */
    UPDATE(2, "update", "update"),

    /**
     * The '<em><b>Delete</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DELETE_VALUE
     * @generated
     * @ordered
     */
    DELETE(3, "delete", "delete");

    /**
     * The '<em><b>Create</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates that the behavior creates values.
     * <!-- end-model-doc -->
     * @see #CREATE
     * @model name="create"
     * @generated
     * @ordered
     */
    public static final int CREATE_VALUE = 0;

    /**
     * The '<em><b>Read</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates that the behavior reads values.
     * <!-- end-model-doc -->
     * @see #READ
     * @model name="read"
     * @generated
     * @ordered
     */
    public static final int READ_VALUE = 1;

    /**
     * The '<em><b>Update</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates that the behavior updates values.
     * <!-- end-model-doc -->
     * @see #UPDATE
     * @model name="update"
     * @generated
     * @ordered
     */
    public static final int UPDATE_VALUE = 2;

    /**
     * The '<em><b>Delete</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates that the behavior deletes values.
     * <!-- end-model-doc -->
     * @see #DELETE
     * @model name="delete"
     * @generated
     * @ordered
     */
    public static final int DELETE_VALUE = 3;

    /**
     * An array of all the '<em><b>Parameter Effect Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ParameterEffectKind[] VALUES_ARRAY =
        new ParameterEffectKind[] {
            CREATE,
            READ,
            UPDATE,
            DELETE,
        };

    /**
     * A public read-only list of all the '<em><b>Parameter Effect Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ParameterEffectKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Parameter Effect Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ParameterEffectKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ParameterEffectKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Parameter Effect Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ParameterEffectKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ParameterEffectKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Parameter Effect Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ParameterEffectKind get(int value) {
        switch (value) {
            case CREATE_VALUE: return CREATE;
            case READ_VALUE: return READ;
            case UPDATE_VALUE: return UPDATE;
            case DELETE_VALUE: return DELETE;
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
    private ParameterEffectKind(int value, String name, String literal) {
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
    
} //ParameterEffectKind
