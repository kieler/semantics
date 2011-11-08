/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transition Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A Transition has a type specifying some special property.
 * 
 * <!-- end-model-doc -->
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getTransitionType()
 * @model
 * @generated
 */
public enum TransitionType implements Enumerator {
    /**
	 * The '<em><b>WEAKABORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #WEAKABORT_VALUE
	 * @generated
	 * @ordered
	 */
    WEAKABORT(0, "WEAKABORT", "WEAKABORT"),

    /**
	 * The '<em><b>STRONGABORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #STRONGABORT_VALUE
	 * @generated
	 * @ordered
	 */
    STRONGABORT(1, "STRONGABORT", "STRONGABORT"),

    /**
	 * The '<em><b>NORMALTERMINATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #NORMALTERMINATION_VALUE
	 * @generated
	 * @ordered
	 */
    NORMALTERMINATION(2, "NORMALTERMINATION", "NORMALTERMINATION");

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2009 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
	 * The '<em><b>WEAKABORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A WEAKABORT transition allows the
	 * exited State to execute its contents in that tick.
	 * <!-- end-model-doc -->
	 * @see #WEAKABORT
	 * @model
	 * @generated
	 * @ordered
	 */
    public static final int WEAKABORT_VALUE = 0;

    /**
	 * The '<em><b>STRONGABORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A STRONGABORT will immediately
	 * leave the state and not allow any actions in
	 * the source State in that tick. 
	 * <!-- end-model-doc -->
	 * @see #STRONGABORT
	 * @model
	 * @generated
	 * @ordered
	 */
    public static final int STRONGABORT_VALUE = 1;

    /**
	 * The '<em><b>NORMALTERMINATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A NORMALTERMINATION will leave a State whenever all contained
	 * Regions are in final States. A normal termination may not define a guard trigger.
	 * <!-- end-model-doc -->
	 * @see #NORMALTERMINATION
	 * @model
	 * @generated
	 * @ordered
	 */
    public static final int NORMALTERMINATION_VALUE = 2;

    /**
	 * An array of all the '<em><b>Transition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private static final TransitionType[] VALUES_ARRAY =
        new TransitionType[] {
			WEAKABORT,
			STRONGABORT,
			NORMALTERMINATION,
		};

    /**
	 * A public read-only list of all the '<em><b>Transition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final List<TransitionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
	 * Returns the '<em><b>Transition Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static TransitionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransitionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

    /**
	 * Returns the '<em><b>Transition Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static TransitionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransitionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

    /**
	 * Returns the '<em><b>Transition Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static TransitionType get(int value) {
		switch (value) {
			case WEAKABORT_VALUE: return WEAKABORT;
			case STRONGABORT_VALUE: return STRONGABORT;
			case NORMALTERMINATION_VALUE: return NORMALTERMINATION;
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
    private TransitionType(int value, String name, String literal) {
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
    
} //TransitionType
