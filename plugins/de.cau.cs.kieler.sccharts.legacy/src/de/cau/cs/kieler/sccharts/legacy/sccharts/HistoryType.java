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
package de.cau.cs.kieler.sccharts.legacy.sccharts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>History Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A Transition has a type specifying some special property.
 * 
 * <!-- end-model-doc -->
 * @see de.cau.cs.kieler.sccharts.legacy.sccharts.SCChartsPackage#getHistoryType()
 * @model
 * @generated
 */
public enum HistoryType implements Enumerator {
    /**
     * The '<em><b>RESET</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RESET_VALUE
     * @generated
     * @ordered
     */
    RESET(0, "RESET", "RESET"),

    /**
     * The '<em><b>SHALLOW</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SHALLOW_VALUE
     * @generated
     * @ordered
     */
    SHALLOW(1, "SHALLOW", "SHALLOW"),

    /**
     * The '<em><b>DEEP</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEEP_VALUE
     * @generated
     * @ordered
     */
    DEEP(2, "DEEP", "DEEP");

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Kiel University\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * The '<em><b>RESET</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A WEAKABORT transition allows the
     * exited State to execute its contents in that tick.
     * <!-- end-model-doc -->
     * @see #RESET
     * @model
     * @generated
     * @ordered
     */
    public static final int RESET_VALUE = 0;

    /**
     * The '<em><b>SHALLOW</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A STRONGABORT will immediately
     * leave the state and not allow any actions in
     * the source State in that tick. 
     * <!-- end-model-doc -->
     * @see #SHALLOW
     * @model
     * @generated
     * @ordered
     */
    public static final int SHALLOW_VALUE = 1;

    /**
     * The '<em><b>DEEP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A NORMALTERMINATION will leave a State whenever all contained
     * Regions are in final States. A normal termination may not define a guard trigger.
     * <!-- end-model-doc -->
     * @see #DEEP
     * @model
     * @generated
     * @ordered
     */
    public static final int DEEP_VALUE = 2;

    /**
     * An array of all the '<em><b>History Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final HistoryType[] VALUES_ARRAY =
        new HistoryType[] {
            RESET,
            SHALLOW,
            DEEP,
        };

    /**
     * A public read-only list of all the '<em><b>History Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<HistoryType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>History Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static HistoryType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            HistoryType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>History Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static HistoryType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            HistoryType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>History Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static HistoryType get(int value) {
        switch (value) {
            case RESET_VALUE: return RESET;
            case SHALLOW_VALUE: return SHALLOW;
            case DEEP_VALUE: return DEEP;
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
    private HistoryType(int value, String name, String literal) {
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
    
} //HistoryType
