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
 * A representation of the literals of the enumeration '<em><b>State Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A type for a State to specify some special properties.
 * 
 *   
 * <!-- end-model-doc -->
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getStateType()
 * @model
 * @generated
 */
public enum StateType implements Enumerator {
    /**
	 * The '<em><b>NORMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
    NORMAL(0, "NORMAL", "NORMAL"),

    /**
	 * The '<em><b>CONDITIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #CONDITIONAL_VALUE
	 * @generated
	 * @ordered
	 */
    CONDITIONAL(1, "CONDITIONAL", "CONDITIONAL"),

    /**
	 * The '<em><b>REFERENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
    REFERENCE(0, "REFERENCE", "REFERENCE"),

    /**
	 * The '<em><b>TEXTUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #TEXTUAL_VALUE
	 * @generated
	 * @ordered
	 */
    TEXTUAL(0, "TEXTUAL", "TEXTUAL");

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2009 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
	 * The '<em><b>NORMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Simple or
	 * macro States are of type NORMAL.
	 * <!-- end-model-doc -->
	 * @see #NORMAL
	 * @model
	 * @generated
	 * @ordered
	 */
    public static final int NORMAL_VALUE = 0;

    /**
	 * The '<em><b>CONDITIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A CONDITIONAL State is only a
	 * pseudostate in a sense that it will be left immediately within
	 * one tick. Its outgoing transitions have to be immediate.
	 * <!-- end-model-doc -->
	 * @see #CONDITIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
    public static final int CONDITIONAL_VALUE = 1;

    /**
	 * The '<em><b>REFERENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A REFERENCE
	 * state carries a bodyReference to an arbitrary EObject. If this object is another
	 * State, e.g. from another file, this reference can be used to modularize
	 * SyncCharts. In such case all original interface of the referenced state
	 * needs to be redefined by {@link Substitution} objects.
	 * <!-- end-model-doc -->
	 * @see #REFERENCE
	 * @model
	 * @generated
	 * @ordered
	 */
    public static final int REFERENCE_VALUE = 0;

    /**
	 * The '<em><b>TEXTUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A TEXTUAL
	 * state will be defined not by child Regions but by bodyText that represents
	 * its behavior, e.g. in the language Esterel or something similar. 
	 * <!-- end-model-doc -->
	 * @see #TEXTUAL
	 * @model
	 * @generated
	 * @ordered
	 */
    public static final int TEXTUAL_VALUE = 0;

    /**
	 * An array of all the '<em><b>State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private static final StateType[] VALUES_ARRAY =
        new StateType[] {
			NORMAL,
			CONDITIONAL,
			REFERENCE,
			TEXTUAL,
		};

    /**
	 * A public read-only list of all the '<em><b>State Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final List<StateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
	 * Returns the '<em><b>State Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static StateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

    /**
	 * Returns the '<em><b>State Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static StateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

    /**
	 * Returns the '<em><b>State Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static StateType get(int value) {
		switch (value) {
			case NORMAL_VALUE: return NORMAL;
			case CONDITIONAL_VALUE: return CONDITIONAL;
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
    private StateType(int value, String name, String literal) {
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
    
} //StateType
