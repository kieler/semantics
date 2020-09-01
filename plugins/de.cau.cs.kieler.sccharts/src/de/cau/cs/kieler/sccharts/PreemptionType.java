/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Preemption Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A Transition has a type specifying some special property.
 * 
 * <!-- end-model-doc -->
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getPreemptionType()
 * @model
 * @generated
 */
public enum PreemptionType implements Enumerator {
    /**
     * The '<em><b>UNDEFINED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNDEFINED_VALUE
     * @generated
     * @ordered
     */
    UNDEFINED(0, "UNDEFINED", "UNDEFINED"),

    /**
     * The '<em><b>WEAK</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A WEAKABORT transition allows the
     * exited State to execute its contents in that tick.
     * <!-- end-model-doc -->
     * @see #WEAK_VALUE
     * @generated
     * @ordered
     */
    WEAK(1, "WEAK", "WEAK"),

    /**
     * The '<em><b>STRONG</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A STRONGABORT will immediately
     * leave the state and not allow any actions in
     * the source State in that tick. 
     * <!-- end-model-doc -->
     * @see #STRONG_VALUE
     * @generated
     * @ordered
     */
    STRONG(2, "STRONG", "STRONG"),

    /**
     * The '<em><b>TERMINATION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A NORMALTERMINATION will leave a State whenever all contained
     * Regions are in final States. A normal termination may not define a guard trigger.
     * <!-- end-model-doc -->
     * @see #TERMINATION_VALUE
     * @generated
     * @ordered
     */
    TERMINATION(3, "TERMINATION", "TERMINATION");

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
     * The '<em><b>UNDEFINED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNDEFINED
     * @model
     * @generated
     * @ordered
     */
    public static final int UNDEFINED_VALUE = 0;

    /**
     * The '<em><b>WEAK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A WEAKABORT transition allows the
     * exited State to execute its contents in that tick.
     * <!-- end-model-doc -->
     * @see #WEAK
     * @model
     * @generated
     * @ordered
     */
    public static final int WEAK_VALUE = 1;

    /**
     * The '<em><b>STRONG</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A STRONGABORT will immediately
     * leave the state and not allow any actions in
     * the source State in that tick. 
     * <!-- end-model-doc -->
     * @see #STRONG
     * @model
     * @generated
     * @ordered
     */
    public static final int STRONG_VALUE = 2;

    /**
     * The '<em><b>TERMINATION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A NORMALTERMINATION will leave a State whenever all contained
     * Regions are in final States. A normal termination may not define a guard trigger.
     * <!-- end-model-doc -->
     * @see #TERMINATION
     * @model
     * @generated
     * @ordered
     */
    public static final int TERMINATION_VALUE = 3;

    /**
     * An array of all the '<em><b>Preemption Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final PreemptionType[] VALUES_ARRAY =
        new PreemptionType[] {
            UNDEFINED,
            WEAK,
            STRONG,
            TERMINATION,
        };

    /**
     * A public read-only list of all the '<em><b>Preemption Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<PreemptionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Preemption Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PreemptionType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PreemptionType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Preemption Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PreemptionType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PreemptionType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Preemption Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PreemptionType get(int value) {
        switch (value) {
            case UNDEFINED_VALUE: return UNDEFINED;
            case WEAK_VALUE: return WEAK;
            case STRONG_VALUE: return STRONG;
            case TERMINATION_VALUE: return TERMINATION;
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
    private PreemptionType(int value, String name, String literal) {
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
    
} //PreemptionType
