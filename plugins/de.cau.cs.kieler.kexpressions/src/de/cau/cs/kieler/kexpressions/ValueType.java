/**
 */
package de.cau.cs.kieler.kexpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Value Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Possible built-in types for values (e.g. for Varibales or Signals).
 * <p>
 * Default value is the PURE type which means that the
 * ValuedObject does not contain any value at all (only
 * makes sense for Signals).
 * <p>
 * HOST means that no actual type is given but the
 * type in the hostType attribute should be used 
 * instead.
 * <!-- end-model-doc -->
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getValueType()
 * @model
 * @generated
 */
public enum ValueType implements Enumerator {
    /**
     * The '<em><b>PURE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Default value is the PURE type which means that the
     * ValuedObject does not contain any value at all (only
     * makes sense for Signals).
     * <!-- end-model-doc -->
     * @see #PURE_VALUE
     * @generated
     * @ordered
     */
    PURE(0, "PURE", "pure"),

    /**
     * The '<em><b>BOOL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BOOL_VALUE
     * @generated
     * @ordered
     */
    BOOL(1, "BOOL", "bool"),

    /**
     * The '<em><b>UNSIGNED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * @deprecated No longer used in grammars
     * <!-- end-model-doc -->
     * @see #UNSIGNED_VALUE
     * @generated
     * @ordered
     */
    @Deprecated
    UNSIGNED(2, "UNSIGNED", "unsigned"),

    /**
     * The '<em><b>INT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INT_VALUE
     * @generated
     * @ordered
     */
    INT(3, "INT", "int"),

    /**
     * The '<em><b>FLOAT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FLOAT_VALUE
     * @generated
     * @ordered
     */
    FLOAT(4, "FLOAT", "float"),

    /**
     * The '<em><b>HOST</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * HOST means that no actual type is given but the
     * type in the hostType attribute should be used 
     * instead.
     * <!-- end-model-doc -->
     * @see #HOST_VALUE
     * @generated
     * @ordered
     */
    HOST(7, "HOST", "host"),

    /**
     * The '<em><b>DOUBLE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * @deprecated No longer used in grammars
     * <!-- end-model-doc -->
     * @see #DOUBLE_VALUE
     * @generated
     * @ordered
     */
    @Deprecated
    DOUBLE(5, "DOUBLE", "double"),

    /**
     * The '<em><b>STRING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STRING_VALUE
     * @generated
     * @ordered
     */
    STRING(6, "STRING", "string"),

    /**
     * The '<em><b>REFERENCE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REFERENCE_VALUE
     * @generated
     * @ordered
     */
    REFERENCE(8, "REFERENCE", "reference"),

    /**
     * The '<em><b>SCHEDULE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SCHEDULE_VALUE
     * @generated
     * @ordered
     */
    SCHEDULE(9, "SCHEDULE", "schedule"),

    /**
     * The '<em><b>UNKNOWN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNKNOWN_VALUE
     * @generated
     * @ordered
     */
    UNKNOWN(10, "UNKNOWN", "UNKNOWN"),

    /**
     * The '<em><b>CLOCK</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CLOCK_VALUE
     * @generated
     * @ordered
     */
    CLOCK(11, "CLOCK", "clock"),

    /**
     * The '<em><b>JSON</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #JSON_VALUE
     * @generated
     * @ordered
     */
    JSON(12, "JSON", "json"),

    /**
     * The '<em><b>STRUCT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STRUCT_VALUE
     * @generated
     * @ordered
     */
    STRUCT(13, "STRUCT", "struct"),

    /**
     * The '<em><b>CLASS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CLASS_VALUE
     * @generated
     * @ordered
     */
    CLASS(14, "CLASS", "class"),

    /**
     * The '<em><b>ENUM</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ENUM_VALUE
     * @generated
     * @ordered
     */
    ENUM(15, "ENUM", "enum"),

    /**
     * The '<em><b>VOID</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VOID_VALUE
     * @generated
     * @ordered
     */
    VOID(16, "VOID", "void"), /**
     * The '<em><b>TIME</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TIME_VALUE
     * @generated
     * @ordered
     */
    TIME(17, "TIME", "time"), /**
     * The '<em><b>PRIMITIVE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PRIMITIVE_VALUE
     * @generated
     * @ordered
     */
    PRIMITIVE(18, "PRIMITIVE", "primitive");

    /**
     * The '<em><b>PURE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Default value is the PURE type which means that the
     * ValuedObject does not contain any value at all (only
     * makes sense for Signals).
     * <!-- end-model-doc -->
     * @see #PURE
     * @model literal="pure"
     * @generated
     * @ordered
     */
    public static final int PURE_VALUE = 0;

    /**
     * The '<em><b>BOOL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BOOL
     * @model literal="bool"
     * @generated
     * @ordered
     */
    public static final int BOOL_VALUE = 1;

    /**
     * The '<em><b>UNSIGNED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * @deprecated No longer used in grammars
     * <!-- end-model-doc -->
     * @see #UNSIGNED
     * @model literal="unsigned"
     * @generated
     * @ordered
     */
    @Deprecated
    public static final int UNSIGNED_VALUE = 2;

    /**
     * The '<em><b>INT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INT
     * @model literal="int"
     * @generated
     * @ordered
     */
    public static final int INT_VALUE = 3;

    /**
     * The '<em><b>FLOAT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FLOAT
     * @model literal="float"
     * @generated
     * @ordered
     */
    public static final int FLOAT_VALUE = 4;

    /**
     * The '<em><b>HOST</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * HOST means that no actual type is given but the
     * type in the hostType attribute should be used 
     * instead.
     * <!-- end-model-doc -->
     * @see #HOST
     * @model literal="host"
     * @generated
     * @ordered
     */
    public static final int HOST_VALUE = 7;

    /**
     * The '<em><b>DOUBLE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * @deprecated No longer used in grammars
     * <!-- end-model-doc -->
     * @see #DOUBLE
     * @model literal="double"
     * @generated
     * @ordered
     */
    @Deprecated
    public static final int DOUBLE_VALUE = 5;

    /**
     * The '<em><b>STRING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STRING
     * @model literal="string"
     * @generated
     * @ordered
     */
    public static final int STRING_VALUE = 6;

    /**
     * The '<em><b>REFERENCE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REFERENCE
     * @model literal="reference"
     * @generated
     * @ordered
     */
    public static final int REFERENCE_VALUE = 8;

    /**
     * The '<em><b>SCHEDULE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SCHEDULE
     * @model literal="schedule"
     * @generated
     * @ordered
     */
    public static final int SCHEDULE_VALUE = 9;

    /**
     * The '<em><b>UNKNOWN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNKNOWN
     * @model
     * @generated
     * @ordered
     */
    public static final int UNKNOWN_VALUE = 10;

    /**
     * The '<em><b>CLOCK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CLOCK
     * @model literal="clock"
     * @generated
     * @ordered
     */
    public static final int CLOCK_VALUE = 11;

    /**
     * The '<em><b>JSON</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #JSON
     * @model literal="json"
     * @generated
     * @ordered
     */
    public static final int JSON_VALUE = 12;

    /**
     * The '<em><b>STRUCT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STRUCT
     * @model literal="struct"
     * @generated
     * @ordered
     */
    public static final int STRUCT_VALUE = 13;

    /**
     * The '<em><b>CLASS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CLASS
     * @model literal="class"
     * @generated
     * @ordered
     */
    public static final int CLASS_VALUE = 14;

    /**
     * The '<em><b>ENUM</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ENUM
     * @model literal="enum"
     * @generated
     * @ordered
     */
    public static final int ENUM_VALUE = 15;

    /**
     * The '<em><b>VOID</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VOID
     * @model literal="void"
     * @generated
     * @ordered
     */
    public static final int VOID_VALUE = 16;

    /**
     * The '<em><b>TIME</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TIME
     * @model literal="time"
     * @generated
     * @ordered
     */
    public static final int TIME_VALUE = 17;

    /**
     * The '<em><b>PRIMITIVE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PRIMITIVE
     * @model literal="primitive"
     * @generated
     * @ordered
     */
    public static final int PRIMITIVE_VALUE = 18;

    /**
     * An array of all the '<em><b>Value Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ValueType[] VALUES_ARRAY =
        new ValueType[] {
            PURE,
            BOOL,
            UNSIGNED,
            INT,
            FLOAT,
            HOST,
            DOUBLE,
            STRING,
            REFERENCE,
            SCHEDULE,
            UNKNOWN,
            CLOCK,
            JSON,
            STRUCT,
            CLASS,
            ENUM,
            VOID,
            TIME,
            PRIMITIVE,
        };

    /**
     * A public read-only list of all the '<em><b>Value Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ValueType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Value Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ValueType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ValueType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Value Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ValueType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ValueType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Value Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ValueType get(int value) {
        switch (value) {
            case PURE_VALUE: return PURE;
            case BOOL_VALUE: return BOOL;
            case UNSIGNED_VALUE: return UNSIGNED;
            case INT_VALUE: return INT;
            case FLOAT_VALUE: return FLOAT;
            case HOST_VALUE: return HOST;
            case DOUBLE_VALUE: return DOUBLE;
            case STRING_VALUE: return STRING;
            case REFERENCE_VALUE: return REFERENCE;
            case SCHEDULE_VALUE: return SCHEDULE;
            case UNKNOWN_VALUE: return UNKNOWN;
            case CLOCK_VALUE: return CLOCK;
            case JSON_VALUE: return JSON;
            case STRUCT_VALUE: return STRUCT;
            case CLASS_VALUE: return CLASS;
            case ENUM_VALUE: return ENUM;
            case VOID_VALUE: return VOID;
            case TIME_VALUE: return TIME;
            case PRIMITIVE_VALUE: return PRIMITIVE;
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
    private ValueType(int value, String name, String literal) {
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
    
} //ValueType
