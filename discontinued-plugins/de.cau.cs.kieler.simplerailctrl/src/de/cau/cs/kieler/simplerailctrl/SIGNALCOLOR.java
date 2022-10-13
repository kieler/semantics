/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.simplerailctrl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SIGNALCOLOR</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getSIGNALCOLOR()
 * @model
 * @generated
 */
public enum SIGNALCOLOR implements Enumerator {
    /**
     * The '<em><b>RED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RED_VALUE
     * @generated
     * @ordered
     */
    RED(1, "RED", "RED"),

    /**
     * The '<em><b>OFF</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OFF_VALUE
     * @generated
     * @ordered
     */
    OFF(0, "OFF", "OFF"),

    /**
     * The '<em><b>GREEN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GREEN_VALUE
     * @generated
     * @ordered
     */
    GREEN(2, "GREEN", "GREEN"),

    /**
     * The '<em><b>YELLOWGREEN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #YELLOWGREEN_VALUE
     * @generated
     * @ordered
     */
    YELLOWGREEN(3, "YELLOWGREEN", "YELLOWGREEN");

    /**
     * The '<em><b>RED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>RED</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RED
     * @model
     * @generated
     * @ordered
     */
    public static final int RED_VALUE = 1;

    /**
     * The '<em><b>OFF</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>OFF</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OFF
     * @model
     * @generated
     * @ordered
     */
    public static final int OFF_VALUE = 0;

    /**
     * The '<em><b>GREEN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>GREEN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GREEN
     * @model
     * @generated
     * @ordered
     */
    public static final int GREEN_VALUE = 2;

    /**
     * The '<em><b>YELLOWGREEN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>YELLOWGREEN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #YELLOWGREEN
     * @model
     * @generated
     * @ordered
     */
    public static final int YELLOWGREEN_VALUE = 3;

    /**
     * An array of all the '<em><b>SIGNALCOLOR</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SIGNALCOLOR[] VALUES_ARRAY =
        new SIGNALCOLOR[] {
            RED,
            OFF,
            GREEN,
            YELLOWGREEN,
        };

    /**
     * A public read-only list of all the '<em><b>SIGNALCOLOR</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<SIGNALCOLOR> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>SIGNALCOLOR</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SIGNALCOLOR get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SIGNALCOLOR result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>SIGNALCOLOR</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SIGNALCOLOR getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SIGNALCOLOR result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>SIGNALCOLOR</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SIGNALCOLOR get(int value) {
        switch (value) {
            case RED_VALUE: return RED;
            case OFF_VALUE: return OFF;
            case GREEN_VALUE: return GREEN;
            case YELLOWGREEN_VALUE: return YELLOWGREEN;
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
    private SIGNALCOLOR(int value, String name, String literal) {
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
    
} //SIGNALCOLOR
