/**
 */
package de.cau.cs.kieler.kexpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Combine Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Built-in operators that can be used as Signal combine operators.
 * <!-- end-model-doc -->
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getCombineOperator()
 * @model
 * @generated
 */
public enum CombineOperator implements Enumerator {
    /**
     * The '<em><b>NONE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies that no combine operator is given. 
     * <!-- end-model-doc -->
     * @see #NONE_VALUE
     * @generated
     * @ordered
     */
    NONE(0, "NONE", "NONE"),

    /**
     * The '<em><b>ADD</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Arithmetic addition.
     * <!-- end-model-doc -->
     * @see #ADD_VALUE
     * @generated
     * @ordered
     */
    ADD(1, "ADD", "+"),

    /**
     * The '<em><b>MULT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Arithmetic multiplication.
     * 
     * <!-- end-model-doc -->
     * @see #MULT_VALUE
     * @generated
     * @ordered
     */
    MULT(2, "MULT", "*"),

    /**
     * The '<em><b>MAX</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The maximum function. Takes the greater of the given two.
     * <!-- end-model-doc -->
     * @see #MAX_VALUE
     * @generated
     * @ordered
     */
    MAX(5, "MAX", "max"),

    /**
     * The '<em><b>MIN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The minimum function. Takes the lesser of the given two.
     * <!-- end-model-doc -->
     * @see #MIN_VALUE
     * @generated
     * @ordered
     */
    MIN(6, "MIN", "min"),

    /**
     * The '<em><b>OR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Logical or function for boolean valued signals.
     * <!-- end-model-doc -->
     * @see #OR_VALUE
     * @generated
     * @ordered
     */
    OR(4, "OR", "|"),

    /**
     * The '<em><b>AND</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Logical and for boolean valued signals.
     * <!-- end-model-doc -->
     * @see #AND_VALUE
     * @generated
     * @ordered
     */
    AND(3, "AND", "&"),

    /**
     * The '<em><b>HOST</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies that no built-in combine operator should be used 
     * but the operator given in the hostCombineOperator field given as a String and 
     * referencing some function of the host language (maybe C or Java, etc. ) .
     * <!-- end-model-doc -->
     * @see #HOST_VALUE
     * @generated
     * @ordered
     */
    HOST(0, "HOST", "host");

    /**
     * The '<em><b>NONE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies that no combine operator is given. 
     * <!-- end-model-doc -->
     * @see #NONE
     * @model
     * @generated
     * @ordered
     */
    public static final int NONE_VALUE = 0;

    /**
     * The '<em><b>ADD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Arithmetic addition.
     * <!-- end-model-doc -->
     * @see #ADD
     * @model literal="+"
     * @generated
     * @ordered
     */
    public static final int ADD_VALUE = 1;

    /**
     * The '<em><b>MULT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Arithmetic multiplication.
     * 
     * <!-- end-model-doc -->
     * @see #MULT
     * @model literal="*"
     * @generated
     * @ordered
     */
    public static final int MULT_VALUE = 2;

    /**
     * The '<em><b>MAX</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The maximum function. Takes the greater of the given two.
     * <!-- end-model-doc -->
     * @see #MAX
     * @model literal="max"
     * @generated
     * @ordered
     */
    public static final int MAX_VALUE = 5;

    /**
     * The '<em><b>MIN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The minimum function. Takes the lesser of the given two.
     * <!-- end-model-doc -->
     * @see #MIN
     * @model literal="min"
     * @generated
     * @ordered
     */
    public static final int MIN_VALUE = 6;

    /**
     * The '<em><b>OR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Logical or function for boolean valued signals.
     * <!-- end-model-doc -->
     * @see #OR
     * @model literal="|"
     * @generated
     * @ordered
     */
    public static final int OR_VALUE = 4;

    /**
     * The '<em><b>AND</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Logical and for boolean valued signals.
     * <!-- end-model-doc -->
     * @see #AND
     * @model literal="&amp;"
     * @generated
     * @ordered
     */
    public static final int AND_VALUE = 3;

    /**
     * The '<em><b>HOST</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies that no built-in combine operator should be used 
     * but the operator given in the hostCombineOperator field given as a String and 
     * referencing some function of the host language (maybe C or Java, etc. ) .
     * <!-- end-model-doc -->
     * @see #HOST
     * @model literal="host"
     * @generated
     * @ordered
     */
    public static final int HOST_VALUE = 0;

    /**
     * An array of all the '<em><b>Combine Operator</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final CombineOperator[] VALUES_ARRAY =
        new CombineOperator[] {
            NONE,
            ADD,
            MULT,
            MAX,
            MIN,
            OR,
            AND,
            HOST,
        };

    /**
     * A public read-only list of all the '<em><b>Combine Operator</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<CombineOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Combine Operator</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CombineOperator get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CombineOperator result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Combine Operator</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CombineOperator getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            CombineOperator result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Combine Operator</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static CombineOperator get(int value) {
        switch (value) {
            case NONE_VALUE: return NONE;
            case ADD_VALUE: return ADD;
            case MULT_VALUE: return MULT;
            case MAX_VALUE: return MAX;
            case MIN_VALUE: return MIN;
            case OR_VALUE: return OR;
            case AND_VALUE: return AND;
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
    private CombineOperator(int value, String name, String literal) {
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
    
} //CombineOperator
