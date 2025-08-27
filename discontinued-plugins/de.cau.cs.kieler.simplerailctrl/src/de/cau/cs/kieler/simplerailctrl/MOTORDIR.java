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
 * A representation of the literals of the enumeration '<em><b>MOTORDIR</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage#getMOTORDIR()
 * @model
 * @generated
 */
public enum MOTORDIR implements Enumerator {
    /**
     * The '<em><b>FWD</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FWD_VALUE
     * @generated
     * @ordered
     */
    FWD(1, "FWD", "FWD"),

    /**
     * The '<em><b>REV</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REV_VALUE
     * @generated
     * @ordered
     */
    REV(2, "REV", "REV"),

    /**
     * The '<em><b>BRAKE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BRAKE_VALUE
     * @generated
     * @ordered
     */
    BRAKE(3, "BRAKE", "BRAKE"),

    /**
     * The '<em><b>OFF</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OFF_VALUE
     * @generated
     * @ordered
     */
    OFF(0, "OFF", "OFF");

    /**
     * The '<em><b>FWD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>FWD</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FWD
     * @model
     * @generated
     * @ordered
     */
    public static final int FWD_VALUE = 1;

    /**
     * The '<em><b>REV</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>REV</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REV
     * @model
     * @generated
     * @ordered
     */
    public static final int REV_VALUE = 2;

    /**
     * The '<em><b>BRAKE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>BRAKE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BRAKE
     * @model
     * @generated
     * @ordered
     */
    public static final int BRAKE_VALUE = 3;

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
     * An array of all the '<em><b>MOTORDIR</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final MOTORDIR[] VALUES_ARRAY =
        new MOTORDIR[] {
            FWD,
            REV,
            BRAKE,
            OFF,
        };

    /**
     * A public read-only list of all the '<em><b>MOTORDIR</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<MOTORDIR> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>MOTORDIR</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MOTORDIR get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MOTORDIR result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>MOTORDIR</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MOTORDIR getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MOTORDIR result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>MOTORDIR</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MOTORDIR get(int value) {
        switch (value) {
            case FWD_VALUE: return FWD;
            case REV_VALUE: return REV;
            case BRAKE_VALUE: return BRAKE;
            case OFF_VALUE: return OFF;
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
    private MOTORDIR(int value, String name, String literal) {
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
    
} //MOTORDIR
